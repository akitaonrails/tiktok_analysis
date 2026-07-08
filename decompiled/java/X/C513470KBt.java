package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513470KBt {
    public static C518090KTn LIZJ;
    public static final C513470KBt LIZ = new C513470KBt();
    public static final Map<String, C0K7R> LIZIZ = new LinkedHashMap();
    public static final List<EnumC513480KBu> LIZLLL = C1697810uHb.LJIIJJI(EnumC513480KBu.PRIVILEGE_PAGE, EnumC513480KBu.NORMAL_SUBSCRIPTION);

    public static void LJ() {
        PGCTemplateListData second;
        LIZJ = null;
        Iterator it2 = ((LinkedHashMap) LIZIZ).values().iterator();
        while (it2.hasNext()) {
            Pair<C00CC<PGCTemplateListData>, PGCTemplateListData> pair = ((C0K7R) it2.next()).LIZ;
            if (pair != null && (second = pair.getSecond()) != null) {
                second.preCheckResult = null;
            }
        }
    }

    public static String LIZLLL(int i, String str) {
        if (i == 0) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC513420KBo LIZ(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            X.0KBo r5 = X.EnumC513420KBo.NOT_SPECIAL_SCENE
            X.0KBu r1 = X.EnumC513480KBu.ANY
            r2 = 0
            X.0K7R r0 = LIZJ(r6, r2, r1)
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1d
            kotlin.Pair<X.00CC<webcast.api.pgc_sub.PGCTemplateListData>, webcast.api.pgc_sub.PGCTemplateListData> r0 = r0.LIZ
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.getSecond()
            webcast.api.pgc_sub.PGCTemplateListData r0 = (webcast.api.pgc_sub.PGCTemplateListData) r0
            if (r0 == 0) goto L1d
            com.bytedance.android.pgcsdk.subscribe.model.PGCPreCheckResult r0 = r0.preCheckResult
            if (r0 != 0) goto L49
        L1d:
            X.0K7R r0 = LIZJ(r6, r3, r1)
            if (r0 == 0) goto L33
            kotlin.Pair<X.00CC<webcast.api.pgc_sub.PGCTemplateListData>, webcast.api.pgc_sub.PGCTemplateListData> r0 = r0.LIZ
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.getSecond()
            webcast.api.pgc_sub.PGCTemplateListData r0 = (webcast.api.pgc_sub.PGCTemplateListData) r0
            if (r0 == 0) goto L33
            com.bytedance.android.pgcsdk.subscribe.model.PGCPreCheckResult r0 = r0.preCheckResult
            if (r0 != 0) goto L49
        L33:
            X.0K7R r0 = LIZJ(r6, r4, r1)
            if (r0 == 0) goto L8a
            kotlin.Pair<X.00CC<webcast.api.pgc_sub.PGCTemplateListData>, webcast.api.pgc_sub.PGCTemplateListData> r0 = r0.LIZ
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r0.getSecond()
            webcast.api.pgc_sub.PGCTemplateListData r0 = (webcast.api.pgc_sub.PGCTemplateListData) r0
            if (r0 == 0) goto L8a
            com.bytedance.android.pgcsdk.subscribe.model.PGCPreCheckResult r0 = r0.preCheckResult
            if (r0 == 0) goto L8a
        L49:
            int r0 = r0.status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L8a
            int r0 = r1.intValue()
            if (r0 != r4) goto L81
            X.0KBo r1 = X.EnumC513420KBo.INCORRECT_GP_ACCOUNT
        L59:
            boolean r0 = X.C513450KBr.LIZJ(r1)
            if (r0 == 0) goto L8c
            if (r8 == 0) goto L8c
            X.0KBu r0 = X.EnumC513480KBu.NORMAL_SUBSCRIPTION
            X.0K7R r0 = LIZJ(r6, r2, r0)
            if (r0 == 0) goto L75
            java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo>> r0 = r0.LIZIZ
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L7a
        L75:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L7a:
            boolean r0 = X.C513840KDe.LIZIZ(r7, r0)
            if (r0 == 0) goto L8c
            return r5
        L81:
            int r0 = r1.intValue()
            if (r0 != r3) goto L8a
            X.0KBo r1 = X.EnumC513420KBo.INCORRECT_TIKTOK_OR_GP_ACCOUNT
            goto L59
        L8a:
            r1 = r5
            goto L59
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513470KBt.LIZ(java.lang.String, java.lang.String, boolean):X.0KBo");
    }

    public static void LIZIZ(String str, int i, EnumC513480KBu enumC513480KBu) {
        C0K7R c0k7r = (C0K7R) ((LinkedHashMap) LIZIZ).get(LIZLLL(i, str));
        if (c0k7r == null) {
            return;
        }
        c0k7r.LIZJ.remove(enumC513480KBu);
    }

    public static C0K7R LIZJ(String str, int i, EnumC513480KBu enumC513480KBu) {
        if (enumC513480KBu == EnumC513480KBu.UNKNOWN) {
            return null;
        }
        C0K7R c0k7r = (C0K7R) ((LinkedHashMap) LIZIZ).get(LIZLLL(i, str));
        if (c0k7r == null) {
            return null;
        }
        if (enumC513480KBu != EnumC513480KBu.ANY && !c0k7r.LIZJ.contains(enumC513480KBu)) {
            return null;
        }
        return c0k7r;
    }

    public static void LJFF(String str, int i, EnumC513480KBu enumC513480KBu, Map map) {
        String strLIZLLL = LIZLLL(i, str);
        Map<String, C0K7R> map2 = LIZIZ;
        C0K7R c0k7r = (C0K7R) ((LinkedHashMap) map2).get(strLIZLLL);
        if (c0k7r == null) {
            c0k7r = new C0K7R(null);
        }
        c0k7r.LIZIZ = map;
        List<EnumC513480KBu> list = LIZLLL;
        if (list.contains(enumC513480KBu)) {
            c0k7r.LIZJ.addAll(list);
        }
        map2.put(strLIZLLL, c0k7r);
    }
}
