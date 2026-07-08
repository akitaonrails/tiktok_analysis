package X;

import com.bytedance.pns.crypto.Ecies;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711440uda {
    public static final C1711440uda LIZ = new C1711440uda();
    public static final Ecies LIZIZ = Ecies.LIZIZ();

    public static String LIZIZ() throws JSONException {
        HashMap<String, Object> mapLJJLIIIJLJLI;
        JSONObject jSONObjectLIZJ = C1722320uv8.LIZJ("auto_fill", null);
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null && (mapLJJLIIIJLJLI = iProbeService.LJJLIIIJLJLI()) != null) {
            for (Map.Entry<String, Object> entry : mapLJJLIIIJLJLI.entrySet()) {
                if (jSONObjectLIZJ.isNull(entry.getKey())) {
                    jSONObjectLIZJ.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return C786410Ut5.J3(jSONObjectLIZJ);
    }

    public static AutofillApi.CardNumberList LIZJ(String str) {
        boolean z;
        Object c098200Yq;
        AutofillApi.CardNumberList cardNumberList;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Type type = new TypeToken<AutofillApi.CardNumberList>() { // from class: X.0ude
            }.getType();
            C1227904rF.LIZ.getClass();
            cardNumberList = (AutofillApi.CardNumberList) C1227904rF.LIZJ(str, type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (Intrinsics.LJFF(cardNumberList.resultCode, "success")) {
            Ecies ecies = LIZIZ;
            String strLIZ = ecies.LIZ(cardNumberList.PIList);
            Type type2 = new TypeToken<List<? extends AutofillApi.CardNumberItem>>() { // from class: X.0udc
            }.getType();
            ArrayList<AutofillApi.CardNumberItem> arrayList = new ArrayList<>();
            arrayList.addAll((Collection) C1227904rF.LIZJ(strLIZ, type2));
            cardNumberList.LIZIZ = arrayList;
            if (arrayList.size() == 0) {
                return null;
            }
            cardNumberList.LIZ = (AutofillApi.CardNumberItem) C1227904rF.LIZJ(ecies.LIZ(cardNumberList.recommendPI), new TypeToken<AutofillApi.CardNumberItem>() { // from class: X.0udd
            }.getType());
            return cardNumberList;
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent, java.lang.String>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1711450udb
            if (r0 == 0) goto L5e
            r7 = r10
            X.0udb r7 = (X.C1711450udb) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 == r2) goto L48
            if (r0 != r3) goto L6a
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent r1 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L28:
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r6.length()
            if (r0 != 0) goto L64
            return r4
        L31:
            X.C155000ia.LIZIZ(r6)
            X.0udi r1 = X.C1711520udi.LIZ
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r0 = X.C786410Ut5.J3(r0)
            r7.LLILZ = r2
            java.lang.Object r6 = r1.LIZIZ(r9, r0, r7)
            if (r6 != r5) goto L4b
            return r5
        L48:
            X.C155000ia.LIZIZ(r6)
        L4b:
            r1 = r6
            com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent r1 = (com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent) r1
            if (r1 != 0) goto L51
            return r4
        L51:
            X.0udl r0 = X.C1711550udl.LIZ
            r7.LL = r1
            r7.LLILZ = r3
            java.lang.Object r6 = r0.LIZ(r7)
            if (r6 != r5) goto L28
            return r5
        L5e:
            X.0udb r7 = new X.0udb
            r7.<init>(r8, r10)
            goto L12
        L64:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r6)
            return r0
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1711440uda.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
