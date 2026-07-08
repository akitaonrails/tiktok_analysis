package X;

import android.app.Activity;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;

/* JADX INFO: renamed from: X.0MUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569270MUj {
    /* JADX WARN: Multi-variable type inference failed */
    public static final IPreDownloadMusic LIZ(Activity activity, Scene scene, boolean z) {
        if (scene instanceof IPreDownloadMusic) {
            return (IPreDownloadMusic) scene;
        }
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
        if (interfaceC20597015iiLIZJ != null) {
            C198H c198hLC = interfaceC20597015iiLIZJ.LC();
            if (c198hLC instanceof IPreDownloadMusic) {
                return (IPreDownloadMusic) c198hLC;
            }
            if (z) {
                for (C128Y c128y : new C13EL(interfaceC20597015iiLIZJ.kI())) {
                    if (c128y instanceof IPreDownloadMusic) {
                        return (IPreDownloadMusic) c128y;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
