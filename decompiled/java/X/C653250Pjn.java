package X;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.ISearchList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Pjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653250Pjn extends C653210Pjj implements InterfaceC653310Pjt {
    public final LynxView LIZJ;
    public boolean LIZLLL;

    @Override // X.C653210Pjj, X.C1DWH
    public final InterfaceC652740Piy LIZIZ(RecyclerView recyclerView, int i, Collection<? extends InterfaceC652740Piy> collection) {
        return null;
    }

    @Override // X.InterfaceC653310Pjt
    public final void LIZLLL(ISearchList.ActiveArea activeArea) {
    }

    public C653250Pjn(LynxView lynxView) {
        this.LIZJ = lynxView;
    }

    @Override // X.C653210Pjj, X.C1DWH
    public final InterfaceC652740Piy LJII(RecyclerView recyclerView, RecyclerView recyclerView2, Collection<? extends InterfaceC652740Piy> collection) {
        return LJIIIIZZ(recyclerView, recyclerView2, collection);
    }

    @Override // X.C653210Pjj, X.C1DWH
    public final InterfaceC652740Piy LJIIIIZZ(RecyclerView recyclerView, RecyclerView recyclerView2, Collection<? extends InterfaceC652740Piy> collection) {
        int iLIZ;
        Object obj = null;
        if (recyclerView == null) {
            return null;
        }
        int iLIZ2 = C653230Pjl.LIZ(recyclerView2) - C653230Pjl.LIZ(recyclerView);
        int iLIZ3 = C653230Pjl.LIZ(recyclerView2);
        LynxView lynxView = this.LIZJ;
        if (lynxView != null) {
            iLIZ = C653230Pjl.LIZ(lynxView);
        } else {
            iLIZ = 0;
        }
        int i = iLIZ3 - iLIZ;
        if (C07EX.LIZ() && !this.LIZLLL) {
            this.LIZLLL = true;
            Paint paint = new Paint();
            paint.setStrokeWidth(C418440Gaw.LIZIZ(2));
            paint.setColor(Color.rgb(50, 250, 250));
            paint.setStyle(Paint.Style.STROKE);
            recyclerView.addItemDecoration(new C0IDH(i, paint, 4));
        }
        if (iLIZ2 < i / 2) {
            Iterator<T> it2 = collection.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((InterfaceC652740Piy) next).getPosition() == 1) {
                    obj = next;
                    break;
                }
            }
            return (InterfaceC652740Piy) obj;
        }
        Iterator<T> it3 = collection.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (((InterfaceC652740Piy) next2).getPosition() == 0) {
                obj = next2;
                break;
            }
        }
        return (InterfaceC652740Piy) obj;
    }
}
