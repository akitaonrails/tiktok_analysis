package X;

import android.os.SystemClock;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import com.bytedance.im.core.client.configs.IMSDKInvalidTokenStatusCodeFixV2Config;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeDataBaseService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS122S0101000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0YMC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMC implements InterfaceC883070Ykb {
    public final C0YM2 LIZ;
    public final C0YM9 LIZIZ;
    public final Function2<Long, Long, Unit> LIZJ;
    public InterfaceC866920Xze LIZLLL;
    public long LJ;
    public long LJFF;

    @Override // X.InterfaceC883070Ykb
    public final void LIZ(C0YHC c0yhc) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("InboxEventSubscriber", "Subscribing to inbox events");
        this.LIZLLL = c0yhc.LIZ().getEvents().LIZJ(new InterfaceC1741206rq() { // from class: X.0YMD
            @Override // X.InterfaceC1741206rq
            public final void onEvent(InterfaceC871310YGb interfaceC871310YGb) throws JSONException {
                LinkedHashMap linkedHashMap;
                C0YM9 c0ym9;
                LinkedHashMap linkedHashMap2;
                IAwemeDataBaseService iAwemeDataBaseService;
                int i;
                if (interfaceC871310YGb instanceof C1892807bC) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onBusinessCmdMsgReceived: type=");
                    C1892807bC c1892807bC = (C1892807bC) interfaceC871310YGb;
                    sbLIZ.append(c1892807bC.LJIIIZ.getMessageType());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C882690Yjz.LJ("InboxEventSubscriber");
                    C882400YjW.LIZIZ(this.LIZ.LIZ).LJJII(c1892807bC.LJIIIZ);
                    return;
                }
                int i2 = 1;
                if (interfaceC871310YGb instanceof C0YLT) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onTokenInvalid: code=");
                    C0YLT c0ylt = (C0YLT) interfaceC871310YGb;
                    sbLIZ2.append(c0ylt.LJIIJ);
                    sbLIZ2.append(", isWebSocket=");
                    sbLIZ2.append(c0ylt.LJIIJJI);
                    C882690Yjz.LJFF("InboxEventSubscriber", C2188811AlT.LIZIZ(sbLIZ2));
                    C0YMC c0ymc = this.LIZ;
                    int i3 = c0ylt.LJIIIZ;
                    int i4 = c0ylt.LJIIJ;
                    boolean z = c0ylt.LJIIJJI;
                    c0ymc.getClass();
                    C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                    IMSDKInvalidTokenStatusCodeFixV2Config iMSDKInvalidTokenStatusCodeFixV2Config = C871150YFl.LIZ;
                    IMSDKInvalidTokenStatusCodeFixV2Config iMSDKInvalidTokenStatusCodeFixV2Config2 = (IMSDKInvalidTokenStatusCodeFixV2Config) c0c64LJIILLIIL.LJJII(IMSDKInvalidTokenStatusCodeFixV2Config.class, iMSDKInvalidTokenStatusCodeFixV2Config, "imsdk_fix_im_invalid_token_status_code_v2", true);
                    if (iMSDKInvalidTokenStatusCodeFixV2Config2 != null) {
                        iMSDKInvalidTokenStatusCodeFixV2Config = iMSDKInvalidTokenStatusCodeFixV2Config2;
                    }
                    if (iMSDKInvalidTokenStatusCodeFixV2Config.shouldRefreshToken && System.currentTimeMillis() - c0ymc.LJ > iMSDKInvalidTokenStatusCodeFixV2Config.delayBetweenTokenRefreshes) {
                        C0YUM.LIZJ(true);
                        c0ymc.LJ = System.currentTimeMillis();
                        C0YUM.LIZLLL(i3, i4, z, true);
                    } else if (iMSDKInvalidTokenStatusCodeFixV2Config.isEnabled()) {
                        C0YUM.LIZJ(false);
                        C0YUM.LIZLLL(i3, i4, z, false);
                    } else {
                        C0YUM.LIZLLL(i3, i4, z, false);
                    }
                    if (z && iMSDKInvalidTokenStatusCodeFixV2Config.shouldReconnectWebSocket && System.currentTimeMillis() - c0ymc.LJFF > iMSDKInvalidTokenStatusCodeFixV2Config.delayBetweenWsReconnections) {
                        C882400YjW.LJII();
                        WsDependImpl.LL.LIZLLL();
                        c0ymc.LJFF = System.currentTimeMillis();
                    }
                    C0YM9 c0ym92 = c0ymc.LIZIZ;
                    if (c0ym92 == null) {
                        return;
                    }
                    C882400YjW.LIZLLL();
                    C882690Yjz.LJIIIZ("SDKMessagePuller", "tokenPullMessage");
                    if (!c0ym92.LIZIZ()) {
                        return;
                    }
                    C882400YjW.LIZ();
                    C883250Ykt c883250Ykt = C883250Ykt.LL;
                    if (!C461720I8s.LJ()) {
                        return;
                    }
                    C882400YjW.LIZLLL();
                    C882690Yjz.LJIIIZ("SDKMessagePuller", "tokenPullMessage real");
                    c0ym92.LIZLLL = SystemClock.uptimeMillis();
                    c0ym92.LIZ().LIZ().LIZIZ(-2, false, null, 6);
                    return;
                }
                if (interfaceC871310YGb instanceof C0YF8) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    C882690Yjz.LJIIIZ("InboxEventSubscriber", "onFullDBDataReset");
                    C882400YjW.LIZIZ(this.LIZ.LIZ).LJI();
                    return;
                }
                if (interfaceC871310YGb instanceof C1893107bF) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onInvalidSessionAccess: expected=");
                    C1893107bF c1893107bF = (C1893107bF) interfaceC871310YGb;
                    sbLIZ3.append(c1893107bF.LJIIIZ);
                    sbLIZ3.append(", actual=");
                    sbLIZ3.append(c1893107bF.LJIIJ);
                    C882690Yjz.LJIIIZ("InboxEventSubscriber", C2188811AlT.LIZIZ(sbLIZ3));
                    Function2<Long, Long, Unit> function2 = this.LIZ.LIZJ;
                    if (function2 == null) {
                        return;
                    }
                    function2.invoke(Long.valueOf(c1893107bF.LJIIIZ), Long.valueOf(c1893107bF.LJIIJ));
                    return;
                }
                if (interfaceC871310YGb instanceof C871400YGk) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("onInboxInitStateChanged: inbox=");
                    C871400YGk c871400YGk = (C871400YGk) interfaceC871310YGb;
                    sbLIZ4.append(c871400YGk.LJIIIZ);
                    sbLIZ4.append(", state=");
                    sbLIZ4.append(c871400YGk.LJIIJ);
                    C882690Yjz.LJIIIZ("InboxEventSubscriber", C2188811AlT.LIZIZ(sbLIZ4));
                    C0YMI c0ymi = c871400YGk.LJIIJ;
                    int[] iArr = C0YMH.LIZ;
                    int i5 = iArr[c0ymi.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i = 1;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            i = 2;
                        }
                    } else {
                        i = 0;
                    }
                    C882400YjW.LIZIZ(this.LIZ.LIZ).LJIILIIL(new AwS122S0101000_14(interfaceC871310YGb, i, 7));
                    if (c871400YGk.LJIIJ == C0YMI.COMPLETED) {
                        C882400YjW.LIZIZ(this.LIZ.LIZ).LJIJJ(c871400YGk.LJIIIZ);
                    }
                    int i6 = iArr[c871400YGk.LJIIJ.ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                i2 = 2;
                            } else {
                                throw new C1954807lC();
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    C882400YjW.LIZIZ(this.LIZ.LIZ).LJIJJLI(c871400YGk.LJIIIZ, i2);
                    return;
                }
                if (interfaceC871310YGb instanceof C868150Y3x) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("onGlobalInitStateChanged: state=");
                    C868150Y3x c868150Y3x = (C868150Y3x) interfaceC871310YGb;
                    sbLIZ5.append(c868150Y3x.LJIIIZ);
                    C882690Yjz.LJIIIZ("InboxEventSubscriber", C2188811AlT.LIZIZ(sbLIZ5));
                    if (c868150Y3x.LJIIIZ != C0YMI.COMPLETED || (iAwemeDataBaseService = (IAwemeDataBaseService) PluggableExtentionKt.pluggableSpi$default(IAwemeDataBaseService.class, false, false, false, 14, null)) == null) {
                        return;
                    }
                    iAwemeDataBaseService.LLILZIL();
                    iAwemeDataBaseService.LLIZ();
                    return;
                }
                if (interfaceC871310YGb instanceof C0YMG) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("onPullStarted: inbox=");
                    C0YMG c0ymg = (C0YMG) interfaceC871310YGb;
                    sbLIZ6.append(c0ymg.LJIIIZ);
                    sbLIZ6.append(", reason=");
                    sbLIZ6.append(c0ymg.LJIIJ);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    C882690Yjz.LJ("InboxEventSubscriber");
                    Map<String, Object> map = c0ymg.LJIIJJI;
                    if (map != null) {
                        linkedHashMap2 = new LinkedHashMap(map);
                    } else {
                        linkedHashMap2 = new LinkedHashMap();
                    }
                    C882400YjW.LIZIZ(this.LIZ.LIZ).LJIILIIL(new AwS380S0200000_14(interfaceC871310YGb, (InterfaceC871310YGb) linkedHashMap2, (Map<String, Object>) 113));
                    return;
                }
                if (interfaceC871310YGb instanceof C0YME) {
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("onPullCompleted: inbox=");
                    C0YME c0yme = (C0YME) interfaceC871310YGb;
                    sbLIZ7.append(c0yme.LJIIIZ);
                    sbLIZ7.append(", reason=");
                    sbLIZ7.append(c0yme.LJIIJ);
                    sbLIZ7.append(", success=");
                    sbLIZ7.append(c0yme.LJIIJJI);
                    sbLIZ7.append(", messageCount=");
                    sbLIZ7.append(c0yme.LJIILIIL);
                    sbLIZ7.append(", durationMs=");
                    sbLIZ7.append(c0yme.LJIIL);
                    C2188811AlT.LIZIZ(sbLIZ7);
                    C882690Yjz.LJ("InboxEventSubscriber");
                    if (c0yme.LJIIJJI && (c0ym9 = this.LIZ.LIZIZ) != null) {
                        c0ym9.LIZLLL = SystemClock.uptimeMillis();
                    }
                    Map<String, Object> map2 = c0yme.LJIILJJIL;
                    if (map2 != null) {
                        linkedHashMap = new LinkedHashMap(map2);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    C882400YjW.LIZIZ(this.LIZ.LIZ).LJIILIIL(new AwS380S0200000_14(interfaceC871310YGb, (InterfaceC871310YGb) linkedHashMap, (Map<String, Object>) 114));
                    return;
                }
                if (interfaceC871310YGb instanceof C1890907at) {
                } else {
                    throw new C1954807lC();
                }
            }
        });
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("InboxEventSubscriber", "Subscribed to inbox events");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0YMC(C0YM2 c0ym2, C0YM9 c0ym9, Function2<? super Long, ? super Long, Unit> function2) {
        this.LIZ = c0ym2;
        this.LIZIZ = c0ym9;
        this.LIZJ = function2;
    }
}
