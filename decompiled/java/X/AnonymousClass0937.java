package X;

import Y.AgS194S0200000_3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0937, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.util.CorotuineKt$sampleAndKeepLast$2", f = "Corotuine.kt", l = {42, 51}, m = "invokeSuspend")
public final class AnonymousClass0937 extends C09AX implements Function2<C094D<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AnonymousClass0956 LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ InterfaceC346201Wa LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0937(InterfaceC346201Wa interfaceC346201Wa, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = interfaceC346201Wa;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0937 anonymousClass0937 = new AnonymousClass0937(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        anonymousClass0937.LLILZ = obj;
        return anonymousClass0937;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super String> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        AnonymousClass0955 anonymousClass0955;
        C1C7U.LIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitle$1$1$invokeSuspend$$inlined$sampleAndKeepLast$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitle$1$1$invokeSuspend$$inlined$sampleAndKeepLast$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0956LIZLLL = this.LLILLJJLI;
            atomicReference = (AtomicReference) this.LL;
            AnonymousClass0955 anonymousClass09552 = (AnonymousClass0955) this.LLILZ;
            C155000ia.LIZIZ(obj);
            anonymousClass0955 = anonymousClass09552;
        } else {
            C155000ia.LIZIZ(obj);
            C094D c094d = (C094D) this.LLILZ;
            atomicReference = new AtomicReference(AnonymousClass0938.LIZ);
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(c094d, null, C099V.LAZY, new AnonymousClass0936(this.LLILZLL, atomicReference, c094d, null), 1);
            InterfaceC346201Wa interfaceC346201Wa = this.LLILZIL;
            AgS194S0200000_3 agS194S0200000_3 = new AgS194S0200000_3(atomicReference, anonymousClass0956LIZLLL, 2);
            this.LLILZ = c094d;
            this.LL = atomicReference;
            this.LLILLJJLI = anonymousClass0956LIZLLL;
            this.LLILLL = 1;
            anonymousClass0955 = c094d;
            if (interfaceC346201Wa.collect(agS194S0200000_3, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitle$1$1$invokeSuspend$$inlined$sampleAndKeepLast$1");
                return objLJFF;
            }
        }
        anonymousClass0956LIZLLL.LIZIZ(null);
        Object obj2 = AnonymousClass0938.LIZ;
        Object andSet = atomicReference.getAndSet(obj2);
        if (andSet != obj2 && (andSet instanceof String)) {
            this.LLILZ = null;
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = 2;
            if (anonymousClass0955.LJIJI(andSet, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitle$1$1$invokeSuspend$$inlined$sampleAndKeepLast$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVoiceInputKt@6e25.StreamingSubtitle$1$1$invokeSuspend$$inlined$sampleAndKeepLast$1");
        return unit2;
    }
}
