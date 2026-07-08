package X;

import com.bytedance.android.livesdk.gift.model.GiftConfigInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import kotlin.jvm.internal.AwS31S0100001_20;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142270fpZ implements InterfaceC2247071CxF {
    public long LIZ;
    public AudioDeviceModule.AudioRenderSink LIZIZ;
    public final Object LIZJ = new Object();

    public static AbstractC1273900jFs LIZLLL() {
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null) {
            return interfaceC769940UIe.getLiveCore();
        }
        return null;
    }

    @Override // X.InterfaceC2247071CxF
    public final void LIZ() {
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 383);
        synchronized (this.LIZJ) {
            try {
                awS561S0100000_17.invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2247071CxF
    public final boolean LIZJ() {
        return LIZLLL() != null;
    }

    public static float LJ(float f) {
        String str;
        if (!C1128450fTH.LJJII(UserService.getInstance().user().getCurrentUserId())) {
            GiftConfigInfo.RoleConfig roleConfig = C1133150far.LIZ;
            if (roleConfig != null) {
                str = roleConfig.anchor;
            } else {
                str = null;
            }
            int iLIZ = C1133150far.LIZ(str);
            if (iLIZ != -1 && iLIZ != 0) {
                return (float) Math.pow(10.0d, ((double) iLIZ) / 20.0d);
            }
            return 1.0f;
        }
        return f;
    }

    @Override // X.InterfaceC2247071CxF
    public final long LIZIZ(float f) {
        Object objInvoke;
        AwS31S0100001_20 awS31S0100001_20 = new AwS31S0100001_20(this, f, 1);
        synchronized (this.LIZJ) {
            try {
                objInvoke = awS31S0100001_20.invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return ((Number) objInvoke).longValue();
    }
}
