package Y;

import X.AbstractC312990COr;
import X.C1254520ikc;
import X.C1308910kAL;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1BHX;
import X.C1C7U;
import X.C2188811AlT;
import X.C312960COo;
import X.C312980COq;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C790600Uzq;
import X.C793770VBv;
import X.C814420VxA;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.feed.adapter.viewholder.WatchLaterViewHolder;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS10S1200000_4 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((AbstractC312990COr) this.l1).LJI(C312980COq.LIZIZ)) {
            return;
        }
        BaseCombineMode baseCombineModeLIZJ = ((AbstractC312990COr) this.l1).LIZJ();
        if (baseCombineModeLIZJ == null || baseCombineModeLIZJ.httpCode != 509) {
            if (((AbstractC312990COr) this.l1).LIZLLL()) {
                AbstractC312990COr abstractC312990COr = (AbstractC312990COr) this.l1;
                C312960COo c312960COo = (C312960COo) this.l2;
                BaseCombineMode baseCombineModeLIZJ2 = abstractC312990COr.LIZJ();
                abstractC312990COr.LJFF(c312960COo, baseCombineModeLIZJ2 != null ? Integer.valueOf(baseCombineModeLIZJ2.httpCode) : null);
            } else {
                ((AbstractC312990COr) this.l1).LJ((C312960COo) this.l2);
            }
            C312980COq c312980COq = C312980COq.LIZ;
            String str = this.s0;
            BaseCombineMode baseCombineModeLIZJ3 = ((AbstractC312990COr) this.l1).LIZJ();
            Integer numValueOf = baseCombineModeLIZJ3 != null ? Integer.valueOf(baseCombineModeLIZJ3.httpCode) : null;
            c312980COq.getClass();
            C312980COq.LIZLLL(str, numValueOf);
        }
    }

    public final void LIZ$1() {
        TextView textView = (TextView) ((WatchLaterViewHolder) this.l1).LLJ.getValue();
        if (textView == null) {
            return;
        }
        float width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        TextPaint paint = textView.getPaint();
        if (paint.measureText(this.s0) <= width) {
            textView.setText(this.s0);
            return;
        }
        String string = TextUtils.ellipsize(this.s0, paint, width, TextUtils.TruncateAt.END).toString();
        WatchLaterViewHolder watchLaterViewHolder = (WatchLaterViewHolder) this.l1;
        List list = (List) this.l2;
        watchLaterViewHolder.getClass();
        int iP5 = WatchLaterViewHolder.P5(string, list);
        if (iP5 == 0) {
            textView.setText(string);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('+');
        sbLIZ.append(iP5);
        float fMeasureText = width - paint.measureText(C2188811AlT.LIZIZ(sbLIZ));
        if (fMeasureText < 0.0f) {
            fMeasureText = 0.0f;
        }
        String string2 = TextUtils.ellipsize(this.s0, paint, fMeasureText, TextUtils.TruncateAt.END).toString();
        WatchLaterViewHolder watchLaterViewHolder2 = (WatchLaterViewHolder) this.l1;
        List list2 = (List) this.l2;
        watchLaterViewHolder2.getClass();
        int iP52 = WatchLaterViewHolder.P5(string2, list2);
        boolean z = textView.getLayoutDirection() == 1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (z) {
            sbLIZ2.append(iP52);
            sbLIZ2.append('+');
            sbLIZ2.append(string2);
        } else {
            sbLIZ2.append(string2);
            sbLIZ2.append('+');
            sbLIZ2.append(iP52);
        }
        textView.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZ$2() {
        ViewGroup viewGroup;
        if (((WebView) this.l1).getParent() != null) {
            C1254520ikc c1254520ikc = (C1254520ikc) this.l2;
            WebView webView = (WebView) this.l1;
            final String str = this.s0;
            C1749280vcc c1749280vcc = c1254520ikc.LIZLLL;
            if (c1749280vcc == null) {
                c1749280vcc = new C1749280vcc(webView.getContext(), null, 6);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, webView.getContext());
                c1749280vcc.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : -1);
                C786410Ut5.l9(c1749280vcc, new View.OnClickListener() { // from class: X.0DVC
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
                c1254520ikc.LIZLLL = c1749280vcc;
            }
            if (c1749280vcc.getParent() == null) {
                ViewParent parent = webView.getParent();
                if ((parent instanceof C1BHX) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.addView(c1749280vcc, new FrameLayout.LayoutParams(-1, -1));
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1749280vcc.getContext().getString(2131857186));
            spannableStringBuilder.append((CharSequence) "\n\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0DRq
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    try {
                        C20145813s8.LIZ("profile_bio_link", str, view.getContext(), CertProviderManagerKt.findCert("bpea-tns_tiered_biolink_redirect_page_copy_url_android", 1476399159));
                        C1389890mGx c1389890mGx = new C1389890mGx(view);
                        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                        c1389890mGx.LJII(R.attr.a1h);
                        c1389890mGx.LJIIIZ(2131857181);
                        c1389890mGx.LJIIJJI();
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.bgColor = 0;
                }
            }, length, spannableStringBuilder.length(), 33);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJFF = 2131857187;
            c1722300uv6.LJIIIIZZ = spannableStringBuilder;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_protection;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1749280vcc.setStatus(c1722300uv6);
            TuxTextView tuxTextView = (TuxTextView) c1749280vcc.findViewById(R.id.message_tv);
            tuxTextView.LLJJ = true;
            tuxTextView.setMaxLines(20);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            c1254520ikc.LJ = str;
        }
    }

    public static final void run$0(ARunnableS10S1200000_4 aRunnableS10S1200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ColdLaunchRequestCombiner@5259.onCombineSuccess$2");
        try {
            aRunnableS10S1200000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ColdLaunchRequestCombiner@5259.onCombineSuccess$2");
    }

    public static final void run$1(ARunnableS10S1200000_4 aRunnableS10S1200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("WatchLaterViewHolder@c1fc.bindAnchorNames$1");
        try {
            aRunnableS10S1200000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WatchLaterViewHolder@c1fc.bindAnchorNames$1");
    }

    public static final void run$2(ARunnableS10S1200000_4 aRunnableS10S1200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TieredBioLinkWebViewClient@6076.handleTieredUrlLoading$1");
        try {
            aRunnableS10S1200000_4.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TieredBioLinkWebViewClient@6076.handleTieredUrlLoading$1");
    }

    public static final void run$3(ARunnableS10S1200000_4 aRunnableS10S1200000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorDuration$1");
        try {
            JSONObject jSONObjectLIZ = new C790600Uzq(aRunnableS10S1200000_4.s0, 0, (JSONObject) aRunnableS10S1200000_4.l1, null, null, (JSONObject) aRunnableS10S1200000_4.l2).LIZ();
            if (jSONObjectLIZ != null) {
                C793770VBv.LJIIZILJ("monitorDuration", C786410Ut5.J3(jSONObjectLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorDuration$1");
    }

    public ARunnableS10S1200000_4(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }

    public ARunnableS10S1200000_4(AbstractC312990COr abstractC312990COr, C312960COo c312960COo, Context context, String str, int i) {
        this.$t = i;
        this.l1 = abstractC312990COr;
        this.l2 = c312960COo;
        this.s0 = str;
    }
}
