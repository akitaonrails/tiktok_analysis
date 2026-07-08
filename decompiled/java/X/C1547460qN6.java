package X;

import android.net.Uri;
import android.webkit.WebView;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547460qN6 implements InterfaceC1536300q56 {
    public LiveData<NetworkResponse<MinisMetaResp>> LIZ;

    public C1547460qN6(LiveData<NetworkResponse<MinisMetaResp>> liveData) {
        this.LIZ = liveData;
    }

    public final boolean LIZLLL(String str, String str2, String str3) {
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        String str4;
        String host;
        LiveData<NetworkResponse<MinisMetaResp>> liveData = this.LIZ;
        EnumC2192711Arl enumC2192711Arl = null;
        if (liveData != null && (value = liveData.getValue()) != null && (minisMetaResp = value.data) != null && (str4 = minisMetaResp.minisUrl) != null) {
            Uri uri = UriProtector.parse(str4);
            if (uri != null) {
                host = uri.getHost();
            } else {
                host = null;
            }
            if (!u.LJIJI(host, str2, false)) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("judgeToBlockPage，url blocked by domain, minisHost:");
                sbLIZ.append(host);
                sbLIZ.append(", host:");
                sbLIZ.append(str2);
                sbLIZ.append(", url:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return true;
            }
        }
        if (str3 != null) {
            SchemaParserData schemaParserData = C2195221Avo.LJII;
            if (schemaParserData != null) {
                enumC2192711Arl = schemaParserData.minisStage;
            }
            if (enumC2192711Arl == EnumC2192711Arl.MINIS_STAGE_PROD && !str3.equals("https")) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("judgeToBlockPage，url blocked by schema, schema:");
                sbLIZ2.append(str3);
                sbLIZ2.append(", host:");
                sbLIZ2.append(str2);
                sbLIZ2.append(", url:");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[PHI: r2
      0x003f: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:16:0x003c, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1536300q56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C1537480q70 r5, X.InterfaceC1541510qDV r6, android.webkit.WebView r7, android.webkit.WebResourceRequest r8) {
        /*
            r4 = this;
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shouldOverrideUrlLoading，url:"
            r1.append(r0)
            java.lang.String r0 = r7.getUrl()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r3 = 0
            if (r8 == 0) goto L3b
            android.net.Uri r0 = r8.getUrl()
            if (r0 == 0) goto L3b
            java.lang.String r2 = r0.toString()
        L22:
            android.net.Uri r0 = r8.getUrl()
            if (r0 == 0) goto L3f
            java.lang.String r1 = r0.getHost()
        L2c:
            android.net.Uri r0 = r8.getUrl()
            if (r0 == 0) goto L36
            java.lang.String r3 = r0.getScheme()
        L36:
            boolean r0 = r4.LIZLLL(r2, r1, r3)
            return r0
        L3b:
            r2 = r3
            if (r8 == 0) goto L3f
            goto L22
        L3f:
            r1 = r3
            if (r8 == 0) goto L36
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1547460qN6.LIZ(X.0q70, X.0qDV, android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    @Override // X.InterfaceC1536300q56
    public final boolean LIZIZ(C1537480q70 c1537480q70, InterfaceC1541510qDV interfaceC1541510qDV, WebView webView, String str) {
        String host;
        Uri uri = UriProtector.parse(str);
        String scheme = null;
        if (uri != null) {
            host = uri.getHost();
            scheme = uri.getScheme();
        } else {
            host = null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldOverrideUrlLoading，url:");
        sbLIZ.append(webView.getUrl());
        sbLIZ.append(", host:");
        sbLIZ.append(host);
        sbLIZ.append(", schema:");
        sbLIZ.append(scheme);
        C2188811AlT.LIZIZ(sbLIZ);
        return LIZLLL(str, host, scheme);
    }

    @Override // X.InterfaceC1536300q56
    public final void LIZJ(C1537480q70 c1537480q70, InterfaceC1541510qDV interfaceC1541510qDV, WebView webView, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageStarted，url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
