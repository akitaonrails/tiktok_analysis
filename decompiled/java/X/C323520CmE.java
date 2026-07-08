package X;

import Y.AgS97S1100000_4;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel$updateAndCollectFlowFromFetchManager$1$1", f = "AwemeStatusViewModel.kt", l = {123}, m = "invokeSuspend")
public final class C323520CmE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<InterfaceC327200CsA> LLILLJJLI;
    public final /* synthetic */ AwemeStatusViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C323520CmE(C05YD<? extends InterfaceC327200CsA> c05yd, AwemeStatusViewModel awemeStatusViewModel, String str, InterfaceC1364105Vn<? super C323520CmE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = awemeStatusViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323520CmE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeStatusViewModel@fcd9.updateAndCollectFlowFromFetchManager$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<InterfaceC327200CsA> c05yd = this.LLILLJJLI;
            AgS97S1100000_4 agS97S1100000_4 = new AgS97S1100000_4(this.LLILLL, this.LLILZ, 2);
            this.LL = 1;
            if (c05yd.collect(agS97S1100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("AwemeStatusViewModel@fcd9.updateAndCollectFlowFromFetchManager$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
