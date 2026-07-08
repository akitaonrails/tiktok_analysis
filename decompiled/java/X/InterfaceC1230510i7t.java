package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinRequestV2;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;

/* JADX INFO: renamed from: X.0i7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1230510i7t {
    public static final C1230680i8A LIZ = C1230680i8A.LIZ;

    @InterfaceC1294060jmO
    void LIZIZ(C19EG c19eg, String str, String str2);

    @InterfaceC1294060jmO
    void LIZLLL(C19EG c19eg, String str, String str2, String str3);

    GroupInvitePopupResponse LJIILJJIL(String str);

    Object LJIILL(GroupInvitePopupRequest groupInvitePopupRequest, InterfaceC1364105Vn<? super GroupInvitePopupResponse> interfaceC1364105Vn);

    @InterfaceC1294060jmO
    void LJIJ(Activity activity, String str, long j, GroupInfo groupInfo, String str2, String str3, String str4, C900560ZUo c900560ZUo);

    void LJJI(Context context, C1230810i8N c1230810i8N);

    PriorityProtocol LJJII();

    InterfaceC900570ZUp LJJIIZI();

    Object LJJIJ(GroupJoinRequestV2 groupJoinRequestV2, InterfaceC1364105Vn<? super GroupJoinResponseV2> interfaceC1364105Vn);
}
