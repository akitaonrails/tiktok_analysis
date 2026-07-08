package X;

import android.os.Process;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.09Xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2389009Xs extends AbstractC20278614Wi {
    public final int LLILLL = -1;
    public final String LLILZ = "/sys/devices/system/cpu/cpu";
    public final String LLILZIL = "/cpufreq/stats/time_in_state";
    public final long LLILZLL = 360;
    public long LLIZ;
    public float LLIZLLLIL;

    public final long LIZLLL() {
        BufferedReader bufferedReader;
        List listLL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long j = -1;
        for (int i = 0; i < iAvailableProcessors; i++) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(i);
                sbLIZ.append(this.LLILZIL);
                bufferedReader = new BufferedReader(new C0VSF(C2188811AlT.LIZIZ(sbLIZ)), 50);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line.length() != 0) {
                            List<String> listSplit = new Regex("\\s+").split(line, 0);
                            if (listSplit.isEmpty()) {
                                listLL = C13BV.INSTANCE;
                            } else {
                                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                                while (listIterator.hasPrevious()) {
                                    if (listIterator.previous().length() != 0) {
                                        listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                }
                                listLL = C13BV.INSTANCE;
                            }
                            String[] strArr = (String[]) listLL.toArray(new String[0]);
                            if (strArr.length == 2) {
                                j += Long.parseLong(strArr[1]);
                            }
                        }
                    } catch (FileNotFoundException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("getTotalCPUTimeByTimeInStat: ");
                        sbLIZ2.append(e.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } catch (IOException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("getTotalCPUTimeByTimeInStat: ");
                        sbLIZ3.append(e.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ3);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("getTotalCPUTimeByTimeInStat: ");
                            sbLIZ4.append(th.getMessage());
                            C2188811AlT.LIZIZ(sbLIZ4);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            LJ(bufferedReader);
                            throw th2;
                        }
                    }
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                bufferedReader = null;
            } catch (IOException e4) {
                e = e4;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
            LJ(bufferedReader);
        }
        return j;
    }

    public final long LIZJ() {
        BufferedReader bufferedReader;
        List listLL;
        int iMyPid = Process.myPid();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(iMyPid);
            sbLIZ.append("/stat");
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ))), LSPassThroughRecordSizeConfig.DEFAULT);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                List<String> listSplit = new Regex(" ").split(line, 0);
                if (listSplit.isEmpty()) {
                    listLL = C13BV.INSTANCE;
                } else {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    listLL = C13BV.INSTANCE;
                }
                String[] strArr = (String[]) listLL.toArray(new String[0]);
                long j = Long.parseLong(strArr[13]) + Long.parseLong(strArr[14]);
                LJ(bufferedReader);
                return j;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    LJ(bufferedReader);
                    return this.LLILLL;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    LJ(bufferedReader);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static void LJ(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC20278714Wj interfaceC20278714Wj = (InterfaceC20278714Wj) xBaseParamModel;
        AwS239S0300000_30 awS239S0300000_30 = new AwS239S0300000_30(completionBlock, (CompletionBlock<InterfaceC20278514Wh>) this, (C2389009Xs) interfaceC20278714Wj, (InterfaceC20278714Wj) 6);
        if (Intrinsics.LJFF(interfaceC20278714Wj.getCpuUsage(), Boolean.TRUE)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LLIZ < this.LLILZLL) {
                awS239S0300000_30.invoke(Float.valueOf(this.LLIZLLLIL));
                return;
            } else {
                this.LLIZ = jCurrentTimeMillis;
                C2102208Lk.LIZ(null, new AwS404S0200000_3(this, awS239S0300000_30, 61), 31);
                return;
            }
        }
        awS239S0300000_30.invoke(Float.valueOf(-2.0f));
    }
}
