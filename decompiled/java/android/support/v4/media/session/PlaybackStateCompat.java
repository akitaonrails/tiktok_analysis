package android.support.v4.media.session;

import X.C2179781ASq;
import X.C2179791ASr;
import X.C2188811AlT;
import X.C2189641Amo;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C2189641Amo(6);
    public final long mActions;
    public final long mActiveItemId;
    public final long mBufferedPosition;
    public List<CustomAction> mCustomActions;
    public final int mErrorCode;
    public final CharSequence mErrorMessage;
    public final Bundle mExtras;
    public final long mPosition;
    public final float mSpeed;
    public final int mState;
    public PlaybackState mStateFwk;
    public final long mUpdateTime;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C2189641Amo(5);
        public final String mAction;
        public PlaybackState.CustomAction mCustomActionFwk;
        public final Bundle mExtras;
        public final int mIcon;
        public final CharSequence mName;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Object LIZIZ() {
            PlaybackState.CustomAction customAction = this.mCustomActionFwk;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builderLJ = C2179781ASq.LJ(this.mAction, this.mName, this.mIcon);
            C2179781ASq.LJIL(builderLJ, this.mExtras);
            return C2179781ASq.LIZIZ(builderLJ);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Action:mName='");
            sbLIZ.append((Object) this.mName);
            sbLIZ.append(", mIcon=");
            sbLIZ.append(this.mIcon);
            sbLIZ.append(", mExtras=");
            sbLIZ.append(this.mExtras);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CustomAction(Parcel parcel) {
            this.mAction = parcel.readString();
            this.mName = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.mIcon = parcel.readInt();
            this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public static CustomAction LIZ(Object obj) {
            if (obj != null) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
                Bundle bundleLJIIJJI = C2179781ASq.LJIIJJI(customAction);
                MediaSessionCompat.LIZ(bundleLJIIJJI);
                CustomAction customAction2 = new CustomAction(C2179781ASq.LJFF(customAction), C2179781ASq.LJIILJJIL(customAction), C2179781ASq.LJIIL(customAction), bundleLJIIJJI);
                customAction2.mCustomActionFwk = customAction;
                return customAction2;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mAction);
            TextUtils.writeToParcel(this.mName, parcel, i);
            parcel.writeInt(this.mIcon);
            parcel.writeBundle(this.mExtras);
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.mAction = str;
            this.mName = charSequence;
            this.mIcon = i;
            this.mExtras = bundle;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Object LIZIZ() {
        if (this.mStateFwk == null) {
            PlaybackState.Builder builderLIZLLL = C2179781ASq.LIZLLL();
            C2179781ASq.LJJ(builderLIZLLL, this.mState, this.mPosition, this.mSpeed, this.mUpdateTime);
            C2179781ASq.LJIJJ(builderLIZLLL, this.mBufferedPosition);
            C2179781ASq.LJIJ(builderLIZLLL, this.mActions);
            C2179781ASq.LJIJJLI(builderLIZLLL, this.mErrorMessage);
            Iterator<CustomAction> it2 = this.mCustomActions.iterator();
            while (it2.hasNext()) {
                C2179781ASq.LIZ(builderLIZLLL, (PlaybackState.CustomAction) it2.next().LIZIZ());
            }
            C2179781ASq.LJIJI(builderLIZLLL, this.mActiveItemId);
            C2179791ASr.LIZIZ(builderLIZLLL, this.mExtras);
            this.mStateFwk = C2179781ASq.LIZJ(builderLIZLLL);
        }
        return this.mStateFwk;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.mState + ", position=" + this.mPosition + ", buffered position=" + this.mBufferedPosition + ", speed=" + this.mSpeed + ", updated=" + this.mUpdateTime + ", actions=" + this.mActions + ", error code=" + this.mErrorCode + ", error message=" + this.mErrorMessage + ", custom actions=" + this.mCustomActions + ", active item id=" + this.mActiveItemId + "}";
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.mState = parcel.readInt();
        this.mPosition = parcel.readLong();
        this.mSpeed = parcel.readFloat();
        this.mUpdateTime = parcel.readLong();
        this.mBufferedPosition = parcel.readLong();
        this.mActions = parcel.readLong();
        this.mErrorMessage = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.mActiveItemId = parcel.readLong();
        this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.mErrorCode = parcel.readInt();
    }

    public static PlaybackStateCompat LIZ(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listLJIIIZ = C2179781ASq.LJIIIZ(playbackState);
        if (listLJIIIZ != null) {
            arrayList = new ArrayList(listLJIIIZ.size());
            Iterator<PlaybackState.CustomAction> it2 = listLJIIIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(CustomAction.LIZ(it2.next()));
            }
        }
        Bundle bundleLIZ = C2179791ASr.LIZ(playbackState);
        MediaSessionCompat.LIZ(bundleLIZ);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C2179781ASq.LJIIZILJ(playbackState), C2179781ASq.LJIILLIIL(playbackState), C2179781ASq.LJIIIIZZ(playbackState), C2179781ASq.LJIILL(playbackState), C2179781ASq.LJI(playbackState), 0, C2179781ASq.LJIIJ(playbackState), C2179781ASq.LJIILIIL(playbackState), arrayList, C2179781ASq.LJII(playbackState), bundleLIZ);
        playbackStateCompat.mStateFwk = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mPosition);
        parcel.writeFloat(this.mSpeed);
        parcel.writeLong(this.mUpdateTime);
        parcel.writeLong(this.mBufferedPosition);
        parcel.writeLong(this.mActions);
        TextUtils.writeToParcel(this.mErrorMessage, parcel, i);
        parcel.writeTypedList(this.mCustomActions);
        parcel.writeLong(this.mActiveItemId);
        parcel.writeBundle(this.mExtras);
        parcel.writeInt(this.mErrorCode);
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.mState = i;
        this.mPosition = j;
        this.mBufferedPosition = j2;
        this.mSpeed = f;
        this.mActions = j3;
        this.mErrorCode = i2;
        this.mErrorMessage = charSequence;
        this.mUpdateTime = j4;
        this.mCustomActions = new ArrayList(list);
        this.mActiveItemId = j5;
        this.mExtras = bundle;
    }
}
