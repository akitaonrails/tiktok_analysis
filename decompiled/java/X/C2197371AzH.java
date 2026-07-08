package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScopeStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197371AzH {
    public static final C2197371AzH LIZ = new C2197371AzH();

    public static List LIZJ(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next());
            }
        }
        return arrayList;
    }

    public static EnumC1779940wQ4 LIZLLL(boolean z, OAuthScopeStruct oAuthScopeStruct) {
        if (z) {
            return EnumC1779940wQ4.AUTO_AUTHORIZATION_DISABLED;
        }
        if (oAuthScopeStruct == null) {
            return EnumC1779940wQ4.AUTHENTICATION_AUTHORIZATION;
        }
        List<OAuthScope> list = oAuthScopeStruct.authorizedScopeList;
        List<OAuthScope> list2 = oAuthScopeStruct.requestScopeList;
        if (list != null && !list.isEmpty()) {
            return EnumC1779940wQ4.INCREMENTAL_AUTHORIZATION;
        }
        if (list2 != null && !list2.isEmpty() && list2.size() == 1) {
            return EnumC1779940wQ4.AUTHENTICATION_ONLY;
        }
        return EnumC1779940wQ4.AUTHENTICATION_AUTHORIZATION;
    }

    public static void LJ(Context context, String str) {
        if (ComplianceServiceProvider.LJI().LJ(str)) {
            SparkThirdContext sparkThirdContext = new SparkThirdContext();
            sparkThirdContext.url = str;
            sparkThirdContext.bizCert = new ThirdPartyBizCert(402685961);
            sparkThirdContext.actions = null;
            sparkThirdContext.disableOpenInSystem = true;
            sparkThirdContext.titleBar = new C1BHV() { // from class: X.1AzI
                @Override // X.C1BHV, X.C1BHQ
                public final void setSubTitle(String str2) {
                }
            };
            C1554300qY8.LIZIZ(context, sparkThirdContext);
            return;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.bizCert = new ThirdPartyBizCert(402685961);
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    public static String LIZ(int i, String str, List list) {
        String strLIZIZ;
        if (str == null) {
            strLIZIZ = ((AuthorizedScope) ListProtector.get(list, i)).scopeName;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(',');
            sbLIZ.append(((AuthorizedScope) ListProtector.get(list, i)).scopeName);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZIZ, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        return C13LP.LJJLIIIJ(C13LP.LLIIJI(arrayList), ",", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(int r5, java.lang.String r6, java.util.List r7) {
        /*
            if (r6 != 0) goto L47
            int r0 = r7.size()
            if (r5 >= r0) goto L12
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope r0 = (com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope) r0
            java.lang.String r3 = r0.scopeName
            if (r3 != 0) goto L14
        L12:
            java.lang.String r3 = ""
        L14:
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r1 = 0
            r0 = 6
            java.util.List r1 = kotlin.text.a0.LJJLIIIJILLIZJL(r3, r2, r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            goto L2f
        L47:
            int r0 = r7.size()
            if (r5 >= r0) goto L12
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            r0 = 44
            r1.append(r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope r0 = (com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope) r0
            java.lang.String r0 = r0.scopeName
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            goto L14
        L69:
            java.util.Set r0 = X.C13LP.LLIIJI(r2)
            java.lang.String r1 = ","
            r2 = 0
            r4 = 0
            r7 = 62
            r3 = r2
            r5 = r2
            r6 = r2
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2197371AzH.LIZIZ(int, java.lang.String, java.util.List):java.lang.String");
    }
}
