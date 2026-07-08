package X;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.detail.categoryicon.CategoryIconExtKt$prefetchUri$2", f = "CategoryIconExt.kt", l = {138}, m = "invokeSuspend")
public final class C442190HVp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ EnumC1331380kka LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442190HVp(Uri uri, EnumC1331380kka enumC1331380kka, InterfaceC1364105Vn<? super C442190HVp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = uri;
        this.LLILLL = enumC1331380kka;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442190HVp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CategoryIconExtKt@d704.prefetchUri$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Uri uri = this.LLILLJJLI;
            EnumC1331380kka enumC1331380kka = this.LLILLL;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL.LJIIL = enumC1331380kka;
            C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            if (c1325540kbALIZ.LJIILJJIL(c1325710kbRLIZ)) {
                if (c2252611DEt.isActive()) {
                    C189200o6.m2constructorimpl(true);
                    c2252611DEt.resumeWith(true);
                }
            } else {
                c1325540kbALIZ.LJIJ(c1325710kbRLIZ, null).LIZJ(new C0HWE<Void>() { // from class: X.0HTX
                    @Override // X.C0HWE
                    public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                        if (c2252611DEt.isActive()) {
                            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                            Boolean bool = Boolean.FALSE;
                            C189200o6.m2constructorimpl(bool);
                            interfaceC20236714Gf.resumeWith(bool);
                        }
                    }

                    @Override // X.C0HWE
                    public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                        if (c2252611DEt.isActive()) {
                            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                            Boolean bool = Boolean.TRUE;
                            C189200o6.m2constructorimpl(bool);
                            interfaceC20236714Gf.resumeWith(bool);
                        }
                    }
                }, C823050WQl.LIZLLL());
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CategoryIconExtKt@d704.prefetchUri$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CategoryIconExtKt@d704.prefetchUri$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
