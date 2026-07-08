package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0m2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381100m2m extends AbstractC1361480lX8<C1869640ykk> {
    public static final String LJII(Aweme aweme, String str) {
        if (((Number) C257440A7a.LIZ.getValue()).intValue() >= 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        Object objLJIIJ = C20703515zt.LJIIJ(aweme);
        if (objLJIIJ == null) {
            objLJIIJ = aweme.getAid();
        }
        sbLIZ2.append(objLJIIJ);
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.AbstractC1361510lXB
    public final /* bridge */ /* synthetic */ String LIZIZ(Aweme aweme, String str) {
        return LJII(aweme, str);
    }
}
