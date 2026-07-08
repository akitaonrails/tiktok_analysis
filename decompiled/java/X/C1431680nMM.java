package X;

import X.C2296808zG;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431680nMM {
    public final LifecycleOwner LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(306));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(747));

    public C1431680nMM(C1462070o9N c1462070o9N) {
        this.LIZ = c1462070o9N;
        c1462070o9N.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.tools.infosticker.repository.internal.upload.CustomStickerUploader$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event.getTargetState() == Lifecycle.State.DESTROYED) {
                    C2296808zG.LIZJ((InterfaceC497601wk) this.LL.LIZJ.getValue(), null);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final X.C2207831Bb3 r7, java.lang.String r8, final java.lang.String r9, X.InterfaceC1364105Vn r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1431690nMN
            if (r0 == 0) goto L7b
            r4 = r10
            X.0nMN r4 = (X.C1431690nMN) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L81
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            r4.getClass()
            r4.LL = r8
            r4.LLILLJJLI = r9
            r4.LLILZIL = r3
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r0)
            X.0nMK r0 = new X.0nMK
            r0.<init>()
            r7.LJIIJ(r0)
            java.lang.String[] r1 = new java.lang.String[r3]
            r0 = 0
            r1[r0] = r8
            r7.LJIIIZ(r3, r1)
            r7.LJIILIIL()     // Catch: java.io.IOException -> L52
            goto L6b
        L52:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
            X.C189200o6.m2constructorimpl(r0)
            r2.resumeWith(r0)
            r7.LIZJ()
        L6b:
            java.lang.Object r1 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L78
            X.C099Q.LIZJ(r4)
        L78:
            if (r1 != r5) goto L22
            return r5
        L7b:
            X.0nMN r4 = new X.0nMN
            r4.<init>(r6, r10)
            goto L12
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431680nMM.LIZ(X.1Bb3, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
