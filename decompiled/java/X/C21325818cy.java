package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS147S1200000_32;

/* JADX INFO: renamed from: X.18cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21325818cy {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public volatile ArrayList<AbstractC21333318eB<?>> LJ;
    public volatile boolean LJFF;
    public final int LJI;
    public final int LJII;
    public volatile ArrayList<AbstractC21333318eB<?>> LJIIIIZZ;
    public volatile boolean LJIIIZ;

    public final void LIZ(C21325918cz c21325918cz, boolean z) {
        if (z) {
            if (this.LJ.size() < this.LIZJ) {
                String str = c21325918cz.LIZ.LIZIZ;
                if (!this.LJFF) {
                    this.LJFF = true;
                    C21326718d7 c21326718d7 = c21325918cz.LIZ;
                    AwS147S1200000_32 awS147S1200000_32 = new AwS147S1200000_32(this, str, c21325918cz, 14);
                    c21326718d7.getClass();
                    C1168270gVV.LIZ.getClass();
                    C1168270gVV.LIZLLL().execute(new RunnableC514801zW(awS147S1200000_32, (Function0<Unit>) 157));
                }
            }
            if (this.LIZIZ) {
                ArrayList<AbstractC21333318eB<?>> arrayList = this.LJIIIIZZ;
                if (arrayList == null) {
                    arrayList = new ArrayList<>(this.LJII);
                    this.LJIIIIZZ = arrayList;
                }
                if (arrayList.size() < this.LJII) {
                    String str2 = c21325918cz.LIZ.LIZIZ;
                    if (!this.LJIIIZ) {
                        this.LJIIIZ = true;
                        C21326718d7 c21326718d72 = c21325918cz.LIZ;
                        AwS147S1200000_32 awS147S1200000_322 = new AwS147S1200000_32(this, str2, c21325918cz, 13);
                        c21326718d72.getClass();
                        C1168270gVV.LIZ.getClass();
                        C1168270gVV.LIZLLL().execute(new RunnableC514801zW(awS147S1200000_322, (Function0<Unit>) 157));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21325818cy(int r7, java.lang.String r8, X.C21326718d7 r9) {
        /*
            r6 = this;
            r6.<init>()
            r6.LIZ = r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r5 = 1
            r4 = 0
            if (r1 < r0) goto L83
            boolean r0 = r9.LJJJJL
            if (r0 == 0) goto L83
            X.0gVV r0 = X.C1168270gVV.LIZ
            r0.getClass()
            X.01GW r0 = X.C1168270gVV.LJIIJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            java.util.Map<java.lang.String, X.18cm> r0 = X.C21325218cs.LIZ
            if (r8 == 0) goto L83
            java.lang.String r0 = "text"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "image"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 != 0) goto L46
            boolean r0 = X.C1168270gVV.LJFF()
            if (r0 == 0) goto L83
            java.lang.String r0 = "view"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L83
        L46:
            r3 = 1
        L47:
            r6.LIZIZ = r3
            if (r3 == 0) goto L81
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r0 = (float) r7
            float r0 = r0 * r1
            int r2 = java.lang.Math.round(r0)
        L54:
            r6.LIZJ = r2
            float r0 = (float) r2
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            r6.LIZLLL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r6.LJ = r0
            r6.LJIIIZ = r5
            if (r3 == 0) goto L80
            int r7 = r7 - r2
            r6.LJII = r7
            float r0 = (float) r7
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            r6.LJI = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            r6.LJIIIIZZ = r0
            r6.LJIIIZ = r4
        L80:
            return
        L81:
            r2 = r7
            goto L54
        L83:
            r3 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21325818cy.<init>(int, java.lang.String, X.18d7):void");
    }
}
