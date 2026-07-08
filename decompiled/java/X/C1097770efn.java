package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: renamed from: X.0efn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097770efn implements InterfaceC1097760efm {
    public static final C1097770efn LL = new C1097770efn();
    public static InterfaceC1097760efm LLILLJJLI;

    @Override // X.InterfaceC1097760efm
    public final void Eq(DataChannel dataChannel, InterfaceC1107760evu interfaceC1107760evu) {
        InterfaceC1097760efm interfaceC1097760efm = LLILLJJLI;
        if (interfaceC1097760efm != null) {
            interfaceC1097760efm.Eq(dataChannel, interfaceC1107760evu);
        }
    }

    @Override // X.InterfaceC1097760efm
    public final C1096660ee0 LIZJ(DataChannel dataChannel, List<C1107810evz> list) {
        C1096660ee0 c1096660ee0LIZJ;
        InterfaceC1097760efm interfaceC1097760efm = LLILLJJLI;
        if (interfaceC1097760efm == null || (c1096660ee0LIZJ = interfaceC1097760efm.LIZJ(dataChannel, list)) == null) {
            return new C1096660ee0(true, 2);
        }
        return c1096660ee0LIZJ;
    }

    @Override // X.InterfaceC1097760efm
    public final C1096660ee0 LIZLLL(DataChannel dataChannel, List<C1107810evz> list) {
        C1096660ee0 c1096660ee0LIZLLL;
        InterfaceC1097760efm interfaceC1097760efm = LLILLJJLI;
        if (interfaceC1097760efm == null || (c1096660ee0LIZLLL = interfaceC1097760efm.LIZLLL(dataChannel, list)) == null) {
            return new C1096660ee0(false, 3);
        }
        return c1096660ee0LIZLLL;
    }

    @Override // X.InterfaceC1097760efm
    public final C1107780evw LJ(DataChannel dataChannel, C1107810evz c1107810evz) {
        InterfaceC1097760efm interfaceC1097760efm = LLILLJJLI;
        if (interfaceC1097760efm != null) {
            return interfaceC1097760efm.LJ(dataChannel, c1107810evz);
        }
        return null;
    }

    @Override // X.InterfaceC1097760efm
    public final List<C1102210emx> LJII(DataChannel dataChannel, List<String> list) {
        InterfaceC1097760efm interfaceC1097760efm = LLILLJJLI;
        if (interfaceC1097760efm != null) {
            return interfaceC1097760efm.LJII(dataChannel, list);
        }
        return null;
    }

    @Override // X.InterfaceC1097760efm
    public final void LJFF(DataChannel dataChannel, List<String> list, InterfaceC1107760evu interfaceC1107760evu, String str, LifecycleOwner lifecycleOwner, boolean z) {
        InterfaceC1097760efm interfaceC1097760efm = LLILLJJLI;
        if (interfaceC1097760efm != null) {
            interfaceC1097760efm.LJFF(dataChannel, list, interfaceC1107760evu, str, lifecycleOwner, z);
        }
    }

    @Override // X.InterfaceC1097760efm
    public final void sf(DataChannel dataChannel, List<C1107810evz> list, InterfaceC1107760evu interfaceC1107760evu, String str, LifecycleOwner lifecycleOwner, boolean z) {
        InterfaceC1097760efm interfaceC1097760efm = LLILLJJLI;
        if (interfaceC1097760efm != null) {
            interfaceC1097760efm.sf(dataChannel, list, interfaceC1107760evu, str, lifecycleOwner, z);
        }
    }
}
