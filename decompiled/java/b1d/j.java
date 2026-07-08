package b1d;

import X.AbstractC1524320plm;
import X.C0CHQ;
import X.C0LAB;
import X.C1524290plj;
import X.C1639670slp;
import X.C201955140j;
import X.C2341909Fp;
import X.C543670LTx;
import X.InterfaceC1635100seS;
import X.InterfaceC1637880siw;
import X.InterfaceC2342209Fs;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class j implements InterfaceC1635100seS {
    @Override // X.InterfaceC1635100seS
    public final void LIZ(C1639670slp c1639670slp, String str, long j, AbstractC1524320plm abstractC1524320plm, long j2) {
        InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("tools_use_downloader", Boolean.valueOf(abstractC1524320plm instanceof C1524290plj));
        c543670LTx.LIZ.put("url", str);
        c543670LTx.LIZ.put("duration", String.valueOf(j));
        interfaceC1637880siwLIZJ.LJIIJJI(0, "filter_download_error_rate", c543670LTx.LJ());
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", "composer_filter");
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("resource_id", c1639670slp.LIZ);
        c0lab.LIZIZ(j2, "source_file_size");
        C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
    }

    @Override // X.InterfaceC1635100seS
    public final void LIZIZ(C1639670slp c1639670slp, String str, long j, AbstractC1524320plm abstractC1524320plm, Exception exc, Integer num) {
        InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("exception", C201955140j.LJIIJJI(exc));
        c543670LTx.LIZ.put("tools_use_downloader", Boolean.valueOf(abstractC1524320plm instanceof C1524290plj));
        c543670LTx.LIZ.put("url", str);
        c543670LTx.LIZ.put("filter_id", c1639670slp.LIZ);
        c543670LTx.LIZ.put("filter_name", c1639670slp.LIZJ);
        interfaceC1637880siwLIZJ.LJIIJJI(1, "filter_download_error_rate", c543670LTx.LJ());
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", "composer_filter");
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("resource_id", c1639670slp.LIZ);
        c0lab.LIZLLL(ListProtector.get(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts(), 0), "error_domain");
        c0lab.LIZLLL(num, "error_code");
        String message = exc.getMessage();
        if (message == null) {
            message = "empty_error_msg";
        }
        c0lab.LJ("error_msg", message);
        C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
    }
}
