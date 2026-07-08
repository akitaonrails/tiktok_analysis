package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS148S0101000_8;

/* JADX INFO: renamed from: X.0L2U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2U {
    public final int LIZ;
    public final CreativeLoadingDialogBuilder.CancelType LIZIZ;
    public final Function0<Unit> LIZJ;
    public CreativeDialogWrapper LIZLLL;
    public int LJ;
    public final WeakReference<Activity> LJFF;
    public ValueAnimator LJI;

    public C0L2U() {
        throw null;
    }

    public C0L2U(Activity activity, Function0 function0) {
        CreativeLoadingDialogBuilder.CancelType cancelType = CreativeLoadingDialogBuilder.CancelType.VISIBLE;
        this.LIZ = 2001;
        this.LIZIZ = cancelType;
        this.LIZJ = function0;
        this.LJFF = new WeakReference<>(activity);
    }

    public final void LIZ(int i, C536430L2b c536430L2b) {
        C0CNO.LIZLLL(0L, new AwS148S0101000_8(this, (int) (c536430L2b.LIZ + ((c536430L2b.LIZIZ - r2) * (i / 100.0f))), 0));
    }
}
