package X;

import com.ss.android.ugc.aweme.settings.SparkLynxBridgeThreadDispatcherSettings;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544110qHh extends C789070UxN {
    @Override // X.C789070UxN
    public final void LIZ(C1543910qHN c1543910qHN, Function1<? super Boolean, Unit> function1) {
        C1537480q70 hybridContext;
        String strLIZ;
        boolean z;
        EnumC1544120qHi enumC1544120qHi;
        EnumC1544180qHo enumC1544180qHo = c1543910qHN.LJIL;
        if (enumC1544180qHo != null) {
            C1544010qHX.LIZ.getClass();
            switch (C1544170qHn.LIZ[enumC1544180qHo.ordinal()]) {
                case 1:
                    enumC1544120qHi = EnumC1544120qHi.LL;
                    break;
                case 2:
                    enumC1544120qHi = EnumC1544120qHi.LLIZ;
                    break;
                case 3:
                    enumC1544120qHi = EnumC1544120qHi.LLILZLL;
                    break;
                case 4:
                    enumC1544120qHi = EnumC1544120qHi.LLILZ;
                    break;
                case 5:
                    enumC1544120qHi = EnumC1544120qHi.LLILLJJLI;
                    break;
                case 6:
                    enumC1544120qHi = EnumC1544120qHi.LLILLL;
                    break;
                case 7:
                    enumC1544120qHi = EnumC1544120qHi.LLILZIL;
                    break;
                case 8:
                    enumC1544120qHi = EnumC1544120qHi.LLIZLLLIL;
                    break;
                default:
                    enumC1544120qHi = EnumC1544120qHi.LLIZ;
                    break;
            }
            C1544010qHX.LJ(function1, enumC1544120qHi);
            return;
        }
        SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModelLIZ = SparkLynxBridgeThreadDispatcherSettings.LIZ();
        if (!sparkLynxBridgeThreadDispatcherModelLIZ.enable) {
            c1543910qHN.LJIJJLI = "MAIN_THREAD";
            C1544010qHX.LIZ.getClass();
            C1544010qHX.LJFF(function1);
            return;
        }
        if (sparkLynxBridgeThreadDispatcherModelLIZ.oldEnable) {
            C1544010qHX.LIZ.getClass();
            C1544010qHX.LJI(c1543910qHN, sparkLynxBridgeThreadDispatcherModelLIZ, function1);
            return;
        }
        String str = c1543910qHN.LIZ.LJIIIZ;
        if (str != null) {
            C1529870puj.LIZ.getClass();
            InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
            if (interfaceC1541990qEHLJFF != null && (hybridContext = interfaceC1541990qEHLJFF.getHybridContext()) != null) {
                String strLJIJI = hybridContext.LJIJI();
                List<String> list = sparkLynxBridgeThreadDispatcherModelLIZ.denyChannelList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str2 : list) {
                        if (Intrinsics.LJFF("*", str2) || a0.LJJIIZI(strLJIJI, str2, false)) {
                            C1544010qHX.LIZ.getClass();
                            C1544010qHX.LJI(c1543910qHN, sparkLynxBridgeThreadDispatcherModelLIZ, function1);
                            return;
                        }
                    }
                }
                List<String> list2 = sparkLynxBridgeThreadDispatcherModelLIZ.allowChannelList;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (String str3 : list2) {
                        if (Intrinsics.LJFF("*", str3) || a0.LJJIIZI(strLJIJI, str3, false)) {
                            C1544010qHX.LIZ.getClass();
                            if (c1543910qHN.LIZ.LIZJ(c1543910qHN)) {
                                strLIZ = c1543910qHN.LIZ.LIZ();
                            } else {
                                strLIZ = "host";
                            }
                            List<String> list3 = sparkLynxBridgeThreadDispatcherModelLIZ.lynxThreadList.get(strLIZ);
                            if (list3 != null && list3.contains(c1543910qHN.LJFF)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c1543910qHN.LJIJJLI = "LYNX_THREAD";
                                C1544010qHX.LJ(function1, EnumC1544120qHi.LL);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("dispatchLynxBridgeThread: bridgeName:");
                                sbLIZ.append(c1543910qHN.LJFF);
                                sbLIZ.append(", runIn: LYNX_THREAD");
                                C2188811AlT.LIZIZ(sbLIZ);
                                return;
                            }
                            List<String> list4 = sparkLynxBridgeThreadDispatcherModelLIZ.normalThreadList.get(strLIZ);
                            if (list4 != null && list4.contains(c1543910qHN.LJFF)) {
                                c1543910qHN.LJIJJLI = "TT_NORMAL_THREAD";
                                C1544010qHX.LJ(function1, EnumC1544120qHi.LLILLJJLI);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("dispatchLynxBridgeThread: bridgeName:");
                                sbLIZ2.append(c1543910qHN.LJFF);
                                sbLIZ2.append(", runIn: TT_NORMAL_THREAD");
                                C2188811AlT.LIZIZ(sbLIZ2);
                                return;
                            }
                            List<String> list5 = sparkLynxBridgeThreadDispatcherModelLIZ.cpuThreadList.get(strLIZ);
                            if (list5 != null && list5.contains(c1543910qHN.LJFF)) {
                                c1543910qHN.LJIJJLI = "TT_CPU_THREAD";
                                C1544010qHX.LJ(function1, EnumC1544120qHi.LLILLL);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("dispatchLynxBridgeThread: bridgeName:");
                                sbLIZ3.append(c1543910qHN.LJFF);
                                sbLIZ3.append(", runIn: TT_CPU_THREAD");
                                C2188811AlT.LIZIZ(sbLIZ3);
                                return;
                            }
                            List<String> list6 = sparkLynxBridgeThreadDispatcherModelLIZ.ioThreadList.get(strLIZ);
                            if (list6 != null && list6.contains(c1543910qHN.LJFF)) {
                                c1543910qHN.LJIJJLI = "TT_IO_THREAD";
                                C1544010qHX.LJ(function1, EnumC1544120qHi.LLILZ);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("dispatchLynxBridgeThread: bridgeName:");
                                sbLIZ4.append(c1543910qHN.LJFF);
                                sbLIZ4.append(", runIn: TT_IO_THREAD");
                                C2188811AlT.LIZIZ(sbLIZ4);
                                return;
                            }
                            List<String> list7 = sparkLynxBridgeThreadDispatcherModelLIZ.serialThreadList.get(strLIZ);
                            if (list7 != null && list7.contains(c1543910qHN.LJFF)) {
                                c1543910qHN.LJIJJLI = "TT_SERIAL_THREAD";
                                C1544010qHX.LJ(function1, EnumC1544120qHi.LLILZIL);
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("dispatchLynxBridgeThread: bridgeName:");
                                sbLIZ5.append(c1543910qHN.LJFF);
                                sbLIZ5.append(", runIn: TT_SERIAL_THREAD");
                                C2188811AlT.LIZIZ(sbLIZ5);
                                return;
                            }
                            List<String> list8 = sparkLynxBridgeThreadDispatcherModelLIZ.backgroundThreadList.get(strLIZ);
                            if (list8 != null && list8.contains(c1543910qHN.LJFF)) {
                                c1543910qHN.LJIJJLI = "TT_BACKGROUND_THREAD";
                                C1544010qHX.LJ(function1, EnumC1544120qHi.LLILZLL);
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("dispatchLynxBridgeThread: bridgeName:");
                                sbLIZ6.append(c1543910qHN.LJFF);
                                sbLIZ6.append(", runIn: TT_BACKGROUND_THREAD");
                                C2188811AlT.LIZIZ(sbLIZ6);
                                return;
                            }
                            c1543910qHN.LJIJJLI = "MAIN_THREAD";
                            C1544010qHX.LJ(function1, EnumC1544120qHi.LLIZ);
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("dispatchLynxBridgeThread: bridgeName:");
                            sbLIZ7.append(c1543910qHN.LJFF);
                            sbLIZ7.append(", runIn: MAIN_THREAD");
                            C2188811AlT.LIZIZ(sbLIZ7);
                            return;
                        }
                    }
                }
                C1544010qHX.LIZ.getClass();
                C1544010qHX.LJI(c1543910qHN, sparkLynxBridgeThreadDispatcherModelLIZ, function1);
                return;
            }
        }
        C1544010qHX.LIZ.getClass();
        C1544010qHX.LJI(c1543910qHN, sparkLynxBridgeThreadDispatcherModelLIZ, function1);
    }
}
