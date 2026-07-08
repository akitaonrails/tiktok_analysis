package X;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.ss.pusher.core.codec.DefaultAudioEncoderFactory;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278840jNq {
    public static final String LJFF = C1278840jNq.class.getSimpleName();
    public final PushBase LIZ;
    public final C1278910jNx LIZIZ;
    public String[] LIZJ;
    public String LIZLLL;
    public int LJ;

    public final String LIZ() {
        String strGetSupportedFormats;
        C1278760jNi c1278760jNiLIZIZ = this.LIZIZ.LIZIZ();
        DefaultAudioEncoderFactory defaultAudioEncoderFactory = c1278760jNiLIZIZ != null ? c1278760jNiLIZIZ.LLJILJILJ : null;
        String[] strArr = this.LIZJ;
        String str = LJFF;
        if (strArr == null) {
            if (defaultAudioEncoderFactory == null || (strGetSupportedFormats = defaultAudioEncoderFactory.GetSupportedFormats()) == null) {
                throw new AndroidRuntimeException("Not found any valid audio encoder");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Supports audio encoder list: ");
            sbLIZ.append(strGetSupportedFormats);
            AVLog.d(str, C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ = strGetSupportedFormats.split(":");
        }
        for (String str2 : this.LIZJ) {
            if (!TextUtils.isEmpty(str2)) {
                while (true) {
                    EnumC1278040jMY enumC1278040jMY = this.LIZ.LJJIIZI;
                    if (enumC1278040jMY == EnumC1278040jMY.VeLiveAudioCodecFFmpegAAC) {
                        for (String str3 : this.LIZJ) {
                            if (str3.contains("audio_type=audio/aac")) {
                                return "audio/aac";
                            }
                        }
                        AVLog.iow(str, "ffmpeg audio encoder not found, try fdk-aac.");
                        this.LIZ.LJJIIZI = EnumC1278040jMY.VeLiveAudioCodecFdkAAC;
                    } else if (enumC1278040jMY == EnumC1278040jMY.VeLiveAudioCodecMediaCodecAAC) {
                        for (String str4 : this.LIZJ) {
                            if (str4.contains("audio_type=audio/mp4a-latm")) {
                                return "audio/mp4a-latm";
                            }
                        }
                        AVLog.iow(str, "MediaCodec aac encoder not found, try fdk-aac.");
                        this.LIZ.LJJIIZI = EnumC1278040jMY.VeLiveAudioCodecFdkAAC;
                    } else if (enumC1278040jMY == EnumC1278040jMY.VeLiveAudioCodecFdkAAC) {
                        for (String str5 : this.LIZJ) {
                            if (str5.contains("audio_type=audio/faac")) {
                                return "audio/faac";
                            }
                        }
                        AVLog.iow(str, "fdk-aac audio encoder not found, break.");
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public C1278840jNq(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LIZ = c1277590jLp.LJI.mPushBase;
        this.LIZIZ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJIIJ = new WeakReference<>(this);
    }
}
