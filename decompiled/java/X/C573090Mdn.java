package X;

import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;

/* JADX INFO: renamed from: X.0Mdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573090Mdn {
    public static final CompileConfigResolution LIZ(MvThemeData mvThemeData) {
        int i;
        int i2;
        CompileConfigResolution compileConfigResolutionLIZIZ = C573200Mdy.LIZIZ();
        int i3 = compileConfigResolutionLIZIZ.width;
        int i4 = compileConfigResolutionLIZIZ.height;
        if (mvThemeData == null || (i2 = mvThemeData.resWidth) == 0 || (i = mvThemeData.resHeight) == 0) {
            i = i4;
            i2 = i3;
        }
        return new CompileConfigResolution(i2, i, null, null, 12, null);
    }
}
