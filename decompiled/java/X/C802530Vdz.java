package X;

import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802530Vdz extends AbstractC802520Vdy {
    public static JSONArray LJIIL(C0VSJ c0vsj) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : C08SE.LIZLLL(c0vsj.getAbsolutePath()).split("\n")) {
                String[] strArrSplit = str.split("\\s+");
                if (strArrSplit.length >= 6) {
                    JSONObject jSONObject = new JSONObject();
                    long j = CastLongProtector.parseLong(strArrSplit[1]);
                    long j2 = CastLongProtector.parseLong(strArrSplit[2]);
                    long j3 = CastLongProtector.parseLong(strArrSplit[3]);
                    long j4 = CastLongProtector.parseLong(strArrSplit[4]);
                    long j5 = j2 + j3;
                    jSONObject.put("so_name", strArrSplit[5]);
                    jSONObject.put("vm_size", CastLongProtector.parseLong(strArrSplit[1]));
                    jSONObject.put("rss", j5);
                    jSONObject.put("avg_vm", j / j4);
                    jSONObject.put("avg_rss", j5 / j4);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jSONArray;
    }

    public C802530Vdz(C802790VeP c802790VeP, C0VSJ c0vsj) {
        super(c802790VeP, c0vsj);
    }

    @Override // X.AbstractC802520Vdy
    public final void LJII(Map<String, String> map, C802900Vea c802900Vea) {
        Object obj;
        super.LJII(map, c802900Vea);
        HashMap map2 = (HashMap) map;
        String str = "true";
        map2.put("has_dump", "true");
        if (C802770VeN.LJI()) {
            obj = "true";
        } else {
            obj = "false";
        }
        map2.put("is_root", obj);
        if (c802900Vea.LIZIZ.isEmpty()) {
            str = "false";
        }
        map2.put("has_native_oom", str);
        map2.put("native_oom_app", C0VX9.LJ().getPackageName());
        map2.put("ht_allocator_type", NativeBridge.LJIL());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb A[Catch: all -> 0x02bc, IOException -> 0x02c2, TryCatch #8 {IOException -> 0x02c2, blocks: (B:8:0x0065, B:11:0x0070, B:14:0x0077, B:15:0x0085, B:17:0x0089, B:19:0x0091, B:26:0x00e1, B:20:0x00a9, B:22:0x00b2, B:23:0x00ca, B:25:0x00d2, B:27:0x00e4, B:30:0x00f5, B:40:0x0126, B:43:0x012d, B:68:0x01e0, B:71:0x01eb, B:72:0x01ed, B:74:0x01f3, B:67:0x01dc, B:37:0x011f), top: B:116:0x0065 }] */
    @Override // X.AbstractC802520Vdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(java.io.File r21, X.C802900Vea r22) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802530Vdz.LJIIIZ(java.io.File, X.0Vea):boolean");
    }
}
