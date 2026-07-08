package X;

import Y.ARunnableS28S1100000_23;
import android.app.Application;
import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.psp.TTMConfigSettings;
import com.tiktok.ttm.TTMCore;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213481BkA {
    public static final C2213481BkA LIZ = new C2213481BkA();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final Function2<String, JSONObject, Unit> LIZJ = C1699990uL7.LIZ;
    public static final ExecutorService LIZLLL = C786410Ut5.h4();
    public static final TTMCore.Config LJ;

    static {
        Object obj;
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        TTMCore.Config config = null;
        Context applicationContext = null;
        if (iAppContextService != null) {
            TTMCore.Config config2 = new TTMCore.Config();
            Boolean bool = TTMConfigSettings.LIZ().ttmEnable;
            Boolean bool2 = Boolean.TRUE;
            config2.globalEnable = Intrinsics.LJFF(bool, bool2);
            Integer num = TTMConfigSettings.LIZ().timeStaticConfig;
            config2.timeStaticConfig = num != null ? num.intValue() : 0;
            config2.reportEnable = Intrinsics.LJFF(TTMConfigSettings.LIZ().reportEnable, bool2);
            config2.crashDumpEnable = Intrinsics.LJFF(TTMConfigSettings.LIZ().crashDumpEnable, bool2);
            config2.multiInstCacheEnable = Intrinsics.LJFF(TTMConfigSettings.LIZ().multiInstCacheEnable, bool2);
            Integer num2 = TTMConfigSettings.LIZ().multiInstCacheMaxSize;
            config2.multiInstCacheMaxSize = num2 != null ? num2.intValue() : 30;
            Integer num3 = TTMConfigSettings.LIZ().multiInstCacheDefaultSize;
            config2.multiInstCacheDefaultSize = num3 != null ? num3.intValue() : 20;
            Integer num4 = TTMConfigSettings.LIZ().coreBuriedSamplingRate;
            config2.coreBuriedSamplingRate = num4 != null ? num4.intValue() : 100;
            Integer num5 = TTMConfigSettings.LIZ().generalBuriedSamplingRate;
            config2.generalBuriedSamplingRate = num5 != null ? num5.intValue() : LSPassThroughRecordSizeConfig.DEFAULT;
            config2.openJniCallOptimize = true;
            Boolean bool3 = TTMConfigSettings.LIZ().monitorRuleRunException;
            config2.monitorRuleRunException = bool3 != null ? bool3.booleanValue() : true;
            Context applicationContext2 = iAppContextService.getApplicationContext();
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
                try {
                    C786450Ut9.LIZJ = applicationContext2.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(objInvoke);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error: ");
                        sbLIZ.append(e.getMessage());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (!(obj instanceof Application)) {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(th.getMessage());
                        sbLIZ2.append(":");
                        sbLIZ2.append(C08RN.LIZJ());
                        sbLIZ2.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Application context obtained through ActivityThread: ");
                    sbLIZ3.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append(th.getMessage());
                    sbLIZ22.append(":");
                    sbLIZ22.append(C08RN.LIZJ());
                    sbLIZ22.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ22));
                }
                file = C786450Ut9.LIZJ;
            }
            config2.machineWorkDir = file.getAbsolutePath();
            config2.isLocalTest = Intrinsics.LJFF("local_test", iAppContextService.getChannel()) || iAppContextService.isRegressionTest();
            Boolean bool4 = TTMConfigSettings.LIZ().openCheckStateMnState;
            Boolean bool5 = Boolean.FALSE;
            config2.setCheckStateMnStateReentrancy = !Intrinsics.LJFF(bool4, bool5);
            config2.setFixMemLeakFree = !Intrinsics.LJFF(TTMConfigSettings.LIZ().openFixMemLeadFree, bool5);
            config2.openTTMMemoryPool = !Intrinsics.LJFF(TTMConfigSettings.LIZ().ttmOpenTTMMemoryPool, bool5);
            config2.openExtTransformTTMObj = !Intrinsics.LJFF(TTMConfigSettings.LIZ().ttmExtTransformTTMObj, bool5);
            config2.TTMMemorySmallPoolSize = TTMConfigSettings.LIZ().ttmMemorySmallPoolSize;
            config2.TTMMemoryBigPoolSize = TTMConfigSettings.LIZ().ttmMemoryBigPoolSize;
            config2.TTMMemorySmallMaxCacheSize = TTMConfigSettings.LIZ().ttmMemorySmallPoolMaxCacheSize;
            config2.TTMMemoryBigMaxCacheSize = TTMConfigSettings.LIZ().ttmMemoryBigPoolMaxCacheSize;
            config2.enableTTMInstanceRelease = C0C64.LJIILLIIL().LJIIIZ(31744, "ttm_open_instance_optimized", true, false);
            config2.sendAppLog = new TTMCore.SendAppLog() { // from class: X.0oqh
                @Override // com.tiktok.ttm.TTMCore.SendAppLog
                public final void sendAppLog(String str, JSONObject jSONObject) {
                    C2213481BkA.LIZLLL.execute(new ARunnableS28S1100000_23(str, jSONObject, 24));
                }
            };
            if (config2.reportEnable) {
                config2.metricReporter = new TTMCore.MetricReporter() { // from class: X.0oqg
                    @Override // com.tiktok.ttm.TTMCore.MetricReporter
                    public final void report(final String str, final String str2) {
                        C2213481BkA.LIZLLL.execute(new Runnable() { // from class: X.0oqf
                            public final void LIZ() {
                                try {
                                    if (str == null || str2 == null) {
                                        return;
                                    }
                                    int length = new JSONArray(str2).length();
                                    for (int i = 0; i < length; i++) {
                                        Function2<String, JSONObject, Unit> function2 = C2213481BkA.LIZJ;
                                        if (function2 != null) {
                                            function2.invoke(str, JSONArrayProtectorUtils.getJSONObject(new JSONArray(str2), i));
                                        }
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("TTMCoreApiInit@99fe.makeTTMCoreConfig$2$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("TTMCoreApiInit@99fe.makeTTMCoreConfig$2$1");
                            }
                        });
                    }
                };
            }
            if (config2.crashDumpEnable) {
                Npth.addUserCrashInfoCallback(new InterfaceC801650VcZ() { // from class: X.1Bk9
                    @Override // X.InterfaceC801650VcZ
                    public final Map LIZ(JSONObject jSONObject) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("ttmachine_state_dump_info", TTMCore.getInstance().dump(jSONObject.optLong("tid")));
                        return linkedHashMap;
                    }
                }, CrashType.NATIVE);
            }
            if (config2.multiInstCacheEnable) {
                LIZLLL.execute(new Runnable() { // from class: X.0IL5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TTMCoreApiInit@99fe.makeTTMCoreConfig$4");
                        try {
                            TTMCore.getInstance().prepareAsNeeded();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TTMCoreApiInit@99fe.makeTTMCoreConfig$4");
                    }
                });
            }
            config = config2;
        }
        LJ = config;
    }
}
