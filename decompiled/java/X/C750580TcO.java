package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750580TcO extends C750630TcT implements InterfaceC750590TcP, InterfaceC750020TbU {
    public final boolean LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC750020TbU
    public final void E5() {
    }

    @Override // X.InterfaceC750020TbU
    public final void LLLLLLJ(C752140Teu c752140Teu, Exception exc) {
    }

    @Override // X.AbstractC752950TgD
    public final Function1<Boolean, Unit> LJII() {
        return new AwS591S0100000_12(this, 1162);
    }

    public C750580TcO(C750600TcQ c750600TcQ) {
        Long lValueOf;
        Object objValueOf;
        super(c750600TcQ);
        User user = c750600TcQ.LIZ;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            objValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            objValueOf = 0;
        }
        this.LLILZIL = Intrinsics.LJFF(lValueOf, objValueOf);
        User user2 = c750600TcQ.LIZ;
        this.LLILZLL = user2 != null ? user2.isBlock : false;
    }

    @Override // X.InterfaceC750590TcP
    public final void LIZ(User user) {
        this.LLILZ.LIZ = user;
        this.LLILZLL = user.isBlock;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        Boolean boolValueOf;
        Long lValueOf;
        User userLJIIIIZZ;
        C750600TcQ c750600TcQ = this.LLILZ;
        User user = c750600TcQ.LIZ;
        if (user != null) {
            if (!c750600TcQ.LIZIZ || this.LLILZIL) {
                if (c750600TcQ.LIZJ && !this.LLILZIL) {
                    Long lValueOf2 = null;
                    UserAttr userAttr = user.getUserAttr();
                    if (userAttr != null) {
                        boolValueOf = Boolean.valueOf(userAttr.isAdmin);
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJIFFI(boolValueOf)) {
                        DataChannel dataChannel = c750600TcQ.LJIIIZ;
                        if (dataChannel != null && (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel)) != null) {
                            lValueOf = Long.valueOf(userLJIIIIZZ.getId());
                        } else {
                            lValueOf = null;
                        }
                        User user2 = c750600TcQ.LIZ;
                        if (user2 != null) {
                            lValueOf2 = Long.valueOf(user2.getId());
                        }
                        if (!Intrinsics.LJFF(lValueOf, lValueOf2) && ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).gQ0()) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJI(EnumC755280Tjy enumC755280Tjy) {
        if (this.LLILZ.LIZ != null && LJ(enumC755280Tjy)) {
            return true;
        }
        return false;
    }

    public final void LJIIJ(String str) {
        Long lValueOf;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("unblock_popup_click");
        c474500IjALIZ.LJIJJLI(this.LLILZ.LJIIIZ);
        User user = this.LLILZ.LIZ;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "to_user_id");
        C750600TcQ c750600TcQ = this.LLILZ;
        if (c750600TcQ.LIZIZ) {
            str2 = "anchor";
        } else if (c750600TcQ.LIZJ) {
            str2 = "admin";
        } else {
            str2 = "viewer";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LJJII(this.LLILZ.LJIIIIZZ, "enter_from");
        c474500IjALIZ.LJJII(C0KYR.LIZJ(this.LLILZ.LJIIIZ), "admin_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC750020TbU
    public final void LJJJLZIJ(boolean z) {
        this.LLILZLL = z;
        User user = this.LLILZ.LIZ;
        if (user != null) {
            user.isBlock = z;
        }
        InterfaceC750520TcI interfaceC750520TcI = this.LLILLJJLI;
        if (interfaceC750520TcI != null) {
            interfaceC750520TcI.LIZJ(true);
        }
        if (!z) {
            C766270U4b.LIZLLL(2131841256);
        }
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        if (c755180Tjo != null) {
            c755180Tjo.LIZIZ(this.LLILZLL);
        }
    }

    @Override // X.InterfaceC750020TbU
    public final void e0(boolean z, Exception exc) {
        InterfaceC750520TcI interfaceC750520TcI = this.LLILLJJLI;
        if (interfaceC750520TcI != null) {
            interfaceC750520TcI.LIZJ(true);
        }
        InterfaceC750520TcI interfaceC750520TcI2 = this.LLILLJJLI;
        if (interfaceC750520TcI2 != null) {
            interfaceC750520TcI2.LIZIZ(this.LLILZLL);
        }
    }
}
