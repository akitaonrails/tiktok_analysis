package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09BW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.config.AITheaterCloudDraftNavigateHandlers$maybeFulfillFailureInfo$localTask$1$1", f = "AITheaterCloudDraftNavigateHandlers.kt", l = {116}, m = "invokeSuspend")
public final class C09BW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LSZ>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09BW(String str, InterfaceC1364105Vn<? super C09BW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09BW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterCloudDraftNavigateHandlers@cba5.maybeFulfillFailureInfo$localTask$1$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                String str = this.LLILLJJLI;
                this.LL = 1;
                obj = iCreationAsyncTaskManagerLIZ.LIZJ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AITheaterCloudDraftNavigateHandlers@cba5.maybeFulfillFailureInfo$localTask$1$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("AITheaterCloudDraftNavigateHandlers@cba5.maybeFulfillFailureInfo$localTask$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LSZ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
