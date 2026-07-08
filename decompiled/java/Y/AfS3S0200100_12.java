package Y;

import X.C09JN;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C1954807lC;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C501540Jlg;
import X.C751460Tdo;
import X.C773530UVz;
import X.C778290Ufz;
import X.C778300Ug0;
import X.C778320Ug2;
import X.C786410Ut5;
import X.EnumC776690UdP;
import X.EnumC778330Ug3;
import X.InterfaceC750500TcG;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.SilenceRes;
import com.bytedance.android.livesdk.chatroom.model.SilenceResponse;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public class AfS3S0200100_12 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S0200100_12 afS3S0200100_12, Object obj) {
        C1C7U.LIZ("TreasureBoxService@5211.getEnvelopeList$4");
        Throwable th = (Throwable) obj;
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS3S0200100_12.l0;
        String message = th.getMessage();
        long j = afS3S0200100_12.j2;
        Boolean bool = (Boolean) afS3S0200100_12.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(-1, message, j, null, bool);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("err stack: ");
        sbLIZ.append(th);
        C20441214yg.LJ("TreasureBoxService", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("TreasureBoxService@5211.getEnvelopeList$4");
    }

    public static final void accept$1(AfS3S0200100_12 afS3S0200100_12, Object obj) {
        C1C7U.LIZ("TreasureBoxService@5211.getEnvelopeList$6");
        Throwable th = (Throwable) obj;
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS3S0200100_12.l0;
        String message = th.getMessage();
        long j = afS3S0200100_12.j2;
        Boolean bool = (Boolean) afS3S0200100_12.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(-1, message, j, null, bool);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("err stack: ");
        sbLIZ.append(th);
        C20441214yg.LJ("TreasureBoxService", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("TreasureBoxService@5211.getEnvelopeList$6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS3S0200100_12 afS3S0200100_12, Object obj) {
        long j;
        SilenceResponse silenceResponse;
        SilenceRes silenceRes;
        C1C7U.LIZ("MuteManager@8a97.muteUser$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        User user = (User) afS3S0200100_12.l0;
        UserAttr userAttr = user.getUserAttr();
        if (userAttr == null) {
            userAttr = new UserAttr();
            user.setUserAttr(userAttr);
        }
        userAttr.isMuted = true;
        InterfaceC750500TcG interfaceC750500TcG = (InterfaceC750500TcG) ((WeakReference) afS3S0200100_12.l1).get();
        if (interfaceC750500TcG != null) {
            if (baseResponse != null && (silenceResponse = (SilenceResponse) baseResponse.data) != null && (silenceRes = silenceResponse.data) != null) {
                j = silenceRes.actualDuration;
            } else {
                j = 0;
            }
            interfaceC750500TcG.cd(j, true);
        }
        C751460Tdo.LJ(afS3S0200100_12.j2, ((User) afS3S0200100_12.l0).getId(), ((User) afS3S0200100_12.l0).getSecUid(), true);
        C1C7U.LIZIZ("MuteManager@8a97.muteUser$1");
    }

    public static final void accept$3(AfS3S0200100_12 afS3S0200100_12, Object obj) {
        Exception exc;
        C1C7U.LIZ("MuteManager@8a97.muteUser$2");
        Throwable th = (Throwable) obj;
        C501540Jlg.LIZLLL(C497740JfY.LJII(), th, 2131853482);
        InterfaceC750500TcG interfaceC750500TcG = (InterfaceC750500TcG) ((WeakReference) afS3S0200100_12.l0).get();
        if (interfaceC750500TcG != null) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC750500TcG.ca(exc);
        }
        C751460Tdo.LIZLLL(true, th, afS3S0200100_12.j2, ((User) afS3S0200100_12.l1).getId(), ((User) afS3S0200100_12.l1).getSecUid());
        C1C7U.LIZIZ("MuteManager@8a97.muteUser$2");
    }

    public static final void accept$4(AfS3S0200100_12 afS3S0200100_12, Object obj) {
        C1C7U.LIZ("MuteManager@8a97.unmuteUser$1");
        User user = (User) afS3S0200100_12.l0;
        UserAttr userAttr = user.getUserAttr();
        if (userAttr == null) {
            userAttr = new UserAttr();
            user.setUserAttr(userAttr);
        }
        userAttr.isMuted = false;
        InterfaceC750500TcG interfaceC750500TcG = (InterfaceC750500TcG) ((WeakReference) afS3S0200100_12.l1).get();
        if (interfaceC750500TcG != null) {
            interfaceC750500TcG.cd(0L, false);
        }
        C751460Tdo.LJ(afS3S0200100_12.j2, ((User) afS3S0200100_12.l0).getId(), ((User) afS3S0200100_12.l0).getSecUid(), false);
        C1C7U.LIZIZ("MuteManager@8a97.unmuteUser$1");
    }

    public static final void accept$5(AfS3S0200100_12 afS3S0200100_12, Object obj) {
        Exception exc;
        C1C7U.LIZ("MuteManager@8a97.unmuteUser$2");
        Throwable th = (Throwable) obj;
        C501540Jlg.LIZLLL(C497740JfY.LJII(), th, 2131853482);
        InterfaceC750500TcG interfaceC750500TcG = (InterfaceC750500TcG) ((WeakReference) afS3S0200100_12.l0).get();
        if (interfaceC750500TcG != null) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC750500TcG.ca(exc);
        }
        C751460Tdo.LIZLLL(false, th, afS3S0200100_12.j2, ((User) afS3S0200100_12.l1).getId(), ((User) afS3S0200100_12.l1).getSecUid());
        C1C7U.LIZIZ("MuteManager@8a97.unmuteUser$2");
    }

    public static final void accept$6(AfS3S0200100_12 afS3S0200100_12, Object obj) {
        C1C7U.LIZ("LowDevicesPerformanceTipsManager@e2e8.triggerShowTipsByScene$1");
        C778290Ufz c778290Ufz = (C778290Ufz) afS3S0200100_12.l0;
        EnumC776690UdP enumC776690UdP = (EnumC776690UdP) afS3S0200100_12.l1;
        long j = afS3S0200100_12.j2;
        if (c778290Ufz.LLILZIL.get() < 1 && System.currentTimeMillis() - c778290Ufz.LLILLL.get() >= 180000) {
            C778300Ug0 c778300Ug0 = c778290Ufz.LLILZLL;
            synchronized (c778300Ug0) {
                C773530UVz.LIZ.getClass();
                List<Boolean> list = C773530UVz.LJIIJJI;
                List<Boolean> list2 = C773530UVz.LJIIJ;
                List<Pair<Float, Boolean>> list3 = C773530UVz.LJIIIZ;
                c778300Ug0.LIZLLL();
                c778300Ug0.LIZJ(list);
                c778300Ug0.LJ(list2);
                c778300Ug0.LIZIZ(list3);
            }
            int i = C778320Ug2.LIZ[enumC776690UdP.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    boolean zIsAppForeground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground();
                    boolean z = c778290Ufz.LLILZLL.LIZJ;
                    boolean z2 = c778290Ufz.LLILZLL.LIZLLL;
                    boolean z3 = c778290Ufz.LLILZLL.LIZIZ;
                    Map<String, Object> map = C1338270kvh.LIZ;
                    if (!zIsAppForeground) {
                        if (z3) {
                            c778290Ufz.LIZIZ(EnumC778330Ug3.HIGH_TEMPERATURE_TIP, j, true);
                        } else if (z) {
                            c778290Ufz.LIZIZ(EnumC778330Ug3.LOW_BATTERY_TIP, j, true);
                        } else if (z2) {
                            c778290Ufz.LIZIZ(EnumC778330Ug3.SAVE_MODE_TIP, j, true);
                        }
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                Map<String, Object> map2 = C1338270kvh.LIZ;
                if (c778290Ufz.LLILZLL.LIZ) {
                    c778290Ufz.LLILZIL.getAndAdd(1);
                    c778290Ufz.LLILLL.set(System.currentTimeMillis());
                    C786410Ut5.LJLIIL(1500L, c778290Ufz.LLILLJJLI, new ARunnableS17S0100100_12(c778290Ufz, j, 5));
                }
            }
        } else {
            C20441214yg.LJIIL("LowDevicesPerformanceTipsManager", "tryShowTipsIfInNeed(). tips interval < 180s or tips count this live beyond 1");
        }
        C1C7U.LIZIZ("LowDevicesPerformanceTipsManager@e2e8.triggerShowTipsByScene$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S0200100_12(long r2, com.bytedance.android.live.base.model.user.User r4, java.lang.ref.WeakReference r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 2: goto L10;
                case 3: goto L5;
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.j2 = r2
            r0.l1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.j2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0200100_12.<init>(long, com.bytedance.android.live.base.model.user.User, java.lang.ref.WeakReference, int):void");
    }

    public AfS3S0200100_12(Object obj, long j, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.l1 = obj2;
    }
}
