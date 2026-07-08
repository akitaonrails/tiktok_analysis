package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Iio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474280Iio {
    public final View LIZ;
    public final C1324720kZq LIZIZ;
    public final C1324720kZq LIZJ;
    public final C1324720kZq LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;

    public C474280Iio(View view) {
        this.LIZ = view;
        this.LIZIZ = (C1324720kZq) view.findViewById(R.id.o5o);
        this.LIZJ = (C1324720kZq) view.findViewById(R.id.o5q);
        this.LIZLLL = (C1324720kZq) view.findViewById(R.id.o5s);
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
            C786410Ut5.LLJJIII(this.LIZIZ, 8);
            C786410Ut5.LJLLLLLL(8, this.LJ);
            C786410Ut5.LLJJIII(this.LIZJ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJFF);
            C786410Ut5.LLJJIII(this.LIZLLL, 0);
            C786410Ut5.LJLLLLLL(0, this.LJI);
            C1324720kZq c1324720kZq = this.LIZLLL;
            C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), (InterfaceC2262081DgM) ListProtector.get(list, 0), c1324720kZq);
            C1324720kZq c1324720kZq2 = this.LIZJ;
            C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), (InterfaceC2262081DgM) ListProtector.get(list, 1), c1324720kZq2);
            LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)));
        } else if (list.size() == 2) {
            C786410Ut5.LLJJIII(this.LIZIZ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJ);
            C786410Ut5.LLJJIII(this.LIZJ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJFF);
            C786410Ut5.LLJJIII(this.LIZLLL, 8);
            C786410Ut5.LJLLLLLL(8, this.LJI);
            C1324720kZq c1324720kZq3 = this.LIZJ;
            C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), (InterfaceC2262081DgM) ListProtector.get(list, 0), c1324720kZq3);
            C1324720kZq c1324720kZq4 = this.LIZIZ;
            C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), (InterfaceC2262081DgM) ListProtector.get(list, 1), c1324720kZq4);
            LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35)));
        } else {
            C786410Ut5.LLJJIII(this.LIZIZ, 0);
            C786410Ut5.LJLLLLLL(0, this.LJ);
            C786410Ut5.LLJJIII(this.LIZJ, 8);
            C786410Ut5.LJLLLLLL(8, this.LJFF);
            C786410Ut5.LLJJIII(this.LIZLLL, 8);
            C786410Ut5.LJLLLLLL(8, this.LJI);
            C1324720kZq c1324720kZq5 = this.LIZIZ;
            C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), (InterfaceC2262081DgM) ListProtector.get(list, 0), c1324720kZq5);
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
