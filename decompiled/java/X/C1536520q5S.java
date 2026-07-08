package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0q5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536520q5S extends AbstractC1300020jw0<Bundle, String> {
    public final IResourceServiceX LIZ;
    public final C1537480q70 LIZIZ;
    public final String LIZJ = "i18n";

    public C1536520q5S(IResourceServiceX iResourceServiceX, C1537480q70 c1537480q70) {
        this.LIZ = iResourceServiceX;
        this.LIZIZ = c1537480q70;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    @Override // X.AbstractC1300020jw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1299260jum<android.os.Bundle> r23, final X.AbstractC1299910jvp<java.lang.String> r24) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536520q5S.LIZ(X.0jum, X.0jvp):void");
    }

    public static /* synthetic */ void LIZJ(C1536520q5S c1536520q5S, C1537480q70 c1537480q70, SparkI18nManager.Meta meta, long j, String str, int i) {
        String str2;
        String str3 = str;
        if ((i & 32) != 0) {
            str3 = "unknown";
        }
        if ((i & 64) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        c1536520q5S.getClass();
        LIZIZ(c1537480q70, meta, j, false, false, str3, str2);
    }

    public static void LIZIZ(C1537480q70 c1537480q70, SparkI18nManager.Meta meta, long j, boolean z, boolean z2, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String string;
        InterfaceC1531560pxS interfaceC1531560pxS;
        Uri uriLIZ;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        String str7;
        String str8;
        if (c1537480q70 != null) {
            C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.I18N_LOAD_END}, null);
            EnumC1537150q6T enumC1537150q6T = EnumC1537150q6T.I18N_LOAD_FROM;
            if (z2) {
                str7 = "cache";
            } else {
                str7 = "cdn";
            }
            C1530570pvr.LJFF(c1537480q70, enumC1537150q6T, str7);
            EnumC1537150q6T enumC1537150q6T2 = EnumC1537150q6T.I18N_LOAD_STATUS;
            if (z) {
                str8 = "1";
            } else {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            C1530570pvr.LJFF(c1537480q70, enumC1537150q6T2, str8);
            C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.I18N_LOAD_LANG, str);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("state", Integer.valueOf(z ? 1 : 0));
        long j2 = jCurrentTimeMillis - j;
        javaOnlyMap.put("block_time", Long.valueOf(j2));
        if (z2) {
            str3 = "i18n_cache";
        } else {
            str3 = "i18n_cdn";
        }
        javaOnlyMap.put("res_from", str3);
        javaOnlyMap.put("is_preload", Integer.valueOf(z2 ? 1 : 0));
        javaOnlyMap.put("is_request_reuse", 0);
        String str9 = null;
        if (meta != null) {
            str4 = meta.channel;
        } else {
            str4 = null;
        }
        javaOnlyMap.put("channel", str4);
        if (meta != null) {
            str5 = meta.keySetVersion;
        } else {
            str5 = null;
        }
        javaOnlyMap.put("channel_version", str5);
        javaOnlyMap.put("finish_timestamp", Long.valueOf(jCurrentTimeMillis));
        javaOnlyMap.put("finish_time", Long.valueOf(j2));
        javaOnlyMap.put("app_locale", str);
        javaOnlyMap.put("cdn_url", str2);
        if (c1537480q70 != null && (interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ()) != null) {
            interfaceC1541990qEHLJIJJ.U0(C2097908Jt.LIZJ(new Pair("starlingInfo", javaOnlyMap)));
        }
        if (c1537480q70 != null) {
            str6 = c1537480q70.containerId;
        } else {
            str6 = null;
        }
        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_starling_load_finish_status");
        if (c1537480q70 != null) {
            str9 = c1537480q70.bid;
        }
        c1520360pfO.LIZIZ = str9;
        if (c1537480q70 == null || (interfaceC1531560pxS = c1537480q70.hybridParams) == null || (uriLIZ = interfaceC1531560pxS.LIZ()) == null || (string = uriLIZ.toString()) == null) {
            string = "";
        }
        c1520360pfO.LIZ = string;
        c1520360pfO.LIZLLL = javaOnlyMap.toJSONObject();
        c1520360pfO.LIZIZ(0);
        C1520080pew.LIZ(str6, c1520360pfO.LIZ());
    }
}
