package X;

import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X7D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X7D {
    public static final void LIZ(int i, String str, long j, String str2, String str3) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        c2241008qG.LIZ.put("downloader_scene", str);
        c2241008qG.LIZ.put("request_log", str2);
        c2241008qG.LIZ.put("error_msg", str3);
        c2241008qG.LIZ.put("network_client", "ttnet");
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("downloader_monitor", i, jSONObjectLJ);
    }

    public static final void LIZIZ(long j, int i, String str, C0X9S c0x9s, C0X52 c0x52, String str2) {
        Object obj;
        String str3 = null;
        if (c0x9s != null && c0x52 != null && (c0x9s instanceof InterfaceC843230X6b)) {
            ((InterfaceC843230X6b) c0x9s).doCollect();
            C2175508fh c2175508fh = c0x52.LIZ;
            if (c2175508fh != null) {
                obj = c2175508fh.LJFF;
            } else {
                obj = null;
            }
            if (obj instanceof C1494850p0F) {
                str3 = ((C1494600ozq) obj).LJJIIJ;
            }
        }
        LIZ(i, str, j, str3, str2);
    }
}
