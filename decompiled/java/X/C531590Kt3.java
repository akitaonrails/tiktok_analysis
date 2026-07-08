package X;

import android.app.Activity;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0Kt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531590Kt3 implements InterfaceC522520KeQ {
    public final Activity LL;
    public final long LLILLJJLI;
    public final InterfaceC533910Kwn LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(23));

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public C531590Kt3(Activity activity, long j, long j2) {
        this.LL = activity;
        this.LLILLJJLI = j2;
        this.LLILLL = C0CHQ.LIZ().LJJJJLL().LIZ(activity, j, j2, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    @Override // X.InterfaceC522520KeQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r0 = -1
            r1 = r19
            if (r1 == r0) goto L6
            return
        L6:
            java.lang.String r0 = "key_choose_media_data"
            r5 = r20
            java.util.ArrayList r3 = r5.getParcelableArrayListExtra(r0)
            if (r3 != 0) goto L11
            return
        L11:
            int r0 = X.C530180Kqm.LIZIZ
            r10 = r17
            android.app.Activity r11 = r10.LL
            r13 = 0
            long r0 = r10.LLILLJJLI
            r12 = r3
            r15 = r0
            X.0HZe r1 = X.C530180Kqm.LIZ(r11, r12, r13, r15)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r0 = r1.getThird()
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            int r1 = r3.size()
            int r1 = r1 - r4
            r0 = 1
            if (r4 != 0) goto L6f
            if (r1 < r0) goto L7b
            java.lang.String r6 = "photo"
        L4a:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0KlF r2 = new X.0KlF
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r9)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r9, r9, r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r9.<init>(r1)
            X.0Kwn r0 = r10.LLILLL
            kotlin.jvm.internal.AwS68S0301000_8 r8 = new kotlin.jvm.internal.AwS68S0301000_8
            r13 = 1
            r11 = r18
            r12 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r0.LIZJ(r3, r5, r1, r8)
            return
        L6f:
            if (r4 < r0) goto L7b
            if (r1 != 0) goto L76
            java.lang.String r6 = "video"
            goto L4a
        L76:
            if (r1 < r0) goto L7b
            java.lang.String r6 = "mix"
            goto L4a
        L7b:
            java.lang.String r6 = ""
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531590Kt3.LIZ(int, int, android.content.Intent):void");
    }
}
