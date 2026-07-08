package X;

import Y.ACListenerS80S1100000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383990F3t {
    public static final C383990F3t LIZ = new C383990F3t();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

    public static String LIZIZ(C377760ErW c377760ErW) {
        Integer numLJIIJJI;
        if (c377760ErW != null) {
            int i = c377760ErW.LIZIZ;
            if (i != -47364) {
                if (i != 501) {
                    if (i != 3019014) {
                        if (i != -5) {
                            if (i != -4) {
                                if (i != -3) {
                                    if (i != -2) {
                                        if (i != -1 && i != 4 && i == 5) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("0 tries left. You will get ");
                                            sbLIZ.append(c377760ErW.LIZLLL);
                                            sbLIZ.append(" more tries tomorrow.");
                                            return C2188811AlT.LIZIZ(sbLIZ);
                                        }
                                        return "Something went wrong. Try again later.";
                                    }
                                    return "Add prompt to generate";
                                }
                                return "Please upload reference image to generate";
                            }
                            return "Add prompt or upload reference to generate";
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(' ');
                        sbLIZ2.append(c377760ErW.LIZLLL);
                        sbLIZ2.append(" character limit reached");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        String str = c377760ErW.LJ.get("currentWordCount");
                        if (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() < 0) {
                            return strLIZIZ;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(numLJIIJJI);
                        sbLIZ3.append('/');
                        sbLIZ3.append(strLIZIZ);
                        return C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    return "Couldn't process your prompt or image because it violates our guidelines. Try another prompt.";
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Daily limit reached. You'll get ");
                sbLIZ4.append(c377760ErW.LIZLLL);
                sbLIZ4.append(" tries again tomorrow.");
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            return "Check your internet connection and try again";
        }
        return "";
    }

    public static void LJ(Activity activity, C377760ErW c377760ErW) {
        String string;
        Integer numLJIIJJI;
        if (c377760ErW != null) {
            int i = c377760ErW.LIZIZ;
            if (i != -47364) {
                if (i != 501) {
                    if (i != 30008 && i != 3019014) {
                        if (i != -5) {
                            string = i != -4 ? i != -3 ? i != -2 ? (i == -1 || i == 4 || i != 5) ? activity.getString(2131825348) : activity.getString(2131825402, Integer.valueOf(c377760ErW.LIZLLL)) : activity.getString(2131825396) : activity.getString(2131825406) : activity.getString(2131825397);
                        } else {
                            string = activity.getString(2131825398, Integer.valueOf(c377760ErW.LIZLLL));
                            String str = c377760ErW.LJ.get("currentWordCount");
                            if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() >= 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(numLJIIJJI);
                                sbLIZ.append('/');
                                sbLIZ.append(string);
                                string = C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                    } else {
                        string = activity.getString(2131825403);
                    }
                } else {
                    string = activity.getString(2131834195, Integer.valueOf(c377760ErW.LIZLLL));
                }
            } else {
                string = activity.getString(2131857244);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LJI(Activity activity, Function1<? super Boolean, Unit> function1) {
        String string = activity.getString(2131825390);
        String string2 = activity.getString(2131825387);
        String string3 = activity.getString(2131825389);
        String string4 = activity.getString(2131825388);
        getClass();
        LIZJ(activity, string, string2, string3, string4, false, false, function1, null, false, null);
    }

    public static void LJII(Context context, Function1 function1, Function0 function0, Function0 function02) {
        final int iIntValue;
        final int iIntValue2;
        String string = context.getString(2131825451);
        context.getString(2131825437, context.getString(2131825443));
        String string2 = context.getString(2131825443);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ob, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(context.getString(2131825447), context.getString(2131825448), context.getString(2131825449), context.getString(2131825450));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
        final int i = iLIZIZ + iLIZIZ2;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder((String) it2.next());
            C786410Ut5.q2(spannableStringBuilder2, new LeadingMarginSpan(iLIZIZ2, iIntValue2, iLIZIZ, i) { // from class: X.0F6c
                public final int LL;
                public final int LLILLJJLI;
                public final int LLILLL;
                public final int LLILZ;

                @Override // android.text.style.LeadingMarginSpan
                public final int getLeadingMargin(boolean z) {
                    return (this.LLILLL * 2) + this.LL + this.LLILZ;
                }

                {
                    this.LL = iLIZIZ2;
                    this.LLILLJJLI = iIntValue2;
                    this.LLILLL = iLIZIZ;
                    this.LLILZ = i;
                }

                @Override // android.text.style.LeadingMarginSpan
                public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z, Layout layout) {
                    if (z) {
                        Paint.Style style = paint.getStyle();
                        int color = paint.getColor();
                        paint.setColor(this.LLILLJJLI);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawCircle(i2 + (i3 * (this.LLILZ + r2)), (i4 + i6) / 2.0f, this.LLILLL, paint);
                        paint.setStyle(style);
                        paint.setColor(color);
                    }
                }
            }, 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2).append((CharSequence) "\n");
        }
        int iLJJJ = a0.LJJJ(spannableStringBuilder.toString(), string2, 0, false, 6);
        new C2089008Gi(C2273271DyP.LIZ());
        if (iLJJJ != -1) {
            final ACListenerS80S1100000_7 aCListenerS80S1100000_7 = new ACListenerS80S1100000_7(context, string2, 2);
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan(iIntValue, aCListenerS80S1100000_7) { // from class: X.0F6d
                public final int LL;
                public final View.OnClickListener LLILLJJLI;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener = this.LLILLJJLI;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(this.LL);
                    textPaint.setUnderlineText(false);
                }

                {
                    this.LL = iIntValue;
                    this.LLILLJJLI = aCListenerS80S1100000_7;
                }
            }, iLJJJ, string2.length() + iLJJJ, 34);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(82, true), iLJJJ, string2.length() + iLJJJ, 34);
        }
        LIZJ(context, string, spannableStringBuilder, context.getString(2131825446), context.getString(2131825382), false, true, function1, function0, true, function02);
    }

    public static View LIZ(Context context, int i, int i2, int i3, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int i4 = LIZIZ;
        linearLayout.setPadding(i4, i4, i4, i4);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i4);
        Integer numLIZJ = C1308910kAL.LIZJ(i2, context);
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        linearLayout.setBackground(gradientDrawable);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        if (i > 0) {
            tuxTextView.setMaxWidth(i);
        }
        tuxTextView.setText(str);
        Integer numLIZJ2 = C1308910kAL.LIZJ(i3, context);
        if (numLIZJ2 != null) {
            tuxTextView.setTextColor(numLIZJ2.intValue());
        }
        tuxTextView.setTuxFont(52);
        linearLayout.addView(tuxTextView);
        return linearLayout;
    }

    public static void LJFF(boolean z, Scene scene, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, Function1 function1) {
        Context contextLIZIZ;
        int i;
        if (scene == null || (contextLIZIZ = C545820Lau.LIZIZ(scene)) == null || C545820Lau.LJ(scene) || c0e48 == null) {
            return;
        }
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL == null && (!C1533950q1J.LJ(null) || (nLETrackSlotLLLLLLIL = C377740ErU.LIZLLL(c0e48.LLFII().LJI().getModel(), "")) == null)) {
            function1.invoke(null);
            return;
        }
        C377150EqX c377150EqX = C377150EqX.LIZ;
        boolean zLIZIZ = C377150EqX.LIZIZ(videoPublishEditModel, nLETrackSlotLLLLLLIL);
        if (C357540E0a.LJIILL(nLETrackSlotLLLLLLIL) && !zLIZIZ) {
            C1397580mTM c1397580mTM = new C1397580mTM(contextLIZIZ);
            if (z) {
                i = 2131825393;
            } else {
                i = 2131825391;
            }
            c1397580mTM.LJFF(i);
            c1397580mTM.LJII = false;
            c1397580mTM.LIZ(2131825392);
            C985403tE.LIZ(c1397580mTM, new AwS103S0400000_5(c0e48, (C0E48) function1, (Function1<? super NLETrackSlot, Unit>) nLETrackSlotLLLLLLIL, (NLETrackSlot) videoPublishEditModel, (VideoPublishEditModel) 13));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C377120EqU.LIZ.getClass();
            if (videoPublishEditModel != null) {
                C20684815ws.LJIILLIIL("remove_magic_popup_show", C377120EqU.LIZJ(videoPublishEditModel, c0e48).LIZ);
                return;
            }
            return;
        }
        function1.invoke(nLETrackSlotLLLLLLIL);
    }

    public static C1397510mTF LIZJ(Context context, CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z, boolean z2, Function1 function1, Function0 function0, boolean z3, Function0 function02) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZLLL(new AwS584S0100000_5(function02, (Function0<Unit>) 1024));
        if (z3) {
            c1397580mTM.LJIIJ = new C1397550mTJ(context, charSequence, charSequence2);
        } else {
            c1397580mTM.LJI(charSequence);
            c1397580mTM.LIZIZ(charSequence2);
        }
        if (z) {
            C384030F3x c384030F3x = new C384030F3x(context);
            C384000F3u.LIZ(c1397580mTM, c384030F3x);
            C985403tE.LIZ(c1397580mTM, new C384010F3v(z2, str, str2, function1, c384030F3x, function0));
        } else {
            C985403tE.LIZ(c1397580mTM, new AnonymousClass0800(str, str2, function0, function1, z2));
        }
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        c1397510mTF.LIZLLL();
        return c1397510mTF;
    }
}
