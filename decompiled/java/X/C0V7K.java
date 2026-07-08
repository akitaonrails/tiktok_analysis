package X;

import android.os.Process;
import com.bytedance.scene.Scene;
import com.bytedance.services.apm.api.IFdCheck;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V7K {
    public static final C0V7K LJI = new C0V7K();
    public C0V7C LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public C0V7N LJ;
    public IFdCheck LJFF;

    public final synchronized void LIZ() {
        C0V7C c0v7c;
        if (!this.LIZLLL || (c0v7c = this.LIZ) == null || !c0v7c.LIZJ || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C792490V6x c792490V6xLIZ = C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT);
        final long j = this.LIZ.LIZIZ;
        c792490V6xLIZ.LIZJ(new AbstractRunnableC792500V6y(j) { // from class: X.0V7L
            public final void LIZ() {
                C0V7K c0v7k = this.LLILZ;
                if (c0v7k.LIZ != null) {
                    C0V7R c0v7r = (C0V7R) C792590V7h.LIZ(C0V7R.class);
                    int length = 0;
                    boolean zIsForeground = c0v7r != null ? c0v7r.isForeground() : false;
                    int iMyPid = Process.myPid();
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("/proc/");
                        sbLIZ.append(iMyPid);
                        sbLIZ.append("/fd");
                        length = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).listFiles().length;
                        if (length > 0 && length < c0v7k.LIZ.LIZ) {
                            C0VBB.LIZ(new AbstractC792370V6l(length, zIsForeground, null) { // from class: X.0V6m
                                public final int LIZJ;
                                public final List<String> LIZLLL;
                                public final boolean LJ;

                                @Override // X.C0VB5
                                public final boolean LIZIZ() {
                                    return false;
                                }

                                @Override // X.AbstractC792370V6l
                                public final JSONObject LJ() {
                                    return null;
                                }

                                @Override // X.AbstractC792370V6l
                                public final String LJI() {
                                    return "fd";
                                }

                                @Override // X.C0VB5
                                public final boolean isValid() {
                                    return true;
                                }

                                @Override // X.AbstractC792370V6l
                                public final JSONObject LIZJ() {
                                    String string;
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("fd_count", this.LIZJ);
                                        if (!C08GN.LIZIZ(this.LIZLLL)) {
                                            List<String> list = this.LIZLLL;
                                            if (list == null) {
                                                string = null;
                                            } else {
                                                StringBuilder sb = new StringBuilder();
                                                boolean z = true;
                                                for (String str : list) {
                                                    if (z) {
                                                        z = false;
                                                    } else {
                                                        sb.append("\n");
                                                    }
                                                    sb.append(str.toString());
                                                }
                                                string = sb.toString();
                                            }
                                            jSONObject.put("fd_detail", string);
                                            return jSONObject;
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    return jSONObject;
                                }

                                @Override // X.AbstractC792370V6l
                                public final JSONObject LIZLLL() {
                                    JSONObject jSONObject;
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put(Scene.SCENE_SERVICE, C2257208ss.LIZ().LJ());
                                        jSONObject.put("process_name", C792420V6q.LJ());
                                        jSONObject.put("is_main_process", C792420V6q.LJIILJJIL());
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        jSONObject = null;
                                    }
                                    if (jSONObject == null) {
                                        try {
                                            jSONObject = new JSONObject();
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            return jSONObject;
                                        }
                                    }
                                    jSONObject.put("is_front", this.LJ);
                                    return jSONObject;
                                }

                                @Override // X.AbstractC792370V6l
                                public final JSONObject LJFF() {
                                    return C2257208ss.LIZ().LIZIZ();
                                }

                                {
                                    this.LIZJ = length;
                                    this.LIZLLL = list;
                                    this.LJ = zIsForeground;
                                }
                            });
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (c0v7k.LJFF == null) {
                        c0v7k.LJFF = (IFdCheck) C792600V7i.LIZ(IFdCheck.class);
                    }
                    IFdCheck iFdCheck = c0v7k.LJFF;
                    if (iFdCheck != null) {
                        C0VBB.LIZ(new AbstractC792370V6l(length, zIsForeground, iFdCheck.getFdList()) { // from class: X.0V6m
                            public final int LIZJ;
                            public final List<String> LIZLLL;
                            public final boolean LJ;

                            @Override // X.C0VB5
                            public final boolean LIZIZ() {
                                return false;
                            }

                            @Override // X.AbstractC792370V6l
                            public final JSONObject LJ() {
                                return null;
                            }

                            @Override // X.AbstractC792370V6l
                            public final String LJI() {
                                return "fd";
                            }

                            @Override // X.C0VB5
                            public final boolean isValid() {
                                return true;
                            }

                            @Override // X.AbstractC792370V6l
                            public final JSONObject LIZJ() {
                                String string;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("fd_count", this.LIZJ);
                                    if (!C08GN.LIZIZ(this.LIZLLL)) {
                                        List<String> list = this.LIZLLL;
                                        if (list == null) {
                                            string = null;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            boolean z = true;
                                            for (String str : list) {
                                                if (z) {
                                                    z = false;
                                                } else {
                                                    sb.append("\n");
                                                }
                                                sb.append(str.toString());
                                            }
                                            string = sb.toString();
                                        }
                                        jSONObject.put("fd_detail", string);
                                        return jSONObject;
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                return jSONObject;
                            }

                            @Override // X.AbstractC792370V6l
                            public final JSONObject LIZLLL() {
                                JSONObject jSONObject;
                                try {
                                    jSONObject = new JSONObject();
                                    jSONObject.put(Scene.SCENE_SERVICE, C2257208ss.LIZ().LJ());
                                    jSONObject.put("process_name", C792420V6q.LJ());
                                    jSONObject.put("is_main_process", C792420V6q.LJIILJJIL());
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    jSONObject = null;
                                }
                                if (jSONObject == null) {
                                    try {
                                        jSONObject = new JSONObject();
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        return jSONObject;
                                    }
                                }
                                jSONObject.put("is_front", this.LJ);
                                return jSONObject;
                            }

                            @Override // X.AbstractC792370V6l
                            public final JSONObject LJFF() {
                                return C2257208ss.LIZ().LIZIZ();
                            }

                            {
                                this.LIZJ = length;
                                this.LIZLLL = list;
                                this.LJ = zIsForeground;
                            }
                        });
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FdCollector@6f70.start$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FdCollector@6f70.start$1");
            }
        });
    }

    public final synchronized void LIZIZ(C0V7C c0v7c) {
        if (c0v7c == null) {
            return;
        }
        this.LIZ = c0v7c;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateConfig:");
            sbLIZ.append(c0v7c);
            C792910V8n.LIZ("APM-FD", C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZ();
    }
}
