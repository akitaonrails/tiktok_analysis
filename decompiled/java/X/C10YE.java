package X;

import Y.ACallableS246S0200000_16;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS14S0210000_13;
import Y.AfS182S0100000_13;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.deeplink.glue.LinkPhase;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkExService;
import com.ss.android.ugc.aweme.deeplink.ITrafficRecorderService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.tiktok.kmp.deeplink.IKMPDeeplinkService;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10YE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10YE {
    public abstract void LIZ(C1950707kX c1950707kX, Activity activity, C1962707mT c1962707mT);

    public abstract AbstractC1953807l2 LIZIZ(Uri uri, C1950707kX c1950707kX);

    public abstract void LIZJ(C1950707kX c1950707kX);

    public abstract Uri LIZLLL(Intent intent);

    public abstract void LJ(C1950707kX c1950707kX);

    public abstract boolean LJFF(C1950707kX c1950707kX, Activity activity, C1962707mT c1962707mT);

    public final void LJI(Activity activity, Intent intent, final C19264810Yk c19264810Yk, final C1962707mT c1962707mT) {
        C10YW c10yw;
        C10YS c10ys;
        C10YW c10yw2;
        C10YW c10yw3 = C19264710Yj.LIZ;
        if (c10yw3 != null) {
            c10yw3.LJ();
        }
        C01GW c01gw = C10YN.LIZ;
        Object value = c01gw.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool) && (c10yw2 = C19264710Yj.LIZ) != null) {
            c10yw2.LIZ("deep_link_sdk_start", null);
        }
        Uri uriLIZLLL = LIZLLL(intent);
        if (uriLIZLLL != null) {
            C1950707kX c1950707kX = new C1950707kX(activity, uriLIZLLL, intent, uriLIZLLL);
            LIZJ(c1950707kX);
            LJ(c1950707kX);
            if (!LJFF(c1950707kX, activity, c1962707mT)) {
                return;
            }
            C10YV c10yv = new C10YV(c19264810Yk, this, c1962707mT) { // from class: X.10Y5
                {
                    AbstractC19263910Yb abstractC19263910YbLIZIZ;
                    this.LIZIZ.LIZ(new AbstractC19263910Yb() { // from class: X.10Xl
                        @Override // X.AbstractC19263910Yb
                        public final void LIZIZ(C1950707kX c1950707kX2) {
                            String stringExtra;
                            String stringExtra2;
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                            Uri uri;
                            C19263710Xz.LIZJ("EntryNode");
                            C19261610Xe c19261610Xe = c1950707kX2.LJFF;
                            Intent intent2 = c1950707kX2.LIZJ;
                            Uri uri2 = c1950707kX2.LIZIZ;
                            ARunnableS14S0210000_13 aRunnableS14S0210000_13 = new ARunnableS14S0210000_13(c1950707kX2.LIZIZ, new C19262210Xk(c1950707kX2.LIZ, intent2), ((Boolean) c1950707kX2.LJ.get("is_from_notification")).booleanValue(), 0);
                            if (C19266010Yw.LIZ()) {
                                C20684815ws.LJFF().execute(aRunnableS14S0210000_13);
                            } else {
                                aRunnableS14S0210000_13.run();
                            }
                            String stringExtra3 = null;
                            if (!((Boolean) c1950707kX2.LJ.get("is_from_notification")).booleanValue()) {
                                Activity activity2 = c1950707kX2.LIZ;
                                Uri uri3 = c1950707kX2.LIZIZ;
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "gd_label");
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "utm_source");
                                String host = uri3.getHost();
                                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) && TextUtils.equals(host, "webview") && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "url") != null && (uri = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "url"))) != null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
                                }
                                Intent intent3 = activity2.getIntent();
                                if (intent3 != null && intent3.hasExtra("al_applink_data")) {
                                    c19261610Xe.LIZ = "link_direct";
                                    c19261610Xe.LIZIZ = "fb";
                                    c19261610Xe.LIZLLL = "facebook";
                                }
                                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                                    c19261610Xe.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                                }
                                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                                    c19261610Xe.LIZLLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                                } else {
                                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "params_url");
                                    if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) {
                                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4), "utm_source");
                                        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) {
                                            c19261610Xe.LIZLLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                                        }
                                    }
                                }
                            }
                            try {
                                stringExtra = intent2.getStringExtra("user_id");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                stringExtra = null;
                            }
                            String str = "";
                            if (stringExtra != null) {
                                try {
                                    stringExtra3 = intent2.getStringExtra("user_id");
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                c19261610Xe.LJ = stringExtra3;
                            } else {
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "params_url");
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null) {
                                    try {
                                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)), "user_id");
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                                    }
                                    c19261610Xe.LJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                                }
                            }
                            try {
                                stringExtra2 = intent2.getStringExtra("launch_method");
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                            if (stringExtra2 == null) {
                                stringExtra2 = "";
                            }
                            c19261610Xe.LIZ = stringExtra2;
                            try {
                                String stringExtra4 = intent2.getStringExtra("page_source");
                                if (stringExtra4 != null) {
                                    str = stringExtra4;
                                }
                            } catch (Exception e5) {
                                TryCatchGuardChecker.doCheck(e5);
                            }
                            c19261610Xe.LIZIZ = str;
                            C19263710Xz.LJ("EntryNode");
                        }
                    });
                    this.LIZ.put("EntryNode", 1);
                    this.LIZIZ.LIZ(new AbstractC19263910Yb() { // from class: X.0W9t
                        public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(368));
                        public String LIZJ = "";

                        @Override // X.AbstractC19263910Yb
                        public final void LIZIZ(C1950707kX c1950707kX2) {
                            C19263710Xz.LIZJ("PushPreloadCacheNode");
                            IPushApi iPushApi = (IPushApi) PluggableExtentionKt.pluggableSpi$default(IPushApi.class, false, false, false, 14, null);
                            if (iPushApi != null) {
                                iPushApi.preloadPushCacheAsync(this.LIZJ);
                            }
                        }

                        @Override // X.AbstractC19263910Yb
                        public final boolean LIZJ(C1950707kX c1950707kX2) {
                            InterfaceC813980VwS interfaceC813980VwS;
                            String lastPathSegment = c1950707kX2.LIZIZ.getLastPathSegment();
                            if (lastPathSegment == null) {
                                lastPathSegment = "";
                            }
                            this.LIZJ = lastPathSegment;
                            if (C10Y9.LIZJ()) {
                                return false;
                            }
                            Object obj = c1950707kX2.LJ.get("is_from_notification");
                            if (!(obj instanceof Boolean)) {
                                obj = null;
                            }
                            if (!Intrinsics.LJFF(obj, Boolean.TRUE) || (interfaceC813980VwS = (InterfaceC813980VwS) this.LIZIZ.getValue()) == null || !interfaceC813980VwS.LIZJ(this.LIZJ)) {
                                return false;
                            }
                            return true;
                        }
                    });
                    this.LIZ.put("PushPreloadCacheNode", 2);
                    this.LIZIZ.LIZ(new AbstractC19263910Yb(c1962707mT) { // from class: X.10VL
                        public final C1962707mT LIZIZ;

                        {
                            super(true);
                            this.LIZIZ = c1962707mT;
                        }

                        @Override // X.AbstractC19263910Yb
                        public final void LIZIZ(C1950707kX c1950707kX2) {
                            boolean z;
                            boolean zEquals;
                            boolean z2;
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                            C19263710Xz.LIZJ("NewUserJourneyNode");
                            try {
                                C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1950707kX2.LIZIZ, "media_source");
                                c1893790zNh.getClass();
                                if (C1893790zNh.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1950707kX2.LIZIZ, "url")) != null) {
                                    String str = C0S0T.LIZ.get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                    if (str == null) {
                                        str = "";
                                    }
                                    if (str.length() == 0) {
                                        ISpecActService iSpecActService = (ISpecActService) ServiceManager.get().getService(ISpecActService.class);
                                        if (iSpecActService != null) {
                                            iSpecActService.LJJJJI();
                                        }
                                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S0S(c1950707kX2.LIZIZ, null), 3);
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            Uri uri = c1950707kX2.LIZIZ;
                            ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class);
                            if (iCredentialManagerService.LJI(uri) && !iCredentialManagerService.LIZJ()) {
                                iCredentialManagerService.LJIILLIIL(true);
                            }
                            if (!C10Y9.LJ(c1950707kX2.LIZIZ.getHost(), c1950707kX2.LIZIZ.getPath()) && !C19262710Xp.LIZIZ(c1950707kX2.LIZIZ) && !C10Y9.LJFF(c1950707kX2.LIZIZ)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            try {
                                zEquals = TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1950707kX2.LIZIZ, "need_mall"), "1");
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                                zEquals = false;
                            }
                            C19254610Um c19254610Um = C19254610Um.LIZIZ;
                            Activity activity2 = c1950707kX2.LIZ;
                            C1962707mT c1962707mT2 = this.LIZIZ;
                            if (c1962707mT2.LIZ && Intrinsics.LJFF(c1962707mT2.LIZJ, "saf_nuj_first")) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c19254610Um.LJIIZILJ(activity2, false, true, z, zEquals, true, z2, this.LIZIZ.LIZIZ);
                        }

                        @Override // X.AbstractC19263910Yb
                        public final boolean LIZJ(C1950707kX c1950707kX2) {
                            return C19254610Um.LIZIZ.LJJIJLIJ(c1950707kX2.LIZ);
                        }
                    });
                    int i = 3;
                    this.LIZ.put("NewUserJourneyNode", 3);
                    if (c19264810Yk.LIZ) {
                        this.LIZIZ.LIZ(new AbstractC19263910Yb(c1962707mT) { // from class: X.10Y6
                            public final C1962707mT LIZIZ;
                            public boolean LIZJ;

                            {
                                super(false);
                                this.LIZIZ = c1962707mT;
                            }

                            @Override // X.AbstractC19263910Yb
                            public final void LIZIZ(C1950707kX c1950707kX2) throws Throwable {
                                C10YC c10y7;
                                String str;
                                String stringExtra;
                                Object obj;
                                IKMPDeeplinkService iKMPDeeplinkServiceLIZ;
                                IKMPDeeplinkService iKMPDeeplinkServiceLIZ2;
                                Uri uri;
                                boolean zLJI = MethodIDManager.LJI(71976);
                                C19263710Xz.LIZ.getClass();
                                if (!C19263710Xz.LJIIJJI) {
                                    C19263710Xz.LIZJ("AppLinkNode");
                                }
                                Intent intent2 = c1950707kX2.LIZJ;
                                Uri data = intent2.getData();
                                boolean zLJFF = C10Y9.LJFF(data);
                                C10YA.LIZ.getClass();
                                String str2 = null;
                                if (data != null && !zLJFF && (iKMPDeeplinkServiceLIZ = C10YA.LIZ()) != null) {
                                    iKMPDeeplinkServiceLIZ.LIZJ();
                                    C10ZO c10zo = C10ZO.LIZ;
                                    if (C10ZO.LJ() && (iKMPDeeplinkServiceLIZ2 = C10YA.LIZ()) != null) {
                                        iKMPDeeplinkServiceLIZ2.LIZJ();
                                        C10ZO c10zo2 = C10ZO.LIZ;
                                        String strLJI = C10ZO.LJI(data.toString());
                                        if (strLJI != null && strLJI.length() != 0 && ((Boolean) C0CO2.LIZ.getValue()).booleanValue() && (uri = UriProtector.parse(strLJI)) != null) {
                                            intent2.setData(uri);
                                            data = uri;
                                        }
                                    }
                                }
                                if (data == null) {
                                    C19263710Xz.LIZLLL(2001, null, "uri_parse");
                                } else {
                                    Uri.Builder builderBuildUpon = UriProtector.parse(data.toString()).buildUpon();
                                    builderBuildUpon.appendQueryParameter("convert_url", ((String[]) a0.LJJLIIIJILLIZJL(data.toString(), new String[]{"?"}, 0, 6).toArray(new String[0]))[0]);
                                    Uri uriBuild = builderBuildUpon.build();
                                    if (!TextUtils.equals("http", uriBuild.getScheme()) && !TextUtils.equals("https", uriBuild.getScheme()) && !C19262710Xp.LIZIZ(uriBuild)) {
                                        C19263710Xz.LIZLLL(2002, uriBuild, "uri_parse");
                                    } else {
                                        try {
                                            Bundle extras = intent2.getExtras();
                                            if (extras != null) {
                                                try {
                                                    obj = extras.get("android.intent.extra.REFERRER");
                                                } catch (Exception e) {
                                                    TryCatchGuardChecker.doCheck(e);
                                                } catch (OutOfMemoryError e2) {
                                                    TryCatchGuardChecker.doCheck(e2);
                                                }
                                                if (obj == null || (stringExtra = obj.toString()) == null) {
                                                    try {
                                                        stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                                                        if (stringExtra != null) {
                                                            c1950707kX2.LJFF.LJII = stringExtra;
                                                        }
                                                    } catch (Exception e3) {
                                                        TryCatchGuardChecker.doCheck(e3);
                                                    }
                                                } else {
                                                    c1950707kX2.LJFF.LJII = stringExtra;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            TryCatchGuardChecker.doCheck(e4);
                                        }
                                        c1950707kX2.LJFF.LJIIIIZZ = uriBuild.toString();
                                        c1950707kX2.LJFF.LIZJ = "applink";
                                        try {
                                            String host = uriBuild.getHost();
                                            String path = uriBuild.getPath();
                                            if (!C10Y9.LJ(host, path) && !C19262710Xp.LIZIZ(uriBuild) && !zLJFF) {
                                                if (C10Y9.LIZLLL(host, path)) {
                                                    c10y7 = new C10YB();
                                                    C19263710Xz.LIZ.getClass();
                                                    if (C19263710Xz.LJIILIIL) {
                                                        str = "personalize_link";
                                                    } else if (Intrinsics.LJFF(C19263710Xz.LJIIIZ, "short_to_long")) {
                                                        str = "short_to_semantic";
                                                    } else {
                                                        str = "semantic";
                                                    }
                                                    C19263710Xz.LJIIIZ = str;
                                                } else {
                                                    c10y7 = new C19266310Yz();
                                                }
                                            } else {
                                                ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJ().LIZ();
                                                String str3 = this.LIZIZ.LIZJ;
                                                if (str3 != null && (TextUtils.equals(str3, "saf_main_on_create") || TextUtils.equals(str3, "saf_main_on_new_intent"))) {
                                                    str2 = str3;
                                                }
                                                if (((Boolean) C257510A7h.LIZ.getValue()).booleanValue()) {
                                                    c10y7 = new C10Y8(str2);
                                                } else {
                                                    c10y7 = new C10Y7(C786410Ut5.L3(c1950707kX2.LIZ), str2, false, zLJFF);
                                                }
                                                C19263710Xz.LIZ.getClass();
                                                C19263710Xz.LJIIIZ = "short_to_long";
                                                LJ(c1950707kX2.LIZ, uriBuild);
                                                this.LIZ = true;
                                            }
                                            Uri uriLIZ = c10y7.LIZ(uriBuild, c1950707kX2);
                                            if (uriLIZ != null || (!(c10y7 instanceof C19266310Yz) && (uriLIZ = new C19266310Yz().LIZ(uriBuild, c1950707kX2)) != null)) {
                                                if (!this.LIZ) {
                                                    C10YX.LIZ = c1950707kX2.LIZIZ.toString();
                                                    uriLIZ.toString();
                                                    ITrafficRecorderService iTrafficRecorderService = (ITrafficRecorderService) PluggableExtentionKt.pluggableSpi$default(ITrafficRecorderService.class, false, false, false, 14, null);
                                                    if (iTrafficRecorderService != null) {
                                                        iTrafficRecorderService.LIZJ(uriLIZ.toString());
                                                    }
                                                    c1950707kX2.LIZIZ = uriLIZ;
                                                    C19261610Xe c19261610Xe = c1950707kX2.LJFF;
                                                    c19261610Xe.LIZ = "link_direct";
                                                    c19261610Xe.LIZIZ = "google";
                                                    C1953307kx.LIZ.getClass();
                                                    C19263710Xz.LJI(C1953307kx.LIZJ(uriLIZ));
                                                }
                                            } else if (!C10EU.LJIIIIZZ()) {
                                                LJFF(c1950707kX2.LIZ, uriBuild);
                                            }
                                            if ((!this.LIZ || !C19262710Xp.LIZ()) && !this.LIZJ) {
                                                C19263710Xz.LJ("AppLinkNode");
                                            } else {
                                                if (C07HK.LIZ()) {
                                                    Activity activity2 = c1950707kX2.LIZ;
                                                    if (activity2 instanceof AppLinkHandlerV2) {
                                                        activity2.finish();
                                                    }
                                                } else {
                                                    SettingsManager.LIZLLL().getClass();
                                                    if (SettingsManager.LIZ("applink_finish_only_handler_enable", true)) {
                                                        Activity activity3 = c1950707kX2.LIZ;
                                                        if (activity3 instanceof AppLinkHandlerV2) {
                                                            activity3.finish();
                                                        }
                                                    } else {
                                                        c1950707kX2.LIZ.finish();
                                                    }
                                                }
                                                C19263710Xz.LIZ.getClass();
                                                C19263710Xz.LJIIJJI = true;
                                            }
                                        } catch (Exception e5) {
                                            TryCatchGuardChecker.doCheck(e5);
                                        }
                                    }
                                }
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                            }

                            public static void LIZLLL(Activity activity2, Intent intent2) {
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent2, "Context_startActivity_1");
                                C1701330uNH.LIZ(intent2, activity2);
                                C2204961BRm.LJIILLIIL(activity2, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+lKmbrxUl+DYmuplOSu4GKw=", null));
                            }

                            /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
                            /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJ(android.app.Activity r11, android.net.Uri r12) {
                                /*
                                    Method dump skipped, instruction units count: 375
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C10Y6.LJ(android.app.Activity, android.net.Uri):void");
                            }

                            public final void LJFF(Activity activity2, Uri uri) {
                                if (C10ZH.LIZIZ.LJJLJ(activity2, this.LIZIZ)) {
                                    C19263710Xz.LIZLLL(2005, uri, "login");
                                    return;
                                }
                                C19263710Xz.LIZLLL(2003, uri, "uri_parse");
                                String strLIZIZ = ((ISecLinkService) ServiceManager.get().getService(ISecLinkService.class)).LIZIZ(uri.toString(), "deeplink");
                                if (strLIZIZ == null) {
                                    strLIZIZ = uri.toString();
                                }
                                Intent awemeWebIntent = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAwemeWebIntent(activity2, uri.buildUpon().appendQueryParameter("url", strLIZIZ).build(), Boolean.TRUE, Boolean.FALSE);
                                if (awemeWebIntent != null) {
                                    LIZLLL(activity2, awemeWebIntent);
                                }
                            }
                        });
                        i = 4;
                        this.LIZ.put("AppLinkNode", 4);
                    }
                    IDeepLinkExService iDeepLinkExService = (IDeepLinkExService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkExService.class, false, false, false, 14, null);
                    this.LIZIZ.LIZ((iDeepLinkExService == null || (abstractC19263910YbLIZIZ = iDeepLinkExService.LIZIZ(c1962707mT)) == null) ? new C848630XQv(c1962707mT) : abstractC19263910YbLIZIZ);
                    int i2 = i + 1;
                    this.LIZ.put("LoginNode", Integer.valueOf(i2));
                    this.LIZIZ.LIZ(new AbstractC19263910Yb(this, c1962707mT) { // from class: X.10Y0
                        public final C10YE LIZIZ;
                        public final C1962707mT LIZJ;
                        public final HashMap<String, Object> LIZLLL;
                        public Pair<Boolean, String> LJ;

                        public static boolean LIZLLL(C1950707kX c1950707kX2) {
                            boolean z;
                            String str;
                            Object obj = c1950707kX2.LJ.get("in_app_enter_from");
                            if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            return !z;
                        }

                        @Override // X.AbstractC19263910Yb
                        public final void LIZIZ(C1950707kX c1950707kX2) {
                            Pair<Boolean, String> pair;
                            String str;
                            boolean zBooleanValue;
                            boolean z;
                            String string;
                            AbstractC1953807l2 abstractC1953807l2LIZIZ;
                            BcmParams bcmParams;
                            String strDecode;
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                            C19263710Xz.LIZJ("TerminalNode");
                            C10Y2 c10y2LIZ = C10YJ.LIZ(c1950707kX2);
                            if (c10y2LIZ != null) {
                                c10y2LIZ.LIZIZ();
                            }
                            if (BtmSDK.INSTANCE.enableExternalEvokeAbility(c1950707kX2.LIZIZ.toString())) {
                                String string2 = c1950707kX2.LIZIZ.toString();
                                if (string2 == null) {
                                    bcmParams = null;
                                } else {
                                    bcmParams = new BcmParams();
                                    Iterator<String> it2 = C2751014r.LIZ().additionalUrlPathList.iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(string2), it2.next());
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                            strDecode = Uri.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                        } else {
                                            strDecode = null;
                                        }
                                        bcmParams.merge(C2749014p.LIZ(strDecode));
                                    }
                                    bcmParams.merge(C2749014p.LIZ(string2));
                                }
                                String strCreateExternalEvokeBtmToken = BtmSDK.INSTANCE.createExternalEvokeBtmToken(c1950707kX2.LIZIZ.toString(), C10YX.LIZLLL, bcmParams);
                                if (C123100dR.LIZ(strCreateExternalEvokeBtmToken)) {
                                    c1950707kX2.LIZIZ = c1950707kX2.LIZIZ.buildUpon().appendQueryParameter("source_btm_token", strCreateExternalEvokeBtmToken).build();
                                }
                            }
                            C10YE c10ye = this.LIZIZ;
                            if (c10ye == null || (abstractC1953807l2LIZIZ = c10ye.LIZIZ(c1950707kX2.LIZIZ, c1950707kX2)) == null || (pair = abstractC1953807l2LIZIZ.LIZ(c1950707kX2, this.LIZLLL, this.LIZJ)) == null) {
                                pair = new Pair<>(Boolean.FALSE, "default_homepage");
                            }
                            this.LJ = pair;
                            if (!pair.getFirst().booleanValue()) {
                                C19263710Xz.LJ("TerminalNode");
                                C19263710Xz.LIZLLL(3001, c1950707kX2.LIZIZ, "Transfer");
                            }
                            Uri uri = c1950707kX2.LIZIZ;
                            Object obj = c1950707kX2.LJ.get("gd_label");
                            String str2 = "";
                            if (obj == null) {
                                str = "";
                            } else {
                                str = (String) obj;
                            }
                            Object obj2 = c1950707kX2.LJ.get("is_from_notification");
                            if (obj2 != null) {
                                zBooleanValue = ((Boolean) obj2).booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            C1400380mXs.LIZ().LIZ = false;
                            C10YR.LIZ("", "", true);
                            C1E95 c1e95 = C1E95.LIZIZ;
                            c1e95.LJIILIIL(zBooleanValue, uri);
                            c1e95.LJJIIZ(uri, c1950707kX2.LIZJ, zBooleanValue);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(uri.getHost());
                            sbLIZ.append(uri.getPath());
                            if (a0.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ), "aweme/detail", false)) {
                                if (zBooleanValue) {
                                    String lastPathSegment = uri.getLastPathSegment();
                                    C581900Ms0.LIZLLL = str;
                                    C581900Ms0.LJ = lastPathSegment;
                                    C581900Ms0.LIZJ = 1;
                                    if (C19262710Xp.LIZ()) {
                                        C1606570ruR.LIZ = System.currentTimeMillis();
                                        C1606570ruR.LIZLLL = str;
                                        C1606570ruR.LJ = 0;
                                    } else {
                                        C1606570ruR.LIZIZ = System.currentTimeMillis();
                                        C1606570ruR.LIZLLL = str;
                                        C1606570ruR.LJ = 0;
                                        C1606570ruR.LIZJ = 1;
                                        C1606570ruR.LIZ = C1150504el.LIZ().LJJII;
                                        C1606570ruR.LIZ();
                                    }
                                } else {
                                    String lastPathSegment2 = uri.getLastPathSegment();
                                    C581900Ms0.LIZLLL = str;
                                    C581900Ms0.LJ = lastPathSegment2;
                                    C581900Ms0.LIZJ = 2;
                                }
                            }
                            C581760Mrm.LIZIZ = false;
                            C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.DEEPLINK);
                            C1150504el.LIZ().LJIIIIZZ = false;
                            if (C798410VTr.LIZ()) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("monitor_scene", "scene_launch");
                                linkedHashMap.put("launch_type", "launch_type_link");
                                linkedHashMap.put("vv_code", 5000);
                                linkedHashMap.put("launch_method", c1950707kX2.LJFF.LIZ);
                                linkedHashMap.put("launch_origin_uri", c1950707kX2.LIZIZ);
                                Object obj3 = c1950707kX2.LJ.get("gd_label");
                                if (obj3 == null) {
                                    obj3 = "";
                                }
                                linkedHashMap.put("launch_gd_label", obj3);
                                C798410VTr.LJFF(linkedHashMap);
                            }
                            c1950707kX2.LJFF.LIZJ = this.LJ.getSecond();
                            C19262210Xk c19262210Xk = new C19262210Xk(c1950707kX2.LIZ, c1950707kX2.LIZJ);
                            ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(c1950707kX2.LIZIZ, 2);
                            if (C19266010Yw.LIZ()) {
                                C20684815ws.LJFF().execute(aRunnableS113S0100000_13);
                            } else {
                                aRunnableS113S0100000_13.run();
                            }
                            ARunnableS14S0210000_13 aRunnableS14S0210000_13 = new ARunnableS14S0210000_13(c1950707kX2.LIZIZ, c19262210Xk, zBooleanValue, 1);
                            if (C19266010Yw.LIZ()) {
                                C20684815ws.LJFF().execute(aRunnableS14S0210000_13);
                            } else {
                                aRunnableS14S0210000_13.run();
                            }
                            Uri uri2 = c1950707kX2.LIZIZ;
                            if (uri2.toString().startsWith(InterfaceC1029360ctS.LIZ)) {
                                C15O7.LIZJ(new ACallableS246S0200000_16(c19262210Xk, uri2, 0));
                            }
                            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(uri2, 2);
                            if (C19266010Yw.LIZ()) {
                                C20684815ws.LJFF().execute(aRunnableS116S0100000_16);
                            } else {
                                aRunnableS116S0100000_16.run();
                            }
                            int i3 = C19266010Yw.LIZ;
                            if (i3 != 3 && i3 != 5) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (LIZLLL(c1950707kX2)) {
                                    try {
                                        SettingsManager.LIZLLL().getClass();
                                        if (!SettingsManager.LIZ("in_app_method_not_send_launch_log", true)) {
                                            c19262210Xk.LIZ(c1950707kX2.LIZIZ, c1950707kX2.LJFF, zBooleanValue);
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C1AF0.LJ(th);
                                    }
                                } else {
                                    c19262210Xk.LIZ(c1950707kX2.LIZIZ, c1950707kX2.LJFF, zBooleanValue);
                                }
                            } else {
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C1AF0.LJ(th2);
                                }
                                if (!SettingsManager.LIZ("in_app_method_not_send_launch_log", true)) {
                                    c19262210Xk.LIZ(c1950707kX2.LIZIZ, c1950707kX2.LJFF, zBooleanValue);
                                } else if (!LIZLLL(c1950707kX2)) {
                                    c19262210Xk.LIZ(c1950707kX2.LIZIZ, c1950707kX2.LJFF, zBooleanValue);
                                }
                            }
                            C19264010Yc.LIZIZ.LIZ(false);
                            Integer num = c1950707kX2.LJI;
                            String str3 = c1950707kX2.LJII;
                            if (C18041074t.LIZ() && num != null) {
                                C621180OYa.LIZ.LIZ();
                                if (num.intValue() == 2) {
                                    C621180OYa.LIZ.LJIILL(num, Integer.valueOf(((Number) AnonymousClass0743.LIZ.getValue()).intValue()), c1950707kX2.LIZIZ.toString(), str3, Long.valueOf(C18041074t.LIZIZ()));
                                }
                            }
                            if (!zBooleanValue) {
                                C1234690iEd.LIZIZ.LIZJ().LIZJ(c1950707kX2.LIZ, c1950707kX2.LIZIZ);
                            }
                            C10Y1 c10y1LIZ = C19264110Yd.LIZ();
                            Uri uri3 = c1950707kX2.LIZIZ;
                            if (uri3 != null && (string = uri3.toString()) != null) {
                                str2 = string;
                            }
                            c10y1LIZ.getClass();
                            if (C295460Bi4.LIZ() && C1533950q1J.LJ(str2)) {
                                c10y1LIZ.LIZJ.put("converter_link", C13LN.LJZL(LSPassThroughRecordSizeConfig.DEFAULT, str2));
                            }
                            C19264110Yd.LIZ().LIZJ(LinkPhase.LINK_PROCESS);
                            C19264110Yd.LIZ().LIZ(LinkPhase.PAGE_OPEN);
                            C19264110Yd.LIZ().LIZ(LinkPhase.PAGE_UI_READY);
                        }

                        @Override // X.AbstractC19263910Yb
                        public final boolean LIZJ(C1950707kX c1950707kX2) {
                            C0X96.LIZ.getClass();
                            if (!C0X96.LIZ(c1950707kX2)) {
                                c1950707kX2.LIZ.finish();
                                return false;
                            }
                            return true;
                        }

                        {
                            super(false);
                            this.LIZIZ = this;
                            this.LIZJ = c1962707mT;
                            this.LIZLLL = new HashMap<>();
                            this.LJ = new Pair<>(Boolean.FALSE, "default_homepage");
                        }
                    });
                    this.LIZ.put("TerminalNode", Integer.valueOf(i2 + 1));
                }
            };
            C19263810Ya.LIZLLL = c1950707kX;
            if (!C19263810Ya.LIZIZ) {
                if (C19263810Ya.LIZ == null) {
                    C19263810Ya.LIZ = c10yv;
                    C19263810Ya.LIZIZ = true;
                }
                C19263810Ya.LIZJ = (C11JF) C19264210Ye.LIZ.LJJLJLI(new AfS182S0100000_13(AFwS271S0000000_28.get$arr$(259), 92));
            }
            C10YV c10yv2 = C19263810Ya.LIZ;
            if (c10yv2 != null && (c10ys = c10yv2.LIZIZ) != null) {
                c10ys.LIZIZ(c1950707kX, c10ys);
            }
            LIZ(c1950707kX, activity, c1962707mT);
            C10YW c10yw4 = C19264710Yj.LIZ;
            if (c10yw4 != null) {
                c10yw4.LIZIZ();
            }
            if (Intrinsics.LJFF(c01gw.getValue(), bool) && (c10yw = C19264710Yj.LIZ) != null) {
                c10yw.LIZ("deep_link_sdk_end", null);
                return;
            }
            return;
        }
        if (!c1962707mT.LIZ) {
            activity.finish();
            return;
        }
        Function0<Unit> function0 = c1962707mT.LIZLLL;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
