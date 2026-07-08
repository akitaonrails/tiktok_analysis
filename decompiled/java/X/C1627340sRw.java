package X;

import com.ss.android.ugc.effectmanager.common.model.ApiState;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1627340sRw extends C2217421BqW implements Function2<ApiState<? extends C23065091z>, InterfaceC1364105Vn<? super Unit>, Object>, InterfaceC842703Qz {
    public C1627340sRw(o oVar) {
        super(2, oVar, o.class, "onStateUpdate", "onStateUpdate(Lcom/ss/android/ugc/effectmanager/common/model/ApiState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiState<? extends C23065091z> apiState, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((o) this.receiver).cd(apiState, interfaceC1364105Vn);
    }
}
