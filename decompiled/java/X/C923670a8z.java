package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0a8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923670a8z {
    public final String LIZ;
    public final String LIZIZ;
    public final MultiLiveAnchorPanelSettings LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final ImageModel LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final long LJIILIIL;

    public C923670a8z() {
        this(null, null, null, false, false, null, null, 0L, 0L, 0, 0, 0L, 16383);
    }

    public C923670a8z(String str, String str2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, boolean z, boolean z2, String str3, ImageModel imageModel, long j, long j2, int i, int i2, long j3, int i3) {
        String str4;
        String str5;
        String str6 = str2;
        String str7 = str3;
        boolean z3 = z2;
        boolean z4 = z;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorPanelSettings;
        long j4 = j2;
        long j5 = j;
        long j6 = j3;
        int i4 = i2;
        int i5 = i;
        String str8 = (i3 & 1) != 0 ? null : str;
        str6 = (i3 & 2) != 0 ? null : str6;
        multiLiveAnchorPanelSettings2 = (i3 & 4) != 0 ? null : multiLiveAnchorPanelSettings2;
        z4 = (i3 & 8) != 0 ? false : z4;
        if ((i3 & 16) != 0) {
            str4 = "room";
        } else {
            str4 = null;
        }
        if ((i3 & 32) != 0) {
            str5 = "others";
        } else {
            str5 = null;
        }
        z3 = (i3 & 64) != 0 ? false : z3;
        str7 = (i3 & 128) != 0 ? "" : str7;
        ImageModel imageModel2 = (i3 & 256) == 0 ? imageModel : null;
        j5 = (i3 & 512) != 0 ? 0L : j5;
        j4 = (i3 & 1024) != 0 ? 0L : j4;
        i5 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i5;
        i4 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i4;
        j6 = (i3 & 8192) != 0 ? 0L : j6;
        this.LIZ = str8;
        this.LIZIZ = str6;
        this.LIZJ = multiLiveAnchorPanelSettings2;
        this.LIZLLL = z4;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z3;
        this.LJII = str7;
        this.LJIIIIZZ = imageModel2;
        this.LJIIIZ = j5;
        this.LJIIJ = j4;
        this.LJIIJJI = i5;
        this.LJIIL = i4;
        this.LJIILIIL = j6;
    }
}
