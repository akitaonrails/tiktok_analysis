package X;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1ATO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1ATO extends Binder implements C1ATP {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1ATO() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        RatingCompat ratingCompatCreateFromParcel;
        Uri uri;
        Uri uri2;
        Bundle bundle;
        if (i != 1598968902) {
            Bundle bundle2 = null;
            MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapperCreateFromParcel = null;
            KeyEvent keyEvent = null;
            InterfaceC2179861ASy interfaceC2179861ASy = null;
            InterfaceC2179861ASy interfaceC2179861ASy2 = null;
            Bundle bundle3 = null;
            Bundle bundle4 = null;
            Bundle bundle5 = null;
            RatingCompat ratingCompatCreateFromParcel2 = null;
            Bundle bundle6 = null;
            Bundle bundle7 = null;
            Bundle bundle8 = null;
            Bundle bundle9 = null;
            MediaDescriptionCompat mediaDescriptionCompatCreateFromParcel = null;
            MediaDescriptionCompat mediaDescriptionCompatCreateFromParcel2 = null;
            MediaDescriptionCompat mediaDescriptionCompatCreateFromParcel3 = null;
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    if (parcel.readInt() != 0) {
                        resultReceiverWrapperCreateFromParcel = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                    }
                    l0(string, bundle, resultReceiverWrapperCreateFromParcel);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    boolean zL = l(keyEvent);
                    parcel2.writeNoException();
                    parcel2.writeInt(zL ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2179861ASy)) {
                            interfaceC2179861ASy = (InterfaceC2179861ASy) iInterfaceQueryLocalInterface;
                        } else {
                            interfaceC2179861ASy = new InterfaceC2179861ASy(strongBinder) { // from class: X.1AT8
                                public final IBinder LL;

                                @Override // X.InterfaceC2179861ASy
                                public final void i0() {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        this.LL.transact(2, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LL;
                                }

                                {
                                    this.LL = strongBinder;
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void LLIIII(MediaMetadataCompat mediaMetadataCompat) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (mediaMetadataCompat != null) {
                                            parcelObtain.writeInt(1);
                                            parcelObtain.writeBundle(mediaMetadataCompat.LL);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(4, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void LLILIL(Bundle bundle10) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (bundle10 != null) {
                                            parcelObtain.writeInt(1);
                                            bundle10.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(7, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void V(PlaybackStateCompat playbackStateCompat) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (playbackStateCompat != null) {
                                            parcelObtain.writeInt(1);
                                            playbackStateCompat.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(3, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void z(ParcelableVolumeInfo parcelableVolumeInfo) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (parcelableVolumeInfo != null) {
                                            parcelObtain.writeInt(1);
                                            parcelableVolumeInfo.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(8, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }
                            };
                        }
                    }
                    LLLFFI(interfaceC2179861ASy);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    final IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC2179861ASy)) {
                            interfaceC2179861ASy2 = (InterfaceC2179861ASy) iInterfaceQueryLocalInterface2;
                        } else {
                            interfaceC2179861ASy2 = new InterfaceC2179861ASy(strongBinder2) { // from class: X.1AT8
                                public final IBinder LL;

                                @Override // X.InterfaceC2179861ASy
                                public final void i0() {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        this.LL.transact(2, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LL;
                                }

                                {
                                    this.LL = strongBinder2;
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void LLIIII(MediaMetadataCompat mediaMetadataCompat) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (mediaMetadataCompat != null) {
                                            parcelObtain.writeInt(1);
                                            parcelObtain.writeBundle(mediaMetadataCompat.LL);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(4, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void LLILIL(Bundle bundle10) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (bundle10 != null) {
                                            parcelObtain.writeInt(1);
                                            bundle10.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(7, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void V(PlaybackStateCompat playbackStateCompat) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (playbackStateCompat != null) {
                                            parcelObtain.writeInt(1);
                                            playbackStateCompat.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(3, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2179861ASy
                                public final void z(ParcelableVolumeInfo parcelableVolumeInfo) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                        if (parcelableVolumeInfo != null) {
                                            parcelObtain.writeInt(1);
                                            parcelableVolumeInfo.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(8, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }
                            };
                        }
                    }
                    w0(interfaceC2179861ASy2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zLLZILL = LLZILL();
                    parcel2.writeNoException();
                    parcel2.writeInt(zLLZILL ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentLLJJJIL = LLJJJIL();
                    parcel2.writeNoException();
                    if (pendingIntentLLJJJIL != null) {
                        parcel2.writeInt(1);
                        pendingIntentLLJJJIL.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case BdTuring.TYPE_ECAF /* 9 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long jLJJJJIZL = LJJJJIZL();
                    parcel2.writeNoException();
                    parcel2.writeLong(jLJJJJIZL);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo parcelableVolumeInfoJ = j();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoJ != null) {
                        parcel2.writeInt(1);
                        parcelableVolumeInfoJ.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int i3 = parcel.readInt();
                    int i4 = parcel.readInt();
                    parcel.readString();
                    U0(i3, i4);
                    parcel2.writeNoException();
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int i5 = parcel.readInt();
                    int i6 = parcel.readInt();
                    parcel.readString();
                    LLLIIII(i5, i6);
                    parcel2.writeNoException();
                    return true;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    L0(bundle3, string2);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String string3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    e1(bundle4, string3);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri2 = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    M0(uri2, bundle5);
                    parcel2.writeNoException();
                    return true;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    t(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    W0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LJJJJLL();
                    parcel2.writeNoException();
                    return true;
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LJIIJ(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        ratingCompatCreateFromParcel2 = RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    C(ratingCompatCreateFromParcel2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String string4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LJZL(bundle6, string4);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat mediaMetadataCompatLJJIFFI = LJJIFFI();
                    parcel2.writeNoException();
                    if (mediaMetadataCompatLJJIFFI != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(mediaMetadataCompatLJJIFFI.LL);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackStateCompatLJIL = LJIL();
                    parcel2.writeNoException();
                    if (playbackStateCompatLJIL != null) {
                        parcel2.writeInt(1);
                        playbackStateCompatLJIL.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LJII();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(null);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceLJLJLJ = LJLJLJ();
                    parcel2.writeNoException();
                    if (charSequenceLJLJLJ != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceLJLJLJ, parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLFF();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String string5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLIIJI(bundle7, string5);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String string6 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    H0(bundle8, string6);
                    parcel2.writeNoException();
                    return true;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    } else {
                        uri = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    LLLLZLL(uri, bundle9);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    E0();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Y();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLLLLZ(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    LLJJIJIL();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompatCreateFromParcel = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    T0(mediaDescriptionCompatCreateFromParcel);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompatCreateFromParcel2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    LLII(mediaDescriptionCompatCreateFromParcel2, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompatCreateFromParcel3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    LLLLLL(mediaDescriptionCompatCreateFromParcel3);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLLZZIL(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLZ();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    LJLLI(z);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLIIIJ();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLIILII(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    LLIZLLLIL(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle sessionInfo = getSessionInfo();
                    parcel2.writeNoException();
                    if (sessionInfo != null) {
                        parcel2.writeInt(1);
                        sessionInfo.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        ratingCompatCreateFromParcel = RatingCompat.CREATOR.createFromParcel(parcel);
                    } else {
                        ratingCompatCreateFromParcel = null;
                    }
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    h0(ratingCompatCreateFromParcel, bundle2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.v4.media.session.IMediaSession");
        return true;
    }
}
