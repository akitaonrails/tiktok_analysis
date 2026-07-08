package com.bytedance.android.live.effect.storage;

import X.C0VSJ;
import X.C1161920gLG;
import X.C13BV;
import X.C13VI;
import X.C1851040yGk;
import X.C2188811AlT;
import X.C2454209jY;
import X.EnumC1335420kr6;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoOptimizeWithCepChannelListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoOptimizeWithCepExpireDaysSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveCleanDiskWithCepStorage extends C13VI {
    public static boolean LIZJ;
    public static long LIZIZ = 2592000000L;
    public static String LIZLLL = "";

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    public final long LJIILLIIL() {
        long jLJIILL = 0;
        try {
            List<String> value = LiveGeckoOptimizeWithCepChannelListSetting.INSTANCE.getValue();
            if (value != null) {
                Iterator<String> it2 = value.iterator();
                while (it2.hasNext()) {
                    jLJIILL += LJIILL(it2.next(), true);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jLJIILL;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return LJIIZILJ(2);
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        return LJIIZILJ(1);
    }

    public final long LJIIZILJ(int i) {
        Object valueForKey;
        Object valueForKey2;
        long jLJIILLIIL;
        Double d;
        IKVStore iKVStoreLIZ = C1851040yGk.LIZ();
        Object valueForKey3 = null;
        if (iKVStoreLIZ != null) {
            valueForKey = iKVStoreLIZ.getValueForKey("long_rule_need_clean");
        } else {
            valueForKey = null;
        }
        IKVStore iKVStoreLIZ2 = C1851040yGk.LIZ();
        if (iKVStoreLIZ2 != null) {
            valueForKey2 = iKVStoreLIZ2.getValueForKey("immediate_rule_need_clean");
        } else {
            valueForKey2 = null;
        }
        if (Intrinsics.LJFF(valueForKey2, 1)) {
            LIZIZ = ((long) LiveGeckoOptimizeWithCepExpireDaysSetting.INSTANCE.getValue()) * 86400000;
            jLJIILLIIL = LJIILLIIL();
            ((IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class)).MD2(i, 1, jLJIILLIIL);
            long jCurrentTimeMillis = System.currentTimeMillis();
            IKVStore iKVStoreLIZ3 = C1851040yGk.LIZ();
            if (iKVStoreLIZ3 != null) {
                iKVStoreLIZ3.setValueForKey("immediate_rule_need_clean", 0);
            }
            IKVStore iKVStoreLIZ4 = C1851040yGk.LIZ();
            if (iKVStoreLIZ4 != null) {
                iKVStoreLIZ4.setValueForKey("immediate_rule_clean_time", Long.valueOf(jCurrentTimeMillis));
            }
        } else if (Intrinsics.LJFF(valueForKey, 1)) {
            IKVStore iKVStoreLIZ5 = C1851040yGk.LIZ();
            if (iKVStoreLIZ5 != null) {
                valueForKey3 = iKVStoreLIZ5.getValueForKey("long_rule_need_clean_days");
            }
            if ((valueForKey3 instanceof Double) && (d = (Double) valueForKey3) != null) {
                LIZIZ = ((long) ((int) d.doubleValue())) * 86400000;
            }
            jLJIILLIIL = LJIILLIIL();
            ((IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class)).MD2(i, 2, jLJIILLIIL);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            IKVStore iKVStoreLIZ6 = C1851040yGk.LIZ();
            if (iKVStoreLIZ6 != null) {
                iKVStoreLIZ6.setValueForKey("long_rule_need_clean", 0);
            }
            IKVStore iKVStoreLIZ7 = C1851040yGk.LIZ();
            if (iKVStoreLIZ7 != null) {
                iKVStoreLIZ7.setValueForKey("long_rule_clean_time", Long.valueOf(jCurrentTimeMillis2));
                return jLJIILLIIL;
            }
        } else {
            return 0L;
        }
        return jLJIILLIIL;
    }

    public final long LJIILL(String str, boolean z) {
        List listLJJLIIIJILLIZJL;
        if (!LIZJ) {
            String strC5 = ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).C5(str);
            if (strC5 == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strC5, new String[]{str}, 0, 6)) == null || listLJJLIIIJILLIZJL.size() != 2) {
                return 0L;
            }
            LIZLLL = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
            LIZJ = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists() || System.currentTimeMillis() - ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).ze(c0vsj) <= LIZIZ) {
            return 0L;
        }
        return C2454209jY.LIZIZ(c0vsj, C13BV.INSTANCE, true);
    }
}
