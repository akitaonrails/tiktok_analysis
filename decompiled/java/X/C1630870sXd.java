package X;

import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630870sXd implements InterfaceC1635660sfM<C1642680sqg, Fragment> {
    public final Function1<String, InterfaceC1635690sfP<C1642680sqg, Fragment>> LIZ;
    public final HashMap<String, InterfaceC1635690sfP<C1642680sqg, Fragment>> LIZIZ = new HashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C1630870sXd(Function1<? super String, ? extends InterfaceC1635690sfP<C1642680sqg, ? extends Fragment>> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC1635660sfM
    public final InterfaceC1635690sfP<C1642680sqg, Fragment> get(String str) {
        InterfaceC1635690sfP<C1642680sqg, Fragment> interfaceC1635690sfPInvoke;
        InterfaceC1635690sfP<C1642680sqg, Fragment> interfaceC1635690sfP = this.LIZIZ.get(str);
        if (interfaceC1635690sfP == null) {
            Function1<String, InterfaceC1635690sfP<C1642680sqg, Fragment>> function1 = this.LIZ;
            if (function1 == null || (interfaceC1635690sfPInvoke = function1.invoke(str)) == null) {
                return new C1635770sfX();
            }
            return interfaceC1635690sfPInvoke;
        }
        return interfaceC1635690sfP;
    }

    public final void LIZ(String str, InterfaceC1635690sfP<C1642680sqg, ? extends Fragment> interfaceC1635690sfP) {
        this.LIZIZ.put(str, interfaceC1635690sfP);
    }
}
