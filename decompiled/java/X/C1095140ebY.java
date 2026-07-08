package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0ebY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095140ebY {
    public final long LIZ;
    public final long LIZIZ;
    public final ImageModel LIZJ;
    public final BadgeStruct LIZLLL;
    public final int LJ;
    public final Integer LJFF;
    public final String LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final String LJIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1095140ebY() {
        long j = 0;
        this(j, j, null, 0, 0 == true ? 1 : 0, j, 8191);
    }

    public /* synthetic */ C1095140ebY(long j, long j2, ImageModel imageModel, int i, String str, long j3, int i2) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? null : imageModel, null, (i2 & 16) != 0 ? 0 : i, null, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? 0L : j3, 0L, 0L, 0L, 0L, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : null);
    }

    public C1095140ebY(long j, long j2, ImageModel imageModel, BadgeStruct badgeStruct, int i, Integer num, String str, long j3, long j4, long j5, long j6, long j7, String str2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = imageModel;
        this.LIZLLL = badgeStruct;
        this.LJ = i;
        this.LJFF = num;
        this.LJI = str;
        this.LJII = j3;
        this.LJIIIIZZ = j4;
        this.LJIIIZ = j5;
        this.LJIIJ = j6;
        this.LJIIJJI = j7;
        this.LJIIL = str2;
    }

    public static C1095140ebY LIZ(C1095140ebY c1095140ebY, long j, long j2, ImageModel imageModel, BadgeStruct badgeStruct, int i, Integer num, String str, long j3, long j4, long j5, long j6, long j7, String str2, int i2) {
        String str3 = str2;
        long j8 = j7;
        long j9 = j3;
        long j10 = j4;
        String str4 = str;
        BadgeStruct badgeStruct2 = badgeStruct;
        long j11 = j6;
        Integer num2 = num;
        int i3 = i;
        ImageModel imageModel2 = imageModel;
        long j12 = j;
        long j13 = j5;
        long j14 = j2;
        if ((i2 & 1) != 0) {
            j12 = c1095140ebY.LIZ;
        }
        if ((i2 & 2) != 0) {
            j14 = c1095140ebY.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            imageModel2 = c1095140ebY.LIZJ;
        }
        if ((i2 & 8) != 0) {
            badgeStruct2 = c1095140ebY.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i3 = c1095140ebY.LJ;
        }
        if ((i2 & 32) != 0) {
            num2 = c1095140ebY.LJFF;
        }
        if ((i2 & 64) != 0) {
            str4 = c1095140ebY.LJI;
        }
        if ((i2 & 128) != 0) {
            j9 = c1095140ebY.LJII;
        }
        if ((i2 & 256) != 0) {
            j10 = c1095140ebY.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            j13 = c1095140ebY.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            j11 = c1095140ebY.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j8 = c1095140ebY.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str3 = c1095140ebY.LJIIL;
        }
        c1095140ebY.getClass();
        String str5 = str3;
        Integer num3 = num2;
        String str6 = str4;
        return new C1095140ebY(j12, j14, imageModel2, badgeStruct2, i3, num3, str6, j9, j10, j13, j11, j8, str5);
    }
}
