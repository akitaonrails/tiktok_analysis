package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.api.SubOnlyLiveVipChoiceApi;
import webcast.api.sub.GetSubOnlyLiveInfoResponse;

/* JADX INFO: renamed from: X.0JYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493860JYi implements InterfaceC736910SvR<InterfaceC493810JYd> {
    public final C493870JYj LL = new InterfaceC493810JYd() { // from class: X.0JYj
        @Override // X.InterfaceC493810JYd
        public final Object LLLIIIL(InterfaceC1364105Vn<? super GetSubOnlyLiveInfoResponse> interfaceC1364105Vn) {
            C480460Ism.LIZ().getClass();
            return C11UD.LIZLLL(((SubOnlyLiveVipChoiceApi) C480460Ism.LIZLLL(SubOnlyLiveVipChoiceApi.class)).getSubOnlyLiveInfo(), interfaceC1364105Vn);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
