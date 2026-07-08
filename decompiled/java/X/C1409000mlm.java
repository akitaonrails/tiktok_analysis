package X;

import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS427S0200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0mlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem$initSubscriber$18$1", f = "EcSearchNoCartFeedVideoGuideAssem.kt", l = {620}, m = "invokeSuspend")
public final class C1409000mlm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSearchNoCartFeedVideoGuideAssem LLILLJJLI;
    public final /* synthetic */ C1770220wAO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409000mlm(EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem, C1770220wAO c1770220wAO, InterfaceC1364105Vn<? super C1409000mlm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchNoCartFeedVideoGuideAssem;
        this.LLILLL = c1770220wAO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409000mlm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchNoCartFeedVideoGuideAssem@a3d6.initSubscriber$18$1");
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
            EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem = this.LLILLJJLI;
            if (!ecSearchNoCartFeedVideoGuideAssem.LLLILZJ) {
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                ecSearchNoCartFeedVideoGuideAssem.LLLILZ = c2252611DEt;
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("EcSearchNoCartFeedVideoGuideAssem@a3d6.initSubscriber$18$1");
                    return objLJFF;
                }
            }
        }
        EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem2 = this.LLILLJJLI;
        C1770220wAO c1770220wAO = this.LLILLL;
        ecSearchNoCartFeedVideoGuideAssem2.getClass();
        C0CNO.LIZLLL(0L, new AwS427S0200000_26(ecSearchNoCartFeedVideoGuideAssem2, c1770220wAO, 59));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchNoCartFeedVideoGuideAssem@a3d6.initSubscriber$18$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
