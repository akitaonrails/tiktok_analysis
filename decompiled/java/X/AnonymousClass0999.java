package X;

import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0999, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoAssem$onHolderSelected$1", f = "TakoAIVideoFeedVideoAssem.kt", l = {110}, m = "invokeSuspend")
public final class AnonymousClass0999 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAIVideoFeedVideoAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0999(TakoAIVideoFeedVideoAssem takoAIVideoFeedVideoAssem, InterfaceC1364105Vn<? super AnonymousClass0999> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAIVideoFeedVideoAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0999(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFeedVideoAssem@6b19.onHolderSelected$1");
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
            long jLJII = C19990313Jl.LJII(500, EnumC19990213Jk.MILLISECONDS);
            this.LL = 1;
            if (AnonymousClass0958.LIZJ(jLJII, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoFeedVideoAssem@6b19.onHolderSelected$1");
                return objLJFF;
            }
        }
        TranslationAbility translationAbilityKp = this.LLILLJJLI.kp();
        if (translationAbilityKp != null) {
            translationAbilityKp.JX0(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoFeedVideoAssem@6b19.onHolderSelected$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
