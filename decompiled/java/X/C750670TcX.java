package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750670TcX extends AbstractC752950TgD implements InterfaceC749850TbD {
    public final User LLILZ;
    public final C498340JgW LLILZIL;
    public final DataChannel LLILZLL;

    @Override // X.InterfaceC749850TbD
    public final void Rk(Exception exc) {
    }

    @Override // X.InterfaceC749850TbD
    public final void Xa(int i) {
    }

    @Override // X.InterfaceC749850TbD
    public final void gx(int i, Exception exc) {
    }

    @Override // X.InterfaceC749850TbD
    public final void il(AdminUserBean adminUserBean, Exception exc) {
    }

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 815);
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        int i;
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        UserAttr userAttr = this.LLILZ.getUserAttr();
        if (userAttr != null) {
            if (userAttr.isAdmin) {
                i = 2131843150;
            } else {
                i = 2131842822;
            }
            if (c755180Tjo != null) {
                c755180Tjo.LJI(C497740JfY.LJIJI(i));
            }
        }
    }

    @Override // X.InterfaceC749850TbD
    public final void OO(long j, boolean z) {
        UserAttr userAttr = this.LLILZ.getUserAttr();
        if (userAttr == null) {
            userAttr = new UserAttr();
            this.LLILZ.setUserAttr(userAttr);
        }
        userAttr.isAdmin = z;
    }

    public C750670TcX(User user, C498340JgW c498340JgW, DataChannel dataChannel) {
        this.LLILZ = user;
        this.LLILZIL = c498340JgW;
        this.LLILZLL = dataChannel;
    }
}
