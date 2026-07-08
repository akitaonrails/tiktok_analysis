package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497750JfZ {
    public static final C2076908Br LIZ = new HashMap<String, InterfaceC497760Jfa>() { // from class: X.08Br
        {
            put("HUAWEI", new C2077208Bu());
            put("SAMSUNG", new C2077108Bt());
        }
    };

    public static int LIZ() {
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2()) {
            int iXM = ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).XM(null);
            if (iXM != 0) {
                return iXM != 1 ? -1 : 0;
            }
            return 1;
        }
        Resources resourcesLJIILJJIL = C497740JfY.LJIILJJIL();
        Configuration configuration = resourcesLJIILJJIL != null ? resourcesLJIILJJIL.getConfiguration() : null;
        InterfaceC497760Jfa interfaceC497760Jfa = LIZ.get(Build.MANUFACTURER.toUpperCase().trim());
        if (interfaceC497760Jfa != null) {
            return interfaceC497760Jfa.LIZIZ(configuration);
        }
        return -1;
    }

    public static boolean LIZIZ() {
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2()) {
            return true;
        }
        InterfaceC497760Jfa interfaceC497760Jfa = LIZ.get(Build.MANUFACTURER.toUpperCase().trim());
        if (interfaceC497760Jfa == null) {
            return false;
        }
        return interfaceC497760Jfa.LIZ();
    }
}
