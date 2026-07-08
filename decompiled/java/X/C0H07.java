package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H07, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem$loadImage$1", f = "Lemon8ImageAssem.kt", l = {81}, m = "invokeSuspend")
public final class C0H07 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Lemon8ImageAssem LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H07(Lemon8ImageAssem lemon8ImageAssem, List<String> list, InterfaceC1364105Vn<? super C0H07> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lemon8ImageAssem;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H07(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "Lemon8ImageAssem@e58b.loadImage$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 1
            if (r0 == 0) goto L5f
            if (r0 != r5) goto L88
            X.C155000ia.LIZIZ(r9)
        L13:
            X.0GrK r9 = (X.C428600GrK) r9
            X.03IT r1 = new X.03IT
            java.util.List<java.lang.String> r0 = r8.LLILLL
            r1.<init>(r0)
            X.0kl3 r3 = X.C1331660kl2.LJIIJ(r1)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r3.LJIL = r0
            com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem r0 = r8.LLILLJJLI
            r0.getClass()
            r2 = 0
            if (r9 == 0) goto L5c
            int r1 = r9.LIZ
            int r0 = r9.LIZIZ
            if (r0 == 0) goto L5c
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L5c
            X.0kve r0 = X.EnumC1338240kve.CENTER_CROP
        L3d:
            r3.LJJ = r0
            com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem r0 = r8.LLILLJJLI
            com.bytedance.lighten.loader.SmartImageView r0 = r0.LLJLIL
            r3.LJJ(r0)
            r3.LJIILJJIL = r2
            X.0H5x r1 = new X.0H5x
            com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem r0 = r8.LLILLJJLI
            r1.<init>()
            r3.LJJJIL = r1
            X.0H09 r0 = r0.LLJLL
            r3.LJIIJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L5c:
            X.0kve r0 = X.EnumC1338240kve.FIT_CENTER
            goto L3d
        L5f:
            X.C155000ia.LIZIZ(r9)
            r4 = 0
            X.0kl3 r1 = X.C1331660kl2.LJIIIIZZ(r4)
            com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem r0 = r8.LLILLJJLI
            com.bytedance.lighten.loader.SmartImageView r0 = r0.LLJLIL
            r1.LJJ(r0)
            X.C786410Ut5.h3(r1)
            X.1DFB r3 = X.C0PEM.LIZJ
            X.0H06 r2 = new X.0H06
            java.util.List<java.lang.String> r1 = r8.LLILLL
            com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem r0 = r8.LLILLJJLI
            r2.<init>(r0, r1, r4)
            r8.LL = r5
            java.lang.Object r9 = X.C23250099c.LJI(r8, r3, r2)
            if (r9 != r6) goto L13
            X.C1C7U.LIZIZ(r7)
            return r6
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
