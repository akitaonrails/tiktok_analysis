package X;

import com.ss.android.ugc.aweme.newselector.repository.RelatedFriendsResponse;
import java.util.List;

/* JADX INFO: renamed from: X.05zW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1534005zW {
    public static final C1534105zX LIZ = C1534105zX.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/im/group/chat/related/friends")
    Object LIZ(@InterfaceC1501120pAM("select_user_ids") List<Long> list, @InterfaceC1501120pAM("source") int i, InterfaceC1364105Vn<? super RelatedFriendsResponse> interfaceC1364105Vn);
}
