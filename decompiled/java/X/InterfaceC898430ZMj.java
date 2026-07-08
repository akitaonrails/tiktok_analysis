package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.activestatus.api.network.Result;

/* JADX INFO: renamed from: X.0ZMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC898430ZMj {
    @InterfaceC1501240pAY("/tiktok/v1/activity_status/report")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK(Scene.SCENE_SERVICE) String str, @InterfaceC1501100pAK("type") Integer num, InterfaceC1364105Vn<? super Result> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/activity_status/fetch")
    Object LIZIZ(@InterfaceC1501120pAM("friends_list") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, @InterfaceC1501120pAM("fetch_as_report") Integer num, InterfaceC1364105Vn<? super Result> interfaceC1364105Vn);
}
