package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: X.0Qcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674290Qcd {
    public final String LIZ;
    public final String LIZIZ;
    public final Keva LIZJ;
    public final Type LIZLLL;

    public final String LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = this.LIZJ.getString(this.LIZIZ, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord> LIZIZ() {
        /*
            r4 = this;
            r3 = 0
            com.bytedance.keva.Keva r1 = r4.LIZJ     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r4.LIZ     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r1.getString(r0, r3)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L20
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L22
            java.lang.reflect.Type r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = X.C1227904rF.LIZJ(r2, r0)     // Catch: java.lang.Throwable -> L22
            boolean r0 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L20
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L22
        L1c:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L22
            goto L2e
        L20:
            r1 = r3
            goto L1c
        L22:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L2e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L35
            r3 = r1
        L35:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L3b
            X.13BV r3 = X.C13BV.INSTANCE
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C674290Qcd.LIZIZ():java.util.List");
    }

    public C674290Qcd(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_ai_history");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_ai_guess");
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZJ = Keva.getRepo("EcSearchMiddleAICacheKeva");
        this.LIZLLL = new TypeToken<List<? extends EcSearchAIHistoryWord>>() { // from class: X.0Qcj
        }.getType();
    }
}
