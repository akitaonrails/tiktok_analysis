package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.scene.group.UserVisibleHintGroupScene;

/* JADX INFO: renamed from: X.0Koh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC528890Koh extends UserVisibleHintGroupScene {
    public boolean LLJJIJIIJIL;

    @Override // com.bytedance.scene.Scene
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIJIIJIL = false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        this.LLJJIJIIJIL = false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJIJIIJIL = false;
    }

    @Override // com.bytedance.scene.Scene
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJIJIIJIL = true;
    }
}
