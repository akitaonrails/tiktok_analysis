package X;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import qo2.w;

/* JADX INFO: renamed from: X.0Iu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481280Iu6 extends C929710aIj<InterfaceC481300Iu8> implements InterfaceC929300aI4 {
    public final InterfaceC481300Iu8 LLILLJJLI;
    public final DataChannel LLILLL;

    @Override // X.C929710aIj
    public final void LIZIZ() {
        throw null;
    }

    @Override // X.InterfaceC929300aI4
    public final void LIZJ() {
        Long l;
        this.LLILLJJLI.dismiss();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return;
        }
        DataChannel dataChannel = this.LLILLL;
        String str = dataChannel != null ? (String) dataChannel.gg0(C760110Trl.class) : null;
        C1106200etO c1106200etO = new C1106200etO(room);
        if (room.getOwner() != null) {
            String str2 = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion() ? "h5_m" : "h5_t";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("www.tiktok.com/@");
            sbLIZ.append(C0KVU.LJ(room.getOwner()));
            sbLIZ.append("/live");
            sbLIZ.append(str2);
            sbLIZ.append("&_r=1");
            c1106200etO.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c1106200etO.LIZJ = UserService.getInstance().user().getCurrentUserId();
        w.LIZ.getClass();
        c1106200etO.LJIJ = w.LJIJI();
        DataChannel dataChannel2 = this.LLILLL;
        User user = dataChannel2 != null ? (User) dataChannel2.gg0(RoomUserChannel.class) : null;
        boolean z = (user == null || user.getUserAttr() == null || !user.getUserAttr().isAdmin) ? false : true;
        InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
        C19EG c19egLJ = C500260Jjc.LJ(this.LLILLJJLI.getContext());
        c1106200etO.LJIIJJI = room.getUserShareText();
        c1106200etO.LJIILIIL = false;
        c1106200etO.LJIILL = z;
        c1106200etO.LJIILLIIL = RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING);
        Hashtag hashtag = room.hashtag;
        c1106200etO.LJIIZILJ = (hashtag == null || (l = hashtag.id) == null) ? 0L : l.longValue();
        c1106200etO.LJIJI = str;
        C1106210etP c1106210etP = new C1106210etP(c1106200etO);
        InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0Iu7
            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str3, String str4, Bundle bundle) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }
        };
        C481220Iu0 c481220Iu0 = (C481220Iu0) interfaceC481210ItzMh;
        c481220Iu0.getClass();
        c1106210etP.LIZIZ();
        c481220Iu0.LIZ(c19egLJ, c1106210etP, interfaceC1372610lp5);
        C2478709nV.LIZIZ(this.LLILLJJLI.getContext()).LIZJ(room.getId(), room.getIdStr());
    }

    public C481280Iu6(InterfaceC481300Iu8 interfaceC481300Iu8) {
        this.LLILLJJLI = interfaceC481300Iu8;
        this.LLILLL = interfaceC481300Iu8.getDataChannel();
    }
}
