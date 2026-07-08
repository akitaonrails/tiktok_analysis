package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Pbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648230Pbh {
    public final View LIZ;
    public RecyclerView LIZIZ;
    public AnonymousClass0956 LIZLLL;
    public final List<InterfaceC648270Pbl> LIZJ = new CopyOnWriteArrayList();
    public boolean LJ = true;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1231));

    public final void LIZ() {
        RecyclerView recyclerView;
        if (this.LIZIZ == null) {
            Object parent = this.LIZ.getParent();
            while (true) {
                recyclerView = null;
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof RecyclerView) {
                    recyclerView = (RecyclerView) parent;
                    break;
                } else {
                    View view = (View) parent;
                    parent = view != null ? view.getParent() : null;
                }
            }
            this.LIZIZ = recyclerView;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener((AbstractC1585810rMx) this.LJFF.getValue());
            }
            RecyclerView recyclerView2 = this.LIZIZ;
            if (recyclerView2 != null) {
                recyclerView2.addOnScrollListener((AbstractC1585810rMx) this.LJFF.getValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[LOOP:1: B:16:0x0037->B:36:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC648270Pbl LIZJ() {
        /*
            r7 = this;
            java.util.List<X.0Pbl> r0 = r7.LIZJ
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r2 = r0.iterator()
            r6 = 0
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r1 = r2.next()
            X.0Pbt r1 = (X.InterfaceC648350Pbt) r1
            java.lang.Boolean r0 = r1.z3()
            if (r0 == 0) goto L24
            boolean r0 = r0.booleanValue()
        L1f:
            if (r0 != 0) goto L2a
            int r6 = r6 + 1
            goto L9
        L24:
            boolean r0 = r1.isPlaying()
            goto L1f
        L29:
            r6 = -1
        L2a:
            java.util.List<X.0Pbl> r0 = r7.LIZJ
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            int r5 = r0.size()
            r4 = 0
            if (r5 > 0) goto L36
            return r4
        L36:
            r3 = 1
        L37:
            java.util.List<X.0Pbl> r1 = r7.LIZJ
            int r0 = r6 + r3
            int r0 = r0 % r5
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r2 instanceof X.InterfaceC648350Pbt
            if (r0 == 0) goto L79
            X.0Pbt r2 = (X.InterfaceC648350Pbt) r2
            if (r2 == 0) goto L7a
            java.lang.Boolean r1 = r2.z3()
            if (r1 != 0) goto L56
            boolean r0 = r2.isPlaying()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L74
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L74
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L74
            boolean r0 = LIZLLL(r2)
            if (r0 != 0) goto L74
            boolean r0 = r2 instanceof X.InterfaceC648270Pbl
            if (r0 == 0) goto L73
            r4 = r2
            X.0Pbl r4 = (X.InterfaceC648270Pbl) r4
        L73:
            return r4
        L74:
            if (r3 == r5) goto L7c
            int r3 = r3 + 1
            goto L37
        L79:
            r2 = r4
        L7a:
            r1 = r4
            goto L56
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C648230Pbh.LIZJ():X.0Pbl");
    }

    public final void LJ() {
        C658550PsL c658550PsL;
        int i = 0;
        for (Object obj : (CopyOnWriteArrayList) this.LIZJ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            InterfaceC648270Pbl interfaceC648270Pbl = (InterfaceC648270Pbl) obj;
            if (interfaceC648270Pbl != null) {
                if (interfaceC648270Pbl instanceof C661440Px0) {
                    C661440Px0 c661440Px0 = (C661440Px0) interfaceC648270Pbl;
                    if (c661440Px0 != null) {
                        c661440Px0.LJJIII();
                    }
                } else if ((interfaceC648270Pbl instanceof C658550PsL) && (c658550PsL = (C658550PsL) interfaceC648270Pbl) != null) {
                    c658550PsL.LJIJJ();
                }
            }
            i = i2;
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZLLL = null;
    }

    public final void LJFF() {
        LIZ();
        LIZIZ(this.LIZ);
        InterfaceC648270Pbl interfaceC648270PblLIZJ = LIZJ();
        if (interfaceC648270PblLIZJ != null) {
            this.LJ = false;
            if (interfaceC648270PblLIZJ instanceof C661440Px0) {
                ((C661440Px0) interfaceC648270PblLIZJ).LJIJI();
            } else if (interfaceC648270PblLIZJ instanceof C658550PsL) {
                ((C658550PsL) interfaceC648270PblLIZJ).LLLLLIL();
            }
            if (this.LIZLLL == null) {
                this.LIZLLL = C948503nH.LJII(this.LIZ, new C648240Pbi(this, null));
            }
        }
    }

    public C648230Pbh(View view) {
        this.LIZ = view;
    }

    public static boolean LIZLLL(View view) {
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect) || rect.width() * rect.height() <= (view.getWidth() * view.getHeight()) / 2) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(View view) {
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.getFirst();
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        if (viewGroup.getChildAt(i) instanceof C658550PsL) {
                            View childAt = viewGroup.getChildAt(i);
                            if ((childAt instanceof C658550PsL) && childAt != null) {
                                ((CopyOnWriteArrayList) this.LIZJ).add(childAt);
                            }
                        }
                        if (viewGroup.getChildAt(i) instanceof C661440Px0) {
                            View childAt2 = viewGroup.getChildAt(i);
                            if ((childAt2 instanceof C661440Px0) && childAt2 != null) {
                                ((CopyOnWriteArrayList) this.LIZJ).add(childAt2);
                            }
                        }
                        arrayDeque.addLast(viewGroup.getChildAt(i));
                    }
                }
            }
            arrayDeque.pollFirst();
        }
    }
}
