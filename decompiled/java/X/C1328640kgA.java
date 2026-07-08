package X;

import android.text.TextUtils;
import com.bytedance.fresco.heif.HeifDecoder;

/* JADX INFO: renamed from: X.0kgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1328640kgA implements InterfaceC1330220kii {
    public static final String[] LIZ;
    public static final int LIZIZ;

    static {
        String[] strArr = {"heic", "heix", "hevc", "hevx", "mif1", "msf1", "vvic"};
        LIZ = strArr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ftyp");
        sbLIZ.append(strArr[0]);
        LIZIZ = C1328900kga.LIZ(C2188811AlT.LIZIZ(sbLIZ)).length;
    }

    @Override // X.InterfaceC1330220kii
    public final int getHeaderSize() {
        return LIZIZ;
    }

    @Override // X.InterfaceC1330220kii
    public final C1330000kiM LIZ(int i, byte[] bArr) {
        String str;
        if (i >= LIZIZ && bArr[3] >= 8) {
            for (String str2 : LIZ) {
                int length = bArr.length;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ftyp");
                sbLIZ.append(str2);
                if (C1328900kga.LIZIZ(bArr, length, LIZIZ, C1328900kga.LIZ(C2188811AlT.LIZIZ(sbLIZ))) > -1) {
                    if ("vvic".equalsIgnoreCase(str2)) {
                        str = "vvic";
                    } else {
                        str = "heic";
                    }
                }
            }
            str = null;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("vvic".equalsIgnoreCase(str)) {
            return HeifDecoder.VVIC_FORMAT;
        }
        return HeifDecoder.HEIF_FORMAT;
    }
}
