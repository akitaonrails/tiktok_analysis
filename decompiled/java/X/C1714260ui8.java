package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ui8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714260ui8 {
    public static final C1714260ui8 LIZ = new C1714260ui8();

    public static Integer LIZ(C1713570uh1 c1713570uh1) {
        String strLJIL;
        Integer numValueOf;
        k kVarLJJIIZ;
        try {
            n nVar = c1713570uh1.LIZ.LIZ.LIZ.LIZ;
            if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("client_config_from_web")) != null) {
                strLJIL = kVarLJJIIZ.LJIL();
            } else {
                strLJIL = null;
            }
            if (strLJIL != null) {
                new p();
                k kVarLJJIIZ2 = p.LIZJ(strLJIL).LJIILIIL().LJJIIZ("custom_height");
                if (kVarLJJIIZ2 != null) {
                    numValueOf = Integer.valueOf(kVarLJJIIZ2.LJIIJJI());
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (iIntValue < 70) {
                        iIntValue = 70;
                    }
                    if (iIntValue > 95) {
                        iIntValue = 95;
                    }
                    return Integer.valueOf(iIntValue);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1713570uh1 r14, X.InterfaceC1107590evd r15) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714260ui8.LIZIZ(X.0uh1, X.0evd):void");
    }

    public static Uri LIZJ(String str, Uri uri, C1713570uh1 c1713570uh1) {
        Integer numLIZ = LIZ(c1713570uh1);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        if (numLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(numLIZ);
            sbLIZ.append('%');
            builderBuildUpon.appendQueryParameter("height", C2188811AlT.LIZIZ(sbLIZ));
        }
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (Intrinsics.LJFF(str2, "url")) {
                builderBuildUpon.appendQueryParameter(str2, str);
            } else if (!Intrinsics.LJFF(str2, "height") || numLIZ == null) {
                List<String> queryParameters = UriProtector.getQueryParameters(uri, str2);
                if (queryParameters != null) {
                    Iterator<String> it2 = queryParameters.iterator();
                    while (it2.hasNext()) {
                        builderBuildUpon.appendQueryParameter(str2, it2.next());
                    }
                }
            }
        }
        if (c1713570uh1.LIZ.LIZIZ.LIZ == EnumC1714450uiR.FULL_PAGE && Intrinsics.LJFF(uri.getAuthority(), "webview_popup")) {
            builderBuildUpon.authority(null);
            builderBuildUpon.authority("webview");
        }
        return builderBuildUpon.build();
    }
}
