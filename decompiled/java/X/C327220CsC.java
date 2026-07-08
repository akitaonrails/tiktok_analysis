package X;

import Y.AgS97S1100000_4;
import com.ss.android.ugc.aweme.im.common.service.IAwemeFetchManager;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.service.service.IAwemeCoverManager;
import java.util.Collections;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel$updateAndCollectFlowFromFetchManager$2", f = "AwemeStatusViewModel.kt", l = {132, 134}, m = "invokeSuspend")
public final class C327220CsC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AwemeStatusViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327220CsC(String str, AwemeStatusViewModel awemeStatusViewModel, InterfaceC1364105Vn<? super C327220CsC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = awemeStatusViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327220CsC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<InterfaceC327200CsA> c05ydLIZLLL;
        C1C7U.LIZ("AwemeStatusViewModel@fcd9.updateAndCollectFlowFromFetchManager$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IAwemeCoverManager.LIZ.getClass();
            IAwemeCoverManager iAwemeCoverManagerLIZ = C0Z69.LIZ();
            if (iAwemeCoverManagerLIZ != null) {
                Set<String> setSingleton = Collections.singleton(this.LLILLJJLI);
                this.LL = 1;
                if (iAwemeCoverManagerLIZ.LJ(setSingleton, this) == objLJFF) {
                    C1C7U.LIZIZ("AwemeStatusViewModel@fcd9.updateAndCollectFlowFromFetchManager$2");
                    return objLJFF;
                }
            }
        }
        IAwemeFetchManager.LIZ.getClass();
        IAwemeFetchManager value = C327290CsJ.LIZIZ.getValue();
        if (value != null && (c05ydLIZLLL = value.LIZLLL(this.LLILLJJLI)) != null) {
            AgS97S1100000_4 agS97S1100000_4 = new AgS97S1100000_4(this.LLILLL, this.LLILLJJLI, 3);
            this.LL = 2;
            if (c05ydLIZLLL.collect(agS97S1100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("AwemeStatusViewModel@fcd9.updateAndCollectFlowFromFetchManager$2");
                return objLJFF;
            }
            throw new C2197108jB();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeStatusViewModel@fcd9.updateAndCollectFlowFromFetchManager$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
