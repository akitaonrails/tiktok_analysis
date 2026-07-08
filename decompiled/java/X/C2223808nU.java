package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08nU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2223808nU {
    public static final boolean LIZ(Effect effect) {
        File[] fileArrListFiles;
        String name;
        try {
            C0VSJ c0vsj = new C0VSJ(effect.getUnzipPath());
            if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    if (file != null) {
                        name = file.getName();
                    } else {
                        name = null;
                    }
                    if (Intrinsics.LJFF(name, "config.json")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C122D c122dLIZIZ = C123O.LIZIZ();
            if (c122dLIZIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EffectExt isUnzipEffectResExistSync, effect id : ");
                sbLIZ.append(effect.getEffectId());
                sbLIZ.append(" , exception : ");
                sbLIZ.append(Log.getStackTraceString(e));
                c122dLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof X.C2223908nV
            if (r0 == 0) goto L5e
            r6 = r8
            X.08nV r6 = (X.C2223908nV) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILLL
            r3 = 0
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 == r0) goto L3c
            if (r1 != r2) goto L64
            X.C155000ia.LIZIZ(r5)
        L26:
            return r5
        L27:
            X.C155000ia.LIZIZ(r5)
            r6.LL = r7
            r6.LLILLL = r0
            X.1DFB r1 = X.C0PEM.LIZJ
            X.08nT r0 = new X.08nT
            r0.<init>(r7, r3)
            java.lang.Object r5 = X.C23250099c.LJI(r6, r1, r0)
            if (r5 != r4) goto L41
            return r4
        L3c:
            com.ss.android.ugc.effectmanager.effect.model.Effect r7 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L41:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L4c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.08nS r0 = new X.08nS
            r0.<init>(r7, r3)
            r6.LL = r3
            r6.LLILLL = r2
            java.lang.Object r5 = X.C23250099c.LJI(r6, r1, r0)
            if (r5 != r4) goto L26
            return r4
        L5e:
            X.08nV r6 = new X.08nV
            r6.<init>(r8)
            goto L12
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2223808nU.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, X.05Vn):java.lang.Object");
    }
}
