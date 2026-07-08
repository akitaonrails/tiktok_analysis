package X;

import java.nio.charset.Charset;
import kotlin.text.Charsets;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13Qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20009113Qr {
    public static final String LIZIZ(String[] strArr) {
        int length = strArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(e3.e);
        int i = 0;
        while (true) {
            sb.append(strArr[i]);
            if (i == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static final String LIZ(byte[] bArr, EnumC20009313Qt enumC20009313Qt) {
        Charset charset;
        if (C20009213Qs.LIZ[enumC20009313Qt.ordinal()] == 1) {
            charset = Charsets.LIZIZ;
        } else {
            charset = Charsets.UTF_8;
        }
        return new String(bArr, charset);
    }
}
