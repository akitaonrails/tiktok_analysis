package androidx.webkit.internal;

import X.AbstractC2266681Dnm;
import X.AbstractC2266691Dnn;
import X.C08QZ;
import X.C20025313Wx;
import X.C2114408Qc;
import X.C2188811AlT;
import X.C2266701Dno;
import X.C2266711Dnp;
import X.C2266721Dnq;
import X.C2266731Dnr;
import X.C2266741Dns;
import X.C2266751Dnt;
import X.C2266761Dnu;
import X.C2266771Dnv;
import X.C2266781Dnw;
import X.InterfaceC2266791Dnx;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.webkit.WebViewFeature;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes36.dex */
public class WebViewFeatureInternal {
    public static final C2114408Qc ALGORITHMIC_DARKENING;
    public static final C2266771Dnv CREATE_WEB_MESSAGE_CHANNEL;
    public static final C2266711Dnp DISABLED_ACTION_MODE_MENU_ITEMS;
    public static final C2266781Dnw DOCUMENT_START_SCRIPT;
    public static final C2266781Dnw ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY;
    public static final C2266751Dnt FORCE_DARK;
    public static final C2266781Dnw FORCE_DARK_STRATEGY;
    public static final C2266781Dnw GET_COOKIE_INFO;
    public static final C2266781Dnw GET_VARIATIONS_HEADER;
    public static final C2266721Dnq GET_WEB_CHROME_CLIENT;
    public static final C2266721Dnq GET_WEB_VIEW_CLIENT;
    public static final C2266751Dnt GET_WEB_VIEW_RENDERER;
    public static final C2266781Dnw MULTI_PROCESS;
    public static final C2266771Dnv OFF_SCREEN_PRERASTER;
    public static final C2266771Dnv POST_WEB_MESSAGE;
    public static final C2266781Dnw PROXY_OVERRIDE;
    public static final C2266781Dnw PROXY_OVERRIDE_REVERSE_BYPASS;
    public static final C2266771Dnv RECEIVE_HTTP_ERROR;
    public static final C2266771Dnv RECEIVE_WEB_RESOURCE_ERROR;
    public static final C2266781Dnw REQUESTED_WITH_HEADER_ALLOW_LIST;
    public static final C2266731Dnr SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED;
    public static final C2266731Dnr SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED;
    public static final C2266731Dnr SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
    public static final C2266731Dnr SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
    public static final C2266721Dnq SAFE_BROWSING_ENABLE;
    public static final C2266731Dnr SAFE_BROWSING_HIT;
    public static final C2266731Dnr SAFE_BROWSING_PRIVACY_POLICY_URL;
    public static final C2266731Dnr SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY;
    public static final C2266731Dnr SAFE_BROWSING_RESPONSE_PROCEED;
    public static final C2266731Dnr SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
    public static final C2266711Dnp SERVICE_WORKER_BASIC_USAGE;
    public static final C2266711Dnp SERVICE_WORKER_BLOCK_NETWORK_LOADS;
    public static final C2266711Dnp SERVICE_WORKER_CACHE_MODE;
    public static final C2266711Dnp SERVICE_WORKER_CONTENT_ACCESS;
    public static final C2266711Dnp SERVICE_WORKER_FILE_ACCESS;
    public static final C2266711Dnp SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST;
    public static final C2266711Dnp SHOULD_OVERRIDE_WITH_REDIRECTS;
    public static final C2266701Dno STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX;
    public static final C2266761Dnu STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH;
    public static final C2266731Dnr START_SAFE_BROWSING;
    public static final C2266781Dnw SUPPRESS_ERROR_PAGE;
    public static final C2266741Dns TRACING_CONTROLLER_BASIC_USAGE;
    public static final C2266771Dnv VISUAL_STATE_CALLBACK;
    public static final C2266771Dnv WEB_MESSAGE_CALLBACK_ON_MESSAGE;
    public static final C2266781Dnw WEB_MESSAGE_GET_MESSAGE_PAYLOAD;
    public static final C2266781Dnw WEB_MESSAGE_LISTENER;
    public static final C2266771Dnv WEB_MESSAGE_PORT_CLOSE;
    public static final C2266771Dnv WEB_MESSAGE_PORT_POST_MESSAGE;
    public static final C2266771Dnv WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
    public static final C2266771Dnv WEB_RESOURCE_ERROR_GET_CODE;
    public static final C2266771Dnv WEB_RESOURCE_ERROR_GET_DESCRIPTION;
    public static final C2266711Dnp WEB_RESOURCE_REQUEST_IS_REDIRECT;
    public static final C2266751Dnt WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
    public static final C2266751Dnt WEB_VIEW_RENDERER_TERMINATE;

