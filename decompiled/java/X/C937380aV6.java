package X;

import android.util.ArrayMap;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937380aV6 extends C1117360fBO {
    public final MultiGuestGiftSwitchTargetDialog LLILLL;
    public final User LLILZ;
    public final List<LinkListUser> LLILZIL;
    public final DataChannel LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public Function0<Unit> LLJ;
    public int LLJI;
    public final List<LinkListUser> LLJIJIL;

    public static List LLLIIIIL(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User user = ((LinkListUser) it2.next()).user;
            if (user != null) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    public final void LLLIL(List<LinkListUser> list) {
        LinkListUser next;
        LinkListUser next2;
        C1121570fIB c1121570fIB;
        long jLongValue;
        Iterator<LinkListUser> it2 = list.iterator();
        User user = null;
        if (it2.hasNext()) {
            next = it2.next();
        } else {
            next = null;
        }
        LinkListUser linkListUser = next;
        if (linkListUser != null && linkListUser.user != null) {
            if (list.size() > 1) {
                c1121570fIB = new C1121570fIB((List<? extends User>) LLLIIIIL(list));
            } else {
                Iterator<LinkListUser> it3 = list.iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                } else {
                    next2 = null;
                }
                LinkListUser linkListUser2 = next2;
                if (linkListUser2 != null) {
                    user = linkListUser2.user;
                }
                c1121570fIB = new C1121570fIB(user);
            }
            Long l = this.LLILLL.LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCurrentSelectGiftId = ");
            sbLIZ.append(l);
            C20441214yg.LIZIZ("send_gift_to_all", C2188811AlT.LIZIZ(sbLIZ));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c1121570fIB.LJIIIZ = jLongValue;
            c1121570fIB.LIZJ = this.LLIZLLLIL;
            c1121570fIB.LJII = true;
            Function0<Unit> function0 = this.LLJ;
            if (function0 != null) {
                function0.invoke();
            }
            DataChannel dataChannel = this.LLILZLL;
            if (dataChannel != null) {
                dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
            }
        }
    }

    public final void LLLILZ(List<LinkListUser> list) {
        DataChannel dataChannel;
        Room room;
        Long lValueOf;
        if (!this.LLIZ || list.size() > 1) {
            return;
        }
        Iterator<LinkListUser> it2 = list.iterator();
        LinkListUser next = null;
        if (it2.hasNext()) {
            next = it2.next();
        }
        LinkListUser linkListUser = next;
        if (linkListUser != null && (dataChannel = this.LLILZLL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (lValueOf = Long.valueOf(room.getId())) != null) {
            long jLongValue = lValueOf.longValue();
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            User user = linkListUser.user;
            if (user != null) {
                long id = user.getId();
                if (multiGuestDataHolder != null) {
                    ((ArrayMap) multiGuestDataHolder.LJJIIZ).put(Long.valueOf(jLongValue), Long.valueOf(id));
                }
            }
        }
    }

    public final void LLLIILIL(List list, boolean z, boolean z2) {
        ((ArrayList) this.LLJIJIL).clear();
        ((ArrayList) this.LLJIJIL).addAll(list);
        if (z2) {
            if (this.LLILLL.isShowing()) {
                this.LLILLL.dismiss();
            }
            LLLIL(list);
        }
        LLLILZ(list);
        if (!z) {
            notifyDataSetChanged();
        }
    }

    public C937380aV6(MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog, User user, List<LinkListUser> list, DataChannel dataChannel, boolean z, String str, Function0<Unit> function0) {
        Long lValueOf;
        this.LLILLL = multiGuestGiftSwitchTargetDialog;
        this.LLILZ = user;
        this.LLILZIL = list;
        this.LLILZLL = dataChannel;
        this.LLIZ = z;
        this.LLIZLLLIL = str;
        this.LLJ = function0;
        Iterator it2 = ((ArrayList) list).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LinkListUser linkListUser = (LinkListUser) it2.next();
            if (linkListUser instanceof LinkListUser) {
                User user2 = linkListUser.user;
                if (user2 != null) {
                    lValueOf = Long.valueOf(user2.getId());
                } else {
                    lValueOf = null;
                }
                User user3 = this.LLILZ;
                if (Intrinsics.LJFF(lValueOf, user3 != null ? Long.valueOf(user3.getId()) : null)) {
                    if (i2 != -1) {
                        i = i2;
                    }
                }
            }
            i2++;
        }
        this.LLJI = i;
        this.LLJIJIL = new ArrayList();
    }
}
