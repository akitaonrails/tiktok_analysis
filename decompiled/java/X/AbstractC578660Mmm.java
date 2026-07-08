package X;

import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import ln3.a;
import lnn.q;

/* JADX INFO: renamed from: X.0Mmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC578660Mmm implements InterfaceC578770Mmx {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final C19EG LIZ;
    public final Function0<q> LIZIZ;
    public final Function0<InterfaceC1650230t2r> LIZJ;
    public final Function0<ShortVideoContext> LIZLLL;
    public final Function0<InterfaceC1644770su3> LJ;
    public final Function0<a> LJFF;
    public final Function0<InterfaceC1647420syK> LJI;
    public final LifecycleOwner LJII;
    public final boolean LJIIIIZZ;
    public CreativeLoadingDialog LJIIIZ;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1111));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1112));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1110));

    static {
        new C578720Mms();
    }

    public final void LIZIZ() {
        ((Handler) this.LJIIJ.getValue()).removeCallbacksAndMessages(null);
        CreativeLoadingDialog creativeLoadingDialog = this.LJIIIZ;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC578660Mmm(C19EG c19eg, Function0<? extends q> function0, Function0<? extends InterfaceC1650230t2r> function02, Function0<? extends ShortVideoContext> function03, Function0<? extends InterfaceC1644770su3> function04, Function0<? extends a> function05, Function0<? extends InterfaceC1647420syK> function06, LifecycleOwner lifecycleOwner, boolean z) {
        this.LIZ = c19eg;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = function04;
        this.LJFF = function05;
        this.LJI = function06;
        this.LJII = lifecycleOwner;
        this.LJIIIIZZ = z;
    }
}
