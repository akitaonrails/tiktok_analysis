package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.level.FansClubEnableLoadAllStickersSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0f6R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114290f6R extends AbstractC1115080f7i {
    public C1114310f6T LJIIL;
    public C1114250f6N LJIILIIL;
    public boolean LJIILJJIL;
    public String LJIILL;
    public InterfaceC1114340f6W LJIILLIIL;
    public InterfaceC1114320f6U LJIIZILJ;

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0f6S] */
    @Override // X.AbstractC1115080f7i
    public final View LIZIZ() {
        String str;
        SubscribeInfo subscribeInfo;
        ?? r9 = new InterfaceC1095590ecH() { // from class: X.0f6S
            @Override // X.InterfaceC1095590ecH
            public final void LIZ() {
                InterfaceC1114320f6U interfaceC1114320f6U = this.LIZ.LJIIZILJ;
                if (interfaceC1114320f6U != null) {
                    interfaceC1114320f6U.LIZ();
                }
            }

            @Override // X.InterfaceC1095590ecH
            public final void LIZIZ(boolean z) {
                this.LIZ.LJFF(z);
            }
        };
        Context context = this.LIZ;
        DataChannel dataChannel = this.LIZJ;
        Boolean boolValueOf = Boolean.valueOf(this.LJIIJ);
        C1114310f6T c1114310f6T = this.LJIIL;
        boolean z = this.LJIILJJIL;
        String str2 = this.LJIILL;
        C1114250f6N c1114250f6N = new C1114250f6N(context, dataChannel, boolValueOf.booleanValue(), c1114310f6T, r9);
        c1114250f6N.setEnterFrom(str2);
        if (z) {
            c1114250f6N.setSendShowEventFirst(true);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        User owner = room != null ? room.getOwner() : null;
        if (C520010KaN.LJJIFFI(c1114250f6N.getContext(), false) != null) {
            C0KBS c0kbs = C0KBS.LIZ;
            C0KBS.LJIJ = FansClubEnableLoadAllStickersSettings.INSTANCE.getValue();
            Resources resources = c1114250f6N.getResources();
            if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || (str = subscribeInfo.packageId) == null) {
                str = "";
            }
            C0KBS.LJFF(resources, str, c1114250f6N.LLILZ.LLILZIL, UserService.getInstance().user().getCurrentUserId(), room != null ? room.getId() : 0L);
        }
        this.LJIILIIL = c1114250f6N;
        return c1114250f6N;
    }

    @Override // X.AbstractC1115080f7i
    public final void LIZJ() {
        C1114310f6T c1114310f6T = this.LJIIL;
        if (c1114310f6T != null) {
            c1114310f6T.LJ(this);
        }
        InterfaceC1114340f6W interfaceC1114340f6W = this.LJIILLIIL;
        if (interfaceC1114340f6W != null) {
            interfaceC1114340f6W.LIZIZ();
        }
    }

    @Override // X.AbstractC1115080f7i
    public final void LJ() {
        InterfaceC1114340f6W interfaceC1114340f6W = this.LJIILLIIL;
        if (interfaceC1114340f6W != null) {
            interfaceC1114340f6W.LIZJ();
        }
    }

    public C1114290f6R(Context context, EnumC584890Mwp enumC584890Mwp) {
        super(context, enumC584890Mwp);
        this.LJIILL = "";
    }

    @Override // X.AbstractC1115080f7i
    public final void LIZLLL(String str, boolean z) {
        this.LJIILJJIL = z;
        C1114250f6N c1114250f6N = this.LJIILIIL;
        if (c1114250f6N != null) {
            c1114250f6N.e0(z, this.LJIIIZ);
        }
    }

    public final void LJI(String str, String str2) {
        if (C504670Jqj.LIZ(str, "fans_sticker")) {
            str2 = "fans_club_sticker";
        } else if (C504670Jqj.LIZIZ(str2)) {
            str2 = "comment_panel_fans_club_icon";
        }
        this.LJIILL = str2;
        C1114250f6N c1114250f6N = this.LJIILIIL;
        if (c1114250f6N != null) {
            c1114250f6N.setEnterFrom(str2);
        }
    }
}
