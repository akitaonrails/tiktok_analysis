package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.videoenhanced.inner.TakoEnhancedVideoDetailFeedListModel$fetchData$1$result$1", f = "TakoEnhancedVideoDetailFeedListModel.kt", l = {83}, m = "invokeSuspend")
public final class C329420Cvk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TakoAwemeRecallResponse>, Object> {
    public int LL;
    public final /* synthetic */ C329440Cvm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329420Cvk(C329440Cvm c329440Cvm, InterfaceC1364105Vn<? super C329420Cvk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c329440Cvm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329420Cvk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEnhancedVideoDetailFeedListModel@c88f.fetchData$1$result$1");
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
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            C329440Cvm c329440Cvm = this.LLILLJJLI;
            String str = c329440Cvm.LL;
            long j = c329440Cvm.LLILLJJLI;
            Long lLJFF = C2286608xc.LJFF(c329440Cvm.LLILLL);
            C329440Cvm c329440Cvm2 = this.LLILLJJLI;
            int i2 = c329440Cvm2.LLILZIL;
            c329440Cvm2.LLILZIL = i2 + 1;
            Integer numLJ = C2286608xc.LJ(i2);
            String str2 = this.LLILLJJLI.LLILZ;
            if (str2 == null) {
                str2 = "";
            }
            this.LL = 1;
            obj = c1863980ybc.LJJII(str, j, lLJFF, numLJ, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoEnhancedVideoDetailFeedListModel@c88f.fetchData$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TakoEnhancedVideoDetailFeedListModel@c88f.fetchData$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TakoAwemeRecallResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
