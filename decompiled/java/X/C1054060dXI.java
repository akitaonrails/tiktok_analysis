package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054060dXI {
    public static final C1054060dXI LIZ = new C1054060dXI();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(329));

    public static String LIZ(String str) {
        try {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), FollowStatusChangeMethod.PARAM_UID);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean LIZIZ(Uri uri) {
        if (!TextUtils.equals("http", uri.getScheme()) && !TextUtils.equals("https", uri.getScheme())) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") != null && TextUtils.equals(UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")).getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID))) {
            return false;
        }
        if (!TextUtils.equals(uri.getPath(), "/store/apps/details") && !TextUtils.equals(uri.getPath(), "/d")) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Context context, Uri uri, Bundle bundle) {
        boolean z;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (context != null && C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEgAjS8/YVFkiQFyRYRXpDIPipRcTPqAyWlugnO0Sb77l5lHdOVKRNHA=", null)).size() > 0) {
            z = true;
        } else {
            z = false;
        }
        C2429209fW.LIZ().appendDataFlowId(intent, 1207969303);
        if (!z) {
            return false;
        }
        try {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOW4Zo3PyDuRNcxRaNIRstRXlbTaNlXsKS25Yq400d4ztLY=", null));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openApp error: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
            return false;
        }
    }

    public static boolean LIZLLL(Context context, String str, String str2) {
        Uri uri = UriProtector.parse(str);
        if (!LIZIZ(uri)) {
            return false;
        }
        C01GW c01gw = LIZIZ;
        InterfaceC1050810dS3 interfaceC1050810dS3 = (InterfaceC1050810dS3) c01gw.getValue();
        if (interfaceC1050810dS3 != null && interfaceC1050810dS3.LJ(context, uri)) {
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RouteOperationHandler openGpByUri: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZJ(strLIZIZ);
            return true;
        }
        InterfaceC1050810dS3 interfaceC1050810dS32 = (InterfaceC1050810dS3) c01gw.getValue();
        if (interfaceC1050810dS32 == null || !interfaceC1050810dS32.LIZIZ(context, str2)) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Context context, String str, String str2) {
        boolean z;
        InterfaceC1050810dS3 interfaceC1050810dS3;
        C01GW c01gw = LIZIZ;
        InterfaceC1050810dS3 interfaceC1050810dS32 = (InterfaceC1050810dS3) c01gw.getValue();
        if (interfaceC1050810dS32 != null && interfaceC1050810dS32.LJFF(context, str)) {
            z = true;
        } else {
            z = false;
        }
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RouteOperationHandler openGPMiniCard result:");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20571615ec.getClass();
        C20571615ec.LIZJ(strLIZIZ);
        if (z || ((interfaceC1050810dS3 = (InterfaceC1050810dS3) c01gw.getValue()) != null && interfaceC1050810dS3.LIZIZ(context, str2))) {
            return true;
        }
        return false;
    }
}
