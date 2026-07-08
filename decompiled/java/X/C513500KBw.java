package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513500KBw {
    public static C518090KTn LIZJ;
    public static final C513500KBw LIZ = new C513500KBw();
    public static final Map<String, C510150JzZ> LIZIZ = new LinkedHashMap();
    public static final List<EnumC513490KBv> LIZLLL = C1697810uHb.LJIIJJI(EnumC513490KBv.PRIVILEGE_PAGE, EnumC513490KBv.NORMAL_SUBSCRIPTION);

    public static void LJ() {
        TemplateListData second;
        LIZJ = null;
        Iterator it2 = ((LinkedHashMap) LIZIZ).values().iterator();
        while (it2.hasNext()) {
            Pair<C470590Icr<TemplateListData>, TemplateListData> pair = ((C510150JzZ) it2.next()).LIZ;
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
    public static final X.EnumC513410KBn LIZ(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            X.0KBn r5 = X.EnumC513410KBn.NOT_SPECIAL_SCENE
            X.0KBv r1 = X.EnumC513490KBv.ANY
            r2 = 0
            X.0JzZ r0 = LIZJ(r6, r2, r1)
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1d
            kotlin.Pair<X.0Icr<webcast.api.sub.TemplateListData>, webcast.api.sub.TemplateListData> r0 = r0.LIZ
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.getSecond()
            webcast.api.sub.TemplateListData r0 = (webcast.api.sub.TemplateListData) r0
            if (r0 == 0) goto L1d
            com.bytedance.android.livesdk.subscribe.model.PreCheckResult r0 = r0.preCheckResult
            if (r0 != 0) goto L49
        L1d:
            X.0JzZ r0 = LIZJ(r6, r3, r1)
            if (r0 == 0) goto L33
            kotlin.Pair<X.0Icr<webcast.api.sub.TemplateListData>, webcast.api.sub.TemplateListData> r0 = r0.LIZ
            if (r0 == 0) goto L33
            java.lang.Object r0 = r0.getSecond()
            webcast.api.sub.TemplateListData r0 = (webcast.api.sub.TemplateListData) r0
            if (r0 == 0) goto L33
            com.bytedance.android.livesdk.subscribe.model.PreCheckResult r0 = r0.preCheckResult
            if (r0 != 0) goto L49
        L33:
            X.0JzZ r0 = LIZJ(r6, r4, r1)
            if (r0 == 0) goto L8a
            kotlin.Pair<X.0Icr<webcast.api.sub.TemplateListData>, webcast.api.sub.TemplateListData> r0 = r0.LIZ
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r0.getSecond()
            webcast.api.sub.TemplateListData r0 = (webcast.api.sub.TemplateListData) r0
            if (r0 == 0) goto L8a
            com.bytedance.android.livesdk.subscribe.model.PreCheckResult r0 = r0.preCheckResult
            if (r0 == 0) goto L8a
        L49:
            int r0 = r0.status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L8a
            int r0 = r1.intValue()
            if (r0 != r4) goto L81
            X.0KBn r1 = X.EnumC513410KBn.INCORRECT_GP_ACCOUNT
        L59:
            boolean r0 = X.C513380KBk.LIZJ(r1)
            if (r0 == 0) goto L8c
            if (r8 == 0) goto L8c
            X.0KBv r0 = X.EnumC513490KBv.NORMAL_SUBSCRIPTION
            X.0JzZ r0 = LIZJ(r6, r2, r0)
            if (r0 == 0) goto L75
            java.util.Map<java.lang.String, ? extends java.util.List<com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo>> r0 = r0.LIZIZ
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L7a
        L75:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L7a:
            boolean r0 = X.C513940KDo.LIZIZ(r7, r0)
            if (r0 == 0) goto L8c
            return r5
        L81:
            int r0 = r1.intValue()
            if (r0 != r3) goto L8a
            X.0KBn r1 = X.EnumC513410KBn.INCORRECT_TIKTOK_OR_GP_ACCOUNT
            goto L59
        L8a:
            r1 = r5
            goto L59
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513500KBw.LIZ(java.lang.String, java.lang.String, boolean):X.0KBn");
    }

    public static void LIZIZ(String str, int i, EnumC513490KBv enumC513490KBv) {
        C510150JzZ c510150JzZ = (C510150JzZ) ((LinkedHashMap) LIZIZ).get(LIZLLL(i, str));
        if (c510150JzZ == null) {
            return;
        }
        c510150JzZ.LIZJ.remove(enumC513490KBv);
    }

    public static C510150JzZ LIZJ(String str, int i, EnumC513490KBv enumC513490KBv) {
        if (enumC513490KBv == EnumC513490KBv.UNKNOWN) {
            return null;
        }
        C510150JzZ c510150JzZ = (C510150JzZ) ((LinkedHashMap) LIZIZ).get(LIZLLL(i, str));
        if (c510150JzZ == null) {
            return null;
        }
        if (enumC513490KBv != EnumC513490KBv.ANY && !c510150JzZ.LIZJ.contains(enumC513490KBv)) {
            return null;
        }
        return c510150JzZ;
    }

    public static void LJFF(String str, int i, EnumC513490KBv enumC513490KBv, Map map) {
        String strLIZLLL = LIZLLL(i, str);
        Map<String, C510150JzZ> map2 = LIZIZ;
        C510150JzZ c510150JzZ = (C510150JzZ) ((LinkedHashMap) map2).get(strLIZLLL);
        if (c510150JzZ == null) {
            c510150JzZ = new C510150JzZ(null);
        }
        c510150JzZ.LIZIZ = map;
        List<EnumC513490KBv> list = LIZLLL;
        if (list.contains(enumC513490KBv)) {
            c510150JzZ.LIZJ.addAll(list);
        }
        map2.put(strLIZLLL, c510150JzZ);
    }
}
