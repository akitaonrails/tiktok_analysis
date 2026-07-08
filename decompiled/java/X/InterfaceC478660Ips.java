package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.GetRandomMatchStateReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchStartReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchStartResp;

/* JADX INFO: renamed from: X.0Ips, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC478660Ips extends InterfaceC149400hg {
    Object LJLIL(GetRandomMatchStateReq getRandomMatchStateReq, C481490IuR c481490IuR);

    Object cancelRandomMatch(RandomMatchGuestCancelReq randomMatchGuestCancelReq, InterfaceC1364105Vn<? super C470590Icr<RandomMatchGuestCancelResp.ResponseData>> interfaceC1364105Vn);

    Object startRandomMatch(RandomMatchStartReq randomMatchStartReq, InterfaceC1364105Vn<? super C470590Icr<RandomMatchStartResp.ResponseData>> interfaceC1364105Vn);
}
