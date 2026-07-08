package X;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.18z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21463018z6 extends AbstractC21463118z7 {
    public int LLJLIL;
    public ArrayList<AbstractC21463118z7> LLJJLIIIJLLLLLLLZ = new ArrayList<>();
    public boolean LLJL = true;
    public boolean LLJLILLLLZIIL = false;
    public int LLJLL = 0;

    @Override // X.AbstractC21463118z7
    public final AbstractC21463118z7 LJIILIIL(int i) {
        throw null;
    }

    @Override // X.AbstractC21463118z7
    public final AbstractC21463118z7 LJIILJJIL(View view) {
        throw null;
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIIJZLJL() {
        if (this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
            LJJIJL();
            LJIIL();
            return;
        }
        C1149100g0a c1149100g0a = new C1149100g0a(this) { // from class: X.18z3
            public final C21463018z6 LL;

            @Override // X.C1149100g0a, X.InterfaceC21462418z0
            public final void LIZ() {
                C21463018z6 c21463018z6 = this.LL;
                if (c21463018z6.LLJLILLLLZIIL) {
                    return;
                }
                c21463018z6.LJJIJL();
                this.LL.LLJLILLLLZIIL = true;
            }

            {
                this.LL = this;
            }

            @Override // X.C1149100g0a, X.InterfaceC21462418z0
            public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
                C21463018z6 c21463018z6 = this.LL;
                int i = c21463018z6.LLJLIL - 1;
                c21463018z6.LLJLIL = i;
                if (i == 0) {
                    c21463018z6.LLJLILLLLZIIL = false;
                    c21463018z6.LJIIL();
                }
                abstractC21463118z7.LJJII(this);
            }
        };
        Iterator<AbstractC21463118z7> it2 = this.LLJJLIIIJLLLLLLLZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c1149100g0a);
        }
        this.LLJLIL = this.LLJJLIIIJLLLLLLLZ.size();
        if (this.LLJL) {
            Iterator<AbstractC21463118z7> it3 = this.LLJJLIIIJLLLLLLLZ.iterator();
            while (it3.hasNext()) {
                it3.next().LJJIIJZLJL();
            }
            return;
        }
        for (int i = 1; i < this.LLJJLIIIJLLLLLLLZ.size(); i++) {
            AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i - 1);
            final AbstractC21463118z7 abstractC21463118z72 = (AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i);
            abstractC21463118z7.LIZ(new C1149100g0a() { // from class: X.18z4
                @Override // X.C1149100g0a, X.InterfaceC21462418z0
                public final void LIZLLL(AbstractC21463118z7 abstractC21463118z73) {
                    abstractC21463118z72.LJJIIJZLJL();
                    abstractC21463118z73.LJJII(this);
                }
            });
        }
        AbstractC21463118z7 abstractC21463118z73 = (AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, 0);
        if (abstractC21463118z73 != null) {
            abstractC21463118z73.LJJIIJZLJL();
        }
    }

    @Override // X.AbstractC21463118z7
    /* JADX INFO: renamed from: LJIIIZ */
    public final AbstractC21463118z7 clone() {
        C21463018z6 c21463018z6 = (C21463018z6) super.clone();
        c21463018z6.LLJJLIIIJLLLLLLLZ = new ArrayList<>();
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            AbstractC21463118z7 abstractC21463118z7Clone = ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).clone();
            c21463018z6.LLJJLIIIJLLLLLLLZ.add(abstractC21463118z7Clone);
            abstractC21463118z7Clone.LLJIJIL = c21463018z6;
        }
        return c21463018z6;
    }

    @Override // X.AbstractC21463118z7
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // X.AbstractC21463118z7
    public final AbstractC21463118z7 LIZ(InterfaceC21462418z0 interfaceC21462418z0) {
        super.LIZ(interfaceC21462418z0);
        return this;
    }

    @Override // X.AbstractC21463118z7
    public final void LIZIZ(View view) {
        for (int i = 0; i < this.LLJJLIIIJLLLLLLLZ.size(); i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LIZIZ(view);
        }
        this.LLILZLL.add(view);
    }

    @Override // X.AbstractC21463118z7
    public final void LIZLLL(C1489080oqw c1489080oqw) {
        if (LJIL(c1489080oqw.LIZIZ)) {
            for (AbstractC21463118z7 abstractC21463118z7 : this.LLJJLIIIJLLLLLLLZ) {
                if (abstractC21463118z7.LJIL(c1489080oqw.LIZIZ)) {
                    abstractC21463118z7.LIZLLL(c1489080oqw);
                    c1489080oqw.LIZJ.add(abstractC21463118z7);
                }
            }
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJFF(C1489080oqw c1489080oqw) {
        super.LJFF(c1489080oqw);
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJFF(c1489080oqw);
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJI(C1489080oqw c1489080oqw) {
        if (LJIL(c1489080oqw.LIZIZ)) {
            for (AbstractC21463118z7 abstractC21463118z7 : this.LLJJLIIIJLLLLLLLZ) {
                if (abstractC21463118z7.LJIL(c1489080oqw.LIZIZ)) {
                    abstractC21463118z7.LJI(c1489080oqw);
                    c1489080oqw.LIZJ.add(abstractC21463118z7);
                }
            }
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJIILL(ViewGroup viewGroup) {
        super.LJIILL(viewGroup);
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJIILL(viewGroup);
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIFFI(View view) {
        super.LJJIFFI(view);
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIFFI(view);
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJJII(InterfaceC21462418z0 interfaceC21462418z0) {
        super.LJJII(interfaceC21462418z0);
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIII(View view) {
        for (int i = 0; i < this.LLJJLIIIJLLLLLLLZ.size(); i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIII(view);
        }
        this.LLILZLL.remove(view);
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIIJ(View view) {
        super.LJJIIJ(view);
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIIJ(view);
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIIZI(AbstractC21463718zD abstractC21463718zD) {
        this.LLJJJIL = abstractC21463718zD;
        this.LLJLL |= 8;
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIIZI(abstractC21463718zD);
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIJIIJI(AbstractC21459818ya abstractC21459818ya) {
        super.LJJIJIIJI(abstractC21459818ya);
        this.LLJLL |= 4;
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            for (int i = 0; i < this.LLJJLIIIJLLLLLLLZ.size(); i++) {
                ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIJIIJI(abstractC21459818ya);
            }
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIJIIJIL(AbstractC21465118zR abstractC21465118zR) {
        this.LLJJJ = abstractC21465118zR;
        this.LLJLL |= 2;
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIJIIJIL(abstractC21465118zR);
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJJIJIL(long j) {
        this.LLILLJJLI = j;
    }

    @Override // X.AbstractC21463118z7
    public final String LJJIJLIJ(String str) {
        String strLJJIJLIJ = super.LJJIJLIJ(str);
        for (int i = 0; i < this.LLJJLIIIJLLLLLLLZ.size(); i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJIJLIJ);
            sbLIZ.append("\n");
            AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("  ");
            sbLIZ.append(abstractC21463118z7.LJJIJLIJ(C2188811AlT.LIZIZ(sbLIZ2)));
            strLJJIJLIJ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLJJIJLIJ;
    }

    public final void LJJIZ(InterfaceC21462418z0 interfaceC21462418z0) {
        super.LIZ(interfaceC21462418z0);
    }

    public final void LJJJ(AbstractC21463118z7 abstractC21463118z7) {
        this.LLJJLIIIJLLLLLLLZ.add(abstractC21463118z7);
        abstractC21463118z7.LLJIJIL = this;
        long j = this.LLILLL;
        if (j >= 0) {
            abstractC21463118z7.LJJIIZ(j);
        }
        if ((this.LLJLL & 1) != 0) {
            abstractC21463118z7.LJJIJ(this.LLILZ);
        }
        if ((this.LLJLL & 2) != 0) {
            abstractC21463118z7.LJJIJIIJIL(this.LLJJJ);
        }
        if ((this.LLJLL & 4) != 0) {
            abstractC21463118z7.LJJIJIIJI(this.LLJJJJ);
        }
        if ((this.LLJLL & 8) != 0) {
            abstractC21463118z7.LJJIIZI(this.LLJJJIL);
        }
    }

    @Override // X.AbstractC21463118z7
    /* JADX INFO: renamed from: LJJJI, reason: merged with bridge method [inline-methods] */
    public final void LJJIIZ(long j) {
        ArrayList<AbstractC21463118z7> arrayList;
        this.LLILLL = j;
        if (j >= 0 && (arrayList = this.LLJJLIIIJLLLLLLLZ) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIIZ(j);
            }
        }
    }

    @Override // X.AbstractC21463118z7
    /* JADX INFO: renamed from: LJJJIL, reason: merged with bridge method [inline-methods] */
    public final void LJJIJ(TimeInterpolator timeInterpolator) {
        this.LLJLL |= 1;
        ArrayList<AbstractC21463118z7> arrayList = this.LLJJLIIIJLLLLLLLZ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i)).LJJIJ(timeInterpolator);
            }
        }
        this.LLILZ = timeInterpolator;
    }

    public final void LJJJJ(int i) {
        if (i != 0) {
            if (i == 1) {
                this.LLJL = false;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid parameter for TransitionSet ordering: ");
            sbLIZ.append(i);
            throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJL = true;
    }

    @Override // X.AbstractC21463118z7
    public final void LJIIJJI(ViewGroup viewGroup, C21463318z9 c21463318z9, C21463318z9 c21463318z92, ArrayList<C1489080oqw> arrayList, ArrayList<C1489080oqw> arrayList2) {
        long j = this.LLILLJJLI;
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, i);
            if (j > 0 && (this.LLJL || i == 0)) {
                long j2 = abstractC21463118z7.LLILLJJLI;
                if (j2 > 0) {
                    abstractC21463118z7.LJJIJIL(j2 + j);
                } else {
                    abstractC21463118z7.LJJIJIL(j);
                }
            }
            abstractC21463118z7.LJIIJJI(viewGroup, c21463318z9, c21463318z92, arrayList, arrayList2);
        }
    }
}
