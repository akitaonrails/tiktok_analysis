package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.util.UUID;

/* JADX INFO: renamed from: X.0Qlj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC679930Qlj extends AbstractC1538690q8x {
    static {
        C679960Qlm.LIZ("csi_session_id", new InterfaceC1532940pzg() { // from class: X.0Qlk
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                Activity activityLIZIZ;
                int iIntValue;
                String str;
                boolean z;
                String str2;
                Integer numLJIIJJI;
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                Object objLIZ = null;
                if (abstractC1387200mCcLJ != null) {
                    activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                } else {
                    activityLIZIZ = null;
                }
                boolean z2 = false;
                if (interfaceC679950Qll != null && (str2 = interfaceC679950Qll.get("is_from_csi")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                if (interfaceC679950Qll != null) {
                    str = interfaceC679950Qll.get("session_id");
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (activityLIZIZ != null) {
                        C1323690kYB.LIZ(activityLIZIZ).LJIIIIZZ(str, "__search_inspiration_session_id__");
                    }
                    return str;
                }
                if (activityLIZIZ == null) {
                    return UUID.randomUUID().toString();
                }
                if (iIntValue == 0) {
                    String string = UUID.randomUUID().toString();
                    C1323690kYB.LIZ(activityLIZIZ).LJIIIIZZ(string, "__search_inspiration_session_id__");
                    return string;
                }
                try {
                    objLIZ = C1323690kYB.LIZ(activityLIZIZ).LIZ("__search_inspiration_session_id__");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to properly getStorageItem with exception ");
                    sbLIZ.append(th);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("csi_session_id register", C2188811AlT.LIZIZ(sbLIZ));
                }
                String strValueOf = String.valueOf(objLIZ);
                if (strValueOf.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    String string2 = UUID.randomUUID().toString();
                    C1323690kYB.LIZ(activityLIZIZ).LJIIIIZZ(string2, "__search_inspiration_session_id__");
                    return string2;
                }
                return strValueOf;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // X.AbstractC1538690q8x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJ(com.bytedance.hybrid.spark.SparkContext r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r6 = r8.LJIJI()
            r5 = 1
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.NullPointerException -> L18
            java.lang.String r0 = "use_spark_lite"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)     // Catch: java.lang.NullPointerException -> L18
            if (r0 == 0) goto L1c
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.NullPointerException -> L18
            if (r0 != r5) goto L1c
            goto L1d
        L18:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1c:
            r6 = 0
        L1d:
            java.lang.String r4 = "use_forest"
            java.lang.String r3 = "enable_memory_cache"
            java.lang.String r2 = "enable_code_cache"
            if (r6 == 0) goto L74
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "1"
            r1.appendQueryParameter(r2, r0)
            r1.appendQueryParameter(r3, r0)
            r1.appendQueryParameter(r4, r0)
            java.lang.String r0 = r1.toString()
            r8.LJJLIIJ(r0)
        L3f:
            super.LJ(r8, r9)
            java.lang.Class<X.0PZc> r1 = X.C646940PZc.class
            X.0PZc r0 = new X.0PZc
            r0.<init>(r5)
            r8.LJJ(r1, r0)
            X.0q73 r2 = new X.0q73
            r2.<init>()
            java.lang.String r1 = "isSearchStandardContainer"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.put(r1, r0)
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0Wdk r0 = r0.LJIIJ()
            int r0 = r0.isPad()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "isPad"
            r2.put(r0, r1)
            r8.runtimeInfo = r2
            return
        L74:
            r8.LJJJLZIJ(r5, r2)
            r8.LJJJLZIJ(r5, r3)
            r8.LJJJLZIJ(r5, r4)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC679930Qlj.LJ(com.bytedance.hybrid.spark.SparkContext, java.lang.String):void");
    }
}
