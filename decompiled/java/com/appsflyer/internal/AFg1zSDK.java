package com.appsflyer.internal;

import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C189200o6;
import X.C452501pT;
import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1zSDK {
    public final AFg1xSDK AFInAppEventParameterName;
    public final AFd1sSDK AFKeystoreWrapper;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static final long AFInAppEventType = TimeUnit.HOURS.toSeconds(24);
    public final C01GW values = C452501pT.LIZIZ(new AnonymousClass3());
    public final C01GW valueOf = C452501pT.LIZIZ(new AnonymousClass1());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1zSDK$1, reason: invalid class name */
    public final class AnonymousClass1 extends C09AY implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.staging")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1zSDK$3, reason: invalid class name */
    public final class AnonymousClass3 extends C09AY implements Function0<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1zSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.sandbox")));
        }
    }

    public static final class AFa1ySDK {
        public AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean AFInAppEventParameterName() {
        AFh1hSDK aFh1hSDK;
        AFi1zSDK aFi1zSDK = this.AFInAppEventParameterName.valueOf;
        if (aFi1zSDK == null) {
            AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1gSDK aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
        boolean zAFInAppEventParameterName = (aFh1gSDK == null || (aFh1hSDK = aFh1gSDK.AFInAppEventType) == null) ? false : aFh1hSDK.AFInAppEventParameterName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFg1xSDK aFg1xSDK = this.AFInAppEventParameterName;
        return zAFInAppEventParameterName || jCurrentTimeMillis - aFg1xSDK.AFInAppEventType > TimeUnit.SECONDS.toMillis(aFg1xSDK.AFInAppEventParameterName);
    }

    public final long AFInAppEventType() {
        Object c098200Yq;
        String strAFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (strAFInAppEventType == null) {
            return AFInAppEventType;
        }
        try {
            c098200Yq = Long.valueOf(CastLongProtector.parseLong(strAFInAppEventType));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Long.valueOf(AFInAppEventType);
        }
        return ((Number) c098200Yq).longValue();
    }

    public final boolean AFKeystoreWrapper() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    public final boolean values() {
        return ((Boolean) this.values.getValue()).booleanValue();
    }

    public AFg1zSDK(AFd1sSDK aFd1sSDK, AFg1xSDK aFg1xSDK) {
        this.AFKeystoreWrapper = aFd1sSDK;
        this.AFInAppEventParameterName = aFg1xSDK;
    }
}
