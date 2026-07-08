package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.db.SearchDislikeDataBase$recordDislikedAweme$1$1", f = "SearchDislikeItem.kt", l = {104}, m = "invokeSuspend")
public final class C0NMJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NMK LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NMJ(C0NMK c0nmk, String str, String str2, InterfaceC1364105Vn<? super C0NMJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nmk;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NMJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SearchDislikeDataBase@d041.recordDislikedAweme$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0NML c0nml = (C0NML) C13LP.LJJJLL(this.LLILLJJLI.LIZJ());
            if (c0nml != null) {
                i = (c0nml.LIZ + 1) % 2000;
            } else {
                i = 0;
            }
            C0NMK c0nmk = this.LLILLJJLI;
            C0NML c0nml2 = new C0NML(i, this.LLILLL);
            this.LL = 1;
            if (c0nmk.LIZ(c0nml2, this) == objLJFF) {
                C1C7U.LIZIZ("SearchDislikeDataBase@d041.recordDislikedAweme$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchDislikeDataBase@d041.recordDislikedAweme$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
