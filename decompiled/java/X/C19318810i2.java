package X;

import com.ss.android.ugc.aweme.cell.ButtonCell;
import com.ss.android.ugc.aweme.cell.ComposableCell;
import com.ss.android.ugc.aweme.cell.DisclosureCell;
import com.ss.android.ugc.aweme.cell.DividerCell;
import com.ss.android.ugc.aweme.cell.ExposeCell;
import com.ss.android.ugc.aweme.cell.LabelCell;
import com.ss.android.ugc.aweme.cell.RadioCell;
import com.ss.android.ugc.aweme.cell.SwitchCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10i2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19318810i2 {
    public final ViewOnAttachStateChangeListenerC20604515jv LIZ;
    public final List<AbstractC19318610i0<?>> LIZIZ = new ArrayList();

    public final List<AbstractC19318610i0<?>> LIZJ() {
        return C13LP.LLIIII(this.LIZIZ);
    }

    public final void LJ() {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        int i = 0;
        for (AbstractC19318610i0 abstractC19318610i0 : (ArrayList) this.LIZIZ) {
            int i2 = i + 1;
            if ((abstractC19318610i0 instanceof C19319110i5) && ((C19319010i4) abstractC19318610i0.LIZIZ()).LLIZ) {
                Iterator it2 = C13LP.LJLJJLL(((ArrayList) this.LIZIZ).subList(0, i)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next3 = it2.next();
                        if (((AbstractC19318610i0) next3).LIZIZ().LIZ()) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                InterfaceC19318710i1 interfaceC19318710i1 = (AbstractC19318610i0) next3;
                if (interfaceC19318710i1 != null && (interfaceC19318710i1 instanceof InterfaceC19318910i3)) {
                    ((InterfaceC19318910i3) interfaceC19318710i1).LIZ(null, Boolean.TRUE);
                }
                ArrayList arrayList = (ArrayList) this.LIZIZ;
                Iterator it3 = arrayList.subList(i2, arrayList.size()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next4 = it3.next();
                        if (((AbstractC19318610i0) next4).LIZIZ().LIZ()) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                InterfaceC19318710i1 interfaceC19318710i12 = (AbstractC19318610i0) next4;
                if (interfaceC19318710i12 != null && (interfaceC19318710i12 instanceof InterfaceC19318910i3)) {
                    ((InterfaceC19318910i3) interfaceC19318710i12).LIZ(Boolean.TRUE, null);
                }
            }
            i = i2;
        }
        Iterator it4 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            AbstractC19318610i0 abstractC19318610i02 = (AbstractC19318610i0) next;
            if (abstractC19318610i02.LIZIZ().LIZ() && !(abstractC19318610i02 instanceof C19319110i5) && (abstractC19318610i02 instanceof InterfaceC19318910i3)) {
                break;
            }
        }
        InterfaceC19318710i1 interfaceC19318710i13 = (AbstractC19318610i0) next;
        if (interfaceC19318710i13 != null && (interfaceC19318710i13 instanceof InterfaceC19318910i3)) {
            ((InterfaceC19318910i3) interfaceC19318710i13).LIZ(Boolean.TRUE, null);
        }
        Iterator it5 = C13LP.LJLJJLL(this.LIZIZ).iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            AbstractC19318610i0 abstractC19318610i03 = (AbstractC19318610i0) next2;
            if (abstractC19318610i03.LIZIZ().LIZ() && !(abstractC19318610i03 instanceof C19319110i5) && (abstractC19318610i03 instanceof InterfaceC19318910i3)) {
                break;
            }
        }
        InterfaceC19318710i1 interfaceC19318710i14 = (AbstractC19318610i0) next2;
        if (interfaceC19318710i14 == null || !(interfaceC19318710i14 instanceof InterfaceC19318910i3)) {
            return;
        }
        ((InterfaceC19318910i3) interfaceC19318710i14).LIZ(null, Boolean.TRUE);
    }

    public C19318810i2(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(DividerCell.class, SwitchCell.class, ButtonCell.class, RadioCell.class, LabelCell.class, ExposeCell.class, DisclosureCell.class, ComposableCell.class);
    }

    public final void LIZ(AbstractC19318610i0<?> abstractC19318610i0) {
        List<AbstractC19318610i0<?>> list = this.LIZIZ;
        abstractC19318610i0.LLILLJJLI = this.LIZ.getState();
        ((ArrayList) list).add(abstractC19318610i0);
        C20600815jK.LIZJ(this.LIZ.getState(), abstractC19318610i0.LIZJ());
    }

    public final void LIZLLL(List<? extends AbstractC19318610i0<?>> list) {
        ((ArrayList) this.LIZIZ).removeAll(list);
        Iterator<? extends AbstractC19318610i0<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            C20600815jK.LJIIL(this.LIZ.getState(), it2.next().LIZIZ());
        }
    }

    public final void LIZIZ(int i, List<? extends AbstractC19318610i0<?>> list) {
        List<AbstractC19318610i0<?>> list2 = this.LIZIZ;
        Iterator<? extends AbstractC19318610i0<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LLILLJJLI = this.LIZ.getState();
        }
        ((ArrayList) list2).addAll(i, list);
        C20600815jK<InterfaceC1891350zJl> state = this.LIZ.getState();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends AbstractC19318610i0<?>> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().LIZJ());
        }
        C20600815jK.LJ(state, i, arrayList);
    }
}
