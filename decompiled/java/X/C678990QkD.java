package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Range;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.h;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0QkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678990QkD {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL(TextView textView) {
        int length;
        if (textView.getLineCount() >= textView.getMaxLines()) {
            Layout layout = textView.getLayout();
            if (layout != null) {
                length = layout.getLineEnd(textView.getMaxLines() - 1);
            } else {
                length = textView.length();
            }
            if (length < textView.length()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(TuxTextView tuxTextView, boolean z, String str, AbstractC19875512pd abstractC19875512pd, String str2, boolean z2, boolean z3, int i, Function1 function1) {
        int i2;
        if (z) {
            if ((!abstractC19875512pd.isEmpty()) && (i2 = ((Position) abstractC19875512pd.get(0)).begin) != 0) {
                ArrayList arrayList = new ArrayList();
                int i3 = 3 - i2;
                Iterator it2 = abstractC19875512pd.iterator();
                while (it2.hasNext()) {
                    Position position = (Position) it2.next();
                    arrayList.add(new Position(position.begin + i3, position.end + i3));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("...");
                sbLIZ.append(str2.substring(i2));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Range range = new Range(3, Integer.valueOf(strLIZIZ.length() - 1));
                String strLJJIFFI = u.LJJIFFI(str, str2, strLIZIZ, false);
                LIZIZ(tuxTextView, strLJJIFFI, strLIZIZ, R.attr.bb, z2, AbstractC19875512pd.copyOf((Collection) arrayList), range, z3, i, function1);
                C430110Gtl.LIZ(tuxTextView, new C679000QkE(tuxTextView, strLJJIFFI, strLIZIZ, z2, arrayList, range, z3, i, function1));
                return;
            }
            LIZJ(tuxTextView, str, str2, R.attr.bb, z2, abstractC19875512pd, new Range(0, Integer.valueOf(str2.length() - 1)), z3, i, function1);
            return;
        }
        if (LIZLLL(tuxTextView)) {
            LIZJ(tuxTextView, str, str2, R.attr.bb, z2, AbstractC19875512pd.copyOf((Collection) abstractC19875512pd), new Range(0, Integer.valueOf(str2.length())), z3, i, function1);
        }
    }

    public static void LIZIZ(TextView textView, String str, String str2, int i, boolean z, AbstractC19875512pd abstractC19875512pd, Range range, boolean z2, int i2, Function1 function1) {
        int iLJJJ;
        int iIntValue;
        float fFloatValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8296);
        sbLIZ.append(str2);
        sbLIZ.append((char) 8297);
        String strLJJIFFI = u.LJJIFFI(str, str2, C2188811AlT.LIZIZ(sbLIZ), false);
        Context context = textView.getContext();
        if (context == null || (iLJJJ = a0.LJJJ(strLJJIFFI, str2, 0, false, 6)) < 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJJIFFI);
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Float fLJFF = C1308910kAL.LJFF(R.attr.a36, context);
            if (fLJFF != null) {
                fFloatValue = fLJFF.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.q2(spannableStringBuilder, new C431160GvS(iIntValue, fFloatValue, str2, new AwS589S0100000_10(function1, (Function1<? super h, Unit>) 672)), iLJJJ, str2.length() + iLJJJ, 33);
            textView.setMovementMethod(new BaseMovementMethod() { // from class: X.0GvP
                public InterfaceC431140GvQ LIZ;

                @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
                public final boolean onTouchEvent(TextView textView2, Spannable spannable, MotionEvent motionEvent) {
                    Integer numValueOf;
                    InterfaceC431140GvQ interfaceC431140GvQ;
                    if (textView2 != null && spannable != null) {
                        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                            if (numValueOf.intValue() == 0) {
                                int x = (((int) motionEvent.getX()) - textView2.getTotalPaddingStart()) + textView2.getScrollX();
                                int y = (((int) motionEvent.getY()) - textView2.getTotalPaddingTop()) + textView2.getScrollY();
                                Layout layout = textView2.getLayout();
                                if (layout == null) {
                                    return super.onTouchEvent(textView2, spannable, motionEvent);
                                }
                                int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
                                Object[] objArr = (ClickableSpan[]) spannable.getSpans(iU3, iU3, ClickableSpan.class);
                                if (objArr.length == 0) {
                                    InterfaceC431140GvQ interfaceC431140GvQ2 = this.LIZ;
                                    if (interfaceC431140GvQ2 != null) {
                                        interfaceC431140GvQ2.LIZJ();
                                        this.LIZ = null;
                                        textView2.invalidate();
                                    }
                                } else {
                                    Object obj = objArr[0];
                                    if (obj instanceof InterfaceC431140GvQ) {
                                        if (!Intrinsics.LJFF(this.LIZ, obj)) {
                                            InterfaceC431140GvQ interfaceC431140GvQ3 = this.LIZ;
                                            if (interfaceC431140GvQ3 != null) {
                                                interfaceC431140GvQ3.LIZJ();
                                            }
                                            InterfaceC431140GvQ interfaceC431140GvQ4 = (InterfaceC431140GvQ) obj;
                                            this.LIZ = interfaceC431140GvQ4;
                                            interfaceC431140GvQ4.LIZIZ();
                                            textView2.invalidate();
                                            return true;
                                        }
                                        return false;
                                    }
                                    InterfaceC431140GvQ interfaceC431140GvQ5 = this.LIZ;
                                    if (interfaceC431140GvQ5 != null) {
                                        interfaceC431140GvQ5.LIZJ();
                                        this.LIZ = null;
                                        textView2.invalidate();
                                        return false;
                                    }
                                    return false;
                                }
                            } else if (numValueOf.intValue() == 1) {
                                InterfaceC431140GvQ interfaceC431140GvQ6 = this.LIZ;
                                if (interfaceC431140GvQ6 != null) {
                                    interfaceC431140GvQ6.LIZ(textView2);
                                    this.LIZ = null;
                                    textView2.invalidate();
                                }
                            } else if (numValueOf.intValue() == 3 && (interfaceC431140GvQ = this.LIZ) != null) {
                                interfaceC431140GvQ.LIZJ();
                                this.LIZ = null;
                                textView2.invalidate();
                            }
                        }
                        return super.onTouchEvent(textView2, spannable, motionEvent);
                    }
                    return super.onTouchEvent(textView2, spannable, motionEvent);
                }
            });
        }
        if (z2 && abstractC19875512pd != null) {
            Iterator it2 = abstractC19875512pd.iterator();
            while (it2.hasNext()) {
                Position position = (Position) it2.next();
                if (position.LIZ() && range.contains(Integer.valueOf(position.begin)) && range.contains(Integer.valueOf(position.end))) {
                    int i3 = position.begin + iLJJJ;
                    int i4 = position.end + iLJJJ;
                    if (i3 >= 0 && i3 < spannableStringBuilder.length() && i4 >= 0 && i4 < spannableStringBuilder.length()) {
                        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i2, true), i3, i4 + 1, 33);
                    }
                }
            }
        }
        textView.setText(spannableStringBuilder);
    }

    public static void LIZJ(TextView textView, String str, String str2, int i, boolean z, AbstractC19875512pd abstractC19875512pd, Range range, boolean z2, int i2, Function1 function1) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (text == null) {
            text = "";
        }
        int iLJJJ = a0.LJJJ(text, str2, 0, false, 6);
        if (iLJJJ < 0) {
            return;
        }
        int length = (str2.length() + iLJJJ) - 1;
        int lineStart = layout.getLineStart(textView.getMaxLines() - 1);
        if (lineStart <= length && iLJJJ < layout.getLineStart(textView.getMaxLines())) {
            int length2 = text.length() - 1;
            int iMax = Math.max(iLJJJ, lineStart);
            int i3 = length + 1;
            CharSequence charSequenceSubSequence = text.subSequence(iMax, i3);
            CharSequence charSequenceSubSequence2 = text.subSequence(lineStart, iMax);
            CharSequence charSequenceSubSequence3 = text.subSequence(i3, length2 + 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) charSequenceSubSequence2);
            sbLIZ.append((Object) charSequenceSubSequence3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceSubSequence, textView.getPaint(), ((textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd()) - textView.getPaint().measureText(strLIZIZ, 0, strLIZIZ.length()), TextUtils.TruncateAt.END);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((Object) text.subSequence(iLJJJ, iMax));
            sbLIZ2.append((Object) charSequenceEllipsize);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            LIZIZ(textView, u.LJJIFFI(str, str2, strLIZIZ2, false), strLIZIZ2, i, z, abstractC19875512pd, new Range(range.getLower(), Integer.valueOf(((Number) range.getUpper()).intValue() - 3)), z2, i2, function1);
            return;
        }
        textView.setMaxLines(textView.getLineCount());
    }
}
