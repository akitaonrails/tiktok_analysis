package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.share.TakoShareImageShowViewKt$TakoShareImageSharedElementPreview$3$1", f = "TakoShareImageShowView.kt", l = {221, 222, 225}, m = "invokeSuspend")
public final class C1361105Uj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1361305Ul LLILLJJLI;
    public final /* synthetic */ TakoContentPreviewItem.Image LLILLL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ C05P0<C1683130ttv> LLILZLL;
    public final /* synthetic */ C05P0<C05UQ> LLIZ;
    public final /* synthetic */ C05P0<InterfaceC1692950u9l> LLIZLLLIL;
    public final /* synthetic */ C05P0<Boolean> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361105Uj(InterfaceC1361305Ul interfaceC1361305Ul, TakoContentPreviewItem.Image image, C1677480tko<Float, C1677280tkU> c1677480tko, Function0<Unit> function0, C05P0<C1683130ttv> c05p0, C05P0<C05UQ> c05p02, C05P0<InterfaceC1692950u9l> c05p03, C05P0<Boolean> c05p04, InterfaceC1364105Vn<? super C1361105Uj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1361305Ul;
        this.LLILLL = image;
        this.LLILZ = c1677480tko;
        this.LLILZIL = function0;
        this.LLILZLL = c05p0;
        this.LLIZ = c05p02;
        this.LLIZLLLIL = c05p03;
        this.LLJ = c05p04;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1361105Uj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r7 = "TakoShareImageShowViewKt@b200.TakoShareImageSharedElementPreview$3$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r4 = 3
            r5 = 2
            r6 = 1
            r11 = 0
            if (r0 == 0) goto L25
            if (r0 == r6) goto L61
            if (r0 == r5) goto L82
            if (r0 != r4) goto Lb6
            X.C155000ia.LIZIZ(r14)
        L1a:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.LLILZIL
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L25:
            X.C155000ia.LIZIZ(r14)
            X.05P0<X.0ttv> r2 = r13.LLILZLL
            X.05Ul r1 = r13.LLILLJJLI
            if (r1 == 0) goto L5f
            com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image r0 = r13.LLILLL
            java.lang.String r0 = r0.itemUUID
            X.0ttv r0 = r1.aa(r0)
        L36:
            r2.setValue(r0)
            X.05P0<X.05UQ> r2 = r13.LLIZ
            X.05Ul r1 = r13.LLILLJJLI
            if (r1 == 0) goto L5d
            com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image r0 = r13.LLILLL
            java.lang.String r0 = r0.itemUUID
            X.05UQ r0 = r1.Y8(r0)
        L47:
            r2.setValue(r0)
            X.0tko<java.lang.Float, X.0tkU> r1 = r13.LLILZ
            r0 = 0
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)
            r13.LL = r6
            java.lang.Object r0 = r1.LJFF(r0, r13)
            if (r0 != r3) goto L64
            X.C1C7U.LIZIZ(r7)
            return r3
        L5d:
            r0 = r11
            goto L47
        L5f:
            r0 = r11
            goto L36
        L61:
            X.C155000ia.LIZIZ(r14)
        L64:
            kotlin.jvm.internal.AwS546S0100000_2 r2 = new kotlin.jvm.internal.AwS546S0100000_2
            X.05P0<X.0u9l> r1 = r13.LLIZLLLIL
            r0 = 11
            r2.<init>(r1, r0)
            X.095D r1 = X.C20028913Yh.LJIIIZ(r2)
            X.05Uk r0 = new X.05Uk
            r0.<init>(r11)
            r13.LL = r5
            java.lang.Object r0 = X.C09IC.LJIJ(r1, r13, r0)
            if (r0 != r3) goto L85
            X.C1C7U.LIZIZ(r7)
            return r3
        L82:
            X.C155000ia.LIZIZ(r14)
        L85:
            X.05P0<java.lang.Boolean> r1 = r13.LLJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            X.05Ul r1 = r13.LLILLJJLI
            r2 = 0
            if (r1 == 0) goto L98
            com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image r0 = r13.LLILLL
            java.lang.String r0 = r0.itemUUID
            r1.Of(r0, r2)
        L98:
            X.0tko<java.lang.Float, X.0tkU> r8 = r13.LLILZ
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = X.C2286608xc.LIZLLL(r0)
            r1 = 300(0x12c, float:4.2E-43)
            r0 = 6
            X.0tk7 r10 = X.C1671550tbF.LIZLLL(r1, r2, r11, r0)
            r14 = 12
            r13.LL = r4
            r12 = r11
            java.lang.Object r0 = X.C1677480tko.LIZJ(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r3) goto L1a
            X.C1C7U.LIZIZ(r7)
            return r3
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1361105Uj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
