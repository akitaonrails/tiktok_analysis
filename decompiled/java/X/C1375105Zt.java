package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend")
public final class C1375105Zt extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass0956 LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLIZ;
    public final /* synthetic */ C1697530uH9 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1375105Zt(InterfaceC497601wk interfaceC497601wk, InterfaceC1631620sYq<? super InterfaceC595070NVp, ? super C1378605aS, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, Function1<? super C1378605aS, Unit> function1, C1697530uH9 c1697530uH9, InterfaceC1364105Vn<? super C1375105Zt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = interfaceC497601wk;
        this.LLILZLL = interfaceC1631620sYq;
        this.LLIZ = function1;
        this.LLIZLLLIL = c1697530uH9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1375105Zt c1375105Zt = new C1375105Zt(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1375105Zt.LLILZ = obj;
        return c1375105Zt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r7 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L47
            if (r0 == r9) goto L6f
            if (r0 != r7) goto L9e
            java.lang.Object r8 = r10.LLILZ
            X.09AE r8 = (X.C09AE) r8
            X.C155000ia.LIZIZ(r11)
        L16:
            X.13fO r11 = (X.C20066813fO) r11
            if (r11 != 0) goto L29
            X.01wk r2 = r10.LLILZIL
            X.05Zw r1 = new X.05Zw
            X.0uH9 r0 = r10.LLIZLLLIL
            r1.<init>(r0, r5)
            X.C1374405Zm.LJI(r2, r8, r1)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            r11.LIZ()
            X.01wk r2 = r10.LLILZIL
            X.05Zx r1 = new X.05Zx
            X.0uH9 r0 = r10.LLIZLLLIL
            r1.<init>(r0, r5)
            X.C1374405Zm.LJI(r2, r8, r1)
            kotlin.jvm.functions.Function1<X.05aS, kotlin.Unit> r3 = r10.LLIZ
            if (r3 == 0) goto L26
            long r1 = r11.LIZJ
            X.05aS r0 = new X.05aS
            r0.<init>(r1)
            r3.invoke(r0)
            goto L26
        L47:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r4 = r10.LLILZ
            X.05ZT r4 = (X.C05ZT) r4
            X.01wk r3 = r10.LLILZIL
            X.05V7 r0 = X.C1374405Zm.LIZ
            X.099V r2 = X.C099V.UNDISPATCHED
            X.05Zv r1 = new X.05Zv
            X.0uH9 r0 = r10.LLIZLLLIL
            r1.<init>(r0, r5)
            X.0956 r8 = X.C23250099c.LIZLLL(r3, r5, r2, r1, r9)
            r10.LLILZ = r4
            r10.LLILLJJLI = r8
            r10.LLILLL = r9
            r1 = 1
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r11 = X.C1374405Zm.LIZIZ(r4, r1, r0, r10)
            if (r11 != r6) goto L78
            return r6
        L6f:
            X.0956 r8 = r10.LLILLJJLI
            java.lang.Object r4 = r10.LLILZ
            X.05ZT r4 = (X.C05ZT) r4
            X.C155000ia.LIZIZ(r11)
        L78:
            X.13fO r11 = (X.C20066813fO) r11
            r11.LIZ()
            X.0sYq<X.0NVp, X.05aS, X.05Vn<? super kotlin.Unit>, java.lang.Object> r3 = r10.LLILZLL
            X.05V7 r0 = X.C1374405Zm.LIZ
            if (r3 == r0) goto L8f
            X.01wk r2 = r10.LLILZIL
            X.05Zu r1 = new X.05Zu
            X.0uH9 r0 = r10.LLIZLLLIL
            r1.<init>(r3, r0, r11, r5)
            X.C1374405Zm.LJI(r2, r8, r1)
        L8f:
            r10.LLILZ = r8
            r10.LLILLJJLI = r5
            r10.LLILLL = r7
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r11 = X.C1374405Zm.LJIIIIZZ(r4, r0, r10)
            if (r11 != r6) goto L16
            return r6
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1375105Zt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
