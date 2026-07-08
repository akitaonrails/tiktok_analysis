package X;

import android.text.TextUtils;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V70, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V70 {
    public static volatile C0V70 LJII;
    public volatile boolean LIZ;
    public List<C0V73> LIZIZ;
    public volatile JSONObject LIZJ;
    public volatile boolean LIZLLL;
    public C792510V6z LJ;
    public IConfigManager LJFF;
    public C0V72 LJI;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0V6z] */
    public final synchronized void LIZIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        if (C792420V6q.LJIILJJIL()) {
            this.LJ = new AbstractRunnableC792500V6y() { // from class: X.0V6z
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ConfigManager@4b73.init$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ConfigManager@4b73.init$1");
                }

                public final void LIZ() {
                    if (TextUtils.isEmpty(C792420V6q.LJFF())) {
                        C792910V8n.LIZ("APM-Config", "DeviceId not ready. try again later.");
                        return;
                    }
                    if (this.LLILZ.LIZJ == null) {
                        if (C792190V5t.LIZ()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("DeviceId ready. initConfig with device_id=");
                            sbLIZ.append(C792420V6q.LJFF());
                            C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        C0V70 c0v70 = this.LLILZ;
                        if (c0v70.LJFF == null) {
                            c0v70.LJFF = (IConfigManager) C792600V7i.LIZ(IConfigManager.class);
                        }
                        IConfigManager iConfigManager = c0v70.LJFF;
                        if (iConfigManager != null) {
                            String strQueryConfig = iConfigManager.queryConfig();
                            if (C792190V5t.LIZ()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("initConfig:");
                                sbLIZ2.append(strQueryConfig);
                                C792910V8n.LIZ("APM-Config", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            try {
                                if (!TextUtils.isEmpty(strQueryConfig)) {
                                    c0v70.LIZLLL(new JSONObject(strQueryConfig), true);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } else if (C792190V5t.LIZ()) {
                        C792910V8n.LIZ("APM-Config", "config is ready");
                    }
                    C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZIZ(this.LLILZ.LJ);
                }

                {
                    super(500L, 1000L);
                }
            };
            C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZJ(this.LJ);
        }
        IConfigManager iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class);
        this.LJFF = iConfigManager;
        iConfigManager.registerConfigListener(new C0V71(this));
    }

    public static C0V70 LIZ() {
        if (LJII == null) {
            synchronized (C0V70.class) {
                try {
                    if (LJII == null) {
                        LJII = new C0V70();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public final void LIZJ(C0V73 c0v73) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new CopyOnWriteArrayList();
        }
        if (!((CopyOnWriteArrayList) this.LIZIZ).contains(c0v73)) {
            ((CopyOnWriteArrayList) this.LIZIZ).add(c0v73);
        }
        if (this.LIZLLL) {
            c0v73.LIZ(this.LIZJ);
        }
    }

    public final void LIZLLL(JSONObject jSONObject, boolean z) {
        if (C792450V6t.LIZJ(jSONObject)) {
            return;
        }
        this.LIZJ = jSONObject;
        this.LIZLLL = true;
        List<C0V73> list = this.LIZIZ;
        if (list != null) {
            Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
            while (it2.hasNext()) {
                try {
                    ((C0V73) it2.next()).LIZ(jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }
}
