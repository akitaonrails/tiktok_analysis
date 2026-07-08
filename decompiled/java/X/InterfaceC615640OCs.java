package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailModel;

/* JADX INFO: renamed from: X.0OCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC615640OCs {
    public static final C615650OCt LIZ = C615650OCt.LIZ;

    @InterfaceC1501200pAU("tiktok/v1/aistyle/detail")
    Object LIZ(@InterfaceC1501120pAM("style_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super AIMEDetailModel> interfaceC1364105Vn);

    @InterfaceC1501200pAU("tiktok/v1/aistyle/aweme")
    Object LIZIZ(@InterfaceC1501120pAM("style_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") long j2, InterfaceC1364105Vn<? super AIMEDetailListModel> interfaceC1364105Vn);
}
