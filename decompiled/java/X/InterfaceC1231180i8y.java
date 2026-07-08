package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.0i8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1231180i8y {
    @InterfaceC1501240pAY("/tiktok/v1/im/group/join")
    Object LIZ(@InterfaceC1501120pAM("conversation_short_id") long j, @InterfaceC1501120pAM("need_send_apply") boolean z, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("invite_id") String str, @InterfaceC1501120pAM("join_group_source") String str2, @InterfaceC1501260pAa(encoded = true) Map<String, String> map, InterfaceC1364105Vn<? super GroupJoinResponse> interfaceC1364105Vn);
}
