package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YZD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YZD implements C0YOQ {
    public Pair<String, C0YWT> LIZ;

    @Override // X.C0YOQ
    public final void LIZJ() {
    }

    @Override // X.C0YOQ
    public final Map<String, String> LIZ(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("shop_id")) == null) {
            str = "";
        }
        linkedHashMap.put("shop_id", str);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // X.C0YOQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(boolean r18, X.InterfaceC1364105Vn<? super X.C0YWT> r19) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YZD.LIZIZ(boolean, X.05Vn):java.lang.Object");
    }
}
