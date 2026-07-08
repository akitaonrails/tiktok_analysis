package X;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1532800pzS(inputClass = C1531820pxs.class, outputClass = File.class)
public final class C1531670pxd extends AbstractC1532320pyg<C1531820pxs, File> {
    public C1531820pxs LIZJ;

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "Cache2File";
    }

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        C1531820pxs c1531820pxs = this.LIZJ;
        return c1531820pxs == null || c1531820pxs.LJ == null;
    }

    @Override // X.AbstractC1532320pyg
    public final int LJI() {
        return LIZ() ? 5 : 1;
    }

    public C1531670pxd(C1531820pxs c1531820pxs) {
        super(C1531820pxs.class, File.class);
        this.LIZJ = c1531820pxs;
    }

    @Override // X.AbstractC1532320pyg
    public final boolean LIZJ(C1532300pye c1532300pye) {
        if (LIZ() && !c1532300pye.LIZLLL && C1532960pzi.LIZ()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532320pyg
    public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
        C1519980pem c1519980pem;
        C1531820pxs c1531820pxs = (C1531820pxs) abstractC1532350pyj.LIZ;
        this.LIZJ = c1531820pxs;
        File fileLJFF = c1531820pxs.LJFF();
        if (fileLJFF != null) {
            c1519980pem = new C1519980pem(fileLJFF);
        } else {
            c1519980pem = null;
        }
        function1.invoke(new C1532340pyi(c1519980pem, null));
    }
}
