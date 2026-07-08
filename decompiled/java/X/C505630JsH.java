package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0JsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505630JsH {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final List<C1324720kZq> LJ;
    public final List<View> LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C505630JsH(View view) {
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
