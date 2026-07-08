package Y;

import X.C09JN;
import X.C1808280x9m;
import X.C1808300x9o;
import X.C1C7U;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class AfS2S2210000_27 implements C09JN {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S2210000_27 afS2S2210000_27, Object obj) {
        C1C7U.LIZ("PcsMonitor@2ed9.monitorPcsApi$2");
        if (afS2S2210000_27.z4) {
            C1808280x9m.LIZIZ((C1808300x9o) afS2S2210000_27.l2, afS2S2210000_27.s0, afS2S2210000_27.s1, (Map) afS2S2210000_27.l3);
        }
        C1C7U.LIZIZ("PcsMonitor@2ed9.monitorPcsApi$2");
    }

    public static final void accept$1(AfS2S2210000_27 afS2S2210000_27, Object obj) {
        C1C7U.LIZ("PcsMonitor@2ed9.monitorPcsApi$4");
        C1808280x9m.LIZ((C1808300x9o) afS2S2210000_27.l2, afS2S2210000_27.s0, afS2S2210000_27.s1, (Throwable) obj, (Map) afS2S2210000_27.l3, afS2S2210000_27.z4);
        C1C7U.LIZIZ("PcsMonitor@2ed9.monitorPcsApi$4");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS2S2210000_27(X.C1808300x9o r2, java.lang.String r3, java.lang.String r4, java.util.Map r5, boolean r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            if (r7 == 0) goto L13
            r0 = r1
            r0.l2 = r2
            r0.s0 = r3
            r0.s1 = r4
            r0.l3 = r5
            r0.z4 = r6
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.z4 = r6
            r0.l2 = r2
            r0.s0 = r3
            r0.s1 = r4
            r0.l3 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S2210000_27.<init>(X.0x9o, java.lang.String, java.lang.String, java.util.Map, boolean, int):void");
    }
}
