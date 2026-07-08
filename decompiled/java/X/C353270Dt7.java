package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.FreeLayerPanelUISlotComponent$refreshItemEffectIcon$1", f = "FreeLayerPanelUISlotComponent.kt", l = {473, 474, 480}, m = "invokeSuspend")
public final class C353270Dt7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0E1I LLILZ;
    public final /* synthetic */ List<C352950Dsb> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353270Dt7(C0E1I c0e1i, List<C352950Dsb> list, InterfaceC1364105Vn<? super C353270Dt7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0e1i;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C353270Dt7 c353270Dt7 = new C353270Dt7(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c353270Dt7.LLILLL = obj;
        return c353270Dt7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r11 = "FreeLayerPanelUISlotComponent@c5ab.refreshItemEffectIcon$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r6 = 3
            r10 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L3c
            if (r0 == r9) goto L6f
            if (r0 == r10) goto L8f
            if (r0 != r6) goto Lbd
            java.lang.Object r4 = r12.LLILLL
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r13)
        L1e:
            java.util.List r13 = (java.util.List) r13
            kotlin.coroutines.CoroutineContext r0 = r4.getCoroutineContext()
            boolean r0 = X.C23118094a.LJIIIIZZ(r0)
            if (r0 == 0) goto L36
            X.0E1I r2 = r12.LLILZ
            kotlin.jvm.internal.AwS584S0100000_5 r1 = new kotlin.jvm.internal.AwS584S0100000_5
            r0 = 620(0x26c, float:8.69E-43)
            r1.<init>(r13, r0)
            r2.i3(r1)
        L36:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L3c:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r4 = r12.LLILLL
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.1DFB r8 = X.C0PEM.LIZJ
            X.0Dt5 r2 = new X.0Dt5
            X.0E1I r1 = r12.LLILZ
            java.util.List<X.0Dsb> r0 = r12.LLILZIL
            r2.<init>(r1, r0, r5)
            X.099G r3 = X.C23250099c.LIZIZ(r4, r8, r5, r2, r10)
            X.0Dt6 r2 = new X.0Dt6
            X.0E1I r1 = r12.LLILZ
            java.util.List<X.0Dsb> r0 = r12.LLILZIL
            r2.<init>(r1, r0, r5)
            X.099G r0 = X.C23250099c.LIZIZ(r4, r8, r5, r2, r10)
            r12.LLILLL = r4
            r12.LL = r0
            r12.LLILLJJLI = r9
            java.lang.Object r13 = r3.LJLIIIL(r12)
            if (r13 != r7) goto L7a
            X.C1C7U.LIZIZ(r11)
            return r7
        L6f:
            java.lang.Object r0 = r12.LL
            X.0957 r0 = (X.AnonymousClass0957) r0
            java.lang.Object r4 = r12.LLILLL
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r13)
        L7a:
            java.util.List r13 = (java.util.List) r13
            r12.LLILLL = r4
            r12.LL = r13
            r12.LLILLJJLI = r10
            java.lang.Object r0 = r0.LJLIIIL(r12)
            if (r0 != r7) goto L8c
            X.C1C7U.LIZIZ(r11)
            return r7
        L8c:
            r3 = r13
            r13 = r0
            goto L9a
        L8f:
            java.lang.Object r3 = r12.LL
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r12.LLILLL
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r13)
        L9a:
            java.util.List r13 = (java.util.List) r13
            X.0E1I r0 = r12.LLILZ
            java.lang.Object r0 = r0.T2()
            X.0Dt8 r0 = (X.C353280Dt8) r0
            java.util.List<X.0Dsb> r2 = r0.LIZIZ
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0DsX r0 = new X.0DsX
            r0.<init>(r2, r13, r3, r5)
            r12.LLILLL = r4
            r12.LL = r5
            r12.LLILLJJLI = r6
            java.lang.Object r13 = X.C23250099c.LJI(r12, r1, r0)
            if (r13 != r7) goto L1e
            X.C1C7U.LIZIZ(r11)
            return r7
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353270Dt7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
