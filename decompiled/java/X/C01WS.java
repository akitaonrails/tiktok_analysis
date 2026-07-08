package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newcreatoredit.CECTransLanguageListController$fetchEditedTranslationList$1", f = "CECTransLanguageListController.kt", l = {52}, m = "invokeSuspend")
public final class C01WS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1826670xdR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WS(long j, C1826670xdR c1826670xdR, InterfaceC1364105Vn<? super C01WS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1826670xdR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CECTransLanguageListController@7d08.fetchEditedTranslationList$1");
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
            C01WT c01wt = new C01WT(this.LLILLJJLI, null);
            C5183020f c5183020f = new C5183020f(this.LLILLL, 326);
            AnonymousClass0207 anonymousClass0207 = AnonymousClass0207.get$arr$(152);
            this.LL = 1;
            if (C1840530xzn.LIZ(c01wt, c5183020f, anonymousClass0207, this) == objLJFF) {
                C1C7U.LIZIZ("CECTransLanguageListController@7d08.fetchEditedTranslationList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CECTransLanguageListController@7d08.fetchEditedTranslationList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
