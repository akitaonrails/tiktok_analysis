package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0pwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531000pwY extends AbstractC1532350pyj<InputStream> {
    public final InterfaceC1530990pwX LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final void LIZLLL() throws IOException {
        ((InputStream) this.LIZ).close();
    }

    public final String toString() {
        String string;
        InterfaceC1531770pxn interfaceC1531770pxn;
        C1532030pyD c1532030pyDLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamRef: ");
        sbLIZ.append(super.toString());
        sbLIZ.append(" Buffer: ");
        Type type = this.LIZ;
        if (!(type instanceof InterfaceC1531770pxn) || (interfaceC1531770pxn = (InterfaceC1531770pxn) type) == null || (c1532030pyDLIZIZ = interfaceC1531770pxn.LIZIZ()) == null || (string = c1532030pyDLIZIZ.toString()) == null) {
            string = "";
        }
        sbLIZ.append(string);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final AbstractC1532350pyj<InputStream> LIZ(C1532710pzJ c1532710pzJ) {
        Object c098200Yq;
        Object c098200Yq2;
        InterfaceC1530990pwX interfaceC1530990pwX;
        Closeable closeable = (InputStream) this.LIZ;
        try {
            if ((closeable instanceof InterfaceC1530990pwX) && (interfaceC1530990pwX = (InterfaceC1530990pwX) closeable) != null) {
                c098200Yq = interfaceC1530990pwX.LJFF(c1532710pzJ);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        InputStream inputStream = (InputStream) c098200Yq;
        if (inputStream == null) {
            try {
                InterfaceC1530990pwX interfaceC1530990pwX2 = this.LIZJ;
                if (interfaceC1530990pwX2 != null) {
                    c098200Yq2 = interfaceC1530990pwX2.LJFF(c1532710pzJ);
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            inputStream = (InputStream) c098200Yq2;
            if (inputStream == null) {
                return null;
            }
        }
        return new C1531000pwY(inputStream, this.LIZJ);
    }

    public C1531000pwY(InputStream inputStream, InterfaceC1530990pwX interfaceC1530990pwX) {
        super(inputStream, InputStream.class);
        this.LIZJ = interfaceC1530990pwX;
    }
}
