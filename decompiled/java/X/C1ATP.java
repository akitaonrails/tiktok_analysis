package X;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;

/* JADX INFO: renamed from: X.1ATP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1ATP extends IInterface {
    void C(RatingCompat ratingCompat);

    void E0();

    void H0(Bundle bundle, String str);

    void L0(Bundle bundle, String str);

    void LJII();

    void LJIIJ(long j);

    PlaybackStateCompat LJIL();

    MediaMetadataCompat LJJIFFI();

    long LJJJJIZL();

    void LJJJJLL();

    CharSequence LJLJLJ();

    void LJLLI(boolean z);

    void LJZL(Bundle bundle, String str);

    void LLFF();

    void LLII(MediaDescriptionCompat mediaDescriptionCompat, int i);

    void LLIIIJ();

    void LLIIJI(Bundle bundle, String str);

    void LLIILII(int i);

    void LLIZLLLIL(float f);

    void LLJJIJIL();

    PendingIntent LLJJJIL();

    void LLLFFI(InterfaceC2179861ASy interfaceC2179861ASy);

    void LLLIIII(int i, int i2);

    void LLLLLL(MediaDescriptionCompat mediaDescriptionCompat);

    void LLLLLLZ(int i);

    void LLLLZLL(Uri uri, Bundle bundle);

    void LLLZZIL(int i);

    void LLZ();

    boolean LLZILL();

    void M0(Uri uri, Bundle bundle);

    void T0(MediaDescriptionCompat mediaDescriptionCompat);

    void U0(int i, int i2);

    void W0();

    void Y();

    void e1(Bundle bundle, String str);

    Bundle getExtras();

    String getPackageName();

    Bundle getSessionInfo();

    String getTag();

    void h0(RatingCompat ratingCompat, Bundle bundle);

    ParcelableVolumeInfo j();

    boolean l(KeyEvent keyEvent);

    void l0(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    void next();

    void pause();

    void play();

    void prepare();

    void previous();

    void stop();

    void t(long j);

    void w0(InterfaceC2179861ASy interfaceC2179861ASy);
}
