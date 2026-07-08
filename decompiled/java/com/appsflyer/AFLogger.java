package com.appsflyer;

import X.C01GW;
import X.C08FF;
import X.C09AY;
import X.C13LQ;
import X.C19719612Di;
import X.C1C7U;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.RunnableC20120813o6;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.internal.AFg1fSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class AFLogger extends AFg1fSDK {
    public static final AFLogger INSTANCE = new AFLogger();
    public static final C01GW valueOf = C452501pT.LIZIZ(AnonymousClass10.values);
    public static final C01GW AFInAppEventType = C452501pT.LIZIZ(AnonymousClass1.AFKeystoreWrapper);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$10, reason: invalid class name */
    public static final class AnonymousClass10 extends C09AY implements Function0<Set<AFg1fSDK>> {
        public static final AnonymousClass10 values = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1fSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    public static /* synthetic */ void lambda$semisugar$AFInAppEventType$0(AFg1fSDK[] aFg1fSDKArr) {
        C1C7U.LIZ("AFLogger@8190.registerClient$1L");
        AFInAppEventType(aFg1fSDKArr);
        C1C7U.LIZIZ("AFLogger@8190.registerClient$1L");
    }

    public static /* synthetic */ void lambda$semisugar$AFInAppEventType$1(Function1 function1) {
        C1C7U.LIZ("AFLogger@8190.force$1L");
        AFInAppEventType(function1);
        C1C7U.LIZIZ("AFLogger@8190.force$1L");
    }

    public static /* synthetic */ void lambda$semisugar$valueOf$0(AFg1fSDK[] aFg1fSDKArr) {
        C1C7U.LIZ("AFLogger@8190.unregisterClient$1L");
        valueOf(aFg1fSDKArr);
        C1C7U.LIZIZ("AFLogger@8190.unregisterClient$1L");
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    public static final class AnonymousClass1 extends C09AY implements Function0<ExecutorService> {
        public static final AnonymousClass1 AFKeystoreWrapper = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return C786410Ut5.h4();
        }
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        public final int values;

        public static LogLevel valueOf(String str) {
            return (LogLevel) C08FF.LIZ(LogLevel.class, str);
        }

        public final int getLevel() {
            return this.values;
        }

        LogLevel(int i) {
            this.values = i;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    public final class AnonymousClass2 extends C09AY implements Function1<AFg1fSDK, Unit> {
        public /* synthetic */ boolean $AFInAppEventType;
        public /* synthetic */ String $AFKeystoreWrapper;
        public /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1aSDK aFg1aSDK, String str, boolean z) {
            super(1);
            this.$values = aFg1aSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventType = z;
        }

        public final void AFInAppEventType(AFg1fSDK aFg1fSDK) {
            aFg1fSDK.i(this.$values, this.$AFKeystoreWrapper, this.$AFInAppEventType);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
            AFInAppEventType(aFg1fSDK);
            return Unit.LIZ;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    public final class AnonymousClass3 extends C09AY implements Function1<AFg1fSDK, Unit> {
        public /* synthetic */ boolean $AFInAppEventParameterName;
        public /* synthetic */ boolean $AFInAppEventType;
        public /* synthetic */ Throwable $AFKeystoreWrapper;
        public /* synthetic */ boolean $AFLogger;
        public /* synthetic */ boolean $e;
        public /* synthetic */ String $valueOf;
        public /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
            super(1);
            this.$values = aFg1aSDK;
            this.$valueOf = str;
            this.$AFKeystoreWrapper = th;
            this.$AFInAppEventParameterName = z;
            this.$AFInAppEventType = z2;
            this.$AFLogger = z3;
            this.$e = z4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
            valueOf(aFg1fSDK);
            return Unit.LIZ;
        }

        public final void valueOf(AFg1fSDK aFg1fSDK) {
            aFg1fSDK.e(this.$values, this.$valueOf, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$AFLogger, this.$e);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    public final class AnonymousClass4 extends C09AY implements Function1<AFg1fSDK, Unit> {
        public /* synthetic */ AFg1aSDK $AFKeystoreWrapper;
        public /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1aSDK aFg1aSDK, String str) {
            super(1);
            this.$AFKeystoreWrapper = aFg1aSDK;
            this.$values = str;
        }

        public final void AFKeystoreWrapper(AFg1fSDK aFg1fSDK) {
            aFg1fSDK.force(this.$AFKeystoreWrapper, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
            AFKeystoreWrapper(aFg1fSDK);
            return Unit.LIZ;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    public final class AnonymousClass5 extends C09AY implements Function1<AFg1fSDK, Unit> {
        public /* synthetic */ boolean $AFInAppEventParameterName;
        public /* synthetic */ AFg1aSDK $AFKeystoreWrapper;
        public /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AFg1aSDK aFg1aSDK, String str, boolean z) {
            super(1);
            this.$AFKeystoreWrapper = aFg1aSDK;
            this.$valueOf = str;
            this.$AFInAppEventParameterName = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
            valueOf(aFg1fSDK);
            return Unit.LIZ;
        }

        public final void valueOf(AFg1fSDK aFg1fSDK) {
            aFg1fSDK.d(this.$AFKeystoreWrapper, this.$valueOf, this.$AFInAppEventParameterName);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    public final class AnonymousClass7 extends C09AY implements Function1<AFg1fSDK, Unit> {
        public /* synthetic */ AFg1aSDK $AFInAppEventParameterName;
        public /* synthetic */ String $AFInAppEventType;
        public /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AFg1aSDK aFg1aSDK, String str, boolean z) {
            super(1);
            this.$AFInAppEventParameterName = aFg1aSDK;
            this.$AFInAppEventType = str;
            this.$values = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
            valueOf(aFg1fSDK);
            return Unit.LIZ;
        }

        public final void valueOf(AFg1fSDK aFg1fSDK) {
            aFg1fSDK.v(this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$values);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    public final class AnonymousClass9 extends C09AY implements Function1<AFg1fSDK, Unit> {
        public /* synthetic */ boolean $AFInAppEventParameterName;
        public /* synthetic */ String $AFKeystoreWrapper;
        public /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1aSDK aFg1aSDK, String str, boolean z) {
            super(1);
            this.$values = aFg1aSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventParameterName = z;
        }

        public final void AFInAppEventParameterName(AFg1fSDK aFg1fSDK) {
            aFg1fSDK.w(this.$values, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
            AFInAppEventParameterName(aFg1fSDK);
            return Unit.LIZ;
        }
    }

    public static final void AFInAppEventType(Function1 function1) {
        C01GW c01gw = valueOf;
        synchronized (c01gw.getValue()) {
            try {
                Iterator it2 = ((Set) c01gw.getValue()).iterator();
                while (it2.hasNext()) {
                    function1.invoke((AFg1fSDK) it2.next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @InterfaceC1294060jmO
    public static final void afDebugLog(String str) {
        INSTANCE.d(AFg1aSDK.OTHER, str, true);
    }

    @InterfaceC1294060jmO
    public static final void afInfoLog(String str) {
        INSTANCE.i(AFg1aSDK.OTHER, str, true);
    }

    @InterfaceC1294060jmO
    public static final void afLogForce(String str) {
        INSTANCE.force(AFg1aSDK.OTHER, str);
    }

    @InterfaceC1294060jmO
    public static final void afRDLog(String str) {
        INSTANCE.v(AFg1aSDK.OTHER, str, true);
    }

    @InterfaceC1294060jmO
    public static final void afVerboseLog(String str) {
        INSTANCE.v(AFg1aSDK.OTHER, str, false);
    }

    @InterfaceC1294060jmO
    public static final void afWarnLog(String str) {
        AFg1fSDK.w$default(INSTANCE, AFg1aSDK.OTHER, str, false, 4, null);
    }

    public static final void valueOf(AFg1fSDK[] aFg1fSDKArr) {
        C01GW c01gw = valueOf;
        synchronized (c01gw.getValue()) {
            try {
                ((Set) c01gw.getValue()).removeAll(C13LQ.LJLIIL(aFg1fSDKArr));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void registerClient(final AFg1fSDK... aFg1fSDKArr) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new Runnable() { // from class: X.13o1
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.lambda$semisugar$AFInAppEventType$0(aFg1fSDKArr);
            }
        });
    }

    public final void unregisterClient(final AFg1fSDK... aFg1fSDKArr) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new Runnable() { // from class: X.13o0
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.lambda$semisugar$valueOf$0(aFg1fSDKArr);
            }
        });
    }

    public static final void AFInAppEventType(AFg1fSDK[] aFg1fSDKArr) {
        C01GW c01gw = valueOf;
        synchronized (c01gw.getValue()) {
            try {
                C19719612Di.LJJII((Set) c01gw.getValue(), aFg1fSDKArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @InterfaceC1294060jmO
    public static final void afDebugLog(String str, boolean z) {
        INSTANCE.d(AFg1aSDK.OTHER, str, z);
    }

    @InterfaceC1294060jmO
    public static final void afErrorLog(String str, Throwable th) {
        Throwable nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str2 == null || a0.LJJJIL(str2)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, nullPointerException, false, false, false, false, 120, null);
    }

    @InterfaceC1294060jmO
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th) {
        Throwable nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str2 == null || a0.LJJJIL(str2)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, nullPointerException, false, false, true, false, 64, null);
    }

    @InterfaceC1294060jmO
    public static final void afInfoLog(String str, boolean z) {
        INSTANCE.i(AFg1aSDK.OTHER, str, z);
    }

    @InterfaceC1294060jmO
    public static final void afWarnLog(String str, boolean z) {
        INSTANCE.w(AFg1aSDK.OTHER, str, z);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(AFg1aSDK aFg1aSDK, String str) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new RunnableC20120813o6(new AnonymousClass4(aFg1aSDK, str)));
    }

    @InterfaceC1294060jmO
    public static final void afErrorLog(String str, Throwable th, boolean z) {
        Throwable nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str2 == null || a0.LJJJIL(str2)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, nullPointerException, false, z, false, false, 104, null);
    }

    @InterfaceC1294060jmO
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z) {
        Throwable nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str2 == null || a0.LJJJIL(str2)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, nullPointerException, false, false, !z, false, 64, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(AFg1aSDK aFg1aSDK, String str, boolean z) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new RunnableC20120813o6(new AnonymousClass5(aFg1aSDK, str, z)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(AFg1aSDK aFg1aSDK, String str, boolean z) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new RunnableC20120813o6(new AnonymousClass2(aFg1aSDK, str, z)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(AFg1aSDK aFg1aSDK, String str, boolean z) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new RunnableC20120813o6(new AnonymousClass7(aFg1aSDK, str, z)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(AFg1aSDK aFg1aSDK, String str, boolean z) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new RunnableC20120813o6(new AnonymousClass9(aFg1aSDK, str, z)));
    }

    @InterfaceC1294060jmO
    public static final void afErrorLog(String str, Throwable th, boolean z, boolean z2) {
        Throwable nullPointerException = th;
        String str2 = str;
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str2 == null || a0.LJJJIL(str2)) {
            str2 = "null";
        }
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, nullPointerException, false, z, z2, false, 72, null);
    }

    @InterfaceC1294060jmO
    public static final void afErrorLog(String str, Throwable th, boolean z, boolean z2, boolean z3) {
        AFg1fSDK.e$default(INSTANCE, AFg1aSDK.OTHER, str, th, z, z2, z3, false, 64, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        ((ExecutorService) AFInAppEventType.getValue()).execute(new RunnableC20120813o6(new AnonymousClass3(aFg1aSDK, str, th, z, z2, z3, z4)));
    }
}
