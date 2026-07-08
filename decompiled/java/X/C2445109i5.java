package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09i5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel$checkComponentShowCondition$1", f = "FYPFollowingSuggestViewModel.kt", l = {43, 51, 56}, m = "invokeSuspend")
public final class C2445109i5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FYPFollowingSuggestViewModel LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2445109i5(FYPFollowingSuggestViewModel fYPFollowingSuggestViewModel, Aweme aweme, InterfaceC1364105Vn<? super C2445109i5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fYPFollowingSuggestViewModel;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2445109i5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
            return unit3;
        }
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.vQ2().LIZ(C2445509i9.LIZ);
        C2447809iW c2447809iW = C2447809iW.LIZ;
        Aweme aweme = this.LLILLL;
        c2447809iW.getClass();
        C2445609iA c2445609iALIZ = C2447809iW.LIZ(aweme, false);
        if (!c2445609iALIZ.LIZ) {
            FYPFollowingSuggestViewModel fYPFollowingSuggestViewModel = this.LLILLJJLI;
            Aweme aweme2 = this.LLILLL;
            String str = c2445609iALIZ.LIZIZ;
            this.LL = 1;
            fYPFollowingSuggestViewModel.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C2444909i3(fYPFollowingSuggestViewModel, str, aweme2, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
                return objLJFF;
            }
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
            return unit32;
        }
        C2445009i4 c2445009i4 = (C2445009i4) this.LLILLJJLI.LLILLJJLI.getValue();
        if (!c2445009i4.LIZ.contains(this.LLILLL.getAid()) && !C2445309i7.LIZ()) {
            FYPFollowingSuggestViewModel fYPFollowingSuggestViewModel2 = this.LLILLJJLI;
            Aweme aweme3 = this.LLILLL;
            this.LL = 2;
            fYPFollowingSuggestViewModel2.getClass();
            C1DFH c1dfh2 = C0PEM.LIZ;
            Object objLJI2 = C23250099c.LJI(this, C2107308Nj.LIZ, new C2444909i3(fYPFollowingSuggestViewModel2, "block by frequent control", aweme3, null));
            if (objLJI2 != C099R.LJFF()) {
                objLJI2 = Unit.LIZ;
            }
            if (objLJI2 == objLJFF) {
                C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
            return unit22;
        }
        FYPFollowingSuggestViewModel fYPFollowingSuggestViewModel3 = this.LLILLJJLI;
        Aweme aweme4 = this.LLILLL;
        this.LL = 3;
        fYPFollowingSuggestViewModel3.getClass();
        C1DFH c1dfh3 = C0PEM.LIZ;
        Object objLJI3 = C23250099c.LJI(this, C2107308Nj.LIZ, new C2444509hz(fYPFollowingSuggestViewModel3, aweme4, null));
        if (objLJI3 != C099R.LJFF()) {
            objLJI3 = Unit.LIZ;
        }
        if (objLJI3 == objLJFF) {
            C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("FYPFollowingSuggestViewModel@e671.checkComponentShowCondition$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
