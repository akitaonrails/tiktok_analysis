package android.support.v4.media;

import X.C820930WIh;
import X.C830490Whz;
import X.C854630Xfp;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final C830490Whz<String, Integer> LLILLJJLI;
    public static final String[] PREFERRED_BITMAP_ORDER;
    public static final String[] PREFERRED_DESCRIPTION_ORDER;
    public static final String[] PREFERRED_URI_ORDER;
    public final Bundle LL;
    public MediaDescriptionCompat mDescription;
    public MediaMetadata mMetadataFwk;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        C830490Whz<String, Integer> c830490Whz = new C830490Whz<>();
        LLILLJJLI = c830490Whz;
        c830490Whz.put("android.media.metadata.TITLE", 1);
        c830490Whz.put("android.media.metadata.ARTIST", 1);
        c830490Whz.put("android.media.metadata.DURATION", 0);
        c830490Whz.put("android.media.metadata.ALBUM", 1);
        c830490Whz.put("android.media.metadata.AUTHOR", 1);
        c830490Whz.put("android.media.metadata.WRITER", 1);
        c830490Whz.put("android.media.metadata.COMPOSER", 1);
        c830490Whz.put("android.media.metadata.COMPILATION", 1);
        c830490Whz.put("android.media.metadata.DATE", 1);
        c830490Whz.put("android.media.metadata.YEAR", 0);
        c830490Whz.put("android.media.metadata.GENRE", 1);
        c830490Whz.put("android.media.metadata.TRACK_NUMBER", 0);
        c830490Whz.put("android.media.metadata.NUM_TRACKS", 0);
        c830490Whz.put("android.media.metadata.DISC_NUMBER", 0);
        c830490Whz.put("android.media.metadata.ALBUM_ARTIST", 1);
        c830490Whz.put("android.media.metadata.ART", 2);
        c830490Whz.put("android.media.metadata.ART_URI", 1);
        c830490Whz.put("android.media.metadata.ALBUM_ART", 2);
        c830490Whz.put("android.media.metadata.ALBUM_ART_URI", 1);
        c830490Whz.put("android.media.metadata.USER_RATING", 3);
        c830490Whz.put("android.media.metadata.RATING", 3);
        c830490Whz.put("android.media.metadata.DISPLAY_TITLE", 1);
        c830490Whz.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c830490Whz.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c830490Whz.put("android.media.metadata.DISPLAY_ICON", 2);
        c830490Whz.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c830490Whz.put("android.media.metadata.MEDIA_ID", 1);
        c830490Whz.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c830490Whz.put("android.media.metadata.MEDIA_URI", 1);
        c830490Whz.put("android.media.metadata.ADVERTISEMENT", 0);
        c830490Whz.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        PREFERRED_DESCRIPTION_ORDER = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        PREFERRED_BITMAP_ORDER = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        PREFERRED_URI_ORDER = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C854630Xfp(2);
    }

    public final MediaDescriptionCompat LIZIZ() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        CharSequence charSequence = this.LL.getCharSequence("android.media.metadata.MEDIA_ID");
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence2 = this.LL.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence2)) {
            int i = 0;
            int i2 = 0;
            do {
                String[] strArr = PREFERRED_DESCRIPTION_ORDER;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequence3 = this.LL.getCharSequence(strArr[i2]);
                if (!TextUtils.isEmpty(charSequence3)) {
                    charSequenceArr[i] = charSequence3;
                    i++;
                }
                i2 = i3;
            } while (i < 3);
        } else {
            charSequenceArr[0] = charSequence2;
            charSequenceArr[1] = this.LL.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = this.LL.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = PREFERRED_BITMAP_ORDER;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) this.LL.getParcelable(strArr2[i4]);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = PREFERRED_URI_ORDER;
            if (i5 >= strArr3.length) {
                uri = null;
                break;
            }
            CharSequence charSequence4 = this.LL.getCharSequence(strArr3[i5]);
            String string2 = charSequence4 != null ? charSequence4.toString() : null;
            if (!TextUtils.isEmpty(string2)) {
                uri = UriProtector.parse(string2);
                break;
            }
            i5++;
        }
        CharSequence charSequence5 = this.LL.getCharSequence("android.media.metadata.MEDIA_URI");
        String string3 = charSequence5 != null ? charSequence5.toString() : null;
        Uri uri2 = TextUtils.isEmpty(string3) ? null : UriProtector.parse(string3);
        C820930WIh c820930WIh = new C820930WIh();
        c820930WIh.LIZ = string;
        c820930WIh.LIZIZ = charSequenceArr[0];
        c820930WIh.LIZJ = charSequenceArr[1];
        c820930WIh.LIZLLL = charSequenceArr[2];
        c820930WIh.LJ = bitmap;
        c820930WIh.LJFF = uri;
        c820930WIh.LJII = uri2;
        Bundle bundle = new Bundle();
        if (this.LL.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.LL.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (this.LL.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.LL.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        if (!bundle.isEmpty()) {
            c820930WIh.LJI = bundle;
        }
        MediaDescriptionCompat mediaDescriptionCompatLIZ = c820930WIh.LIZ();
        this.mDescription = mediaDescriptionCompatLIZ;
        return mediaDescriptionCompatLIZ;
    }

    public final Object LIZJ() {
        if (this.mMetadataFwk == null) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.mMetadataFwk = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.mMetadataFwk;
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.LL = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat LIZ(Object obj) {
        if (obj != null) {
            Parcel parcelObtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.mMetadataFwk = mediaMetadata;
            return mediaMetadataCompatCreateFromParcel;
        }
        return null;
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.LL = bundle2;
        MediaSessionCompat.LIZ(bundle2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.LL);
    }
}
