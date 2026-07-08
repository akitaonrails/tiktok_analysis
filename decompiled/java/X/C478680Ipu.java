package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckResp;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.ss.android.ugc.aweme.hangout.container.model.IMultiTopLivePageApi;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0Ipu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478680Ipu implements InterfaceC736910SvR<InterfaceC478670Ipt> {
    public final C478620Ipo LL = new InterfaceC478670Ipt() { // from class: X.0Ipo
        @Override // X.InterfaceC478670Ipt
        public final Object recommendAck(RecommendAckReq recommendAckReq, InterfaceC1364105Vn<? super C470590Icr<RecommendAckResp.ResponseData>> interfaceC1364105Vn) {
            if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
                C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                C480460Ism.LIZ().getClass();
                return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).recommendAck(recommendAckReq, interfaceC1364105Vn);
            }
            return C478550Iph.LIZJ(recommendAckReq, interfaceC1364105Vn);
        }

        @Override // X.InterfaceC478670Ipt
        public final Object LLILLIZIL(boolean z, String str, long j, MGModuleTab mGModuleTab, boolean z2, AbstractC23140094w abstractC23140094w) {
            if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
                return C478590Ipl.LIZ.LIZJ(j, str, abstractC23140094w, mGModuleTab, z2);
            }
            return C478550Iph.LIZ.LIZ(j, str, abstractC23140094w, mGModuleTab);
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
