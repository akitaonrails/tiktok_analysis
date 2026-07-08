package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0eMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085620eMC {
    public int LIZ;
    public C1085120eLO LIZIZ;
    public InterfaceC420801kM LIZJ;
    public View LIZLLL;
    public View LJ;
    public float LJI;
    public List<Rect> LJFF = new ArrayList();
    public final long LJII = 800;
    public final ViewOnLayoutChangeListenerC1151610g4d LJIIIIZZ = new ViewOnLayoutChangeListenerC1151610g4d(this, 20);

    public final List<Rect> LIZ(List<Rect> list) {
        ArrayList arrayList = new ArrayList();
        Rect rect = new Rect();
        View view = this.LJ;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        C1085120eLO c1085120eLO = this.LIZIZ;
        if (c1085120eLO != null && c1085120eLO.LIZIZ) {
            int i = rect.top;
            int i2 = this.LIZ;
            rect.top = i - i2;
            rect.bottom -= i2;
        }
        ArrayList<Rect> arrayList2 = new ArrayList();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new Rect((Rect) ListProtector.get(list, i3)));
        }
        for (Rect rect2 : arrayList2) {
            if (rect2.intersect(rect)) {
                int i4 = rect2.top - rect.top;
                int iWidth = rect2.width();
                int i5 = rect2.left - rect.left;
                arrayList.add(new Rect(i5, i4, iWidth + i5, rect2.height() + i4));
            }
        }
        return arrayList;
    }
}
