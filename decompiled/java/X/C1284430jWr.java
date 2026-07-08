package X;

import android.media.MediaCodecInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0jWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284430jWr {
    public static final C1284470jWv[] LIZ = {new C1284470jWv(128, 20250, 4000), new C1284470jWv(256, 40500, 10000), new C1284470jWv(512, 108000, 14000), new C1284470jWv(1024, 216000, 20000), new C1284470jWv(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, 245760, 20000), new C1284470jWv(SpeechEngineDefines.TTS_WORK_MODE_BOTH, 245760, 50000), new C1284470jWv(8192, 522240, 50000), new C1284470jWv(16384, 589824, 135000), new C1284470jWv(32768, 983040, 240000), new C1284470jWv(65536, 2073600, 240000), new C1284470jWv(131072, 4177920, 240000), new C1284470jWv(262144, 8355840, 480000), new C1284470jWv(524288, 16711680, 800000)};

    public static MediaCodecInfo.CodecProfileLevel LIZIZ(MediaCodecInfo.CodecCapabilities codecCapabilities, int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = null;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecCapabilities.profileLevels) {
            int i3 = codecProfileLevel2.profile;
            if (i3 == i) {
                return codecProfileLevel2;
            }
            if ((codecProfileLevel == null || codecProfileLevel.profile < i3) && i2 != VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal()) {
                codecProfileLevel = codecProfileLevel2;
            }
        }
        return codecProfileLevel;
    }

    public static int LIZ(MediaCodecInfo.CodecProfileLevel codecProfileLevel, int i, int i2, int i3, int i4) {
        int i5;
        long j;
        long j2;
        long j3;
        long j4 = ((long) i) * ((long) i2) * ((long) i3);
        C1284470jWv[] c1284470jWvArr = LIZ;
        int i6 = 0;
        do {
            C1284470jWv c1284470jWv = c1284470jWvArr[i6];
            int i7 = c1284470jWv.LIZ;
            int i8 = codecProfileLevel.level;
            if (i7 >= i8) {
                return i8;
            }
            long j5 = ((long) c1284470jWv.LIZIZ) * 256;
            int i9 = codecProfileLevel.profile;
            if (i9 != 1 && i9 != 2 && i9 != 4) {
                if (i9 != 8) {
                    if (i9 != 16) {
                        if (i9 != 32 && i9 != 64) {
                            if (i9 == 65536 || i9 != 524288) {
                                i5 = c1284470jWv.LIZJ;
                                j = ((long) i5) * 1000;
                            }
                            j2 = c1284470jWv.LIZJ;
                            j3 = 1250;
                        } else {
                            j2 = c1284470jWv.LIZJ;
                            j3 = 4000;
                        }
                    } else {
                        j2 = c1284470jWv.LIZJ;
                        j3 = 3000;
                    }
                    j = j2 * j3;
                } else {
                    j2 = c1284470jWv.LIZJ;
                    j3 = 1250;
                    j = j2 * j3;
                }
            } else {
                i5 = c1284470jWv.LIZJ;
                j = ((long) i5) * 1000;
            }
            if (j4 <= j5 && i4 <= j) {
                return i7;
            }
            i6++;
        } while (i6 < 13);
        return codecProfileLevel.level;
    }
}
