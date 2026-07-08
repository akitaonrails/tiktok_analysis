package X;

import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D0H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0H {
    public final IFeedBottomBarFacade LIZ;
    public WeakReference<C19EG> LIZIZ;
    public Function0<Unit> LIZJ;
    public boolean LIZLLL;
    public final AwS613S0100000_34 LJ = new AwS613S0100000_34(this, 67);
    public final AwS578S0100000_34 LJFF = new AwS578S0100000_34(this, 102);
    public final AwS578S0100000_34 LJI = new AwS578S0100000_34(this, 101);

    public final void LIZJ() {
        C19EG c19eg;
        if (this.LIZLLL) {
            WeakReference<C19EG> weakReference = this.LIZIZ;
            if (weakReference != null && (c19eg = weakReference.get()) != null) {
                this.LIZ.LJIILL(c19eg, this.LJ);
            }
            this.LIZLLL = false;
        }
        this.LIZ.LJIL(this.LJFF);
        this.LIZ.LJIIL(this.LJI);
        WeakReference<C19EG> weakReference2 = this.LIZIZ;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    public C1D0H(IFeedBottomBarFacade iFeedBottomBarFacade) {
        this.LIZ = iFeedBottomBarFacade;
    }

    public final boolean LIZ(C1868040yiA c1868040yiA) {
        WeakReference<C19EG> weakReference;
        C19EG c19eg;
        if (c1868040yiA.LIZJ || (weakReference = this.LIZIZ) == null || (c19eg = weakReference.get()) == null) {
            return false;
        }
        CommentService.LIZ.getClass();
        return C523420Kfs.LIZ().LLFFF(c19eg);
    }

    public final C1395890mQd LIZIZ(C1868040yiA c1868040yiA) {
        if (!Intrinsics.LJFF(c1868040yiA.LIZ, "homepage_hot") || !this.LIZ.LIZJ()) {
            return null;
        }
        C1D0F c1d0f = C1D0F.LIZ;
        if (c1d0f != null && c1d0f.isConnected()) {
            return null;
        }
        Aweme aweme = c1868040yiA.LIZIZ;
        if (!this.LIZ.LJIJJ(aweme)) {
            return null;
        }
        return new C1395890mQd("speed", null, null, C20642515q3.LJI(this.LIZ.getResources().LJIIIZ), C786410Ut5.k4(Locale.US, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(this.LIZ.LJIILLIIL(aweme))}, 1)), false, true, 6);
    }
}
