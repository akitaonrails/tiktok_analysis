package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangupP2EnableSetting;
import com.bytedance.android.livesdk.model.message.MultiGuestUpdateSkylightMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0Inu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477440Inu implements InterfaceC477620IoC {
    public final String LIZ = "WebcastMultiGuestUpdateSkylightMessage";

    @Override // X.InterfaceC477620IoC
    public final String getMethod() {
        return this.LIZ;
    }

    @Override // X.InterfaceC477620IoC
    public final void LIZ(byte[] bArr) {
        Object c098200Yq;
        C0IMD c0imdLJI;
        C1516680pZS c1516680pZS;
        MultiGuestUpdateSkylightMessage multiGuestUpdateSkylightMessage;
        if (!MultiGuestHangupP2EnableSetting.isEnable()) {
            C20441214yg.LIZIZ("MultiHangupApplyStatusUpdateHelper", "MultiGuestHangupP2EnableSetting is not enable");
            return;
        }
        try {
            C1515210pX5.LIZLLL().getClass();
            c0imdLJI = C1515210pX5.LJI(MultiGuestUpdateSkylightMessage.class);
            c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(new C1506330pIl(bArr));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (c0imdLJI != null && (multiGuestUpdateSkylightMessage = (MultiGuestUpdateSkylightMessage) c0imdLJI.LIZJ(c1516680pZS)) != null) {
            C176600m4.LIZJ(new AwS551S0100000_7(multiGuestUpdateSkylightMessage, 764));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C20441214yg.LIZIZ("legolas_im", "handle success");
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJFF("legolas_im", "handle error:", thM5exceptionOrNullimpl);
                return;
            }
            return;
        }
        C20441214yg.LJ("legolas_im", "handle decodeMsg failed, message is null");
    }
}
