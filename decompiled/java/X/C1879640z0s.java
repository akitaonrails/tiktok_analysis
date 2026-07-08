package X;

import Y.AfS197S0100000_28;
import com.bytedance.android.livesdk.game.api.GameRevenueRetrofitApi;
import com.bytedance.android.livesdk.game.model.GuessTaskPackInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import njp.a;
import webcast.api.game_revenue.RefreshTaskRequest;

/* JADX INFO: renamed from: X.0z0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.points.GuessTaskRepository$requestRefreshTaskData$2", f = "GuessTaskRepository.kt", l = {41}, m = "invokeSuspend")
public final class C1879640z0s extends C09AX implements Function2<C094D<? super GuessTaskPackInfo>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1096980eeW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879640z0s(C1096980eeW c1096980eeW, InterfaceC1364105Vn<? super C1879640z0s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1096980eeW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1879640z0s c1879640z0s = new C1879640z0s(this.LLILLL, interfaceC1364105Vn);
        c1879640z0s.LLILLJJLI = obj;
        return c1879640z0s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GuessTaskRepository@b5d2.requestRefreshTaskData$2");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            C480460Ism.LIZ().getClass();
            GameRevenueRetrofitApi gameRevenueRetrofitApi = (GameRevenueRetrofitApi) C480460Ism.LIZLLL(GameRevenueRetrofitApi.class);
            RefreshTaskRequest refreshTaskRequest = new RefreshTaskRequest();
            C1096980eeW c1096980eeW = this.LLILLL;
            RefreshTaskRequest.RequestData requestData = new RefreshTaskRequest.RequestData();
            requestData.typeList = c1096980eeW.LIZIZ;
            requestData.roomId = c1096980eeW.LIZ;
            refreshTaskRequest.data = requestData;
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28((C11JF) gameRevenueRetrofitApi.requestRefreshGuessTask(refreshTaskRequest).LJIILIIL(new C0UO0()).LJJLL(new AfS197S0100000_28(c094d, 80), new AfS197S0100000_28(c094d, 81)), 814);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS572S0100000_28, this) == objLJFF) {
                C1C7U.LIZIZ("GuessTaskRepository@b5d2.requestRefreshTaskData$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GuessTaskRepository@b5d2.requestRefreshTaskData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super GuessTaskPackInfo> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
