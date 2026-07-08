package X;

import Y.ARunnableS92S0200000_23;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1532800pzS(inputClass = InputStream.class, outputClass = C1531820pxs.class)
public final class C1531780pxo extends AbstractC1532320pyg<InputStream, C1531820pxs> {
    public static final C1531780pxo LIZJ = new C1531780pxo();

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "Stream2Cache";
    }

    public C1531780pxo() {
        super(InputStream.class, C1531820pxs.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532320pyg
    public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
        Map<String, String> httpResponseHeaders;
        C1532030pyD c1532030pyD;
        InputStream inputStream = (InputStream) abstractC1532350pyj.LIZ;
        InterfaceC1532190pyT interfaceC1532190pyT = c1532340pyi.LIZIZ;
        ARunnableS92S0200000_23 aRunnableS92S0200000_23 = null;
        if (interfaceC1532190pyT != null) {
            httpResponseHeaders = interfaceC1532190pyT.getHttpResponseHeaders();
        } else {
            httpResponseHeaders = null;
        }
        if (inputStream instanceof InterfaceC1531770pxn) {
            c1532030pyD = ((InterfaceC1531770pxn) inputStream).LIZ();
            if (c1532030pyD == null) {
                C1532920pze c1532920pze = C1532920pze.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed to provide ForestBuffer from stream, ");
                sbLIZ.append(inputStream);
                C1532760pzO.LIZIZ(c1532920pze, "Stream2Cache", "process", C2188811AlT.LIZIZ(sbLIZ), null, null, 48);
                function1.invoke(new C1532340pyi(null, c1532340pyi.LIZIZ));
                return;
            }
        } else {
            aRunnableS92S0200000_23 = null;
            c1532030pyD = new C1532030pyD(inputStream, (Integer) null, true, (File) null, 24);
        }
        C1531820pxs.LJIIL.getClass();
        C1531820pxs c1531820pxsLIZJ = C1531840pxu.LIZJ(c1532710pzJ, c1532030pyD, httpResponseHeaders, aRunnableS92S0200000_23);
        Object obj = aRunnableS92S0200000_23;
        if (c1531820pxsLIZJ != null) {
            C1531870pxx c1531870pxx = c1531820pxsLIZJ.LJIIJJI;
            obj = aRunnableS92S0200000_23;
            if (c1531870pxx != null) {
                obj = c1531870pxx.LIZJ;
            }
        }
        function1.invoke(obj);
    }
}
