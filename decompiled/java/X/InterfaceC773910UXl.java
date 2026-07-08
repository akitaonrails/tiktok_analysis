package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0UXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC773910UXl {
    void LIZ(DataChannel dataChannel);

    int LIZIZ();

    int LJ();

    void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i);

    void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    void onClick(View view);

    void onHide();

    void onShow();
}
