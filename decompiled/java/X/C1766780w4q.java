package X;

import Y.ARunnableS31S0201000_26;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766780w4q extends C18QS {
    public SpannableStringBuilder LLJJL;
    public SpannableStringBuilder LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public final Map<String, Drawable> LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;

    public final int getFoldMaxLine() {
        return this.LLL;
    }

    public final boolean getHasCalculate() {
        return this.LLJLLL;
    }

    public final boolean getNeedExpandDesc() {
        return this.LLJZ;
    }

    public final boolean getShouleExpand() {
        return this.LLJZIJLIL;
    }

    public final void setExpand(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setHasCalculate(boolean z) {
        this.LLJLLL = z;
    }

    public final void setNeedExpandDesc(boolean z) {
        this.LLJZ = z;
    }

    public final void setShouleExpand(boolean z) {
        this.LLJZIJLIL = z;
    }

    public C1766780w4q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJL = " ...";
        this.LLJLL = new LinkedHashMap();
        this.LLL = 2;
    }

    public final void LJJJZ(int i, CharSequence charSequence) {
        if (!this.LLJZ) {
            return;
        }
        setEllipsize(null);
        setMovementMethod(LinkMovementMethod.getInstance());
        HandlerHook.viewPost(this, new ARunnableS31S0201000_26(i, this, charSequence, 7));
    }

    public static void LJJL(C1766780w4q c1766780w4q, CharSequence charSequence, List list, int i, int i2) {
        int lineHeight;
        Spanned spannedFromHtml;
        AFwS215S0000000_26 aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(416);
        c1766780w4q.LLL = i2;
        if (list != null && !list.isEmpty()) {
            c1766780w4q.LLJLIL = list.size();
            c1766780w4q.LLJLILLLLZIIL = 0;
            ((LinkedHashMap) c1766780w4q.LLJLL).keySet().retainAll(C13LP.LLIIJI(list));
            StringBuilder sb = new StringBuilder();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(C786410Ut5.j4("<img src='%s'>", Arrays.copyOf(new Object[]{it2.next()}, 1)));
                sb.append(" ");
            }
            sb.append(charSequence);
            String string = sb.toString();
            if (c1766780w4q.getLogoMaxHeight() > 0.0d) {
                lineHeight = C814420VxA.LIZ(c1766780w4q.getLogoMaxHeight());
            } else {
                lineHeight = c1766780w4q.getLineHeight();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                spannedFromHtml = Html.fromHtml(string, 0, new C1766850w4x(c1766780w4q, c1766780w4q.getContext(), c1766780w4q, lineHeight, i, i2), null);
            } else {
                spannedFromHtml = Html.fromHtml(string, new C1766850w4x(c1766780w4q, c1766780w4q.getContext(), c1766780w4q, lineHeight, i, i2), null);
            }
            if (spannedFromHtml instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannedFromHtml;
                C089E c089e = new C089E(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class));
                while (c089e.hasNext()) {
                    ImageSpan imageSpan = (ImageSpan) c089e.next();
                    C786410Ut5.q2(spannableStringBuilder, new C416590GVd(imageSpan.getDrawable()), spannableStringBuilder.getSpanStart(imageSpan), spannableStringBuilder.getSpanEnd(imageSpan), 34);
                    spannableStringBuilder.removeSpan(imageSpan);
                }
            }
            c1766780w4q.setText(spannedFromHtml);
            return;
        }
        c1766780w4q.setText(charSequence);
        c1766780w4q.LJJJZ(i2, charSequence);
        aFwS215S0000000_26.getClass();
    }

    public final void LJJJLZIJ(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5, boolean z, Function0 function0) {
        spannableStringBuilder.insert(spannableStringBuilder.length(), " ");
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(getContext(), R.raw.icon_chevron_up_fill);
        tuxIconDrawable.LJI(R.attr.a1k, getContext());
        tuxIconDrawable.setBounds(i, i2, i3, i4);
        C419890GdH c419890GdH = new C419890GdH(tuxIconDrawable, 2);
        c419890GdH.LIZIZ(i5, 0, z);
        C786410Ut5.q2(spannableStringBuilder, c419890GdH, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        final AwS570S0100000_26 awS570S0100000_26 = (AwS570S0100000_26) function0;
        C786410Ut5.q2(spannableStringBuilder, new AbstractC426530Gnz() { // from class: X.0w4r
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                awS570S0100000_26.invoke();
            }
        }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }
}
