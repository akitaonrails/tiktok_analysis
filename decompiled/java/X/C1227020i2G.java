package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;

/* JADX INFO: renamed from: X.0i2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227020i2G extends AbstractC1225770i0F {
    public final C1226990i2D LLJIJIL;
    public final C1227050i2J LLJILJIL;
    public final C1226180i0u LLJILJILJ;

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224490hyB LJJJJIZL() {
        return new C1227460i2y(this.LLJIJIL.LLJJIII, this);
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224480hyA LJJJJJ() {
        C913630Zsn.LJIIJJI.getClass();
        return C1227540i36.LIZIZ;
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224330hxv LJJJJJL() {
        return new C1227340i2m(this, this.LLJIJIL.LLJILLL);
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224410hy3 LJJJJL() {
        return new C1225720i0A(this, this.LLJIJIL.LLJJIJI);
    }

    @Override // X.AbstractC1225770i0F
    public final C1224950hyv LJJJJLI() {
        return new C1227330i2l(this, (C1227080i2M) this.LLJIJIL.LLJJI.LIZIZ);
    }

    @Override // X.AbstractC1225770i0F
    public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
        return this.LLJIJIL;
    }

    public C1227020i2G(C1226990i2D c1226990i2D) {
        super(c1226990i2D);
        this.LLJIJIL = c1226990i2D;
        this.LLJILJIL = new C1227050i2J(this);
        this.LLJILJILJ = new C1226180i0u(this);
    }

    @Override // X.AbstractC1225770i0F, X.InterfaceC1224250hxn
    public final void LJJIJLIJ(C1224050hxT c1224050hxT) {
        IIMChatDetailAnalytics iIMChatDetailAnalytics;
        if (c1224050hxT.LIZ != null && (iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class)) != null) {
            iIMChatDetailAnalytics.LJIIIZ(this.LLJIJIL.LLJILJILJ.LJI, "auto");
        }
    }

    @Override // X.AbstractC1225770i0F
    public final void LJJJJZ(AbstractC1225650i03 abstractC1225650i03) {
        IIMChatDetailAnalytics iIMChatDetailAnalytics;
        super.LJJJJZ(abstractC1225650i03);
        if (abstractC1225650i03 instanceof C1225680i06) {
            C1224840hyk c1224840hyk = ((C1225680i06) abstractC1225650i03).LIZ;
            if (!c1224840hyk.LLJILJIL) {
                this.LLJILJIL.LIZ(null, null, null, null);
                this.LLJILJILJ.LIZ(c1224840hyk, "add_member");
                return;
            }
            return;
        }
        if (!(abstractC1225650i03 instanceof C1225640i02) || (iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class)) == null) {
            return;
        }
        iIMChatDetailAnalytics.LJIIIZ(this.LLJIJIL.LLJILJILJ.LJI, "click");
    }

    @Override // X.AbstractC1225770i0F
    public final void LJJJJZI(C1224840hyk c1224840hyk) {
        this.LLJILJIL.LIZIZ(null, c1224840hyk.LLILZ, null, null);
    }
}
