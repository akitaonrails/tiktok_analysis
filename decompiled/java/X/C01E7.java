package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2.PlayRecordConfigSettingV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.ICountdownApi;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownUser;

/* JADX INFO: renamed from: X.01E7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01E7 implements InterfaceC299101Dx {
    public final DataChannel LIZ;
    public volatile C01E5 LIZLLL;
    public final C11NJ LIZIZ = new C11NJ();
    public volatile HashMap<String, C01E5> LIZJ = new HashMap<>();
    public volatile HashMap<String, C01E9> LJ = new HashMap<>();
    public final CopyOnWriteArrayList<C01EE> LJFF = new CopyOnWriteArrayList<>();
    public final String LJI = LJJ();

    @Override // X.InterfaceC299101Dx
    public void LIZ(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC299101Dx
    public void LIZIZ(List<CountdownContent> list) {
    }

    @Override // X.InterfaceC299101Dx
    public void LIZJ(List<Long> list) {
    }

    @Override // X.InterfaceC299101Dx
    public void LJIIJJI(C01E5 c01e5) {
    }

    @Override // X.InterfaceC299101Dx
    public void LJIIL(C01E5 c01e5) {
    }

    public abstract String LJJ();

    public final List<C01E5> LJIILL() {
        return C13LP.LLIIII(this.LIZJ.values());
    }

    public final C01ED LJIILLIIL() {
        return new C01ED(C13LP.LLIIII(this.LIZJ.values()), C13LP.LLIIII(this.LJ.values()));
    }

    public final C01EB LJIJJLI() {
        Collection<C01E5> collectionValues = this.LIZJ.values();
        if (!collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (C01EF.LIZ(((C01E5) it2.next()).LIZ.status) == C01EB.ONGOING) {
                    return C01EB.ONGOING;
                }
            }
        }
        return this.LIZJ.isEmpty() ? C01EB.IDLE : C01EB.FINISH;
    }

    public final void LJJIIJ() {
        if (PlayRecordConfigSettingV2.INSTANCE.enable()) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(LJIJJLI() == C01EB.ONGOING ? C01EL.START : C01EL.END, "count_down_single");
            }
        }
    }

    @Override // X.InterfaceC299101Dx
    public void destroy() {
        C1AZW.LJIIJ(12, this.LJI, "destroy", null, null);
        this.LJFF.clear();
        this.LIZIZ.dispose();
        LJIILIIL("destroy");
    }

    public C01E7(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC299101Dx
    public void LIZLLL(String str) {
        C01E5 c01e5 = this.LIZJ.get(str);
        if (c01e5 == null) {
            return;
        }
        LJJIIZI(C01E6.LIZ(c01e5, 2));
    }

    public final void LJ(C01EE c01ee) {
        if (!this.LJFF.contains(c01ee)) {
            this.LJFF.add(c01ee);
        }
    }

    @Override // X.InterfaceC299101Dx
    public void LJFF(String str) {
        String str2;
        CountdownContent countdownContent;
        CountdownUser countdownUser;
        if (this.LIZJ.containsKey(str)) {
            this.LIZJ.remove(str);
        }
        C01E5 c01e5 = this.LIZLLL;
        if (c01e5 != null && (countdownContent = c01e5.LIZ) != null && (countdownUser = countdownContent.countdownUser) != null) {
            str2 = countdownUser.linkmicId;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            this.LIZLLL = null;
        }
        if (this.LJ.containsKey(str)) {
            this.LJ.remove(str);
        }
        String strLJJ = LJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCacheByLinkMicId, record = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", userFanTicketMap = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(' ');
        C1AZW.LJIIJ(12, strLJJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC299101Dx
    public void LJIIIZ(C01E5 c01e5) {
        LJJIIZI(c01e5);
        C01E9 c01e9LIZIZ = C01E8.LIZIZ(c01e5.LIZ);
        if (c01e9LIZIZ != null) {
            LJJIIZ(c01e9LIZIZ);
        }
    }

    @Override // X.InterfaceC299101Dx
    public final void LJIIJ(C01E9 c01e9) {
        LJJIIZ(c01e9);
    }

    public final void LJIILIIL(String str) {
        String str2 = this.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCache source=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LIZJ.clear();
        this.LJ.clear();
        this.LIZLLL = null;
    }

    public final C01E9 LJIIZILJ(String str) {
        HashMap map;
        Long lLJIJ;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (map = (HashMap) dataChannel.gg0(C749480Tac.class)) != null && (lLJIJ = LJIJ(str)) != null) {
            return (C01E9) map.get(Long.valueOf(lLJIJ.longValue()));
        }
        return null;
    }

    public final Long LJIJ(String str) {
        CountdownContent countdownContent;
        C01E5 c01e5 = this.LIZJ.get(str);
        if (c01e5 != null && (countdownContent = c01e5.LIZ) != null) {
            return Long.valueOf(countdownContent.countdownId);
        }
        return null;
    }

    public final C01E5 LJIJI(String str) {
        return this.LIZJ.get(str);
    }

    public final Long LJIJJ(String str) {
        long j;
        long jLIZ;
        long jLJIIIIZZ;
        if (this.LIZJ.get(str) == null) {
            return null;
        }
        C01E5 c01e5 = this.LIZJ.get(str);
        if (c01e5 != null) {
            long j2 = c01e5.LIZ.startTime;
            if (c01e5.LIZIZ) {
                jLJIIIIZZ = C01HA.LJIIIIZZ();
            } else {
                jLJIIIIZZ = 0;
            }
            if (C158B.LIZ() + jLJIIIIZZ > j2) {
                jLIZ = ((-jLJIIIIZZ) + C158B.LIZ()) - j2;
                if (jLIZ < 0) {
                    jLIZ = 0;
                }
            } else {
                jLIZ = 0;
            }
            CountdownConfig countdownConfig = c01e5.LIZ.countdownConfig;
            if (countdownConfig == null) {
                return null;
            }
            j = countdownConfig.duration;
        } else {
            j = 0;
            jLIZ = 0;
        }
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        return Long.valueOf(Math.max(((j * j3) - jLIZ) / j3, 0L));
    }

    public final C01EB LJIL(String str) {
        Object obj;
        CountdownContent countdownContent;
        C01EB c01ebLIZ;
        Iterator<T> it2 = this.LIZJ.values().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            CountdownUser countdownUser = ((C01E5) next).LIZ.countdownUser;
            if (countdownUser != null) {
                obj = countdownUser.linkmicId;
            }
            if (Intrinsics.LJFF(obj, str)) {
                obj = next;
                break;
            }
        }
        C01E5 c01e5 = (C01E5) obj;
        if (c01e5 != null && (countdownContent = c01e5.LIZ) != null && (c01ebLIZ = C01EF.LIZ(countdownContent.status)) != null) {
            return c01ebLIZ;
        }
        return C01EB.IDLE;
    }

    public final C01EB LJJI(String str) {
        CountdownContent countdownContent;
        C01E5 c01e5 = this.LIZJ.get(str);
        if (c01e5 != null && (countdownContent = c01e5.LIZ) != null) {
            return C01EF.LIZ(countdownContent.status);
        }
        return null;
    }

    public final void LJJIFFI(Throwable th) {
        if (th == null) {
            return;
        }
        C20441214yg.LJIIL(this.LJI, th.getMessage());
        if (th instanceof C501470JlZ) {
            C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
        } else {
            C930480aJy.LJIIZILJ(C930480aJy.LIZ, C176600m4.LIZ(), th);
        }
    }

    public final boolean LJJII(String str) {
        String str2;
        Collection<C01E5> collectionValues = this.LIZJ.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        for (C01E5 c01e5 : collectionValues) {
            CountdownUser countdownUser = c01e5.LIZ.countdownUser;
            if (countdownUser != null) {
                str2 = countdownUser.linkmicId;
            } else {
                str2 = null;
            }
            if (!Intrinsics.LJFF(str2, str) && C01EF.LIZ(c01e5.LIZ.status) == C01EB.ONGOING) {
                return true;
            }
        }
        return false;
    }

    public final void LJJIII(C01EE c01ee) {
        if (this.LJFF.contains(c01ee)) {
            this.LJFF.remove(c01ee);
        }
    }

    public final void LJJIIJZLJL(CountdownConfig countdownConfig) {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C956850b0V.class, countdownConfig);
        }
    }

    public final void LJJIIZ(C01E9 c01e9) {
        HashMap map;
        C01E9 c01e92;
        long j = 0;
        if (c01e9.LIZLLL == 0) {
            return;
        }
        String str = c01e9.LIZIZ;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            map = (HashMap) dataChannel.gg0(C749480Tac.class);
        } else {
            map = null;
        }
        long j2 = c01e9.LJ;
        if (map != null && (c01e92 = (C01E9) map.get(Long.valueOf(c01e9.LIZJ))) != null) {
            j = c01e92.LJ;
        }
        if (j2 >= j) {
            String strLJJ = LJJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateFanTicket = ");
            sbLIZ.append(c01e9);
            C1AZW.LJIIJ(12, strLJJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            this.LJ.put(str, c01e9);
            if (map != null) {
                map.put(Long.valueOf(c01e9.LIZJ), c01e9);
            }
            Iterator<C01EE> it2 = this.LJFF.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c01e9);
            }
        }
    }

    public void LJJIIZI(C01E5 c01e5) {
        String str;
        C01EB c01ebLIZ;
        CountdownContent countdownContent;
        CountdownUser countdownUser = c01e5.LIZ.countdownUser;
        if (countdownUser != null && (str = countdownUser.linkmicId) != null && !a0.LJJJIL(str)) {
            C01E5 c01e52 = this.LIZJ.get(str);
            if (c01e52 != null && (countdownContent = c01e52.LIZ) != null) {
                c01ebLIZ = C01EF.LIZ(countdownContent.status);
            } else {
                c01ebLIZ = null;
            }
            C01EB c01ebLIZ2 = C01EF.LIZ(c01e5.LIZ.status);
            String strLJJ = LJJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateModel: preState = ");
            sbLIZ.append(c01ebLIZ);
            sbLIZ.append(", currentState = ");
            sbLIZ.append(c01ebLIZ2);
            C1AZW.LJIIJ(12, strLJJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            if (c01ebLIZ2 == C01EB.FINISH) {
                c01e5.LIZLLL = Boolean.TRUE;
            }
            this.LIZLLL = c01e5;
            this.LIZJ.put(str, c01e5);
            if (c01ebLIZ != c01ebLIZ2) {
                int i = C01EA.LIZ[c01ebLIZ2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C299601Ec c299601EcLIZ = C01E8.LIZ(this.LIZLLL);
                            if (c299601EcLIZ != null) {
                                PlayRecordManager.LIZLLL.getClass();
                                InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
                                if (interfaceC924740aAiLIZ != null) {
                                    interfaceC924740aAiLIZ.LIZIZ("count_down_single");
                                }
                                LJJIIJ();
                                Iterator<C01EE> it2 = this.LJFF.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LIZLLL(c299601EcLIZ);
                                }
                                return;
                            }
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C299601Ec c299601EcLIZ2 = C01E8.LIZ(this.LIZLLL);
                    if (c299601EcLIZ2 != null) {
                        PlayRecordManager.LIZLLL.getClass();
                        InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
                        if (interfaceC924740aAiLIZ2 != null) {
                            interfaceC924740aAiLIZ2.LIZ("count_down_single");
                        }
                        LJJIIJ();
                        Iterator<C01EE> it3 = this.LJFF.iterator();
                        while (it3.hasNext()) {
                            it3.next().LIZJ(c299601EcLIZ2);
                        }
                        return;
                    }
                    return;
                }
                C299601Ec c299601EcLIZ3 = C01E8.LIZ(this.LIZLLL);
                if (c299601EcLIZ3 != null) {
                    PlayRecordManager.LIZLLL.getClass();
                    InterfaceC924740aAi interfaceC924740aAiLIZ3 = C920350a3d.LIZ();
                    if (interfaceC924740aAiLIZ3 != null) {
                        interfaceC924740aAiLIZ3.LIZIZ("count_down_single");
                    }
                    LJJIIJ();
                    Iterator<C01EE> it4 = this.LJFF.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZIZ(c299601EcLIZ3);
                    }
                }
            }
        }
    }

    public final void LJJIJ(String str) {
        Object next;
        String str2;
        Iterator<T> it2 = this.LIZJ.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                CountdownUser countdownUser = ((C01E5) next).LIZ.countdownUser;
                if (countdownUser != null) {
                    str2 = countdownUser.linkmicId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C01E5 c01e5 = (C01E5) next;
        if (c01e5 == null) {
            return;
        }
        LJJIIZI(new C01E5(C00XQ.LIZ(c01e5.LIZ, 0), c01e5.LIZIZ, null, 12));
    }

    @Override // X.InterfaceC299101Dx
    public void endOneCountdownPlay(CountdownEndParams countdownEndParams) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZIZ(((ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class)).endOneCountdownPlay(countdownEndParams), this.LJI, "endOneCountdownPlay").LJFF(new C0UO0()), this.LIZIZ, new C516201zk(this, 173), new C516201zk(this, 174), 24);
    }

    @Override // X.InterfaceC299101Dx
    public void startOneCountdownPlay(CountdownStartParams countdownStartParams) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZIZ(((ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class)).startOneCountdownPlay(countdownStartParams), this.LJI, "startOneCountdownPlay").LJFF(new C0UO0()), this.LIZIZ, new C516201zk(this, 176), new C516201zk(this, 177), 24);
    }

    @Override // X.InterfaceC299101Dx
    public void LJII(GetUserPlaySettingsParams getUserPlaySettingsParams, Function1<? super CountdownConfig, Unit> function1) {
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZIZ(((ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class)).getUserPlaySettings(getUserPlaySettingsParams), this.LJI, "getUserPlaySettings").LJFF(new C0UO0()), this.LIZIZ, new C515801zg(function1, this, 29), new C516201zk(function1, 175), 24);
    }

    @Override // X.InterfaceC299101Dx
    public final String LJIIIIZZ(long j, long j2) {
        Object next;
        CountdownContent countdownContent;
        CountdownUser countdownUser;
        Iterator<T> it2 = this.LIZJ.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                CountdownContent countdownContent2 = ((C01E5) next).LIZ;
                CountdownUser countdownUser2 = countdownContent2.countdownUser;
                if (countdownUser2 != null && countdownUser2.userId == j && countdownContent2.countdownId == j2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C01E5 c01e5 = (C01E5) next;
        if (c01e5 == null || (countdownContent = c01e5.LIZ) == null || (countdownUser = countdownContent.countdownUser) == null) {
            return null;
        }
        return countdownUser.linkmicId;
    }

    public final void LJIILJJIL(long j, long j2) {
        Collection<C01E5> collectionValues = this.LIZJ.values();
        ArrayList<C01E5> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (C01EF.LIZ(((C01E5) obj).LIZ.status) == C01EB.ONGOING) {
                arrayList.add(obj);
            }
        }
        for (C01E5 c01e5 : arrayList) {
            CountdownEndParams countdownEndParams = new CountdownEndParams();
            countdownEndParams.roomId = j;
            countdownEndParams.channelId = j2;
            countdownEndParams.endReason = 0;
            countdownEndParams.countdownId = c01e5.LIZ.countdownId;
            endOneCountdownPlay(countdownEndParams);
        }
    }
}
