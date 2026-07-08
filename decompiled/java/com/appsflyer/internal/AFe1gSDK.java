package com.appsflyer.internal;

import X.C01GW;
import X.C09AY;
import X.C1697810uHb;
import X.C1954807lC;
import X.C452501pT;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes31.dex */
public final class AFe1gSDK {
    public static AFe1kSDK e;
    public final AFd1sSDK valueOf;
    public final AFd1qSDK values;
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    public static String AFInAppEventType = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String AFInAppEventParameterName = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    public static final List<String> d = C1697810uHb.LJIIJJI("googleplay", "playstore", "googleplaystore");
    public final C01GW registerClient = C452501pT.LIZIZ(new AnonymousClass3());
    public final C01GW AFKeystoreWrapper = C452501pT.LIZIZ(new AnonymousClass5());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1gSDK$3, reason: invalid class name */
    public final class AnonymousClass3 extends C09AY implements Function0<String> {
        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[PHI: r1
          0x004d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:12:0x0041, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke() {
            /*
                r4 = this;
                com.appsflyer.internal.AFe1gSDK r0 = com.appsflyer.internal.AFe1gSDK.this
                com.appsflyer.internal.AFd1qSDK r1 = com.appsflyer.internal.AFe1gSDK.valueOf(r0)
                com.appsflyer.internal.AFe1gSDK r0 = com.appsflyer.internal.AFe1gSDK.this
                com.appsflyer.internal.AFd1sSDK r0 = com.appsflyer.internal.AFe1gSDK.values(r0)
                java.lang.String r0 = r0.d()
                java.lang.String r1 = com.appsflyer.internal.AFb1vSDK.AFKeystoreWrapper(r1, r0)
                if (r1 == 0) goto L4f
                boolean r0 = kotlin.text.a0.LJJJIL(r1)
                if (r0 != 0) goto L4f
                r0 = 0
            L1d:
                java.lang.String r3 = ""
                if (r0 != 0) goto L41
                java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r1)
                java.lang.String r2 = r0.toString()
                java.util.List r1 = com.appsflyer.internal.AFe1gSDK.AFa1zSDK.AFInAppEventParameterName()
                java.util.Locale r0 = java.util.Locale.getDefault()
                java.lang.String r0 = r2.toLowerCase(r0)
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4c
                java.lang.String r0 = "-"
                java.lang.String r1 = r0.concat(r2)
            L41:
                if (r1 != 0) goto L4d
            L43:
                java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r3)
                java.lang.String r0 = r0.toString()
                return r0
            L4c:
                r1 = r3
            L4d:
                r3 = r1
                goto L43
            L4f:
                r0 = 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1gSDK.AnonymousClass3.invoke():java.lang.String");
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1gSDK$5, reason: invalid class name */
    public final class AnonymousClass5 extends C09AY implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFe1gSDK.valueOf(AFe1gSDK.this.valueOf.valueOf.AFKeystoreWrapper.getPackageName(), AFe1gSDK.AFKeystoreWrapper(AFe1gSDK.this));
        }
    }

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFInAppEventType;

        static {
            int[] iArr = new int[AFe1eSDK.values().length];
            iArr[AFe1eSDK.DEFAULT.ordinal()] = 1;
            iArr[AFe1eSDK.API.ordinal()] = 2;
            iArr[AFe1eSDK.RC.ordinal()] = 3;
            AFInAppEventType = iArr;
        }
    }

    public static final void valueOf(AFe1kSDK aFe1kSDK) {
        AFa1zSDK.AFInAppEventParameterName(aFe1kSDK);
    }

    public static final class AFa1zSDK {
        public AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static List<String> AFInAppEventParameterName() {
            return AFe1gSDK.d;
        }

        public static void AFInAppEventParameterName(AFe1kSDK aFe1kSDK) {
            AFe1gSDK.e = aFe1kSDK;
        }
    }

    public static boolean valueOf() {
        return e == null;
    }

    public final String AFInAppEventParameterName() {
        String str;
        int i = AFa1ySDK.AFInAppEventType[(valueOf() ? AFe1eSDK.DEFAULT : AFe1eSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFe1kSDK aFe1kSDK = e;
            return (aFe1kSDK == null || (str = aFe1kSDK.values) == null) ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        throw new C1954807lC();
    }

    public final String AFInAppEventType() {
        String str;
        int i = AFa1ySDK.AFInAppEventType[(valueOf() ? AFe1eSDK.DEFAULT : AFe1eSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.AFKeystoreWrapper.getValue();
        }
        if (i == 2) {
            AFe1kSDK aFe1kSDK = e;
            return (aFe1kSDK == null || (str = aFe1kSDK.valueOf) == null) ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        throw new C1954807lC();
    }

    public static final /* synthetic */ String AFKeystoreWrapper(AFe1gSDK aFe1gSDK) {
        return (String) aFe1gSDK.registerClient.getValue();
    }

    public AFe1gSDK(AFd1sSDK aFd1sSDK, AFd1qSDK aFd1qSDK) {
        this.valueOf = aFd1sSDK;
        this.values = aFd1qSDK;
    }

    public static final /* synthetic */ String valueOf(String str, String str2) {
        return new Regex("[^\\w]+").replace(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest((str + str2).getBytes(Charsets.UTF_8)), 2).toLowerCase(Locale.ROOT), "").substring(0, 6) + '-';
    }
}
