package X;

import Y.AfS131S0000000_3;
import android.os.Debug;
import android.os.Process;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.memrelief.pressure.MemoryPressureWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.09Q0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Q0 {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ() {
        if (((Boolean) C2469209ly.LIZJ.getValue()).booleanValue()) {
            boolean z = (C2469209ly.LIZ().type & 1) != 0;
            boolean z2 = (C2469209ly.LIZ().type & 2) != 0;
            boolean z3 = (C2469209ly.LIZ().type & 4) != 0;
            boolean z4 = (C2469209ly.LIZ().type & 8) != 0;
            final int i = C2469209ly.LIZ().minJavaLevel;
            C09Q3 c09q3 = C09Q3.MEDIUM;
            int iOrdinal = c09q3.ordinal();
            if (i < iOrdinal) {
                i = iOrdinal;
            }
            final int i2 = C2469209ly.LIZ().minLevel;
            int iOrdinal2 = c09q3.ordinal();
            if (i2 < iOrdinal2) {
                i2 = iOrdinal2;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add(new InterfaceC2469309lz() { // from class: X.09Pr
                    @Override // X.InterfaceC2469309lz
                    public final String name() {
                        return "MemoryPressureJava";
                    }

                    @Override // X.InterfaceC2469309lz
                    public final boolean LIZ() {
                        return MemoryPressureWatcher.getInstance().getJavaMemoryLevel().ordinal() >= i;
                    }
                });
            }
            if (z2) {
                arrayList.add(new InterfaceC2469309lz() { // from class: X.09Ps
                    @Override // X.InterfaceC2469309lz
                    public final String name() {
                        return "MemoryPressureNative";
                    }

                    @Override // X.InterfaceC2469309lz
                    public final boolean LIZ() {
                        return MemoryPressureWatcher.getInstance().getNativeMemoryLevel().ordinal() >= i2;
                    }
                });
            }
            if (z3) {
                arrayList.add(new InterfaceC2469309lz() { // from class: X.09Q1
                    @Override // X.InterfaceC2469309lz
                    public final boolean LIZ() {
                        long pss;
                        try {
                            pss = Debug.getPss();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        return ((pss > 1843200L ? 1 : (pss == 1843200L ? 0 : -1)) >= 0 ? C09Q3.EXTREME.ordinal() : (pss > 1638400L ? 1 : (pss == 1638400L ? 0 : -1)) >= 0 ? C09Q3.HIGH.ordinal() : (pss > 1433600L ? 1 : (pss == 1433600L ? 0 : -1)) >= 0 ? C09Q3.MEDIUM.ordinal() : (pss > 1228800L ? 1 : (pss == 1228800L ? 0 : -1)) >= 0 ? C09Q3.LOW.ordinal() : C09Q3.UNKNOWN.ordinal()) >= i2;
                    }

                    @Override // X.InterfaceC2469309lz
                    public final String name() {
                        return "MemoryPressurePss";
                    }
                });
            }
            if (z4 && !Process.is64Bit()) {
                arrayList.add(new InterfaceC2469309lz() { // from class: X.09Q2
                    @Override // X.InterfaceC2469309lz
                    public final boolean LIZ() {
                        try {
                            return C1158120gF8.LIZ(C2367709Pn.LIZ()) >= i2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return false;
                        }
                    }

                    @Override // X.InterfaceC2469309lz
                    public final String name() {
                        return "MemoryPressureVss";
                    }
                });
            }
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                ((ArrayList) C2469009lw.LJ).addAll(arrayList);
                C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS131S0000000_3(6));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void LIZIZ() {
        Keva repo = KevaImpl.getRepo("repo_memory_self_kill", 1);
        int i = repo.getInt("pid", 0);
        if (i > 0) {
            String string = repo.getString("strategy", null);
            LIZ = repo.getLong("time", 0L);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("writeKillMark pid:");
            sbLIZ.append(i);
            sbLIZ.append(" strategy:");
            sbLIZ.append(string);
            sbLIZ.append(" time:");
            sbLIZ.append(LIZ);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("MemoryKillTask", C2188811AlT.LIZIZ(sbLIZ));
            repo.clear();
        }
    }
}
