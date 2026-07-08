package X;

import Y.ARunnableS117S0100000_17;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.privilege.LiveAdvanceMessageQueueWithGapSetting;
import com.bytedance.android.livesdk.livesetting.privilege.LivePrivilegeAnnouncementContainerSetting;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ePJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1087550ePJ {
    public static final EnumC1087550ePJ INSTANCE;
    public static final /* synthetic */ EnumC1087550ePJ[] LLJI;
    public C1087560ePK LL;
    public WeakReference<InterfaceC781280Uko> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public final ArrayDeque<BaseMessage> LLILZLL = new ArrayDeque<>();
    public final ARunnableS117S0100000_17 LLIZ = new ARunnableS117S0100000_17(this, 153);
    public List<C001A> LLIZLLLIL;
    public List<BaseMessage> LLJ;
    public PollMessage pollMessage;

    public void onMessageFinish() {
        this.LLILLL = false;
        LJIIIZ();
    }

    static {
        EnumC1087550ePJ enumC1087550ePJ = new EnumC1087550ePJ();
        INSTANCE = enumC1087550ePJ;
        LLJI = new EnumC1087550ePJ[]{enumC1087550ePJ};
    }

    public static EnumC1087550ePJ[] values() {
        return (EnumC1087550ePJ[]) LLJI.clone();
    }

    public final boolean LJI() {
        C1087560ePK c1087560ePK = this.LL;
        return (c1087560ePK != null && c1087560ePK.LIZ.size() > 0) || !this.LLILZLL.isEmpty();
    }

    public final void LJIIIZ() {
        C1087560ePK c1087560ePK;
        BaseMessage baseMessage;
        if (!this.LLILZ || this.LLILLJJLI == null || (c1087560ePK = this.LL) == null) {
            if (this.LLILLL) {
                return;
            }
            LJI();
            return;
        }
        if (this.LLILLL) {
            return;
        }
        if (c1087560ePK.LIZ.isEmpty() || (baseMessage = ((C1087570ePL) ListProtector.remove(c1087560ePK.LIZ, 0)).LIZ) == null) {
            if (this.LLILZLL.isEmpty()) {
                return;
            }
            LJIIJ();
            return;
        }
        this.LLILLL = true;
        List<C001A> list = this.LLIZLLLIL;
        if (list != null) {
            if (((ArrayList) list).contains(baseMessage.getMessageType())) {
                List<BaseMessage> list2 = this.LLJ;
                if (list2 != null) {
                    ((ArrayList) list2).add(baseMessage);
                }
                onMessageFinish();
                return;
            }
        }
        if (!LiveAdvanceMessageQueueWithGapSetting.INSTANCE.getValue()) {
            LJFF(baseMessage);
            return;
        }
        if (!LJII(baseMessage) || LIZJ(baseMessage) <= 0) {
            LJFF(baseMessage);
            return;
        }
        this.LLILZLL.addLast(baseMessage);
        this.LLILLL = false;
        LJIIJ();
        LJIIIZ();
    }

    public final void LJIIJ() {
        if (this.LLILZLL.isEmpty() || !this.LLILZ) {
            C473410IhP.LJ(this.LLIZ);
            return;
        }
        long jMax = 0;
        if (!this.LLILZLL.isEmpty()) {
            if (this.LLILLL) {
                jMax = 50;
            } else {
                BaseMessage baseMessagePeekFirst = this.LLILZLL.peekFirst();
                if (baseMessagePeekFirst != null) {
                    jMax = Math.max(LIZJ(baseMessagePeekFirst), 0L);
                }
            }
        }
        C473410IhP.LJ(this.LLIZ);
        C473410IhP.LIZJ(this.LLIZ, jMax);
    }

    public void stop() {
        C473410IhP.LJ(this.LLIZ);
        this.LLILZLL.clear();
        this.LLILLJJLI = null;
        this.LL = null;
        this.LLILZ = false;
        this.LLILLL = false;
        this.LLILZIL = 0L;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    public static boolean LJII(BaseMessage baseMessage) {
        RoomNotifyMessage roomNotifyMessage;
        CommonMessageData commonMessageData;
        long id;
        if (!(baseMessage instanceof PrivilegeAdvanceMessage)) {
            return false;
        }
        PrivilegeAdvanceMessage privilegeAdvanceMessage = (PrivilegeAdvanceMessage) baseMessage;
        if (!"gift_broadcast_msg".equals(privilegeAdvanceMessage.subType) || (roomNotifyMessage = privilegeAdvanceMessage.notify) == null || (commonMessageData = roomNotifyMessage.baseMessage) == null) {
            return false;
        }
        long j = commonMessageData.roomId;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (j <= 0 || id <= 0 || j == id) {
            return false;
        }
        return true;
    }

    public static EnumC1087550ePJ valueOf(String str) {
        return (EnumC1087550ePJ) C08FF.LIZ(EnumC1087550ePJ.class, str);
    }

    public final long LIZJ(BaseMessage baseMessage) {
        if (!LiveAdvanceMessageQueueWithGapSetting.INSTANCE.getValue() || !LJII(baseMessage)) {
            return 0L;
        }
        if (this.LLILZIL <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lastMessageStartTimestamp ");
            sbLIZ.append(this.LLILZIL);
            C20441214yg.LJ("GapQueue", C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZIL;
        if (jElapsedRealtime >= 15000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("elapsed --->");
            sbLIZ2.append(jElapsedRealtime);
            C20441214yg.LJ("GapQueue", C2188811AlT.LIZIZ(sbLIZ2));
            return 0L;
        }
        return 15000 - jElapsedRealtime;
    }

    public final void LJFF(BaseMessage baseMessage) {
        InterfaceC781280Uko interfaceC781280Uko;
        WeakReference<InterfaceC781280Uko> weakReference = this.LLILLJJLI;
        if (weakReference == null || (interfaceC781280Uko = weakReference.get()) == null) {
            return;
        }
        this.LLILZIL = SystemClock.elapsedRealtime();
        if (!LivePrivilegeAnnouncementContainerSetting.INSTANCE.getValue() && (baseMessage instanceof PrivilegeAdvanceMessage)) {
            PrivilegeAdvanceMessage privilegeAdvanceMessage = (PrivilegeAdvanceMessage) baseMessage;
            RoomNotifyMessage roomNotifyMessage = privilegeAdvanceMessage.notify;
            if (roomNotifyMessage != null) {
                roomNotifyMessage.source = privilegeAdvanceMessage.scene;
                roomNotifyMessage.logExtra = privilegeAdvanceMessage.privilegeLogExtra;
                roomNotifyMessage.LLILLL = privilegeAdvanceMessage.leftIcon;
                roomNotifyMessage.LLILZ = true;
            }
            interfaceC781280Uko.JF(roomNotifyMessage);
            return;
        }
        interfaceC781280Uko.JF(baseMessage);
    }

    public void add(BaseMessage baseMessage) {
        add(baseMessage, 0);
    }

    public void addSuppressMessage(List<C001A> list) {
        if (this.LLIZLLLIL != null) {
            for (C001A c001a : list) {
                if (!this.LLIZLLLIL.contains(c001a)) {
                    this.LLIZLLLIL.add(c001a);
                }
            }
        }
    }

    public void registerFinishCallback(InterfaceC1087580ePM interfaceC1087580ePM) {
        if (!LJI() && !this.LLILLL && interfaceC1087580ePM != null) {
            interfaceC1087580ePM.LIZLLL();
        }
    }

    public void removeSuppressMessage(List<C001A> list) {
        if (this.LLIZLLLIL != null) {
            for (C001A c001a : list) {
                if (((ArrayList) this.LLIZLLLIL).contains(c001a)) {
                    ((ArrayList) this.LLIZLLLIL).remove(c001a);
                }
            }
        }
        List<BaseMessage> list2 = this.LLJ;
        if (list2 != null) {
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                BaseMessage baseMessage = (BaseMessage) it2.next();
                if (list.contains(baseMessage.getMessageType())) {
                    it2.remove();
                    C1087560ePK c1087560ePK = this.LL;
                    if (c1087560ePK != null) {
                        c1087560ePK.LIZ(baseMessage, 0);
                    }
                }
            }
        }
        LJIIIZ();
    }

    public void start(WeakReference<InterfaceC781280Uko> weakReference) {
        this.LLILLJJLI = weakReference;
        this.LL = new C1087560ePK();
        this.LLILZ = true;
        this.LLILLL = false;
        this.LLILZIL = 0L;
        C473410IhP.LJ(this.LLIZ);
        this.LLILZLL.clear();
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = new ArrayList();
    }

    public void add(BaseMessage baseMessage, int i) {
        CommonMessageData commonMessageData;
        if (this.LLILZ && baseMessage != null && this.LL != null) {
            if (LiveAdvanceMessageQueueWithGapSetting.INSTANCE.getValue() && (baseMessage instanceof PrivilegeAdvanceMessage) && (commonMessageData = baseMessage.baseMessage) != null) {
                long j = commonMessageData.roomId;
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    long id = room.getId();
                    if (id > 0 && j == id) {
                        if (i > 2147482647) {
                            i = Integer.MAX_VALUE;
                        } else {
                            i += LSPassThroughRecordSizeConfig.DEFAULT;
                        }
                    }
                }
            }
            this.LL.LIZ(baseMessage, i);
            LJIIIZ();
        }
    }
}
