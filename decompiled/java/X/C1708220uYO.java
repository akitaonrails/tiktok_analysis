package X;

import android.content.Context;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708220uYO {
    public static final C1708210uYN LIZLLL = new C1708210uYN();
    public static final Map<String, WeakReference<InterfaceC1708270uYT>> LJ = new LinkedHashMap();
    public static final Map<String, String> LJFF = new LinkedHashMap();
    public static final Map<String, WeakReference<SparkActivity>> LJI = new LinkedHashMap();
    public static final Map<String, HashMap<String, String>> LJII = new LinkedHashMap();
    public static final List<String> LJIIIIZZ = new ArrayList();
    public String LIZ;
    public C1708320uYY LIZIZ;
    public InterfaceC1708270uYT LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0133 A[PHI: r8
      0x0133: PHI (r8v7 java.lang.String) = (r8v1 java.lang.String), (r8v8 java.lang.String) binds: [B:43:0x0131, B:41:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137 A[PHI: r8
      0x0137: PHI (r8v6 java.lang.String) = (r8v1 java.lang.String), (r8v7 java.lang.String) binds: [B:43:0x0131, B:45:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a A[PHI: r8 r9
      0x013a: PHI (r8v2 java.lang.String) = (r8v6 java.lang.String), (r8v7 java.lang.String) binds: [B:47:0x0138, B:45:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r9v2 java.lang.String) = (r9v6 java.lang.String), (r9v7 java.lang.String) binds: [B:47:0x0138, B:45:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e A[PHI: r8 r9
      0x013e: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v6 java.lang.String) binds: [B:49:0x013c, B:47:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v6 java.lang.String) binds: [B:49:0x013c, B:47:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141 A[PHI: r8 r9 r10
      0x0141: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:49:0x013c, B:51:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:49:0x013c, B:51:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r10v3 java.lang.String) = (r10v1 java.lang.String), (r10v4 java.lang.String) binds: [B:49:0x013c, B:51:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.net.Uri r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708220uYO.LJ(android.net.Uri):void");
    }

    public static void LIZIZ(Context context, String str, InterfaceC1708270uYT interfaceC1708270uYT, Function1 function1, String str2) {
        C1708470uYn.LIZ.getClass();
        String string = context.getString(2131857118);
        LIZLLL.getClass();
        C1708210uYN.LIZJ(str, "1", str2, string);
        function1.invoke(string);
        interfaceC1708270uYT.LIZ(1, null);
    }

    public final void LIZJ(Context context, String str, C1708320uYY c1708320uYY, InterfaceC1708270uYT interfaceC1708270uYT, C1708990uZd c1708990uZd) {
        String str2;
        this.LIZ = str;
        this.LIZIZ = c1708320uYY;
        this.LIZJ = interfaceC1708270uYT;
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        InterfaceC1708000uY2 interfaceC1708000uY2LIZ = c1708030uY5.LIZ(new C1708140uYG(str));
        EnumC1708150uYH enumC1708150uYH = EnumC1708150uYH.STAGE_PRE_CHECK;
        interfaceC1708000uY2LIZ.LIZJ(enumC1708150uYH.getStepName(), null);
        C1707990uY1 c1707990uY1 = c1708320uYY.LIZ.LIZIZ;
        if (c1707990uY1 != null) {
            str2 = c1707990uY1.LIZ;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            LIZLLL(context, str, c1708320uYY, interfaceC1708270uYT, c1708990uZd);
            return;
        }
        InterfaceC1708000uY2 interfaceC1708000uY2LIZ2 = c1708030uY5.LIZ(new C1708140uYG(str));
        String stepName = enumC1708150uYH.getStepName();
        EnumC1708300uYW enumC1708300uYW = EnumC1708300uYW.BIND_ERROR_ERROR_PARAMS_ERROR;
        interfaceC1708000uY2LIZ2.LIZIZ(stepName, null, String.valueOf(enumC1708300uYW.getErrorCode()), 0);
        C1708210uYN c1708210uYN = LIZLLL;
        String strValueOf = String.valueOf(enumC1708300uYW.getErrorCode());
        String realError = enumC1708300uYW.getRealError();
        c1708210uYN.getClass();
        C1708210uYN.LIZJ(str, "1", strValueOf, realError);
        interfaceC1708270uYT.LIZ(1, null);
    }

    public final void LIZLLL(Context context, String str, C1708320uYY c1708320uYY, InterfaceC1708270uYT interfaceC1708270uYT, C1708990uZd c1708990uZd) {
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        c1708030uY5.LIZ(new C1708140uYG(str)).LIZIZ(EnumC1708150uYH.STAGE_PRE_CHECK.getStepName(), null, null, 1);
        c1708030uY5.LIZ(new C1708140uYG(str)).LIZJ(EnumC1708150uYH.BIND_PI.getStepName(), null);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1708290uYV(c1708320uYY, str, C1707770uXf.LIZ(), interfaceC1708270uYT, context, c1708990uZd, this, null), 2);
    }

    public static final void LIZ(Context context, C1708220uYO c1708220uYO, String str, InterfaceC1708270uYT interfaceC1708270uYT, C1708990uZd c1708990uZd, Function1<? super String, Unit> function1, C1708320uYY c1708320uYY) {
        if (c1708320uYY.LIZJ.bindInfo != null && !(!Intrinsics.LJFF(r0.isNeedPreBindVerify, Boolean.FALSE))) {
            c1708220uYO.LIZLLL(context, str, c1708320uYY, interfaceC1708270uYT, c1708990uZd);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1708210uYN c1708210uYN = LIZLLL;
            PaymentOption paymentOption = c1708320uYY.LIZJ;
            C1709570uaZ c1709570uaZ = c1708320uYY.LIZ;
            ArrayList arrayList = new ArrayList();
            C1708260uYS c1708260uYS = new C1708260uYS(context, c1708990uZd, interfaceC1708270uYT, c1708220uYO, c1708320uYY, str);
            c1708210uYN.getClass();
            C1708210uYN.LJ(paymentOption, c1709570uaZ, c19egLIZIZ, str, arrayList, function1, c1708260uYS);
        }
    }
}
