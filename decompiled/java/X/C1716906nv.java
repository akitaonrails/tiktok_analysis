package X;

import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.06nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1716906nv {
    public static final C1716906nv LIZ = new C1716906nv();

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1552050qUV.LJ(C1553670qX7.LIZ(), "tiktok_live_ecommerce_ttmall_v3"));
        sbLIZ.append("/pages/injection.json");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            return C09BH.LJI(c0vsj, Charsets.UTF_8);
        }
        return null;
    }
}
