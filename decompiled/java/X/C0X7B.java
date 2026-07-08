package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okio.ByteString;

/* JADX INFO: renamed from: X.0X7B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X7B {
    public final ByteString LIZ;
    public C0X0P LIZIZ;
    public final List<C0X76> LIZJ;

    public final C0X7A LIZLLL() {
        if (((ArrayList) this.LIZJ).isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new C0X7A(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C0X7B() {
        String string = UUID.randomUUID().toString();
        this.LIZIZ = C0X7A.LJ;
        this.LIZJ = new ArrayList();
        this.LIZ = ByteString.encodeUtf8(string);
    }

    public final void LIZJ(C0X76 c0x76) {
        if (c0x76 != null) {
            ((ArrayList) this.LIZJ).add(c0x76);
            return;
        }
        throw new NullPointerException("part == null");
    }

    public final void LJ(C0X0P c0x0p) {
        if (c0x0p != null) {
            if (c0x0p.LIZIZ.equals("multipart")) {
                this.LIZIZ = c0x0p;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("multipart != ");
            sbLIZ.append(c0x0p);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new NullPointerException("type == null");
    }

    public final void LIZ(String str, String str2) {
        LIZJ(C0X76.LIZIZ(str, null, AbstractC842530X3j.LIZJ(null, str2)));
    }

    public final void LIZIZ(String str, String str2, AbstractC842530X3j abstractC842530X3j) {
        LIZJ(C0X76.LIZIZ(str, str2, abstractC842530X3j));
    }
}
