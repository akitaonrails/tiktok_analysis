package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.aweme.creation.base.SpecialEffectResModel;

/* JADX INFO: renamed from: X.0MhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575220MhE implements InterfaceC575170Mh9<SpecialEffectResModel, Effect> {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.ugc.aweme.creation.base.SpecialEffectResModel r10, X.InterfaceC1364105Vn r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C575230MhF
            if (r0 == 0) goto L71
            r8 = r11
            X.0MhF r8 = (X.C575230MhF) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r1 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r6 = 1
            if (r0 == 0) goto L38
            if (r0 != r6) goto L77
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r1.getFirst()
            java.lang.Object r2 = r1.getSecond()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L37
            X.13Rx r1 = X.C20012313Rx.LIZIZ
            java.lang.String r0 = "SpecialEffectResModelParser downloadEffect error"
            X.C201955140j.LJIIJ(r1, r0, r2)
        L37:
            return r3
        L38:
            X.C155000ia.LIZIZ(r1)
            android.app.Application r2 = X.C0CHQ.LIZ
            java.lang.String r1 = r10.getEffectId()
            r8.LLILLL = r6
            X.1DEt r5 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r8)
            r5.<init>(r6, r0)
            r5.LJIJJ()
            r4 = 0
            X.0sex r3 = X.C1633850scR.LIZ(r2, r4)
            java.util.List r2 = java.util.Collections.singletonList(r1)
            X.0Mqf r1 = new X.0Mqf
            r0 = 5
            r1.<init>(r5, r0)
            r3.LJFF(r2, r6, r4, r1)
            java.lang.Object r1 = r5.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L6e
            X.C099Q.LIZJ(r8)
        L6e:
            if (r1 != r7) goto L22
            return r7
        L71:
            X.0MhF r8 = new X.0MhF
            r8.<init>(r9, r11)
            goto L12
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575220MhE.LIZIZ(com.ss.ugc.aweme.creation.base.SpecialEffectResModel, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC575170Mh9
    public final /* bridge */ /* synthetic */ Object LIZ(Object obj, C569090MTr c569090MTr, C575700Mi0 c575700Mi0) {
        return LIZIZ((SpecialEffectResModel) obj, c575700Mi0);
    }
}
