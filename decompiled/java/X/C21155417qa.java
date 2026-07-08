package X;

import Y.ARunnableS17S0301000_32;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallInitConfigSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21155417qa {
    public final FrameLayout LIZ;
    public final ConstraintLayout LIZIZ;
    public final CopyOnWriteArrayList<InterfaceC21155017qW> LIZJ;
    public final int LIZLLL;

    public final boolean LIZJ() {
        Iterator<InterfaceC21155017qW> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().isVisible()) {
                return true;
            }
        }
        return false;
    }

    public C21155417qa(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
        ConstraintLayout constraintLayout = new ConstraintLayout(frameLayout.getContext());
        C786410Ut5.m6(constraintLayout, new FrameLayout.LayoutParams(-1, -1));
        this.LIZIZ = constraintLayout;
        this.LIZJ = new CopyOnWriteArrayList<>();
        this.LIZLLL = EcMixMallInitConfigSettings.LIZIZ.exceptionBubbleMaxThreshold;
    }

    public final InterfaceC21155017qW LIZLLL(String str) {
        InterfaceC21155017qW next;
        Iterator<InterfaceC21155017qW> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getBubbleId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final List LJ(AwS611S0100000_32 awS611S0100000_32) {
        CopyOnWriteArrayList<InterfaceC21155017qW> copyOnWriteArrayList = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC21155017qW interfaceC21155017qW : copyOnWriteArrayList) {
            if (((Boolean) awS611S0100000_32.invoke(interfaceC21155017qW)).booleanValue()) {
                arrayList.add(interfaceC21155017qW);
            }
        }
        return arrayList;
    }

    public final void LJII(AbstractC21154817qU abstractC21154817qU, int i) {
        new AwS576S0100000_32(abstractC21154817qU, 704);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        int i2 = abstractC21154817qU.LLILLL.LJIIZILJ;
        if (i2 < 0) {
            this.LIZJ.add(abstractC21154817qU);
        } else {
            Iterator<InterfaceC21155017qW> it2 = this.LIZJ.iterator();
            int i3 = 0;
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC21155017qW next = it2.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        InterfaceC21155017qW interfaceC21155017qW = next;
                        if (i2 < interfaceC21155017qW.LJII().LJIIZILJ) {
                            c118300cf.element = this.LIZIZ.indexOfChild(interfaceC21155017qW.Y4());
                            this.LIZJ.add(i3, abstractC21154817qU);
                            break;
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    this.LIZJ.add(abstractC21154817qU);
                    break;
                }
            }
        }
        if (this.LIZIZ.getParent() == null) {
            this.LIZ.addView(this.LIZIZ);
            if (this.LIZ.getVisibility() != 0) {
                C786410Ut5.LJZ(0, this.LIZ);
            }
        }
        HandlerHook.viewPost(this.LIZ, new ARunnableS17S0301000_32(this, abstractC21154817qU, i, c118300cf, 1));
        if (this.LIZJ.size() > this.LIZLLL) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C21158017r0(this, abstractC21154817qU, null), 3);
        }
    }

    public final void LJFF(boolean z, int i, C21157117qr c21157117qr) {
        new C020T(z, 6);
        Iterator<InterfaceC21155017qW> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(z, i, c21157117qr);
        }
    }

    public static final void LJI(InterfaceC21155017qW interfaceC21155017qW, boolean z, int i, InterfaceC21154617qS interfaceC21154617qS) {
        new AwS148S0110000_32(interfaceC21155017qW, z, 6);
        interfaceC21155017qW.LJIIIZ(z, i, interfaceC21154617qS);
    }

    public final void LIZ(boolean z, int i, boolean z2, boolean z3, Pair<Integer, String> pair, InterfaceC21154617qS interfaceC21154617qS) {
        ViewGroup viewGroup;
        Iterator<InterfaceC21155017qW> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(z, this.LIZIZ, i, z2, pair, interfaceC21154617qS);
        }
        if (!z2) {
            this.LIZJ.clear();
        }
        if (!z3 && this.LIZJ.isEmpty()) {
            ViewParent parent = this.LIZIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LIZIZ, viewGroup);
            }
        }
    }

    public final void LIZIZ(boolean z, InterfaceC21155017qW interfaceC21155017qW, int i, boolean z2, boolean z3, Pair<Integer, String> pair, InterfaceC21154617qS interfaceC21154617qS) {
        ViewGroup viewGroup;
        new AwS148S0110000_32(interfaceC21155017qW, z2, 5);
        interfaceC21155017qW.LIZLLL(z, this.LIZIZ, i, z2, pair, interfaceC21154617qS);
        if (!z2) {
            this.LIZJ.remove(interfaceC21155017qW);
        }
        if (!z3 && this.LIZJ.isEmpty()) {
            ViewParent parent = this.LIZIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LIZIZ, viewGroup);
            }
        }
    }
}
