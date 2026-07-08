package X;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* JADX INFO: renamed from: X.1AT0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1AT0 {
    public static MediaDescription LIZIZ(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long LIZJ(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }

    public static MediaSession.QueueItem LIZ(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }
}
