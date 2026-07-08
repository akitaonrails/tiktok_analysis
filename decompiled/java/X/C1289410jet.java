package X;

import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.krypton.CanvasRuntimeMediator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import t27.a;

/* JADX INFO: renamed from: X.0jet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289410jet {
    public CanvasRuntimeMediator LIZ;
    public final LinkedHashMap<Class<?>, Object> LIZIZ = new LinkedHashMap<>();
    public final C1289430jev LIZJ;

    public C1289410jet(C1289430jev c1289430jev) {
        this.LIZJ = c1289430jev;
    }

    public final void LIZ(Class<?> cls, Object obj) {
        if (obj == null) {
            LynxLog.w("LynxKryptonHelper", "do not support unregister service or register null service");
            return;
        }
        this.LIZIZ.put(cls, obj);
        CanvasRuntimeMediator canvasRuntimeMediator = this.LIZ;
        if (canvasRuntimeMediator != null) {
            ((ConcurrentHashMap) canvasRuntimeMediator.LIZJ).put(cls, obj);
            a aVar = canvasRuntimeMediator.LIZIZ;
            if (aVar != null) {
                aVar.registerService(cls, obj);
            }
        }
    }
}
