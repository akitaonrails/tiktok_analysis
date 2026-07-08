package android.support.v4.media;

import X.C2188811AlT;
import X.C820980WIm;
import X.C820990WIn;
import X.C854630Xfp;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C854630Xfp(1);
    public final CharSequence mDescription;
    public MediaDescription mDescriptionFwk;
    public final Bundle mExtras;
    public final Bitmap mIcon;
    public final Uri mIconUri;
    public final String mMediaId;
    public final Uri mMediaUri;
    public final CharSequence mSubtitle;
    public final CharSequence mTitle;

    public MediaDescriptionCompat() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) this.mTitle);
        sbLIZ.append(", ");
        sbLIZ.append((Object) this.mSubtitle);
        sbLIZ.append(", ");
        sbLIZ.append((Object) this.mDescription);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat LIZ(java.lang.Object r8) {
        /*
            r7 = 0
            if (r8 == 0) goto L67
            X.0WIh r6 = new X.0WIh
            r6.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r0 = X.C820980WIm.LJI(r8)
            r6.LIZ = r0
            java.lang.CharSequence r0 = X.C820980WIm.LJIIIIZZ(r8)
            r6.LIZIZ = r0
            java.lang.CharSequence r0 = X.C820980WIm.LJII(r8)
            r6.LIZJ = r0
            java.lang.CharSequence r0 = X.C820980WIm.LIZJ(r8)
            r6.LIZLLL = r0
            android.graphics.Bitmap r0 = X.C820980WIm.LJ(r8)
            r6.LJ = r0
            android.net.Uri r0 = X.C820980WIm.LJFF(r8)
            r6.LJFF = r0
            android.os.Bundle r5 = X.C820980WIm.LIZLLL(r8)
            if (r5 == 0) goto L40
            android.support.v4.media.session.MediaSessionCompat.LIZ(r5)
            r5.isEmpty()     // Catch: android.os.BadParcelableException -> L3b
            goto L40
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r5 = r7
        L40:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r5 == 0) goto L76
            android.os.Parcelable r3 = r5.getParcelable(r4)
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L77
            java.lang.String r2 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L6f
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L6f
        L5b:
            r6.LJI = r7
            if (r3 == 0) goto L68
            r6.LJII = r3
        L61:
            android.support.v4.media.MediaDescriptionCompat r7 = r6.LIZ()
            r7.mDescriptionFwk = r8
        L67:
            return r7
        L68:
            android.net.Uri r0 = X.C820990WIn.LIZ(r8)
            r6.LJII = r0
            goto L61
        L6f:
            r5.remove(r4)
            r5.remove(r2)
            goto L77
        L76:
            r3 = r7
        L77:
            r7 = r5
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.LIZ(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionLIZ = this.mDescriptionFwk;
        if (mediaDescriptionLIZ == null) {
            MediaDescription.Builder builderLIZIZ = C820980WIm.LIZIZ();
            C820980WIm.LJIILIIL(builderLIZIZ, this.mMediaId);
            C820980WIm.LJIILL(builderLIZIZ, this.mTitle);
            C820980WIm.LJIILJJIL(builderLIZIZ, this.mSubtitle);
            C820980WIm.LJIIIZ(builderLIZIZ, this.mDescription);
            C820980WIm.LJIIJJI(builderLIZIZ, this.mIcon);
            C820980WIm.LJIIL(builderLIZIZ, this.mIconUri);
            C820980WIm.LJIIJ(builderLIZIZ, this.mExtras);
            C820990WIn.LIZIZ(builderLIZIZ, this.mMediaUri);
            mediaDescriptionLIZ = C820980WIm.LIZ(builderLIZIZ);
            this.mDescriptionFwk = mediaDescriptionLIZ;
        }
        mediaDescriptionLIZ.writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }
}
