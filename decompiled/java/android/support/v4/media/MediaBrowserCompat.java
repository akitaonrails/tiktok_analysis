package android.support.v4.media;

import X.AbstractC820890WId;
import X.AbstractC820900WIe;
import X.AbstractC820910WIf;
import X.C854630Xfp;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class MediaBrowserCompat {

    public static class CustomActionResultReceiver extends ResultReceiver {
        public final String mAction;
        public final AbstractC820900WIe mCallback;
        public final Bundle mExtras;

        @Override // android.support.v4.os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C854630Xfp(0);
        public final MediaDescriptionCompat mDescription;
        public final int mFlags;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (!TextUtils.isEmpty(mediaDescriptionCompat.mMediaId)) {
                this.mFlags = 2;
                this.mDescription = mediaDescriptionCompat;
                return;
            }
            throw new IllegalArgumentException("description must have a non-empty media id");
        }

        public MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        public final AbstractC820890WId mCallback;
        public final String mMediaId;

        @Override // android.support.v4.os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
            Parcelable parcelable;
            if (bundle != null) {
                MediaSessionCompat.LIZ(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException e) {
                    TryCatchGuardChecker.doCheck(e);
                    bundle = null;
                }
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item") || (parcelable = bundle.getParcelable("media_item")) == null || !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        public final AbstractC820910WIf mCallback;
        public final Bundle mExtras;
        public final String mQuery;

        @Override // android.support.v4.os.ResultReceiver
        public final void LIZ(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.LIZ(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException e) {
                    TryCatchGuardChecker.doCheck(e);
                    bundle = null;
                }
            }
            if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                parcelableArray.getClass();
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add(parcelable);
                }
                throw null;
            }
            throw null;
        }
    }
}
