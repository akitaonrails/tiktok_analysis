package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0abt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC941590abt {
    public final DataChannel LL;
    public final C941630abx LLILLJJLI;
    public final Function1<FanTicketRoomNoticeContent, Unit> LLILLL;
    public final Function0<List<InterfaceC941650abz>> LLILZ;
    public FanTicketRoomNoticeContent LLILZIL;

    public abstract String LIZ();

    public abstract void onDestroy();

    public final void LIZIZ() {
        int i = C320901Mh.LIZJ() ? this.LLILLJJLI.LJFF : this.LLILLJJLI.LJI;
        String strLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScoreTypeChanged: ");
        sbLIZ.append(i);
        C320901Mh.LIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ));
        Iterator<T> it2 = this.LLILZ.invoke().iterator();
        while (it2.hasNext()) {
            ((InterfaceC941650abz) it2.next()).LIZLLL(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC941590abt(DataChannel dataChannel, C941630abx c941630abx, Function1<? super FanTicketRoomNoticeContent, Unit> function1, Function0<? extends List<? extends InterfaceC941650abz>> function0) {
        this.LL = dataChannel;
        this.LLILLJJLI = c941630abx;
        this.LLILLL = function1;
        this.LLILZ = function0;
    }

    public final void LIZJ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent, boolean z, boolean z2, String str) {
        long j;
        AbstractC928510aGn abstractC928510aGnLIZ;
        Map<Long, Long> mapLJJIIZI;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        Map<Long, Long> mapLJJIIZI2;
        int size;
        long jLongValue;
        int iIntValue;
        List<LinkUser> listLIZLLL;
        if (fanTicketRoomNoticeContent == null) {
            return;
        }
        long j2 = this.LLILLJJLI.LJII;
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent2 = this.LLILZIL;
        if (fanTicketRoomNoticeContent2 != null) {
            j = fanTicketRoomNoticeContent2.version;
        } else {
            j = 0;
        }
        String strLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTicketContentReceive source:");
        sbLIZ.append(str);
        sbLIZ.append(" fanTicketRoomNotice: ");
        sbLIZ.append(fanTicketRoomNoticeContent);
        sbLIZ.append(" version:");
        sbLIZ.append(fanTicketRoomNoticeContent.version);
        sbLIZ.append(" processedVersion:");
        sbLIZ.append(j2);
        sbLIZ.append(" lastVersion:");
        sbLIZ.append(j);
        sbLIZ.append("isNeedCheckVersion:");
        sbLIZ.append(z);
        sbLIZ.append(" hasScoreTypeUpdated:");
        sbLIZ.append(z2);
        C320901Mh.LIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ));
        if (fanTicketRoomNoticeContent.version < j && z) {
            if (z2) {
                LIZIZ();
            }
        } else {
            String strLIZ2 = LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onTicketContentReceive, and version has updated, fanTicketRoomNotice: ");
            sbLIZ2.append(fanTicketRoomNoticeContent);
            C320901Mh.LIZ(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2));
            List<UserFanTicket> list = fanTicketRoomNoticeContent.userFanTicket;
            if (list != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (UserFanTicket userFanTicket : list) {
                    linkedHashMap.put(Long.valueOf(userFanTicket.userId), Long.valueOf(userFanTicket.fanTicket));
                    linkedHashMap5.put(Long.valueOf(userFanTicket.userId), Integer.valueOf(userFanTicket.topGuestRank));
                    UserPlayInfo userPlayInfo = userFanTicket.playInfo;
                    if (userPlayInfo != null) {
                        linkedHashMap2.put(Long.valueOf(userFanTicket.userId), userPlayInfo);
                    }
                    linkedHashMap4.put(Long.valueOf(userFanTicket.userId), userFanTicket.animationName);
                    linkedHashMap3.put(Long.valueOf(userFanTicket.userId), new C941850acJ(userFanTicket.iconName, userFanTicket.ticketUiStyleV2, userFanTicket.completionProgressPercent));
                }
                long j3 = fanTicketRoomNoticeContent.version;
                int size2 = list.size();
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                    size = listLIZLLL.size();
                } else {
                    size = 0;
                }
                if (size2 < size) {
                    Iterator<User> it2 = C915980Zwa.LIZLLL().M30().iterator();
                    while (it2.hasNext()) {
                        long id = it2.next().getId();
                        if (linkedHashMap.get(Long.valueOf(id)) == null) {
                            Long lValueOf = Long.valueOf(id);
                            Long l = this.LLILLJJLI.LIZ.get(Long.valueOf(id));
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            linkedHashMap.put(lValueOf, Long.valueOf(jLongValue));
                            Long lValueOf2 = Long.valueOf(id);
                            UserPlayInfo userPlayInfo2 = this.LLILLJJLI.LIZJ.get(Long.valueOf(id));
                            if (userPlayInfo2 == null) {
                                userPlayInfo2 = new UserPlayInfo();
                            }
                            linkedHashMap2.put(lValueOf2, userPlayInfo2);
                            Long lValueOf3 = Long.valueOf(id);
                            C941850acJ c941850acJ = this.LLILLJJLI.LJ.get(Long.valueOf(id));
                            if (c941850acJ == null) {
                                c941850acJ = new C941850acJ(0);
                            }
                            linkedHashMap3.put(lValueOf3, c941850acJ);
                            linkedHashMap4.put(Long.valueOf(id), this.LLILLJJLI.LIZLLL.get(Long.valueOf(id)));
                            Long lValueOf4 = Long.valueOf(id);
                            Integer num = this.LLILLJJLI.LIZIZ.get(Long.valueOf(id));
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            linkedHashMap5.put(lValueOf4, Integer.valueOf(iIntValue));
                        }
                    }
                }
                boolean z3 = !Intrinsics.LJFF(this.LLILLJJLI.LIZ, linkedHashMap);
                boolean z4 = !Intrinsics.LJFF(this.LLILLJJLI.LIZJ, linkedHashMap2);
                boolean z5 = !Intrinsics.LJFF(this.LLILLJJLI.LJ, linkedHashMap3);
                boolean z6 = !Intrinsics.LJFF(this.LLILLJJLI.LIZIZ, linkedHashMap5);
                this.LLILLJJLI.LIZIZ = linkedHashMap5;
                this.LLILLJJLI.LIZLLL = linkedHashMap4;
                this.LLILLJJLI.LJ = linkedHashMap3;
                this.LLILLJJLI.LIZ = linkedHashMap;
                this.LLILLJJLI.LIZJ = linkedHashMap2;
                this.LLILLJJLI.LJII = j3;
                if (z2) {
                    LIZIZ();
                }
                if (z3 || z6) {
                    Iterator<T> it3 = this.LLILZ.invoke().iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC941650abz) it3.next()).LIZ(linkedHashMap);
                    }
                }
                if (z4) {
                    Iterator<T> it4 = this.LLILZ.invoke().iterator();
                    while (it4.hasNext()) {
                        ((InterfaceC941650abz) it4.next()).LIZJ(linkedHashMap2);
                    }
                }
                if (z5) {
                    Iterator<T> it5 = this.LLILZ.invoke().iterator();
                    while (it5.hasNext()) {
                        ((InterfaceC941650abz) it5.next()).LIZIZ(linkedHashMap3);
                    }
                }
            }
            this.LLILLL.invoke(fanTicketRoomNoticeContent);
            for (UserFanTicket userFanTicket2 : fanTicketRoomNoticeContent.userFanTicket) {
                long j4 = userFanTicket2.userId;
                if (C930540aK4.LIZJ()) {
                    InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (mapLJJIIZI = abstractC928510aGnLIZ.LJJIIZI()) != null) {
                        mapLJJIIZI.put(Long.valueOf(j4), Long.valueOf(userFanTicket2.fanTicket));
                    }
                } else {
                    InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                    if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ2 = interfaceC917640ZzG.LIZ()) != null && (mapLJJIIZI2 = abstractC928510aGnLIZ2.LJJIIZI()) != null) {
                        mapLJJIIZI2.put(Long.valueOf(j4), Long.valueOf(userFanTicket2.fanTicket));
                    }
                }
            }
        }
        this.LLILZIL = fanTicketRoomNoticeContent;
    }
}
