package Y;

import X.C09JN;
import X.C1C7U;
import X.C497740JfY;
import X.C750030TbV;
import X.C759940TrU;
import X.C759990TrZ;
import X.C777840UfG;
import X.C778150Ufl;
import X.C778500UgK;
import X.C778610UgV;
import X.C778980Uh6;
import X.C779060UhE;
import X.EnumC778100Ufg;
import X.InterfaceC750020TbU;
import X.InterfaceC760020Trc;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS0S0110200_12 implements C09JN {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public boolean z1;

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
        }
    }

    public static final void accept$0(AfS0S0110200_12 afS0S0110200_12, Object obj) {
        C1C7U.LIZ("GameSubGoalNotice@d2d3.onMessage$1$1");
        Long l = (Long) obj;
        if (afS0S0110200_12.z1) {
            C778980Uh6 c778980Uh6 = (C778980Uh6) afS0S0110200_12.l0;
            c778980Uh6.getClass();
            String strLJIJI = C497740JfY.LJIJI(2131842964);
            String strLJIJJ = C497740JfY.LJIJJ(2131843026, strLJIJI);
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LJII(new C778150Ufl("sub_goal", "sub_goal_completed", C779060UhE.LIZ(strLJIJJ, strLJIJI), (ImageModel) null, 24));
            } else {
                DataChannel dataChannel = c778980Uh6.LIZIZ;
                if (dataChannel != null) {
                    dataChannel.zW(TipMessageChannel.class, new C778500UgK(C779060UhE.LIZ(strLJIJJ, strLJIJI), EnumC778100Ufg.LIVE_TIP_GAMING_SUB_GOAL.ordinal(), new C778610UgV("sub_goal_completed", null, -15686971, 2), 8));
                }
            }
        } else {
            long j = afS0S0110200_12.j2;
            if (l != null && l.longValue() == j) {
                ((C778980Uh6) afS0S0110200_12.l0).LIZJ(80);
            } else {
                long j2 = afS0S0110200_12.j3;
                if (l != null && l.longValue() == j2) {
                    ((C778980Uh6) afS0S0110200_12.l0).LIZJ(50);
                }
            }
        }
        C1C7U.LIZIZ("GameSubGoalNotice@d2d3.onMessage$1$1");
    }

    public static final void accept$1(AfS0S0110200_12 afS0S0110200_12, Object obj) {
        Exception exc;
        C1C7U.LIZ("KickOutManager@53a9.kickOut$2");
        Throwable th = (Throwable) obj;
        InterfaceC750020TbU interfaceC750020TbU = (InterfaceC750020TbU) ((WeakReference) afS0S0110200_12.l0).get();
        if (interfaceC750020TbU != null) {
            boolean z = afS0S0110200_12.z1;
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC750020TbU.e0(z, exc);
        }
        C750030TbV.LIZ(afS0S0110200_12.z1, afS0S0110200_12.j2, afS0S0110200_12.j3, th);
        C1C7U.LIZIZ("KickOutManager@53a9.kickOut$2");
    }

    public static final void accept$2(AfS0S0110200_12 afS0S0110200_12, Object obj) {
        Exception exc;
        C1C7U.LIZ("KickOutManager@53a9.kickOut$4");
        Throwable th = (Throwable) obj;
        InterfaceC750020TbU interfaceC750020TbU = (InterfaceC750020TbU) ((WeakReference) afS0S0110200_12.l0).get();
        if (interfaceC750020TbU != null) {
            boolean z = afS0S0110200_12.z1;
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC750020TbU.e0(z, exc);
        }
        C750030TbV.LIZ(afS0S0110200_12.z1, afS0S0110200_12.j2, afS0S0110200_12.j3, th);
        C1C7U.LIZIZ("KickOutManager@53a9.kickOut$4");
    }

    public static final void accept$3(AfS0S0110200_12 afS0S0110200_12, Object obj) {
        C1C7U.LIZ("ReportViolationStatusManager@9edc.fetchViolationDataFromApi$1");
        ViolationStatusResponse.ResponseData responseData = ((ViolationStatusResponse) obj).data;
        if (responseData != null) {
            long j = afS0S0110200_12.j2;
            long j2 = afS0S0110200_12.j3;
            boolean z = afS0S0110200_12.z1;
            InterfaceC760020Trc interfaceC760020Trc = (InterfaceC760020Trc) afS0S0110200_12.l0;
            C759990TrZ c759990TrZ = new C759990TrZ(responseData.status, responseData, j, j2);
            if (z) {
                C759940TrU.LIZ = c759990TrZ;
            }
            interfaceC760020Trc.LIZ(c759990TrZ, false);
        } else {
            ((InterfaceC760020Trc) afS0S0110200_12.l0).LIZ(null, false);
        }
        C1C7U.LIZIZ("ReportViolationStatusManager@9edc.fetchViolationDataFromApi$1");
    }

    public AfS0S0110200_12(long j, long j2, Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.j3 = j2;
        this.z1 = z;
    }
}
