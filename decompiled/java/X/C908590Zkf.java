package X;

import Y.AgS295S0100000_14;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.effect.CategoryEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.effect.CategoryEffectViewModel$retrieveEffect$1", f = "CategoryEffectViewModel.kt", l = {56, 56}, m = "invokeSuspend")
public final class C908590Zkf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CategoryEffectViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C908590Zkf(CategoryEffectViewModel categoryEffectViewModel, Context context, InterfaceC1364105Vn<? super C908590Zkf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = categoryEffectViewModel;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C908590Zkf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CategoryEffectViewModel@53b4.retrieveEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CategoryEffectViewModel@53b4.retrieveEffect$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LLILLJJLI.setValue(C908640Zkk.LIZ);
            InterfaceC911530ZpP interfaceC911530ZpP = this.LLILLJJLI.LLILZ;
            Context context = this.LLILLL;
            this.LL = 1;
            obj = interfaceC911530ZpP.LIZIZ(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CategoryEffectViewModel@53b4.retrieveEffect$1");
                return objLJFF;
            }
        }
        AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 12);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS295S0100000_14, this) == objLJFF) {
            C1C7U.LIZIZ("CategoryEffectViewModel@53b4.retrieveEffect$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CategoryEffectViewModel@53b4.retrieveEffect$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
