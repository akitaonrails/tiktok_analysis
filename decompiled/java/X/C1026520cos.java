package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026520cos extends AbstractC1026640cp4<C1026680cp8> {
    public final C1026680cp8 LJIILL;
    public final String LJIILLIIL = "act";
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 729));

    @Override // X.InterfaceC1026720cpC
    public final boolean LJ() {
        if (!C815510Vyv.LIZIZ((Uri) this.LJIIZILJ.getValue())) {
            return false;
        }
        ICRouterAdapterDelegate iCRouterAdapterDelegateLJIILIIL = LJIILIIL();
        C1026680cp8 c1026680cp8 = this.LJIILL;
        String str = c1026680cp8.LIZJ;
        BrowserConfig browserConfig = c1026680cp8.LJ;
        GMTBaseModel gMTBaseModel = LJIIIZ().LJ;
        String strValueOf = String.valueOf(gMTBaseModel != null ? gMTBaseModel.getCreativeId() : null);
        GMTBaseModel gMTBaseModel2 = LJIIIZ().LJ;
        return iCRouterAdapterDelegateLJIILIIL.LJJII(str, browserConfig, strValueOf, gMTBaseModel2 != null ? gMTBaseModel2.getLogExtra() : null);
    }

    @Override // X.InterfaceC1026870cpR
    public final String getUrl() {
        String str = this.LJIILL.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUrl() = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return str;
    }

    @Override // X.AbstractC1026640cp4
    public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
        return this.LJIILL;
    }

    @Override // X.AbstractC1026640cp4
    public final String LJIILLIIL() {
        return this.LJIILLIIL;
    }

    public C1026520cos(C1026680cp8 c1026680cp8) {
        this.LJIILL = c1026680cp8;
    }

    @Override // X.InterfaceC1026720cpC
    public final Object LIZLLL(C1026650cp5 c1026650cp5) {
        Long creativeId;
        String strLJIL = LJIILIIL().LJIL(this.LJIILL.LIZLLL);
        ICRouterAdapterDelegate iCRouterAdapterDelegateLJIILIIL = LJIILIIL();
        Context contextLJIIJ = LJIIJ();
        int iLJIIIIZZ = LJIIIIZZ();
        C1026680cp8 c1026680cp8 = this.LJIILL;
        String str = c1026680cp8.LIZJ;
        BrowserConfig browserConfig = c1026680cp8.LJ;
        GMTBaseModel gMTBaseModel = LJIIIZ().LJ;
        String logExtra = null;
        if (gMTBaseModel != null) {
            creativeId = gMTBaseModel.getCreativeId();
        } else {
            creativeId = null;
        }
        String strValueOf = String.valueOf(creativeId);
        GMTBaseModel gMTBaseModel2 = LJIIIZ().LJ;
        if (gMTBaseModel2 != null) {
            logExtra = gMTBaseModel2.getLogExtra();
        }
        String str2 = LJII().LIZLLL;
        C1026680cp8 c1026680cp82 = this.LJIILL;
        if (iCRouterAdapterDelegateLJIILIIL.LJJIJ(contextLJIIJ, iLJIIIIZZ, str, browserConfig, strValueOf, logExtra, str2, c1026680cp82.LJI, c1026680cp82.LJFF, strLJIL)) {
            return C1026670cp7.LIZLLL;
        }
        return new C1026670cp7(-1, "unknown_exception");
    }
}
