package X;

import android.content.SharedPreferences;
import android.os.Process;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0V9C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9C {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final C0V9F LIZIZ;
    public final C0V9H LIZJ;
    public SharedPreferences LIZLLL;
    public C0V7R LJ;
    public final C0VA1 LJFF;

    public final void LIZ() {
        Map<String, ?> all = this.LIZLLL.getAll();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                try {
                    String key = entry.getKey();
                    String str = ((String) entry.getValue()).split(",")[0];
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("/proc/");
                    sbLIZ.append(str);
                    sbLIZ.append("/stat");
                    String line = "";
                    BufferedReader bufferedReader = null;
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new C0VSF(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).getPath()), 100);
                        try {
                            line = bufferedReader2.readLine();
                            bufferedReader2.close();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (line.isEmpty()) {
                        this.LIZLLL.edit().remove(key).apply();
                    } else {
                        String str2 = line.split(" ")[1];
                        if (!key.endsWith(str2.substring(1, str2.length() - 1))) {
                            this.LIZLLL.edit().remove(key).apply();
                        }
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
        }
    }

    public final boolean LIZIZ() {
        boolean z;
        if (this.LJ.isForeground()) {
            SharedPreferences.Editor editorEdit = this.LIZLLL.edit();
            String strLJ = C792420V6q.LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Process.myPid());
            sbLIZ.append(",");
            sbLIZ.append(this.LJ.isForeground());
            editorEdit.putString(strLJ, C2188811AlT.LIZIZ(sbLIZ)).apply();
            return true;
        }
        Map<String, ?> all = this.LIZLLL.getAll();
        if (all != null) {
            Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
            while (it2.hasNext()) {
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (((String) it2.next().getValue()).split(",")[1].equals("true")) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
        int i = C0V9E.LIZ;
        c791560V3iLIZLLL.getClass();
        C0V9D c0v9dValueOf = C0V9D.valueOf(MonitorJni.getProcCGroup(i));
        return z || this.LJ.isForeground() || c0v9dValueOf == C0V9D.TOP_APP || c0v9dValueOf == C0V9D.FOREGROUND;
    }

    public C0V9C() {
        try {
            this.LJFF = C0VAA.LIZ(C792400V6o.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C0V9H c0v9h = new C0V9H(this.LJFF);
        this.LIZJ = c0v9h;
        this.LIZIZ = new C0V9F(c0v9h, this.LJFF);
    }
}
