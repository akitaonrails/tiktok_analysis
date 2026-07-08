package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import iyl.i3;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658040tFS implements InterfaceC1891370zJn {
    public final ViewGroup LL;
    public final Map<String, InterfaceC1657880tFC> LLILLJJLI;
    public final Function0<C1657780tF2> LLILLL;
    public List<i3> LLILZ;
    public InterfaceC1657840tF8 LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public List<i3> LLJ;

    public C1658040tFS() {
        throw null;
    }

    public final boolean LIZIZ() {
        if (this.LLILZLL <= 0) {
            return this.LLIZLLLIL;
        }
        List<i3> list = this.LLJ;
        if (list == null) {
            list = null;
        }
        ListIterator<i3> listIterator = list.listIterator();
        Iterator<i3> it2 = this.LLILZ.iterator();
        int i = 0;
        while (this.LLILZLL > 0 && listIterator.hasNext() && it2.hasNext()) {
            i3 next = listIterator.next();
            i3 next2 = it2.next();
            if (next == null) {
                listIterator.set(next2);
                LIZ(this.LL, i, next2);
                this.LLILZLL--;
            }
            i++;
        }
        if (this.LLILZLL <= 0) {
            List<i3> list2 = this.LLJ;
            if (list2 == null) {
                list2 = null;
            }
            if (!list2.contains(null)) {
                List<i3> list3 = this.LLJ;
                (list3 != null ? list3 : null).clear();
                return this.LLIZLLLIL;
            }
        }
        throw new IllegalStateException("diff update error");
    }

    public C1658040tFS(ViewGroup viewGroup, Map map) {
        AFwS214S0000000_25 aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(434);
        this.LL = viewGroup;
        this.LLILLJJLI = map;
        this.LLILLL = aFwS214S0000000_25;
        this.LLILZ = C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1891370zJn
    public final void LJZL(int i, int i2) {
        this.LLIZLLLIL = true;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            List<i3> list = null;
            if (this.LLIZ) {
                i3 i3Var = (i3) C13LP.LJJJLZIJ(i4, this.LLILZ);
                List<i3> list2 = this.LLJ;
                if (list2 != null) {
                    list = list2;
                }
                ListProtector.add(list, i4, i3Var);
                LIZ(this.LL, i4, i3Var);
            } else {
                List<i3> list3 = this.LLJ;
                if (list3 == null) {
                    list3 = null;
                }
                ListProtector.add(list3, i4, null);
                this.LLILZLL++;
            }
        }
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLI(int i, int i2) {
        List<i3> list = this.LLJ;
        List<i3> list2 = null;
        if (list == null) {
            list = null;
        } else {
            list2 = list;
        }
        ListProtector.add(list2, i2, ListProtector.remove(list, i));
        View childAt = this.LL.getChildAt(i);
        C786410Ut5.LJJLIL(i, this.LL);
        this.LL.addView(childAt, i2);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLIZLLLIL(int i, int i2) {
        this.LLIZLLLIL = true;
        for (int i3 = 0; i3 < i2; i3++) {
            List<i3> list = this.LLJ;
            if (list == null) {
                list = null;
            }
            ListProtector.remove(list, i);
        }
        C786410Ut5.LJJZ(i, i2, this.LL);
    }

    public final void LIZ(ViewGroup viewGroup, int i, i3 i3Var) {
        C1657780tF2 c1657780tF2Invoke;
        if (i3Var == null) {
            return;
        }
        Map<String, InterfaceC1657880tFC> map = this.LLILLJJLI;
        String str = i3Var.LLJLIL;
        InterfaceC1657880tFC interfaceC1657880tFCLIZIZ = map.get(str);
        if (interfaceC1657880tFCLIZIZ == null) {
            InterfaceC1657840tF8 interfaceC1657840tF8 = this.LLILZIL;
            if (interfaceC1657840tF8 != null) {
                interfaceC1657880tFCLIZIZ = interfaceC1657840tF8.LIZIZ(i3Var);
                map.put(str, interfaceC1657880tFCLIZIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        InterfaceC1657880tFC interfaceC1657880tFC = interfaceC1657880tFCLIZIZ;
        viewGroup.addView(interfaceC1657880tFC.LIZIZ(i, viewGroup), i);
        if ((interfaceC1657880tFC instanceof InterfaceC1651590t53) && (c1657780tF2Invoke = this.LLILLL.invoke()) != null) {
            ((InterfaceC1651590t53) interfaceC1657880tFC).LJI(c1657780tF2Invoke);
        }
        interfaceC1657880tFC.LIZJ(i3Var);
    }

    @Override // X.InterfaceC1891370zJn
    public final void LLJJJJJIL(int i, int i2, Object obj) {
        i3 next;
        String str;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            List<i3> list = this.LLJ;
            List<i3> list2 = null;
            if (list == null) {
                list = null;
            }
            i3 i3Var = (i3) C13LP.LJJJLZIJ(i4, list);
            Iterator<i3> it2 = this.LLILZ.iterator();
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
            if (i3Var2 != null) {
                List<i3> list3 = this.LLJ;
                if (list3 != null) {
                    list2 = list3;
                }
                ListProtector.set(list2, i4, i3Var2);
                InterfaceC1657880tFC interfaceC1657880tFC = this.LLILLJJLI.get(i3Var2.LLJLIL);
                if (interfaceC1657880tFC != null) {
                    interfaceC1657880tFC.LIZ(i3Var2);
                }
            }
        }
    }
}
