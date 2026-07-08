package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20009013Qq {
    public static final String LIZ(InterfaceC20008913Qp interfaceC20008913Qp) {
        if (!interfaceC20008913Qp.available()) {
            return "";
        }
        C09BL c09bl = new C09BL(32);
        byte[] bArr = new byte[1024];
        int i = interfaceC20008913Qp.read(bArr, 0, 1024);
        while (i >= 0) {
            c09bl.LIZ(bArr, 0, i);
            i = interfaceC20008913Qp.read(bArr, 0, 1024);
        }
        interfaceC20008913Qp.close();
        return C20009113Qr.LIZ(Arrays.copyOf(c09bl.LIZ, c09bl.LIZIZ), EnumC20009313Qt.Utf8);
    }
}
