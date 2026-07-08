package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.0ajd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946390ajd extends AbstractC960440b6I<C01HM> {
    public final InterfaceC946440aji LL;
    public final DataChannel LLILLJJLI;
    public C01HM LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public View LLILZLL;
    public C16F5 LLIZ;
    public LiveIconView LLIZLLLIL;
    public C1099610eil LLJ;
    public C16FS LLJI;
    public ViewGroup LLJIJIL;
    public C1126540fQC LLJILJIL;
    public C16F5 LLJILJILJ;
    public C1324720kZq LLJILLL;
    public C16F5 LLJJ;

    public static final boolean L5() {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        c930480aJy.getClass();
        if (C930480aJy.LJIJI(userLJIJJLI)) {
            return true;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        return C923330a8R.LJIIIIZZ();
    }

    @Override // X.AbstractC960440b6I
    public final void LLIILZL() {
        this.LLILLJJLI.zQ2(this);
    }

    public final boolean N5() {
        ShowListUser showListUser;
        C01HM c01hm = this.LLILLL;
        return (c01hm == null || (showListUser = c01hm.LIZ) == null || showListUser.userId != UserService.getInstance().user().getCurrentUserId()) ? false : true;
    }

    public final void R5() {
        LiveIconView liveIconView = this.LLIZLLLIL;
        if (liveIconView != null) {
            C439101nJ.LJI(liveIconView);
        }
        C16FS c16fs = this.LLJI;
        if (c16fs != null) {
            C12ES.LJIILL(0, c16fs);
        }
        P5(true);
    }

    public final void S5() {
        LiveIconView liveIconView = this.LLIZLLLIL;
        if (liveIconView != null) {
            C12ES.LJIILL(0, liveIconView);
        }
        C16FS c16fs = this.LLJI;
        if (c16fs != null) {
            C439101nJ.LJI(c16fs);
        }
        P5(false);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0ajh
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C21688219uK c21688219uKLJ;
                InterfaceC946440aji interfaceC946440aji = this.LL.LL;
                if (interfaceC946440aji != null && (c21688219uKLJ = interfaceC946440aji.LJ()) != null) {
                    c21688219uKLJ.LJIILLIIL(this.LL);
                    return false;
                }
                return false;
            }
        });
    }

    @Override // X.AbstractC960440b6I
    public final void onViewDetachedFromWindow() {
        C1324720kZq c1324720kZq = this.LLJILLL;
        if (c1324720kZq != null) {
            c1324720kZq.clearAnimation();
        }
    }

    public final void P5(final boolean z) {
        ViewTreeObserver viewTreeObserver;
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null && (viewTreeObserver = c16f5.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0ajf
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ViewTreeObserver viewTreeObserver2;
                    int iLIZIZ = (int) C497740JfY.LIZIZ(z ? 195.0f : 169.0f);
                    C16F5 c16f52 = this.LLILZIL;
                    int width = iLIZIZ + (c16f52 != null ? c16f52.getWidth() : 0);
                    C16F5 c16f53 = this.LLILZ;
                    if (c16f53 != null) {
                        c16f53.setMaxWidth(C497740JfY.LJIIZILJ() - width);
                    }
                    C16F5 c16f54 = this.LLILZIL;
                    if (c16f54 == null || (viewTreeObserver2 = c16f54.getViewTreeObserver()) == null) {
                        return;
                    }
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x0451  */
    @Override // X.AbstractC960440b6I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946390ajd.I5(int, java.lang.Object):void");
    }

    public C946390ajd(View view, InterfaceC946440aji interfaceC946440aji, DataChannel dataChannel) {
        super(view);
        this.LL = interfaceC946440aji;
        this.LLILLJJLI = dataChannel;
    }
}
