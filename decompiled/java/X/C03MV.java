package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03MV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MV extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public C03MX LLILZ;
    public C20627315nb LLILZIL;

    private final SmartImageView getButtonImage() {
        return (SmartImageView) this.LLILLJJLI.getValue();
    }

    private final ViewStub getButtonViewStub() {
        return (ViewStub) this.LLILLL.getValue();
    }

    public final C197039127h getSingleButton() {
        return (C197039127h) this.LL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C03MX c03mx = this.LLILZ;
        if (c03mx != null) {
            c03mx.LIZ();
        }
    }

    private final void setButtonLoadingStatus(boolean z) {
        View viewLJLLLL;
        int i = 0;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_osp_submit_button_skeleton", true, false)) {
            if (this.LLILZIL == null && z) {
                ViewStub buttonViewStub = getButtonViewStub();
                C20627315nb c20627315nb = null;
                if (buttonViewStub != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(buttonViewStub);
                } else {
                    viewLJLLLL = null;
                }
                if (viewLJLLLL instanceof C20627315nb) {
                    c20627315nb = (C20627315nb) viewLJLLLL;
                }
                this.LLILZIL = c20627315nb;
            }
            C20627315nb c20627315nb2 = this.LLILZIL;
            if (c20627315nb2 != null) {
                c20627315nb2.setLoading(z);
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, c20627315nb2);
            }
        }
        getSingleButton().setLoading(z);
    }

    private final void setDefaultButtonBackground(C197039127h c197039127h) {
        c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 93));
    }

    public C03MV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1717));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1714));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1715));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b2y, this, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C03MY r27, com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel r28, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r29) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03MV.LIZ(X.03MY, com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel):void");
    }
}
