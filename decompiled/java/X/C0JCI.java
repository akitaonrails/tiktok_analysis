package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0JCI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JCI {
    public final View LIZ;
    public final C417410GYh LIZIZ;
    public final C417410GYh LIZJ;
    public final C417410GYh LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;

    public C0JCI(View view) {
        this.LIZ = view;
        this.LIZIZ = (C417410GYh) view.findViewById(R.id.o5o);
        this.LIZJ = (C417410GYh) view.findViewById(R.id.o5q);
        this.LIZLLL = (C417410GYh) view.findViewById(R.id.o5s);
        this.LJ = view.findViewById(R.id.o5p);
        this.LJFF = view.findViewById(R.id.o5r);
        this.LJI = view.findViewById(R.id.o5t);
        this.LJII = view.findViewById(R.id.j7r);
    }

    public final void LIZ(List<User> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, this.LIZ);
            return;
        }
        if (list.size() >= 3) {
            C786410Ut5.S0(this.LIZIZ, 8);
            C786410Ut5.LJLLLLLL(8, this.LJ);
            C786410Ut5.S0(this.LIZJ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJFF);
            C786410Ut5.S0(this.LIZLLL, 0);
            C786410Ut5.LJLLLLLL(0, this.LJI);
            C511410K3v.LIZ(this.LIZLLL, (InterfaceC2262081DgM) ListProtector.get(list, 0), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            C511410K3v.LIZ(this.LIZJ, (InterfaceC2262081DgM) ListProtector.get(list, 1), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)));
        } else if (list.size() == 2) {
            C786410Ut5.S0(this.LIZIZ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJ);
            C786410Ut5.S0(this.LIZJ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJFF);
            C786410Ut5.S0(this.LIZLLL, 8);
            C786410Ut5.LJLLLLLL(8, this.LJI);
            C511410K3v.LIZ(this.LIZJ, (InterfaceC2262081DgM) ListProtector.get(list, 0), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            C511410K3v.LIZ(this.LIZIZ, (InterfaceC2262081DgM) ListProtector.get(list, 1), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35)));
        } else {
            C786410Ut5.S0(this.LIZIZ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJ);
            C786410Ut5.S0(this.LIZJ, 8);
            C786410Ut5.LJLLLLLL(8, this.LJFF);
            C786410Ut5.S0(this.LIZLLL, 8);
            C786410Ut5.LJLLLLLL(8, this.LJI);
            C511410K3v.LIZ(this.LIZIZ, (InterfaceC2262081DgM) ListProtector.get(list, 0), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        }
        this.LIZ.requestLayout();
    }

    public final void LIZIZ(int i) {
        ViewGroup.LayoutParams layoutParams = this.LJII.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(this.LJII, layoutParams);
        this.LJII.requestLayout();
    }
}
