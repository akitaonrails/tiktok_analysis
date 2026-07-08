package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1hSDK extends AFg1fSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);

    public static final class AFa1tSDK {
        public AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            AFKeystoreWrapper = iArr;
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    public static boolean AFInAppEventType(AFLogger.LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel()) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(AFg1aSDK aFg1aSDK, String str) {
        if (!AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            withTag$SDK_prodRelease(str, aFg1aSDK);
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(AFg1aSDK aFg1aSDK, String str, boolean z) {
        values(AFLogger.LogLevel.DEBUG, aFg1aSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(AFg1aSDK aFg1aSDK, String str, boolean z) {
        values(AFLogger.LogLevel.INFO, aFg1aSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(AFg1aSDK aFg1aSDK, String str, boolean z) {
        values(AFLogger.LogLevel.VERBOSE, aFg1aSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(AFg1aSDK aFg1aSDK, String str, boolean z) {
        values(AFLogger.LogLevel.WARNING, aFg1aSDK, str, null);
    }

    private final void values(AFLogger.LogLevel logLevel, AFg1aSDK aFg1aSDK, String str, Throwable th) {
        if (AFInAppEventType(logLevel)) {
            values(str, aFg1aSDK);
            logLevel.ordinal();
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            values(AFLogger.LogLevel.ERROR, aFg1aSDK, str, th);
        } else if (z) {
            values(AFLogger.LogLevel.DEBUG, aFg1aSDK, str, null);
        }
    }
}
