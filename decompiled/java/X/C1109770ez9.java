package X;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ez9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109770ez9 {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public final boolean LJI;
    public final Room LJII;
    public final User LJIIIIZZ;
    public DataChannel LJIIIZ;
    public final InterfaceC180800mk LJIIJ;
    public final InterfaceC1110630f0X LJIIJJI;
    public final C01GW LJIIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(279));
    public final C01GW LJIILIIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(280));
    public final C01GW LJIILJJIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(278));
    public final C01GW LJIILL = C292401Bi.LIZ(new AwS561S0100000_17(this, 568));
    public final C01GW LJIILLIIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(277));
    public final long LJIIZILJ;
    public long LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public boolean LJIJJLI;
    public final long LJIL;
    public boolean LJJ;
    public EnumC1112150f2z LJJI;
    public boolean LJJIFFI;
    public long LJJII;
    public float LJJIII;
    public long LJJIIJ;
    public int LJJIIJZLJL;
    public long LJJIIZ;
    public boolean LJJIIZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1109770ez9)) {
            return false;
        }
        C1109770ez9 c1109770ez9 = (C1109770ez9) obj;
        return Intrinsics.LJFF(this.LIZ, c1109770ez9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1109770ez9.LIZIZ) && this.LIZJ == c1109770ez9.LIZJ && this.LIZLLL == c1109770ez9.LIZLLL && this.LJ == c1109770ez9.LJ && this.LJFF == c1109770ez9.LJFF && this.LJI == c1109770ez9.LJI && Intrinsics.LJFF(this.LJII, c1109770ez9.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1109770ez9.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1109770ez9.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1109770ez9.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1109770ez9.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        Room room = this.LJII;
        int iHashCode2 = (iHashCode + (room == null ? 0 : room.hashCode())) * 31;
        User user = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        DataChannel dataChannel = this.LJIIIZ;
        return ((((iHashCode3 + (dataChannel != null ? dataChannel.hashCode() : 0)) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "PublicScreenContext(context=" + this.LIZ + ", owner=" + this.LIZIZ + ", isRtl=" + this.LIZJ + ", isPortrait=" + this.LIZLLL + ", isTranslationEnabled=" + this.LJ + ", isBadgeDowngrade=" + this.LJFF + ", isAnchor=" + this.LJI + ", room=" + this.LJII + ", anchor=" + this.LJIIIIZZ + ", dataChannel=" + this.LJIIIZ + ", publicScreenConfigurationProvider=" + this.LJIIJ + ", presenter=" + this.LJIIJJI + ')';
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LJIJJ.getValue()).booleanValue();
    }

    public final AbstractC1113400f50 LIZJ() {
        return (AbstractC1113400f50) this.LJIILL.getValue();
    }

    public final User LIZLLL() {
        DataChannel dataChannel = this.LJIIIZ;
        if (dataChannel != null) {
            return (User) dataChannel.gg0(RoomUserChannel.class);
        }
        return null;
    }

    public final long LJ() {
        if (this.LJIJ == 0) {
            User userLIZLLL = LIZLLL();
            this.LJIJ = userLIZLLL != null ? userLIZLLL.getId() : UserService.getInstance().user().getCurrentUserId();
        }
        return this.LJIJ;
    }

    public final boolean LJFF() {
        return ((Number) this.LJIJI.getValue()).intValue() == 1 || ((Number) this.LJIJI.getValue()).intValue() == 2;
    }

    public final void LIZ(TextView textView) {
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).eW(textView, this.LIZLLL);
    }

    public final void LJIIIIZZ(AbstractC1110520f0M abstractC1110520f0M) {
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        if (iPublicScreenService != null) {
            iPublicScreenService.RZ0(this.LJIIZILJ, abstractC1110520f0M);
        }
    }

    public final void LJI(ChatMessage chatMessage, InterfaceC1112060f2q interfaceC1112060f2q) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_comment_settings_show");
        c474500IjALIZ.LJIJJLI(this.LJIIIZ);
        c474500IjALIZ.LJJII(C0KYR.LIZJ(this.LJIIIZ), "admin_type");
        c474500IjALIZ.LJJII(Long.valueOf(chatMessage.getMessageId()), "msg_id");
        c474500IjALIZ.LIZ();
        this.LJIIJJI.LJIILIIL(chatMessage);
    }

    public final void LJII(AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, C1111350f1h c1111350f1h) {
        this.LJIIJJI.LJJJJI(abstractC1110800f0o, c1111350f1h);
    }

    public final void LJIIIZ(InterfaceC1112060f2q interfaceC1112060f2q, Object obj) {
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        if (iPublicScreenService != null) {
            iPublicScreenService.UE2(this.LJIIZILJ, interfaceC1112060f2q, obj);
        }
    }

    public C1109770ez9(Context context, LifecycleOwner lifecycleOwner, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Room room, User user, DataChannel dataChannel, InterfaceC180800mk interfaceC180800mk, InterfaceC1110630f0X interfaceC1110630f0X) {
        long id;
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = room;
        this.LJIIIIZZ = user;
        this.LJIIIZ = dataChannel;
        this.LJIIJ = interfaceC180800mk;
        this.LJIIJJI = interfaceC1110630f0X;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LJIIZILJ = id;
        this.LJIJI = C292401Bi.LIZ(new C5182020e(this, 485));
        this.LJIJJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 567));
        this.LJIL = user != null ? user.getId() : 0L;
        this.LJJIII = 1.0f;
        this.LJJIIZI = true;
    }
}
