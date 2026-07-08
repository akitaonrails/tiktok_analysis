package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1ASx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractBinderC2179851ASx extends Binder implements InterfaceC2179861ASy {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2179851ASx() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i != 1598968902) {
            ParcelableVolumeInfo parcelableVolumeInfoCreateFromParcel = null;
            Bundle bundle = null;
            PlaybackStateCompat playbackStateCompatCreateFromParcel = null;
            MediaMetadataCompat mediaMetadataCompatCreateFromParcel = null;
            CharSequence charSequence = null;
            Bundle bundle2 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    MediaControllerCompat.Callback callback = ((BinderC2179841ASw) this).LLILLJJLI.get();
                    if (callback != null) {
                        callback.LIZLLL(1, string, bundle);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    i0();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        playbackStateCompatCreateFromParcel = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC2179841ASw) this).V(playbackStateCompatCreateFromParcel);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    LLIIII(mediaMetadataCompatCreateFromParcel);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    b0(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    Z0(charSequence);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLILIL(bundle2);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        parcelableVolumeInfoCreateFromParcel = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    z(parcelableVolumeInfoCreateFromParcel);
                    return true;
                case BdTuring.TYPE_ECAF /* 9 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int i3 = parcel.readInt();
                    MediaControllerCompat.Callback callback2 = ((BinderC2179841ASw) this).LLILLJJLI.get();
                    if (callback2 != null) {
                        callback2.LIZLLL(9, Integer.valueOf(i3), null);
                    }
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    MediaControllerCompat.Callback callback3 = ((BinderC2179841ASw) this).LLILLJJLI.get();
                    if (callback3 != null) {
                        callback3.LIZLLL(11, Boolean.valueOf(z), null);
                    }
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int i4 = parcel.readInt();
                    MediaControllerCompat.Callback callback4 = ((BinderC2179841ASw) this).LLILLJJLI.get();
                    if (callback4 != null) {
                        callback4.LIZLLL(12, Integer.valueOf(i4), null);
                    }
                    return true;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    MediaControllerCompat.Callback callback5 = ((BinderC2179841ASw) this).LLILLJJLI.get();
                    if (callback5 != null) {
                        callback5.LIZLLL(13, null, null);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }
}
