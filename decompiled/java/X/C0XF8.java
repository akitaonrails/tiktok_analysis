package X;

import android.content.Context;
import android.os.Build;
import java.security.MessageDigest;
import java.util.HashMap;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XF8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XF8 {
    public static final C0XF8 LIZ = new C0XF8();

    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "result");
        c2344009Gk.LJIIIIZZ("error_desc", str);
        C20684815ws.LJIILLIIL("oidc_blob_write_result", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update digest, digestString: ");
        sbLIZ.append(str);
        sbLIZ.append(", gaid: ");
        sbLIZ.append(str2);
        C0XFF.LIZJ("SOTLBlobStore", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.onEventV3("oidc_blob_update_digest_submit");
        HashMap map = new HashMap();
        map.put("digest", str);
        LIZ.getClass();
        map.put("device_unique_id", C08HM.LJ(MessageDigest.getInstance("SHA-256").digest(str2.getBytes(Charsets.UTF_8))));
        map.put("unique_id_type", "1");
        ((C0XH0) C0XH0.LIZLLL()).LIZIZ("/passport/sotl/blobstore/update/", map, new C0XH7<C846060XGy>() { // from class: X.0XF9
            @Override // X.C0XH7
            public final void LJI(C0XGA c0xga) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update digest success, response: ");
                sbLIZ2.append(c0xga);
                C0XFF.LIZ("SOTLBlobStore", C2188811AlT.LIZIZ(sbLIZ2));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(0, "result");
                C20684815ws.LJIILLIIL("oidc_blob_update_digest_result", c2344009Gk.LIZ);
            }

            @Override // X.C0XH7
            public final void LJ(C0XGA c0xga, int i) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update digest failed, response e: ");
                sbLIZ2.append(c0xga);
                sbLIZ2.append(", error: ");
                sbLIZ2.append(i);
                C0XFF.LIZ("SOTLBlobStore", C2188811AlT.LIZIZ(sbLIZ2));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(1, "result");
                c2344009Gk.LIZJ(i, "error_desc");
                C20684815ws.LJIILLIIL("oidc_blob_update_digest_result", c2344009Gk.LIZ);
            }
        });
    }

    public static void LIZ(Context context, String str, JSONObject jSONObject) {
        if (context != null && str != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0XF6(context, str, jSONObject, null), 3);
                return;
            } else {
                C0XFF.LIZJ("SOTLBlobStore", "saveOidcToken failed, version < R");
                LIZIZ("version < R");
                return;
            }
        }
        C0XFF.LIZJ("SOTLBlobStore", "saveOidcToken failed, context or blob is null");
        LIZIZ("context or blob is null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x00f9
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZLLL(android.content.Context r20, java.lang.String r21, final java.lang.String r22, org.json.JSONObject r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XF8.LIZLLL(android.content.Context, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
