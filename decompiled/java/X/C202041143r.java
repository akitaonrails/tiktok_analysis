package X;

import android.media.MediaExtractor;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.143r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202041143r implements InterfaceC202028143e {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC202028143e LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public long LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(83));

    @Override // X.InterfaceC202028143e
    public final void onCancel() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        InterfaceC202028143e interfaceC202028143e = this.LIZJ;
        if (interfaceC202028143e != null) {
            interfaceC202028143e.onCancel();
        }
        IAVMobService iAVMobService = (IAVMobService) this.LJI.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("resource_type", "music");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LIZJ(2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("resource_id", this.LIZ);
        c2344009Gk.LJIIIIZZ("error_domain", this.LIZIZ);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        iAVMobService.onEventV3("tool_performance_resource_download", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC202028143e
    public final void onStart() {
        this.LJFF = System.currentTimeMillis();
        InterfaceC202028143e interfaceC202028143e = this.LIZJ;
        if (interfaceC202028143e != null) {
            interfaceC202028143e.onStart();
        }
    }

    @Override // X.InterfaceC202028143e
    public final void LIZJ(C202035143l c202035143l) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        InterfaceC202028143e interfaceC202028143e = this.LIZJ;
        if (interfaceC202028143e != null) {
            interfaceC202028143e.LIZJ(c202035143l);
        }
        IAVMobService iAVMobService = (IAVMobService) this.LJI.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("resource_type", "music");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("resource_id", this.LIZ);
        c2344009Gk.LJIIIIZZ("error_domain", this.LIZIZ);
        c2344009Gk.LIZJ(c202035143l.getErrorCode(), "error_code");
        String errorMsg = c202035143l.getErrorMsg();
        if (errorMsg == null) {
            errorMsg = "empty_error_msg";
        }
        c2344009Gk.LJIIIIZZ("error_msg", errorMsg);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("from", this.LJ);
        iAVMobService.onEventV3("tool_performance_resource_download", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC202028143e
    public final void onProgress(int i) {
        InterfaceC202028143e interfaceC202028143e = this.LIZJ;
        if (interfaceC202028143e != null) {
            interfaceC202028143e.onProgress(i);
        }
    }

    @Override // X.InterfaceC202028143e
    public final void LIZIZ(Map map, Map map2) {
        if (MethodIDManager.LJI(137737)) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC202028143e
    public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
        boolean zLJI = MethodIDManager.LJI(137737);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        InterfaceC202028143e interfaceC202028143e = this.LIZJ;
        if (interfaceC202028143e != null) {
            interfaceC202028143e.LIZ(str, musicWaveBean, bool);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        int i = 1;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_enable_mob_loudness_and_bitrate", true, true)) {
            try {
                c2344009Gk.LIZLLL(new C0VSJ(str).length(), "file_size");
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(str);
                c2344009Gk.LIZJ(mediaExtractor.getTrackFormat(0).getInteger("bitrate"), "file_bitrate");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        IAVMobService iAVMobService = (IAVMobService) this.LJI.getValue();
        c2344009Gk.LJIIIIZZ("resource_type", "music");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJIIIIZZ("resource_id", this.LIZ);
        String str2 = this.LIZLLL;
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJ(bool, "isSuccessByCache");
        c2344009Gk.LJIIIIZZ("from", this.LJ);
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            i = 0;
        } else if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (bool == null) {
                i = 2;
            } else {
                C1954807lC c1954807lC = new C1954807lC();
                if (zLJI) {
                    MethodIDManager.LJ();
                    throw c1954807lC;
                }
                throw c1954807lC;
            }
        }
        c2344009Gk.LIZJ(i, "begin_status");
        iAVMobService.onEventV3("tool_performance_resource_download", c2344009Gk.LIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C202041143r(String str, String str2, InterfaceC202028143e interfaceC202028143e, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC202028143e;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
