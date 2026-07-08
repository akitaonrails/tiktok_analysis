package X;

import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisDebug;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import java.util.Collections;

/* JADX INFO: renamed from: X.0mQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395840mQY {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if ((java.net.InetAddress.getByAddress(r1) instanceof java.net.Inet6Address) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1395840mQY.LIZ(java.lang.String):boolean");
    }

    public static NetworkResponse LIZIZ(SchemaParserData schemaParserData, int i) {
        String str;
        EnumC1379020lzQ enumC1379020lzQ;
        String str2;
        TiktokMinisDebug tiktokMinisDebug;
        String str3 = null;
        if (schemaParserData != null) {
            str = schemaParserData.clientKey;
        } else {
            str = null;
        }
        boolean zLIZ = C2197221Az2.LIZ(str);
        if (zLIZ) {
            enumC1379020lzQ = EnumC1379020lzQ.MINIS_TYPE_GAME;
        } else {
            enumC1379020lzQ = EnumC1379020lzQ.MINIS_TYPE_APP;
        }
        int iOrdinal = enumC1379020lzQ.ordinal();
        if (zLIZ) {
            str2 = "Mini game";
        } else {
            str2 = "Short Drama";
        }
        int iOrdinal2 = EnumC1154300g8y.CLIENT_KEY_TYPE_PROD.ordinal();
        int iOrdinal3 = EnumC993010bwp.MINIS_TECH_TYPE_H5.ordinal();
        int iOrdinal4 = EnumC1386420mBM.MINIS_STATUS_ONLINE.ordinal();
        C844470XAv.LIZ.getClass();
        String strLJFF = C844470XAv.LJFF();
        if (schemaParserData != null && (tiktokMinisDebug = schemaParserData.debugInfo) != null) {
            str3 = tiktokMinisDebug.localUrl;
        }
        return new NetworkResponse(new MinisMetaResp(str, Integer.valueOf(iOrdinal2), Integer.valueOf(iOrdinal), Integer.valueOf(iOrdinal3), Integer.valueOf(iOrdinal4), "MinisDebug", "Hello, MinisDebug", null, null, strLJFF, str3, null, null, null, "", null, null, Collections.singletonList("user.info.basic"), null, Integer.valueOf(EnumC2192711Arl.MINIS_STAGE_DEBUG.ordinal()), str2, 0, "", "", null, null, 50331648, null), Integer.valueOf(i), false, null, false, null, null);
    }
}
