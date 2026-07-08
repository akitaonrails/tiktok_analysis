package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0kum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337700kum {
    public static final WeakHashMap<Activity, C1337700kum> LJFF = new WeakHashMap<>();
    public final ComponentActivity LIZ;
    public Dialog LIZIZ;
    public FrameLayout LIZJ;
    public EnumC586690Mzj LIZLLL;
    public final Set<C1337710kun> LJ = new LinkedHashSet();

    public final void LIZ() {
        C1305050k47 c1305050k47;
        Iterator it2 = C13LP.LLIIII(this.LJ).iterator();
        while (it2.hasNext()) {
            try {
                ((C1337710kun) it2.next()).cancel();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        FrameLayout frameLayout = this.LIZJ;
        if (frameLayout == null) {
            return;
        }
        for (int childCount = frameLayout.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = frameLayout.getChildAt(childCount);
            if ((childAt instanceof C1305050k47) && (c1305050k47 = (C1305050k47) childAt) != null) {
                c1305050k47.LIZ();
            }
        }
        C786410Ut5.LJJJJIZL(frameLayout);
    }

    public final void LIZIZ() {
        Unit unit;
        LIZ();
        this.LJ.clear();
        try {
            Dialog dialog = this.LIZIZ;
            if (dialog != null) {
                dialog.dismiss();
                C785410UrT.LIZ(dialog);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public C1337700kum(ComponentActivity componentActivity) {
        this.LIZ = componentActivity;
    }
}
