package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141290fnz {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final C1140920fnO LIZ() {
        C1140920fnO c1140920fnO = (C1140920fnO) C2043807zY.LIZ(C1140920fnO.class);
        return c1140920fnO == null ? new C1140920fnO(new C1140930fnP()) : c1140920fnO;
    }

    public static final InterfaceC1141280fny LIZIZ() {
        return (InterfaceC1141280fny) C2043807zY.LIZ(InterfaceC1141280fny.class);
    }

    public static final InterfaceC1141680foc LIZJ() {
        InterfaceC1141680foc interfaceC1141680foc = (InterfaceC1141680foc) C2043807zY.LIZ(InterfaceC1141680foc.class);
        return interfaceC1141680foc == null ? new InterfaceC1141680foc() { // from class: X.0foJ
            @Override // X.InterfaceC1141680foc
            public final long currentTimeMillis() {
                return System.currentTimeMillis();
            }
        } : interfaceC1141680foc;
    }

    public static final Long LIZLLL() {
        InterfaceC1141280fny interfaceC1141280fnyLIZIZ = LIZIZ();
        if (interfaceC1141280fnyLIZIZ != null) {
            return Long.valueOf(interfaceC1141280fnyLIZIZ.getUserId());
        }
        return null;
    }

    public static final boolean LJ() {
        C1141610foV roomInfo;
        Long lLIZLLL = LIZLLL();
        InterfaceC1141280fny interfaceC1141280fnyLIZIZ = LIZIZ();
        Long lValueOf = null;
        if (interfaceC1141280fnyLIZIZ != null && (roomInfo = interfaceC1141280fnyLIZIZ.getRoomInfo()) != null) {
            lValueOf = Long.valueOf(roomInfo.LIZ);
        }
        return Intrinsics.LJFF(lLIZLLL, lValueOf);
    }

    public static final void LJFF(Function0<Unit> function0) {
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS106S0100000_6((Function0) function0, 182));
        } else {
            function0.invoke();
        }
    }
}