    /* JADX WARN: Type inference failed for: r0v37, types: [X.1Dns] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.1Dno] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.1Dnu] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1Dnq] */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r1v21, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r1v23, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v25, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v26, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v27, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v28, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v29, types: [X.1Dnv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v30, types: [X.1Dnq] */
    /* JADX WARN: Type inference failed for: r1v31, types: [X.1Dnq] */
    /* JADX WARN: Type inference failed for: r1v32, types: [X.1Dnt] */
    /* JADX WARN: Type inference failed for: r1v33, types: [X.1Dnt] */
    /* JADX WARN: Type inference failed for: r1v34, types: [X.1Dnt] */
    /* JADX WARN: Type inference failed for: r1v36, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v38, types: [X.1Dnt] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r1v40, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v42, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v43, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v44, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v45, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v46, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.1Dnr] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.1Dnp] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.1Dnw] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.1Dnw] */
    static {
        final String str = "VISUAL_STATE_CALLBACK";
        VISUAL_STATE_CALLBACK = new AbstractC2266681Dnm(str, str) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str2 = "OFF_SCREEN_PRERASTER";
        OFF_SCREEN_PRERASTER = new AbstractC2266681Dnm(str2, str2) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str3 = "SAFE_BROWSING_ENABLE";
        SAFE_BROWSING_ENABLE = new AbstractC2266681Dnm(str3, str3) { // from class: X.1Dnq
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 26;
            }
        };
        final String str4 = "DISABLED_ACTION_MODE_MENU_ITEMS";
        DISABLED_ACTION_MODE_MENU_ITEMS = new AbstractC2266681Dnm(str4, str4) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str5 = "START_SAFE_BROWSING";
        START_SAFE_BROWSING = new AbstractC2266681Dnm(str5, str5) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str6 = WebViewFeature.SAFE_BROWSING_WHITELIST;
        SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED = new AbstractC2266681Dnm(str6, str6) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str7 = "SAFE_BROWSING_ALLOWLIST";
        SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED = new AbstractC2266681Dnm(str6, str7) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED = new AbstractC2266681Dnm(str7, str6) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED = new AbstractC2266681Dnm(str7, str7) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str8 = "SAFE_BROWSING_PRIVACY_POLICY_URL";
        SAFE_BROWSING_PRIVACY_POLICY_URL = new AbstractC2266681Dnm(str8, str8) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str9 = "SERVICE_WORKER_BASIC_USAGE";
        SERVICE_WORKER_BASIC_USAGE = new AbstractC2266681Dnm(str9, str9) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str10 = "SERVICE_WORKER_CACHE_MODE";
        SERVICE_WORKER_CACHE_MODE = new AbstractC2266681Dnm(str10, str10) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str11 = "SERVICE_WORKER_CONTENT_ACCESS";
        SERVICE_WORKER_CONTENT_ACCESS = new AbstractC2266681Dnm(str11, str11) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str12 = "SERVICE_WORKER_FILE_ACCESS";
        SERVICE_WORKER_FILE_ACCESS = new AbstractC2266681Dnm(str12, str12) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str13 = "SERVICE_WORKER_BLOCK_NETWORK_LOADS";
        SERVICE_WORKER_BLOCK_NETWORK_LOADS = new AbstractC2266681Dnm(str13, str13) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str14 = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST";
        SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST = new AbstractC2266681Dnm(str14, str14) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str15 = "RECEIVE_WEB_RESOURCE_ERROR";
        RECEIVE_WEB_RESOURCE_ERROR = new AbstractC2266681Dnm(str15, str15) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str16 = "RECEIVE_HTTP_ERROR";
        RECEIVE_HTTP_ERROR = new AbstractC2266681Dnm(str16, str16) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str17 = "SHOULD_OVERRIDE_WITH_REDIRECTS";
        SHOULD_OVERRIDE_WITH_REDIRECTS = new AbstractC2266681Dnm(str17, str17) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str18 = "SAFE_BROWSING_HIT";
        SAFE_BROWSING_HIT = new AbstractC2266681Dnm(str18, str18) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str19 = "WEB_RESOURCE_REQUEST_IS_REDIRECT";
        WEB_RESOURCE_REQUEST_IS_REDIRECT = new AbstractC2266681Dnm(str19, str19) { // from class: X.1Dnp
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 24;
            }
        };
        final String str20 = "WEB_RESOURCE_ERROR_GET_DESCRIPTION";
        WEB_RESOURCE_ERROR_GET_DESCRIPTION = new AbstractC2266681Dnm(str20, str20) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str21 = "WEB_RESOURCE_ERROR_GET_CODE";
        WEB_RESOURCE_ERROR_GET_CODE = new AbstractC2266681Dnm(str21, str21) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str22 = "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY";
        SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY = new AbstractC2266681Dnm(str22, str22) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str23 = "SAFE_BROWSING_RESPONSE_PROCEED";
        SAFE_BROWSING_RESPONSE_PROCEED = new AbstractC2266681Dnm(str23, str23) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str24 = "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL";
        SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = new AbstractC2266681Dnm(str24, str24) { // from class: X.1Dnr
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 27;
            }
        };
        final String str25 = "WEB_MESSAGE_PORT_POST_MESSAGE";
        WEB_MESSAGE_PORT_POST_MESSAGE = new AbstractC2266681Dnm(str25, str25) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str26 = "WEB_MESSAGE_PORT_CLOSE";
        WEB_MESSAGE_PORT_CLOSE = new AbstractC2266681Dnm(str26, str26) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str27 = "WEB_MESSAGE_GET_MESSAGE_PAYLOAD";
        WEB_MESSAGE_GET_MESSAGE_PAYLOAD = new AbstractC2266681Dnm(str27, str27) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str28 = "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK";
        WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK = new AbstractC2266681Dnm(str28, str28) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str29 = "CREATE_WEB_MESSAGE_CHANNEL";
        CREATE_WEB_MESSAGE_CHANNEL = new AbstractC2266681Dnm(str29, str29) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str30 = "POST_WEB_MESSAGE";
        POST_WEB_MESSAGE = new AbstractC2266681Dnm(str30, str30) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str31 = "WEB_MESSAGE_CALLBACK_ON_MESSAGE";
        WEB_MESSAGE_CALLBACK_ON_MESSAGE = new AbstractC2266681Dnm(str31, str31) { // from class: X.1Dnv
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return true;
            }
        };
        final String str32 = "GET_WEB_VIEW_CLIENT";
        GET_WEB_VIEW_CLIENT = new AbstractC2266681Dnm(str32, str32) { // from class: X.1Dnq
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 26;
            }
        };
        final String str33 = "GET_WEB_CHROME_CLIENT";
        GET_WEB_CHROME_CLIENT = new AbstractC2266681Dnm(str33, str33) { // from class: X.1Dnq
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 26;
            }
        };
        final String str34 = "GET_WEB_VIEW_RENDERER";
        GET_WEB_VIEW_RENDERER = new AbstractC2266681Dnm(str34, str34) { // from class: X.1Dnt
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 29;
            }
        };
        final String str35 = "WEB_VIEW_RENDERER_TERMINATE";
        WEB_VIEW_RENDERER_TERMINATE = new AbstractC2266681Dnm(str35, str35) { // from class: X.1Dnt
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 29;
            }
        };
        TRACING_CONTROLLER_BASIC_USAGE = new AbstractC2266681Dnm() { // from class: X.1Dns
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 28;
            }
        };
        STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX = new AbstractC2266691Dnn() { // from class: X.1Dno
            @Override // X.AbstractC2266691Dnn
            public final boolean LIZ() {
                return Build.VERSION.SDK_INT >= 28;
            }
        };
        STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH = new AbstractC2266691Dnn() { // from class: X.1Dnu
            @Override // X.AbstractC2266691Dnn
            public final boolean LIZ() {
                return false;
            }
        };
        final String str36 = "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE";
        WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE = new AbstractC2266681Dnm(str36, str36) { // from class: X.1Dnt
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 29;
            }
        };
        ALGORITHMIC_DARKENING = new C2114408Qc() { // from class: X.08Qb
            public final Pattern LIZLLL = PatternProtector.compile("\\A\\d+");

            @Override // X.AbstractC2266681Dnm
            public final boolean LIZJ() {
                int i;
                PackageInfo packageInfoLIZIZ;
                boolean zLIZJ = super.LIZJ();
                if (!zLIZJ || (i = Build.VERSION.SDK_INT) >= 29) {
                    return zLIZJ;
                }
                int i2 = C08QZ.LIZ;
                if (i >= 26) {
                    packageInfoLIZIZ = C800500Vai.LIZ();
                } else {
                    try {
                        packageInfoLIZIZ = C08QZ.LIZIZ();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        TryCatchGuardChecker.doCheck(e);
                        packageInfoLIZIZ = null;
                    }
                }
                if (packageInfoLIZIZ == null) {
                    return false;
                }
                Matcher matcher = this.LIZLLL.matcher(packageInfoLIZIZ.versionName);
                return matcher.find() && CastIntegerProtector.parseInt(packageInfoLIZIZ.versionName.substring(matcher.start(), matcher.end())) >= 105;
            }
        };
        final String str37 = "PROXY_OVERRIDE";
        final String str38 = "PROXY_OVERRIDE:3";
        PROXY_OVERRIDE = new AbstractC2266681Dnm(str37, str38) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str39 = "SUPPRESS_ERROR_PAGE";
        SUPPRESS_ERROR_PAGE = new AbstractC2266681Dnm(str39, str39) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str40 = "MULTI_PROCESS";
        final String str41 = "MULTI_PROCESS_QUERY";
        MULTI_PROCESS = new AbstractC2266681Dnm(str40, str41) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str42 = "FORCE_DARK";
        FORCE_DARK = new AbstractC2266681Dnm(str42, str42) { // from class: X.1Dnt
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return Build.VERSION.SDK_INT >= 29;
            }
        };
        final String str43 = "FORCE_DARK_STRATEGY";
        final String str44 = "FORCE_DARK_BEHAVIOR";
        FORCE_DARK_STRATEGY = new AbstractC2266681Dnm(str43, str44) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str45 = "WEB_MESSAGE_LISTENER";
        WEB_MESSAGE_LISTENER = new AbstractC2266681Dnm(str45, str45) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str46 = "DOCUMENT_START_SCRIPT";
        final String str47 = "DOCUMENT_START_SCRIPT:1";
        DOCUMENT_START_SCRIPT = new AbstractC2266681Dnm(str46, str47) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str48 = "PROXY_OVERRIDE_REVERSE_BYPASS";
        PROXY_OVERRIDE_REVERSE_BYPASS = new AbstractC2266681Dnm(str48, str48) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str49 = "GET_VARIATIONS_HEADER";
        GET_VARIATIONS_HEADER = new AbstractC2266681Dnm(str49, str49) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str50 = "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY";
        ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY = new AbstractC2266681Dnm(str50, str50) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str51 = "GET_COOKIE_INFO";
        GET_COOKIE_INFO = new AbstractC2266681Dnm(str51, str51) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
        final String str52 = "REQUESTED_WITH_HEADER_ALLOW_LIST";
        REQUESTED_WITH_HEADER_ALLOW_LIST = new AbstractC2266681Dnm(str52, str52) { // from class: X.1Dnw
            @Override // X.AbstractC2266681Dnm
            public final boolean LIZIZ() {
                return false;
            }
        };
    }

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean isSupported(String str) {
        return isSupported(str, Collections.unmodifiableSet(AbstractC2266681Dnm.LIZJ));
    }

    public static boolean isStartupFeatureSupported(String str, Context context) {
        return isStartupFeatureSupported(str, Collections.unmodifiableSet(AbstractC2266691Dnn.LIZJ), context);
    }

    public static <T extends InterfaceC2266791Dnx> boolean isSupported(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t : collection) {
            if (t.LIZ().equals(str)) {
                hashSet.add(t);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC2266791Dnx) it2.next()).isSupported()) {
                    return true;
                }
            }
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown feature ");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean isStartupFeatureSupported(String str, Collection<AbstractC2266691Dnn> collection, Context context) {
        Bundle bundle;
        int i;
        HashSet<AbstractC2266691Dnn> hashSet = new HashSet();
        for (AbstractC2266691Dnn abstractC2266691Dnn : collection) {
            if (abstractC2266691Dnn.LIZ.equals(str)) {
                hashSet.add(abstractC2266691Dnn);
            }
        }
        if (!hashSet.isEmpty()) {
            for (AbstractC2266691Dnn abstractC2266691Dnn2 : hashSet) {
                if (!abstractC2266691Dnn2.LIZ()) {
                    PackageInfo packageInfoLIZ = C08QZ.LIZ(context);
                    if (packageInfoLIZ != null) {
                        ComponentName componentName = new ComponentName(packageInfoLIZ.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 33) {
                            try {
                                bundle = C20025313Wx.LIZ(context.getPackageManager(), componentName, C20025313Wx.LIZIZ(640L)).metaData;
                                if (bundle == null || !bundle.containsKey(abstractC2266691Dnn2.LIZIZ)) {
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            if (i2 >= 24) {
                                i = 640;
                            } else {
                                i = 128;
                            }
                            try {
                                bundle = context.getPackageManager().getServiceInfo(componentName, i).metaData;
                                if (bundle == null) {
                                    continue;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown feature ");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
