package X;

import android.app.Activity;
import android.view.View;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0KqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC529800KqA extends Serializable {
    void dynamicInitView(View view);

    boolean enable();

    View.OnClickListener getClickListener();

    View getImageView();

    int layoutRes();

    boolean needFullSpan();

    boolean needGray();

    void onFirstScreenLoaded(int i);

    void onRecoverFromGray();

    void onSetGray();

    void setAlbumActivity(Activity activity);

    void setViewPosition(int i);
}
