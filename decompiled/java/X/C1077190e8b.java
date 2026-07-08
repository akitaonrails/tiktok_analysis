package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import java.util.Map;

/* JADX INFO: renamed from: X.0e8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077190e8b extends AbstractC1552040qUU {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1552040qUU
    public final void LJFF(UpdatePackage updatePackage) {
        if (this.$t != 0) {
            super.LJFF(updatePackage);
        } else {
            LJFF$0(this, updatePackage);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        if (2 - this.$t != 0) {
            super.LJII(th, map);
        } else {
            LJII$0(this, th, map);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
        switch (this.$t) {
            case 0:
                LJIILLIIL$0(this, localPackageModel);
                break;
            case 1:
            default:
                super.LJIILLIIL(localPackageModel);
                break;
            case 2:
                LJIILLIIL$1(this, localPackageModel);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
        switch (this.$t) {
            case 1:
                LJIJ$0(this, updatePackage, th);
                break;
            case 2:
                LJIJ$1(this, updatePackage, th);
                break;
            default:
                super.LJIJ(updatePackage, th);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJJ() {
        if (2 - this.$t != 0) {
            super.LJIJJ();
        } else {
            LJIJJ$0(this);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        switch (this.$t) {
            case 1:
                LJIL$0(this, j, updatePackage);
                break;
            case 2:
                LJIL$1(this, j, updatePackage);
                break;
            default:
                super.LJIL(j, updatePackage);
                break;
        }
    }

    public static final void LJIJJ$0(C1077190e8b c1077190e8b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateFinish, accessKey=");
        sbLIZ.append(((C1867807Tg) c1077190e8b.l0).LIZ);
        C1022620cia.LJ("ShoppingTaskGeckoPreLoader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1077190e8b(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJFF$0(C1077190e8b c1077190e8b, UpdatePackage updatePackage) {
        String channel;
        AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl = (AdLandPagePreloadServiceImpl) c1077190e8b.l0;
        if (updatePackage != null && (channel = updatePackage.getChannel()) != null) {
            String strK0 = adLandPagePreloadServiceImpl.K0("feed");
            if (strK0 == null) {
                strK0 = "";
            }
            adLandPagePreloadServiceImpl.O0(adLandPagePreloadServiceImpl.p0(strK0, channel), null);
            return;
        }
        adLandPagePreloadServiceImpl.getClass();
    }

    public static final void LJIILLIIL$0(C1077190e8b c1077190e8b, LocalPackageModel localPackageModel) {
        AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl = (AdLandPagePreloadServiceImpl) c1077190e8b.l0;
        String channel = localPackageModel.getChannel();
        if (channel == null) {
            adLandPagePreloadServiceImpl.getClass();
            return;
        }
        String strK0 = adLandPagePreloadServiceImpl.K0("feed");
        if (strK0 == null) {
            strK0 = "";
        }
        adLandPagePreloadServiceImpl.O0(adLandPagePreloadServiceImpl.p0(strK0, channel), null);
    }

    public static final void LJIILLIIL$1(C1077190e8b c1077190e8b, LocalPackageModel localPackageModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLocalNewestVersion, accessKey=");
        sbLIZ.append(((C1867807Tg) c1077190e8b.l0).LIZ);
        sbLIZ.append(", channel=");
        sbLIZ.append(localPackageModel.getChannel());
        sbLIZ.append(", version=");
        sbLIZ.append(Long.valueOf(localPackageModel.getLatestVersion()));
        C1022620cia.LJ("ShoppingTaskGeckoPreLoader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJII$0(C1077190e8b c1077190e8b, Throwable th, Map map) {
        if (th != null) {
            C1022620cia.LIZJ("ShoppingTaskGeckoPreLoader", th);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCheckServerVersionFail, accessKey=");
        sbLIZ.append(((C1867807Tg) c1077190e8b.l0).LIZ);
        C1022620cia.LIZIZ("ShoppingTaskGeckoPreLoader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIJ$0(C1077190e8b c1077190e8b, UpdatePackage updatePackage, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1077190e8b.l0;
        if (th == null) {
            th = new UnknownError();
        }
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
    }

    public static final void LJIJ$1(C1077190e8b c1077190e8b, UpdatePackage updatePackage, Throwable th) {
        String channel;
        if (th != null) {
            C1022620cia.LIZJ("ShoppingTaskGeckoPreLoader", th);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateFailed, accessKey=");
        sbLIZ.append(((C1867807Tg) c1077190e8b.l0).LIZ);
        sbLIZ.append(", package=");
        if (updatePackage != null) {
            channel = updatePackage.getChannel();
        } else {
            channel = null;
        }
        sbLIZ.append(channel);
        C1022620cia.LIZIZ("ShoppingTaskGeckoPreLoader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIL$0(C1077190e8b c1077190e8b, long j, UpdatePackage updatePackage) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1077190e8b.l0;
        C189200o6.m2constructorimpl(updatePackage);
        interfaceC1364105Vn.resumeWith(updatePackage);
    }

    public static final void LJIL$1(C1077190e8b c1077190e8b, long j, UpdatePackage updatePackage) {
        String channel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateSuccess, accessKey=");
        sbLIZ.append(((C1867807Tg) c1077190e8b.l0).LIZ);
        sbLIZ.append(", version=");
        sbLIZ.append(j);
        sbLIZ.append(", package=");
        if (updatePackage != null) {
            channel = updatePackage.getChannel();
        } else {
            channel = null;
        }
        sbLIZ.append(channel);
        C1022620cia.LJ("ShoppingTaskGeckoPreLoader", C2188811AlT.LIZIZ(sbLIZ));
    }
}
