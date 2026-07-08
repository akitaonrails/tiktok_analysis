package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$launchTrimPanel$2", f = "LyricStickerEffectUIComponent.kt", l = {480, 486, 487, 491}, m = "invokeSuspend")
public final class C1391605cY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C389110FNl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391605cY(C389110FNl c389110FNl, InterfaceC1364105Vn<? super C1391605cY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389110FNl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1391605cY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "LyricStickerEffectUIComponent@df9c.launchTrimPanel$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 4
            r6 = 3
            r1 = 2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L23
            if (r0 == r5) goto L8e
            if (r0 == r1) goto L4d
            if (r0 == r6) goto L97
            if (r0 != r7) goto L86
            X.C155000ia.LIZIZ(r10)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L23:
            X.C155000ia.LIZIZ(r10)
            X.0FNl r2 = r9.LLILLJJLI
            X.0957<java.lang.Boolean> r0 = r2.LLJZIJLIL
            if (r0 != 0) goto L41
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05ca r0 = new X.05ca
            r0.<init>(r2, r4)
            r9.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r9, r1, r0)
            if (r0 != r3) goto L91
            X.C1C7U.LIZIZ(r8)
            return r3
        L41:
            r9.LL = r1
            java.lang.Object r10 = r0.LJLIIIL(r9)
            if (r10 != r3) goto L50
            X.C1C7U.LIZIZ(r8)
            return r3
        L4d:
            X.C155000ia.LIZIZ(r10)
        L50:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L6f
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.05cX r1 = new X.05cX
            X.0FNl r0 = r9.LLILLJJLI
            r1.<init>(r0, r4)
            r9.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r3) goto L9a
            X.C1C7U.LIZIZ(r8)
            return r3
        L6f:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.05cZ r1 = new X.05cZ
            X.0FNl r0 = r9.LLILLJJLI
            r1.<init>(r0, r4)
            r9.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r3) goto L1d
            X.C1C7U.LIZIZ(r8)
            return r3
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8e:
            X.C155000ia.LIZIZ(r10)
        L91:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L97:
            X.C155000ia.LIZIZ(r10)
        L9a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1391605cY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
