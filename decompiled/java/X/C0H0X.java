package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H0X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H0X implements C0IBX {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public C099G LJ;
    public Aweme LJFF;

    @Override // X.C0IBX
    public final Integer LIZ() {
        return null;
    }

    @Override // X.C0IBX
    public final int getType() {
        return 4;
    }

    @Override // X.C0IBX
    public final Integer LIZJ() {
        return 2131826321;
    }

    @Override // X.C0IBX
    public final Integer LJ() {
        return Integer.valueOf(R.attr.ej);
    }

    @Override // X.C0IBX
    public final void LIZLLL(C197039127h c197039127h) {
        Activity activityLIZ = C1388190mED.LIZ(this.LIZ);
        if (activityLIZ == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0H0U(c197039127h, this, activityLIZ, null), 2);
    }

    @Override // X.C0IBX
    public final void LJFF(C197039127h c197039127h) {
        this.LJ = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(this.LIZIZ), C0PEM.LIZJ, null, new C0H0W(this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZIZ), C2107308Nj.LIZ, null, new C0H0V(this, null), 2);
    }

    public static void LIZIZ(int i, Activity activity) {
        if (activity == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LIZLLL(3000L);
        c1389890mGx.LJIIJJI();
    }

    public C0H0X(Context context, LifecycleOwner lifecycleOwner, String str, String str2) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
