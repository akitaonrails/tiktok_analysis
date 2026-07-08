package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199381B6a implements InterfaceC2199481B6k {
    public final /* synthetic */ InterfaceC2199401B6c LIZ;

    public C2199381B6a(InterfaceC2199401B6c interfaceC2199401B6c) {
        this.LIZ = interfaceC2199401B6c;
    }

    public final boolean LIZ(long j, long j2, InterfaceC2199451B6h interfaceC2199451B6h) {
        BinderC2199411B6d binderC2199411B6d;
        try {
            InterfaceC2199401B6c interfaceC2199401B6c = this.LIZ;
            if (interfaceC2199451B6h == null) {
                binderC2199411B6d = null;
            } else {
                binderC2199411B6d = new BinderC2199411B6d(interfaceC2199451B6h);
            }
            return interfaceC2199401B6c.I0(j, j2, binderC2199411B6d);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
