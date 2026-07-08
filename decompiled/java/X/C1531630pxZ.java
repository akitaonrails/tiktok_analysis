package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1532800pzS(inputClass = InputStream.class, outputClass = File.class)
public final class C1531630pxZ extends AbstractC1532320pyg<InputStream, File> {
    public static final C1531630pxZ LIZJ = new C1531630pxZ();

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "Stream2File";
    }

    public C1531630pxZ() {
        super(InputStream.class, File.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532320pyg
    public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
        String strLIZ;
        C1532340pyi c1532340pyi2;
        try {
            ((InputStream) abstractC1532350pyj.LIZ).close();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        InterfaceC1532190pyT interfaceC1532190pyT = c1532340pyi.LIZIZ;
        if ((interfaceC1532190pyT == null || (strLIZ = interfaceC1532190pyT.getFilepath()) == null) && (strLIZ = c1532170pyR.LIZ()) == null) {
            c1532340pyi2 = null;
        } else {
            c1532340pyi2 = new C1532340pyi(new C1519980pem(new C0VSJ(strLIZ)), c1532340pyi.LIZIZ);
        }
        function1.invoke(c1532340pyi2);
    }
}
