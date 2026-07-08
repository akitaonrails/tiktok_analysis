package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository$1$1$onAffinityReady$1", f = "MufAffinityScoreRepository.kt", l = {88}, m = "invokeSuspend")
public final class C05OP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MufAffinityScoreRepository LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OP(MufAffinityScoreRepository mufAffinityScoreRepository, InterfaceC1364105Vn<? super C05OP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mufAffinityScoreRepository;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MufAffinityScoreRepository@53bc.<init>$1$1$onAffinityReady$1");
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
            MufAffinityScoreRepository mufAffinityScoreRepository = this.LLILLJJLI;
            this.LL = 1;
            if (mufAffinityScoreRepository.LJ(this) == objLJFF) {
                C1C7U.LIZIZ("MufAffinityScoreRepository@53bc.<init>$1$1$onAffinityReady$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MufAffinityScoreRepository@53bc.<init>$1$1$onAffinityReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
