package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.AigcParams;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IAVRouterIntentParse;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.120W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120W implements IAVRouterIntentParse {
    public static final C120W LIZ = new C120W();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(320));

    @Override // com.ss.android.ugc.aweme.services.IAVRouterIntentParse
    public final void handlePublishVideoRouteUri(Context context, Uri uri) {
    }

    public static boolean LIZJ(Activity activity) {
        return Intrinsics.LJFF(activity.getClass().getName(), ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIIIJ("AVRouterIntentParse#parse"));
    }

    public static boolean LJII(Activity activity) {
        if (!C0XF1.LIZLLL(activity)) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131845780);
            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
            return true;
        }
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL()) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJIIIZ(2131845781);
            c1389890mGx2.LIZLLL(3000L);
            c1389890mGx2.LJIIJJI();
            return true;
        }
        return false;
    }

    public static void LIZ(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhjs3QnYkPR9vO5ae5hZiJrszipwv1V0u1/HU=", null));
    }

    public static void LIZLLL(final Activity activity, final Uri uri) throws Throwable {
        long jElapsedRealtime;
        final JSONObject jSONObject;
        final boolean z;
        final boolean zLIZIZ = C577580Ml2.LIZ.LIZIZ();
        if (zLIZIZ) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        if (((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LJII(activity, uri)) {
            return;
        }
        boolean zLJ = LJ(activity, uri);
        final RecordConfig.Builder builder = new RecordConfig.Builder();
        if (zLIZIZ) {
            builder.interceptorCost(SystemClock.elapsedRealtime() - jElapsedRealtime);
        }
        builder.permissionActivityRequired(true);
        LJI(activity, uri, builder);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_params");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            try {
                jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null && jSONObject.optInt("open_sub_only_setting") == 1) {
            z = true;
        } else {
            z = false;
        }
        if (zLJ) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(activity, "route", new IExternalService.ServiceLoadCallback() { // from class: X.11hu
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    Boolean boolValueOf;
                    if (zLIZIZ) {
                        builder.serviceLoadCost(j);
                    }
                    if (z) {
                        if (!((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
                            Activity activity2 = activity;
                            C120W.LIZ.getClass();
                            Intent intent = new Intent(activity2, ((ILoginService) C120W.LIZIZ.getValue()).getPushLoginActivityClass());
                            intent.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
                            intent.putExtra("IS_LANDING_SUB_ONLY_LIVE", true);
                            Activity activity3 = activity;
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity3, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, activity3);
                            C2204961BRm.LJIILLIIL(activity3, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhjs3QnYkPR9vO5ae5hZiJrszipwv1V0u1/HU=", null));
                            return;
                        }
                        builder.interceptBackground(false);
                        asyncAVService.uiService().recordService().startRecord(activity, builder.build());
                        return;
                    }
                    boolean zT5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).t5();
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).isBroadcastSmoothGoLive();
                    boolean zIsVideoRecordNewActivityInStack = asyncAVService.uiService().recordService().isVideoRecordNewActivityInStack();
                    boolean zH5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).h5();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "recordParam");
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        boolValueOf = Boolean.valueOf(jSONObject2.optBoolean("auto_karaoke", false));
                    } else {
                        boolValueOf = null;
                    }
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && zT5 && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab"), "live")) {
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).Z4();
                        return;
                    }
                    if (Intrinsics.LJFF("ame_editor", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && Intrinsics.LJFF("customizedSticker", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) && C1656550tD3.LIZ()) {
                        C120W c120w = C120W.LIZ;
                        Activity activity4 = activity;
                        Uri uri2 = uri;
                        c120w.getClass();
                        C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
                        c1737170vJ5.LIZ = activity4;
                        c1737170vJ5.LIZIZ = "deeplink";
                        c1737170vJ5.LJFF = "deep_link";
                        c1737170vJ5.LIZJ = "DeepLink";
                        c1737170vJ5.LIZLLL = "ame_editor";
                        c1737170vJ5.LJ = C0DMI.LIZ();
                        c1737170vJ5.LIZLLL(uri2);
                        c1737170vJ5.LJIJ = "1";
                        if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "ame_is_aigc_mode"), "1")) {
                            if (C339680DTi.LIZ()) {
                                C120W.LIZIZ(c1737170vJ5, uri2, activity4);
                                return;
                            }
                            C817503Hh c817503Hh = C817503Hh.LL;
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C339770DTr(uri2, c1737170vJ5, activity4, null), 2);
                            return;
                        }
                        C339780DTs.LIZJ(c1737170vJ5, AFwS273S0000000_29.get$arr$(287));
                        return;
                    }
                    if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab"), "live") && !zT5 && !zH5 && !zIsVideoRecordNewActivityInStack) {
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).s4().booleanValue();
                    }
                    asyncAVService.uiService().recordService().startRecord(activity, builder.build());
                }
            });
            return;
        }
        Intent intent = new Intent();
        intent.getFlags();
        intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        new Bundle();
        intent.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
        intent.putExtras(intent.putExtra("enter_record_from_other_platform", true));
        if (z && !((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
            Intent intent2 = new Intent(activity, ((ILoginService) LIZIZ.getValue()).getPushLoginActivityClass());
            intent2.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
            C2204961BRm.LJIILJJIL(activity, new Intent[]{C1076350e7F.LIZ(activity), intent2}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhjs3QnYkPR9vO5ae5hZiJrszipwv1V0u1/HU=", null));
            return;
        }
        LIZ(activity, intent);
    }

    public static boolean LJ(Activity activity, Uri uri) {
        boolean z;
        if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "force_direct_record"), "1")) {
            return C1BN8.LIZ().LIZIZ();
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !C1BN8.LIZ().LIZ.LIZIZ;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(C1737170vJ5 c1737170vJ5, Uri uri, Activity activity) {
        InterfaceC318260Cdk interfaceC318260CdkDraftService;
        c1737170vJ5.LJI = "ame_aigc_create_button";
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ame_aigc_state");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            c1737170vJ5.LIZJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aigc_server_task_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
            c1737170vJ5.LJIJJ = AigcParams.LIZ(c1737170vJ5.LJIJJ, 0, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, null, null, null, 29);
            IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
            if (iEffectCreatorService != null && (interfaceC318260CdkDraftService = iEffectCreatorService.draftService()) != null) {
                interfaceC318260CdkDraftService.LIZLLL(C786410Ut5.L3(activity), c1737170vJ5.LJIJJ.aigcServerTaskId, new AwS370S0200000_4(activity, c1737170vJ5, 53));
                return;
            }
            return;
        }
        C339780DTs.LIZJ(c1737170vJ5, AFwS232S0000000_4.get$arr$(170));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.app.Activity r30, android.net.Uri r31, com.ss.android.ugc.aweme.services.external.ui.RecordConfig.Builder r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120W.LJI(android.app.Activity, android.net.Uri, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191 A[Catch: Exception -> 0x0194, TRY_LEAVE, TryCatch #1 {Exception -> 0x0194, blocks: (B:77:0x0182, B:79:0x0188, B:80:0x0191), top: B:128:0x0182 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // com.ss.android.ugc.aweme.services.IAVRouterIntentParse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void parserTo(final android.app.Activity r26, final android.net.Uri r27, boolean r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120W.parserTo(android.app.Activity, android.net.Uri, boolean):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a88  */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r92v0, types: [com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.app.Activity r90, android.net.Uri r91, com.ss.android.ugc.aweme.services.external.ui.RecordConfig.Builder r92, long r93) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120W.LJFF(android.app.Activity, android.net.Uri, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder, long):void");
    }

    @Override // com.ss.android.ugc.aweme.services.IAVRouterIntentParse
    public final void directFromPushIntent(final Activity activity, final Uri uri, boolean z, boolean z2) throws Throwable {
        final RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("push");
        builder.enterFrom("push");
        builder.interceptBackground(false);
        if (z2) {
            builder.defaultTab(2);
        }
        LJI(activity, uri, builder);
        builder.permissionActivityRequired(true);
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().needLoginBeforeRecord()) {
            boolean zLIZIZ = C1BN8.LIZ().LIZIZ();
            Intent intent = new Intent(activity, ((ILoginService) LIZIZ.getValue()).getPushLoginActivityClass());
            intent.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
            if (zLIZIZ) {
                LIZ(activity, intent);
                return;
            } else {
                C2204961BRm.LJIILJJIL(activity, new Intent[]{C1076350e7F.LIZ(activity), intent}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhjs3QnYkPR9vO5ae5hZiJrszipwv1V0u1/HU=", null));
                return;
            }
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(activity, "push", new IExternalService.ServiceLoadCallback() { // from class: X.11hw
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                boolean zIsVideoRecordNewActivityInStack = asyncAVService.uiService().recordService().isVideoRecordNewActivityInStack();
                boolean zT5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).t5();
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).isBroadcastSmoothGoLive();
                boolean zH5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).h5();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_params");
                Boolean boolValueOf = null;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    try {
                        boolValueOf = Boolean.valueOf(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).optBoolean("auto_karaoke", false));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && zT5 && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab"), "live")) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).Z4();
                    return;
                }
                if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab"), "live") && !zT5 && !zIsVideoRecordNewActivityInStack && !zH5) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).s4().booleanValue();
                }
                asyncAVService.uiService().recordService().startRecord(activity, builder.build());
            }
        });
    }
}
