package X;

import Y.ALAdapterS3S0400000_19;
import android.animation.Animator;
import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import iyl.i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657890tFD implements InterfaceC1891370zJn {
    public static final /* synthetic */ int LLJJ = 0;
    public final EnumC1651310t4b LL;
    public final ViewGroup LLILLJJLI;
    public final Map<String, InterfaceC1657880tFC> LLILLL;
    public final Function0<C1657780tF2> LLILZ;
    public InterfaceC1657840tF8 LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public List<i3> LLJI;
    public LayoutTransition LLJILJIL;
    public List<i3> LLILZIL = C13BV.INSTANCE;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(436));
    public final ArrayList<View> LLJILJILJ = new ArrayList<>();
    public final ArrayList<Pair<View, Animator>> LLJILLL = new ArrayList<>();

    public final boolean LIZLLL() {
        LayoutTransition layoutTransition = this.LLJILJIL;
        Animator animator = layoutTransition != null ? layoutTransition.getAnimator(3) : null;
        int i = 0;
        if (animator == null || this.LLJILJILJ.size() > 1) {
            Iterator<View> it2 = this.LLJILJILJ.iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJJJLZIJ(it2.next(), this.LLILLJJLI);
            }
            this.LLJILJILJ.clear();
        } else {
            View view = (View) C13LP.LJJJLZIJ(0, this.LLJILJILJ);
            if (view != null) {
                Animator animatorClone = animator.clone();
                animatorClone.removeAllListeners();
                Pair<View, Animator> pair = new Pair<>(view, animatorClone);
                this.LLJILLL.add(pair);
                animatorClone.setTarget(view);
                animatorClone.addListener(new ALAdapterS3S0400000_19(animatorClone, this, pair, view, 1));
                animatorClone.start();
            }
        }
        if (this.LLIZ <= 0) {
            return this.LLJ;
        }
        List<i3> list = this.LLJI;
        if (list == null) {
            list = null;
        }
        ListIterator<i3> listIterator = list.listIterator();
        Iterator<i3> it3 = this.LLILZIL.iterator();
        while (this.LLIZ > 0 && listIterator.hasNext() && it3.hasNext()) {
            i3 next = listIterator.next();
            i3 next2 = it3.next();
            if (next == null) {
                listIterator.set(next2);
                View childAt = this.LLILLJJLI.getChildAt(i);
                if (childAt != null) {
                    C786410Ut5.LJJJLZIJ(childAt, this.LLILLJJLI);
                    ((List) this.LLJIJIL.getValue()).add(childAt);
                }
                LIZ(this.LLILLJJLI, i, next2);
                this.LLIZ--;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("section:");
                sbLIZ.append(this.LL);
                sbLIZ.append(",real replace item,index:");
                sbLIZ.append(i);
                sbLIZ.append(",config:");
                sbLIZ.append(next2);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            i++;
        }
        if (this.LLIZ <= 0) {
            List<i3> list2 = this.LLJI;
            if (list2 == null) {
                list2 = null;
            }
            if (!list2.contains(null)) {
                List<i3> list3 = this.LLJI;
                (list3 != null ? list3 : null).clear();
                return this.LLJ;
            }
        }
        throw new IllegalStateException("diff update error");
    }

    public final void LIZIZ() {
        List<i3> list = this.LLJI;
        if (list != null) {
            list.clear();
        }
        this.LLILZIL = C13BV.INSTANCE;
        ((List) this.LLJIJIL.getValue()).clear();
        this.LLIZ = 0;
        this.LLIZLLLIL = false;
        LIZJ();
        this.LLJILJIL = null;
    }

    public final void LIZJ() {
        for (Pair<View, Animator> pair : this.LLJILLL) {
            pair.getSecond().cancel();
            LJFF(pair.getFirst());
        }
        this.LLJILLL.clear();
        Iterator<View> it2 = this.LLJILJILJ.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJJJLZIJ(it2.next(), this.LLILLJJLI);
        }
        this.LLJILJILJ.clear();
    }

    public static void LJFF(View view) {
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.Jc(view, 0.0f);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) {
        this.LLJ = true;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            List<i3> list = null;
            if (this.LLIZLLLIL) {
                i3 i3Var = (i3) C13LP.LJJJLZIJ(i4, this.LLILZIL);
                List<i3> list2 = this.LLJI;
                if (list2 != null) {
                    list = list2;
                }
                ListProtector.add(list, i4, i3Var);
                LIZ(this.LLILLJJLI, i4, i3Var);
            } else {
                List<i3> list3 = this.LLJI;
                if (list3 == null) {
                    list3 = null;
                }
                ListProtector.add(list3, i4, null);
                ViewGroup viewGroup = this.LLILLJJLI;
                Context context = viewGroup.getContext();
                View view = (View) C19719612Di.LJJIIZI((List) this.LLJIJIL.getValue());
                if (view == null) {
                    view = new View(context);
                    C786410Ut5.LJLLLLLL(8, view);
                    C786410Ut5.W5(view, new ViewGroup.LayoutParams(0, 0));
                }
                viewGroup.addView(view, i4);
                this.LLIZ++;
            }
        }
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        List<i3> list = this.LLJI;
        List<i3> list2 = null;
        if (list == null) {
            list = null;
        } else {
            list2 = list;
        }
        ListProtector.add(list2, i2, ListProtector.remove(list, i));
        View childAt = this.LLILLJJLI.getChildAt(i);
        C786410Ut5.LJJLIL(i, this.LLILLJJLI);
        this.LLILLJJLI.addView(childAt, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) {
        this.LLJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("section:");
        sbLIZ.append(this.LL);
        sbLIZ.append(",onRemoved,section:");
        sbLIZ.append(this.LL);
        sbLIZ.append(",position:");
        sbLIZ.append(i);
        sbLIZ.append(",count:");
        sbLIZ.append(i2);
        sbLIZ.append(",viewSize:");
        sbLIZ.append(this.LLILLJJLI.getChildCount());
        sbLIZ.append(",config:");
        List<i3> list = this.LLJI;
        if (list == null) {
            list = null;
        }
        sbLIZ.append(C13LP.LJJJLZIJ(i, list));
        C2188811AlT.LIZIZ(sbLIZ);
        for (int i3 = 0; i3 < i2; i3++) {
            List<i3> list2 = this.LLJI;
            if (list2 == null) {
                list2 = null;
            }
            ListProtector.remove(list2, i);
        }
        int i4 = i2 + i;
        while (i < i4) {
            View childAt = this.LLILLJJLI.getChildAt(i);
            if (childAt != null) {
                this.LLJILJILJ.add(childAt);
            }
            i++;
        }
    }

    public final void LIZ(ViewGroup viewGroup, int i, i3 i3Var) {
        Animator animator;
        C1657780tF2 c1657780tF2Invoke;
        if (i3Var == null) {
            return;
        }
        Map<String, InterfaceC1657880tFC> map = this.LLILLL;
        String str = i3Var.LLJLIL;
        InterfaceC1657880tFC interfaceC1657880tFCLIZIZ = map.get(str);
        if (interfaceC1657880tFCLIZIZ == null) {
            InterfaceC1657840tF8 interfaceC1657840tF8 = this.LLILZLL;
            if (interfaceC1657840tF8 != null) {
                interfaceC1657880tFCLIZIZ = interfaceC1657840tF8.LIZIZ(i3Var);
                map.put(str, interfaceC1657880tFCLIZIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        InterfaceC1657880tFC interfaceC1657880tFC = interfaceC1657880tFCLIZIZ;
        View viewLIZIZ = interfaceC1657880tFC.LIZIZ(i, viewGroup);
        int childCount = viewGroup.getChildCount();
        if (i > childCount) {
            i = childCount;
        }
        LayoutTransition layoutTransition = this.LLJILJIL;
        if (layoutTransition != null) {
            animator = layoutTransition.getAnimator(2);
        } else {
            animator = null;
        }
        if (this.LLJILJILJ.size() > 0 && animator != null) {
            i += this.LLJILJILJ.size();
        }
        viewGroup.addView(viewLIZIZ, i);
        if (animator != null) {
            Animator animatorClone = animator.clone();
            animatorClone.removeAllListeners();
            Pair<View, Animator> pair = new Pair<>(viewLIZIZ, animatorClone);
            this.LLJILLL.add(pair);
            animatorClone.setTarget(viewLIZIZ);
            animatorClone.addListener(new ALAdapterS3S0400000_19(animatorClone, this, pair, viewLIZIZ, 0));
            animatorClone.start();
        }
        if ((interfaceC1657880tFC instanceof InterfaceC1651590t53) && (c1657780tF2Invoke = this.LLILZ.invoke()) != null) {
            ((InterfaceC1651590t53) interfaceC1657880tFC).LJI(c1657780tF2Invoke);
        }
        interfaceC1657880tFC.LIZJ(i3Var);
    }

    public final void LJ(List<i3> list, List<i3> list2, LayoutTransition layoutTransition) {
        this.LLJILJIL = layoutTransition;
        this.LLJI = new ArrayList(list);
        this.LLILZIL = list2;
        LIZJ();
        List<i3> list3 = this.LLJI;
        if (list3 == null) {
            list3 = null;
        }
        this.LLIZLLLIL = list3.isEmpty();
        this.LLJ = false;
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        i3 next;
        String str;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            List<i3> list = this.LLJI;
            List<i3> list2 = null;
            if (list == null) {
                list = null;
            }
            i3 i3Var = (i3) C13LP.LJJJLZIJ(i4, list);
            Iterator<i3> it2 = this.LLILZIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str2 = next.LLJLIL;
                    if (i3Var != null) {
                        str = i3Var.LLJLIL;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            i3 i3Var2 = next;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("section:");
            sbLIZ.append(this.LL);
            sbLIZ.append(",onChanged:section:");
            sbLIZ.append(this.LL);
            sbLIZ.append(",targetPosition:");
            sbLIZ.append(i4);
            sbLIZ.append(",pendingDataSize:");
            List<i3> list3 = this.LLJI;
            if (list3 == null) {
                list3 = null;
            }
            sbLIZ.append(list3.size());
            sbLIZ.append(",old:");
            sbLIZ.append(i3Var);
            sbLIZ.append(",new:");
            sbLIZ.append(i3Var2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (i3Var2 != null) {
                List<i3> list4 = this.LLJI;
                if (list4 != null) {
                    list2 = list4;
                }
                ListProtector.set(list2, i4, i3Var2);
                InterfaceC1657880tFC interfaceC1657880tFC = this.LLILLL.get(i3Var2.LLJLIL);
                if (interfaceC1657880tFC != null) {
                    interfaceC1657880tFC.LIZ(i3Var2);
                }
            }
        }
    }

    public C1657890tFD(EnumC1651310t4b enumC1651310t4b, ViewGroup viewGroup, Map<String, InterfaceC1657880tFC> map, Function0<C1657780tF2> function0) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = map;
        this.LLILZ = function0;
    }
}
