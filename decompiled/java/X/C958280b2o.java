package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0b2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958280b2o {
    public static final C955540ayO LJI = C955540ayO.LJIIJ;
    public final InterfaceC956060azE LIZ;
    public final InterfaceC956210azT LIZIZ;
    public final DataChannel LIZJ;
    public final Context LIZLLL;
    public final InterfaceC958410b31 LJ;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());

    public static int LJ(List list) {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            if (c954460awe.LJJIIZ != EnumC950200apm.IDLE) {
                arrayList.add(c954460awe);
            }
        }
        return Math.min(C950220apo.LJIIJJI() - arrayList.size(), list.size());
    }

    public static RivalExtraInfo LIZ(C958360b2w c958360b2w, Room room) {
        RivalExtraInfo.Tag tag;
        TagV2 tagV2;
        RivalExtraInfo rivalExtraInfo = new RivalExtraInfo();
        BattleOptPair battleOptPair = c958360b2w.LJ;
        rivalExtraInfo.optPairInfo = battleOptPair.optPairInfo;
        rivalExtraInfo.showPlayType = battleOptPair.playType;
        RivalExtraInfo rivalExtraInfo2 = c958360b2w.LJI.get(Long.valueOf(room.getId()));
        LinkerInfo linkerInfo = null;
        if (rivalExtraInfo2 != null) {
            tag = rivalExtraInfo2.tag;
        } else {
            tag = null;
        }
        rivalExtraInfo.tag = tag;
        RivalExtraInfo rivalExtraInfo3 = c958360b2w.LJI.get(Long.valueOf(room.getId()));
        if (rivalExtraInfo3 != null) {
            tagV2 = rivalExtraInfo3.tagV2;
        } else {
            tagV2 = null;
        }
        rivalExtraInfo.tagV2 = tagV2;
        RivalExtraInfo rivalExtraInfo4 = c958360b2w.LJI.get(Long.valueOf(room.getId()));
        if (rivalExtraInfo4 != null) {
            linkerInfo = rivalExtraInfo4.linkerInfo;
        }
        rivalExtraInfo.linkerInfo = linkerInfo;
        return rivalExtraInfo;
    }

    public final void LIZIZ(C958360b2w c958360b2w, Room room, boolean z) {
        int i;
        TagV2 tagV2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doApply start targetRoomUid:");
        sbLIZ.append(room.getOwnerUserId());
        C20441214yg.LJIIIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<Long, String> concurrentHashMap = C955400ayA.LJJIIJZLJL;
        Long lValueOf = Long.valueOf(room.getOwnerUserId());
        C955400ayA c955400ayA = C955400ayA.LIZ;
        RivalExtraInfo rivalExtraInfo = c958360b2w.LJI.get(Long.valueOf(room.getId()));
        if (rivalExtraInfo != null && (tagV2 = rivalExtraInfo.tagV2) != null) {
            i = tagV2.tagClassification;
        } else {
            i = 0;
        }
        C955540ayO c955540ayO = LJI;
        concurrentHashMap.put(lValueOf, C955400ayA.LJJLIIIJJIZ(c955400ayA, room, i, c955540ayO, false, false, 24));
        this.LIZIZ.GP(new C955590ayT(room, RivalsListsData.TopHostInfo.LIZ, c955540ayO, LIZ(c958360b2w, room), c958360b2w.LJFF, EnumC961080b7K.IDLE), c955540ayO, z, C158B.LIZ());
        InterfaceC958410b31 interfaceC958410b31 = this.LJ;
        if (interfaceC958410b31 != null) {
            interfaceC958410b31.onComplete();
        }
    }

    public final void LIZJ(C958360b2w c958360b2w, List<? extends Room> list, boolean z) {
        if (LJ(list) <= 0) {
            InterfaceC958410b31 interfaceC958410b31 = this.LJ;
            if (interfaceC958410b31 != null) {
                interfaceC958410b31.LIZ(-1002, "not invitable");
                return;
            }
            return;
        }
        LIZLLL(0, list, c958360b2w, z, 0);
    }

    public C958280b2o(InterfaceC956060azE interfaceC956060azE, InterfaceC956210azT interfaceC956210azT, DataChannel dataChannel, Context context, C958310b2r c958310b2r) {
        this.LIZ = interfaceC956060azE;
        this.LIZIZ = interfaceC956210azT;
        this.LIZJ = dataChannel;
        this.LIZLLL = context;
        this.LJ = c958310b2r;
    }

    public final void LIZLLL(final int i, final List<? extends Room> list, final C958360b2w c958360b2w, final boolean z, final int i2) {
        EnumC950200apm enumC950200apm;
        TagV2 tagV2;
        Long lValueOf;
        if (i < list.size() && LJ(list) > 0) {
            Room room = (Room) ListProtector.get(list, i);
            int i3 = 0;
            C954460awe c954460aweLLLI = C915980Zwa.LJII().LLLI(room.getOwnerUserId(), false);
            if (c954460aweLLLI == null || (enumC950200apm = c954460aweLLLI.LJJIIZ) == null) {
                enumC950200apm = EnumC950200apm.IDLE;
            }
            if (enumC950200apm.compareTo(EnumC950200apm.IDLE) > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("doInviteByIndex pass uid:");
                EnumC950200apm enumC950200apm2 = null;
                if (c954460aweLLLI != null) {
                    lValueOf = Long.valueOf(c954460aweLLLI.LJ);
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(" due to state:");
                if (c954460aweLLLI != null) {
                    enumC950200apm2 = c954460aweLLLI.LJJIIZ;
                }
                sbLIZ.append(enumC950200apm2);
                C20441214yg.LJIIIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ));
                LIZLLL(i + 1, list, c958360b2w, z, i2);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("doInviteByIndex start, targetRoomUid:");
            sbLIZ2.append(room.getOwnerUserId());
            C20441214yg.LJIIIZ("BattlePairInviteUtils", C2188811AlT.LIZIZ(sbLIZ2));
            ConcurrentHashMap<Long, String> concurrentHashMap = C955400ayA.LJJIIJZLJL;
            Long lValueOf2 = Long.valueOf(room.getOwnerUserId());
            C955400ayA c955400ayA = C955400ayA.LIZ;
            RivalExtraInfo rivalExtraInfo = c958360b2w.LJI.get(Long.valueOf(room.getId()));
            if (rivalExtraInfo != null && (tagV2 = rivalExtraInfo.tagV2) != null) {
                i3 = tagV2.tagClassification;
            }
            C955540ayO c955540ayO = LJI;
            concurrentHashMap.put(lValueOf2, C955400ayA.LJJLIIIJJIZ(c955400ayA, room, i3, c955540ayO, false, false, 24));
            this.LIZ.ce(new C955590ayT(room, RivalsListsData.TopHostInfo.LIZ, c955540ayO, LIZ(c958360b2w, room), c958360b2w.LJFF, EnumC961080b7K.IDLE), c955540ayO, z, C158B.LIZ(), this.LJ);
            C786410Ut5.LJLIIL(200L, this.LJFF, new Runnable() { // from class: X.0b2s
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BattlePairLinkHelper@8a4e.doInviteByIndex$1");
                    try {
                        this.LL.LIZLLL(i + 1, list, c958360b2w, z, i2 + 1);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BattlePairLinkHelper@8a4e.doInviteByIndex$1");
                }
            });
            return;
        }
        if (i2 > 0) {
            InterfaceC958410b31 interfaceC958410b31 = this.LJ;
            if (interfaceC958410b31 != null) {
                interfaceC958410b31.onComplete();
                return;
            }
            return;
        }
        InterfaceC958410b31 interfaceC958410b312 = this.LJ;
        if (interfaceC958410b312 == null) {
            return;
        }
        interfaceC958410b312.LIZ(-1002, "no invitable anchor");
    }
}
