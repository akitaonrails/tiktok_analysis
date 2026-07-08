package androidx.databinding;

import X.AbstractC1842050y2F;
import X.C03GW;
import X.C2188811AlT;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes28.dex */
public class MergedDataBinderMapper extends AbstractC1842050y2F {
    public final Set<Class<? extends AbstractC1842050y2F>> LIZ = new HashSet();
    public final List<AbstractC1842050y2F> LIZIZ = new CopyOnWriteArrayList();
    public final List<String> LIZJ = new CopyOnWriteArrayList();

    public final boolean LJFF() {
        boolean z = false;
        for (String str : (CopyOnWriteArrayList) this.LIZJ) {
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC1842050y2F.class.isAssignableFrom(cls)) {
                    LIZLLL((AbstractC1842050y2F) cls.newInstance());
                    ((CopyOnWriteArrayList) this.LIZJ).remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InstantiationException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        return z;
    }

    public final void LIZLLL(AbstractC1842050y2F abstractC1842050y2F) {
        if (((HashSet) this.LIZ).add(abstractC1842050y2F.getClass())) {
            ((CopyOnWriteArrayList) this.LIZIZ).add(abstractC1842050y2F);
            Iterator<AbstractC1842050y2F> it2 = abstractC1842050y2F.LIZ().iterator();
            while (it2.hasNext()) {
                LIZLLL(it2.next());
            }
        }
    }

    public final void LJ(String str) {
        List<String> list = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".DataBinderMapperImpl");
        ((CopyOnWriteArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1842050y2F
    public final ViewDataBinding LIZIZ(C03GW c03gw, View view, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ViewDataBinding viewDataBindingLIZIZ = ((AbstractC1842050y2F) it2.next()).LIZIZ(c03gw, view, i);
            if (viewDataBindingLIZIZ != null) {
                return viewDataBindingLIZIZ;
            }
        }
        if (LJFF()) {
            return LIZIZ(c03gw, view, i);
        }
        return null;
    }

    @Override // X.AbstractC1842050y2F
    public final ViewDataBinding LIZJ(C03GW c03gw, View[] viewArr, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ViewDataBinding viewDataBindingLIZJ = ((AbstractC1842050y2F) it2.next()).LIZJ(c03gw, viewArr, i);
            if (viewDataBindingLIZJ != null) {
                return viewDataBindingLIZJ;
            }
        }
        if (LJFF()) {
            return LIZJ(c03gw, viewArr, i);
        }
        return null;
    }
}
