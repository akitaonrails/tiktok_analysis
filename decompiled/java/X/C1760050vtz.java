package X;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vtz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760050vtz {
    public final C1757400vpi LIZ;
    public final FrameLayout LIZIZ;
    public final CopyOnWriteArrayList<AbstractC1760070vu1> LIZJ = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        Iterator<AbstractC1760070vu1> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(null, null);
        }
        this.LIZJ.clear();
    }

    public final C1760160vuA LIZLLL(C1760020vtw c1760020vtw) {
        int i;
        if (C1760000vtu.LIZ[c1760020vtw.LIZ.ordinal()] == 1) {
            C1757400vpi c1757400vpi = this.LIZ;
            FrameLayout frameLayout = this.LIZIZ;
            final C1760160vuA c1760160vuA = new C1760160vuA(c1757400vpi, this, frameLayout, c1760020vtw);
            this.LIZJ.addIfAbsent(c1760160vuA);
            C1741570vQB c1741570vQB = c1760020vtw.LJII;
            if (c1741570vQB != null) {
                C1741570vQB.LIZIZ(c1741570vQB, "load_start", null, null, 6);
            }
            if (!c1760160vuA.LJFF && !c1760160vuA.LJI && !c1760160vuA.LJII) {
                c1760160vuA.LJFF = true;
                View viewLJI = c1760160vuA.LJI(frameLayout.getContext(), new InterfaceC1760220vuG() { // from class: X.0vu7
                    @Override // X.InterfaceC1760220vuG
                    public final void LIZ() {
                        C1741570vQB c1741570vQB2 = c1760160vuA.LIZLLL.LJII;
                        if (c1741570vQB2 != null) {
                            C1741570vQB.LIZIZ(c1741570vQB2, "load_success", null, null, 6);
                        }
                    }

                    @Override // X.InterfaceC1760220vuG
                    public final void LIZIZ() {
                        AbstractC1760070vu1.LJFF(c1760160vuA, "show_success", true, null, 12);
                    }

                    @Override // X.InterfaceC1760220vuG
                    public final void LIZJ(String str, String str2, Map<String, Object> map) {
                        AbstractC1760070vu1 abstractC1760070vu1 = c1760160vuA;
                        abstractC1760070vu1.LJIIIIZZ = true;
                        C1741570vQB c1741570vQB2 = abstractC1760070vu1.LIZLLL.LJII;
                        if (c1741570vQB2 != null) {
                            c1741570vQB2.LIZ("load_fail", str2, map, false);
                        }
                        abstractC1760070vu1.LIZLLL.LJII = null;
                        C313201Ji.LIZ(new C1760120vu6(c1760160vuA, str, str2, null));
                    }
                });
                if (viewLJI != null) {
                    FrameLayout frameLayout2 = this.LIZIZ;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    int i2 = C1760000vtu.LIZIZ[c1760020vtw.LIZLLL.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJFF)));
                                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJ))));
                                i = 8388693;
                            } else {
                                layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJFF)));
                                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJ))));
                                i = 8388691;
                            }
                        } else {
                            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJFF)));
                            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJ))));
                            i = 8388661;
                        }
                    } else {
                        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJFF)));
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1760020vtw.LJ))));
                        i = 8388659;
                    }
                    layoutParams.gravity = i;
                    frameLayout2.addView(viewLJI, layoutParams);
                }
                return c1760160vuA;
            }
            AbstractC1760070vu1.LJFF(c1760160vuA, "load_fail", false, "repeat invoke", 8);
            return c1760160vuA;
        }
        throw new C1954807lC();
    }

    public C1760050vtz(C1757400vpi c1757400vpi, FrameLayout frameLayout) {
        this.LIZ = c1757400vpi;
        this.LIZIZ = frameLayout;
    }

    public final Pair LIZJ(String str, C1760100vu4 c1760100vu4) {
        AbstractC1760070vu1 next;
        Iterator<AbstractC1760070vu1> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1760070vu1 abstractC1760070vu1 = next;
        if (abstractC1760070vu1 == null) {
            return new Pair(Boolean.FALSE, "component id absent");
        }
        C1741570vQB c1741570vQBLIZIZ = c1760100vu4.LIZIZ(abstractC1760070vu1.LIZLLL, abstractC1760070vu1.LJ, new LinkedHashMap());
        if (abstractC1760070vu1.LJI) {
            if (c1741570vQBLIZIZ != null) {
                c1760100vu4.LIZ(c1741570vQBLIZIZ, false, "has hidden");
            }
        } else {
            abstractC1760070vu1.LIZJ();
            if (!abstractC1760070vu1.LJIIIIZZ) {
                AbstractC1760070vu1.LJFF(abstractC1760070vu1, "dismiss_unfinish", false, "action hide", 8);
            }
            if (c1741570vQBLIZIZ != null) {
                c1760100vu4.LIZ(c1741570vQBLIZIZ, true, null);
            }
        }
        return new Pair(Boolean.TRUE, "");
    }

    public final Pair LIZIZ(String str, String str2, C1760080vu2 c1760080vu2) {
        AbstractC1760070vu1 next;
        Iterator<AbstractC1760070vu1> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1760070vu1 abstractC1760070vu1 = next;
        if (abstractC1760070vu1 == null) {
            return new Pair(Boolean.FALSE, "component id absent");
        }
        abstractC1760070vu1.LIZIZ(str2, c1760080vu2);
        this.LIZJ.remove(abstractC1760070vu1);
        return new Pair(Boolean.TRUE, "");
    }
}
