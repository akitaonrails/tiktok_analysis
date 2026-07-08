package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530910pwP implements InterfaceC1532430pyr {
    public final InputStream LIZ;
    public final C1530890pwN LIZIZ;

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1532430pyr
    public final boolean LIZJ(C1532300pye c1532300pye) {
        return true;
    }

    @Override // X.InterfaceC1532520pz0
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "assets";
    }

    @Override // X.InterfaceC1532520pz0
    public final EnumC1528520psY LIZLLL() {
        return EnumC1528520psY.WAIT_FOR_RESULT;
    }

    public C1530910pwP(InputStream inputStream, C1530890pwN c1530890pwN) {
        this.LIZ = inputStream;
        this.LIZIZ = c1530890pwN;
    }

    @Override // X.InterfaceC1532520pz0
    public final void LJ(Function1 function1, Object obj) {
        C1532460pyu.LIZ(this, (C1532550pz3) obj, function1);
    }

    @Override // X.InterfaceC1532430pyr
    public final void LIZIZ(C08AB c08ab, C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, Function1<? super C1532340pyi, Unit> function1) {
        function1.invoke(new C1532340pyi(new C1531000pwY(new C1531700pxg(c1532710pzJ, this.LIZ, false, null), new InterfaceC1530990pwX() { // from class: X.0pwO
            @Override // X.InterfaceC1530990pwX
            public final InputStream LJFF(C1532710pzJ c1532710pzJ2) {
                Object c098200Yq;
                C1530910pwP c1530910pwP = this.LL;
                try {
                    C1532680pzG.LIZ.getClass();
                    c098200Yq = C1532680pzG.LIZIZ().getAssets().open(String.valueOf(c1530910pwP.LIZIZ.getFilepath()));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                return (InputStream) c098200Yq;
            }
        }), this.LIZIZ));
    }
}
