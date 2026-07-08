package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768070UAz extends PagerAdapter {
    public final String LLILLJJLI;
    public final LifecycleCoroutineScope LLILLL;
    public final StickerEffectViewModel LLILZ;
    public final C766200U3u LLILZIL;
    public final C0UA2 LLILZLL;
    public C0UBD LLIZLLLIL;
    public C0UBE LLJ;
    public C0UB0 LLJIJIL;
    public Integer LLJILJIL;
    public final List<C0UBH> LLIZ = new ArrayList();
    public final List<C0UB0> LLJI = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLIZ).size();
    }

    public final void LJJIJIL(int i) {
        C0UB0 c0ub0;
        Object next;
        String str;
        Integer num;
        Integer num2 = null;
        if (i >= ((ArrayList) this.LLIZ).size()) {
            HashMap map = new HashMap();
            map.put("error_type", "onPanelSelected_IndexOutOfBoundsException");
            HashMap map2 = new HashMap();
            map2.put("position", Integer.valueOf(i));
            map2.put("dataList", C13LP.LJJLIIIJ(this.LLIZ, ",", null, null, 0, null, null, 62));
            map2.put("error_stack", Log.getStackTraceString(new Exception()));
            C1CC2.LIZLLL("ttlive_quality_stability_error", map, null, map2);
            return;
        }
        C0UB0 c0ub02 = this.LLJIJIL;
        if ((c0ub02 == null || (num = c0ub02.LIZJ) == null || num.intValue() != i) && (c0ub0 = this.LLJIJIL) != null) {
            if (c0ub0.LJ) {
                c0ub0.LJ = false;
            }
            c0ub0.LIZJ = null;
        }
        Iterator it2 = ((ArrayList) this.LLJI).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C0UBH c0ubh = ((C0UB0) next).LIZLLL;
                if (c0ubh != null) {
                    str = c0ubh.LIZIZ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, ((C0UBH) ListProtector.get(this.LLIZ, i)).LIZIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LLJIJIL = (C0UB0) next;
        Integer numValueOf = Integer.valueOf(i);
        this.LLJILJIL = numValueOf;
        C0UB0 c0ub03 = this.LLJIJIL;
        if (c0ub03 != null) {
            num2 = c0ub03.LIZJ;
        }
        if (!Intrinsics.LJFF(num2, numValueOf)) {
            C0UB0 c0ub04 = this.LLJIJIL;
            if (c0ub04 != null && !c0ub04.LJ) {
                c0ub04.LIZIZ();
                c0ub04.LJ = true;
            }
            C0UB0 c0ub05 = this.LLJIJIL;
            if (c0ub05 != null) {
                c0ub05.LIZJ = Integer.valueOf(i);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        C0UB0 c0ub1;
        C0UBH c0ubh = (C0UBH) ListProtector.get(this.LLIZ, i);
        if (Intrinsics.LJFF(c0ubh.LIZ, "favorite")) {
            c0ub1 = this.LLIZLLLIL;
            if (c0ub1 == null) {
                c0ub1 = new C0UBD(viewGroup, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
            }
        } else if (Intrinsics.LJFF(c0ubh.LIZIZ, "Recents")) {
            c0ub1 = this.LLJ;
            if (c0ub1 == null) {
                c0ub1 = new C0UBE(viewGroup, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
            }
        } else {
            c0ub1 = new C0UB1(viewGroup, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        }
        c0ub1.LIZJ(c0ubh, this.LLILLJJLI);
        viewGroup.addView(c0ub1.LJFF);
        if (!((ArrayList) this.LLJI).contains(c0ub1)) {
            ((ArrayList) this.LLJI).add(c0ub1);
        }
        Integer num = this.LLJILJIL;
        if (num != null && i == num.intValue()) {
            LJJIJIL(i);
        }
        return c0ub1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (obj instanceof C0UB0) {
            return Intrinsics.LJFF(((C0UB0) obj).LJFF, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof C0UB0) {
            C0UB0 c0ub0 = (C0UB0) obj;
            c0ub0.LIZ();
            C786410Ut5.LJJJLZIJ(c0ub0.LJFF, viewGroup);
        }
        if (obj instanceof C0UB1) {
            ((ArrayList) this.LLJI).remove(obj);
        } else if (obj instanceof C0UBD) {
            this.LLIZLLLIL = (C0UBD) obj;
        } else {
            if (!(obj instanceof C0UBE)) {
                return;
            }
            this.LLJ = (C0UBE) obj;
        }
    }

    public C768070UAz(String str, LifecycleCoroutineScope lifecycleCoroutineScope, StickerEffectViewModel stickerEffectViewModel, C766200U3u c766200U3u, C0UA2 c0ua2) {
        this.LLILLJJLI = str;
        this.LLILLL = lifecycleCoroutineScope;
        this.LLILZ = stickerEffectViewModel;
        this.LLILZIL = c766200U3u;
        this.LLILZLL = c0ua2;
    }
}
