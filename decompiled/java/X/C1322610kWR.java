package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322610kWR {
    public final InterfaceC1032620cyi LIZ;

    public C1322610kWR(InterfaceC1032620cyi interfaceC1032620cyi) {
        this.LIZ = interfaceC1032620cyi;
    }

    public static void LIZ(String str) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Warning: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(final android.net.Uri r7) {
        /*
            java.lang.String r0 = "isInCacheSync may cause ANR, use checkIfInCache instead"
            LIZ(r0)
            java.lang.String r0 = "isInMemoryCacheSync may cause ANR, use checkIfInCache instead"
            LIZ(r0)
            X.0kbR r0 = X.C1325710kbR.LIZ(r7)
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L4b
            X.0kfL r0 = X.C1328130kfL.LJIILIIL()
            X.0kaZ r3 = r0.LJII()
            X.0kfL r0 = X.C1328130kfL.LJIILIIL()
            X.0kaZ r2 = r0.LJIIJJI()
            X.0kWQ r1 = new X.0kWQ
            r1.<init>()
            boolean r0 = r3.LIZLLL(r1)
            if (r0 != 0) goto L33
            boolean r0 = r2.LIZLLL(r1)
            if (r0 == 0) goto L4b
        L33:
            r0 = 1
        L34:
            java.lang.String r4 = "isInCacheSync: "
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            r1.append(r7)
            java.lang.String r0 = " in memory cache"
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r5
        L4b:
            r0 = 0
            goto L34
        L4d:
            java.lang.String r0 = "isInDiskCacheSync may cause ANR, use checkIfInCache instead"
            LIZ(r0)
            X.0kbR r0 = X.C1325710kbR.LIZ(r7)
            if (r0 == 0) goto Lb0
            X.0kZz r1 = X.C1324810kZz.LJI()
            r1.getClass()
            android.net.Uri r0 = r0.LIZIZ
            X.0NLr r3 = r1.LJ(r0)
            X.0kfL r2 = X.C1328130kfL.LJIILIIL()
            X.0kdO r0 = r2.LJIILL()
            X.0kdO r1 = r2.LJIJJ()
            boolean r0 = r0.LJII(r3)
            if (r0 != 0) goto L9d
            boolean r0 = r1.LJII(r3)
            if (r0 != 0) goto L9d
            X.0knU r0 = r2.LJIIIZ()
            if (r0 == 0) goto Lb0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L8b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r1.next()
            X.0kdO r0 = (X.InterfaceC1326920kdO) r0
            boolean r0 = r0.LJII(r3)
            if (r0 == 0) goto L8b
        L9d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            r1.append(r7)
            java.lang.String r0 = " in disk cache"
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r5
        Lb0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322610kWR.LIZIZ(android.net.Uri):boolean");
    }

    public static void LIZJ(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) C1322620kWS.LIZ.getValue(), runnable);
        }
    }
}
