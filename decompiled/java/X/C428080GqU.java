package X;

import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0GqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428080GqU extends FrameLayout {
    public final View LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ;
    public Function1<? super String, Unit> LLILZIL;
    public boolean LLILZLL;

    private final View getRoot() {
        return (View) this.LLILZ.getValue();
    }

    public final void LIZ() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        if (C298840BnW.LIZ() == 2) {
            animate().alpha(0.64f).setDuration(500L).start();
        } else if (C298840BnW.LIZ() == 3) {
            animate().translationXBy(C426750GoL.LIZLLL(getContext()) ? -C418440Gaw.LIZIZ(24) : C418440Gaw.LIZIZ(24)).setDuration(500L).start();
        }
    }

    public final Function1<String, Unit> getAction() {
        return this.LLILZIL;
    }

    public final boolean getAlreadyExit() {
        return this.LLILZLL;
    }

    public final void setAction(Function1<? super String, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setAlreadyExit(boolean z) {
        this.LLILZLL = z;
    }

    public C428080GqU(C19EG c19eg, Fragment fragment) {
        int i;
        super(c19eg, null, 0);
        this.LL = fragment.getView();
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLILZ = C452501pT.LIZIZ(new AwS407S0200000_6(c19eg, this, 76));
        TuxIconView tuxIconView = (TuxIconView) getRoot().findViewById(R.id.uf5);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
        tuxIconView.setBackground(c384050F3z.LIZ(c19eg));
        if (C467860IWi.LIZ(c19eg)) {
            i = R.raw.icon_bitmap_tako_new_dark;
        } else {
            i = R.raw.icon_bitmap_tako_new_light;
        }
        tuxIconView.setIconRes(i);
        C427690Gpr.LJ(getRoot(), C418440Gaw.LIZIZ(22));
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 125), getRoot());
    }
}
