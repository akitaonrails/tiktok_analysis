package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SMY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SMY {
    public static final C720210SMx LIZ = new C720210SMx();
    public static final C720260SNc LIZIZ;
    public static final C01GW LIZJ;

    static {
        LIZIZ = C0SKM.LIZ() ? new C720240SNa() : new C720260SNc();
        LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(330));
    }

    public static C720050SMh LIZ() {
        return (C720050SMh) LIZJ.getValue();
    }

    public static FeedContentLayoutInfo LIZLLL(String str, String str2) {
        FeedContentLayoutInfo feedContentLayoutInfo;
        if (str != null) {
            C0SNN c0snn = LIZ().LIZ.get(C720050SMh.LIZ(str, LJII(null, null), str2));
            if (c0snn != null && (feedContentLayoutInfo = c0snn.LIZ) != null) {
                return feedContentLayoutInfo;
            }
        }
        return null;
    }

    public static String LJII(C0S5R c0s5r, C0S5S c0s5s) {
        if ((c0s5s != null && c0s5s.LIZIZ) || (c0s5r != null && c0s5r.LIZJ)) {
            return C161N.LIZIZ.LLIIZ();
        }
        return "";
    }

    public static C0SL3 LJ(float f, String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ().LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(f);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return (C0SL3) linkedHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C0SL3 LJIIIIZZ(String str, String str2, float f, Function1 function1) {
        C0SL3 c0sl3LJ;
        C0SL3 c0sl3;
        if (str == null || (c0sl3LJ = LJ(f, str, str2)) == null) {
            return null;
        }
        if (function1 != null && (c0sl3 = (C0SL3) function1.invoke(c0sl3LJ)) != null) {
            HashMap map = (HashMap) LIZ().LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(f);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            map.put(C2188811AlT.LIZIZ(sbLIZ), c0sl3);
            return c0sl3;
        }
        return c0sl3LJ;
    }

    public static FeedContentLayoutInfo LJIIIZ(String str, String str2, C0S5S c0s5s, C0S5R c0s5r, Function1 function1) {
        FeedContentLayoutInfo feedContentLayoutInfo;
        FeedContentLayoutInfo feedContentLayoutInfo2;
        if (str == null) {
            return null;
        }
        String strLJII = LJII(c0s5r, c0s5s);
        C0SNN c0snn = LIZ().LIZ.get(C720050SMh.LIZ(str, strLJII, str2));
        if (c0snn == null || (feedContentLayoutInfo = c0snn.LIZ) == null) {
            return null;
        }
        if (function1 != null && (feedContentLayoutInfo2 = (FeedContentLayoutInfo) function1.invoke(feedContentLayoutInfo)) != null) {
            LIZ().LIZ.put(C720050SMh.LIZ(str, strLJII, str2), new C0SNN(feedContentLayoutInfo2));
            return feedContentLayoutInfo2;
        }
        return feedContentLayoutInfo;
    }

    public static C0SL3 LJFF(FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, int i3, int i4, int i5, int i6, C0SN0 c0sn0) {
        boolean z;
        Float f;
        float fFloatValue;
        Float f2;
        float fFloatValue2 = 0.0f;
        if (c0sn0 != null) {
            String str = c0sn0.LIZ;
            PhotoModeImage photoModeImage = c0sn0.LIZLLL;
            if (photoModeImage != null && (f2 = photoModeImage.aspectRatio) != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            C0SL3 c0sl3LJ = LJ(fFloatValue, str, c0sn0.LJIIIZ);
            if (c0sl3LJ != null) {
                return c0sl3LJ;
            }
        }
        C720260SNc c720260SNc = LIZIZ;
        if (c0sn0 != null) {
            z = c0sn0.LIZIZ;
        } else {
            z = false;
        }
        C0SL3 c0sl3LIZ = c720260SNc.LIZ(feedContentLayoutInfo, i, i2, i3, i4, i5, i6, z, c0sn0);
        if (c0sn0 != null && c0sl3LIZ.LIZIZ > 0.0f) {
            C720050SMh c720050SMhLIZ = LIZ();
            String str2 = c0sn0.LIZ;
            PhotoModeImage photoModeImage2 = c0sn0.LIZLLL;
            if (photoModeImage2 != null && (f = photoModeImage2.aspectRatio) != null) {
                fFloatValue2 = f.floatValue();
            }
            String str3 = c0sn0.LJIIIZ;
            HashMap map = (HashMap) c720050SMhLIZ.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(fFloatValue2);
            sbLIZ.append('_');
            sbLIZ.append(str3);
            map.put(C2188811AlT.LIZIZ(sbLIZ), c0sl3LIZ);
        }
        return c0sl3LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0338 A[PHI: r5
      0x0338: PHI (r5v15 java.lang.String) = (r5v4 java.lang.String), (r5v17 java.lang.String) binds: [B:122:0x0329, B:127:0x0336] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo LIZIZ(android.content.Context r18, X.C720110SMn r19, X.C0S5S r20, X.C0S5R r21, int r22, X.C0SFT r23, boolean r24, boolean r25, com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r26, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility r27) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SMY.LIZIZ(android.content.Context, X.0SMn, X.0S5S, X.0S5R, int, X.0SFT, boolean, boolean, com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility):com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo");
    }
}
