package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05R3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$3$1$2", f = "TakoContentPreviewAssem.kt", l = {286, 287, 296}, m = "invokeSuspend")
public final class C05R3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05UN LLILLL;
    public final /* synthetic */ TakoContentPreviewAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05R3(TakoContentPreviewAssem takoContentPreviewAssem, C05UN c05un, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05un;
        this.LLILZ = takoContentPreviewAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05R3 c05r3 = new C05R3(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c05r3.LLILLJJLI = obj;
        return c05r3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "TakoContentPreviewAssem@36ab.RenderUi$3$3$1$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LL
            r8 = 0
            r6 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L20
            if (r0 == r3) goto L4b
            if (r0 == r4) goto L66
            if (r0 != r6) goto L9b
            X.C155000ia.LIZIZ(r11)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L20:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r5 = r10.LLILLJJLI
            X.01wk r5 = (X.InterfaceC497601wk) r5
            kotlin.jvm.internal.AwS546S0100000_2 r2 = new kotlin.jvm.internal.AwS546S0100000_2
            X.05UN r1 = r10.LLILLL
            r0 = 857(0x359, float:1.201E-42)
            r2.<init>(r1, r0)
            X.095D r0 = X.C20028913Yh.LJIIIZ(r2)
            X.01Wa r1 = X.C09IC.LJIILL(r0)
            X.059W r0 = new X.059W
            r0.<init>(r8)
            r10.LLILLJJLI = r5
            r10.LL = r3
            java.lang.Object r0 = X.C09IC.LJIJ(r1, r10, r0)
            if (r0 != r7) goto L52
            X.C1C7U.LIZIZ(r9)
            return r7
        L4b:
            java.lang.Object r5 = r10.LLILLJJLI
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.C155000ia.LIZIZ(r11)
        L52:
            r0 = 526(0x20e, float:7.37E-43)
            kotlin.jvm.internal.AFwS229S0000000_2 r0 = kotlin.jvm.internal.AFwS229S0000000_2.get$arr$(r0)
            r10.LLILLJJLI = r5
            r10.LL = r4
            java.lang.Object r0 = X.C1838620xwi.LIZIZ(r10, r0)
            if (r0 != r7) goto L6d
            X.C1C7U.LIZIZ(r9)
            return r7
        L66:
            java.lang.Object r5 = r10.LLILLJJLI
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.C155000ia.LIZIZ(r11)
        L6d:
            kotlin.jvm.internal.AwS546S0100000_2 r2 = new kotlin.jvm.internal.AwS546S0100000_2
            X.05UN r1 = r10.LLILLL
            r0 = 858(0x35a, float:1.202E-42)
            r2.<init>(r1, r0)
            X.095D r1 = X.C20028913Yh.LJIIIZ(r2)
            X.05RH r0 = new X.05RH
            r0.<init>(r1)
            X.01Wa r4 = X.C09IC.LJIILL(r0)
            Y.AgS162S0300000_2 r3 = new Y.AgS162S0300000_2
            com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem r2 = r10.LLILZ
            X.05UN r1 = r10.LLILLL
            r0 = 0
            r3.<init>(r2, r5, r1, r0)
            r10.LLILLJJLI = r8
            r10.LL = r6
            java.lang.Object r0 = r4.collect(r3, r10)
            if (r0 != r7) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r7
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05R3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
