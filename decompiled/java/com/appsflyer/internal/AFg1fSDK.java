package com.appsflyer.internal;

import X.C786410Ut5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFg1fSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    public static long values = System.currentTimeMillis();
    public final boolean AFInAppEventParameterName;

    public static final class AFa1tSDK {
        public AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void d(AFg1aSDK aFg1aSDK, String str) {
        d$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void d(AFg1aSDK aFg1aSDK, String str, boolean z) {
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th) {
        e$default(this, aFg1aSDK, str, th, false, false, false, false, 120, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z) {
        e$default(this, aFg1aSDK, str, th, z, false, false, false, 112, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2) {
        e$default(this, aFg1aSDK, str, th, z, z2, false, false, 96, null);
    }

    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3) {
        e$default(this, aFg1aSDK, str, th, z, z2, z3, false, 64, null);
    }

    public void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public void force(AFg1aSDK aFg1aSDK, String str) {
    }

    public final void i(AFg1aSDK aFg1aSDK, String str) {
        i$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void i(AFg1aSDK aFg1aSDK, String str, boolean z) {
    }

    public final void v(AFg1aSDK aFg1aSDK, String str) {
        v$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void v(AFg1aSDK aFg1aSDK, String str, boolean z) {
    }

    public final void w(AFg1aSDK aFg1aSDK, String str) {
        w$default(this, aFg1aSDK, str, false, 4, null);
    }

    public void w(AFg1aSDK aFg1aSDK, String str, boolean z) {
    }

    public boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    public final String values(String str, AFg1aSDK aFg1aSDK) {
        if (str == null || a0.LJJJIL(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1aSDK);
        if (getShouldExtendMsg()) {
            return e3.h + (System.currentTimeMillis() - values) + ") [" + C786410Ut5.u3().getName() + "] " + strWithTag$SDK_prodRelease;
        }
        return strWithTag$SDK_prodRelease;
    }

    public final String withTag$SDK_prodRelease(String str, AFg1aSDK aFg1aSDK) {
        return e3.e + aFg1aSDK.AFInAppEventParameterName + "] " + str;
    }

    public static /* synthetic */ void d$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1fSDK.d(aFg1aSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void i$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1fSDK.i(aFg1aSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void v$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1fSDK.v(aFg1aSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void w$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1fSDK.w(aFg1aSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void e$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = true;
            }
            if ((i & 16) != 0) {
                z2 = true;
            }
            if ((i & 32) != 0) {
                z3 = true;
            }
            if ((i & 64) != 0) {
                z4 = true;
            }
            aFg1fSDK.e(aFg1aSDK, str, th, z, z2, z3, z4);
            return;
        }
        throw new UnsupportedOperationException();
    }
}
