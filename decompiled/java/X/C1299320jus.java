package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxBackgroundRuntime;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299320jus {
    public WeakReference<s> LIZ = new WeakReference<>(null);
    public WeakReference<LynxBackgroundRuntime> LIZIZ = new WeakReference<>(null);

    public final void LIZ(String str, JavaOnlyArray javaOnlyArray) {
        s sVar = this.LIZ.get();
        if (sVar != null) {
            sVar.LJJIII(str, javaOnlyArray);
            return;
        }
        LynxBackgroundRuntime lynxBackgroundRuntime = this.LIZIZ.get();
        if (lynxBackgroundRuntime != null) {
            lynxBackgroundRuntime.LJ(str, javaOnlyArray);
        }
    }
}
