package X;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20597015ii extends InterfaceC20011613Rq, InterfaceC524950KiL, InterfaceC1616690sAl, InterfaceC1848690yCx, InterfaceC569700MWa, InterfaceC20622815ms, InterfaceC1563380qmm {
    Lifecycle EI();

    void HB(C198M c198m);

    C198H LC();

    void SI(C198M c198m);

    <T> T Ss(String str, Function0<? extends T> function0);

    void Vv();

    void Ye();

    <T> T ZN(Function0<? extends T> function0);

    void ac(Scene scene);

    void fM();

    void finish();

    void finishAfterTransition();

    @Override // X.InterfaceC20622815ms
    NavigationScene getNavigationScene();

    FragmentManager getSupportFragmentManager();

    List<Scene> kI();

    void setResult(int i, Intent intent);
}
