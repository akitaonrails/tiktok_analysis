package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0krV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1335670krV implements InterfaceC1335750krd {
    public final List<InterfaceC1335610krP> LIZ = new ArrayList();
    public final EnumC1335720kra LIZIZ;
    public final /* synthetic */ C1335660krU LIZJ;

    @Override // X.InterfaceC1335750krd
    public final void LIZ(File file) {
    }

    @Override // X.InterfaceC1335750krd
    public final void LIZJ(File file) {
    }

    @Override // X.InterfaceC1335750krd
    public final void LIZIZ(File file) {
        if (this.LIZIZ == EnumC1335720kra.CONFIG_FILE) {
            C1335660krU c1335660krU = this.LIZJ;
            c1335660krU.getClass();
            C1335690krX c1335690krXLIZ = C1335690krX.LIZ(file);
            if (c1335690krXLIZ != null && new C0VSJ(c1335660krU.LJIILJJIL(c1335690krXLIZ.LIZIZ)).equals(file.getParentFile()) && c1335690krXLIZ.LIZ == ".cnt") {
                ((ArrayList) this.LIZ).add(new C1335710krZ(c1335690krXLIZ.LIZIZ, file));
                return;
            }
            return;
        }
        C1335690krX c1335690krXLJIILLIIL = this.LIZJ.LJIILLIIL(file);
        if (c1335690krXLJIILLIIL == null) {
            return;
        }
        String str = c1335690krXLJIILLIIL.LIZ;
        if (str != ".cnt" && str != ".tmp") {
            return;
        }
        ((ArrayList) this.LIZ).add(new C1335710krZ(c1335690krXLJIILLIIL.LIZIZ, file));
    }

    public C1335670krV(C1335660krU c1335660krU, EnumC1335720kra enumC1335720kra) {
        this.LIZJ = c1335660krU;
        this.LIZIZ = enumC1335720kra;
    }
}
