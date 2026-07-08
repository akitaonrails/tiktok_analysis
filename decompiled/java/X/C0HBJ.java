package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter$processItemView$1", f = "AnchorPanelAdapter.kt", l = {666}, m = "invokeSuspend")
public final class C0HBJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05XL<Unit> LLILLJJLI;
    public final /* synthetic */ C424610Gkt LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C18MZ LLILZIL;
    public final /* synthetic */ AnchorProductInfoModel LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBJ(C05XL<Unit> c05xl, C424610Gkt c424610Gkt, String str, C18MZ c18mz, AnchorProductInfoModel anchorProductInfoModel, int i, InterfaceC1364105Vn<? super C0HBJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
        this.LLILLL = c424610Gkt;
        this.LLILZ = str;
        this.LLILZIL = c18mz;
        this.LLILZLL = anchorProductInfoModel;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnchorPanelAdapter@4c56.processItemView$1");
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
            C05XL<Unit> c05xl = this.LLILLJJLI;
            if (c05xl != null) {
                this.LL = 1;
                if (c05xl.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("AnchorPanelAdapter@4c56.processItemView$1");
                    return objLJFF;
                }
            }
        }
        C424610Gkt c424610Gkt = this.LLILLL;
        String str = this.LLILZ;
        try {
            C18MZ.LLLIL(this.LLIZ, c424610Gkt, this.LLILZIL, this.LLILZLL, str, false);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorPanelAdapter@4c56.processItemView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
