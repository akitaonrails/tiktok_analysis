package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0rXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592200rXG extends C1592940rYS {
    @Override // X.C1592940rYS
    public final boolean LJJJJ() {
        return true;
    }

    @Override // X.AbstractC1592930rYR
    public final boolean LJIIZILJ() {
        ImageView imageView = this.LL.LLJI;
        if ((imageView != null && imageView.getVisibility() == 0) || this.LLIZ > 0) {
            return true;
        }
        View currentAvatarView = this.LL.getCurrentAvatarView();
        return currentAvatarView != null && currentAvatarView.getVisibility() == 0;
    }

    public C1592200rXG(C1592950rYT c1592950rYT) {
        super(c1592950rYT);
    }

    @Override // X.C1592940rYS
    public final void LJJJJI(MotionEvent motionEvent) {
        C19212010Ec.LIZJ.LJIIIZ(motionEvent);
    }
}
