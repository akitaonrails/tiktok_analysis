package X;

import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileSettings;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0na5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440190na5 {
    public final C1440200na6 LIZ;

    public final CutVideoCompileSettings LIZ() {
        String externalSettingsJsonStr;
        C1440760nb0<VEVideoEncodeConfigParams> c1440760nb0LIZIZ = C1440630nan.LIZIZ();
        c1440760nb0LIZIZ.LIZ(C1440180na4.LIZ, new AwS601S0100000_22(this, 773));
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) c1440760nb0LIZIZ.execute();
        String str = "";
        if (this.LIZ.LJI && (externalSettingsJsonStr = vEVideoEncodeConfigParams.getExternalSettingsJsonStr()) != null) {
            str = externalSettingsJsonStr;
        }
        C1440200na6 c1440200na6 = this.LIZ;
        String str2 = c1440200na6.LJIIJ;
        if (str2 == null) {
            str2 = str;
        }
        List<VideoSegment> list = c1440200na6.LIZ;
        String str3 = c1440200na6.LIZIZ;
        String str4 = c1440200na6.LIZJ;
        CompileConfigResolution compileConfigResolution = c1440200na6.LIZLLL;
        int i = compileConfigResolution.width;
        int i2 = compileConfigResolution.height;
        int fps = vEVideoEncodeConfigParams.getFps();
        boolean zIsSupportHWEncoder = this.LIZ.LJFF ? vEVideoEncodeConfigParams.isSupportHWEncoder() : false;
        C1440200na6 c1440200na62 = this.LIZ;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = c1440200na62.LJII;
        int i3 = c1440200na62.LJ;
        CompileConfigResolution compileConfigResolution2 = c1440200na62.LIZLLL;
        return new CutVideoCompileSettings(list, str3, str4, i, i2, fps, zIsSupportHWEncoder, encode_standard, null, null, c1440200na62.LJIIIIZZ, i3, 0, str2, compileConfigResolution2.resizeX, compileConfigResolution2.resizeY, null, c1440200na62.LJIIIZ, 70400, null);
    }

    public C1440190na5(C1440200na6 c1440200na6) {
        this.LIZ = c1440200na6;
    }
}
