package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0srN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$onClick$1", f = "OptionCategoryViewModel.kt", l = {60, BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1643110srN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1643220srY LLILLL;
    public final /* synthetic */ OptionCategoryViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643110srN(C1643220srY c1643220srY, OptionCategoryViewModel optionCategoryViewModel, InterfaceC1364105Vn<? super C1643110srN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1643220srY;
        this.LLILZ = optionCategoryViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1643110srN c1643110srN = new C1643110srN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1643110srN.LLILLJJLI = obj;
        return c1643110srN;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r8 = "OptionCategoryViewModel@f2b8.onClick$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 2
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L1d
            if (r0 == r6) goto L42
            if (r0 != r7) goto L6b
            X.C155000ia.LIZIZ(r10)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r1 = r9.LLILLJJLI
            X.0srY r3 = r9.LLILLL
            X.0srg r0 = r3.LJ
            if (r0 == 0) goto L47
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel r2 = r9.LLILZ
            r9.LLILLJJLI = r1
            r9.LL = r6
            r2.getClass()
            X.1DFH r1 = X.C0PEM.LIZ
            X.0srM r0 = new X.0srM
            r0.<init>(r3, r2, r4)
            java.lang.Object r10 = X.C23250099c.LJI(r9, r1, r0)
            if (r10 != r5) goto L45
            X.C1C7U.LIZIZ(r8)
            return r5
        L42:
            X.C155000ia.LIZIZ(r10)
        L45:
            if (r10 != 0) goto L17
        L47:
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel r3 = r9.LLILZ
            X.0srY r2 = r9.LLILLL
            r9.LLILLJJLI = r4
            r9.LL = r7
            r3.getClass()
            X.1DFH r1 = X.C0PEM.LIZ
            X.0srO r0 = new X.0srO
            r0.<init>(r2, r3, r4)
            java.lang.Object r1 = X.C23250099c.LJI(r9, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L65
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L65:
            if (r1 != r5) goto L17
            X.C1C7U.LIZIZ(r8)
            return r5
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1643110srN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
