package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oW0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476100oW0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(final com.ss.ttvideoengine.DataLoaderHelper r9) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1476100oW0.LIZ(com.ss.ttvideoengine.DataLoaderHelper):boolean");
    }

    public static void LIZIZ(final DataLoaderHelper dataLoaderHelper) {
        boolean z;
        Throwable targetException;
        boolean z2;
        dataLoaderHelper.LJJ.LIZJ(2);
        try {
            if (dataLoaderHelper.LIZIZ == 0) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "DataLoader has started not need start");
                dataLoaderHelper.LJJ.LJFF(2);
                if (C790030Uyv.LIZ.LJIILL > 0) {
                    dataLoaderHelper.LJJ.LJI(1);
                    return;
                }
                return;
            }
            dataLoaderHelper.LJJL = EnumC1469720oLi.Initializing.ordinal();
            if (LIZ(dataLoaderHelper)) {
                dataLoaderHelper.LIZLLL.LIZJ = 4L;
                dataLoaderHelper.LIZJ.LIZJ = 20L;
                if (dataLoaderHelper.LJIIIZ == null) {
                    dataLoaderHelper.LJIIIZ = AVMDLDataLoaderConfigure.getDefaultonfigure();
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(C1309170kAl.LIZJ)) {
                        jSONObject.put("app_channel", C1309170kAl.LIZJ);
                    }
                    if (!TextUtils.isEmpty(C1309170kAl.LIZIZ)) {
                        jSONObject.put("app_name", C1309170kAl.LIZIZ);
                    }
                    if (!TextUtils.isEmpty(C1309170kAl.LJIIIIZZ)) {
                        jSONObject.put("device_id_secret", C1309170kAl.LJIIIIZZ);
                    }
                    if (!TextUtils.isEmpty(C1309170kAl.LJ)) {
                        jSONObject.put("device_id", C1309170kAl.LJ);
                    }
                    if (!TextUtils.isEmpty(C1309170kAl.LIZLLL)) {
                        jSONObject.put("app_version", C1309170kAl.LIZLLL);
                    }
                    int i2 = C1309170kAl.LIZ;
                    if (i2 >= 0) {
                        jSONObject.put("app_id", i2);
                    }
                    if (jSONObject.has("app_id")) {
                        dataLoaderHelper.LJIIIZ.mAppInfo = C786410Ut5.J3(jSONObject);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i3 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(e);
                }
                if (dataLoaderHelper.LJIILJJIL != null) {
                    dataLoaderHelper.LJIIIZ.mEnableReportTaskLog = 1;
                }
                if (dataLoaderHelper.LJJIJIIJI) {
                    dataLoaderHelper.LJIIIZ.mCloseLocalServer = 1;
                }
                dataLoaderHelper.LJIIIIZZ.setConfigure(dataLoaderHelper.LJIIIZ);
                if (dataLoaderHelper.LJIIIIZZ.start() >= 0) {
                    int i4 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("DataLoaderHelper", "[preload] preload strategy " + dataLoaderHelper.LJJIL);
                    if (dataLoaderHelper.LJJLIIIJJIZ < 2) {
                        if (!dataLoaderHelper.LJJLIIIJLLLLLLLZ) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        LIZJ(z2, dataLoaderHelper);
                    }
                    long longValue = dataLoaderHelper.LJIIIIZZ.getLongValue(7218);
                    dataLoaderHelper.LJIIZILJ = longValue;
                    if (longValue == -1) {
                        dataLoaderHelper.LJIJJ = true;
                    }
                    if (dataLoaderHelper.LJJIJ == 1 && dataLoaderHelper.LJIL && longValue > 0) {
                        try {
                            Class<?> clsLIZ = C1469080oKg.LIZ(200, "com.ss.ttm.player.TTPlayer");
                            Method declaredMethod = clsLIZ.getDeclaredMethod("registerNativeMdl", Long.TYPE);
                            declaredMethod.setAccessible(true);
                            if (((Integer) declaredMethod.invoke(clsLIZ, Long.valueOf(dataLoaderHelper.LJIIZILJ))).intValue() == 0) {
                                C1471660oOq.LIZJ("DataLoaderHelper", "firstNativeMDL effect");
                                dataLoaderHelper.LJIJI = true;
                                dataLoaderHelper.LJIJJ = false;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            int i5 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("DataLoaderHelper", th.toString());
                            if ((th instanceof InvocationTargetException) && (targetException = th.getTargetException()) != null) {
                                C1471660oOq.LIZIZ("DataLoaderHelper", targetException.toString());
                            }
                        }
                    }
                    if (dataLoaderHelper.LJIIIIZZ.getLongValue(9407) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dataLoaderHelper.LJJIJL = z;
                    C1471660oOq.LIZJ("DataLoaderHelper", "start: get mdlprotocolHandle: " + dataLoaderHelper.LJIIZILJ);
                    dataLoaderHelper.LJIILIIL.LIZ(dataLoaderHelper.LJIIIIZZ, dataLoaderHelper.LJJI);
                    dataLoaderHelper.LIZIZ = 0;
                    if (dataLoaderHelper.LJJLI && dataLoaderHelper.LJJL == EnumC1469720oLi.Initializing.ordinal()) {
                        dataLoaderHelper.LJJL = EnumC1469720oLi.InitializeComplete.ordinal();
                    }
                    dataLoaderHelper.LJJII = new InterfaceC790020Uyu() { // from class: X.0V1D
                        @Override // X.InterfaceC790020Uyu
                        public final void LIZ(int i6, int i7, int i8) {
                            if (i6 != 0) {
                                return;
                            }
                            int i9 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("access changed, from: ");
                            sbLIZ.append(i7);
                            sbLIZ.append(" to: ");
                            sbLIZ.append(i8);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                            DataLoaderHelper dataLoaderHelper2 = dataLoaderHelper;
                            dataLoaderHelper2.LJJIIJ = i8;
                            dataLoaderHelper2.LJJJJL(LSPassThroughRecordSizeConfig.DEFAULT, i7);
                            dataLoaderHelper.LJJJJL(1104, i8);
                        }
                    };
                    dataLoaderHelper.LJJIII = new WeakReference<>(dataLoaderHelper.LJJII);
                    C790010Uyt.LJ().LJIIIIZZ(dataLoaderHelper.LJJIII);
                    int longValue2 = (int) dataLoaderHelper.LJIIIIZZ.getLongValue(7433);
                    dataLoaderHelper.LJIJ = C1470430oMr.LJIIL(longValue2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("KeyIsGetDemuxerVersion: ");
                    sbLIZ.append(longValue2);
                    sbLIZ.append(", handle: ");
                    sbLIZ.append(dataLoaderHelper.LJIJ);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                    if (dataLoaderHelper.LJIJ != 0) {
                        TTVideoEngineLog.d("DataLoaderHelper", "set KeyIsSetDemuxerHandle");
                        dataLoaderHelper.LJIIIIZZ.setLongValue(7432, dataLoaderHelper.LJIJ);
                    }
                    TTVideoEngineLog.d("DataLoaderHelper", "DataLoader start.");
                    dataLoaderHelper.LJJ.LJFF(2);
                    if (C790030Uyv.LIZ.LJIILL > 0) {
                        dataLoaderHelper.LJJ.LJI(1);
                        return;
                    }
                    return;
                }
                dataLoaderHelper.LJJL = EnumC1469720oLi.InitializeError.ordinal();
                dataLoaderHelper.LJJLIIIIJ = "start data loader fail";
                throw new Exception("start data loader fail");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initMdlFail:");
            sbLIZ2.append(AVMDLDataLoader.getLoadFailMsg());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            dataLoaderHelper.LJJL = EnumC1469720oLi.InitializeError.ordinal();
            throw new Exception(strLIZIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            dataLoaderHelper.LJJ.LJFF(2);
            if (C790030Uyv.LIZ.LJIILL > 0) {
                dataLoaderHelper.LJJ.LJI(1);
            }
            throw th2;
        }
    }

    public static void LIZJ(boolean z, DataLoaderHelper dataLoaderHelper) {
        if (!z) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "tryStartStrategyCenter not to load, outer to control load");
            return;
        }
        if (dataLoaderHelper.LJIIIZ.mEnableIOManager != 0 && dataLoaderHelper.LJJLIIIJJI == 0) {
            long longValue = dataLoaderHelper.LJIIIIZZ.getLongValue(7390);
            long longValue2 = dataLoaderHelper.LJIIIIZZ.getLongValue(7402);
            if (longValue != 0 && longValue != -1 && longValue != -998 && longValue2 >= 0) {
                dataLoaderHelper.LJJIJLIJ = new C0W0A();
                C1469160oKo c1469160oKo = C790230UzF.LIZ;
                c1469160oKo.LJIILLIIL.lock();
                try {
                    c1469160oKo.LJII = longValue;
                    c1469160oKo.LJIIIIZZ = longValue2;
                    c1469160oKo.LJIILLIIL.unlock();
                    c1469160oKo.LJIIIZ = dataLoaderHelper.LJIIJ;
                    c1469160oKo.LJIILJJIL();
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("after start strategy center running=");
                    sbLIZ.append(c1469160oKo.LJI());
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                    c1469160oKo.LIZIZ(C1309170kAl.LIZ(), null);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("config strategy center session_id=");
                    sbLIZ2.append(C1468180oJE.LJJZZIII);
                    sbLIZ2.append("cache_dir=");
                    sbLIZ2.append(dataLoaderHelper.LJIIIZ.mCacheDir);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    c1469160oKo.LIZJ().setStringValue(31211, C1468180oJE.LJJZZIII);
                    c1469160oKo.LIZJ().setStringValue(31209, dataLoaderHelper.LJIIIZ.mCacheDir);
                    if (dataLoaderHelper.LJIIIIZZ.isRunning()) {
                        if (!c1469160oKo.LJI()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("strategy center start failed, set mdl preload strategy back ");
                            sbLIZ3.append(dataLoaderHelper.LJJIZ);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                            dataLoaderHelper.LJIIIIZZ.setIntValue(1030, dataLoaderHelper.LJJIZ);
                            return;
                        }
                        dataLoaderHelper.LJIIIIZZ.setIntValue(1030, dataLoaderHelper.LJJIL);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1469160oKo.LJIILLIIL.unlock();
                    throw th;
                }
            }
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("tryStartStrategyCenter iomanagerHandle or iomanagerVersion is not validiomanagerHandle=");
            sbLIZ4.append(longValue);
            sbLIZ4.append(" iomanagerVersion=");
            sbLIZ4.append(longValue2);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }
}
