package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0ffv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136290ffv implements InterfaceC1138400fjK {
    public static WeakReference<InterfaceC1138400fjK> LJI;
    public static WeakReference<InterfaceC1140970fnT> LJII;
    public DataChannel LIZ;
    public InterfaceC1136810fgl LIZIZ;
    public View LJ;
    public final List<C916720Zxm> LIZJ = new ArrayList();
    public final Rect LIZLLL = new Rect();
    public final C1136840fgo LJFF = C1136840fgo.LL;

    @Override // X.InterfaceC1138400fjK
    public final Rect LIZ() {
        InterfaceC1136810fgl interfaceC1136810fgl = this.LIZIZ;
        View contentView = interfaceC1136810fgl != null ? interfaceC1136810fgl.getContentView() : null;
        Rect rect = new Rect();
        if (contentView != null) {
            int[] iArr = new int[2];
            contentView.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.set(i, iArr[1], contentView.getWidth() + i, iArr[1] + contentView.getHeight());
        }
        return rect;
    }

    @Override // X.InterfaceC1138400fjK
    public final Rect LIZIZ() {
        View view = this.LJ;
        if (view != null) {
            view.getLayoutParams();
            this.LIZLLL.set((int) view.getX(), (int) view.getY(), ((int) view.getX()) + view.getWidth(), ((int) view.getY()) + view.getHeight());
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1138400fjK
    public final List<C916720Zxm> LIZJ() {
        List<C916720Zxm> listDo2 = C1140740fn6.LIZIZ().Do2();
        ((ArrayList) this.LIZJ).clear();
        ((ArrayList) this.LIZJ).addAll(listDo2);
        for (int i = 0; i < listDo2.size(); i++) {
        }
        return this.LIZJ;
    }

    public final boolean LIZLLL(List<C916720Zxm> list) {
        Boolean boolValueOf;
        if (((ArrayList) list).isEmpty()) {
            return !((ArrayList) this.LIZJ).isEmpty();
        }
        if (((ArrayList) this.LIZJ).isEmpty()) {
            if (!(!((ArrayList) list).isEmpty())) {
                return false;
            }
            Collections.sort(list, this.LJFF);
            return true;
        }
        Collections.sort(list, this.LJFF);
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() != ((ArrayList) this.LIZJ).size()) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C916720Zxm c916720Zxm = (C916720Zxm) C13LP.LJJJLZIJ(i, list);
            if (c916720Zxm != null) {
                boolValueOf = Boolean.valueOf(c916720Zxm.equals(C13LP.LJJJLZIJ(i, this.LIZJ)));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                return true;
            }
        }
        return false;
    }
}
