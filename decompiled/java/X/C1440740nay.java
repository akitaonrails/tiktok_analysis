package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;

/* JADX INFO: renamed from: X.0nay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440740nay {
    public static final CompileConfigResolution LIZ(Bitmap bitmap, String str, boolean z) {
        CompileConfigResolution compileConfigResolutionLIZ = new C1440710nav(new C1440800nb4(bitmap, str, z)).LIZ();
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        return compileConfigResolutionLIZ;
    }

    public static /* synthetic */ CompileConfigResolution LIZIZ(String str, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return LIZ(null, str, z);
    }
}
