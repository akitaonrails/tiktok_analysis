package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.108u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C191982108u extends C2217421BqW implements InterfaceC1631620sYq<Integer, Integer, BaseResponse, Unit> {
    public C191982108u(Object obj) {
        super(3, obj, C191981108t.class, "onUpdateSuccessInner", "onUpdateSuccessInner(IILcom/ss/android/ugc/aweme/network/model/BaseResponse;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, BaseResponse baseResponse) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        BaseResponse baseResponse2 = baseResponse;
        C191981108t c191981108t = (C191981108t) this.receiver;
        c191981108t.LLJIJIL.LJI(iIntValue2, c191981108t.LLJ.LIZLLL, baseResponse2);
        c191981108t.LJJIII(iIntValue, iIntValue2, baseResponse2);
        return Unit.LIZ;
    }
}
