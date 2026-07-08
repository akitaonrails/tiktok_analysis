package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.AfAdsNoticeMessage;
import com.bytedance.android.livesdk.model.message.BaseSyncMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0xz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840100xz6 implements InterfaceC20315114eL {
    public static final C1840100xz6 LIZ = new C1840100xz6();

    @Override // X.InterfaceC20315114eL
    public final boolean LJ() {
        return C1126800fQc.LIZ.KE0().LJIIJ();
    }

    @Override // X.InterfaceC20315114eL
    public final void onBootFinish() {
        try {
            C20441214yg.LIZIZ("RevenueStrategyAppInit", "on cold boot finish");
            C1619950sG1.LIZ.getClass();
            C1619950sG1.LIZLLL("app_cold_startup");
            long jLJIIJJI = C19990113Jj.LJIIJJI(C19990313Jl.LJIIIIZZ(SystemClock.elapsedRealtime() - C08TN.LIZ().LJJLIIIJLJLI, EnumC19990213Jk.MILLISECONDS));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("feed end -> task process delay : ");
            sbLIZ.append(jLJIIJJI);
            sbLIZ.append(" s");
            C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("revenue boot finish task failed: ");
            sbLIZ2.append(th);
            C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC20315114eL
    public final InterfaceC1590960rVG LIZ() {
        return C1619950sG1.LIZ;
    }

    public static void LJI(BaseSyncMessage baseSyncMessage) {
        Object c098200Yq;
        AfAdsNoticeMessage afAdsNoticeMessage;
        if (baseSyncMessage.methodType == 1) {
            try {
                byte[] bArr = baseSyncMessage.data;
                if (bArr != null) {
                    int i = baseSyncMessage.dataType;
                    if (i != 1) {
                        if (i == 2) {
                            afAdsNoticeMessage = (AfAdsNoticeMessage) C293501Bt.LIZ().LJII(new String(bArr, Charsets.UTF_8), AfAdsNoticeMessage.class);
                        }
                    } else {
                        LIZ.getClass();
                        afAdsNoticeMessage = (AfAdsNoticeMessage) LJFF(bArr, AfAdsNoticeMessage.class);
                    }
                    if (afAdsNoticeMessage != null) {
                        C1840100xz6 c1840100xz6 = LIZ;
                        String strLJIILL = C293501Bt.LIZ().LJIILL(afAdsNoticeMessage);
                        c1840100xz6.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_revenue_strategy_client_receive_msg_success");
                        c474500IjALIZ.LJJII("ug_push_api", "msg_type");
                        c474500IjALIZ.LJJII(strLJIILL, "msg_data");
                        c474500IjALIZ.LIZ();
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    @Override // X.InterfaceC20315114eL
    public final void LIZJ(byte[] bArr) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C754070Ti1(bArr, null), 3);
    }

    @Override // X.InterfaceC20315114eL
    public final void LIZLLL(boolean z) {
        if (z) {
            C20441214yg.LIZIZ("RevenueStrategyAppInit", "on hot startup");
            C1619950sG1 c1619950sG1 = C1619950sG1.LIZ;
            c1619950sG1.getClass();
            C1619950sG1.LIZIZ = false;
            c1619950sG1.getClass();
            C1619950sG1.LIZLLL("app_hot_startup");
        }
    }

    public static Object LJFF(byte[] bArr, Class cls) {
        boolean z;
        Object c098200Yq;
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            C1516680pZS c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(new C1506330pIl(bArr));
            C1515210pX5.LIZLLL().getClass();
            C0IMD c0imdLJI = C1515210pX5.LJI(cls);
            if (c0imdLJI != null) {
                c098200Yq = c0imdLJI.LIZJ(c1516680pZS);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on rust network callback decode failed. \t ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    @Override // X.InterfaceC20315114eL
    public final void LIZIZ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state change from ");
        Boolean boolValueOf = null;
        if (c1602200rnO != null) {
            str = c1602200rnO.LIZ.label;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" to ");
        if (c1602200rnO2 != null) {
            str2 = c1602200rnO2.LIZ.label;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ));
        if (c1602200rnO2 != null) {
            boolValueOf = Boolean.valueOf(c1602200rnO2.LIZ.equals(EnumC585000Mx0.WARM_STARTUP));
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            return;
        }
        C1619950sG1 c1619950sG1 = C1619950sG1.LIZ;
        c1619950sG1.getClass();
        C1619950sG1.LIZIZ = false;
        C20441214yg.LIZIZ("RevenueStrategyAppInit", "on warm startup");
        try {
            c1619950sG1.getClass();
            C1619950sG1.LIZLLL("app_warm_startup");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
