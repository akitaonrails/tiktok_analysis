package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0OBD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBD implements InterfaceC690050R4x {
    public WeakReference<VideoViewComponent> LL = new WeakReference<>(null);
    public final Set<LifecycleOwner> LLILLJJLI = Collections.newSetFromMap(new WeakHashMap());

    @Override // X.InterfaceC690050R4x
    public final void release() {
        VideoViewComponent videoViewComponent;
        WeakReference<VideoViewComponent> weakReference = this.LL;
        if (weakReference == null || (videoViewComponent = weakReference.get()) == null) {
            return;
        }
        videoViewComponent.release();
    }

    public final void LIZ(VideoViewComponent videoViewComponent) {
        VideoViewComponent videoViewComponent2 = this.LL.get();
        if (videoViewComponent2 != null) {
            for (LifecycleOwner lifecycleOwner : this.LLILLJJLI) {
                if (lifecycleOwner != null) {
                    lifecycleOwner.getLifecycle().removeObserver(videoViewComponent2);
                }
            }
        }
        this.LL = new WeakReference<>(videoViewComponent);
    }
}
