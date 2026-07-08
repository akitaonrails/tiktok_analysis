package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import defpackage.u2;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0Cjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322090Cjv {
    public static final C322090Cjv LIZ = new C322090Cjv();

    public static void LIZIZ(u2 u2Var) {
        String curUserId;
        C324800CoI.LIZ.getClass();
        if (!C324800CoI.LIZ() || u2Var == null || !C1861940yYK.LJFF(u2Var) || (curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("welcome_conv_");
        sbLIZ.append(curUserId);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C320450ChH(1, 1L, C2188811AlT.LIZIZ(sbLIZ), null), 3);
    }

    public static SubConversationEntranceInfo LIZ(int i, long j) {
        boolean z;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null && curUserId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        u2 u2VarLJFF = C1863380yae.LJJII.LJFF(Integer.valueOf(i), Long.valueOf(j));
        if (u2VarLJFF == null || !C123100dR.LIZ(u2VarLJFF.LIZIZ)) {
            C1863400yag c1863400yag = C1863400yag.LIZ;
            C844470XAv.LIZ.getClass();
            u2VarLJFF = C1863400yag.LIZIZ(c1863400yag, C844470XAv.LIZ(), AFwS190S0000000_4.get$arr$(4185), null, null, null, null, null, j, i, 0, 0, false, false, null, null, AFwS232S0000000_4.get$arr$(225), false, null, 457980).LJIILIIL();
            if (u2VarLJFF == null) {
                return null;
            }
        }
        if (!C1861940yYK.LJFF(u2VarLJFF)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("welcome_conv_");
        sbLIZ.append(curUserId);
        return new SubConversationEntranceInfo(null, C2188811AlT.LIZIZ(sbLIZ), null, 5);
    }
}
