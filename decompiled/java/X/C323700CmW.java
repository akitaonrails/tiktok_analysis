package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ext.AdapterLoader$loadMore$1", f = "AdapterCompat.kt", l = {150}, m = "invokeSuspend")
public final class C323700CmW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C323720CmY<T> LLILZ;
    public final /* synthetic */ T LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323700CmW(C323720CmY<T> c323720CmY, T t, InterfaceC1364105Vn<? super C323700CmW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c323720CmY;
        this.LLILZIL = t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323700CmW c323700CmW = new C323700CmW(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c323700CmW.LLILLL = obj;
        return c323700CmW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdapterLoader@e319.loadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Object obj2 = this.LLILLL;
                C323720CmY<T> c323720CmY = this.LLILZ;
                Object obj3 = this.LLILZIL;
                this.LLILLL = obj2;
                this.LL = obj3;
                this.LLILLJJLI = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c323720CmY.LLILZ = c2252611DEt;
                if (obj3 == null) {
                    obj3 = c323720CmY.LLILZIL;
                }
                if (obj3 != null) {
                    PowerPageSource powerPageSource = c323720CmY.LLILLL;
                    if (powerPageSource == null) {
                        powerPageSource = null;
                    }
                    powerPageSource.onLoadMore(c2252611DEt, obj3);
                } else {
                    C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                    IllegalStateException illegalStateException = new IllegalStateException("cursor is null!");
                    c317290CcB.getClass();
                    C316650Cb9 c316650Cb9 = new C316650Cb9(illegalStateException);
                    C189200o6.m2constructorimpl(c316650Cb9);
                    c2252611DEt.resumeWith(c316650Cb9);
                }
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AdapterLoader@e319.loadMore$1");
                    return objLJFF;
                }
            }
            AbstractC316870CbV abstractC316870CbV = (AbstractC316870CbV) obj;
            if (abstractC316870CbV instanceof C323380Cm0) {
                this.LLILZ.LLILZIL = ((C323380Cm0) abstractC316870CbV).LIZJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("AdapterLoader", "adapter loader loadMore error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdapterLoader@e319.loadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
