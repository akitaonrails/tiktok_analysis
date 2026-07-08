package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321360kUQ implements InterfaceC1321370kUR {
    public volatile C1320820kTY LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ C1320860kTc LIZJ = null;

    public final C1320820kTY LIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = new C1320820kTY(this.LIZIZ, this.LIZJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }

    public C1321360kUQ(Context context) {
        this.LIZIZ = context;
    }
}
