package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0aa7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940490aa7 {
    public final long LIZ;
    public final Long LIZIZ;
    public final Context LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final EnumC940090aZT LJFF;
    public LiveWidget LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;
    public final View LJIIL;
    public final DataChannel LJIILIIL;
    public final int LJIILJJIL;

    public C940490aa7() {
        this(0L, null, null, null, null, null, 0, null, 0L, null, null, 0, 32767);
    }

    public final String toString() {
        return "LinkMicFeedPackageData(roomId=" + this.LIZ + ", roomOwnerUserId=" + this.LIZIZ + ", context=" + this.LIZJ + ", isFromForYouFeed=" + this.LIZLLL + ", isFromFollowingFeed=" + this.LJ + ", pageType=" + this.LJFF + ", liveWidget=" + this.LJI + ", requestId=" + this.LJII + ", followStatus=" + this.LJIIIIZZ + ", background=" + this.LJIIIZ + ", clientVersion=" + this.LJIIJ + ", webcastSdkVersion=" + this.LJIIJJI + ", containerView=" + this.LJIIL + ", dataChannel=" + this.LJIILIIL + ", roomMode=" + this.LJIILJJIL + ')';
    }

    public C940490aa7(long j, Long l, Context context, EnumC940090aZT enumC940090aZT, LiveWidget liveWidget, String str, int i, String str2, long j2, View view, DataChannel dataChannel, int i2, int i3) {
        Long l2 = l;
        LiveWidget liveWidget2 = liveWidget;
        EnumC940090aZT enumC940090aZT2 = enumC940090aZT;
        Context context2 = context;
        String str3 = str2;
        int i4 = i;
        String str4 = str;
        View view2 = view;
        long j3 = j2;
        int i5 = i2;
        DataChannel dataChannel2 = dataChannel;
        long j4 = (i3 & 1) != 0 ? 0L : j;
        l2 = (i3 & 2) != 0 ? 0L : l2;
        context2 = (i3 & 4) != 0 ? null : context2;
        enumC940090aZT2 = (i3 & 32) != 0 ? EnumC940090aZT.FEED : enumC940090aZT2;
        liveWidget2 = (i3 & 64) != 0 ? null : liveWidget2;
        str4 = (i3 & 128) != 0 ? null : str4;
        i4 = (i3 & 256) != 0 ? -1 : i4;
        str3 = (i3 & 1024) != 0 ? null : str3;
        j3 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1L : j3;
        view2 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : view2;
        dataChannel2 = (i3 & 8192) != 0 ? null : dataChannel2;
        i5 = (i3 & 16384) != 0 ? 0 : i5;
        this.LIZ = j4;
        this.LIZIZ = l2;
        this.LIZJ = context2;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = enumC940090aZT2;
        this.LJI = liveWidget2;
        this.LJII = str4;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = null;
        this.LJIIJ = str3;
        this.LJIIJJI = j3;
        this.LJIIL = view2;
        this.LJIILIIL = dataChannel2;
        this.LJIILJJIL = i5;
    }
}
