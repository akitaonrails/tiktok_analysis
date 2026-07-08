package X;

import Y.ARunnableS106S0100000_6;
import Y.ATListenerS440S0100000_6;
import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mix.profile.entry.PlaylistShowManageCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0IDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ViewTreeObserverOnPreDrawListenerC462840IDa implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC462840IDa viewTreeObserverOnPreDrawListenerC462840IDa) {
        C786410Ut5.D3(((PlaylistShowManageCell) viewTreeObserverOnPreDrawListenerC462840IDa.l0).itemView.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC462840IDa);
        int i = C1169380gXI.LLJJJ;
        if (C1169380gXI.LLJJJ != ((PlaylistShowManageCell) viewTreeObserverOnPreDrawListenerC462840IDa.l0).itemView.getWidth()) {
            C1169380gXI.LLJJJ = ((PlaylistShowManageCell) viewTreeObserverOnPreDrawListenerC462840IDa.l0).itemView.getWidth();
            Function0<Unit> function0 = ((C445400HdK) viewTreeObserverOnPreDrawListenerC462840IDa.l1).LLIZ;
            if (function0 != null) {
                function0.invoke();
            }
            ((PlaylistShowManageCell) viewTreeObserverOnPreDrawListenerC462840IDa.l0).itemView.requestLayout();
            return false;
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC462840IDa viewTreeObserverOnPreDrawListenerC462840IDa) {
        int measuredWidth;
        int lineEnd;
        C786410Ut5.D3(((TuxTextView) viewTreeObserverOnPreDrawListenerC462840IDa.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC462840IDa);
        C430840Guw c430840Guw = C430840Guw.LIZ;
        TuxTextView tuxTextView = (TuxTextView) viewTreeObserverOnPreDrawListenerC462840IDa.l0;
        Context context = (Context) viewTreeObserverOnPreDrawListenerC462840IDa.l1;
        c430840Guw.getClass();
        CharSequence text = tuxTextView.getText();
        if (text != null && (text instanceof Spanned) && (measuredWidth = (tuxTextView.getMeasuredWidth() - tuxTextView.getPaddingStart()) - tuxTextView.getPaddingEnd()) >= 0 && measuredWidth > 0) {
            String string = context.getString(R.string.loy);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("...");
            sbLIZ.append(string);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            float fMeasureText = tuxTextView.getPaint().measureText(strLIZIZ);
            if (C430840Guw.LIZIZ(measuredWidth, Integer.MAX_VALUE, tuxTextView, text).getLineCount() > 3) {
                StaticLayout staticLayoutLIZIZ = C430840Guw.LIZIZ(measuredWidth, 3, tuxTextView, text);
                int lineStart = staticLayoutLIZIZ.getLineStart(2);
                int ellipsisStart = staticLayoutLIZIZ.getEllipsisStart(2);
                if (ellipsisStart >= 0) {
                    lineEnd = ellipsisStart + lineStart;
                } else {
                    lineEnd = staticLayoutLIZIZ.getLineEnd(2);
                }
                int length = text.length();
                if (lineEnd > length) {
                    lineEnd = length;
                }
                CharSequence charSequenceSubSequence = text.subSequence(lineStart, lineEnd);
                float f = measuredWidth - fMeasureText;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                String string2 = TextUtils.ellipsize(charSequenceSubSequence, tuxTextView.getPaint(), f, TextUtils.TruncateAt.END).toString();
                if (u.LJIIZILJ(string2, "…", false)) {
                    string2 = C13LN.LJLL(1, string2);
                } else if (u.LJIIZILJ(string2, "...", false)) {
                    string2 = C13LN.LJLL(3, string2);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(text.subSequence(0, lineStart));
                spannableStringBuilder.append((CharSequence) string2);
                spannableStringBuilder.append((CharSequence) strLIZIZ);
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), spannableStringBuilder.length() - strLIZIZ.length(), spannableStringBuilder.length(), 33);
                tuxTextView.setEllipsize(null);
                tuxTextView.setMaxLines(3);
                tuxTextView.setText(spannableStringBuilder);
            }
        }
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC462840IDa viewTreeObserverOnPreDrawListenerC462840IDa) {
        ViewTreeObserver viewTreeObserver;
        boolean z;
        int lineCount;
        boolean z2;
        C16F5 c16f5 = (C16F5) viewTreeObserverOnPreDrawListenerC462840IDa.l0;
        if (c16f5 != null) {
            C1337290ku7 c1337290ku7 = (C1337290ku7) viewTreeObserverOnPreDrawListenerC462840IDa.l1;
            if (c16f5.getWidth() != 0 && c16f5.getHeight() != 0) {
                TextPaint textPaint = new TextPaint(c16f5.getPaint());
                textPaint.setTypeface(c16f5.getTypeface());
                textPaint.setTextSize(c16f5.getTextSize());
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                int iFloor = (int) Math.floor(((c16f5.getMeasuredHeight() - c16f5.getPaddingTop()) - c16f5.getPaddingBottom()) / (fontMetrics.descent - fontMetrics.ascent));
                Layout layout = c16f5.getLayout();
                float fMax = 0.0f;
                if (layout != null) {
                    int lineCount2 = layout.getLineCount();
                    for (int i = 0; i < lineCount2; i++) {
                        fMax = Math.max(fMax, layout.getLineWidth(i));
                    }
                }
                if (fMax > (c16f5.getWidth() - c16f5.getPaddingStart()) - c16f5.getPaddingEnd()) {
                    z = true;
                } else {
                    z = false;
                }
                if (layout != null) {
                    lineCount = layout.getLineCount();
                } else {
                    lineCount = 1;
                }
                if (lineCount > iFloor) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    float f = c1337290ku7.LJI;
                    if (f > 1.0f) {
                        float f2 = f - 1.0f;
                        c1337290ku7.LJI = f2;
                        c16f5.setTextSize(1, f2);
                        return false;
                    }
                }
            } else {
                HandlerHook.viewPost(c16f5, new ARunnableS106S0100000_6((Object) c16f5, 236));
                return true;
            }
        }
        C16F5 c16f52 = (C16F5) viewTreeObserverOnPreDrawListenerC462840IDa.l0;
        if (c16f52 != null && (viewTreeObserver = c16f52.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC462840IDa);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC462840IDa, ViewTreeObserver.OnPreDrawListener.class);
        }
        return true;
    }

    public static final boolean onPreDraw$3(ViewTreeObserverOnPreDrawListenerC462840IDa viewTreeObserverOnPreDrawListenerC462840IDa) {
        ViewTreeObserver viewTreeObserver;
        Spanned spanned;
        if (((ViewTreeObserver) viewTreeObserverOnPreDrawListenerC462840IDa.l0).isAlive()) {
            viewTreeObserver = (ViewTreeObserver) viewTreeObserverOnPreDrawListenerC462840IDa.l0;
        } else {
            viewTreeObserver = ((TextView) viewTreeObserverOnPreDrawListenerC462840IDa.l1).getViewTreeObserver();
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC462840IDa);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC462840IDa, ViewTreeObserver.OnPreDrawListener.class);
        }
        C447580Hgq c447580Hgq = C447580Hgq.LIZ;
        TextView textView = (TextView) viewTreeObserverOnPreDrawListenerC462840IDa.l1;
        c447580Hgq.getClass();
        Layout layout = textView.getLayout();
        if (layout == null) {
            textView.setTag(R.id.knu, null);
            return true;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned) || (spanned = (Spanned) text) == null) {
            return true;
        }
        C416760GVu[] c416760GVuArr = (C416760GVu[]) spanned.getSpans(0, spanned.length(), C416760GVu.class);
        if (c416760GVuArr.length == 0) {
            textView.setTag(R.id.knu, null);
            return true;
        }
        Paint paint = textView.getPaint();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        ArrayList arrayList = new ArrayList(c416760GVuArr.length);
        C089E c089e = new C089E(c416760GVuArr);
        while (c089e.hasNext()) {
            C416760GVu c416760GVu = (C416760GVu) c089e.next();
            int spanStart = spanned.getSpanStart(c416760GVu);
            int spanEnd = spanned.getSpanEnd(c416760GVu);
            C447610Hgt c447610Hgt = (C447610Hgt) C13LQ.LJJIFFI(spanned.getSpans(spanStart, spanEnd, C447610Hgt.class));
            if (c447610Hgt != null) {
                int size = c416760GVu.getSize(paint, spanned, spanStart, spanEnd, fontMetricsInt);
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
                int lineForOffset = layout.getLineForOffset(spanStart);
                arrayList.add(new C447600Hgs(primaryHorizontal, layout.getLineTop(lineForOffset), primaryHorizontal + size, layout.getLineBottom(lineForOffset), new AwS550S0100000_6(c447610Hgt, 1665)));
            }
        }
        textView.setTag(R.id.knu, arrayList);
        Object tag = textView.getTag(R.id.knv);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(tag, bool)) {
            return true;
        }
        textView.setTag(R.id.knv, bool);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        textView.setOnTouchListener(new ATListenerS440S0100000_6(c118300cf, 16));
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC462840IDa(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
