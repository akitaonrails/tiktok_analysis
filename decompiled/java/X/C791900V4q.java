package X;

import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.internal.ApmDelegate;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791900V4q {
    public static boolean LIZ(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        ApmDelegate apmDelegate = C788700Uwm.LIZ;
        if (apmDelegate.LLIZ && (slardarConfigManagerImpl = apmDelegate.LLILZLL) != null) {
            return slardarConfigManagerImpl.getLogTypeSwitch(str);
        }
        return false;
    }

    public static void LIZIZ(final String str, final String str2, final float f) {
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0UvX
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ApmAgent@713b.monitorDirectOnTimer$1");
                try {
                    C792310V6f.LJIIIZ().LIZJ(new C790580Uzo(str, str2, f));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ApmAgent@713b.monitorDirectOnTimer$1");
            }
        });
        if (C792400V6o.LIZJ) {
            C0VD9.LIZ().LIZIZ(new Runnable() { // from class: X.0C44
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ApmAgent@713b.monitorDirectOnTimer$2");
                    try {
                        JSONObject jSONObjectLIZ = new C790580Uzo(str, str2, f).LIZ();
                        if (jSONObjectLIZ != null) {
                            C793770VBv.LJIIZILJ("monitorDirectOnTimer", C786410Ut5.J3(jSONObjectLIZ));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ApmAgent@713b.monitorDirectOnTimer$2");
                }
            });
        }
    }
}
