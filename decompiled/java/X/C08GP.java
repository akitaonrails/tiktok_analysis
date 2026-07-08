package X;

import android.util.Base64;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08GP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GP {
    public static final String LIZ(String str) {
        if (str.length() == 0) {
            return "";
        }
        int length = (str.length() / 2) - 3;
        int i = length + 6;
        Pair pair = new Pair(str.substring(length, i), a0.LJJJJZI(length, i, str).toString());
        byte[] bytes = ((String) pair.getFirst()).getBytes(Charsets.UTF_8);
        byte[] bArrDecode = Base64.decode((String) pair.getSecond(), 0);
        byte[] bArr = new byte[bArrDecode.length];
        int length2 = bArrDecode.length;
        for (int i2 = 0; i2 < length2; i2++) {
            bArr[i2] = (byte) (bArrDecode[i2] ^ bytes[i2 % bytes.length]);
        }
        return new String(bArr, Charsets.UTF_8);
    }
}
