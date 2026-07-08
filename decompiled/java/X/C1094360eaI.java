package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0eaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094360eaI {
    public final int LIZ;
    public final long LIZIZ;
    public final BadgeStruct LIZJ;
    public final BadgeStruct LIZLLL;
    public final ImageModel LJ;
    public final int LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final long LJIILIIL;

    public static C1094360eaI LIZ(int i, long j, BadgeStruct badgeStruct, BadgeStruct badgeStruct2, ImageModel imageModel, int i2, long j2, long j3, long j4, Integer num, String str, int i3, int i4, long j5) {
        return new C1094360eaI(i, j, badgeStruct, badgeStruct2, imageModel, i2, j2, j3, j4, num, str, i3, i4, j5);
    }

    public /* synthetic */ C1094360eaI(int i, long j, BadgeStruct badgeStruct, BadgeStruct badgeStruct2, int i2, long j2, long j3, long j4, Integer num, String str, int i3, int i4, long j5, int i5) {
        this(i, (i5 & 2) != 0 ? 0L : j, (i5 & 4) != 0 ? null : badgeStruct, (i5 & 8) != 0 ? null : badgeStruct2, (ImageModel) null, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0L : j2, (i5 & 128) != 0 ? 0L : j3, (i5 & 256) != 0 ? 0L : j4, (i5 & 512) != 0 ? null : num, (i5 & 1024) == 0 ? str : null, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i3, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i4, (i5 & 8192) != 0 ? 0L : j5);
    }

    public C1094360eaI(int i, long j, BadgeStruct badgeStruct, BadgeStruct badgeStruct2, ImageModel imageModel, int i2, long j2, long j3, long j4, Integer num, String str, int i3, int i4, long j5) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = badgeStruct;
        this.LIZLLL = badgeStruct2;
        this.LJ = imageModel;
        this.LJFF = i2;
        this.LJI = j2;
        this.LJII = j3;
        this.LJIIIIZZ = j4;
        this.LJIIIZ = num;
        this.LJIIJ = str;
        this.LJIIJJI = i3;
        this.LJIIL = i4;
        this.LJIILIIL = j5;
    }
}
