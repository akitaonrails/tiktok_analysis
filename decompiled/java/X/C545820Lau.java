package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0Lau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545820Lau {
    public static final Context LIZIZ(Scene scene) {
        if (C294080Bfq.LIZ()) {
            return scene.getSceneContext();
        }
        return scene.mActivity;
    }

    public static final Context LIZJ(Scene scene) {
        if (C294080Bfq.LIZ()) {
            return scene.requireSceneContext();
        }
        return scene.requireActivity();
    }

    public static final boolean LJ(Scene scene) {
        if (C294080Bfq.LIZ()) {
            return scene.mViewDestroyed;
        }
        Activity activity = scene.mActivity;
        if (activity != null) {
            return activity.isFinishing();
        }
        return true;
    }

    public static final Context LIZ(Activity activity, Scene scene) {
        Context sceneContext;
        if (C294080Bfq.LIZ() && (sceneContext = scene.getSceneContext()) != null) {
            return sceneContext;
        }
        return activity;
    }

    public static final boolean LIZLLL(Activity activity, Scene scene) {
        if (C294080Bfq.LIZ()) {
            if (scene != null) {
                return scene.mViewDestroyed;
            }
            return activity.isFinishing();
        }
        return activity.isFinishing();
    }
}
