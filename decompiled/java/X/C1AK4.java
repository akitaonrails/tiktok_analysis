package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1AK4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AK4 {
    public Context LIZ;
    public ArrayList<C1AKD> LIZIZ;
    public final Object LIZJ = new Object();

    public final void LIZ() {
        synchronized (this.LIZJ) {
            try {
                if (this.LIZIZ == null) {
                    this.LIZIZ = new ArrayList<>();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        this.LIZIZ.add(new C1AKD() { // from class: X.1AK7
            @Override // X.C1AKD
            public final String LIZ() {
                return C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
            }

            {
                this.LIZ = "webcast_language";
            }
        });
        this.LIZIZ.add(new C1AKD() { // from class: X.1AK8
            @Override // X.C1AKD
            public final String LIZ() {
                return C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
            }

            {
                this.LIZ = "webcast_locale";
            }
        });
        this.LIZIZ.add(new C1AKD() { // from class: X.1AK5
            public String LIZIZ;

            @Override // X.C1AKD
            public final String LIZ() {
                try {
                    if (this.LIZIZ == null) {
                        this.LIZIZ = String.valueOf(C786410Ut5.Y3(this.LIZJ.LIZ.getPackageManager(), this.LIZJ.LIZ.getPackageName(), 0).versionName);
                    }
                    return this.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return "";
                }
            }

            {
                this.LIZ = "webcast_client_version";
            }
        });
        this.LIZIZ.add(new C1AKD() { // from class: X.1AK9
            {
                this.LIZ = "webcast_sdk_version";
            }

            @Override // X.C1AKD
            public final String LIZ() {
                return C465680INy.LIZ();
            }
        });
    }
}
