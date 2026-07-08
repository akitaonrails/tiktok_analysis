package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown;

import X.C01E2;
import X.C01E4;
import X.C01E5;
import X.C01E7;
import X.C01E9;
import X.C01EB;
import X.C01ED;
import X.C01EE;
import X.C01FM;
import X.C01FV;
import X.C01HE;
import X.C1954807lC;
import X.C1AZW;
import X.C2188811AlT;
import X.InterfaceC421301kR;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.ICountdownApi;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownUser;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC948500an2(name = "COUNT_DOWN_SERVICE")
public final class CountDownService implements InterfaceC421301kR {
    public static boolean LIZJ;
    public final DataChannel LIZ;
    public volatile C01E7 LIZIZ;

    public CountDownService() {
        this(null);
    }

    @Override // X.InterfaceC421301kR
    public final C01EB LJIIIZ() {
        if (!LIZJ) {
            return this.LIZIZ.LJIJJLI();
        }
        C1AZW.LJFF("CountdownService", "call getRoomCountdownState after service disabled", null, null);
        return C01EB.IDLE;
    }

    @Override // X.InterfaceC421301kR
    public final List<C01E5> LJIILLIIL() {
        if (LIZJ) {
            return null;
        }
        return this.LIZIZ.LJIILL();
    }

    @Override // X.InterfaceC421301kR
    public final C01ED LJIJI() {
        if (LIZJ) {
            return null;
        }
        return this.LIZIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC421301kR
    public final void LJJ() {
        String str;
        if (LIZJ) {
            return;
        }
        List<C01E5> listLJIILL = this.LIZIZ.LJIILL();
        ArrayList arrayList = new ArrayList();
        Iterator<C01E5> it2 = listLJIILL.iterator();
        while (it2.hasNext()) {
            CountdownUser countdownUser = it2.next().LIZ.countdownUser;
            if (countdownUser != null && (str = countdownUser.linkmicId) != null) {
                arrayList.add(str);
            }
        }
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearAllCountdownInfo, ");
        sbLIZ.append(arrayList);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("CountdownService", strLIZIZ, null, null);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.LIZIZ.LJJIJ((String) it3.next());
        }
    }

    @Override // X.InterfaceC421301kR
    public final void clearCache() {
        this.LIZIZ.LJIILIIL("on onDestroy");
    }

    @Override // X.InterfaceC421301kR
    public final void destroy() {
        this.LIZIZ.destroy();
    }

    public CountDownService(DataChannel dataChannel) {
        C01E7 c01e4;
        this.LIZ = dataChannel;
        int i = C01FM.LIZ[C01HE.LJ().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            c01e4 = new C01E2(dataChannel);
        } else {
            c01e4 = new C01E4(dataChannel);
        }
        this.LIZIZ = c01e4;
    }

