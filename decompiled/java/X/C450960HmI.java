package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450960HmI {
    public final ViewGroup LIZ;
    public View LIZIZ;
    public GridView LIZJ;
    public C450950HmH LIZLLL;

    public C450960HmI(int i, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.LIZ = viewGroup;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c3w, viewGroup, false);
        this.LIZIZ = viewTd;
        GridView gridView = (GridView) viewTd.findViewById(R.id.h04);
        this.LIZJ = gridView;
        gridView.setSelector(R.color.dr);
        this.LIZJ.setStretchMode(1);
        this.LIZJ.setGravity(17);
        Resources resources = context.getResources();
        if (i == 5) {
            this.LIZJ.setNumColumns(7);
            this.LIZJ.setColumnWidth(resources.getDimensionPixelSize(R.dimen.wy));
            this.LIZJ.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.x1));
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.x0);
            this.LIZJ.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        C450950HmH c450950HmH = new C450950HmH(this);
        this.LIZLLL = c450950HmH;
        this.LIZJ.setAdapter((ListAdapter) c450950HmH);
    }
}
