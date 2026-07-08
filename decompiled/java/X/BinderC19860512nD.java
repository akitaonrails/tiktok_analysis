package X;

import android.net.Uri;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12nD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class BinderC19860512nD extends AbstractBinderC19860312nB {
    public final /* synthetic */ InterfaceC19860712nF LLILLJJLI;

    public BinderC19860512nD(InterfaceC19860712nF interfaceC19860712nF) {
        this.LLILLJJLI = interfaceC19860712nF;
    }

    @Override // X.InterfaceC19860412nC
    public final Uri LLLLLIL(String str, String str2) {
        C19860612nE c19860612nE = (C19860612nE) this.LLILLJJLI;
        c19860612nE.getClass();
        try {
            return c19860612nE.LIZ.LLLLLIL(str, str2);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
