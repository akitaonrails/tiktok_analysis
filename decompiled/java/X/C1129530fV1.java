package X;

import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: renamed from: X.0fV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129530fV1 {
    public static final String LIZ(C1129140fUO c1129140fUO) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pages=");
        sbLIZ.append(c1129140fUO.LIZ.size());
        sbLIZ.append(", tab=");
        sbLIZ.append(c1129140fUO.LIZIZ);
        sbLIZ.append(", gift=");
        Gift gift = c1129140fUO.LIZJ;
        if (gift != null) {
            lValueOf = Long.valueOf(gift.id);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(c1129140fUO.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
