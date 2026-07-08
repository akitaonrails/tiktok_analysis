package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B6Z extends C1B6T {
    public final /* synthetic */ InterfaceC2199481B6k LLILLJJLI;

    public C1B6Z(InterfaceC2199481B6k interfaceC2199481B6k) {
        this.LLILLJJLI = interfaceC2199481B6k;
    }

    @Override // X.InterfaceC2199401B6c
    public final boolean I0(long j, long j2, final InterfaceC2199421B6e interfaceC2199421B6e) {
        InterfaceC2199451B6h interfaceC2199451B6h;
        InterfaceC2199481B6k interfaceC2199481B6k = this.LLILLJJLI;
        if (interfaceC2199421B6e == null) {
            interfaceC2199451B6h = null;
        } else {
            interfaceC2199451B6h = new InterfaceC2199451B6h() { // from class: X.1B6b
                @Override // X.InterfaceC2199451B6h
                public final void LJJJLZIJ() {
                    try {
                        interfaceC2199421B6e.LJJJLZIJ();
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            };
        }
        return ((C2199381B6a) interfaceC2199481B6k).LIZ(j, j2, interfaceC2199451B6h);
    }
}