    @Override // X.InterfaceC421301kR
    public final void LIZ(SeiAppData seiAppData) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LIZ(seiAppData);
    }

    @Override // X.InterfaceC421301kR
    public final void LIZIZ(List<CountdownContent> list) {
        if (LIZJ) {
            C1AZW.LJIIJ(12, "CountdownService", "resumeLive isServiceDisabled ", null, null);
        } else {
            this.LIZIZ.LIZIZ(list);
        }
    }

    @Override // X.InterfaceC421301kR
    public final void LIZJ(List<Long> list) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LIZJ(list);
    }

    @Override // X.InterfaceC421301kR
    public final void LIZLLL(String str) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LIZLLL(str);
    }

    @Override // X.InterfaceC421301kR
    public final void LJ(C01FV c01fv) {
        C01E7 c01e4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurrentRole role=");
        sbLIZ.append(c01fv);
        C1AZW.LJIIJ(12, "CountdownService", C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZIZ.destroy();
        int i = C01FM.LIZ[c01fv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c01e4 = new C01E2(this.LIZ);
                } else {
                    throw new C1954807lC();
                }
            } else {
                final DataChannel dataChannel = this.LIZ;
                c01e4 = new C01E7(dataChannel) { // from class: X.01E3
                    public final C01E1 LJII;

                    @Override // X.C01E7
                    public final String LJJ() {
                        return "CountdownGuestModel";
                    }

                    @Override // X.C01E7, X.InterfaceC299101Dx
                    public final void destroy() {
                        LIZ();
                        super.destroy();
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.01E1] */
                    {
                        super(dataChannel);
                        this.LJII = new AbstractC299001Dw(dataChannel, this) { // from class: X.01E1
                        };
                    }

                    @Override // X.InterfaceC299101Dx
                    public final void LJI(C01ED c01ed) {
                        List<C01E9> list;
                        List<C01E5> list2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("guest setCountdownCache, fanTicketList = ");
                        if (c01ed != null) {
                            list = c01ed.LIZIZ;
                        } else {
                            list = null;
                        }
                        sbLIZ2.append(list);
                        sbLIZ2.append("\n recordList = ");
                        if (c01ed != null) {
                            list2 = c01ed.LIZ;
                        } else {
                            list2 = null;
                        }
                        sbLIZ2.append(list2);
                        C1AZW.LJIIJ(12, "CountdownGuestModel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                        if (c01ed == null) {
                            return;
                        }
                        List<C01E5> list3 = c01ed.LIZ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        Iterator<C01E5> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(it2.next().LIZ.countdownId));
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        CountdownGetContentParams countdownGetContentParams = new CountdownGetContentParams();
                        countdownGetContentParams.roomId = C01E8.LJFF();
                        countdownGetContentParams.channelId = C01E8.LIZLLL();
                        countdownGetContentParams.countdownIds = arrayList2;
                        C480460Ism.LIZ().getClass();
                        C19487311Lz.LIZJ(C01NB.LIZIZ(((ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class)).getCountdownContents(countdownGetContentParams), this.LJI, "getCountdownContents").LJFF(new C0UO0()), this.LIZIZ, new C516201zk(this, 178), new C516201zk(this, 179), 24);
                        Iterator<C01E9> it3 = c01ed.LIZIZ.iterator();
                        while (it3.hasNext()) {
                            LJJIIZ(it3.next());
                        }
                    }

                    @Override // X.C01E7, X.InterfaceC299101Dx
                    public final void LJIIIZ(C01E5 c01e5) {
                        LJJIIZI(c01e5);
                    }

                    @Override // X.C01E7, X.InterfaceC299101Dx
                    public final void LJIIJJI(C01E5 c01e5) {
                        String str;
                        Long lLJIJJ;
                        CountdownUser countdownUser = c01e5.LIZ.countdownUser;
                        if (countdownUser != null && (str = countdownUser.linkmicId) != null && this.LIZJ.get(str) != null && (lLJIJJ = LJIJJ(str)) != null) {
                            long jLongValue = lLJIJJ.longValue();
                            C1AZW c1azw = C1AZW.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onEndCountdownMessageReceived,remainTime = ");
                            sbLIZ2.append(jLongValue);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            c1azw.getClass();
                            C1AZW.LIZ("CountdownGuestModel", strLIZIZ, null, null);
                            if (c01e5.LIZJ == null && jLongValue <= 0) {
                                LJJIIZI(c01e5);
                                return;
                            }
                            LJJIIZI(C01E6.LIZ(c01e5, 0));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onEndCountdownMessageReceived,operatorUserInfo = ");
                            sbLIZ3.append(c01e5.LIZJ);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                            c1azw.getClass();
                            C1AZW.LIZ("CountdownGuestModel", strLIZIZ2, null, null);
                        }
                    }

                    @Override // X.C01E7, X.InterfaceC299101Dx
                    public final void LJIIL(C01E5 c01e5) {
                        LJJIIZI(c01e5);
                    }

                    @Override // X.C01E7, X.InterfaceC299101Dx
                    public final void endOneCountdownPlay(CountdownEndParams countdownEndParams) {
                        if (C01E8.LJI()) {
                            super.endOneCountdownPlay(countdownEndParams);
                        }
                    }

                    @Override // X.C01E7, X.InterfaceC299101Dx
                    public final void startOneCountdownPlay(CountdownStartParams countdownStartParams) {
                        if (C01E8.LJI()) {
                            super.startOneCountdownPlay(countdownStartParams);
                        }
                    }

                    @Override // X.C01E7, X.InterfaceC299101Dx
                    public final void LJII(GetUserPlaySettingsParams getUserPlaySettingsParams, Function1<? super CountdownConfig, Unit> function1) {
                        if (C01E8.LJI()) {
                            super.LJII(getUserPlaySettingsParams, function1);
                        }
                    }
                };
            }
        } else {
            c01e4 = new C01E4(this.LIZ);
        }
        this.LIZIZ = c01e4;
    }

    @Override // X.InterfaceC421301kR
    public final void LJFF(String str) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LJFF(str);
    }

    @Override // X.InterfaceC421301kR
    public final void LJI(C01ED c01ed) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LJI(c01ed);
    }

    @Override // X.InterfaceC421301kR
    public final void LJIIIIZZ(CountdownConfig countdownConfig) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LJJIIJZLJL(countdownConfig);
    }

    @Override // X.InterfaceC421301kR
    public final C01E9 LJIIJJI(String str) {
        if (LIZJ) {
            return null;
        }
        return this.LIZIZ.LJIIZILJ(str);
    }

    @Override // X.InterfaceC421301kR
    public final C01EB LJIIL(String str) {
        if (LIZJ) {
            return null;
        }
        return this.LIZIZ.LJJI(str);
    }

    @Override // X.InterfaceC421301kR
    public final C01E5 LJIILIIL(String str) {
        return this.LIZIZ.LJIJI(str);
    }

    @Override // X.InterfaceC421301kR
    public final void LJIILJJIL(String str) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LJJIJ(str);
    }

    @Override // X.InterfaceC421301kR
    public final void LJIILL(C01EE c01ee) {
        if (LIZJ) {
            C1AZW.LJFF("CountdownService", "call removeCountdownStateChangeListener after service disabled", null, null);
        } else {
            this.LIZIZ.LJJIII(c01ee);
        }
    }

    @Override // X.InterfaceC421301kR
    public final Long LJIIZILJ(String str) {
        return this.LIZIZ.LJIJJ(str);
    }

    @Override // X.InterfaceC421301kR
    public final Long LJIJ(String str) {
        if (LIZJ) {
            return null;
        }
        return this.LIZIZ.LJIJ(str);
    }

    @Override // X.InterfaceC421301kR
    public final boolean LJIJJ(String str) {
        if (LIZJ) {
            return false;
        }
        return this.LIZIZ.LJJII(str);
    }

    @Override // X.InterfaceC421301kR
    public final C01EB LJIJJLI(String str) {
        return this.LIZIZ.LJIL(str);
    }

    @Override // X.InterfaceC421301kR
    public final void LJIL(C01EE c01ee) {
        if (LIZJ) {
            C1AZW.LJFF("CountdownService", "call addCountdownStateChangeListener after service disabled", null, null);
        } else {
            this.LIZIZ.LJ(c01ee);
        }
    }

    @Override // X.InterfaceC421301kR
    public final void endOneCountdownPlay(CountdownEndParams countdownEndParams) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.endOneCountdownPlay(countdownEndParams);
    }

    @Override // X.InterfaceC421301kR
    public final void startOneCountdownPlay(CountdownStartParams countdownStartParams) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.startOneCountdownPlay(countdownStartParams);
    }

    @Override // X.InterfaceC421301kR
    public final void LJII(GetUserPlaySettingsParams getUserPlaySettingsParams, Function1<? super CountdownConfig, Unit> function1) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LJII(getUserPlaySettingsParams, function1);
    }

    @Override // X.InterfaceC421301kR
    public final void LJIIJ(long j, long j2) {
        if (LIZJ) {
            return;
        }
        this.LIZIZ.LJIILJJIL(j, j2);
    }
}
