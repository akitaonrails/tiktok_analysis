package Y;

import X.C09JN;
import X.C11JF;
import X.C1322200kVm;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C919310a1x;
import X.C953230auf;
import X.C955430ayD;
import X.C955500ayK;
import X.C973890bRz;
import X.InterfaceC952800aty;
import X.InterfaceC952860au4;
import X.InterfaceC952880au6;
import X.InterfaceC953300aum;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes16.dex */
public class AfS34S1000000_15 implements C09JN {
    public final int $t;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public AfS34S1000000_15(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS34S1000000_15 afS34S1000000_15, Object obj) {
        C1C7U.LIZ("MultiGuestV3GuestPresenter@ae69.detachView$2$1");
        C1322200kVm.LIZ().LJ(UriProtector.parse(afS34S1000000_15.s0));
        C1C7U.LIZIZ("MultiGuestV3GuestPresenter@ae69.detachView$2$1");
    }

    public static final void accept$1(AfS34S1000000_15 afS34S1000000_15, Object obj) {
        InterfaceC953300aum interfaceC953300aum;
        C1C7U.LIZ("TemplateManager@b4e9.cancelUseTemplate$4");
        C20441214yg.LJIIIZ("TemplateManager_noticeboard", "cancelUseTemplate success");
        InterfaceC952800aty interfaceC952800aty = C953230auf.LJI.get(afS34S1000000_15.s0);
        if ((interfaceC952800aty instanceof InterfaceC953300aum) && (interfaceC953300aum = (InterfaceC953300aum) interfaceC952800aty) != null) {
            interfaceC953300aum.onCancelSuccess();
        }
        C1C7U.LIZIZ("TemplateManager@b4e9.cancelUseTemplate$4");
    }

    public static final void accept$2(AfS34S1000000_15 afS34S1000000_15, Object obj) {
        InterfaceC952880au6 interfaceC952880au6;
        C1C7U.LIZ("TemplateManager@b4e9.fetchTemplateList$4");
        Throwable th = (Throwable) obj;
        InterfaceC952800aty interfaceC952800aty = C953230auf.LJI.get(afS34S1000000_15.s0);
        if ((interfaceC952800aty instanceof InterfaceC952880au6) && (interfaceC952880au6 = (InterfaceC952880au6) interfaceC952800aty) != null) {
            interfaceC952880au6.LIZ(th);
        }
        C1C7U.LIZIZ("TemplateManager@b4e9.fetchTemplateList$4");
    }

    public static final void accept$3(AfS34S1000000_15 afS34S1000000_15, Object obj) {
        InterfaceC952860au4 interfaceC952860au4;
        C1C7U.LIZ("TemplateManager@b4e9.uploadToCloudAndUpdateTemplate$4");
        Throwable th = (Throwable) obj;
        InterfaceC952800aty interfaceC952800aty = C953230auf.LJI.get(afS34S1000000_15.s0);
        if ((interfaceC952800aty instanceof InterfaceC952860au4) && (interfaceC952860au4 = (InterfaceC952860au4) interfaceC952800aty) != null) {
            interfaceC952860au4.LIZ(th);
        }
        C1C7U.LIZIZ("TemplateManager@b4e9.uploadToCloudAndUpdateTemplate$4");
    }

    public static final void accept$4(AfS34S1000000_15 afS34S1000000_15, Object obj) {
        C1C7U.LIZ("MultiGuestSharedBgAnchorViewModel@72.clearSharedBgInSettings$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearSharedBgInSettings ");
        sbLIZ.append(afS34S1000000_15.s0);
        sbLIZ.append(" success, statusCode = ");
        sbLIZ.append(((BaseResponse) obj).statusCode);
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiGuestSharedBgAnchorViewModel@72.clearSharedBgInSettings$1");
    }

    public static final void accept$5(AfS34S1000000_15 afS34S1000000_15, Object obj) {
        C1C7U.LIZ("MultiGuestSharedBgAnchorViewModel@72.clearSharedBgInSettings$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearSharedBgInSettings ");
        sbLIZ.append(afS34S1000000_15.s0);
        sbLIZ.append(" fail");
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiGuestSharedBgAnchorViewModel@72.clearSharedBgInSettings$2");
    }

    public static final void accept$6(AfS34S1000000_15 afS34S1000000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostMonitorHelper@ec80.startSeiReceiveCountDown$1");
        C955500ayK c955500ayK = new C955500ayK();
        c955500ayK.LJIIL(afS34S1000000_15.s0, Scene.SCENE_SERVICE, true);
        c955500ayK.LJIIL(Integer.valueOf(C915980Zwa.LJII().LLILZLL(true).size()), "linked_count", true);
        c955500ayK.LJIIL(Long.valueOf(C973890bRz.LIZ.LJLIIIL()), "battle_id", true);
        c955500ayK.LJIJJLI("sei_missing");
        C11JF c11jf = C955430ayD.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
            C955430ayD.LIZ = null;
        }
        C1C7U.LIZIZ("MultiCoHostMonitorHelper@ec80.startSeiReceiveCountDown$1");
    }
}
