package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupSceneConfigExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869580yke extends C09AY implements Function0<PushPermissionPopupSceneConfigExp.SceneConfig> {
    public C1869580yke() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupSceneConfigExp$SceneConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PushPermissionPopupSceneConfigExp.SceneConfig invoke() {
        ?? LJJIIJ = C0C64.LJIILLIIL().LJJIIJ(false, "push_permission_popup_scene_config", 31744, PushPermissionPopupSceneConfigExp.SceneConfig.class, PushPermissionPopupSceneConfigExp.DEFAULT, 1);
        return LJJIIJ == 0 ? PushPermissionPopupSceneConfigExp.INSTANCE.getDEFAULT() : LJJIIJ;
    }
}
