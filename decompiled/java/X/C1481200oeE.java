package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0oeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481200oeE implements InterfaceC1481780ofA {
    @Override // X.InterfaceC1481780ofA
    public final int LIZLLL() {
        return C582130MsN.LIZ().LJ().LIZLLL();
    }

    @Override // X.InterfaceC1481780ofA
    public final int LIZ(SimVideoUrlModel simVideoUrlModel) {
        if (C1475700oVM.LIZ().isCache(simVideoUrlModel)) {
            return C1475700oVM.LIZ().LJJLIIIJJI(simVideoUrlModel);
        }
        if (PreloadSessionManager.LIZIZ.LIZ(simVideoUrlModel.getSourceId()) == null) {
            return -2;
        }
        return -1;
    }

    @Override // X.InterfaceC1481780ofA
    public final int LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        Session sessionLJI = C1477400oY6.LJJJJI.LJI(simVideoUrlModel.getUri());
        if (sessionLJI != null) {
            return (int) ((sessionLJI.speed / 8) / LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return -1;
    }

    @Override // X.InterfaceC1481780ofA
    public final List<C2262431Dgv> LIZJ(SimVideoUrlModel simVideoUrlModel) {
        return C1475700oVM.LIZ().LIZJ(simVideoUrlModel);
    }

    @Override // X.InterfaceC1481780ofA
    public final int LJI(String str) {
        return EnumC1481210oeF.INS.getPreRenderType(str);
    }

    @Override // X.InterfaceC1481780ofA
    public final int LJJIZ(SimVideoUrlModel simVideoUrlModel) {
        return (int) C1475700oVM.LIZ().LJJIZ(simVideoUrlModel);
    }

    @Override // X.InterfaceC1481780ofA
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        return C1475700oVM.LIZ().isCache(simVideoUrlModel);
    }

    @Override // X.InterfaceC1481780ofA
    public final boolean LJ(SimVideoUrlModel simVideoUrlModel, String str) {
        return C1477130oXf.LJI(simVideoUrlModel.getCreateTime(), simVideoUrlModel.getCdnUrlExpired(), str);
    }

    @Override // X.InterfaceC1481780ofA
    public final int LJFF(SimVideoUrlModel simVideoUrlModel, int i) {
        PreloadSessionManager.PreloadSession preloadSessionLIZ = PreloadSessionManager.LIZIZ.LIZ(simVideoUrlModel.getSourceId());
        if (preloadSessionLIZ != null && i > 0) {
            return preloadSessionLIZ.speed;
        }
        return -1;
    }
}
