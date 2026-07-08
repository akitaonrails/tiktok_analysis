package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$loadMyEffectsData$1", f = "MyEffectsViewModel.kt", l = {114}, m = "invokeSuspend")
public final class C318240Cdi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MyEffectsViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318240Cdi(MyEffectsViewModel myEffectsViewModel, String str, String str2, InterfaceC1364105Vn<? super C318240Cdi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = myEffectsViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318240Cdi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MyEffectsViewModel@4e1b.loadMyEffectsData$1");
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
            MyEffectsViewModel myEffectsViewModel = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            myEffectsViewModel.getClass();
            Object objLJ = C2296808zG.LJ(new C318350Cdt(myEffectsViewModel, str, str2, null), this);
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("MyEffectsViewModel@4e1b.loadMyEffectsData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.loadMyEffectsData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
