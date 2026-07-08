package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1DZX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DZX implements C0M1L {
    public final LifecycleOwner LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(4));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(0));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(2));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(3));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(1));
    public View LJI;

    public final AVDraftMigrateService LIZIZ() {
        return (AVDraftMigrateService) this.LIZJ.getValue();
    }

    public final String LIZJ() {
        return (String) this.LIZLLL.getValue();
    }

    public final boolean LIZLLL() {
        View view = this.LJI;
        return view != null && view.getVisibility() == 0;
    }

    public C1DZX(LifecycleOwner lifecycleOwner) {
        this.LIZ = lifecycleOwner;
    }

    public static void LJ(C1DZW c1dzw) {
        if (((Boolean) c1dzw.LJ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c1dzw.LIZ), C0PEM.LIZJ, null, new C0CRU(c1dzw, "draft_box_banner", null), 2);
        }
    }

    public final void LJFF(boolean z) {
        int i;
        View view = this.LJI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }
}
