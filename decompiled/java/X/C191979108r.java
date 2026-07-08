package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.108r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C191979108r extends C2217421BqW implements InterfaceC1631620sYq<Integer, Integer, BaseResponse, Unit> {
    public C191979108r(C191977108p c191977108p) {
        super(3, c191977108p, C191977108p.class, "onUpdateSuccessInner", "onUpdateSuccessInner(IILcom/ss/android/ugc/aweme/network/model/BaseResponse;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, BaseResponse baseResponse) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        BaseResponse baseResponse2 = baseResponse;
        C191977108p c191977108p = (C191977108p) this.receiver;
        C191983108v c191983108v = (C191983108v) ((LinkedHashMap) c191977108p.LLJILJIL).get(Integer.valueOf(iIntValue2));
        if (c191983108v != null) {
            c191983108v.LJI(iIntValue2, c191977108p.LLJ.LIZLLL, baseResponse2);
        }
        c191977108p.LJJIJIIJIL(iIntValue, iIntValue2, baseResponse2);
        return Unit.LIZ;
    }
}
