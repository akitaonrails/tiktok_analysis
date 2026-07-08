package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.otherpage.share.api.LoadShareMessageResponse;
import com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS384S0200000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM$requestShareMessageFlow$2$2", f = "TakoShareVM.kt", l = {95, 102}, m = "invokeSuspend")
public final class C1165120gQQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoShareVM LLILLJJLI;
    public final /* synthetic */ C1164760gPq LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1164760gPq>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1165120gQQ(TakoShareVM takoShareVM, C1164760gPq c1164760gPq, InterfaceC1364105Vn<? super AbstractC316870CbV<C1164760gPq>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1165120gQQ> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = takoShareVM;
        this.LLILLL = c1164760gPq;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165120gQQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoShareVM@a156.requestShareMessageFlow$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoShareVM@a156.requestShareMessageFlow$2$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1165180gQW interfaceC1165180gQW = (InterfaceC1165180gQW) this.LLILLJJLI.LL.getValue().getOperator();
            C1164760gPq c1164760gPq = this.LLILLL;
            String str = c1164760gPq.LIZ;
            String str2 = c1164760gPq.LIZIZ;
            this.LL = 1;
            obj = interfaceC1165180gQW.LLJJIJIL(str, str2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoShareVM@a156.requestShareMessageFlow$2$2");
                return objLJFF;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C1165130gQR(this.LLILLJJLI, this.LLILZ, null), (InterfaceC346201Wa) obj, 0);
        final TakoShareVM takoShareVM = this.LLILLJJLI;
        final InterfaceC1364105Vn<AbstractC316870CbV<C1164760gPq>> interfaceC1364105Vn = this.LLILZ;
        InterfaceC346701Wf<Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0gQ4
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn2) {
                String str3;
                Message message;
                LoadShareMessageResponse loadShareMessageResponse = (LoadShareMessageResponse) obj2;
                String str4 = takoShareVM.LLILLL;
                List<Message> list = loadShareMessageResponse.messages;
                if (list == null || (message = (Message) C13LP.LJJLIIIJL(list)) == null || (str3 = message.msgId) == null) {
                    str3 = "";
                }
                C1164760gPq c1164760gPq2 = new C1164760gPq(str4, str3);
                if (loadShareMessageResponse.hasMore) {
                    InterfaceC1364105Vn<AbstractC316870CbV<C1164760gPq>> interfaceC1364105Vn3 = interfaceC1364105Vn;
                    C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1164760gPq2, null, 5);
                    C189200o6.m2constructorimpl(c323380Cm0LJ);
                    interfaceC1364105Vn3.resumeWith(c323380Cm0LJ);
                } else {
                    InterfaceC1364105Vn<AbstractC316870CbV<C1164760gPq>> interfaceC1364105Vn4 = interfaceC1364105Vn;
                    C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                    C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
                    interfaceC1364105Vn4.resumeWith(c316640Cb8LIZIZ);
                }
                TakoShareVM takoShareVM2 = takoShareVM;
                takoShareVM2.setState(new AwS384S0200000_18(loadShareMessageResponse, takoShareVM2, 288));
                return Unit.LIZ;
            }
        };
        this.LL = 2;
        if (c2501109r7.collect(interfaceC346701Wf, this) == objLJFF) {
            C1C7U.LIZIZ("TakoShareVM@a156.requestShareMessageFlow$2$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoShareVM@a156.requestShareMessageFlow$2$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
