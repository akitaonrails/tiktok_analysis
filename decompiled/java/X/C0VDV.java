package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDV extends C0VDO implements InterfaceC794170VDj {
    public C0VSJ LIZIZ;
    public volatile boolean LIZJ;

    @Override // X.C0VDO
    public final String LJFF() {
        return "db";
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
        C0VSJ c0vsjLIZ = null;
        if (this.LIZJ) {
            C794080VDa c794080VDa = new C794080VDa(c0vdc.LIZJ, null);
            c794080VDa.LIZLLL = 0;
            c794080VDa.LJ = "数据库文件正在处理中";
            C0VDW.LIZJ(c794080VDa);
            return true;
        }
        this.LIZJ = true;
        try {
            String strOptString = jSONObject.optString("db_name", "");
            C0VDB.LIZIZ().getClass();
            c0vsjLIZ = C2120308Sj.LIZ(C0VDB.LJFF, strOptString);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LIZJ = false;
        if (c0vsjLIZ == null) {
            C0VDO.LJII("Sqlite文件拷贝失败", c0vdc);
            return true;
        }
        this.LIZIZ = c0vsjLIZ;
        C794090VDb c794090VDb = new C794090VDb(jSONObject.optString("fileContentType", "default_db_file_type"), c0vdc.LIZJ, this);
        c794090VDb.LJIIJ = false;
        c794090VDb.LJIIL = true;
        C0VDW.LIZIZ(c794090VDb);
        return true;
    }
}
