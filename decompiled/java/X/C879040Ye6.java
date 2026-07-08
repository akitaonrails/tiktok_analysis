package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ye6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879040Ye6 {
    public final Function0<InterfaceC884990Ynh> LIZ;
    public volatile InterfaceC884990Ynh LIZIZ;

    public final InterfaceC884990Ynh LIZ() {
        InterfaceC884990Ynh interfaceC884990YnhInvoke;
        InterfaceC884990Ynh interfaceC884990Ynh = this.LIZIZ;
        if (interfaceC884990Ynh != null) {
            return interfaceC884990Ynh;
        }
        synchronized (this) {
            try {
                interfaceC884990YnhInvoke = this.LIZIZ;
                if (interfaceC884990YnhInvoke == null) {
                    interfaceC884990YnhInvoke = this.LIZ.invoke();
                    if (interfaceC884990YnhInvoke != null) {
                        this.LIZIZ = interfaceC884990YnhInvoke;
                    } else {
                        interfaceC884990YnhInvoke = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC884990YnhInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C879040Ye6(Function0<? extends InterfaceC884990Ynh> function0) {
        this.LIZ = function0;
    }
}
