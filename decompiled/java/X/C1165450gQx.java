package X;

import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS116S1100000_2;
import kotlin.jvm.internal.AwS137S1100000_23;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165450gQx implements InterfaceC1168310gVZ {
    public final String LIZ;
    public final InterfaceC1165460gQy LIZIZ;
    public final C1168340gVc LIZJ;

    @Override // X.InterfaceC1168310gVZ
    public final String LJ(String str) {
        return null;
    }

    @Override // X.InterfaceC1168310gVZ
    public final Object LJII() {
        return null;
    }

    @Override // X.InterfaceC1168310gVZ
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.InterfaceC1168310gVZ
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1168310gVZ
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC1168310gVZ
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1168310gVZ
    public final JSONObject LIZIZ() {
        InterfaceC1165460gQy interfaceC1165460gQy = this.LIZIZ;
        if (interfaceC1165460gQy != null) {
            return interfaceC1165460gQy.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1168310gVZ
    public final InterfaceC1321110kU1 LIZJ() {
        InterfaceC1165460gQy interfaceC1165460gQy = this.LIZIZ;
        if (interfaceC1165460gQy != null) {
            return interfaceC1165460gQy.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC1168310gVZ
    public final Map<String, Object> LIZLLL() {
        InterfaceC1165460gQy interfaceC1165460gQy = this.LIZIZ;
        if (interfaceC1165460gQy != null) {
            return interfaceC1165460gQy.LIZLLL();
        }
        return null;
    }

    @Override // X.InterfaceC1168310gVZ
    public final InterfaceC1321540kUi LJFF() {
        InterfaceC1165460gQy interfaceC1165460gQy = this.LIZIZ;
        if (interfaceC1165460gQy != null) {
            interfaceC1165460gQy.LJ();
        }
        final String str = this.LIZ;
        return new InterfaceC1321540kUi(str) { // from class: X.0qFT
            public final String LIZ;

            {
                this.LIZ = str;
            }

            @Override // X.InterfaceC1321540kUi
            public final boolean LIZ(String str2, Function1 function1) {
                InterfaceC1540190qBN interfaceC1540190qBNLIZLLL;
                Object c098200Yq;
                C21322218cO c21322218cO = C21322218cO.LIZ;
                String str3 = this.LIZ;
                AwS116S1100000_2 awS116S1100000_2 = new AwS116S1100000_2(str2, (String) function1, (Function1<? super C1533790q13, Unit>) 12);
                c21322218cO.getClass();
                if (a0.LJJJIL(str3) || a0.LJJJIL(str2) || (interfaceC1540190qBNLIZLLL = C21322218cO.LIZLLL(str3)) == null) {
                    return false;
                }
                try {
                    interfaceC1540190qBNLIZLLL.LIZIZ(str2, new C1539490qAF(str3, null, null, new C1539500qAG(false, false, false), File.class, 6), new AwS137S1100000_23(str2, awS116S1100000_2, 10));
                    c098200Yq = Boolean.TRUE;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                return ((Boolean) c098200Yq).booleanValue();
            }
        };
    }

    @Override // X.InterfaceC1168310gVZ
    public final C1168340gVc LJIIJ() {
        C1168340gVc c1168340gVc = this.LIZJ;
        return c1168340gVc == null ? C1168340gVc.LIZJ : c1168340gVc;
    }

    @Override // X.InterfaceC1168310gVZ
    public final AbstractC21333318eB LIZ(C21325918cz c21325918cz, String str) {
        InterfaceC1165460gQy interfaceC1165460gQy = this.LIZIZ;
        if (interfaceC1165460gQy != null) {
            return interfaceC1165460gQy.LIZ(c21325918cz, str);
        }
        return null;
    }

    public C1165450gQx(String str, InterfaceC1165460gQy interfaceC1165460gQy, C1168340gVc c1168340gVc) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1165460gQy;
        this.LIZJ = c1168340gVc;
    }

    @Override // X.InterfaceC1168310gVZ
    public final Typeface LJI(int i, String str, boolean z) {
        InterfaceC1165460gQy interfaceC1165460gQy = this.LIZIZ;
        if (interfaceC1165460gQy != null) {
            interfaceC1165460gQy.LJFF();
            return null;
        }
        return null;
    }
}
