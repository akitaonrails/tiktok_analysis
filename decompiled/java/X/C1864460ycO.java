package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.aweme.iab.TtopIABActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ycO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864460ycO extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (2 - this.$t != 0) {
            super.updateDrawState(textPaint);
        } else {
            updateDrawState$0(this, textPaint);
        }
    }

    public static final void onClick$0(C1864460ycO c1864460ycO, View view) {
        ((C1806860x7U) c1864460ycO.l0).LIZLLL(((C1807010x7j) c1864460ycO.l1).itemView.getContext());
    }

    public static final void onClick$1(C1864460ycO c1864460ycO, View view) {
        ((C1806860x7U) c1864460ycO.l0).LIZLLL(((C1807050x7n) c1864460ycO.l1).itemView.getContext());
    }

    public static final void onClick$2(C1864460ycO c1864460ycO, View view) {
        C20145813s8.LIZ("label", ((TtopIABActivity) c1864460ycO.l0).WR(), (Context) c1864460ycO.l1, CertProviderManagerKt.findCert("bpea-ttop_iab_copy_browser_url", 1476399156));
        C1389890mGx c1389890mGx = new C1389890mGx((TtopIABActivity) c1864460ycO.l0);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LJIIIZ(2131857181);
        c1389890mGx.LJIIJJI();
        C2442409he c2442409he = C2442409he.LIZ;
        int type = ((TtopIABActivity) c1864460ycO.l0).VR().getState().LL.getType();
        int iSR = ((TtopIABActivity) c1864460ycO.l0).SR();
        String strWR = ((TtopIABActivity) c1864460ycO.l0).WR();
        boolean zUR = ((TtopIABActivity) c1864460ycO.l0).UR();
        c2442409he.getClass();
        C2442409he.LIZIZ(type, iSR, strWR, "copy_link", zUR);
    }

    public static final void updateDrawState$0(C1864460ycO c1864460ycO, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.bgColor = 0;
    }

    public C1864460ycO(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
