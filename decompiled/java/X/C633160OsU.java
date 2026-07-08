package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0OsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633160OsU extends RecyclerView {
    public C1690080u58 LL;
    public InterfaceC497601wk LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public Object LLILZ;
    public float LLILZIL;
    public volatile boolean LLILZLL;

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    public final int getCurrentScrollOffset() {
        C1690080u58 c1690080u58 = this.LL;
        if (c1690080u58 == null) {
            return 0;
        }
        return c1690080u58.LJIIIIZZ();
    }

    public final int getFirstVisibleItemIndex() {
        C1690080u58 c1690080u58 = this.LL;
        if (c1690080u58 == null) {
            return 0;
        }
        return c1690080u58.LJII();
    }

    public final int getLastVisibleItemIndex() {
        C06XG c06xg;
        C1690080u58 c1690080u58 = this.LL;
        if (c1690080u58 == null || (c06xg = (C06XG) C13LP.LJJLIIIJL(c1690080u58.LJIIIZ().LJII())) == null) {
            return 0;
        }
        return c06xg.getIndex();
    }

    public final int getTotalItemCount() {
        C1690080u58 c1690080u58 = this.LL;
        if (c1690080u58 == null) {
            return 0;
        }
        return c1690080u58.LJIIIZ().LJFF();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void stopScroll() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL = null;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        int index;
        C1690080u58 c1690080u58 = this.LL;
        if (c1690080u58 == null) {
            return false;
        }
        InterfaceC1564820qp6 interfaceC1564820qp6LJIIIZ = c1690080u58.LJIIIZ();
        if (i < 0) {
            if (c1690080u58.LJII() <= 0 && c1690080u58.LJIIIIZZ() <= 0) {
                return false;
            }
        } else {
            if (i <= 0) {
                return false;
            }
            C06XG c06xg = (C06XG) C13LP.LJJLIIIJL(interfaceC1564820qp6LJIIIZ.LJII());
            if (c06xg != null) {
                index = c06xg.getIndex();
            } else {
                index = -1;
            }
            if (index >= interfaceC1564820qp6LJIIIZ.LJFF() - 1) {
                return false;
            }
        }
        return true;
    }

    public final void setDampScrollableLayout(Object obj) {
        this.LLILZ = obj;
    }

    public final void setTrackedVelocity(float f) {
        this.LLILZIL = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean fling(int r10, int r11) {
        /*
            r9 = this;
            X.01wk r5 = r9.LLILLJJLI
            r8 = 0
            if (r5 != 0) goto L6
            return r8
        L6:
            X.0u58 r6 = r9.LL
            if (r6 != 0) goto Lb
            return r8
        Lb:
            X.00cf r4 = new X.00cf
            r4.<init>()
            r4.element = r11
            r3 = 0
            r2 = 1
            if (r11 != 0) goto L79
            float r7 = r9.LLILZIL
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            java.lang.Object r7 = r9.LLILZ
            if (r7 == 0) goto L4a
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "mScroller"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L46
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L46
            java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Exception -> L46
            boolean r0 = r1 instanceof android.widget.Scroller     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L4a
            android.widget.Scroller r1 = (android.widget.Scroller) r1     // Catch: java.lang.Exception -> L46
            if (r1 == 0) goto L4a
            boolean r0 = r1.isFinished()     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto L4a
            float r0 = r1.getCurrVelocity()     // Catch: java.lang.Exception -> L46
            int r0 = (int) r0     // Catch: java.lang.Exception -> L46
            goto L4b
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            r0 = 0
        L4b:
            r4.element = r0
            if (r0 != 0) goto L68
            return r8
        L50:
            float r0 = -r7
            int r0 = (int) r0
            r4.element = r0
            r9.LLILZIL = r1
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fling: using tracked velocity: "
            r1.append(r0)
            int r0 = r4.element
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            goto L79
        L68:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fling: got velocity from parent Scroller: "
            r1.append(r0)
            int r0 = r4.element
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L79:
            X.0956 r0 = r9.LLILLL
            if (r0 == 0) goto L80
            r0.LIZIZ(r3)
        L80:
            r9.LLILZLL = r2
            X.05eB r1 = new X.05eB
            r1.<init>(r4, r9, r6, r3)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r5, r3, r3, r1, r0)
            r9.LLILLL = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C633160OsU.fling(int, int):boolean");
    }

    public C633160OsU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
