package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0X7A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X7A extends AbstractC842530X3j {
    public static final C0X0P LJ = C0X0P.LIZIZ("multipart/mixed");
    public static final C0X0P LJFF;
    public static final byte[] LJI;
    public static final byte[] LJII;
    public static final byte[] LJIIIIZZ;
    public final ByteString LIZ;
    public final C0X0P LIZIZ;
    public final List<C0X76> LIZJ;
    public long LIZLLL = -1;

    static {
        C0X0P.LIZIZ("multipart/alternative");
        C0X0P.LIZIZ("multipart/digest");
        C0X0P.LIZIZ("multipart/parallel");
        LJFF = C0X0P.LIZIZ("multipart/form-data");
        LJI = new byte[]{58, 32};
        LJII = new byte[]{13, 10};
        LJIIIIZZ = new byte[]{45, 45};
    }

    @Override // X.AbstractC842530X3j
    public final long LIZ() {
        long j = this.LIZLLL;
        if (j != -1) {
            return j;
        }
        long jLJI = LJI(null, true);
        this.LIZLLL = jLJI;
        return jLJI;
    }

    @Override // X.AbstractC842530X3j
    public final C0X0P LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC842530X3j
    public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) {
        LJI(interfaceC1496780p3M, false);
    }

    public static void LJFF(String str, StringBuilder sb) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\n') {
                if (cCharAt != '\r') {
                    if (cCharAt != '\"') {
                        sb.append(cCharAt);
                    } else {
                        sb.append("%22");
                    }
                } else {
                    sb.append("%0D");
                }
            } else {
                sb.append("%0A");
            }
        }
        sb.append('\"');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LJI(InterfaceC1496780p3M interfaceC1496780p3M, boolean z) {
        C1496690p3D c1496690p3D;
        if (z) {
            interfaceC1496780p3M = new C1496690p3D();
            c1496690p3D = interfaceC1496780p3M;
        } else {
            c1496690p3D = 0;
        }
        int size = this.LIZJ.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0X76 c0x76 = (C0X76) ListProtector.get(this.LIZJ, i);
            C0X1V c0x1v = c0x76.LIZ;
            AbstractC842530X3j abstractC842530X3j = c0x76.LIZIZ;
            interfaceC1496780p3M.write(LJIIIIZZ);
            interfaceC1496780p3M.LJJJI(this.LIZ);
            interfaceC1496780p3M.write(LJII);
            if (c0x1v != null) {
                int length = c0x1v.LIZ.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    interfaceC1496780p3M.LJLLILLLL(c0x1v.LJ(i2));
                    interfaceC1496780p3M.write(LJI);
                    interfaceC1496780p3M.LJLLILLLL(c0x1v.LJIIJ(i2));
                    interfaceC1496780p3M.write(LJII);
                }
            }
            C0X0P c0x0pLIZIZ = abstractC842530X3j.LIZIZ();
            if (c0x0pLIZIZ != null) {
                interfaceC1496780p3M.LJLLILLLL("Content-Type: ");
                interfaceC1496780p3M.LJLLILLLL(c0x0pLIZIZ.LIZ);
                interfaceC1496780p3M.write(LJII);
            }
            long jLIZ = abstractC842530X3j.LIZ();
            if (jLIZ != -1) {
                interfaceC1496780p3M.LJLLILLLL("Content-Length: ");
                interfaceC1496780p3M.LJJIJLIJ(jLIZ);
                interfaceC1496780p3M.write(LJII);
            } else if (z) {
                c1496690p3D.LIZ();
                return -1L;
            }
            byte[] bArr = LJII;
            interfaceC1496780p3M.write(bArr);
            if (z) {
                j += jLIZ;
            } else {
                abstractC842530X3j.LJ(interfaceC1496780p3M);
            }
            interfaceC1496780p3M.write(bArr);
        }
        byte[] bArr2 = LJIIIIZZ;
        interfaceC1496780p3M.write(bArr2);
        interfaceC1496780p3M.LJJJI(this.LIZ);
        interfaceC1496780p3M.write(bArr2);
        interfaceC1496780p3M.write(LJII);
        if (z) {
            long j2 = j + c1496690p3D.LLILLJJLI;
            c1496690p3D.LIZ();
            return j2;
        }
        return j;
    }

    public C0X7A(ByteString byteString, C0X0P c0x0p, List<C0X76> list) {
        this.LIZ = byteString;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0x0p);
        sbLIZ.append("; boundary=");
        sbLIZ.append(byteString.utf8());
        this.LIZIZ = C0X0P.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = c.LJIILIIL(list);
    }
}
