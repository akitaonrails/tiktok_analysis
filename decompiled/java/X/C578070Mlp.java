package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;

/* JADX INFO: renamed from: X.0Mlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578070Mlp {
    public static final CompileConfigResolution LIZ() {
        CompileConfigResolution compileConfigResolutionLIZ = new C1440660naq(new C1440830nb7(1, Bitmap.Config.RGB_565, "", false)).LIZ();
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        return compileConfigResolutionLIZ;
    }
}
