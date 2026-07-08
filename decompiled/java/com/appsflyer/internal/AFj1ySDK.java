package com.appsflyer.internal;

import X.C098200Yq;
import X.C09AY;
import X.C13IQ;
import X.C13LE;
import X.C13LQ;
import X.C155000ia;
import X.C189200o6;
import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ConcurrentModificationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public final class AFj1ySDK {
    public final Intent AFInAppEventParameterName;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1ySDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends C09AY implements Function0 {
        public /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.getParcelableExtra(this.$valueOf);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1ySDK$2, reason: invalid class name */
    public final class AnonymousClass2 extends C09AY implements Function0<String> {
        public /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return INVOKEVIRTUAL_com_appsflyer_internal_AFj1ySDK$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(AFj1ySDK.this.AFInAppEventParameterName, this.$valueOf);
        }

        public static String INVOKEVIRTUAL_com_appsflyer_internal_AFj1ySDK$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1ySDK$3, reason: invalid class name */
    public final class AnonymousClass3 extends C09AY implements Function0<Boolean> {
        public /* synthetic */ String $AFInAppEventParameterName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$AFInAppEventParameterName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1ySDK.this.AFInAppEventParameterName.hasExtra(this.$AFInAppEventParameterName));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1ySDK$5, reason: invalid class name */
    public final class AnonymousClass5 extends C09AY implements Function0<Intent> {
        public /* synthetic */ long $AFKeystoreWrapper;
        public /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, long j) {
            super(0);
            this.$values = str;
            this.$AFKeystoreWrapper = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.putExtra(this.$values, this.$AFKeystoreWrapper);
        }
    }

    public AFj1ySDK(Intent intent) {
        this.AFInAppEventParameterName = intent;
    }

    public final String AFInAppEventParameterName(String str) {
        return (String) AFInAppEventParameterName(new AnonymousClass2(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final boolean values(String str) {
        Boolean bool = (Boolean) AFInAppEventParameterName(new AnonymousClass3(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Intent AFInAppEventParameterName(String str, long j) {
        return (Intent) AFInAppEventParameterName(new AnonymousClass5(str, j), "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final <T> T AFInAppEventParameterName(Function0<? extends T> function0, String str, T t, boolean z) {
        T c098200Yq;
        boolean z2;
        synchronized (this.AFInAppEventParameterName) {
            try {
                try {
                    c098200Yq = function0.invoke();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = (T) new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                boolean z3 = true;
                C13IQ[] c13iqArr = {C13LE.LIZ(ConcurrentModificationException.class), C13LE.LIZ(ArrayIndexOutOfBoundsException.class)};
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    try {
                        if (C13LQ.LJJIJIIJI(C13LE.LIZ(thM5exceptionOrNullimpl.getClass()), c13iqArr) < 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (!z) {
                                AFLogger.afErrorLog(str, thM5exceptionOrNullimpl, false, false);
                                c098200Yq = t;
                            } else {
                                c098200Yq = AFInAppEventParameterName(function0, str, t, false);
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } else {
                            throw thM5exceptionOrNullimpl;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                C13IQ[] c13iqArr2 = {C13LE.LIZ(RuntimeException.class)};
                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl2 != null) {
                    try {
                        if (C13LQ.LJJIJIIJI(C13LE.LIZ(thM5exceptionOrNullimpl2.getClass()), c13iqArr2) < 0) {
                            z3 = false;
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        t = (T) new C098200Yq(th3);
                        C189200o6.m2constructorimpl(t);
                    }
                    if (z3) {
                        AFLogger.afErrorLog(str, thM5exceptionOrNullimpl2, false, false);
                        C189200o6.m2constructorimpl(t);
                        c098200Yq = t;
                    } else {
                        throw thM5exceptionOrNullimpl2;
                    }
                }
                C155000ia.LIZIZ(c098200Yq);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
        return (T) c098200Yq;
    }
}
