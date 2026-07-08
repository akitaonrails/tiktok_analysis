package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0krY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1335700krY implements InterfaceC1335750krd {
    public final List<InterfaceC1335610krP> LIZ = new ArrayList();
    public final /* synthetic */ C1335660krU LIZIZ;

    @Override // X.InterfaceC1335750krd
    public final void LIZ(File file) {
    }

    @Override // X.InterfaceC1335750krd
    public final void LIZJ(File file) {
    }

    public C1335700krY(C1335660krU c1335660krU) {
        this.LIZIZ = c1335660krU;
    }

    @Override // X.InterfaceC1335750krd
    public final void LIZIZ(File file) {
        C1335690krX c1335690krXLJIILLIIL = this.LIZIZ.LJIILLIIL(file);
        if (c1335690krXLJIILLIIL != null && c1335690krXLJIILLIIL.LIZ == ".cnt") {
            ((ArrayList) this.LIZ).add(new C1335710krZ(c1335690krXLJIILLIIL.LIZIZ, file));
        }
    }
}
