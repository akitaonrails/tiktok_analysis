package X;

import Y.ARunnableS133S0100000_33;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19uK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21688219uK extends C0DXR implements InterfaceC21676519sR {
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public final AbstractC21688119uJ LLJILJILJ;
    public int LLJJ;
    public int LLJJIII;
    public RecyclerView LLJJIJI;
    public VelocityTracker LLJJIJIL;
    public List<RecyclerView.ViewHolder> LLJJJ;
    public List<Integer> LLJJJIL;
    public C19290410dS LLJJJJJIL;
    public C21688419uM LLJJJJLIIL;
    public Rect LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public final List<View> LL = new ArrayList();
    public final float[] LLILLJJLI = new float[2];
    public RecyclerView.ViewHolder LLILLL = null;
    public int LLJILJIL = -1;
    public int LLJILLL = 0;
    public final List<C21688519uN> LLJJI = new ArrayList();
    public final ARunnableS133S0100000_33 LLJJIJIIJIL = new ARunnableS133S0100000_33(this, 11);
    public View LLJJJJ = null;
    public final C21688319uL LLJJL = new InterfaceC21676019sM() { // from class: X.19uL
        @Override // X.InterfaceC21676019sM
        public final void LJIIZILJ(boolean z) {
            if (!z) {
                return;
            }
            this.LL.LJIILL(null, 0);
        }

        @Override // X.InterfaceC21676019sM
        public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.LL.LLJJJJJIL.LIZ(motionEvent);
            VelocityTracker velocityTracker = this.LL.LLJJIJIL;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (this.LL.LLJILJIL == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(this.LL.LLJILJIL);
            if (iFindPointerIndex >= 0) {
                this.LL.LJI(actionMasked, iFindPointerIndex, motionEvent);
            }
            C21688219uK c21688219uK = this.LL;
            RecyclerView.ViewHolder viewHolder = c21688219uK.LLILLL;
            if (viewHolder == null) {
                return;
            }
            int i = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            C21688219uK c21688219uK2 = this.LL;
                            if (pointerId == c21688219uK2.LLJILJIL) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                c21688219uK2.LLJILJIL = motionEvent.getPointerId(i);
                                C21688219uK c21688219uK3 = this.LL;
                                c21688219uK3.LJIJ(c21688219uK3.LLJJ, actionIndex, motionEvent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = c21688219uK.LLJJIJIL;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else {
                    if (iFindPointerIndex < 0) {
                        return;
                    }
                    c21688219uK.LJIJ(c21688219uK.LLJJ, iFindPointerIndex, motionEvent);
                    this.LL.LJIILIIL(viewHolder);
                    C21688219uK c21688219uK4 = this.LL;
                    c21688219uK4.LLJJIJI.removeCallbacks(c21688219uK4.LLJJIJIIJIL);
                    this.LL.LLJJIJIIJIL.run();
                    this.LL.LLJJIJI.invalidate();
                    return;
                }
            }
            this.LL.LJIILL(null, 0);
            this.LL.LLJILJIL = -1;
        }

        @Override // X.InterfaceC21676019sM
        public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            this.LL.LLJJJJJIL.LIZ(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.LL.LLJILJIL = motionEvent.getPointerId(0);
                this.LL.LLILZ = motionEvent.getX();
                this.LL.LLILZIL = motionEvent.getY();
                C21688219uK c21688219uK = this.LL;
                VelocityTracker velocityTracker = c21688219uK.LLJJIJIL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c21688219uK.LLJJIJIL = VelocityTracker.obtain();
                C21688219uK c21688219uK2 = this.LL;
                if (c21688219uK2.LLILLL == null && !((ArrayList) c21688219uK2.LLJJI).isEmpty()) {
                    View viewLJIIIZ = c21688219uK2.LJIIIZ(motionEvent);
                    int size = ((ArrayList) c21688219uK2.LLJJI).size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C21688519uN c21688519uN = (C21688519uN) ListProtector.get(c21688219uK2.LLJJI, size);
                        if (c21688519uN.LLILZIL.itemView == viewLJIIIZ) {
                            C21688219uK c21688219uK3 = this.LL;
                            c21688219uK3.LLILZ -= c21688519uN.LLJ;
                            c21688219uK3.LLILZIL -= c21688519uN.LLJI;
                            c21688219uK3.LJIIIIZZ(c21688519uN.LLILZIL, true);
                            if (((ArrayList) this.LL.LL).remove(c21688519uN.LLILZIL.itemView)) {
                                C21688219uK c21688219uK4 = this.LL;
                                c21688219uK4.LLJILJILJ.LIZJ(c21688219uK4.LLJJIJI, c21688519uN.LLILZIL);
                            }
                            this.LL.LJIILL(c21688519uN.LLILZIL, c21688519uN.LLILZLL);
                            C21688219uK c21688219uK5 = this.LL;
                            c21688219uK5.LJIJ(c21688219uK5.LLJJ, 0, motionEvent);
                        } else {
                            size--;
                        }
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = this.LL.LLJILJIL;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    this.LL.LJI(actionMasked, iFindPointerIndex, motionEvent);
                }
            } else {
                C21688219uK c21688219uK6 = this.LL;
                c21688219uK6.LLJILJIL = -1;
                c21688219uK6.LJIILL(null, 0);
            }
            VelocityTracker velocityTracker2 = this.LL.LLJJIJIL;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.LL.LLILLL != null) {
                return true;
            }
            return false;
        }
    };

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.19uL] */
    public C21688219uK(AbstractC21688119uJ abstractC21688119uJ) {
        this.LLJILJILJ = abstractC21688119uJ;
    }

    public final void LJ(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.LLJJIJI;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.LLJJIJI.removeOnItemTouchListener(this.LLJJL);
            this.LLJJIJI.removeOnChildAttachStateChangeListener(this);
            int size = ((ArrayList) this.LLJJI).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C21688519uN c21688519uN = (C21688519uN) ListProtector.get(this.LLJJI, 0);
                c21688519uN.LLIZ.cancel();
                this.LLJILJILJ.LIZJ(this.LLJJIJI, c21688519uN.LLILZIL);
            }
            ((ArrayList) this.LLJJI).clear();
            this.LLJJJJ = null;
            VelocityTracker velocityTracker = this.LLJJIJIL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LLJJIJIL = null;
            }
            C21688419uM c21688419uM = this.LLJJJJLIIL;
            if (c21688419uM != null) {
                c21688419uM.LL = false;
                this.LLJJJJLIIL = null;
            }
            if (this.LLJJJJJIL != null) {
                this.LLJJJJJIL = null;
            }
        }
        this.LLJJIJI = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.LLILZLL = resources.getDimension(R.dimen.a31);
            this.LLIZ = resources.getDimension(R.dimen.a30);
            this.LLJJIII = ViewConfiguration.get(this.LLJJIJI.getContext()).getScaledTouchSlop();
            this.LLJJIJI.addItemDecoration(this);
            this.LLJJIJI.addOnItemTouchListener(this.LLJJL);
            this.LLJJIJI.addOnChildAttachStateChangeListener(this);
            this.LLJJJJLIIL = new C21688419uM(this);
            this.LLJJJJJIL = new C19290410dS(this.LLJJIJI.getContext(), this.LLJJJJLIIL, null);
        }
    }

    public final int LJFF(int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            if (this.LLIZLLLIL > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.LLJJIJIL;
            if (velocityTracker != null && this.LLJILJIL > -1) {
                AbstractC21688119uJ abstractC21688119uJ = this.LLJILJILJ;
                float f = this.LLIZ;
                abstractC21688119uJ.getClass();
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, f);
                float xVelocity = this.LLJJIJIL.getXVelocity(this.LLJILJIL);
                float yVelocity = this.LLJJIJIL.getYVelocity(this.LLJILJIL);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float fAbs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3) {
                    AbstractC21688119uJ abstractC21688119uJ2 = this.LLJILJILJ;
                    float f2 = this.LLILZLL;
                    abstractC21688119uJ2.getClass();
                    if (fAbs >= f2 && fAbs > Math.abs(yVelocity)) {
                        return i3;
                    }
                }
            }
            float width = this.LLJJIJI.getWidth();
            this.LLJILJILJ.getClass();
            float f3 = width * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.LLIZLLLIL) > f3) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public final int LJII(int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            if (this.LLJ > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.LLJJIJIL;
            if (velocityTracker != null && this.LLJILJIL > -1) {
                AbstractC21688119uJ abstractC21688119uJ = this.LLJILJILJ;
                float f = this.LLIZ;
                abstractC21688119uJ.getClass();
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, f);
                float xVelocity = this.LLJJIJIL.getXVelocity(this.LLJILJIL);
                float yVelocity = this.LLJJIJIL.getYVelocity(this.LLJILJIL);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float fAbs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2) {
                    AbstractC21688119uJ abstractC21688119uJ2 = this.LLJILJILJ;
                    float f2 = this.LLILZLL;
                    abstractC21688119uJ2.getClass();
                    if (fAbs >= f2 && fAbs > Math.abs(xVelocity)) {
                        return i3;
                    }
                }
            }
            float height = this.LLJJIJI.getHeight();
            this.LLJILJILJ.getClass();
            float f3 = height * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.LLJ) > f3) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public final View LJIIIZ(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.LLILLL;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (LJIIL(x, y, this.LLJI + this.LLIZLLLIL, this.LLJIJIL + this.LLJ, view)) {
                return view;
            }
        }
        for (int size = ((ArrayList) this.LLJJI).size() - 1; size >= 0; size--) {
            C21688519uN c21688519uN = (C21688519uN) ListProtector.get(this.LLJJI, size);
            View view2 = c21688519uN.LLILZIL.itemView;
            if (LJIIL(x, y, c21688519uN.LLJ, c21688519uN.LLJI, view2)) {
                return view2;
            }
        }
        return this.LLJJIJI.findChildViewUnder(x, y);
    }

    public final void LJIIJJI(float[] fArr) {
        if ((this.LLJJ & 12) != 0) {
            fArr[0] = (this.LLJI + this.LLIZLLLIL) - this.LLILLL.itemView.getLeft();
        } else {
            fArr[0] = this.LLILLL.itemView.getTranslationX();
        }
        if ((this.LLJJ & 3) != 0) {
            fArr[1] = (this.LLJIJIL + this.LLJ) - this.LLILLL.itemView.getTop();
        } else {
            fArr[1] = this.LLILLL.itemView.getTranslationY();
        }
    }

    public final void LJIILIIL(RecyclerView.ViewHolder viewHolder) {
        if (this.LLJJIJI.isLayoutRequested() || this.LLJILLL != 2) {
            return;
        }
        float fLJ = this.LLJILJILJ.LJ();
        int i = (int) (this.LLJI + this.LLIZLLLIL);
        int i2 = (int) (this.LLJIJIL + this.LLJ);
        if (Math.abs(i2 - viewHolder.itemView.getTop()) < viewHolder.itemView.getHeight() * fLJ && Math.abs(i - viewHolder.itemView.getLeft()) < viewHolder.itemView.getWidth() * fLJ) {
            return;
        }
        List<RecyclerView.ViewHolder> list = this.LLJJJ;
        if (list == null) {
            this.LLJJJ = new ArrayList();
            this.LLJJJIL = new ArrayList();
        } else {
            ((ArrayList) list).clear();
            ((ArrayList) this.LLJJJIL).clear();
        }
        this.LLJILJILJ.getClass();
        int iRound = Math.round(this.LLJI + this.LLIZLLLIL);
        int iRound2 = Math.round(this.LLJIJIL + this.LLJ);
        int width = viewHolder.itemView.getWidth() + iRound;
        int height = viewHolder.itemView.getHeight() + iRound2;
        int i3 = (iRound + width) / 2;
        int i4 = (iRound2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.LLJJIJI.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = layoutManager.getChildAt(i5);
            if (childAt != viewHolder.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.LLJJIJI.getChildViewHolder(childAt);
                if (this.LLJILJILJ.LIZ(this.LLILLL, childViewHolder)) {
                    int iAbs = Math.abs(i3 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int iAbs2 = Math.abs(i4 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i6 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = ((ArrayList) this.LLJJJ).size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > ((Integer) ListProtector.get(this.LLJJJIL, i8)).intValue(); i8++) {
                        i7++;
                    }
                    ListProtector.add(this.LLJJJ, i7, childViewHolder);
                    ListProtector.add(this.LLJJJIL, i7, Integer.valueOf(i6));
                }
            }
        }
        ArrayList arrayList = (ArrayList) this.LLJJJ;
        if (arrayList.size() == 0) {
            return;
        }
        RecyclerView.ViewHolder viewHolderLIZIZ = this.LLJILJILJ.LIZIZ(viewHolder, arrayList, i, i2);
        if (viewHolderLIZIZ == null) {
            ((ArrayList) this.LLJJJ).clear();
            ((ArrayList) this.LLJJJIL).clear();
            return;
        }
        int absoluteAdapterPosition = viewHolderLIZIZ.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
        if (this.LLJILJILJ.LJIIL(this.LLJJIJI, viewHolder, viewHolderLIZIZ)) {
            this.LLJILJILJ.LJIILIIL(this.LLJJIJI, viewHolder, absoluteAdapterPosition2, viewHolderLIZIZ, absoluteAdapterPosition, i, i2);
        }
    }

    public final void LJIILJJIL(View view) {
        if (view == this.LLJJJJ) {
            this.LLJJJJ = null;
        }
    }

    public final void LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        int i;
        AbstractC21688119uJ abstractC21688119uJ = this.LLJILJILJ;
        RecyclerView recyclerView = this.LLJJIJI;
        int iLJFF = abstractC21688119uJ.LJFF(recyclerView, viewHolder);
        int layoutDirection = recyclerView.getLayoutDirection();
        int i2 = iLJFF & 3158064;
        if (i2 != 0) {
            int i3 = iLJFF & (~i2);
            if (layoutDirection == 0) {
                i = i2 >> 2;
            } else {
                int i4 = i2 >> 1;
                i3 |= (-3158065) & i4;
                i = (i4 & 3158064) >> 2;
            }
            iLJFF = i3 | i;
        }
        if ((iLJFF & 16711680) == 0 || viewHolder.itemView.getParent() != this.LLJJIJI) {
            return;
        }
        VelocityTracker velocityTracker = this.LLJJIJIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LLJJIJIL = VelocityTracker.obtain();
        this.LLJ = 0.0f;
        this.LLIZLLLIL = 0.0f;
        LJIILL(viewHolder, 2);
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        LJIILJJIL(view);
        RecyclerView.ViewHolder childViewHolder = this.LLJJIJI.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.LLILLL;
        if (viewHolder != null && childViewHolder == viewHolder) {
            LJIILL(null, 0);
            return;
        }
        LJIIIIZZ(childViewHolder, false);
        if (!((ArrayList) this.LL).remove(childViewHolder.itemView)) {
            return;
        }
        this.LLJILJILJ.LIZJ(this.LLJJIJI, childViewHolder);
    }

    public final void LJIIIIZZ(RecyclerView.ViewHolder viewHolder, boolean z) {
        C21688519uN c21688519uN;
        int size = ((ArrayList) this.LLJJI).size();
        do {
            size--;
            if (size >= 0) {
                c21688519uN = (C21688519uN) ListProtector.get(this.LLJJI, size);
            } else {
                return;
            }
        } while (c21688519uN.LLILZIL != viewHolder);
        c21688519uN.LLJIJIL |= z;
        if (!c21688519uN.LLJILJIL) {
            c21688519uN.LLIZ.cancel();
        }
        ListProtector.remove(this.LLJJI, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e A[PHI: r6 r12
      0x019e: PHI (r6v21 int) = (r6v16 int), (r6v24 int) binds: [B:89:0x01bf, B:77:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r12v6 int) = (r12v4 int), (r12v8 int) binds: [B:89:0x01bf, B:77:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c2 A[PHI: r6 r12
      0x01c2: PHI (r6v17 int) = (r6v16 int), (r6v24 int) binds: [B:89:0x01bf, B:77:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r12v5 int) = (r12v4 int), (r12v8 int) binds: [B:89:0x01bf, B:77:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(androidx.recyclerview.widget.RecyclerView.ViewHolder r31, int r32) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21688219uK.LJIILL(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        float f;
        float f2;
        if (this.LLILLL != null) {
            LJIIJJI(this.LLILLJJLI);
            float[] fArr = this.LLILLJJLI;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC21688119uJ abstractC21688119uJ = this.LLJILJILJ;
        RecyclerView.ViewHolder viewHolder = this.LLILLL;
        List<C21688519uN> list = this.LLJJI;
        int i = this.LLJILLL;
        abstractC21688119uJ.getClass();
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C21688519uN c21688519uN = (C21688519uN) ListProtector.get(arrayList, i2);
            float f3 = c21688519uN.LL;
            float f4 = c21688519uN.LLILLL;
            if (f3 == f4) {
                c21688519uN.LLJ = c21688519uN.LLILZIL.itemView.getTranslationX();
            } else {
                c21688519uN.LLJ = f3 + (c21688519uN.LLJILJILJ * (f4 - f3));
            }
            float f5 = c21688519uN.LLILLJJLI;
            float f6 = c21688519uN.LLILZ;
            if (f5 == f6) {
                c21688519uN.LLJI = c21688519uN.LLILZIL.itemView.getTranslationY();
            } else {
                c21688519uN.LLJI = f5 + (c21688519uN.LLJILJILJ * (f6 - f5));
            }
            int iSave = canvas.save();
            abstractC21688119uJ.LJIIJ(canvas, recyclerView, c21688519uN.LLILZIL, c21688519uN.LLJ, c21688519uN.LLJI, c21688519uN.LLILZLL, false);
            canvas.restoreToCount(iSave);
        }
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            abstractC21688119uJ.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z = false;
        if (this.LLILLL != null) {
            LJIIJJI(this.LLILLJJLI);
        }
        AbstractC21688119uJ abstractC21688119uJ = this.LLJILJILJ;
        RecyclerView.ViewHolder viewHolder = this.LLILLL;
        List<C21688519uN> list = this.LLJJI;
        abstractC21688119uJ.getClass();
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C21688519uN c21688519uN = (C21688519uN) ListProtector.get(arrayList, i);
            int iSave = canvas.save();
            abstractC21688119uJ.LJIIJJI(c21688519uN.LLILZIL, false);
            canvas.restoreToCount(iSave);
        }
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            abstractC21688119uJ.LJIIJJI(viewHolder, true);
            canvas.restoreToCount(iSave2);
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C21688519uN c21688519uN2 = (C21688519uN) ListProtector.get(arrayList, size);
            if (c21688519uN2.LLJILJIL) {
                if (!c21688519uN2.LLIZLLLIL) {
                    ListProtector.remove(arrayList, size);
                }
            } else {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void LJI(int i, int i2, MotionEvent motionEvent) {
        View viewLJIIIZ;
        RecyclerView.ViewHolder childViewHolder;
        int i3;
        if (this.LLILLL != null || i != 2 || this.LLJILLL == 2 || !this.LLJILJILJ.LJII() || this.LLJJIJI.getScrollState() == 1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.LLJJIJI.getLayoutManager();
        int i4 = this.LLJILJIL;
        if (i4 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i4);
            float x = motionEvent.getX(iFindPointerIndex) - this.LLILZ;
            float y = motionEvent.getY(iFindPointerIndex) - this.LLILZIL;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f = this.LLJJIII;
            if (fAbs < f && fAbs2 < f) {
                return;
            }
            if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
                return;
            }
            if ((fAbs2 > fAbs && layoutManager.canScrollVertically()) || (viewLJIIIZ = LJIIIZ(motionEvent)) == null || (childViewHolder = this.LLJJIJI.getChildViewHolder(viewLJIIIZ)) == null) {
                return;
            }
            AbstractC21688119uJ abstractC21688119uJ = this.LLJILJILJ;
            RecyclerView recyclerView = this.LLJJIJI;
            int iLJFF = abstractC21688119uJ.LJFF(recyclerView, childViewHolder);
            int layoutDirection = recyclerView.getLayoutDirection();
            int i5 = iLJFF & 3158064;
            if (i5 != 0) {
                int i6 = iLJFF & (~i5);
                if (layoutDirection == 0) {
                    i3 = i5 >> 2;
                } else {
                    int i7 = i5 >> 1;
                    i6 |= (-3158065) & i7;
                    i3 = (i7 & 3158064) >> 2;
                }
                iLJFF = i6 | i3;
            }
            int i8 = (iLJFF & 65280) >> 8;
            if (i8 == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.LLILZ;
            float f3 = y2 - this.LLILZIL;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.LLJJIII;
            if (fAbs3 < f4 && fAbs4 < f4) {
                return;
            }
            if (fAbs3 > fAbs4) {
                if (f2 < 0.0f && (i8 & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (i8 & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (i8 & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (i8 & 2) == 0) {
                    return;
                }
            }
            this.LLJ = 0.0f;
            this.LLIZLLLIL = 0.0f;
            this.LLJILJIL = motionEvent.getPointerId(0);
            LJIILL(childViewHolder, 1);
        }
    }

    public final void LJIJ(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.LLILZ;
        this.LLIZLLLIL = f;
        this.LLJ = y - this.LLILZIL;
        if ((i & 4) == 0) {
            this.LLIZLLLIL = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.LLIZLLLIL = Math.min(0.0f, this.LLIZLLLIL);
        }
        if ((i & 1) == 0) {
            this.LLJ = Math.max(0.0f, this.LLJ);
        }
        if ((i & 2) == 0) {
            this.LLJ = Math.min(0.0f, this.LLJ);
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.setEmpty();
    }

    public static boolean LJIIL(float f, float f2, float f3, float f4, View view) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }
}
