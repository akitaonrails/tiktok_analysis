package X;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: renamed from: X.0WIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C820990WIn {
    public static Uri LIZ(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void LIZIZ(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
