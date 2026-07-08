package X;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0WIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C820980WIm {
    public static MediaDescription.Builder LIZIZ() {
        return new MediaDescription.Builder();
    }

    public static MediaDescription LIZ(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static CharSequence LIZJ(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static Bundle LIZLLL(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static Bitmap LJ(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static Uri LJFF(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static String LJI(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static CharSequence LJII(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static CharSequence LJIIIIZZ(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static void LJIIIZ(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void LJIIJ(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void LJIIJJI(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void LJIIL(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static void LJIILIIL(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    public static void LJIILJJIL(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void LJIILL(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
