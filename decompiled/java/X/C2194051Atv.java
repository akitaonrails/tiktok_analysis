package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1Atv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194051Atv {
    public IESSettingsProxy LIZJ;
    public final Object LIZ = new Object();
    public final CopyOnWriteArrayList<InterfaceC2194071Atx> LIZIZ = new CopyOnWriteArrayList<>();
    public Gson LIZLLL = JsonParseUtils.LIZIZ().LIZ();

    public final void LIZ() {
        synchronized (this.LIZ) {
            try {
                this.LIZJ = new IESSettingsProxy();
                for (InterfaceC2194071Atx interfaceC2194071Atx : this.LIZIZ) {
                    interfaceC2194071Atx.LIZ(this.LIZJ);
                    if (interfaceC2194071Atx instanceof C2194061Atw) {
                        this.LIZIZ.remove(interfaceC2194071Atx);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C2194051Atv() {
        LIZ();
    }
}
