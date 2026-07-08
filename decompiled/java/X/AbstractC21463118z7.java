package X;

import Y.ALAdapterS26S0100000_32;
import Y.ALAdapterS26S0200000_32;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18z7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21463118z7 implements Cloneable {
    public static final int[] LLJJJJJIL = {2, 1, 3, 4};
    public static final C21460118yd LLJJJJLIIL = new AbstractC21459818ya() { // from class: X.18yd
        @Override // X.AbstractC21459818ya
        public final Path LIZ(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    public static final ThreadLocal<C830490Whz<Animator, C21463418zA>> LLJJL = new ThreadLocal<>();
    public ArrayList<C1489080oqw> LLJILJILJ;
    public ArrayList<C1489080oqw> LLJILLL;
    public AbstractC21465118zR LLJJJ;
    public AbstractC21463718zD LLJJJIL;
    public final String LL = getClass().getName();
    public long LLILLJJLI = -1;
    public long LLILLL = -1;
    public TimeInterpolator LLILZ = null;
    public final ArrayList<Integer> LLILZIL = new ArrayList<>();
    public final ArrayList<View> LLILZLL = new ArrayList<>();
    public ArrayList<Integer> LLIZ = null;
    public ArrayList<View> LLIZLLLIL = null;
    public C21463318z9 LLJ = new C21463318z9();
    public C21463318z9 LLJI = new C21463318z9();
    public C21463018z6 LLJIJIL = null;
    public final int[] LLJILJIL = LLJJJJJIL;
    public final ArrayList<Animator> LLJJ = new ArrayList<>();
    public int LLJJI = 0;
    public boolean LLJJIII = false;
    public boolean LLJJIJI = false;
    public ArrayList<InterfaceC21462418z0> LLJJIJIIJIL = null;
    public ArrayList<Animator> LLJJIJIL = new ArrayList<>();
    public AbstractC21459818ya LLJJJJ = LLJJJJLIIL;

    public abstract void LIZLLL(C1489080oqw c1489080oqw);

    public abstract void LJI(C1489080oqw c1489080oqw);

    @Override // 
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public AbstractC21463118z7 clone() {
        try {
            AbstractC21463118z7 abstractC21463118z7 = (AbstractC21463118z7) super.clone();
            abstractC21463118z7.LLJJIJIL = new ArrayList<>();
            abstractC21463118z7.LLJ = new C21463318z9();
            abstractC21463118z7.LLJI = new C21463318z9();
            abstractC21463118z7.LLJILJILJ = null;
            abstractC21463118z7.LLJILLL = null;
            return abstractC21463118z7;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public Animator LJIIJ(ViewGroup viewGroup, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        return null;
    }

    public String[] LJIJI() {
        return null;
    }

    public static C830490Whz<Animator, C21463418zA> LJIJ() {
        ThreadLocal<C830490Whz<Animator, C21463418zA>> threadLocal = LLJJL;
        C830490Whz<Animator, C21463418zA> c830490Whz = threadLocal.get();
        if (c830490Whz != null) {
            return c830490Whz;
        }
        C830490Whz<Animator, C21463418zA> c830490Whz2 = new C830490Whz<>();
        threadLocal.set(c830490Whz2);
        return c830490Whz2;
    }

    public final void LJIIL() {
        int i = this.LLJJI - 1;
        this.LLJJI = i;
        if (i == 0) {
            ArrayList<InterfaceC21462418z0> arrayList = this.LLJJIJIIJIL;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.LLJJIJIIJIL.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC21462418z0) ListProtector.get(arrayList2, i2)).LIZLLL(this);
                }
            }
            for (int i3 = 0; i3 < this.LLJ.LIZJ.LJIIJJI(); i3++) {
                View viewLJIIL = this.LLJ.LIZJ.LJIIL(i3);
                if (viewLJIIL != null) {
                    viewLJIIL.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.LLJI.LIZJ.LJIIJJI(); i4++) {
                View viewLJIIL2 = this.LLJI.LIZJ.LJIIL(i4);
                if (viewLJIIL2 != null) {
                    viewLJIIL2.setHasTransientState(false);
                }
            }
            this.LLJJIJI = true;
        }
    }

    public final void LJJIJL() {
        if (this.LLJJI == 0) {
            ArrayList<InterfaceC21462418z0> arrayList = this.LLJJIJIIJIL;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.LLJJIJIIJIL.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC21462418z0) ListProtector.get(arrayList2, i)).LIZ();
                }
            }
            this.LLJJIJI = false;
        }
        this.LLJJI++;
    }

    public final String toString() {
        return LJJIJLIJ("");
    }

    public void LJJIIJZLJL() {
        LJJIJL();
        C830490Whz<Animator, C21463418zA> c830490WhzLJIJ = LJIJ();
        for (Animator animator : this.LLJJIJIL) {
            if (c830490WhzLJIJ.containsKey(animator)) {
                LJJIJL();
                if (animator != null) {
                    animator.addListener(new ALAdapterS26S0200000_32(this, c830490WhzLJIJ, 10));
                    long j = this.LLILLL;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.LLILLJJLI;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.LLILZ;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new ALAdapterS26S0100000_32(this, 19));
                    animator.start();
                }
            }
        }
        this.LLJJIJIL.clear();
        LJIIL();
    }

    public AbstractC21463118z7 LIZ(InterfaceC21462418z0 interfaceC21462418z0) {
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = new ArrayList<>();
        }
        this.LLJJIJIIJIL.add(interfaceC21462418z0);
        return this;
    }

    public void LIZIZ(View view) {
        this.LLILZLL.add(view);
    }

    public void LJFF(C1489080oqw c1489080oqw) {
        if (this.LLJJJ != null && !((HashMap) c1489080oqw.LIZ).isEmpty()) {
            getClass();
            for (String str : AbstractC21463818zE.LIZ) {
                if (!((HashMap) c1489080oqw.LIZ).containsKey(str)) {
                    getClass();
                    View view = c1489080oqw.LIZIZ;
                    Object objValueOf = ((HashMap) c1489080oqw.LIZ).get("android:visibility:visibility");
                    if (objValueOf == null) {
                        objValueOf = Integer.valueOf(view.getVisibility());
                    }
                    ((HashMap) c1489080oqw.LIZ).put("android:visibilityPropagation:visibility", objValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = iArr[0] + Math.round(view.getTranslationX());
                    iArr[0] = iRound + (view.getWidth() / 2);
                    int iRound2 = iArr[1] + Math.round(view.getTranslationY());
                    iArr[1] = iRound2;
                    iArr[1] = iRound2 + (view.getHeight() / 2);
                    ((HashMap) c1489080oqw.LIZ).put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            this.LLJ.LIZ.clear();
            this.LLJ.LIZIZ.clear();
            this.LLJ.LIZJ.LIZIZ();
        } else {
            this.LLJI.LIZ.clear();
            this.LLJI.LIZIZ.clear();
            this.LLJI.LIZJ.LIZIZ();
        }
    }

    public AbstractC21463118z7 LJIILIIL(int i) {
        ArrayList<Integer> arrayList = this.LLIZ;
        if (i > 0) {
            Integer numValueOf = Integer.valueOf(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(numValueOf)) {
                arrayList.add(numValueOf);
            }
        }
        this.LLIZ = arrayList;
        return this;
    }

    public AbstractC21463118z7 LJIILJJIL(View view) {
        ArrayList<View> arrayList = this.LLIZLLLIL;
        if (view != null) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
        this.LLIZLLLIL = arrayList;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIILL(ViewGroup viewGroup) {
        C830490Whz<Animator, C21463418zA> c830490WhzLJIJ = LJIJ();
        int i = c830490WhzLJIJ.LLILLL;
        if (i != 0) {
            C21461218yo c21461218yo = C21461118yn.LIZ;
            C21463918zF c21463918zF = new C21463918zF(viewGroup);
            C830490Whz c830490Whz = new C830490Whz(c830490WhzLJIJ);
            c830490WhzLJIJ.clear();
            while (true) {
                i--;
                if (i >= 0) {
                    C21463418zA c21463418zA = (C21463418zA) c830490Whz.LJIIIIZZ(i);
                    if (c21463418zA.LIZ != null && c21463918zF.equals(c21463418zA.LIZLLL)) {
                        ((Animator) c830490Whz.LJFF(i)).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean LJIL(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.LLIZ;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.LLIZLLLIL;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        if ((this.LLILZIL.size() != 0 || this.LLILZLL.size() != 0) && !this.LLILZIL.contains(Integer.valueOf(id)) && !this.LLILZLL.contains(view)) {
            return false;
        }
        return true;
    }

    public void LJJIFFI(View view) {
        if (!this.LLJJIJI) {
            C830490Whz<Animator, C21463418zA> c830490WhzLJIJ = LJIJ();
            int i = c830490WhzLJIJ.LLILLL;
            C21461218yo c21461218yo = C21461118yn.LIZ;
            C21463918zF c21463918zF = new C21463918zF(view);
            for (int i2 = i - 1; i2 >= 0; i2--) {
                C21463418zA c21463418zALJIIIIZZ = c830490WhzLJIJ.LJIIIIZZ(i2);
                if (c21463418zALJIIIIZZ.LIZ != null && c21463918zF.equals(c21463418zALJIIIIZZ.LIZLLL)) {
                    c830490WhzLJIJ.LJFF(i2).pause();
                }
            }
            ArrayList<InterfaceC21462418z0> arrayList = this.LLJJIJIIJIL;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.LLJJIJIIJIL.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC21462418z0) ListProtector.get(arrayList2, i3)).LIZIZ();
                }
            }
            this.LLJJIII = true;
        }
    }

    public void LJJII(InterfaceC21462418z0 interfaceC21462418z0) {
        ArrayList<InterfaceC21462418z0> arrayList = this.LLJJIJIIJIL;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC21462418z0);
        if (this.LLJJIJIIJIL.size() == 0) {
            this.LLJJIJIIJIL = null;
        }
    }

    public void LJJIII(View view) {
        this.LLILZLL.remove(view);
    }

    public void LJJIIJ(View view) {
        if (this.LLJJIII) {
            if (!this.LLJJIJI) {
                C830490Whz<Animator, C21463418zA> c830490WhzLJIJ = LJIJ();
                int i = c830490WhzLJIJ.LLILLL;
                C21461218yo c21461218yo = C21461118yn.LIZ;
                C21463918zF c21463918zF = new C21463918zF(view);
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    C21463418zA c21463418zALJIIIIZZ = c830490WhzLJIJ.LJIIIIZZ(i);
                    if (c21463418zALJIIIIZZ.LIZ != null && c21463918zF.equals(c21463418zALJIIIIZZ.LIZLLL)) {
                        c830490WhzLJIJ.LJFF(i).resume();
                    }
                }
                ArrayList<InterfaceC21462418z0> arrayList = this.LLJJIJIIJIL;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.LLJJIJIIJIL.clone();
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((InterfaceC21462418z0) ListProtector.get(arrayList2, i2)).LIZJ();
                    }
                }
            }
            this.LLJJIII = false;
        }
    }

    public void LJJIIZ(long j) {
        this.LLILLL = j;
    }

    public void LJJIIZI(AbstractC21463718zD abstractC21463718zD) {
        this.LLJJJIL = abstractC21463718zD;
    }

    public void LJJIJ(TimeInterpolator timeInterpolator) {
        this.LLILZ = timeInterpolator;
    }

    public void LJJIJIIJI(AbstractC21459818ya abstractC21459818ya) {
        if (abstractC21459818ya == null) {
            this.LLJJJJ = LLJJJJLIIL;
        } else {
            this.LLJJJJ = abstractC21459818ya;
        }
    }

    public void LJJIJIIJIL(AbstractC21465118zR abstractC21465118zR) {
        this.LLJJJ = abstractC21465118zR;
    }

    public void LJJIJIL(long j) {
        this.LLILLJJLI = j;
    }

    public String LJJIJLIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(e3.g);
        sbLIZ.append(Integer.toHexString(hashCode()));
        sbLIZ.append(": ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILLL != -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("dur(");
            sbLIZ2.append(this.LLILLL);
            sbLIZ2.append(") ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (this.LLILLJJLI != -1) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("dly(");
            sbLIZ3.append(this.LLILLJJLI);
            sbLIZ3.append(") ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (this.LLILZ != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append("interp(");
            sbLIZ4.append(this.LLILZ);
            sbLIZ4.append(") ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (this.LLILZIL.size() > 0 || this.LLILZLL.size() > 0) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("tgts(");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
            if (this.LLILZIL.size() > 0) {
                for (int i = 0; i < this.LLILZIL.size(); i++) {
                    if (i > 0) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(strLIZIZ2);
                        sbLIZ6.append(", ");
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
                    }
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(strLIZIZ2);
                    sbLIZ7.append(ListProtector.get(this.LLILZIL, i));
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                }
            }
            if (this.LLILZLL.size() > 0) {
                for (int i2 = 0; i2 < this.LLILZLL.size(); i2++) {
                    if (i2 > 0) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append(strLIZIZ2);
                        sbLIZ8.append(", ");
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                    }
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(strLIZIZ2);
                    sbLIZ9.append(ListProtector.get(this.LLILZLL, i2));
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ9);
                }
            }
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(strLIZIZ2);
            sbLIZ10.append(")");
            return C2188811AlT.LIZIZ(sbLIZ10);
        }
        return strLIZIZ;
    }

    public final void LJ(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.LLIZ;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.LLIZLLLIL;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            C1489080oqw c1489080oqw = new C1489080oqw(view);
            if (z) {
                LJI(c1489080oqw);
            } else {
                LIZLLL(c1489080oqw);
            }
            c1489080oqw.LIZJ.add(this);
            LJFF(c1489080oqw);
            if (z) {
                LIZJ(this.LLJ, view, c1489080oqw);
            } else {
                LIZJ(this.LLJI, view, c1489080oqw);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJ(viewGroup.getChildAt(i), z);
            }
        }
    }

    public final void LJII(ViewGroup viewGroup, boolean z) {
        LJIIIIZZ(z);
        if (this.LLILZIL.size() <= 0 && this.LLILZLL.size() <= 0) {
            LJ(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.LLILZIL.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) ListProtector.get(this.LLILZIL, i)).intValue());
            if (viewFindViewById != null) {
                C1489080oqw c1489080oqw = new C1489080oqw(viewFindViewById);
                if (z) {
                    LJI(c1489080oqw);
                } else {
                    LIZLLL(c1489080oqw);
                }
                c1489080oqw.LIZJ.add(this);
                LJFF(c1489080oqw);
                if (z) {
                    LIZJ(this.LLJ, viewFindViewById, c1489080oqw);
                } else {
                    LIZJ(this.LLJI, viewFindViewById, c1489080oqw);
                }
            }
        }
        for (int i2 = 0; i2 < this.LLILZLL.size(); i2++) {
            View view = (View) ListProtector.get(this.LLILZLL, i2);
            C1489080oqw c1489080oqw2 = new C1489080oqw(view);
            if (z) {
                LJI(c1489080oqw2);
            } else {
                LIZLLL(c1489080oqw2);
            }
            c1489080oqw2.LIZJ.add(this);
            LJFF(c1489080oqw2);
            if (z) {
                LIZJ(this.LLJ, view, c1489080oqw2);
            } else {
                LIZJ(this.LLJI, view, c1489080oqw2);
            }
        }
    }

    public final C1489080oqw LJIILLIIL(View view, boolean z) {
        ArrayList<C1489080oqw> arrayList;
        ArrayList<C1489080oqw> arrayList2;
        C21463018z6 c21463018z6 = this.LLJIJIL;
        if (c21463018z6 != null) {
            return c21463018z6.LJIILLIIL(view, z);
        }
        if (z) {
            arrayList = this.LLJILJILJ;
        } else {
            arrayList = this.LLJILLL;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1489080oqw c1489080oqw = (C1489080oqw) ListProtector.get(arrayList, i);
            if (c1489080oqw == null) {
                return null;
            }
            if (c1489080oqw.LIZIZ == view) {
                if (i < 0) {
                    return null;
                }
                if (z) {
                    arrayList2 = this.LLJILLL;
                } else {
                    arrayList2 = this.LLJILJILJ;
                }
                return (C1489080oqw) ListProtector.get(arrayList2, i);
            }
        }
        return null;
    }

    public final C1489080oqw LJIJJ(View view, boolean z) {
        C21463318z9 c21463318z9;
        C21463018z6 c21463018z6 = this.LLJIJIL;
        if (c21463018z6 != null) {
            return c21463018z6.LJIJJ(view, z);
        }
        if (z) {
            c21463318z9 = this.LLJ;
        } else {
            c21463318z9 = this.LLJI;
        }
        return c21463318z9.LIZ.get(view);
    }

    public boolean LJIJJLI(C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        if (c1489080oqw == null || c1489080oqw2 == null) {
            return false;
        }
        String[] strArrLJIJI = LJIJI();
        if (strArrLJIJI != null) {
            for (String str : strArrLJIJI) {
                if (!LJJI(c1489080oqw, c1489080oqw2, str)) {
                }
            }
            return false;
        }
        Iterator it2 = ((HashMap) c1489080oqw.LIZ).keySet().iterator();
        while (it2.hasNext()) {
            if (LJJI(c1489080oqw, c1489080oqw2, (String) it2.next())) {
            }
        }
        return false;
        return true;
    }

    public static void LIZJ(C21463318z9 c21463318z9, View view, C1489080oqw c1489080oqw) {
        c21463318z9.LIZ.put(view, c1489080oqw);
        int id = view.getId();
        if (id >= 0) {
            if (c21463318z9.LIZIZ.indexOfKey(id) >= 0) {
                c21463318z9.LIZIZ.put(id, null);
            } else {
                c21463318z9.LIZIZ.put(id, view);
            }
        }
        String strLJIIJ = C14K9.LJIIJ(view);
        if (strLJIIJ != null) {
            if (c21463318z9.LIZLLL.containsKey(strLJIIJ)) {
                c21463318z9.LIZLLL.put(strLJIIJ, null);
            } else {
                c21463318z9.LIZLLL.put(strLJIIJ, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c21463318z9.LIZJ.LJI(itemIdAtPosition) >= 0) {
                    View viewLJ = c21463318z9.LIZJ.LJ(itemIdAtPosition);
                    if (viewLJ != null) {
                        viewLJ.setHasTransientState(false);
                        c21463318z9.LIZJ.LJIIIZ(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c21463318z9.LIZJ.LJIIIZ(itemIdAtPosition, view);
            }
        }
    }

    public static boolean LJJI(C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2, String str) {
        Object obj = c1489080oqw.LIZ.get(str);
        Object obj2 = c1489080oqw2.LIZ.get(str);
        if (obj == null) {
            if (obj2 == null) {
                return false;
            }
            return true;
        }
        if (obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIJJI(android.view.ViewGroup r26, X.C21463318z9 r27, X.C21463318z9 r28, java.util.ArrayList<X.C1489080oqw> r29, java.util.ArrayList<X.C1489080oqw> r30) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21463118z7.LJIIJJI(android.view.ViewGroup, X.18z9, X.18z9, java.util.ArrayList, java.util.ArrayList):void");
    }
}
