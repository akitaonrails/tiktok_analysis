package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.109Q, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C109Q extends C2217421BqW implements InterfaceC1631620sYq<Integer, Integer, BaseResponse, Unit> {
    public C109Q(C109N c109n) {
        super(3, c109n, C109N.class, "onUpdateSuccess", "onUpdateSuccess(IILcom/ss/android/ugc/aweme/network/model/BaseResponse;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, BaseResponse baseResponse) {
        ((C109N) this.receiver).LJJIIZ(num.intValue(), num2.intValue(), baseResponse);
        return Unit.LIZ;
    }
}
