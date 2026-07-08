package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20008613Qm {
    public final Object LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final ArrayList<String> LIZLLL = C1697810uHb.LJ("tt_face_extra");

    public final boolean LIZ(String str) {
        boolean z = false;
        try {
            if (LJ(str)) {
                return false;
            }
            try {
                C20008813Qo c20008813QoLIZJ = LIZJ(str);
                if (c20008813QoLIZJ != null) {
                    z = true;
                    C13SB.LIZIZ(c20008813QoLIZJ);
                }
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public final List<String> LIZIZ(String str) {
        Object obj = this.LIZ;
        List<String> listLLIIII = null;
        if (!(obj instanceof Context)) {
            return null;
        }
        try {
            String[] list = C786410Ut5.N3((Context) obj).getAssets().list(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : list) {
                    if (!LJ(str2)) {
                        arrayList.add(str2);
                    }
                }
                listLLIIII = C13LP.LLIIII(arrayList);
                return listLLIIII;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error in list file: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("effect_platform", strLIZIZ, e);
        }
        return listLLIIII;
    }

    public final C20008813Qo LIZJ(String str) {
        if (!(this.LIZ instanceof Context) || LJ(str)) {
            return null;
        }
        AssetManager assets = C786410Ut5.N3((Context) this.LIZ).getAssets();
        String strLIZLLL = C20006413Pq.LIZLLL(str);
        if (this.LIZIZ != null && new Regex(this.LIZIZ).matches(strLIZLLL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" manually excluded by DownloadableModelSupport.exclusionPattern");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C20008813Qo c20008813Qo = new C20008813Qo();
        c20008813Qo.LIZ = assets.open(str, 2);
        return c20008813Qo;
    }

    public final String LIZLLL(String str) throws Throwable {
        if (!(this.LIZ instanceof Context) || LJ(str)) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C786410Ut5.N3((Context) this.LIZ).getAssets().open(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        String string = sb.toString();
                        C2107108Nh.LIZ(bufferedReader, null);
                        return string;
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(bufferedReader, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AssetUtils#loadJson::jsonFilePath=");
            sbLIZ.append(str);
            sbLIZ.append(", file not exists");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("effect_platform", strLIZIZ);
            return null;
        }
    }

    public final boolean LJ(String str) {
        int iLJJJJ;
        if (this.LIZJ && (iLJJJJ = a0.LJJJJ(str, '/', 0, 6) + 1) < str.length()) {
            String strLIZLLL = C20006413Pq.LIZLLL(str.substring(iLJJJJ));
            if (this.LIZLLL.contains(strLIZLLL)) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore built in model: ");
                sbLIZ.append(strLIZLLL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("JKL", strLIZIZ);
                return true;
            }
        }
        return false;
    }

    public C20008613Qm(Object obj, String str, boolean z) {
        this.LIZ = obj;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
