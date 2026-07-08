package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0QaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672990QaX {
    public final String LIZ;
    public final Keva LIZIZ;

    public C672990QaX(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_last_ec_search_query");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = Keva.getRepo("LastEcSearchQuery");
    }
}
