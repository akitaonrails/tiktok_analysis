package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862230yYn extends C2217421BqW implements Function1<TakoBaseResponse, Unit> {
    public C1862230yYn(C1862130yYd c1862130yYd) {
        super(1, c1862130yYd, C1862130yYd.class, "onEventGetResponse", "onEventGetResponse(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/TakoBaseResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoBaseResponse takoBaseResponse) {
        ((C1862130yYd) this.receiver).onEventGetResponse(takoBaseResponse);
        return Unit.LIZ;
    }
}
