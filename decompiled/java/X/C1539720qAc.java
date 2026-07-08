package X;

import com.bytedance.lynx.hybrid.ssr.SSRMeta;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.lynx.tasm.TemplateData;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0qAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539720qAc {
    public static final int LIZIZ(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static final C1539810qAl LIZ(byte[] bArr, C1537480q70 c1537480q70) {
        C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.SLSR_PARSE_BUNDLE_START}, null);
        String strLJIJI = c1537480q70.LJIJI();
        int i = 13;
        if (bArr.length >= 13) {
            C1691430u7J.LIZ(4, bArr.length);
            int iLIZIZ = LIZIZ(Arrays.copyOfRange(bArr, 0, 4));
            byte b = bArr[4];
            C1691430u7J.LIZ(9, bArr.length);
            Arrays.copyOfRange(bArr, 5, 9);
            C1691430u7J.LIZ(13, bArr.length);
            Arrays.copyOfRange(bArr, 9, 13);
            if (iLIZIZ == 1397510994 && b == 1) {
                String str = null;
                SSRMeta sSRMeta = new SSRMeta(null, null, null, 7, null);
                byte[] bArrCopyOfRange = new byte[0];
                TemplateData templateData = new TemplateData();
                Object linkedHashMap = new LinkedHashMap();
                String str2 = null;
                while (i < bArr.length) {
                    byte b2 = bArr[i];
                    int i2 = i + 1;
                    int i3 = i2 + 4;
                    C1691430u7J.LIZ(i3, bArr.length);
                    int iLIZIZ2 = LIZIZ(Arrays.copyOfRange(bArr, i2, i3));
                    if (b2 == EnumC1539780qAi.SSR_META.getId()) {
                        int i4 = i3 + iLIZIZ2;
                        C1691430u7J.LIZ(i4, bArr.length);
                        String str3 = new String(Arrays.copyOfRange(bArr, i3, i4), Charsets.UTF_8);
                        sSRMeta = (SSRMeta) GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), str3, SSRMeta.class);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parseSSRBundle after: ssrMetaStr: ");
                        sbLIZ.append(str3);
                        sbLIZ.append(", ssrMeta: ");
                        sbLIZ.append(sSRMeta);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else if (b2 == EnumC1539780qAi.SSR_RESULT.getId()) {
                        int i5 = i3 + iLIZIZ2;
                        C1691430u7J.LIZ(i5, bArr.length);
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i5);
                    } else if (b2 == EnumC1539780qAi.INIT_DATA.getId()) {
                        int i6 = i3 + iLIZIZ2;
                        C1691430u7J.LIZ(i6, bArr.length);
                        String str4 = new String(Arrays.copyOfRange(bArr, i3, i6), Charsets.UTF_8);
                        if (str4.length() > 0) {
                            templateData = TemplateData.LJII((Map) GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), str4, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Vx
                            }.getType()));
                        }
                    } else if (b2 == EnumC1539780qAi.GLOBAL_PROPS.getId()) {
                        int i7 = i3 + iLIZIZ2;
                        C1691430u7J.LIZ(i7, bArr.length);
                        String str5 = new String(Arrays.copyOfRange(bArr, i3, i7), Charsets.UTF_8);
                        if (str5.length() > 0) {
                            linkedHashMap = GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), str5, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Vy
                            }.getType());
                        }
                    } else if (b2 == EnumC1539780qAi.DEBUG_CONTEXT.getId()) {
                        int i8 = i3 + iLIZIZ2;
                        C1691430u7J.LIZ(i8, bArr.length);
                        str = new String(Arrays.copyOfRange(bArr, i3, i8), Charsets.UTF_8);
                    } else if (b2 == EnumC1539780qAi.REQUEST_EXTRA.getId()) {
                        int i9 = i3 + iLIZIZ2;
                        C1691430u7J.LIZ(i9, bArr.length);
                        str2 = new String(Arrays.copyOfRange(bArr, i3, i9), Charsets.UTF_8);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Unknown section id: ");
                        sbLIZ2.append((int) b2);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    i = iLIZIZ2 + i3;
                }
                C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.SLSR_PARSE_BUNDLE_END}, null);
                return new C1539810qAl(strLJIJI, sSRMeta, bArrCopyOfRange, templateData, (Map) linkedHashMap, str, str2);
            }
            throw new IllegalArgumentException("Invalid header or version");
        }
        throw new IllegalArgumentException("Invalid bundle size");
    }
}
