package android.support.v4.media.session;

import X.BinderC2179671ASf;
import X.C1ATP;
import X.C2179691ASh;
import X.C2179721ASk;
import X.C2179741ASm;
import X.C2188811AlT;
import X.C2189641Amo;
import X.C786410Ut5;
import X.InterfaceC2179711ASj;
import X.InterfaceC2179731ASl;
import X.InterfaceC2179861ASy;
import X.InterfaceC815410Vyl;
import android.content.Intent;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
public final class MediaSessionCompat {
    public static int LIZLLL;
    public final C2179691ASh LIZ;
    public final MediaControllerCompat LIZIZ;
    public final ArrayList<InterfaceC2179711ASj> LIZJ;

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C2189641Amo(3);
        public C1ATP mExtraBinder;
        public final Object mInner;
        public final Object mLock = new Object();
        public InterfaceC815410Vyl mSession2Token = null;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final C1ATP LIZ() {
            C1ATP c1atp;
            synchronized (this.mLock) {
                try {
                    c1atp = this.mExtraBinder;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1atp;
        }

        public final InterfaceC815410Vyl LIZIZ() {
            InterfaceC815410Vyl interfaceC815410Vyl;
            synchronized (this.mLock) {
                try {
                    interfaceC815410Vyl = this.mSession2Token;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return interfaceC815410Vyl;
        }

        public final int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void LIZJ(C1ATP c1atp) {
            synchronized (this.mLock) {
                try {
                    this.mExtraBinder = c1atp;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public final void LIZLLL(InterfaceC815410Vyl interfaceC815410Vyl) {
            synchronized (this.mLock) {
                try {
                    this.mSession2Token = interfaceC815410Vyl;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.mInner;
            if (obj2 == null) {
                if (token.mInner == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public Token(Object obj, BinderC2179671ASf binderC2179671ASf) {
            this.mInner = obj;
            this.mExtraBinder = binderC2179671ASf;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }
    }

    public MediaSessionCompat() {
        throw null;
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C2189641Amo(1);
        public final MediaDescriptionCompat mDescription;
        public final long mId;
        public MediaSession.QueueItem mItemFwk;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaSession.QueueItem {Description=");
            sbLIZ.append(this.mDescription);
            sbLIZ.append(", Id=");
            sbLIZ.append(this.mId);
            sbLIZ.append(" }");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public QueueItem(Parcel parcel) {
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat != null) {
                if (j != -1) {
                    this.mDescription = mediaDescriptionCompat;
                    this.mId = j;
                    this.mItemFwk = queueItem;
                    return;
                }
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            throw new IllegalArgumentException("Description cannot be null");
        }
    }

    public final Token LIZIZ() {
        return this.LIZ.LIZIZ;
    }

    public final boolean LIZLLL() {
        return this.LIZ.LIZ.isActive();
    }

    public final void LJ() {
        C2179691ASh c2179691ASh = this.LIZ;
        c2179691ASh.LJ = true;
        c2179691ASh.LJFF.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = c2179691ASh.LIZ.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(c2179691ASh.LIZ);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c2179691ASh.LIZ.setCallback(null);
        c2179691ASh.LIZ.release();
    }

    public static abstract class Callback {
        public boolean LIZJ;
        public CallbackHandler LJ;
        public final Object LIZ = new Object();
        public final C2179721ASk LIZIZ = new MediaSession.Callback() { // from class: X.1ASk
            public final C2179661ASe LIZ() {
                C2179661ASe c2179661ASe;
                synchronized (this.LIZ.LIZ) {
                    try {
                        c2179661ASe = (C2179661ASe) this.LIZ.LIZLLL.get();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (c2179661ASe == null || this.LIZ != c2179661ASe.LIZJ()) {
                    return null;
                }
                return c2179661ASe;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LIZJ();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LJ();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LJFF();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepare() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LJI();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LJIIIIZZ();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LJIIIZ();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LJIIJ();
                c2179661ASeLIZ.LIZLLL(null);
            }

            public static void LIZIZ(C2179661ASe c2179661ASe) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strLIZIZ = c2179661ASe.LIZIZ();
                if (TextUtils.isEmpty(strLIZIZ)) {
                    strLIZIZ = "android.media.session.MediaController";
                }
                c2179661ASe.LIZLLL(new C2179741ASm(strLIZIZ, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return false;
                }
                LIZIZ(c2179661ASeLIZ);
                boolean zLIZLLL = this.LIZ.LIZLLL(intent);
                c2179661ASeLIZ.LIZLLL(null);
                if (!zLIZLLL && !super.onMediaButtonEvent(intent)) {
                    return false;
                }
                return true;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.LJII(j);
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetPlaybackSpeed(float f) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                MediaSessionCompat.Callback callback = this.LIZ;
                RatingCompat.LIZ(rating);
                callback.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        this.LIZ.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        this.LIZ.getClass();
                    } else {
                        this.LIZ.LIZIZ(str);
                    }
                } catch (BadParcelableException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                this.LIZ.getClass();
                c2179661ASeLIZ.LIZLLL(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                IBinder iBinderAsBinder;
                C2179661ASe c2179661ASeLIZ = LIZ();
                if (c2179661ASeLIZ == null) {
                    return;
                }
                MediaSessionCompat.LIZ(bundle);
                LIZIZ(c2179661ASeLIZ);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        MediaSessionCompat.Token token = c2179661ASeLIZ.LIZIZ;
                        C1ATP c1atpLIZ = token.LIZ();
                        if (c1atpLIZ == null) {
                            iBinderAsBinder = null;
                        } else {
                            iBinderAsBinder = c1atpLIZ.asBinder();
                        }
                        C786410Ut5.LJJIIZ(bundle2, iBinderAsBinder, "android.support.v4.media.session.EXTRA_BINDER");
                        InterfaceC815410Vyl interfaceC815410VylLIZIZ = token.LIZIZ();
                        if (interfaceC815410VylLIZIZ != null) {
                            Bundle bundle3 = new Bundle();
                            C786410Ut5.LJJIJL(bundle3, "a", new ParcelImpl(interfaceC815410VylLIZIZ));
                            C786410Ut5.LJJIJL(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        MediaSessionCompat.Callback callback = this.LIZ;
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        callback.getClass();
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        MediaSessionCompat.Callback callback2 = this.LIZ;
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        callback2.getClass();
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        MediaSessionCompat.Callback callback3 = this.LIZ;
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        callback3.getClass();
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        this.LIZ.getClass();
                    }
                } catch (BadParcelableException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c2179661ASeLIZ.LIZLLL(null);
            }
        };
        public WeakReference<InterfaceC2179731ASl> LIZLLL = new WeakReference<>(null);

        public void LIZIZ(String str) {
        }

        public void LIZJ() {
        }

        public void LJ() {
        }

        public void LJFF() {
        }

        public void LJI() {
        }

        public void LJII(long j) {
        }

        public void LJIIIIZZ() {
        }

        public void LJIIIZ() {
        }

        public void LJIIJ() {
        }

        public class CallbackHandler extends Handler {
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                InterfaceC2179731ASl interfaceC2179731ASl;
                Callback callback;
                CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (Callback.this.LIZ) {
                        try {
                            interfaceC2179731ASl = Callback.this.LIZLLL.get();
                            callback = Callback.this;
                            callbackHandler = callback.LJ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (interfaceC2179731ASl != null && callback == interfaceC2179731ASl.LIZJ() && callbackHandler != null) {
                        interfaceC2179731ASl.LIZLLL((C2179741ASm) message.obj);
                        Callback.this.LIZ(interfaceC2179731ASl, callbackHandler);
                        interfaceC2179731ASl.LIZLLL(null);
                    }
                }
            }

            public CallbackHandler(Looper looper) {
                super(looper);
            }
        }

        public boolean LIZLLL(Intent intent) {
            InterfaceC2179731ASl interfaceC2179731ASl;
            CallbackHandler callbackHandler;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.LIZ) {
                try {
                    interfaceC2179731ASl = this.LIZLLL.get();
                    callbackHandler = this.LJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (interfaceC2179731ASl == null || callbackHandler == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C2179741ASm c2179741ASmLJ = interfaceC2179731ASl.LJ();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                LIZ(interfaceC2179731ASl, callbackHandler);
                return false;
            }
            if (keyEvent.getRepeatCount() == 0) {
                if (this.LIZJ) {
                    callbackHandler.removeMessages(1);
                    this.LIZJ = false;
                    PlaybackStateCompat playbackStateCompatLJIL = interfaceC2179731ASl.LJIL();
                    if (playbackStateCompatLJIL != null && (playbackStateCompatLJIL.mActions & 32) != 0) {
                        LJIIIIZZ();
                    }
                    return true;
                }
                this.LIZJ = true;
                C786410Ut5.LJLJLJ(callbackHandler, callbackHandler.obtainMessage(1, c2179741ASmLJ), ViewConfiguration.getDoubleTapTimeout());
                return true;
            }
            LIZ(interfaceC2179731ASl, callbackHandler);
            return true;
        }

        public final void LIZ(InterfaceC2179731ASl interfaceC2179731ASl, Handler handler) {
            boolean z;
            boolean z2;
            if (!this.LIZJ) {
                return;
            }
            boolean z3 = false;
            this.LIZJ = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatLJIL = interfaceC2179731ASl.LJIL();
            if (playbackStateCompatLJIL != null) {
                long j = playbackStateCompatLJIL.mActions;
                if (playbackStateCompatLJIL.mState == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if ((516 & j) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((j & 514) != 0) {
                    z3 = true;
                }
                if (z) {
                    if (z3) {
                        LJ();
                    }
                } else {
                    if (!z2) {
                        return;
                    }
                    LJFF();
                }
            }
        }

        public final void LJIIJJI(InterfaceC2179731ASl interfaceC2179731ASl, Handler handler) {
            synchronized (this.LIZ) {
                try {
                    this.LIZLLL = new WeakReference<>(interfaceC2179731ASl);
                    CallbackHandler callbackHandler = this.LJ;
                    CallbackHandler callbackHandler2 = null;
                    if (callbackHandler != null) {
                        callbackHandler.removeCallbacksAndMessages(null);
                    }
                    if (interfaceC2179731ASl != null && handler != null) {
                        callbackHandler2 = new CallbackHandler(handler.getLooper());
                    }
                    this.LJ = callbackHandler2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C2189641Amo(2);
        public final ResultReceiver LL;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.LL = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.LL.writeToParcel(parcel, i);
        }
    }

    public static void LIZ(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public final void LJFF(boolean z) {
        this.LIZ.LIZ.setActive(z);
        Iterator<InterfaceC2179711ASj> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    public final void LJII(MediaMetadataCompat mediaMetadataCompat) {
        C2179691ASh c2179691ASh = this.LIZ;
        c2179691ASh.LJII = mediaMetadataCompat;
        c2179691ASh.LIZ.setMetadata((MediaMetadata) mediaMetadataCompat.LIZJ());
    }

    public final void LJIIIIZZ(PlaybackStateCompat playbackStateCompat) {
        int iBeginBroadcast;
        C2179691ASh c2179691ASh = this.LIZ;
        c2179691ASh.LJI = playbackStateCompat;
        synchronized (c2179691ASh.LIZJ) {
            try {
                iBeginBroadcast = c2179691ASh.LJFF.beginBroadcast();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast >= 0) {
                    try {
                        ((InterfaceC2179861ASy) c2179691ASh.LJFF.getBroadcastItem(iBeginBroadcast)).V(playbackStateCompat);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    c2179691ASh.LJFF.finishBroadcast();
                }
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c2179691ASh.LIZ.setPlaybackState((PlaybackState) playbackStateCompat.LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.session.PlaybackStateCompat LIZJ(android.support.v4.media.session.PlaybackStateCompat r10, android.support.v4.media.MediaMetadataCompat r11) {
        /*
            if (r10 == 0) goto L5b
            long r3 = r10.mPosition
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L5b
            int r1 = r10.mState
            r0 = 3
            if (r1 == r0) goto L15
            r0 = 4
            if (r1 == r0) goto L15
            r0 = 5
            if (r1 != r0) goto L5b
        L15:
            long r7 = r10.mUpdateTime
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5b
            long r3 = android.os.SystemClock.elapsedRealtime()
            float r9 = r10.mSpeed
            long r5 = r3 - r7
            float r0 = (float) r5
            float r9 = r9 * r0
            long r5 = (long) r9
            long r7 = r10.mPosition
            long r5 = r5 + r7
            if (r11 == 0) goto L5c
            android.os.Bundle r0 = r11.LL
            java.lang.String r7 = "android.media.metadata.DURATION"
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L5c
            android.os.Bundle r0 = r11.LL
            long r7 = r0.getLong(r7, r1)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L5c
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L5c
            r1 = r7
        L46:
            X.1ASc r6 = new X.1ASc
            r6.<init>(r10)
            int r5 = r10.mState
            float r0 = r10.mSpeed
            r6.LIZIZ = r5
            r6.LIZJ = r1
            r6.LJIIIIZZ = r3
            r6.LJ = r0
            android.support.v4.media.session.PlaybackStateCompat r10 = r6.LIZ()
        L5b:
            return r10
        L5c:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L46
            r1 = r5
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.LIZJ(android.support.v4.media.session.PlaybackStateCompat, android.support.v4.media.MediaMetadataCompat):android.support.v4.media.session.PlaybackStateCompat");
    }

    public final void LJI(Callback callback, Handler handler) {
        if (callback == null) {
            this.LIZ.LJFF(null, null);
            return;
        }
        C2179691ASh c2179691ASh = this.LIZ;
        if (handler == null) {
            handler = new Handler();
        }
        c2179691ASh.LJFF(callback, handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaSessionCompat(final android.content.Context r7, final java.lang.String r8, android.content.ComponentName r9, android.app.PendingIntent r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.<init>(android.content.Context, java.lang.String, android.content.ComponentName, android.app.PendingIntent):void");
    }
}
