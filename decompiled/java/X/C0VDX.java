package X;

import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDX extends C0VDO implements InterfaceC794170VDj {
    public C0VSJ LIZIZ;
    public long LIZJ;

    @Override // X.C0VDO
    public final String LJFF() {
        return "heap_oom";
    }

    @Override // X.InterfaceC794170VDj
    public final List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList(1);
        C0VSJ c0vsj = this.LIZIZ;
        if (c0vsj != null) {
            arrayList.add(c0vsj.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // X.C0VDO
    public final boolean LJI(C0VDC c0vdc) throws Throwable {
        JSONObject jSONObject = new JSONObject(c0vdc.LIZ);
        if (C0VDO.LJ(jSONObject, c0vdc)) {
            return true;
        }
        if (System.currentTimeMillis() - this.LIZJ < 300000) {
            return false;
        }
        this.LIZJ = System.currentTimeMillis();
        boolean zOptBoolean = jSONObject.optBoolean("isTryToCatch", false);
        String str = C0VDB.LJIIJ;
        String str2 = "本地未设置dumpFileName";
        if (TextUtils.isEmpty(str)) {
            C0VDO.LJII("本地未设置dumpFileName", c0vdc);
            return true;
        }
        if (zOptBoolean) {
            try {
                Debug.dumpHprofData(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!TextUtils.isEmpty(str)) {
            str2 = null;
        }
        if (!c0vsj.exists()) {
            str2 = "dumpFile不存在";
        }
        if (!TextUtils.isEmpty(str2)) {
            C0VDO.LJII(str2, c0vdc);
            return true;
        }
        this.LIZIZ = c0vsj;
        C794090VDb c794090VDb = new C794090VDb("log_heap_oom", c0vdc.LIZJ, this);
        c794090VDb.LJIIJ = true;
        C0VDW.LIZIZ(c794090VDb);
        return true;
    }
}
