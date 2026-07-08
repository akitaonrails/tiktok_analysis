package X;

import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1ASw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class BinderC2179841ASw extends AbstractBinderC2179851ASx {
    public final WeakReference<MediaControllerCompat.Callback> LLILLJJLI;

    public BinderC2179841ASw(MediaControllerCompat.Callback callback) {
        this.LLILLJJLI = new WeakReference<>(callback);
    }

    @Override // X.InterfaceC2179861ASy
    public final void V(PlaybackStateCompat playbackStateCompat) {
        MediaControllerCompat.Callback callback = this.LLILLJJLI.get();
        if (callback != null) {
            callback.LIZLLL(2, playbackStateCompat, null);
        }
    }
}
