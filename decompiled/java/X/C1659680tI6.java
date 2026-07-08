package X;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0tI6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659680tI6 {
    public static final C1659680tI6 LIZ = new C1659680tI6();

    public final synchronized <T extends ViewModel> T LIZ(Scene scene, Class<T> cls) {
        T t;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(scene);
        sbLIZ.append(" ALSSceneViewModelProviders get ");
        sbLIZ.append(cls);
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(scene);
        sbLIZ2.append(" isMainThread: ");
        sbLIZ2.append(C1659720tIA.LIZIZ());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (!C1659720tIA.LIZIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(scene);
            sbLIZ3.append(" ALSSceneViewModelProviders get thread error");
            C1659700tI8.LIZ.e("ALS Framework", C2188811AlT.LIZIZ(sbLIZ3));
        }
        t = (T) C1659670tI5.LIZ(scene).get(cls);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(scene);
        sbLIZ4.append(" viewModelStore ");
        sbLIZ4.append(scene.getViewModelStore());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(scene);
        sbLIZ5.append(" scope ");
        sbLIZ5.append(scene.getScope());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        return t;
    }

    public final synchronized <T extends ViewModel> T LIZIZ(Scene scene, Class<T> cls) {
        Application application;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(scene);
        sbLIZ.append(" ALSSceneViewModelProviders opt ");
        sbLIZ.append(cls);
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(scene);
        sbLIZ2.append(" isMainThread: ");
        sbLIZ2.append(C1659720tIA.LIZIZ());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (!C1659720tIA.LIZIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(scene);
            sbLIZ3.append(" ALSSceneViewModelProviders opt thread error");
            C1659700tI8.LIZ.e("ALS Framework", C2188811AlT.LIZIZ(sbLIZ3));
        }
        Activity activity = scene.mActivity;
        if (activity != null && (application = activity.getApplication()) != null) {
            T t = (T) new ViewModelProvider(scene.getViewModelStore(), ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application)).get(cls);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("opt ");
            sbLIZ4.append(scene);
            sbLIZ4.append(" viewModelStore ");
            sbLIZ4.append(scene.getViewModelStore());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("opt ");
            sbLIZ5.append(scene);
            sbLIZ5.append(" scope ");
            sbLIZ5.append(scene.getScope());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            return t;
        }
        return null;
    }
}
