package X;

import android.text.TextUtils;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.sync.SyncSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.sync.ISyncInitProvider;
import com.ss.android.ugc.aweme.sync.SyncConfigSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ppS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526600ppS {
    public static volatile InterfaceC1526670ppZ LJFF;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final ConcurrentHashMap<Long, InterfaceC809840Vpm> LIZJ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<InterfaceC1526690ppb> LIZLLL = new CopyOnWriteArrayList<>();
    public static final C01GW LJ = C452501pT.LIZIZ(new C1526640ppW());
    public static final C1526660ppY LJI = new InterfaceC2210981Bg8() { // from class: X.0ppY
        public final AtomicBoolean LL = new AtomicBoolean(false);

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
            if (z && this.LL.compareAndSet(false, true)) {
                AtomicBoolean atomicBoolean = C1526600ppS.LIZ;
                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                String str = "";
                if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
                    strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
                }
                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
                if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId != null) {
                    str = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId;
                }
                C1526600ppS.LIZLLL(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, str);
            }
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            if (this.LL.compareAndSet(false, true)) {
                AtomicBoolean atomicBoolean = C1526600ppS.LIZ;
                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                String str3 = "";
                if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
                    strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
                }
                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
                if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId != null) {
                    str3 = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId;
                }
                C1526600ppS.LIZLLL(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, str3);
            }
        }
    };

    public static SyncConfigSettings.SyncSdkConfigModel LIZIZ() {
        return (SyncConfigSettings.SyncSdkConfigModel) LJ.getValue();
    }

    public static boolean LIZJ(long j) {
        q qVarLJJIJIIJI;
        if (!Intrinsics.LJFF(LIZIZ().enable, Boolean.TRUE)) {
            return false;
        }
        try {
            n nVar = LIZIZ().bizEnableInfo;
            if (nVar != null && (qVarLJJIJIIJI = nVar.LJJIJIIJI(String.valueOf(j))) != null) {
                if (qVarLJJIJIIJI.LJ()) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ppT] */
    public static void LIZLLL(final String str, final String str2) {
        InterfaceC1526670ppZ c1519670peH;
        if (str.length() != 0 && str2.length() != 0) {
            ISyncInitProvider iSyncInitProvider = C1519700peK.LIZ;
            final C1519750peP c1519750pePLIZLLL = iSyncInitProvider.LIZLLL();
            Boolean bool = LIZIZ().useSharedWs;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                InterfaceC1526670ppZ interfaceC1526670ppZLIZ = iSyncInitProvider.LIZ(c1519750pePLIZLLL);
                c1519670peH = interfaceC1526670ppZLIZ;
                if (interfaceC1526670ppZLIZ == null) {
                    c1519670peH = new C1519670peH(c1519750pePLIZLLL, str, str2);
                }
            } else {
                c1519670peH = new C1519670peH(c1519750pePLIZLLL, str, str2);
            }
            c1519670peH.LJ(new InterfaceC1519710peL() { // from class: X.0ppT
                @Override // X.InterfaceC1519710peL
                public final void LIZ(WsChannelMsg wsChannelMsg) {
                    SyncSDK.onReceiveWsEvent(wsChannelMsg);
                }

                @Override // X.InterfaceC1519710peL
                public final void LJI(C821280WJq c821280WJq) {
                    Iterator<InterfaceC1526690ppb> it2 = C1526600ppS.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJI(c821280WJq);
                    }
                    AtomicBoolean atomicBoolean = C1526600ppS.LIZ;
                    if (Intrinsics.LJFF(C1526600ppS.LIZIZ().syncConnectOpt, Boolean.TRUE)) {
                        C1526600ppS.LIZ(false, c1519750pePLIZLLL, c821280WJq, str, str2);
                    }
                }
            });
            LJFF = c1519670peH;
            InterfaceC1526670ppZ interfaceC1526670ppZ = LJFF;
            if (interfaceC1526670ppZ != null) {
                interfaceC1526670ppZ.LIZLLL();
            }
            if (Intrinsics.LJFF(LIZIZ().syncConnectOpt, bool2)) {
                LIZ(true, c1519750pePLIZLLL, null, str, str2);
            } else {
                LJ(c1519750pePLIZLLL, str, str2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0ppc] */
    public static void LJ(C1519750peP c1519750peP, String str, String str2) {
        final InterfaceC1526670ppZ interfaceC1526670ppZ = LJFF;
        if (interfaceC1526670ppZ != null && LIZIZ.compareAndSet(false, true)) {
            String strValueOf = String.valueOf(c1519750peP.LIZ);
            C1526590ppR c1526590ppR = new C1526590ppR(strValueOf, interfaceC1526670ppZ.getChannelId());
            String str3 = c1519750peP.LIZIZ;
            c1526590ppR.LJFF = str3;
            c1526590ppR.LJI = "https://mon.isnssdk.com";
            c1526590ppR.LJII = true;
            c1526590ppR.LIZJ = new InterfaceC1526470ppF() { // from class: X.0ppX
                @Override // X.InterfaceC1526470ppF
                public final Map<String, String> getCommonParams() {
                    HashMap map = new HashMap();
                    C0XDN.LIZJ(map, false);
                    return map;
                }
            };
            c1526590ppR.LIZLLL = new InterfaceC1526680ppa() { // from class: X.0ppV
                @Override // X.InterfaceC1526680ppa
                public final boolean LJII() {
                    return interfaceC1526670ppZ.isConnected();
                }

                @Override // X.InterfaceC1526680ppa
                public final void LIZ(InterfaceC1526690ppb interfaceC1526690ppb) {
                    if (interfaceC1526690ppb != null) {
                        CopyOnWriteArrayList<InterfaceC1526690ppb> copyOnWriteArrayList = C1526600ppS.LIZLLL;
                        if (!copyOnWriteArrayList.contains(interfaceC1526690ppb)) {
                            copyOnWriteArrayList.add(interfaceC1526690ppb);
                        }
                    }
                }

                @Override // X.InterfaceC1526680ppa
                public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                    interfaceC1526670ppZ.LIZJ(wsChannelMsg);
                }
            };
            if (!TextUtils.isEmpty(str3)) {
                if (!TextUtils.isEmpty(strValueOf)) {
                    if (c1526590ppR.LIZJ != null) {
                        if (c1526590ppR.LIZLLL != null) {
                            if (c1526590ppR.LJ == null) {
                                c1526590ppR.LJ = new InterfaceC1526770ppj() { // from class: X.0ppc
                                };
                            }
                            SyncSDK.init(C1519700peK.LIZ.getAppContext(), new C1526570ppP(c1526590ppR));
                            SyncSDK.start(str, str2);
                            return;
                        }
                        throw new IllegalArgumentException("please set wsService before build");
                    }
                    throw new IllegalArgumentException("please set commonParamProvider before build");
                }
                throw new IllegalArgumentException("please set aid before build");
            }
            throw new IllegalArgumentException("please set host before build");
        }
    }

    public static void LIZ(boolean z, final C1519750peP c1519750peP, C821280WJq c821280WJq, final String str, final String str2) {
        C0XE1 c0xe1;
        long jLongValue;
        if (z) {
            Long l = LIZIZ().syncConnectFallbackTs;
            long j = 30000;
            if (l != null) {
                jLongValue = l.longValue();
                if (jLongValue > 0) {
                }
                C15O7.LJIIIIZZ(j).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0ppU
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("SyncManager@e7b0.checkAndConnectSync$1");
                        AtomicBoolean atomicBoolean = C1526600ppS.LIZ;
                        C1526600ppS.LJ(c1519750peP, str, str2);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("SyncManager@e7b0.checkAndConnectSync$1");
                        return unit;
                    }
                });
                return;
            }
            jLongValue = 30000;
            j = jLongValue;
            C15O7.LJIIIIZZ(j).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0ppU
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("SyncManager@e7b0.checkAndConnectSync$1");
                    AtomicBoolean atomicBoolean = C1526600ppS.LIZ;
                    C1526600ppS.LJ(c1519750peP, str, str2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SyncManager@e7b0.checkAndConnectSync$1");
                    return unit;
                }
            });
            return;
        }
        if (c821280WJq != null) {
            c0xe1 = c821280WJq.LIZIZ;
        } else {
            c0xe1 = null;
        }
        if (c0xe1 == C0XE1.CONNECTED) {
            LJ(c1519750peP, str, str2);
        }
    }
}
