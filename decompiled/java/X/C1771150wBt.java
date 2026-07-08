package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0wBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771150wBt extends AbstractC1771870wD3 {
    public RecyclerView LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public InterfaceC1602960roc LLIZLLLIL;
    public final String LLILLL = "c8938.d0";
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(14));

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        C18Z6 bodyList = LIZIZ().LIZLLL().LJ.getBodyList();
        bodyList.LJ(new AwS605S0100000_26(this, 26));
        if (C1770030wA5.LIZ() && C1770030wA5.LIZ() && C1770030wA5.LIZIZ().getNativeScenes().contains("mall")) {
            bodyList.getPreScrollListeners().add(new C1770020wA4());
        }
    }

    public final void LJIILLIIL() {
        Object next;
        Pair<Integer, Integer> pairLJ;
        C18Z6 bodyList = LIZIZ().LIZLLL().LJ.getBodyList();
        AbstractC1772270wDh abstractC1772270wDh = LIZIZ().LIZLLL().LJ;
        Collection<WeakReference<RecyclerView>> collectionValues = bodyList.getChildRecyclerViews().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            View view = (View) next;
            if (abstractC1772270wDh.getRight() >= view.getRight() && abstractC1772270wDh.getLeft() <= view.getLeft() && view.getWidth() != 0) {
                break;
            }
        }
        this.LLILZ = (RecyclerView) next;
        InterfaceC1771900wD6 interfaceC1771900wD6 = (InterfaceC1771900wD6) LIZIZ().LIZJ().getService(InterfaceC1771900wD6.class);
        if (interfaceC1771900wD6 == null || (pairLJ = interfaceC1771900wD6.LJ()) == null) {
            return;
        }
        this.LLILZIL = pairLJ.getFirst().intValue();
        this.LLILZLL = pairLJ.getSecond().intValue();
    }

    public static double LJIILIIL(Number number) {
        double dDoubleValue = number.doubleValue();
        C844470XAv.LIZ.getClass();
        return dDoubleValue / ((double) C844470XAv.LIZ().getResources().getDisplayMetrics().density);
    }
}
