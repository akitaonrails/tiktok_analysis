package X;

import com.ss.android.ugc.aweme.experiment.FollowAddRedDotShowSceneExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9O, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9O extends C09AY implements Function0<FollowAddRedDotShowSceneExp.Config> {
    public C1E9O() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.experiment.FollowAddRedDotShowSceneExp$Config, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FollowAddRedDotShowSceneExp.Config invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(FollowAddRedDotShowSceneExp.Config.class, FollowAddRedDotShowSceneExp.LIZ, "following_add_red_dot_show_scene_exp", true);
        return LJJII == 0 ? new FollowAddRedDotShowSceneExp.Config(false, false, false) : LJJII;
    }
}
