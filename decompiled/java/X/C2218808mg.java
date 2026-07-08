package X;

import com.ss.android.ugc.aweme.tako.arch.protocol.TakoCardContainerSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.arch.protocol.TakoCardContainerSharedVM$tryGetProtocolForSearchCardMetaData$1", f = "TakoProtoclManager.kt", l = {216}, m = "invokeSuspend")
public final class C2218808mg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoCardContainerSharedVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218808mg(TakoCardContainerSharedVM takoCardContainerSharedVM, InterfaceC1364105Vn<? super C2218808mg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoCardContainerSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2218808mg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("TakoCardContainerSharedVM@2a11.tryGetProtocolForSearchCardMetaData$1");
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
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LLILZIL;
            if (anonymousClass0956 != null) {
                this.LL = 1;
                if (anonymousClass0956.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("TakoCardContainerSharedVM@2a11.tryGetProtocolForSearchCardMetaData$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("TakoCardContainerSharedVM@2a11.tryGetProtocolForSearchCardMetaData$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoCardContainerSharedVM@2a11.tryGetProtocolForSearchCardMetaData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
