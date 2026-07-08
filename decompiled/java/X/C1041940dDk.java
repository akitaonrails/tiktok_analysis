package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041940dDk {
    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9Hv2CE3+bd+yOzKVm8=", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent LIZIZ(android.content.Context r22, android.net.Uri r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1041940dDk.LIZIZ(android.content.Context, android.net.Uri, boolean, boolean):android.content.Intent");
    }

    public static boolean LIZJ(Context context, String str, String str2, boolean z) {
        Activity activityLIZ;
        Context context2 = context;
        if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
            context2 = activityLIZ;
        }
        try {
            new JSONObject().put("url", str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        boolean z2 = false;
        if (context2 == null) {
            return false;
        }
        try {
            try {
                if (!C2093608Ic.LJ(str)) {
                    Uri uri = UriProtector.parse(str);
                    if (C2431009fo.LIZJ(str)) {
                        Intent intent = new Intent(context2, (Class<?>) CrossPlatformActivity.class);
                        intent.setData(uri);
                        C2429209fW.LIZ().appendDataFlowId(intent, "402657282");
                        intent.putExtra("swipe_mode", 2);
                        LIZ(context2, intent);
                        return true;
                    }
                    String scheme = uri.getScheme();
                    if (scheme == null) {
                        scheme = "";
                    }
                    C10ZH c10zh = C10ZH.LIZIZ;
                    boolean zLJJI = c10zh.LJJI(scheme) | Intrinsics.LJFF(scheme, "aweme");
                    String host = uri.getHost();
                    if (zLJJI) {
                        if (Intrinsics.LJFF("webview", host)) {
                            Intent intentLIZ = C1041590dDB.LIZ(context2, uri);
                            if (intentLIZ != null) {
                                intentLIZ.putExtra("swipe_mode", 2);
                                C2429209fW.LIZ().appendDataFlowId(intentLIZ, "402657282");
                                if (!(context2 instanceof Activity)) {
                                    intentLIZ.addFlags(268435456);
                                }
                                LIZ(context2, intentLIZ);
                            }
                            return true;
                        }
                        C1041950dDl.LIZ(uri);
                        AbstractC827890Wdn.LIZIZ();
                        Class<? extends Activity> clsLJLJJI = ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJLJJI("AwemeAppData#getDeepLinkHandlerActivityClass");
                        if (clsLJLJJI != null) {
                            Intent intent2 = new Intent(context2, clsLJLJJI);
                            intent2.setData(uri);
                            intent2.putExtra("is_from_self", true);
                            IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
                            if (iDeepLinkService != null && iDeepLinkService.LJJJ(context2, intent2, "ads")) {
                                return true;
                            }
                            LIZ(context2, intent2);
                        }
                        return true;
                    }
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(uri);
                    if (C2162308dZ.LJ(context2, intent3)) {
                        intent3.putExtra("open_url", str);
                        if (z) {
                            intent3.addFlags(268435456);
                        }
                        C2429209fW.LIZ().appendDataFlowId(intent3, 1207969295);
                        LIZ(context2, intent3);
                        return true;
                    }
                    if (u.LJJIIJZLJL(scheme, c10zh.LJJJJJ(), false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("com.ss.android.sdk.");
                        sbLIZ.append(scheme);
                        Intent intent4 = new Intent(C2188811AlT.LIZIZ(sbLIZ));
                        if (C2162308dZ.LJ(context2, intent4)) {
                            intent4.putExtra("open_url", str);
                            LIZ(context2, intent4);
                            return true;
                        }
                    }
                }
                if (!C2093608Ic.LJ(str2) && C2162308dZ.LJFF(context2, str2)) {
                    LIZ(context2, C2162308dZ.LIZIZ(context2, str2));
                    return true;
                }
            } catch (Exception e) {
                e = e;
                z2 = true;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            e = e2;
        }
        return z2;
    }
}
