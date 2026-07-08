package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.ICountdownApi;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiCountdownGuestInfo;
import com.bytedance.android.livesdk.sei.SeiExtraInfo;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownUser;
import webcast.im.CountdownMessage;

/* JADX INFO: renamed from: X.01E2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01E2 extends C01E7 {
    public final C299201Dy LJII;

    @Override // X.C01E7
    public final String LJJ() {
        return "CountdownAudienceModel";
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void destroy() {
        LIZ();
        super.destroy();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01Dy] */
    public C01E2(final DataChannel dataChannel) {
        super(dataChannel);
        this.LJII = new AbstractC299001Dw(dataChannel, this) { // from class: X.01Dy
            @Override // X.AbstractC299001Dw
            public final void LIZIZ(CountdownMessage countdownMessage) {
            }
        };
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LIZ(SeiAppData seiAppData) {
        C01E9 c01e9LIZIZ;
        String str;
        String str2;
        CountdownContent countdownContent;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List<SeiRegion> list;
        SeiExtraInfo seiExtraInfo;
        SeiCountdownGuestInfo seiCountdownGuestInfo;
        long id;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        User user;
        ArrayList arrayList = new ArrayList();
        if (seiAppData != null && (list = seiAppData.grids) != null) {
            for (SeiRegion seiRegion : list) {
                if (seiRegion != null && (seiExtraInfo = seiRegion.extraInfo) != null && (seiCountdownGuestInfo = seiExtraInfo.guestCountdownInfo) != null) {
                    CountdownContent countdownContent2 = new CountdownContent();
                    countdownContent2.countdownId = seiCountdownGuestInfo.countdownId;
                    countdownContent2.status = seiCountdownGuestInfo.status;
                    countdownContent2.startTime = seiCountdownGuestInfo.startTime;
                    countdownContent2.roomId = C01E8.LJFF();
                    countdownContent2.channelId = C01E8.LIZLLL();
                    CountdownConfig countdownConfig = new CountdownConfig();
                    countdownConfig.duration = seiCountdownGuestInfo.duration;
                    countdownConfig.targetScore = seiCountdownGuestInfo.targetScore;
                    countdownContent2.countdownConfig = countdownConfig;
                    CountdownUser countdownUser = new CountdownUser();
                    countdownUser.linkmicId = seiRegion.uidStr;
                    InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                    if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIIZILJ(seiRegion.uidStr)) != null && (user = linkListUser.user) != null) {
                        id = user.getId();
                    } else {
                        id = 0;
                    }
                    countdownUser.userId = id;
                    countdownContent2.countdownUser = countdownUser;
                    arrayList.add(new C01E5(countdownContent2, true, null, 12));
                }
            }
        }
        List<C01E5> listLJIILL = LJIILL();
        ArrayList<C01E5> arrayList2 = new ArrayList();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIILL, 10));
        int i = 16;
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C01E5 c01e5 : listLJIILL) {
            CountdownUser countdownUser2 = c01e5.LIZ.countdownUser;
            if (countdownUser2 != null) {
                str7 = countdownUser2.linkmicId;
            } else {
                str7 = null;
            }
            linkedHashMap.put(str7, c01e5);
        }
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ2 >= 16) {
            i = iLIZIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (Object obj : arrayList) {
            CountdownUser countdownUser3 = ((C01E5) obj).LIZ.countdownUser;
            if (countdownUser3 != null) {
                str6 = countdownUser3.linkmicId;
            } else {
                str6 = null;
            }
            linkedHashMap2.put(str6, obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            Set setKeySet = linkedHashMap.keySet();
            CountdownUser countdownUser4 = ((C01E5) obj2).LIZ.countdownUser;
            if (countdownUser4 != null) {
                str5 = countdownUser4.linkmicId;
            } else {
                str5 = null;
            }
            if (!setKeySet.contains(str5)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<C01E5> arrayList4 = new ArrayList();
        for (C01E5 c01e52 : listLJIILL) {
            Set setKeySet2 = linkedHashMap2.keySet();
            CountdownUser countdownUser5 = c01e52.LIZ.countdownUser;
            if (countdownUser5 != null) {
                str4 = countdownUser5.linkmicId;
            } else {
                str4 = null;
            }
            if (!setKeySet2.contains(str4)) {
                arrayList4.add(c01e52);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (C01E5 c01e53 : arrayList4) {
            arrayList5.add(new C01E5(C00XQ.LIZ(c01e53.LIZ, 0), c01e53.LIZIZ, null, 12));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList) {
            C01E5 c01e54 = (C01E5) obj3;
            Set setKeySet3 = linkedHashMap.keySet();
            CountdownUser countdownUser6 = c01e54.LIZ.countdownUser;
            if (countdownUser6 != null) {
                str = countdownUser6.linkmicId;
            } else {
                str = null;
            }
            if (setKeySet3.contains(str)) {
                CountdownUser countdownUser7 = c01e54.LIZ.countdownUser;
                if (countdownUser7 != null) {
                    str2 = countdownUser7.linkmicId;
                } else {
                    str2 = null;
                }
                C01E5 c01e55 = (C01E5) linkedHashMap.get(str2);
                if (c01e55 != null && (countdownContent = c01e55.LIZ) != null && c01e54.LIZ.status == countdownContent.status) {
                    CountdownUser countdownUser8 = c01e54.LIZ.countdownUser;
                    if (countdownUser8 != null) {
                        str3 = countdownUser8.linkmicId;
                    } else {
                        str3 = null;
                    }
                    C01E5 c01e56 = (C01E5) linkedHashMap.get(str3);
                    if (c01e56 == null || c01e54.LIZIZ != c01e56.LIZIZ) {
                    }
                }
                arrayList6.add(obj3);
            }
        }
        arrayList2.addAll(arrayList3);
        arrayList2.addAll(arrayList5);
        arrayList2.addAll(arrayList6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseSeiToModel, seiContentList = ");
        sbLIZ.append(arrayList);
        sbLIZ.append(" , cacheContentList = ");
        sbLIZ.append(listLJIILL);
        sbLIZ.append(", diffList = ");
        sbLIZ.append(arrayList2);
        C20441214yg.LIZIZ("CountdownAudienceModel", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            LJJIIZI((C01E5) it2.next());
        }
        for (C01E5 c01e57 : arrayList2) {
            if (C01EF.LIZ(c01e57.LIZ.status) != C01EB.IDLE && (c01e9LIZIZ = C01E8.LIZIZ(c01e57.LIZ)) != null) {
                LJJIIZ(c01e9LIZIZ);
            }
        }
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LIZJ(List<Long> list) {
        if (list == null) {
            return;
        }
        CountdownGetContentParams countdownGetContentParams = new CountdownGetContentParams();
        countdownGetContentParams.roomId = C01E8.LJFF();
        countdownGetContentParams.channelId = C01E8.LIZLLL();
        countdownGetContentParams.countdownIds = list;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        InterfaceC420801kM interfaceC420801kMLJJIIZ = C01NB.LIZIZ(((ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class)).getCountdownContents(countdownGetContentParams), this.LJI, "getCountdownContents").LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 165), new C516201zk(this, 166));
        C11NJ c11nj = this.LIZIZ;
        c930480aJy.getClass();
        c11nj.LIZ(interfaceC420801kMLJJIIZ);
    }

    @Override // X.InterfaceC299101Dx
    public final void LJI(C01ED c01ed) {
        List<C01E9> list;
        List<C01E5> list2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audience setCountdownCache, fanTicketList = ");
        if (c01ed != null) {
            list = c01ed.LIZIZ;
        } else {
            list = null;
        }
        sbLIZ.append(list);
        sbLIZ.append("\n recordList = ");
        if (c01ed != null) {
            list2 = c01ed.LIZ;
        } else {
            list2 = null;
        }
        sbLIZ.append(list2);
        C1AZW.LJIIJ(12, "CountdownAudienceModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (c01ed == null) {
            return;
        }
        Iterator<C01E9> it2 = c01ed.LIZIZ.iterator();
        while (it2.hasNext()) {
            LJJIIZ(it2.next());
        }
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void endOneCountdownPlay(CountdownEndParams countdownEndParams) {
        if (C01E8.LJI()) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            C480460Ism.LIZ().getClass();
            InterfaceC420801kM interfaceC420801kMLJJIIZ = C01NB.LIZIZ(((ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class)).endOneCountdownPlay(countdownEndParams), this.LJI, "endOneCountdownPlay").LJFF(new C0UO0()).LJJIIZ(new C515801zg(this, countdownEndParams, 25), new C516201zk(this, 164));
            C11NJ c11nj = this.LIZIZ;
            c930480aJy.getClass();
            c11nj.LIZ(interfaceC420801kMLJJIIZ);
        }
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void startOneCountdownPlay(CountdownStartParams countdownStartParams) {
        if (C01E8.LJI()) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            C480460Ism.LIZ().getClass();
            InterfaceC420801kM interfaceC420801kMLJJIIZ = C01NB.LIZIZ(((ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class)).startOneCountdownPlay(countdownStartParams), this.LJI, "startOneCountdownPlay").LJFF(new C0UO0()).LJJIIZ(new C516201zk(this, 167), new C516201zk(this, 168));
            C11NJ c11nj = this.LIZIZ;
            c930480aJy.getClass();
            c11nj.LIZ(interfaceC420801kMLJJIIZ);
        }
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LJII(GetUserPlaySettingsParams getUserPlaySettingsParams, Function1<? super CountdownConfig, Unit> function1) {
        if (C01E8.LJI()) {
            super.LJII(getUserPlaySettingsParams, function1);
        }
    }
}
