package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01JG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JG implements InterfaceC1112400f3O {
    public final C01GW LL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(452));

    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return C952230at3.LIZ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
        long id;
        String str;
        if (Intrinsics.LJFF("live_goal_guide", ((CapsuleMessage) c1112330f3H.LJIL).scene)) {
            CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
            String str2 = null;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01JF(this, false, null), 3);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                LiveMode streamType = room.getStreamType();
                if (streamType != null) {
                    str2 = streamType.logStreamingType;
                }
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                User owner = room.getOwner();
                if (owner != null) {
                    id = owner.getId();
                } else {
                    id = 0;
                }
                long id2 = room.getId();
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                Text text = capsuleMessage.desc;
                if (text != null && (str = text.defaultPattern) != null) {
                    str3 = str;
                }
                C238200w0.LIZ(str2, id, id2, currentUserId, 0L, "anchor", "set_goal", str3);
            }
        }
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
        String str;
        long id;
        String str2;
        if (!Intrinsics.LJFF("live_goal_guide", ((CapsuleMessage) c1112330f3H.LJIL).scene)) {
            return;
        }
        CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
        C20337914i1<Integer> c20337914i1 = InterfaceC1094160eZy.o2;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            LiveMode streamType = room.getStreamType();
            if (streamType != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            User owner = room.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            long id2 = room.getId();
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            Text text = capsuleMessage.desc;
            if (text != null && (str2 = text.defaultPattern) != null) {
                str3 = str2;
            }
            C238200w0.LIZIZ(str, id, id2, currentUserId, 0L, "anchor", "set_goal", str3);
        }
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        boolean z;
        if (!Intrinsics.LJFF("live_goal_guide", capsuleMessage.scene)) {
            return false;
        }
        Integer numLIZIZ = InterfaceC1094160eZy.o2.LIZIZ();
        if (numLIZIZ != null && numLIZIZ.intValue() >= 5) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        if (z2) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01JF(this, false, null), 3);
        }
        return z2;
    }
}
