package android.support.v4.media.session;

import X.BinderC2179831ASv;
import X.C0W0I;
import X.C1AT1;
import X.C1AT3;
import X.C1AT5;
import X.C1ATP;
import X.C2179821ASu;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public final class MediaControllerCompat {
    public final MediaControllerImplApi21 LIZ;
    public final ConcurrentHashMap<Callback, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static abstract class Callback implements IBinder.DeathRecipient {
        public final C2179821ASu LL = new MediaController.Callback(this) { // from class: X.1ASu
            public final WeakReference<MediaControllerCompat.Callback> LIZ;

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                MediaControllerCompat.Callback callback = this.LIZ.get();
                if (callback != null) {
                    callback.LIZJ();
                }
            }

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.LIZ.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.LIZ(bundle);
                this.LIZ.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                MediaControllerCompat.Callback callback = this.LIZ.get();
                if (callback != null) {
                    callback.LIZ(MediaMetadataCompat.LIZ(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                MediaControllerCompat.Callback callback = this.LIZ.get();
                if (callback != null && callback.LLILLL == null) {
                    callback.LIZIZ(PlaybackStateCompat.LIZ(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (this.LIZ.get() != null && list != null) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (MediaSession.QueueItem queueItem2 : list) {
                        if (queueItem2 != null) {
                            MediaSession.QueueItem queueItem3 = queueItem2;
                            queueItem = new MediaSessionCompat.QueueItem(queueItem3, MediaDescriptionCompat.LIZ(C1AT0.LIZIZ(queueItem3)), C1AT0.LIZJ(queueItem3));
                        } else {
                            queueItem = null;
                        }
                        arrayList.add(queueItem);
                    }
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                this.LIZ.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.LIZ(bundle);
                this.LIZ.get();
            }
        };
        public MessageHandler LLILLJJLI;
        public BinderC2179831ASv LLILLL;

        public void LIZ(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void LIZIZ(PlaybackStateCompat playbackStateCompat) {
        }

        public void LIZJ() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            LIZLLL(8, null, null);
        }

        public class MessageHandler extends Handler {
            public boolean LIZ;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (!this.LIZ) {
                }
                switch (message.what) {
                    case 1:
                        MediaSessionCompat.LIZ(message.getData());
                        Callback.this.getClass();
                        break;
                    case 2:
                        Callback.this.LIZIZ((PlaybackStateCompat) message.obj);
                        break;
                    case 3:
                        Callback.this.LIZ((MediaMetadataCompat) message.obj);
                        break;
                    case 4:
                        Callback.this.getClass();
                        break;
                    case 5:
                        Callback.this.getClass();
                        break;
                    case 6:
                        Callback.this.getClass();
                        break;
                    case 7:
                        MediaSessionCompat.LIZ((Bundle) message.obj);
                        Callback.this.getClass();
                        break;
                    case 8:
                        Callback.this.LIZJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        Callback callback = Callback.this;
                        ((Integer) message.obj).intValue();
                        callback.getClass();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        Callback callback2 = Callback.this;
                        ((Boolean) message.obj).booleanValue();
                        callback2.getClass();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        Callback callback3 = Callback.this;
                        ((Integer) message.obj).intValue();
                        callback3.getClass();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        Callback.this.getClass();
                        break;
                }
            }

            public MessageHandler(Looper looper) {
                super(looper);
            }
        }

        public final void LJ(Handler handler) {
            if (handler == null) {
                MessageHandler messageHandler = this.LLILLJJLI;
                if (messageHandler != null) {
                    messageHandler.LIZ = false;
                    messageHandler.removeCallbacksAndMessages(null);
                    this.LLILLJJLI = null;
                    return;
                }
                return;
            }
            MessageHandler messageHandler2 = new MessageHandler(handler.getLooper());
            this.LLILLJJLI = messageHandler2;
            messageHandler2.LIZ = true;
        }

        public final void LIZLLL(int i, Object obj, Bundle bundle) {
            MessageHandler messageHandler = this.LLILLJJLI;
            if (messageHandler != null) {
                Message messageObtainMessage = messageHandler.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }
    }

    public static class MediaControllerImplApi21 {
        public final MediaController LIZ;
        public final Object LIZIZ = new Object();
        public final List<Callback> LIZJ = new ArrayList();
        public final HashMap<Callback, BinderC2179831ASv> LIZLLL = new HashMap<>();
        public final MediaSessionCompat.Token LJ;

        public final C1AT5 LIZ() {
            final MediaController.TransportControls transportControls = this.LIZ.getTransportControls();
            int i = Build.VERSION.SDK_INT;
            return i >= 29 ? new C1AT1(transportControls) { // from class: X.1AT2
            } : i >= 24 ? new C1AT1(transportControls) : new C1AT3(transportControls);
        }

        public final void LIZIZ() {
            if (this.LJ.LIZ() == null) {
                return;
            }
            for (Callback callback : (ArrayList) this.LIZJ) {
                BinderC2179831ASv binderC2179831ASv = new BinderC2179831ASv(callback);
                this.LIZLLL.put(callback, binderC2179831ASv);
                callback.LLILLL = binderC2179831ASv;
                try {
                    this.LJ.LIZ().LLLFFI(binderC2179831ASv);
                    callback.LIZLLL(13, null, null);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            ((ArrayList) this.LIZJ).clear();
        }

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> mMediaControllerImpl;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.mMediaControllerImpl = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                C1ATP c1atp;
                MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.LIZIZ) {
                        try {
                            MediaSessionCompat.Token token = mediaControllerImplApi21.LJ;
                            final IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                            if (binder == null) {
                                c1atp = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C1ATP)) {
                                    c1atp = (C1ATP) iInterfaceQueryLocalInterface;
                                } else {
                                    c1atp = new C1ATP(binder) { // from class: X.1AT7
                                        public final IBinder LL;

                                        @Override // X.C1ATP
                                        public final PlaybackStateCompat LJIL() {
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                this.LL.transact(28, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                PlaybackStateCompat playbackStateCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                return playbackStateCompatCreateFromParcel;
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // X.C1ATP
                                        public final MediaMetadataCompat LJJIFFI() {
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                this.LL.transact(27, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                MediaMetadataCompat mediaMetadataCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                return mediaMetadataCompatCreateFromParcel;
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // X.C1ATP
                                        public final PendingIntent LLJJJIL() {
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                this.LL.transact(8, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                PendingIntent pendingIntent = parcelObtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                return pendingIntent;
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // X.C1ATP
                                        public final void pause() {
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                this.LL.transact(18, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // X.C1ATP
                                        public final void play() {
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                this.LL.transact(13, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // X.C1ATP
                                        public final void stop() {
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                this.LL.transact(19, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // android.os.IInterface
                                        public final IBinder asBinder() {
                                            return this.LL;
                                        }

                                        {
                                            this.LL = binder;
                                        }

                                        @Override // X.C1ATP
                                        public final void LLLFFI(InterfaceC2179861ASy interfaceC2179861ASy) {
                                            IBinder iBinderAsBinder;
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                if (interfaceC2179861ASy == null) {
                                                    iBinderAsBinder = null;
                                                } else {
                                                    iBinderAsBinder = interfaceC2179861ASy.asBinder();
                                                }
                                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                                this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // X.C1ATP
                                        public final boolean l(KeyEvent keyEvent) {
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                boolean z = true;
                                                if (keyEvent == null) {
                                                    parcelObtain.writeInt(0);
                                                } else {
                                                    parcelObtain.writeInt(1);
                                                    keyEvent.writeToParcel(parcelObtain, 0);
                                                }
                                                this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                if (parcelObtain2.readInt() == 0) {
                                                    z = false;
                                                }
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                return z;
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }

                                        @Override // X.C1ATP
                                        public final void w0(InterfaceC2179861ASy interfaceC2179861ASy) {
                                            IBinder iBinderAsBinder;
                                            Parcel parcelObtain = Parcel.obtain();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                                if (interfaceC2179861ASy == null) {
                                                    iBinderAsBinder = null;
                                                } else {
                                                    iBinderAsBinder = interfaceC2179861ASy.asBinder();
                                                }
                                                parcelObtain.writeStrongBinder(iBinderAsBinder);
                                                this.LL.transact(4, parcelObtain, parcelObtain2, 0);
                                                parcelObtain2.readException();
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain2.recycle();
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }
                                    };
                                }
                            }
                            token.LIZJ(c1atp);
                            mediaControllerImplApi21.LJ.LIZLLL(C0W0I.LIZ(bundle));
                            mediaControllerImplApi21.LIZIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }

        public final void LIZJ(Callback callback) {
            this.LIZ.unregisterCallback(callback.LL);
            synchronized (this.LIZIZ) {
                try {
                    if (this.LJ.LIZ() != null) {
                        try {
                            BinderC2179831ASv binderC2179831ASvRemove = this.LIZLLL.remove(callback);
                            if (binderC2179831ASvRemove != null) {
                                callback.LLILLL = null;
                                this.LJ.LIZ().w0(binderC2179831ASvRemove);
                            }
                        } catch (RemoteException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        ((ArrayList) this.LIZJ).remove(callback);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.LJ = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.mInner);
            this.LIZ = mediaController;
            if (token.LIZ() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }
    }

    public final MediaMetadataCompat LIZ() {
        MediaMetadata metadata = this.LIZ.LIZ.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.LIZ(metadata);
        }
        return null;
    }

    public final PlaybackStateCompat LIZIZ() {
        MediaControllerImplApi21 mediaControllerImplApi21 = this.LIZ;
        if (mediaControllerImplApi21.LJ.LIZ() != null) {
            try {
                return mediaControllerImplApi21.LJ.LIZ().LJIL();
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        PlaybackState playbackState = mediaControllerImplApi21.LIZ.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.LIZ(playbackState);
        }
        return null;
    }

    public final void LIZJ(Callback callback) {
        if (callback != null) {
            if (this.LIZIZ.putIfAbsent(callback, Boolean.TRUE) == null) {
                Handler handler = new Handler();
                callback.LJ(handler);
                MediaControllerImplApi21 mediaControllerImplApi21 = this.LIZ;
                mediaControllerImplApi21.LIZ.registerCallback(callback.LL, handler);
                synchronized (mediaControllerImplApi21.LIZIZ) {
                    try {
                        if (mediaControllerImplApi21.LJ.LIZ() != null) {
                            BinderC2179831ASv binderC2179831ASv = new BinderC2179831ASv(callback);
                            mediaControllerImplApi21.LIZLLL.put(callback, binderC2179831ASv);
                            callback.LLILLL = binderC2179831ASv;
                            try {
                                mediaControllerImplApi21.LJ.LIZ().LLLFFI(binderC2179831ASv);
                                callback.LIZLLL(13, null, null);
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            callback.LLILLL = null;
                            ((ArrayList) mediaControllerImplApi21.LIZJ).add(callback);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public final void LIZLLL(Callback callback) {
        if (callback != null) {
            if (this.LIZIZ.remove(callback) == null) {
                return;
            }
            try {
                this.LIZ.LIZJ(callback);
                callback.LJ(null);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                callback.LJ(null);
                throw th;
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public MediaControllerCompat(final Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            final MediaSessionCompat.Token token = mediaSessionCompat.LIZ.LIZIZ;
            if (Build.VERSION.SDK_INT >= 29) {
                this.LIZ = new MediaControllerImplApi21(context, token) { // from class: X.1ASz
                };
                return;
            } else {
                this.LIZ = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.LIZ = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
