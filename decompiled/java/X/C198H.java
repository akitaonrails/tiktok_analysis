package X;

import android.content.Intent;
import android.view.KeyEvent;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.198H, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public interface C198H {
    C19BM buildPopOptions();

    void finish();

    Scene getScene();

    Boolean onActivityKeyDown(int i, KeyEvent keyEvent);

    Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent);

    Boolean onActivityKeyUp(int i, KeyEvent keyEvent);

    boolean onBackPressed();

    boolean onResult(int i, int i2, Intent intent);

    void setResult(int i, Intent intent);
}
