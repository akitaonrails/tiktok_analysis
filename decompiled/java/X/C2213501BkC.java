package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.strategycenter.TTMStrategyResult;
import com.tiktok.strategycenter.TTMStrategyRule;
import com.tiktok.ttm.TTMCore;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1BkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213501BkC implements InterfaceC1268370j6x {
    public static volatile boolean LIZ;
    public static final Object LIZIZ = new Object();

    @Override // X.InterfaceC1268370j6x
    public final /* synthetic */ boolean LJ(String str) {
        return false;
    }

    @Override // X.InterfaceC1268370j6x
    public final /* synthetic */ boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC1268370j6x
    public final /* synthetic */ C1283410jVD LJI(String str, Map map) {
        return null;
    }

    public C2213501BkC(Context context) {
        try {
            if (!LIZ) {
                synchronized (LIZIZ) {
                    try {
                        if (!LIZ) {
                            LoadSoLancet.LIZJ("TTMachineCore");
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Librarian.LJFF("TTMachineCore");
                            LoadSoLancet.LJ(jUptimeMillis, "TTMachineCore");
                            LoadSoLancet.LIZLLL(jUptimeMillis, "TTMachineCore");
                            LoadSoLancet.LIZIZ("TTMachineCore");
                            TTMCore.Config config = new TTMCore.Config();
                            config.globalEnable = true;
                            config.reportEnable = true;
                            config.crashDumpEnable = true;
                            config.multiInstCacheEnable = true;
                            config.multiInstCacheMaxSize = 30;
                            config.multiInstCacheDefaultSize = 20;
                            config.timeStaticConfig = 0;
                            config.coreBuriedSamplingRate = 100;
                            config.generalBuriedSamplingRate = LSPassThroughRecordSizeConfig.DEFAULT;
                            config.openJniCallOptimize = true;
                            config.metricReporter = new TTMCore.MetricReporter() { // from class: X.1BkM
                                @Override // com.tiktok.ttm.TTMCore.MetricReporter
                                public final void report(String str, String str2) {
                                }
                            };
                            config.machineWorkDir = LJIIIIZZ(context).getAbsolutePath();
                            TTMCore.getInstance().initTTM(config);
                            LIZ = true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static File LJIIIIZZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    @Override // X.InterfaceC1268370j6x
    public final boolean LIZ(String str) {
        try {
            return TTMStrategyCenter.getInstance().unRegisterRule("TTLHAdaptive", str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // X.InterfaceC1268370j6x
    public final byte[] LIZJ(String str) {
        try {
            return TTMCore.getInstance().processTTMRuleByteCode(str, 0L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.InterfaceC1268370j6x
    public final boolean LIZIZ(String str, String str2) {
        try {
            return TTMStrategyCenter.getInstance().registerBizCepRule("TTLHAdaptive", new TTMStrategyRule(str, str2, true));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // X.InterfaceC1268370j6x
    public final C1283410jVD LIZLLL(byte[] bArr, Map<String, Object> map) {
        TTMOutput tTMOutputRunTTMRuleWithBinData;
        try {
            TTMInput tTMInput = new TTMInput();
            tTMInput.machineCodeByte = bArr;
            tTMInput.paramData = new TTMParamData(map);
            tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
            tTMOutputRunTTMRuleWithBinData = TTMStrategyCenter.getInstance().runTTMRuleWithBinData(tTMInput);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            tTMOutputRunTTMRuleWithBinData = null;
        }
        C1283410jVD c1283410jVD = new C1283410jVD();
        if (tTMOutputRunTTMRuleWithBinData == null) {
            return null;
        }
        c1283410jVD.LJ = tTMOutputRunTTMRuleWithBinData.getMsg();
        c1283410jVD.LIZIZ = tTMOutputRunTTMRuleWithBinData.getData();
        if (tTMOutputRunTTMRuleWithBinData.getData() instanceof Map) {
            c1283410jVD.LIZJ = (Map) tTMOutputRunTTMRuleWithBinData.getData();
        } else {
            try {
                if (tTMOutputRunTTMRuleWithBinData.getData() != null) {
                    c1283410jVD.LIZLLL = CastIntegerProtector.parseInt(tTMOutputRunTTMRuleWithBinData.getData().toString());
                    return c1283410jVD;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return c1283410jVD;
            }
        }
        return c1283410jVD;
    }

    @Override // X.InterfaceC1268370j6x
    public final C1268350j6v LJII(String str, List list, Map map) {
        C1268350j6v c1268350j6v = new C1268350j6v();
        try {
            TTMStrategyResult tTMStrategyResultSyncProcessBizCepRule = TTMStrategyCenter.getInstance().syncProcessBizCepRule("TTLHAdaptive", str, new TTMParamData((Map<String, Object>) map), System.currentTimeMillis());
            c1268350j6v.LIZ = tTMStrategyResultSyncProcessBizCepRule.isSuccess();
            c1268350j6v.LIZIZ = tTMStrategyResultSyncProcessBizCepRule.getError();
            c1268350j6v.LIZJ = list;
            return c1268350j6v;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return c1268350j6v;
        }
    }
}
