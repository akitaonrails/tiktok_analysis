package X;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

/* JADX INFO: renamed from: X.1ASy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC2179861ASy extends IInterface {
    void LLIIII(MediaMetadataCompat mediaMetadataCompat);

    void LLILIL(Bundle bundle);

    void V(PlaybackStateCompat playbackStateCompat);

    void Z0(CharSequence charSequence);

    void b0(List<MediaSessionCompat.QueueItem> list);

    void i0();

    void z(ParcelableVolumeInfo parcelableVolumeInfo);
}
