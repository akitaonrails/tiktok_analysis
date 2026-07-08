package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;

/* JADX INFO: renamed from: X.19VA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19VA implements C19V7 {
    public C19V6 LL;
    public C21548219Uq LLILLJJLI;
    public final /* synthetic */ C19V8 LLILLL;

    @Override // X.C19V7
    public final void LIZ(C19V6 c19v6, boolean z) {
    }

    @Override // X.C19V7
    public final Parcelable LIZIZ() {
        return null;
    }

    @Override // X.C19V7
    public final boolean LIZLLL(SubMenuC21548419Us subMenuC21548419Us) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C19V7
    public final void LJIIIZ(Parcelable parcelable) {
    }

    @Override // X.C19V7
    public final int getId() {
        return 0;
    }

    public C19VA(C19V8 c19v8) {
        this.LLILLL = c19v8;
    }

    @Override // X.C19V7
    public final boolean LIZJ(C21548219Uq c21548219Uq) {
        KeyEvent.Callback callback = this.LLILLL.LLJ;
        if (callback instanceof InterfaceC21550519Vn) {
            ((InterfaceC21550519Vn) callback).onActionViewCollapsed();
        }
        C19V8 c19v8 = this.LLILLL;
        C786410Ut5.LJJLIIIJJI(c19v8, c19v8.LLJ);
        C19V8 c19v82 = this.LLILLL;
        C786410Ut5.LJJLIIIJJI(c19v82, c19v82.LLIZLLLIL);
        C19V8 c19v83 = this.LLILLL;
        c19v83.LLJ = null;
        int size = c19v83.LLJLL.size();
        while (true) {
            size--;
            if (size >= 0) {
                c19v83.addView((View) ListProtector.get(c19v83.LLJLL, size));
            } else {
                c19v83.LLJLL.clear();
                this.LLILLJJLI = null;
                this.LLILLL.requestLayout();
                c21548219Uq.LJFF(false);
                this.LLILLL.LJIJ();
                return true;
            }
        }
    }

    @Override // X.C19V7
    public final boolean LJ(C21548219Uq c21548219Uq) {
        this.LLILLL.LIZJ();
        ViewParent parent = this.LLILLL.LLIZLLLIL.getParent();
        C19V8 c19v8 = this.LLILLL;
        if (parent != c19v8) {
            if (parent instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(c19v8.LLIZLLLIL, (ViewGroup) parent);
            }
            C19V8 c19v82 = this.LLILLL;
            c19v82.addView(c19v82.LLIZLLLIL);
        }
        this.LLILLL.LLJ = c21548219Uq.getActionView();
        this.LLILLJJLI = c21548219Uq;
        ViewParent parent2 = this.LLILLL.LLJ.getParent();
        C19V8 c19v83 = this.LLILLL;
        if (parent2 != c19v83) {
            if (parent2 instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(c19v83.LLJ, (ViewGroup) parent2);
            }
            this.LLILLL.getClass();
            C19MJ c19mj = new C19MJ();
            C19V8 c19v84 = this.LLILLL;
            c19mj.LIZ = (c19v84.LLJILLL & 112) | 8388611;
            c19mj.LIZIZ = 2;
            C786410Ut5.W5(c19v84.LLJ, c19mj);
            C19V8 c19v85 = this.LLILLL;
            c19v85.addView(c19v85.LLJ);
        }
        C19V8 c19v86 = this.LLILLL;
        int childCount = c19v86.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = c19v86.getChildAt(childCount);
            if (((C19MJ) childAt.getLayoutParams()).LIZIZ != 2 && childAt != c19v86.LL) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19v86, null);
                c19v86.removeViewAt(childCount);
                c19v86.LLJLL.add(childAt);
            }
        }
        this.LLILLL.requestLayout();
        c21548219Uq.LJFF(true);
        KeyEvent.Callback callback = this.LLILLL.LLJ;
        if (callback instanceof InterfaceC21550519Vn) {
            ((InterfaceC21550519Vn) callback).onActionViewExpanded();
        }
        this.LLILLL.LJIJ();
        return true;
    }

    @Override // X.C19V7
    public final void LJII(boolean z) {
        if (this.LLILLJJLI != null) {
            C19V6 c19v6 = this.LL;
            if (c19v6 != null) {
                int size = c19v6.size();
                for (int i = 0; i < size; i++) {
                    if (this.LL.getItem(i) == this.LLILLJJLI) {
                        return;
                    }
                }
            }
            LIZJ(this.LLILLJJLI);
        }
    }

    @Override // X.C19V7
    public final void LJIIIIZZ(Context context, C19V6 c19v6) {
        C21548219Uq c21548219Uq;
        C19V6 c19v62 = this.LL;
        if (c19v62 != null && (c21548219Uq = this.LLILLJJLI) != null) {
            c19v62.LIZLLL(c21548219Uq);
        }
        this.LL = c19v6;
    }
}
