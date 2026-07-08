package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0XiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856180XiK extends AbstractC857240Xk2<Unit> {
    public final Activity LLILZ;

    @Override // X.AbstractC857240Xk2
    public final void LIZIZ() {
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZLLL() {
    }

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.LOGIN_CHECK.getValue().getSecond();
    }

    public C856180XiK(Activity activity) {
        this.LLILZ = activity;
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(final C857220Xk0 c857220Xk0) {
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C1448790nnx.LJFF("-1", BehaviorType.FAILED, "CK", "LG", "");
            C0CHQ.LIZ().getPublishService().LJJJIL();
            C1433920nPy.LIZ("jump_to_login_page");
            C0CHQ.LIZ().getAccountService().LJIIIIZZ(this.LLILZ, "video_edit_page", "click_shoot", null, new InterfaceC19305710fv() { // from class: X.0XiJ
                @Override // X.InterfaceC19305710fv
                public final void onCancel() {
                    c857220Xk0.cancel();
                }

                @Override // X.InterfaceC19305710fv
                public final void onSuccess() {
                    if (!C0CHQ.LIZ().getAccountService().LIZ()) {
                        c857220Xk0.LIZ(this);
                    } else {
                        C1439190nYT.LIZJ();
                        c857220Xk0.cancel();
                    }
                }
            });
            return;
        }
        c857220Xk0.LIZ(this);
    }
}
