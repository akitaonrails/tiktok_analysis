package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.13Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20017613Ty {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C20013313Sh LIZ;

    public static Object LIZ(String str, Type type) {
        if (C123100dR.LIZ(str)) {
            try {
                C1227904rF.LIZ.getClass();
                return C1227904rF.LIZJ(str, type);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error: Convert string to response: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
                return null;
            }
        }
        return null;
    }

    public C20017613Ty(int i, long j, long j2, Context context) {
        C20013313Sh c20013313Sh;
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new InterfaceC586170Myt() { // from class: X.13Si
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i2, boolean z, int i3, User user) {
                if (i2 != 2 && i2 != 3) {
                    return;
                }
                C20013313Sh c20013313Sh2 = this.LL.LIZ;
                ReentrantLock reentrantLock = c20013313Sh2.LJ;
                reentrantLock.lock();
                try {
                    try {
                        c20013313Sh2.LIZIZ.LIZJ();
                        C2137908Zd.LIZJ.LIZLLL(C20013313Sh.LIZLLL(c20013313Sh2.LIZ).getAbsolutePath());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                    throw th;
                }
            }
        });
        if (j != 0 && j2 != 0) {
            c20013313Sh = new C20013313Sh(i, j, j2, context);
        } else {
            c20013313Sh = new C20013313Sh(i, 100L, 200L, context);
        }
        this.LIZ = c20013313Sh;
    }
}
