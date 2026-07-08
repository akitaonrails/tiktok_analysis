package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.0n3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420030n3Z implements InterfaceC1629370sVD {
    @Override // X.InterfaceC1629370sVD
    public final void LIZIZ(Effect effect, long j, int i, String str, String str2) {
        String effectId;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", "effect");
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        c0lab.LJ("resource_id", effectId);
        c0lab.LIZ(i, "hit_cache");
        if (str == null) {
            str = "";
        }
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        c0lab.LJ("prop_launch_ui_point", str2);
        C2341909Fp.LIZ("tool_performance_resource_download_user_view", c0lab.LIZ);
    }

    @Override // X.InterfaceC1629370sVD
    public final void LIZ(Effect effect, long j, int i, String str, String str2, ExceptionResult exceptionResult) {
        String effectId;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", "effect");
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        c0lab.LJ("resource_id", effectId);
        c0lab.LIZLLL(ListProtector.get(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts(), 0), "error_domain");
        c0lab.LIZLLL(Integer.valueOf(exceptionResult.getErrorCode()), "error_code");
        c0lab.LIZ(i, "hit_cache");
        if (str == null) {
            str = "";
        }
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        c0lab.LJ("prop_launch_ui_point", str2);
        C2341909Fp.LIZ("tool_performance_resource_download_user_view", c0lab.LIZ);
    }
}
