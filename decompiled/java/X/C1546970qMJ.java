package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0qMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546970qMJ {
    public final Keva LIZ;

    public C1546970qMJ(EnumC1546920qME enumC1546920qME) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("spark_i18n_index_");
        sbLIZ.append(enumC1546920qME.getField());
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
