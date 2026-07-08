package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305090k4B {
    public final /* synthetic */ C1389510mGL LIZ;
    public LifecycleOwner LIZIZ;
    public PlayerController LIZJ;
    public ViewGroup LIZLLL;
    public boolean LJ;
    public Bitmap LJFF;
    public DataSource LJI;
    public String LJII;
    public AnonymousClass0956 LJIIIIZZ;

    public final void LIZJ() {
        this.LIZIZ = null;
        LIZ();
        this.LIZLLL = null;
        PlayerController playerController = this.LIZJ;
        if (playerController != null) {
            playerController.release();
        }
    }

    public final void LIZ() {
        Unit unit;
        try {
            PlayerController playerController = this.LIZJ;
            if (playerController != null) {
                playerController.detachAlphaView(this.LIZLLL);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZLLL() {
        PlayerController playerController = this.LIZJ;
        if (playerController != null) {
            playerController.cancel();
        }
    }

    public C1305090k4B(C19EG c19eg, C19EG c19eg2, EnumC912680ZrG enumC912680ZrG) {
        this.LIZ = new C1389510mGL(c19eg, c19eg2, enumC912680ZrG);
        this.LIZIZ = c19eg2;
    }

    public final void LIZIZ(List<? extends UrlModel> list, Integer num, String str, Function0<Unit> function0) {
        LifecycleCoroutineScope lifecycleScope;
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C1305080k4A(this, str, list, num, function0, null), 3);
        }
        this.LJIIIIZZ = anonymousClass0956LIZLLL;
    }
}
