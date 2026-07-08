package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS415S0200000_14;
import uxk.a;

/* JADX INFO: renamed from: X.0ngw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444440ngw extends AbstractC857240Xk2<Unit> {
    public final C19EG LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final PermissionConfigure LLILZLL;
    public final DialogInterface.OnDismissListener LLIZ;
    public final Runnable LLIZLLLIL;
    public final Function1<Integer, Unit> LLJ;
    public final boolean LLJI;
    public final C1DRG LLJIJIL;

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.PERMISSION_CHECK.getValue().getSecond();
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        if (this.LLILZLL.getCurrentPermission() != -1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "refactor_publish_check_mock_permission", true) != 1) {
            if (this.LLJI && C1444450ngx.LIZ()) {
                a.LIZ.getClass();
                if (a.LJIIJJI()) {
                    if (a.LIZLLL() == 0) {
                        a.LJI();
                        c857220Xk0.LIZ(this);
                        return;
                    } else {
                        c857220Xk0.LIZIZ(this);
                        C013C c013c = new C013C();
                        C1444750nhR.LIZ(this.LLILZLL, this.LLILZ, this.LLJ, new AwS266S0300000_22(c857220Xk0, this, c013c, 8), new DialogInterfaceOnDismissListenerC1466690oGp(c013c, this, c857220Xk0, 1), this.LLJIJIL);
                        return;
                    }
                }
            }
            c857220Xk0.LIZ(this);
            return;
        }
        Runnable runnable = this.LLIZLLLIL;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.LLJI) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
            C1403840mdS.LJI(this.LLILZLL.getCurrentPermission(), this.LLILZIL, "video_post_page", AFwS261S0000000_22.get$arr$(131));
        }
        c857220Xk0.LIZIZ(this);
        C1444750nhR.LIZ(this.LLILZLL, this.LLILZ, this.LLJ, new AwS415S0200000_14(c857220Xk0, this, 56), new DialogInterfaceOnDismissListenerC1466670oGn(c857220Xk0, this, 0), this.LLJIJIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1444440ngw(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, PermissionConfigure permissionConfigure, DialogInterface.OnDismissListener onDismissListener, Runnable runnable, Function1<? super Integer, Unit> function1, boolean z, C1DRG c1drg) {
        this.LLILZ = c19eg;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = permissionConfigure;
        this.LLIZ = onDismissListener;
        this.LLIZLLLIL = runnable;
        this.LLJ = function1;
        this.LLJI = z;
        this.LLJIJIL = c1drg;
    }
}
