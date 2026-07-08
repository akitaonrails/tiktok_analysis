package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750530TcJ extends C750630TcT implements InterfaceC750500TcG, InterfaceC750590TcP {
    public final C750620TcS LLILZIL;
    public boolean LLILZLL;

    @Override // X.AbstractC752950TgD
    public final Function1<Boolean, Unit> LJII() {
        return new AwS591S0100000_12(this, 1164);
    }

    public C750530TcJ(C750620TcS c750620TcS) {
        boolean z;
        UserAttr userAttr;
        super(c750620TcS);
        this.LLILZIL = c750620TcS;
        User user = c750620TcS.LIZ;
        if (user != null && (userAttr = user.getUserAttr()) != null) {
            z = userAttr.isMuted;
        } else {
            z = false;
        }
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC750590TcP
    public final void LIZ(User user) {
        boolean z;
        this.LLILZ.LIZ = user;
        UserAttr userAttr = user.getUserAttr();
        if (userAttr != null) {
            z = userAttr.isMuted;
        } else {
            z = false;
        }
        this.LLILZLL = z;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        Long lValueOf;
        Object objValueOf;
        Long lValueOf2;
        Long lValueOf3;
        UserAttr userAttr;
        C750600TcQ c750600TcQ = this.LLILZ;
        User user = c750600TcQ.LIZ;
        Boolean boolValueOf = null;
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
        boolean zLJFF = Intrinsics.LJFF(lValueOf, objValueOf);
        Room room = c750600TcQ.LIZLLL;
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        User user2 = c750600TcQ.LIZ;
        if (user2 != null) {
            lValueOf3 = Long.valueOf(user2.getId());
        } else {
            lValueOf3 = null;
        }
        boolean zLJFF2 = Intrinsics.LJFF(lValueOf2, lValueOf3);
        if (c750600TcQ.LIZ == null) {
            return false;
        }
        if (!c750600TcQ.LIZIZ) {
            if (!((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).aQ0()) {
                return false;
            }
            User user3 = c750600TcQ.LIZ;
            if (user3 != null && (userAttr = user3.getUserAttr()) != null) {
                boolValueOf = Boolean.valueOf(userAttr.isAdmin);
            }
            if (!C500260Jjc.LJJIJIIJIL(boolValueOf) || !C500260Jjc.LJJIJIIJIL(Boolean.valueOf(zLJFF2))) {
                return false;
            }
        }
        if (zLJFF) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJI(EnumC755280Tjy enumC755280Tjy) {
        if (this.LLILZ.LIZ != null && LJ(enumC755280Tjy)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC750500TcG
    public final void ca(Exception exc) {
        InterfaceC750520TcI interfaceC750520TcI = this.LLILLJJLI;
        if (interfaceC750520TcI != null) {
            interfaceC750520TcI.LIZJ(true);
            interfaceC750520TcI.LIZIZ(this.LLILZLL);
        }
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        int i;
        UserAttr userAttr;
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        C750600TcQ c750600TcQ = this.LLILZ;
        if (c755180Tjo != null) {
            User user = c750600TcQ.LIZ;
            if (user != null && (userAttr = user.getUserAttr()) != null && userAttr.isMuted) {
                i = 2131841264;
            } else {
                i = 2131841260;
            }
            c755180Tjo.LJI(C497740JfY.LJIJI(i));
            c755180Tjo.LIZIZ(this.LLILZLL);
        }
    }

    @Override // X.InterfaceC750500TcG
    public final void cd(long j, boolean z) {
        String str;
        long id;
        InterfaceC750520TcI interfaceC750520TcI = this.LLILLJJLI;
        if (interfaceC750520TcI != null) {
            interfaceC750520TcI.LIZJ(true);
        }
        this.LLILZLL = z;
        if (z) {
            C474500IjA c474500IjALJIIIZ = LJIIIZ("mute");
            c474500IjALJIIIZ.LJJII(Long.valueOf(j), "mute_duration");
            c474500IjALJIIIZ.LJJII(Long.valueOf(j), "default_mute_set");
            c474500IjALJIIIZ.LIZ();
            C750600TcQ c750600TcQ = this.LLILZ;
            if (c750600TcQ.LJII != null) {
                AbstractC1136060ffY abstractC1136060ffY = c750600TcQ.LJFF;
                if (abstractC1136060ffY instanceof ChatMessage) {
                    str = ((ChatMessage) abstractC1136060ffY).content;
                } else {
                    str = "";
                }
                IAdminSettingService iAdminSettingService = (IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class);
                Room room = c750600TcQ.LIZLLL;
                long messageId = 0;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                FragmentManager fragmentManager = c750600TcQ.LJII;
                AbstractC1136060ffY abstractC1136060ffY2 = c750600TcQ.LJFF;
                if (abstractC1136060ffY2 != null) {
                    messageId = abstractC1136060ffY2.getMessageId();
                }
                iAdminSettingService.M22(id, str, fragmentManager, 1, Long.valueOf(messageId));
            }
        }
    }
}
