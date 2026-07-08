package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0K2W, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2W {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final List<C417410GYh> LJ;
    public final List<View> LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C0K2W(View view) {
        this.LIZ = view;
        View viewFindViewById = view.findViewById(R.id.o5o);
        View viewFindViewById2 = view.findViewById(R.id.o5q);
        View viewFindViewById3 = view.findViewById(R.id.o5s);
        View viewFindViewById4 = view.findViewById(R.id.o5p);
        this.LIZIZ = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.o5r);
        this.LIZJ = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.o5t);
        this.LIZLLL = viewFindViewById6;
        this.LJ = C1697810uHb.LJIIJJI(viewFindViewById, viewFindViewById2, viewFindViewById3);
        this.LJFF = C1697810uHb.LJIIJJI(viewFindViewById4, viewFindViewById5, viewFindViewById6);
    }
}
