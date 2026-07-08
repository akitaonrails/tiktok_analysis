package X;

import Y.ARunnableS120S0100000_20;
import Y.ATListenerS168S0000000_33;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21526919Ml extends ConstraintLayout implements InterfaceC1318440kPi {
    public static boolean LLLLIIL;
    public C19MQ LL;
    public Interpolator LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final HashMap<View, C21528019Mw> LLJI;
    public long LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public long LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC21527419Mq LLJJIJIIJIL;
    public int LLJJIJIL;
    public C1321630kUr LLJJJ;
    public boolean LLJJJIL;
    public final C21527319Mp LLJJJJ;
    public final C21527219Mo LLJJJJJIL;
    public C08H9 LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;
    public long LLJLL;
    public float LLJLLIL;
    public boolean LLJLLL;
    public ArrayList<C1084830eKv> LLJZ;
    public ArrayList<C1084830eKv> LLJZIJLIL;
    public ArrayList<InterfaceC21527419Mq> LLL;
    public int LLLF;
    public long LLLFF;
    public float LLLFFI;
    public int LLLFZ;
    public float LLLI;
    public boolean LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public float LLLILZ;
    public final C1781840wT8 LLLILZJ;
    public boolean LLLILZLLLI;
    public C21527119Mn LLLIZZ;
    public EnumC21526419Mg LLLJ;
    public final C21527019Mm LLLJIL;
    public boolean LLLJL;
    public final RectF LLLL;
    public View LLLLII;
    public final ArrayList<Integer> LLLLIIIILLL;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public int[] getConstraintSetIds() {
        C19MQ c19mq = this.LL;
        if (c19mq == null) {
            return null;
        }
        int size = c19mq.LJI.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = c19mq.LJI.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<C19MP> getDefinedTransitions() {
        C19MQ c19mq = this.LL;
        if (c19mq == null) {
            return null;
        }
        return c19mq.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.08H9] */
    public C08H9 getDesignTool() {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new Object() { // from class: X.08H9
                static {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
                    map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
                    map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
                    map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
                    map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
                    map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
                    map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
                    map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
                    map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
                    map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
                    map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
                    map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
                    map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
                    map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
                    map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
                    map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
                    map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
                    map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
                    map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
                    map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
                    map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
                    map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
                    map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
                    map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
                    map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
                }
            };
        }
        return this.LLJJJJLIIL;
    }

    public Bundle getTransitionState() {
        if (this.LLLIZZ == null) {
            this.LLLIZZ = new C21527119Mn(this);
        }
        C21527119Mn c21527119Mn = this.LLLIZZ;
        C21526919Ml c21526919Ml = c21527119Mn.LJ;
        c21527119Mn.LIZLLL = c21526919Ml.LLILZLL;
        c21527119Mn.LIZJ = c21526919Ml.LLILZ;
        c21527119Mn.LIZIZ = c21526919Ml.getVelocity();
        c21527119Mn.LIZ = c21527119Mn.LJ.getProgress();
        C21527119Mn c21527119Mn2 = this.LLLIZZ;
        c21527119Mn2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", c21527119Mn2.LIZ);
        bundle.putFloat("motion.velocity", c21527119Mn2.LIZIZ);
        bundle.putInt("motion.StartState", c21527119Mn2.LIZJ);
        bundle.putInt("motion.EndState", c21527119Mn2.LIZLLL);
        return bundle;
    }

    public long getTransitionTimeMs() {
        C19MQ c19mq = this.LL;
        if (c19mq != null) {
            this.LLJILJIL = (c19mq.LIZJ != null ? r0.LJII : c19mq.LJIIIZ) / 1000.0f;
        }
        return (long) (this.LLJILJIL * 1000.0f);
    }

    public final void i0() {
        ArrayList<InterfaceC21527419Mq> arrayList;
        if ((this.LLJJIJIIJIL == null && ((arrayList = this.LLL) == null || arrayList.isEmpty())) || this.LLLI == this.LLJILJILJ) {
            return;
        }
        if (this.LLLFZ != -1) {
            InterfaceC21527419Mq interfaceC21527419Mq = this.LLJJIJIIJIL;
            if (interfaceC21527419Mq != null) {
                interfaceC21527419Mq.LIZLLL();
            }
            ArrayList<InterfaceC21527419Mq> arrayList2 = this.LLL;
            if (arrayList2 != null) {
                Iterator<InterfaceC21527419Mq> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL();
                }
            }
        }
        this.LLLFZ = -1;
        this.LLLI = this.LLJILJILJ;
        InterfaceC21527419Mq interfaceC21527419Mq2 = this.LLJJIJIIJIL;
        if (interfaceC21527419Mq2 != null) {
            interfaceC21527419Mq2.LIZIZ();
        }
        ArrayList<InterfaceC21527419Mq> arrayList3 = this.LLL;
        if (arrayList3 != null) {
            Iterator<InterfaceC21527419Mq> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ();
            }
        }
    }

    public final void j0() {
        int iIntValue;
        ArrayList<InterfaceC21527419Mq> arrayList;
        if ((this.LLJJIJIIJIL != null || ((arrayList = this.LLL) != null && !arrayList.isEmpty())) && this.LLLFZ == -1) {
            this.LLLFZ = this.LLILZIL;
            if (this.LLLLIIIILLL.isEmpty()) {
                iIntValue = -1;
            } else {
                iIntValue = ((Integer) ListProtector.get(this.LLLLIIIILLL, r1.size() - 1)).intValue();
            }
            int i = this.LLILZIL;
            if (iIntValue != i && i != -1) {
                this.LLLLIIIILLL.add(Integer.valueOf(i));
            }
        }
        u0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C19MQ c19mq;
        C19MP c19mp;
        if (this.LLLII || this.LLILZIL != -1 || (c19mq = this.LL) == null || (c19mp = c19mq.LIZJ) == null || c19mp.LJIILLIIL != 0) {
            super.requestLayout();
        }
    }

    public final void s0() {
        C19MP c19mp;
        C19MT c19mt;
        View viewFindViewById;
        View viewFindViewById2;
        C19MQ c19mq = this.LL;
        if (c19mq == null) {
            return;
        }
        if (c19mq.LIZ(this, this.LLILZIL)) {
            requestLayout();
            return;
        }
        int i = this.LLILZIL;
        if (i != -1) {
            C19MQ c19mq2 = this.LL;
            for (C19MP c19mp2 : c19mq2.LIZLLL) {
                if (c19mp2.LJIIL.size() > 0) {
                    Iterator<C19MR> it2 = c19mp2.LJIIL.iterator();
                    while (it2.hasNext()) {
                        int i2 = it2.next().LLILLJJLI;
                        if (i2 != -1 && (viewFindViewById2 = findViewById(i2)) != null) {
                            C786410Ut5.I7(null, viewFindViewById2);
                        }
                    }
                }
            }
            for (C19MP c19mp3 : c19mq2.LJFF) {
                if (c19mp3.LJIIL.size() > 0) {
                    Iterator<C19MR> it3 = c19mp3.LJIIL.iterator();
                    while (it3.hasNext()) {
                        int i3 = it3.next().LLILLJJLI;
                        if (i3 != -1 && (viewFindViewById = findViewById(i3)) != null) {
                            C786410Ut5.I7(null, viewFindViewById);
                        }
                    }
                }
            }
            for (C19MP c19mp4 : c19mq2.LIZLLL) {
                if (c19mp4.LJIIL.size() > 0) {
                    Iterator<C19MR> it4 = c19mp4.LJIIL.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZ(this, i, c19mp4);
                    }
                }
            }
            for (C19MP c19mp5 : c19mq2.LJFF) {
                if (c19mp5.LJIIL.size() > 0) {
                    Iterator<C19MR> it5 = c19mp5.LJIIL.iterator();
                    while (it5.hasNext()) {
                        it5.next().LIZ(this, i, c19mp5);
                    }
                }
            }
        }
        if (!this.LL.LJIIL() || (c19mp = this.LL.LIZJ) == null || (c19mt = c19mp.LJIIJJI) == null) {
            return;
        }
        int i4 = c19mt.LIZLLL;
        View viewFindViewById3 = i4 != -1 ? c19mt.LJIILJJIL.findViewById(i4) : null;
        if (viewFindViewById3 instanceof C21578619ce) {
            C21578619ce c21578619ce = (C21578619ce) viewFindViewById3;
            c21578619ce.setOnTouchListener(new ATListenerS168S0000000_33(0));
            c21578619ce.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.19Mt
                @Override // X.InterfaceC1809520xBm
                public final void LIZ(C21578619ce c21578619ce2, int i5, int i6, int i7, int i8) {
                }
            });
        }
    }

    public final void u0() {
        ArrayList<InterfaceC21527419Mq> arrayList;
        if (this.LLJJIJIIJIL == null && ((arrayList = this.LLL) == null || arrayList.isEmpty())) {
            return;
        }
        for (Integer num : this.LLLLIIIILLL) {
            InterfaceC21527419Mq interfaceC21527419Mq = this.LLJJIJIIJIL;
            if (interfaceC21527419Mq != null) {
                interfaceC21527419Mq.LIZJ(num.intValue());
            }
            ArrayList<InterfaceC21527419Mq> arrayList2 = this.LLL;
            if (arrayList2 != null) {
                Iterator<InterfaceC21527419Mq> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(num.intValue());
                }
            }
        }
        this.LLLLIIIILLL.clear();
    }

    public final void z0() {
        this.LLLJIL.LJ();
        invalidate();
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C19MP c19mp;
        int i;
        super.onAttachedToWindow();
        C19MQ c19mq = this.LL;
        if (c19mq != null && (i = this.LLILZIL) != -1) {
            C19MB c19mbLIZIZ = c19mq.LIZIZ(i);
            this.LL.LJIIJ(this);
            if (c19mbLIZIZ != null) {
                c19mbLIZIZ.LIZIZ(this);
            }
            this.LLILZ = this.LLILZIL;
        }
        s0();
        C21527119Mn c21527119Mn = this.LLLIZZ;
        if (c21527119Mn != null) {
            c21527119Mn.LIZ();
            return;
        }
        C19MQ c19mq2 = this.LL;
        if (c19mq2 == null || (c19mp = c19mq2.LIZJ) == null || c19mp.LJIILIIL != 4) {
            return;
        }
        e0(1.0f);
        setState(EnumC21526419Mg.SETUP);
        setState(EnumC21526419Mg.MOVING);
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1286580jaK.LIZ(this.LLILZ, context));
        sbLIZ.append("->");
        sbLIZ.append(C1286580jaK.LIZ(this.LLILZLL, context));
        sbLIZ.append(" (pos:");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" Dpos/Dt:");
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getCurrentState() {
        return this.LLILZIL;
    }

    public int getEndState() {
        return this.LLILZLL;
    }

    public float getProgress() {
        return this.LLJILLL;
    }

    public int getStartState() {
        return this.LLILZ;
    }

    public float getTargetPosition() {
        return this.LLJJI;
    }

    public float getVelocity() {
        return this.LLILLL;
    }

    private void p0(AttributeSet attributeSet) {
        C19MQ c19mq;
        C19MQ c19mq2;
        int i;
        LLLLIIL = isInEditMode();
        int i2 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R$styleable.MotionLayout_layoutDescription) {
                    this.LL = new C19MQ(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R$styleable.MotionLayout_currentState) {
                    this.LLILZIL = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R$styleable.MotionLayout_motionProgress) {
                    this.LLJJI = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.LLJJIJI = true;
                } else if (index == R$styleable.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == R$styleable.MotionLayout_showPaths) {
                    if (this.LLJJIJIL == 0) {
                        if (typedArrayObtainStyledAttributes.getBoolean(index, false)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        this.LLJJIJIL = i;
                    }
                } else if (index == R$styleable.MotionLayout_motionDebug) {
                    this.LLJJIJIL = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.LL = null;
            }
        }
        if (this.LLJJIJIL != 0 && (c19mq2 = this.LL) != null) {
            int iLJI = c19mq2.LJI();
            C19MQ c19mq3 = this.LL;
            C19MB c19mbLIZIZ = c19mq3.LIZIZ(c19mq3.LJI());
            C1286580jaK.LIZ(iLJI, getContext());
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                int id = getChildAt(i4).getId();
                if (c19mbLIZIZ.LIZJ.containsKey(Integer.valueOf(id))) {
                    c19mbLIZIZ.LIZJ.get(Integer.valueOf(id));
                }
            }
            Integer[] numArr = (Integer[]) c19mbLIZIZ.LIZJ.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = numArr[i5].intValue();
            }
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = iArr[i6];
                C1286580jaK.LIZ(i7, getContext());
                findViewById(iArr[i6]);
                c19mbLIZIZ.LJIJI(i7);
                c19mbLIZIZ.LJIJI(i7);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (C19MP c19mp : this.LL.LIZLLL) {
                int i8 = c19mp.LIZLLL;
                int i9 = c19mp.LIZJ;
                C1286580jaK.LIZ(i8, getContext());
                C1286580jaK.LIZ(i9, getContext());
                sparseIntArray.get(i8);
                sparseIntArray2.get(i9);
                sparseIntArray.put(i8, i9);
                sparseIntArray2.put(i9, i8);
                this.LL.LIZIZ(i8);
                this.LL.LIZIZ(i9);
            }
        }
        if (this.LLILZIL == -1 && (c19mq = this.LL) != null) {
            this.LLILZIL = c19mq.LJI();
            this.LLILZ = this.LL.LJI();
            C19MP c19mp2 = this.LL.LIZJ;
            if (c19mp2 != null) {
                i2 = c19mp2.LIZJ;
            }
            this.LLILZLL = i2;
        }
    }

    public final void E0(int i) {
        int i2;
        float alpha;
        C19MN c19mn;
        if (!isAttachedToWindow()) {
            if (this.LLLIZZ == null) {
                this.LLLIZZ = new C21527119Mn(this);
            }
            this.LLLIZZ.LIZLLL = i;
            return;
        }
        C19MQ c19mq = this.LL;
        if (c19mq != null && (c19mn = c19mq.LIZIZ) != null) {
            int i3 = this.LLILZIL;
            float f = -1;
            C19MM c19mm = c19mn.LIZIZ.get(i);
            if (c19mm == null) {
                i3 = i;
            } else if (f != -1.0f) {
                Iterator<C19MG> it2 = c19mm.LIZIZ.iterator();
                C19MG c19mg = null;
                while (true) {
                    if (it2.hasNext()) {
                        C19MG next = it2.next();
                        if (next.LIZ(f, f)) {
                            if (i3 == next.LJ) {
                                break;
                            } else {
                                c19mg = next;
                            }
                        }
                    } else {
                        i3 = c19mg != null ? c19mg.LJ : c19mm.LIZJ;
                    }
                }
            } else if (c19mm.LIZJ != i3) {
                Iterator<C19MG> it3 = c19mm.LIZIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (i3 == it3.next().LJ) {
                            break;
                        }
                    } else {
                        i3 = c19mm.LIZJ;
                        break;
                    }
                }
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i4 = this.LLILZIL;
        if (i4 != i) {
            if (this.LLILZ == i) {
                e0(0.0f);
                return;
            }
            if (this.LLILZLL == i) {
                e0(1.0f);
                return;
            }
            this.LLILZLL = i;
            if (i4 != -1) {
                B0(i4, i);
                e0(1.0f);
                this.LLJILLL = 0.0f;
                e0(1.0f);
                return;
            }
            this.LLJJJIL = false;
            this.LLJJI = 1.0f;
            this.LLJILJILJ = 0.0f;
            this.LLJILLL = 0.0f;
            this.LLJJ = getNanoTime();
            this.LLJIJIL = getNanoTime();
            this.LLJJIII = false;
            this.LLILLJJLI = null;
            C19MQ c19mq2 = this.LL;
            C19MP c19mp = c19mq2.LIZJ;
            if (c19mp != null) {
                i2 = c19mp.LJII;
            } else {
                i2 = c19mq2.LJIIIZ;
            }
            this.LLJILJIL = i2 / 1000.0f;
            this.LLILZ = -1;
            c19mq2.LJIIJJI(-1, this.LLILZLL);
            this.LL.LJI();
            int childCount = getChildCount();
            this.LLJI.clear();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                this.LLJI.put(childAt, new C21528019Mw(childAt));
            }
            this.LLJJIJI = true;
            this.LLLJIL.LIZLLL(null, this.LL.LIZIZ(i));
            z0();
            this.LLLJIL.LIZ();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                C21528019Mw c21528019Mw = this.LLJI.get(childAt2);
                if (c21528019Mw != null) {
                    C21526519Mh c21526519Mh = c21528019Mw.LIZLLL;
                    c21526519Mh.LLILLL = 0.0f;
                    c21526519Mh.LLILZ = 0.0f;
                    float x = childAt2.getX();
                    float y = childAt2.getY();
                    float width = childAt2.getWidth();
                    float height = childAt2.getHeight();
                    c21526519Mh.LLILZIL = x;
                    c21526519Mh.LLILZLL = y;
                    c21526519Mh.LLIZ = width;
                    c21526519Mh.LLIZLLLIL = height;
                    C21526619Mi c21526619Mi = c21528019Mw.LJFF;
                    c21526619Mi.getClass();
                    childAt2.getX();
                    childAt2.getY();
                    childAt2.getWidth();
                    childAt2.getHeight();
                    c21526619Mi.LLILLL = childAt2.getVisibility();
                    if (childAt2.getVisibility() != 0) {
                        alpha = 0.0f;
                    } else {
                        alpha = childAt2.getAlpha();
                    }
                    c21526619Mi.LL = alpha;
                    c21526619Mi.LLILZ = childAt2.getElevation();
                    c21526619Mi.LLILZIL = childAt2.getRotation();
                    c21526619Mi.LLILZLL = childAt2.getRotationX();
                    c21526619Mi.LLIZ = childAt2.getRotationY();
                    c21526619Mi.LLIZLLLIL = childAt2.getScaleX();
                    c21526619Mi.LLJ = childAt2.getScaleY();
                    c21526619Mi.LLJI = childAt2.getPivotX();
                    c21526619Mi.LLJIJIL = childAt2.getPivotY();
                    c21526619Mi.LLJILJIL = childAt2.getTranslationX();
                    c21526619Mi.LLJILJILJ = childAt2.getTranslationY();
                    c21526619Mi.LLJILLL = childAt2.getTranslationZ();
                }
            }
            int width2 = getWidth();
            int height2 = getHeight();
            for (int i7 = 0; i7 < childCount; i7++) {
                C21528019Mw c21528019Mw2 = this.LLJI.get(getChildAt(i7));
                this.LL.LJ(c21528019Mw2);
                c21528019Mw2.LIZLLL(width2, height2, getNanoTime());
            }
            C19MP c19mp2 = this.LL.LIZJ;
            if (c19mp2 != null) {
                float f2 = c19mp2.LJIIIIZZ;
                if (f2 != 0.0f) {
                    float fMin = Float.MAX_VALUE;
                    float fMax = -3.4028235E38f;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C21526519Mh c21526519Mh2 = this.LLJI.get(getChildAt(i8)).LJ;
                        float f3 = c21526519Mh2.LLILZLL + c21526519Mh2.LLILZIL;
                        fMin = Math.min(fMin, f3);
                        fMax = Math.max(fMax, f3);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C21528019Mw c21528019Mw3 = this.LLJI.get(getChildAt(i9));
                        C21526519Mh c21526519Mh3 = c21528019Mw3.LJ;
                        float f4 = c21526519Mh3.LLILZIL;
                        float f5 = c21526519Mh3.LLILZLL;
                        c21528019Mw3.LJIIJJI = 1.0f / (1.0f - f2);
                        c21528019Mw3.LJIIJ = f2 - ((((f4 + f5) - fMin) * f2) / (fMax - fMin));
                    }
                }
            }
            this.LLJILJILJ = 0.0f;
            this.LLJILLL = 0.0f;
            this.LLJJIJI = true;
            invalidate();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        C19N0 c19n0;
        C19N0 c19n02;
        C19N1 c19n1;
        C19N1 c19n12;
        String strLIZIZ;
        char c = 0;
        h0(false);
        super.dispatchDraw(canvas);
        if (this.LL == null) {
            return;
        }
        if ((this.LLJJIJIL & 1) == 1 && !isInEditMode()) {
            this.LLLF++;
            long nanoTime = getNanoTime();
            long j = this.LLLFF;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.LLLFFI = ((int) ((this.LLLF / (r2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.LLLF = 0;
                    this.LLLFF = nanoTime;
                }
            } else {
                this.LLLFF = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLLFFI);
            sbLIZ.append(" fps ");
            sbLIZ.append(C1286580jaK.LIZIZ(this, this.LLILZ));
            sbLIZ.append(" -> ");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append(C1286580jaK.LIZIZ(this, this.LLILZLL));
            sbLIZ2.append(" (progress: ");
            sbLIZ2.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sbLIZ2.append(" ) state=");
            int i3 = this.LLILZIL;
            if (i3 == -1) {
                strLIZIZ = "undefined";
            } else {
                strLIZIZ = C1286580jaK.LIZIZ(this, i3);
            }
            sbLIZ2.append(strLIZIZ);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
            paint.setColor(-16777216);
            canvas.drawText(strLIZIZ3, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(strLIZIZ3, 10.0f, getHeight() - 30, paint);
        }
        if (this.LLJJIJIL > 1) {
            if (this.LLJJJ == null) {
                this.LLJJJ = new C1321630kUr(this);
            }
            C1321630kUr c1321630kUr = this.LLJJJ;
            HashMap<View, C21528019Mw> map = this.LLJI;
            C19MQ c19mq = this.LL;
            C19MP c19mp = c19mq.LIZJ;
            if (c19mp != null) {
                i = c19mp.LJII;
            } else {
                i = c19mq.LJIIIZ;
            }
            int i4 = this.LLJJIJIL;
            c1321630kUr.getClass();
            if (map != null && map.size() != 0) {
                canvas.save();
                if (!c1321630kUr.LJIILIIL.isInEditMode() && (i4 & 1) == 2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c1321630kUr.LJIILIIL.getContext().getResources().getResourceName(c1321630kUr.LJIILIIL.LLILZLL));
                    sbLIZ3.append(":");
                    sbLIZ3.append(c1321630kUr.LJIILIIL.getProgress());
                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ3);
                    canvas.drawText(strLIZIZ4, 10.0f, c1321630kUr.LJIILIIL.getHeight() - 30, c1321630kUr.LJII);
                    canvas.drawText(strLIZIZ4, 11.0f, c1321630kUr.LJIILIIL.getHeight() - 29, c1321630kUr.LJ);
                }
                for (C21528019Mw c21528019Mw : map.values()) {
                    int iMax = c21528019Mw.LIZLLL.LLILLJJLI;
                    Iterator<C21526519Mh> it2 = c21528019Mw.LJIJ.iterator();
                    while (it2.hasNext()) {
                        iMax = Math.max(iMax, it2.next().LLILLJJLI);
                    }
                    int iMax2 = Math.max(iMax, c21528019Mw.LJ.LLILLJJLI);
                    if (i4 > 0) {
                        if (iMax2 == 0) {
                            iMax2 = 1;
                        }
                    } else if (iMax2 == 0) {
                    }
                    float[] fArr = c1321630kUr.LIZJ;
                    int[] iArr = c1321630kUr.LIZIZ;
                    if (fArr != null) {
                        double[] dArrLJFF = c21528019Mw.LJII[c].LJFF();
                        if (iArr != null) {
                            Iterator<C21526519Mh> it3 = c21528019Mw.LJIJ.iterator();
                            int i5 = 0;
                            while (it3.hasNext()) {
                                iArr[i5] = it3.next().LLJILJIL;
                                i5++;
                            }
                        }
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < dArrLJFF.length) {
                            c21528019Mw.LJII[c].LIZJ(dArrLJFF[i6], c21528019Mw.LJIILIIL);
                            c21528019Mw.LIZLLL.LJI(c21528019Mw.LJIIL, c21528019Mw.LJIILIIL, fArr, i7);
                            i7 += 2;
                            i6++;
                            c = 0;
                        }
                        i2 = i7 / 2;
                    } else {
                        i2 = 0;
                    }
                    c1321630kUr.LJIIJ = i2;
                    if (iMax2 >= 1) {
                        int i8 = i / 16;
                        float[] fArr2 = c1321630kUr.LIZ;
                        if (fArr2 == null || fArr2.length != i8 * 2) {
                            c1321630kUr.LIZ = new float[i8 * 2];
                            c1321630kUr.LIZLLL = new Path();
                        }
                        float f = c1321630kUr.LJIIL;
                        canvas.translate(f, f);
                        c1321630kUr.LJ.setColor(1996488704);
                        c1321630kUr.LJIIIIZZ.setColor(1996488704);
                        c1321630kUr.LJFF.setColor(1996488704);
                        c1321630kUr.LJI.setColor(1996488704);
                        float[] fArr3 = c1321630kUr.LIZ;
                        float f2 = 1.0f / (i8 - 1);
                        HashMap<String, C19N0> map2 = c21528019Mw.LJIL;
                        if (map2 == null) {
                            c19n0 = null;
                        } else {
                            c19n0 = map2.get("translationX");
                        }
                        HashMap<String, C19N0> map3 = c21528019Mw.LJIL;
                        if (map3 == null) {
                            c19n02 = null;
                        } else {
                            c19n02 = map3.get("translationY");
                        }
                        HashMap<String, C19N1> map4 = c21528019Mw.LJJ;
                        if (map4 == null) {
                            c19n1 = null;
                        } else {
                            c19n1 = map4.get("translationX");
                        }
                        HashMap<String, C19N1> map5 = c21528019Mw.LJJ;
                        if (map5 == null) {
                            c19n12 = null;
                        } else {
                            c19n12 = map5.get("translationY");
                        }
                        int i9 = 0;
                        while (true) {
                            float f3 = Float.NaN;
                            float f4 = 0.0f;
                            if (i9 >= i8) {
                                break;
                            }
                            float f5 = i9 * f2;
                            float f6 = c21528019Mw.LJIIJJI;
                            if (f6 != 1.0f) {
                                float f7 = c21528019Mw.LJIIJ;
                                if (f5 < f7) {
                                    f5 = 0.0f;
                                }
                                if (f5 > f7 && f5 < 1.0d) {
                                    f5 = (f5 - f7) * f6;
                                }
                            }
                            double dLIZ = f5;
                            C19NB c19nb = c21528019Mw.LIZLLL.LL;
                            for (C21526519Mh c21526519Mh : c21528019Mw.LJIJ) {
                                C19NB c19nb2 = c21526519Mh.LL;
                                if (c19nb2 != null) {
                                    float f8 = c21526519Mh.LLILLL;
                                    if (f8 < f5) {
                                        f4 = f8;
                                        c19nb = c19nb2;
                                    } else if (Float.isNaN(f3)) {
                                        f3 = c21526519Mh.LLILLL;
                                    }
                                }
                            }
                            if (c19nb != null) {
                                if (Float.isNaN(f3)) {
                                    f3 = 1.0f;
                                }
                                dLIZ = (((float) c19nb.LIZ((f5 - f4) / r16)) * (f3 - f4)) + f4;
                            }
                            c21528019Mw.LJII[0].LIZJ(dLIZ, c21528019Mw.LJIILIIL);
                            C2267601DpG c2267601DpG = c21528019Mw.LJIIIIZZ;
                            if (c2267601DpG != null) {
                                double[] dArr = c21528019Mw.LJIILIIL;
                                if (dArr.length > 0) {
                                    c2267601DpG.LIZJ(dLIZ, dArr);
                                }
                            }
                            int i10 = i9 * 2;
                            c21528019Mw.LIZLLL.LJI(c21528019Mw.LJIIL, c21528019Mw.LJIILIIL, fArr3, i10);
                            if (c19n1 != null) {
                                fArr3[i10] = fArr3[i10] + c19n1.LIZ(f5);
                            } else if (c19n0 != null) {
                                fArr3[i10] = fArr3[i10] + c19n0.LIZ(f5);
                            }
                            if (c19n12 != null) {
                                int i11 = i10 + 1;
                                fArr3[i11] = fArr3[i11] + c19n12.LIZ(f5);
                            } else if (c19n02 != null) {
                                int i12 = i10 + 1;
                                fArr3[i12] = fArr3[i12] + c19n02.LIZ(f5);
                            }
                            i9++;
                        }
                        c1321630kUr.LIZ(canvas, iMax2, c1321630kUr.LJIIJ, c21528019Mw);
                        c1321630kUr.LJ.setColor(-21965);
                        c1321630kUr.LJFF.setColor(-2067046);
                        c1321630kUr.LJIIIIZZ.setColor(-2067046);
                        c1321630kUr.LJI.setColor(-13391360);
                        float f9 = -c1321630kUr.LJIIL;
                        canvas.translate(f9, f9);
                        c1321630kUr.LIZ(canvas, iMax2, c1321630kUr.LJIIJ, c21528019Mw);
                        if (iMax2 == 5) {
                            c1321630kUr.LIZLLL.reset();
                            for (int i13 = 0; i13 <= 50; i13++) {
                                float[] fArr4 = c1321630kUr.LJIIIZ;
                                c21528019Mw.LJII[0].LIZJ(c21528019Mw.LIZ(null, i13 / 50), c21528019Mw.LJIILIIL);
                                C21526519Mh c21526519Mh2 = c21528019Mw.LIZLLL;
                                int[] iArr2 = c21528019Mw.LJIIL;
                                double[] dArr2 = c21528019Mw.LJIILIIL;
                                float f10 = c21526519Mh2.LLILZIL;
                                float f11 = c21526519Mh2.LLILZLL;
                                float f12 = c21526519Mh2.LLIZ;
                                float f13 = c21526519Mh2.LLIZLLLIL;
                                for (int i14 = 0; i14 < iArr2.length; i14++) {
                                    float f14 = (float) dArr2[i14];
                                    int i15 = iArr2[i14];
                                    if (i15 != 1) {
                                        if (i15 != 2) {
                                            if (i15 != 3) {
                                                if (i15 == 4) {
                                                    f13 = f14;
                                                }
                                            } else {
                                                f12 = f14;
                                            }
                                        } else {
                                            f11 = f14;
                                        }
                                    } else {
                                        f10 = f14;
                                    }
                                }
                                float f15 = f12 + f10;
                                float f16 = f13 + f11;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f18 = f10 + 0.0f;
                                float f19 = f11 + 0.0f;
                                float f20 = f15 + 0.0f;
                                float f21 = f16 + 0.0f;
                                fArr4[0] = f18;
                                fArr4[1] = f19;
                                fArr4[2] = f20;
                                fArr4[3] = f19;
                                fArr4[4] = f20;
                                fArr4[5] = f21;
                                fArr4[6] = f18;
                                fArr4[7] = f21;
                                Path path = c1321630kUr.LIZLLL;
                                float[] fArr5 = c1321630kUr.LJIIIZ;
                                path.moveTo(fArr5[0], fArr5[1]);
                                Path path2 = c1321630kUr.LIZLLL;
                                float[] fArr6 = c1321630kUr.LJIIIZ;
                                path2.lineTo(fArr6[2], fArr6[3]);
                                Path path3 = c1321630kUr.LIZLLL;
                                float[] fArr7 = c1321630kUr.LJIIIZ;
                                path3.lineTo(fArr7[4], fArr7[5]);
                                Path path4 = c1321630kUr.LIZLLL;
                                float[] fArr8 = c1321630kUr.LJIIIZ;
                                path4.lineTo(fArr8[6], fArr8[7]);
                                c1321630kUr.LIZLLL.close();
                            }
                            c1321630kUr.LJ.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(c1321630kUr.LIZLLL, c1321630kUr.LJ);
                            canvas.translate(-2.0f, -2.0f);
                            c1321630kUr.LJ.setColor(-65536);
                            canvas.drawPath(c1321630kUr.LIZLLL, c1321630kUr.LJ);
                        }
                    }
                    c = 0;
                }
                canvas.restore();
            }
        }
    }

    public final void e0(float f) {
        int i;
        C19MQ c19mq = this.LL;
        if (c19mq == null) {
            return;
        }
        float f2 = this.LLJILLL;
        float f3 = this.LLJILJILJ;
        if (f2 != f3 && this.LLJJIII) {
            this.LLJILLL = f3;
        }
        float f4 = this.LLJILLL;
        if (f4 == f) {
            return;
        }
        this.LLJJJIL = false;
        this.LLJJI = f;
        C19MP c19mp = c19mq.LIZJ;
        if (c19mp != null) {
            i = c19mp.LJII;
        } else {
            i = c19mq.LJIIIZ;
        }
        this.LLJILJIL = i / 1000.0f;
        setProgress(f);
        this.LLILLJJLI = this.LL.LIZLLL();
        this.LLJJIII = false;
        this.LLJIJIL = getNanoTime();
        this.LLJJIJI = true;
        this.LLJILJILJ = f4;
        this.LLJILLL = f4;
        invalidate();
    }

    public final void h0(boolean z) {
        float f;
        boolean z2;
        boolean z3;
        int i;
        float interpolation;
        if (this.LLJJ == -1) {
            this.LLJJ = getNanoTime();
        }
        float f2 = this.LLJILLL;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.LLILZIL = -1;
        }
        boolean z4 = true;
        boolean z5 = false;
        if (this.LLJLLL || (this.LLJJIJI && (z || this.LLJJI != f2))) {
            float fSignum = Math.signum(this.LLJJI - f2);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.LLILLJJLI;
            if (!(interpolator instanceof AbstractInterpolatorC21527619Ms)) {
                f = (((nanoTime - this.LLJJ) * fSignum) * 1.0E-9f) / this.LLJILJIL;
                this.LLILLL = f;
            } else {
                f = 0.0f;
            }
            float f3 = this.LLJILLL + f;
            if (this.LLJJIII) {
                f3 = this.LLJJI;
            }
            if ((fSignum > 0.0f && f3 >= this.LLJJI) || (fSignum <= 0.0f && f3 <= this.LLJJI)) {
                f3 = this.LLJJI;
                this.LLJJIJI = false;
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJILLL = f3;
            this.LLJILJILJ = f3;
            this.LLJJ = nanoTime;
            if (interpolator != null && !z2) {
                if (this.LLJJJIL) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.LLJIJIL) * 1.0E-9f);
                    this.LLJILLL = interpolation;
                    this.LLJJ = nanoTime;
                    Interpolator interpolator2 = this.LLILLJJLI;
                    if (interpolator2 instanceof AbstractInterpolatorC21527619Ms) {
                        float fLIZ = ((AbstractInterpolatorC21527619Ms) interpolator2).LIZ();
                        this.LLILLL = fLIZ;
                        if (Math.abs(fLIZ) * this.LLJILJIL <= 1.0E-5f) {
                            this.LLJJIJI = false;
                        }
                        if (fLIZ > 0.0f && interpolation >= 1.0f) {
                            this.LLJILLL = 1.0f;
                            this.LLJJIJI = false;
                            interpolation = 1.0f;
                        }
                        if (fLIZ < 0.0f && interpolation <= 0.0f) {
                            this.LLJILLL = 0.0f;
                            this.LLJJIJI = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.LLILLJJLI;
                    if (interpolator3 instanceof AbstractInterpolatorC21527619Ms) {
                        this.LLILLL = ((AbstractInterpolatorC21527619Ms) interpolator3).LIZ();
                    } else {
                        this.LLILLL = ((interpolator3.getInterpolation(f3 + f) - interpolation) * fSignum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.LLILLL) > 1.0E-5f) {
                setState(EnumC21526419Mg.MOVING);
            }
            if ((fSignum > 0.0f && f3 >= this.LLJJI) || (fSignum <= 0.0f && f3 <= this.LLJJI)) {
                f3 = this.LLJJI;
                this.LLJJIJI = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.LLJJIJI = false;
                setState(EnumC21526419Mg.FINISHED);
            }
            int childCount = getChildCount();
            this.LLJLLL = false;
            long nanoTime2 = getNanoTime();
            this.LLLILZ = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C21528019Mw c21528019Mw = this.LLJI.get(childAt);
                if (c21528019Mw != null) {
                    this.LLJLLL = c21528019Mw.LIZIZ(f3, nanoTime2, childAt, this.LLLILZJ) | this.LLJLLL;
                }
            }
            if ((fSignum > 0.0f && f3 >= this.LLJJI) || (fSignum <= 0.0f && f3 <= this.LLJJI)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!this.LLJLLL && !this.LLJJIJI && z3) {
                setState(EnumC21526419Mg.FINISHED);
            }
            if (this.LLLII) {
                requestLayout();
            }
            this.LLJLLL = (!z3) | this.LLJLLL;
            if (f3 <= 0.0f && (i = this.LLILZ) != -1 && this.LLILZIL != i) {
                this.LLILZIL = i;
                this.LL.LIZIZ(i).LIZ(this);
                setState(EnumC21526419Mg.FINISHED);
                z5 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.LLILZIL;
                int i4 = this.LLILZLL;
                if (i3 != i4) {
                    this.LLILZIL = i4;
                    this.LL.LIZIZ(i4).LIZ(this);
                    setState(EnumC21526419Mg.FINISHED);
                    z5 = true;
                }
            }
            if (!this.LLJLLL && !this.LLJJIJI) {
                if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                    setState(EnumC21526419Mg.FINISHED);
                }
            } else {
                invalidate();
            }
            if ((!this.LLJLLL && this.LLJJIJI && fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                s0();
            }
        }
        float f4 = this.LLJILLL;
        if (f4 >= 1.0f) {
            int i5 = this.LLILZIL;
            int i6 = this.LLILZLL;
            if (i5 == i6) {
                z4 = z5;
            }
            this.LLILZIL = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.LLILZIL;
                int i8 = this.LLILZ;
                if (i7 == i8) {
                    z4 = z5;
                }
                this.LLILZIL = i8;
            }
            this.LLLJL |= z5;
            if (z5 && !this.LLLILZLLLI) {
                requestLayout();
            }
            this.LLJILJILJ = this.LLJILLL;
        }
        z5 = z4;
        this.LLLJL |= z5;
        if (z5) {
            requestLayout();
        }
        this.LLJILJILJ = this.LLJILLL;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        C19MT c19mt;
        if (i != 0) {
            try {
                this.LL = new C19MQ(getContext(), this, i);
                if (isAttachedToWindow()) {
                    this.LL.LJIIJ(this);
                    this.LLLJIL.LIZLLL(this.LL.LIZIZ(this.LLILZ), this.LL.LIZIZ(this.LLILZLL));
                    z0();
                    C19MQ c19mq = this.LL;
                    boolean zIsRtl = isRtl();
                    c19mq.LJIILL = zIsRtl;
                    C19MP c19mp = c19mq.LIZJ;
                    if (c19mp != null && (c19mt = c19mp.LJIIJJI) != null) {
                        c19mt.LIZIZ(zIsRtl);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        }
        this.LL = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C19MP c19mp;
        C19MT c19mt;
        int i;
        RectF rectFLIZ;
        C19MQ c19mq = this.LL;
        if (c19mq != null && this.LLJ && (c19mp = c19mq.LIZJ) != null && (!c19mp.LJIILJJIL) && (c19mt = c19mp.LJIIJJI) != null && ((motionEvent.getAction() != 0 || (rectFLIZ = c19mt.LIZ(this, new RectF())) == null || rectFLIZ.contains(motionEvent.getX(), motionEvent.getY())) && (i = c19mt.LJ) != -1)) {
            View view = this.LLLLII;
            if (view == null || view.getId() != i) {
                this.LLLLII = findViewById(i);
            }
            if (this.LLLLII != null) {
                this.LLLL.set(r0.getLeft(), this.LLLLII.getTop(), this.LLLLII.getRight(), this.LLLLII.getBottom());
                if (this.LLLL.contains(motionEvent.getX(), motionEvent.getY()) && !n0(0.0f, 0.0f, motionEvent, this.LLLLII)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        C19MT c19mt;
        C19MQ c19mq = this.LL;
        if (c19mq != null) {
            boolean zIsRtl = isRtl();
            c19mq.LJIILL = zIsRtl;
            C19MP c19mp = c19mq.LIZJ;
            if (c19mp != null && (c19mt = c19mp.LJIIJJI) != null) {
                c19mt.LIZIZ(zIsRtl);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21527519Mr c21527519Mr;
        C21527519Mr c21527519Mr2;
        C19MT c19mt;
        float xVelocity;
        float yVelocity;
        char c;
        char c2;
        float f;
        float f2;
        int i;
        float f3;
        char c3;
        char c4;
        char c5;
        char c6;
        float f4;
        float xVelocity2;
        float yVelocity2;
        float f5;
        View viewFindViewById;
        MotionEvent motionEvent2;
        C19MP c19mp;
        boolean z;
        int iLIZ;
        C19MT c19mt2;
        float f6;
        C19MQ c19mq = this.LL;
        if (c19mq != null && this.LLJ && c19mq.LJIIL()) {
            C19MQ c19mq2 = this.LL;
            if (c19mq2.LIZJ != null && !(!r0.LJIILJJIL)) {
                return super.onTouchEvent(motionEvent);
            }
            int currentState = getCurrentState();
            RectF rectF = new RectF();
            if (c19mq2.LJIILJJIL == null) {
                c19mq2.LIZ.getClass();
                C21527519Mr c21527519Mr3 = C21527519Mr.LIZIZ;
                c21527519Mr3.LIZ = VelocityTracker.obtain();
                c19mq2.LJIILJJIL = c21527519Mr3;
            }
            VelocityTracker velocityTracker = c19mq2.LJIILJJIL.LIZ;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (currentState != -1) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 2 && !c19mq2.LJIIL) {
                        float rawY = motionEvent.getRawY() - c19mq2.LJIIZILJ;
                        float rawX = motionEvent.getRawX() - c19mq2.LJIILLIIL;
                        if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = c19mq2.LJIIJJI) != null) {
                            if (currentState != -1) {
                                C19MN c19mn = c19mq2.LIZIZ;
                                if (c19mn == null || (iLIZ = c19mn.LIZ(currentState)) == -1) {
                                    iLIZ = currentState;
                                }
                                ArrayList<C19MP> arrayList = new ArrayList();
                                for (C19MP c19mp2 : c19mq2.LIZLLL) {
                                    if (c19mp2.LIZLLL == iLIZ || c19mp2.LIZJ == iLIZ) {
                                        arrayList.add(c19mp2);
                                    }
                                }
                                RectF rectF2 = new RectF();
                                float f7 = 0.0f;
                                c19mp = null;
                                for (C19MP c19mp3 : arrayList) {
                                    if (!c19mp3.LJIILJJIL && (c19mt2 = c19mp3.LJIIJJI) != null) {
                                        c19mt2.LIZIZ(c19mq2.LJIILL);
                                        RectF rectFLIZ = c19mp3.LJIIJJI.LIZ(c19mq2.LIZ, rectF2);
                                        if (rectFLIZ == null || rectFLIZ.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                            RectF rectFLIZ2 = c19mp3.LJIIJJI.LIZ(c19mq2.LIZ, rectF2);
                                            if (rectFLIZ2 == null || rectFLIZ2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                                C19MT c19mt3 = c19mp3.LJIIJJI;
                                                float f8 = (c19mt3.LJIIIIZZ * rawX) + (c19mt3.LJIIIZ * rawY);
                                                if (c19mp3.LIZJ == currentState) {
                                                    f6 = -1.0f;
                                                } else {
                                                    f6 = 1.1f;
                                                }
                                                float f9 = f6 * f8;
                                                if (f9 > f7) {
                                                    f7 = f9;
                                                    c19mp = c19mp3;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c19mp = c19mq2.LIZJ;
                            }
                            if (c19mp != null) {
                                setTransition(c19mp);
                                RectF rectFLIZ3 = c19mq2.LIZJ.LJIIJJI.LIZ(c19mq2.LIZ, rectF);
                                if (rectFLIZ3 != null && !rectFLIZ3.contains(c19mq2.LJIIJJI.getX(), c19mq2.LJIIJJI.getY())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c19mq2.LJIILIIL = z;
                                C19MT c19mt4 = c19mq2.LIZJ.LJIIJJI;
                                float f10 = c19mq2.LJIILLIIL;
                                float f11 = c19mq2.LJIIZILJ;
                                c19mt4.LJIIL = f10;
                                c19mt4.LJIILIIL = f11;
                                c19mt4.LJIIJ = false;
                            }
                        } else {
                            return true;
                        }
                    }
                } else {
                    c19mq2.LJIILLIIL = motionEvent.getRawX();
                    c19mq2.LJIIZILJ = motionEvent.getRawY();
                    c19mq2.LJIIJJI = motionEvent;
                    c19mq2.LJIIL = false;
                    C19MT c19mt5 = c19mq2.LIZJ.LJIIJJI;
                    if (c19mt5 != null) {
                        C21526919Ml c21526919Ml = c19mq2.LIZ;
                        int i2 = c19mt5.LJFF;
                        if (i2 != -1 && (viewFindViewById = c21526919Ml.findViewById(i2)) != null) {
                            rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
                            if (!rectF.contains(c19mq2.LJIIJJI.getX(), c19mq2.LJIIJJI.getY())) {
                                c19mq2.LJIIJJI = null;
                                c19mq2.LJIIL = true;
                                return true;
                            }
                        }
                        RectF rectFLIZ4 = c19mq2.LIZJ.LJIIJJI.LIZ(c19mq2.LIZ, rectF);
                        if (rectFLIZ4 != null && !rectFLIZ4.contains(c19mq2.LJIIJJI.getX(), c19mq2.LJIIJJI.getY())) {
                            c19mq2.LJIILIIL = true;
                        } else {
                            c19mq2.LJIILIIL = false;
                        }
                        C19MT c19mt6 = c19mq2.LIZJ.LJIIJJI;
                        float f12 = c19mq2.LJIILLIIL;
                        float f13 = c19mq2.LJIIZILJ;
                        c19mt6.LJIIL = f12;
                        c19mt6.LJIILIIL = f13;
                        return true;
                    }
                    return true;
                }
            }
            if (!c19mq2.LJIIL) {
                C19MP c19mp4 = c19mq2.LIZJ;
                if (c19mp4 != null && (c19mt = c19mp4.LJIIJJI) != null && !c19mq2.LJIILIIL) {
                    C21527519Mr c21527519Mr4 = c19mq2.LJIILJJIL;
                    VelocityTracker velocityTracker2 = c21527519Mr4.LIZ;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        if (action2 != 1) {
                            if (action2 == 2) {
                                float rawY2 = motionEvent.getRawY() - c19mt.LJIILIIL;
                                float rawX2 = motionEvent.getRawX() - c19mt.LJIIL;
                                if (Math.abs((c19mt.LJIIIIZZ * rawX2) + (c19mt.LJIIIZ * rawY2)) > c19mt.LJIJJ || c19mt.LJIIJ) {
                                    float progress = c19mt.LJIILJJIL.getProgress();
                                    if (!c19mt.LJIIJ) {
                                        c19mt.LJIIJ = true;
                                        c19mt.LJIILJJIL.setProgress(progress);
                                    }
                                    int i3 = c19mt.LIZLLL;
                                    if (i3 != -1) {
                                        c19mt.LJIILJJIL.l0(progress, c19mt.LJII, c19mt.LJI, i3, c19mt.LJIIJJI);
                                        c4 = 0;
                                        c3 = 1;
                                    } else {
                                        float fMin = Math.min(c19mt.LJIILJJIL.getWidth(), c19mt.LJIILJJIL.getHeight());
                                        float[] fArr = c19mt.LJIIJJI;
                                        c3 = 1;
                                        fArr[1] = c19mt.LJIIIZ * fMin;
                                        c4 = 0;
                                        fArr[0] = fMin * c19mt.LJIIIIZZ;
                                    }
                                    float f14 = c19mt.LJIIIIZZ;
                                    float[] fArr2 = c19mt.LJIIJJI;
                                    if (Math.abs(((f14 * fArr2[c4]) + (c19mt.LJIIIZ * fArr2[c3])) * c19mt.LJIJ) < 0.01d) {
                                        float[] fArr3 = c19mt.LJIIJJI;
                                        c5 = 0;
                                        fArr3[0] = 0.01f;
                                        c6 = 1;
                                        fArr3[1] = 0.01f;
                                    } else {
                                        c5 = 0;
                                        c6 = 1;
                                    }
                                    if (c19mt.LJIIIIZZ != 0.0f) {
                                        f4 = rawX2 / c19mt.LJIIJJI[c5];
                                    } else {
                                        f4 = rawY2 / c19mt.LJIIJJI[c6];
                                    }
                                    float fMax = Math.max(Math.min(progress + f4, 1.0f), 0.0f);
                                    if (fMax != c19mt.LJIILJJIL.getProgress()) {
                                        c19mt.LJIILJJIL.setProgress(fMax);
                                        VelocityTracker velocityTracker3 = c21527519Mr4.LIZ;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                                        }
                                        VelocityTracker velocityTracker4 = c21527519Mr4.LIZ;
                                        if (velocityTracker4 != null) {
                                            xVelocity2 = velocityTracker4.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        VelocityTracker velocityTracker5 = c21527519Mr4.LIZ;
                                        if (velocityTracker5 != null) {
                                            yVelocity2 = velocityTracker5.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (c19mt.LJIIIIZZ != 0.0f) {
                                            f5 = xVelocity2 / c19mt.LJIIJJI[c5];
                                        } else {
                                            f5 = yVelocity2 / c19mt.LJIIJJI[c6];
                                        }
                                        c19mt.LJIILJJIL.LLILLL = f5;
                                    } else {
                                        c19mt.LJIILJJIL.LLILLL = 0.0f;
                                    }
                                    c19mt.LJIIL = motionEvent.getRawX();
                                    c19mt.LJIILIIL = motionEvent.getRawY();
                                }
                            }
                        } else {
                            c19mt.LJIIJ = false;
                            VelocityTracker velocityTracker6 = c21527519Mr4.LIZ;
                            if (velocityTracker6 != null) {
                                velocityTracker6.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                            }
                            VelocityTracker velocityTracker7 = c21527519Mr4.LIZ;
                            if (velocityTracker7 != null) {
                                xVelocity = velocityTracker7.getXVelocity();
                            } else {
                                xVelocity = 0.0f;
                            }
                            VelocityTracker velocityTracker8 = c21527519Mr4.LIZ;
                            if (velocityTracker8 != null) {
                                yVelocity = velocityTracker8.getYVelocity();
                            } else {
                                yVelocity = 0.0f;
                            }
                            float progress2 = c19mt.LJIILJJIL.getProgress();
                            int i4 = c19mt.LIZLLL;
                            if (i4 != -1) {
                                c19mt.LJIILJJIL.l0(progress2, c19mt.LJII, c19mt.LJI, i4, c19mt.LJIIJJI);
                                c2 = 0;
                                c = 1;
                            } else {
                                float fMin2 = Math.min(c19mt.LJIILJJIL.getWidth(), c19mt.LJIILJJIL.getHeight());
                                float[] fArr4 = c19mt.LJIIJJI;
                                c = 1;
                                fArr4[1] = c19mt.LJIIIZ * fMin2;
                                c2 = 0;
                                fArr4[0] = fMin2 * c19mt.LJIIIIZZ;
                            }
                            float f15 = c19mt.LJIIIIZZ;
                            float[] fArr5 = c19mt.LJIIJJI;
                            float f16 = fArr5[c2];
                            float f18 = fArr5[c];
                            if (f15 != 0.0f) {
                                f = xVelocity / f16;
                            } else {
                                f = yVelocity / f18;
                            }
                            if (!Float.isNaN(f)) {
                                f2 = (f / 3.0f) + progress2;
                            } else {
                                f2 = progress2;
                            }
                            if (f2 != 0.0f && f2 != 1.0f && (i = c19mt.LIZJ) != 3) {
                                C21526919Ml c21526919Ml2 = c19mt.LJIILJJIL;
                                if (f2 < 0.5d) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = 1.0f;
                                }
                                c21526919Ml2.C0(f3, f, i);
                                if (0.0f >= progress2 || 1.0f <= progress2) {
                                    c19mt.LJIILJJIL.setState(EnumC21526419Mg.FINISHED);
                                }
                            } else if (0.0f >= f2 || 1.0f <= f2) {
                                c19mt.LJIILJJIL.setState(EnumC21526419Mg.FINISHED);
                            }
                        }
                    } else {
                        c19mt.LJIIL = motionEvent.getRawX();
                        c19mt.LJIILIIL = motionEvent.getRawY();
                        c19mt.LJIIJ = false;
                    }
                }
                c19mq2.LJIILLIIL = motionEvent.getRawX();
                c19mq2.LJIIZILJ = motionEvent.getRawY();
                if (motionEvent.getAction() == 1 && (c21527519Mr = c19mq2.LJIILJJIL) != null) {
                    VelocityTracker velocityTracker9 = c21527519Mr.LIZ;
                    if (velocityTracker9 != null) {
                        velocityTracker9.recycle();
                        c21527519Mr2 = null;
                        c21527519Mr.LIZ = null;
                    } else {
                        c21527519Mr2 = null;
                    }
                    c19mq2.LJIILJJIL = c21527519Mr2;
                    int i5 = this.LLILZIL;
                    if (i5 != -1) {
                        c19mq2.LIZ(this, i5);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C1084830eKv) {
            C1084830eKv c1084830eKv = (C1084830eKv) view;
            if (this.LLL == null) {
                this.LLL = new ArrayList<>();
            }
            this.LLL.add(c1084830eKv);
            if (c1084830eKv.LL) {
                if (this.LLJZ == null) {
                    this.LLJZ = new ArrayList<>();
                }
                this.LLJZ.add(c1084830eKv);
            }
            if (c1084830eKv.LLILLJJLI) {
                if (this.LLJZIJLIL == null) {
                    this.LLJZIJLIL = new ArrayList<>();
                }
                this.LLJZIJLIL.add(c1084830eKv);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C1084830eKv> arrayList = this.LLJZ;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C1084830eKv> arrayList2 = this.LLJZIJLIL;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    public void setDebugMode(int i) {
        this.LLJJIJIL = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.LLJ = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.LL != null) {
            setState(EnumC21526419Mg.MOVING);
            Interpolator interpolatorLIZLLL = this.LL.LIZLLL();
            if (interpolatorLIZLLL != null) {
                setProgress(interpolatorLIZLLL.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<C1084830eKv> arrayList = this.LLJZIJLIL;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1084830eKv) ListProtector.get(this.LLJZIJLIL, i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<C1084830eKv> arrayList = this.LLJZ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1084830eKv) ListProtector.get(this.LLJZ, i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (!isAttachedToWindow()) {
            if (this.LLLIZZ == null) {
                this.LLLIZZ = new C21527119Mn(this);
            }
            this.LLLIZZ.LIZ = f;
            return;
        }
        if (f <= 0.0f) {
            this.LLILZIL = this.LLILZ;
            if (this.LLJILLL == 0.0f) {
                setState(EnumC21526419Mg.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.LLILZIL = this.LLILZLL;
            if (this.LLJILLL == 1.0f) {
                setState(EnumC21526419Mg.FINISHED);
            }
        } else {
            this.LLILZIL = -1;
            setState(EnumC21526419Mg.MOVING);
        }
        if (this.LL == null) {
            return;
        }
        this.LLJJIII = true;
        this.LLJJI = f;
        this.LLJILJILJ = f;
        this.LLJJ = -1L;
        this.LLJIJIL = -1L;
        this.LLILLJJLI = null;
        this.LLJJIJI = true;
        invalidate();
    }

    public void setScene(C19MQ c19mq) {
        C19MT c19mt;
        this.LL = c19mq;
        boolean zIsRtl = isRtl();
        c19mq.LJIILL = zIsRtl;
        C19MP c19mp = c19mq.LIZJ;
        if (c19mp != null && (c19mt = c19mp.LJIIJJI) != null) {
            c19mt.LIZIZ(zIsRtl);
        }
        z0();
    }

    public void setState(EnumC21526419Mg enumC21526419Mg) {
        EnumC21526419Mg enumC21526419Mg2 = EnumC21526419Mg.FINISHED;
        if (enumC21526419Mg == enumC21526419Mg2 && this.LLILZIL == -1) {
            return;
        }
        EnumC21526419Mg enumC21526419Mg3 = this.LLLJ;
        this.LLLJ = enumC21526419Mg;
        EnumC21526419Mg enumC21526419Mg4 = EnumC21526419Mg.MOVING;
        if (enumC21526419Mg3 == enumC21526419Mg4 && enumC21526419Mg == enumC21526419Mg4) {
            i0();
        }
        int iOrdinal = enumC21526419Mg3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && enumC21526419Mg == enumC21526419Mg2) {
                j0();
                return;
            }
            return;
        }
        if (enumC21526419Mg == enumC21526419Mg4) {
            i0();
        }
        if (enumC21526419Mg != enumC21526419Mg2) {
            return;
        }
        j0();
    }

    public void setTransition(int i) {
        C19MP next;
        float f;
        float f2;
        C19MQ c19mq = this.LL;
        if (c19mq != null) {
            Iterator<C19MP> it2 = c19mq.LIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            this.LLILZ = next.LIZLLL;
            this.LLILZLL = next.LIZJ;
            if (!isAttachedToWindow()) {
                if (this.LLLIZZ == null) {
                    this.LLLIZZ = new C21527119Mn(this);
                }
                C21527119Mn c21527119Mn = this.LLLIZZ;
                c21527119Mn.LIZJ = this.LLILZ;
                c21527119Mn.LIZLLL = this.LLILZLL;
                return;
            }
            int i2 = this.LLILZIL;
            if (i2 == this.LLILZ) {
                f = 0.0f;
            } else if (i2 == this.LLILZLL) {
                f = 1.0f;
            } else {
                f = Float.NaN;
            }
            C19MQ c19mq2 = this.LL;
            c19mq2.LIZJ = next;
            C19MT c19mt = next.LJIIJJI;
            if (c19mt != null) {
                c19mt.LIZIZ(c19mq2.LJIILL);
            }
            this.LLLJIL.LIZLLL(this.LL.LIZIZ(this.LLILZ), this.LL.LIZIZ(this.LLILZLL));
            z0();
            if (Float.isNaN(f)) {
                f2 = 0.0f;
            } else {
                f2 = f;
            }
            this.LLJILLL = f2;
            if (Float.isNaN(f)) {
                e0(0.0f);
            } else {
                setProgress(f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        C19MQ c19mq = this.LL;
        if (c19mq == null) {
            return;
        }
        C19MP c19mp = c19mq.LIZJ;
        if (c19mp != null) {
            c19mp.LJII = i;
        } else {
            c19mq.LJIIIZ = i;
        }
    }

    public void setTransitionListener(InterfaceC21527419Mq interfaceC21527419Mq) {
        this.LLJJIJIIJIL = interfaceC21527419Mq;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.LLLIZZ == null) {
            this.LLLIZZ = new C21527119Mn(this);
        }
        C21527119Mn c21527119Mn = this.LLLIZZ;
        c21527119Mn.getClass();
        c21527119Mn.LIZ = bundle.getFloat("motion.progress");
        c21527119Mn.LIZIZ = bundle.getFloat("motion.velocity");
        c21527119Mn.LIZJ = bundle.getInt("motion.StartState");
        c21527119Mn.LIZLLL = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.LLLIZZ.LIZ();
        }
    }

    public void setTransition(C19MP c19mp) {
        int i;
        long nanoTime;
        C19MT c19mt;
        C19MQ c19mq = this.LL;
        c19mq.LIZJ = c19mp;
        if (c19mp != null && (c19mt = c19mp.LJIIJJI) != null) {
            c19mt.LIZIZ(c19mq.LJIILL);
        }
        setState(EnumC21526419Mg.SETUP);
        int i2 = this.LLILZIL;
        C19MP c19mp2 = this.LL.LIZJ;
        int i3 = -1;
        if (c19mp2 == null) {
            i = -1;
        } else {
            i = c19mp2.LIZJ;
        }
        if (i2 == i) {
            this.LLJILLL = 1.0f;
            this.LLJILJILJ = 1.0f;
            this.LLJJI = 1.0f;
        } else {
            this.LLJILLL = 0.0f;
            this.LLJILJILJ = 0.0f;
            this.LLJJI = 0.0f;
        }
        if ((c19mp.LJIIZILJ & 1) != 0) {
            nanoTime = -1;
        } else {
            nanoTime = getNanoTime();
        }
        this.LLJJ = nanoTime;
        int iLJI = this.LL.LJI();
        C19MQ c19mq2 = this.LL;
        C19MP c19mp3 = c19mq2.LIZJ;
        if (c19mp3 != null) {
            i3 = c19mp3.LIZJ;
        }
        if (iLJI == this.LLILZ && i3 == this.LLILZLL) {
            return;
        }
        this.LLILZ = iLJI;
        this.LLILZLL = i3;
        c19mq2.LJIIJJI(iLJI, i3);
        this.LLLJIL.LIZLLL(this.LL.LIZIZ(this.LLILZ), this.LL.LIZIZ(this.LLILZLL));
        C21527019Mm c21527019Mm = this.LLLJIL;
        int i4 = this.LLILZ;
        int i5 = this.LLILZLL;
        c21527019Mm.LJ = i4;
        c21527019Mm.LJFF = i5;
        c21527019Mm.LJ();
        z0();
    }

    public C21526919Ml(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = -1;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLJ = true;
        this.LLJI = new HashMap<>();
        this.LLJIJIL = 0L;
        this.LLJILJIL = 1.0f;
        this.LLJILJILJ = 0.0f;
        this.LLJILLL = 0.0f;
        this.LLJJI = 0.0f;
        this.LLJJIJI = false;
        this.LLJJIJIL = 0;
        this.LLJJJIL = false;
        this.LLJJJJ = new C21527319Mp();
        this.LLJJJJJIL = new C21527219Mo(this);
        this.LLJL = false;
        this.LLJLLL = false;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = 0;
        this.LLLFF = -1L;
        this.LLLFFI = 0.0f;
        this.LLLFZ = 0;
        this.LLLI = 0.0f;
        this.LLLII = false;
        this.LLLILZJ = new C1781840wT8();
        this.LLLILZLLLI = false;
        this.LLLJ = EnumC21526419Mg.UNDEFINED;
        this.LLLJIL = new C21527019Mm(this);
        this.LLLJL = false;
        this.LLLL = new RectF();
        this.LLLLII = null;
        this.LLLLIIIILLL = new ArrayList<>();
        p0(attributeSet);
    }

    public final void B0(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.LLLIZZ == null) {
                this.LLLIZZ = new C21527119Mn(this);
            }
            C21527119Mn c21527119Mn = this.LLLIZZ;
            c21527119Mn.LIZJ = i;
            c21527119Mn.LIZLLL = i2;
            return;
        }
        C19MQ c19mq = this.LL;
        if (c19mq != null) {
            this.LLILZ = i;
            this.LLILZLL = i2;
            c19mq.LJIIJJI(i, i2);
            this.LLLJIL.LIZLLL(this.LL.LIZIZ(i), this.LL.LIZIZ(i2));
            z0();
            this.LLJILLL = 0.0f;
            e0(0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21526919Ml.onMeasure(int, int):void");
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        C19MT c19mt;
        float f;
        boolean z;
        C19MQ c19mq = this.LL;
        if (c19mq == null) {
            return;
        }
        float f2 = this.LLJLIL;
        float f3 = this.LLJLLIL;
        float f4 = f2 / f3;
        float f5 = this.LLJLILLLLZIIL / f3;
        C19MP c19mp = c19mq.LIZJ;
        if (c19mp != null && (c19mt = c19mp.LJIIJJI) != null) {
            boolean z2 = false;
            c19mt.LJIIJ = false;
            float progress = c19mt.LJIILJJIL.getProgress();
            c19mt.LJIILJJIL.l0(progress, c19mt.LJII, c19mt.LJI, c19mt.LIZLLL, c19mt.LJIIJJI);
            float f6 = c19mt.LJIIIIZZ;
            float[] fArr = c19mt.LJIIJJI;
            float f7 = fArr[0];
            float f8 = c19mt.LJIIIZ;
            float f9 = fArr[1];
            float f10 = 0.0f;
            if (f6 != 0.0f) {
                f = (f4 * f6) / f7;
            } else {
                f = (f5 * f8) / f9;
            }
            if (!Float.isNaN(f)) {
                progress += f / 3.0f;
            }
            if (progress != 0.0f) {
                if (progress != 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = c19mt.LIZJ;
                if (i2 != 3) {
                    z2 = true;
                }
                if (z2 & z) {
                    C21526919Ml c21526919Ml = c19mt.LJIILJJIL;
                    if (progress >= 0.5d) {
                        f10 = 1.0f;
                    }
                    c21526919Ml.C0(f10, f, i2);
                }
            }
        }
    }

    public C21526919Ml(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = -1;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLJ = true;
        this.LLJI = new HashMap<>();
        this.LLJIJIL = 0L;
        this.LLJILJIL = 1.0f;
        this.LLJILJILJ = 0.0f;
        this.LLJILLL = 0.0f;
        this.LLJJI = 0.0f;
        this.LLJJIJI = false;
        this.LLJJIJIL = 0;
        this.LLJJJIL = false;
        this.LLJJJJ = new C21527319Mp();
        this.LLJJJJJIL = new C21527219Mo(this);
        this.LLJL = false;
        this.LLJLLL = false;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = 0;
        this.LLLFF = -1L;
        this.LLLFFI = 0.0f;
        this.LLLFZ = 0;
        this.LLLI = 0.0f;
        this.LLLII = false;
        this.LLLILZJ = new C1781840wT8();
        this.LLLILZLLLI = false;
        this.LLLJ = EnumC21526419Mg.UNDEFINED;
        this.LLLJIL = new C21527019Mm(this);
        this.LLLJL = false;
        this.LLLL = new RectF();
        this.LLLLII = null;
        this.LLLLIIIILLL = new ArrayList<>();
        p0(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(float r14, float r15, int r16) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21526919Ml.C0(float, float, int):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i, int i2, int i3) {
        setState(EnumC21526419Mg.SETUP);
        this.LLILZIL = i;
        this.LLILZ = -1;
        this.LLILZLL = -1;
        C19MO c19mo = this.mConstraintLayoutSpec;
        if (c19mo != null) {
            c19mo.LIZIZ(i2, i3, i);
            return;
        }
        C19MQ c19mq = this.LL;
        if (c19mq == null) {
            return;
        }
        c19mq.LIZIZ(i).LIZIZ(this);
    }

    public final boolean n0(float f, float f2, MotionEvent motionEvent, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (n0(view.getLeft() + f, view.getTop() + f2, motionEvent, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        this.LLLL.set(view.getLeft() + f, view.getTop() + f2, f + view.getRight(), f2 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.LLLL.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C19MP c19mp;
        C19MT c19mt;
        C19MQ c19mq = this.LL;
        if (c19mq != null && (c19mp = c19mq.LIZJ) != null && (c19mt = c19mp.LJIIJJI) != null && (c19mt.LJIJI & 2) == 0) {
            return true;
        }
        return false;
    }

    public final void l0(float f, float f2, float f3, int i, float[] fArr) {
        double[] dArr;
        HashMap<View, C21528019Mw> map = this.LLJI;
        View viewById = getViewById(i);
        C21528019Mw c21528019Mw = map.get(viewById);
        if (c21528019Mw != null) {
            float fLIZ = c21528019Mw.LIZ(c21528019Mw.LJIJI, f);
            C19N9[] c19n9Arr = c21528019Mw.LJII;
            int i2 = 0;
            if (c19n9Arr != null) {
                C19N9 c19n9 = c19n9Arr[0];
                double d = fLIZ;
                c19n9.LJ(d, c21528019Mw.LJIILJJIL);
                c21528019Mw.LJII[0].LIZJ(d, c21528019Mw.LJIILIIL);
                float f4 = c21528019Mw.LJIJI[0];
                while (true) {
                    dArr = c21528019Mw.LJIILJJIL;
                    if (i2 >= dArr.length) {
                        break;
                    }
                    dArr[i2] = dArr[i2] * ((double) f4);
                    i2++;
                }
                C2267601DpG c2267601DpG = c21528019Mw.LJIIIIZZ;
                if (c2267601DpG != null) {
                    double[] dArr2 = c21528019Mw.LJIILIIL;
                    if (dArr2.length > 0) {
                        c2267601DpG.LIZJ(d, dArr2);
                        c21528019Mw.LJIIIIZZ.LJ(d, c21528019Mw.LJIILJJIL);
                        C21526519Mh c21526519Mh = c21528019Mw.LIZLLL;
                        int[] iArr = c21528019Mw.LJIIL;
                        double[] dArr3 = c21528019Mw.LJIILJJIL;
                        double[] dArr4 = c21528019Mw.LJIILIIL;
                        c21526519Mh.getClass();
                        C21526519Mh.LJII(f2, f3, fArr, iArr, dArr3, dArr4);
                    }
                } else {
                    C21526519Mh c21526519Mh2 = c21528019Mw.LIZLLL;
                    int[] iArr2 = c21528019Mw.LJIIL;
                    double[] dArr5 = c21528019Mw.LJIILIIL;
                    c21526519Mh2.getClass();
                    C21526519Mh.LJII(f2, f3, fArr, iArr2, dArr, dArr5);
                }
            } else {
                C21526519Mh c21526519Mh3 = c21528019Mw.LJ;
                float f5 = c21526519Mh3.LLILZIL;
                C21526519Mh c21526519Mh4 = c21528019Mw.LIZLLL;
                float f6 = f5 - c21526519Mh4.LLILZIL;
                float f7 = c21526519Mh3.LLILZLL - c21526519Mh4.LLILZLL;
                float f8 = (c21526519Mh3.LLIZ - c21526519Mh4.LLIZ) + f6;
                float f9 = (c21526519Mh3.LLIZLLLIL - c21526519Mh4.LLIZLLLIL) + f7;
                fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
                fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
            }
            viewById.getY();
            return;
        }
        if (viewById == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        viewById.getContext().getResources().getResourceName(i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LLLILZLLLI = true;
        try {
            if (this.LL == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.LLLILZLLLI = false;
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.LLJJL != i5 || this.LLJJLIIIJLLLLLLLZ != i6) {
                z0();
                h0(true);
            }
            this.LLJJL = i5;
            this.LLJJLIIIJLLLLLLLZ = i6;
            this.LLLILZLLLI = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLLILZLLLI = false;
            throw th;
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C19MP c19mp;
        C19MT c19mt;
        float f;
        float f2;
        C19MP c19mp2;
        C19MT c19mt2;
        int i4;
        C19MQ c19mq = this.LL;
        if (c19mq == null || (c19mp = c19mq.LIZJ) == null || !(!c19mp.LJIILJJIL)) {
            return;
        }
        C19MT c19mt3 = c19mp.LJIIJJI;
        if (c19mt3 != null && (i4 = c19mt3.LJ) != -1 && view.getId() != i4) {
            return;
        }
        C19MQ c19mq2 = this.LL;
        if (c19mq2 != null && (c19mp2 = c19mq2.LIZJ) != null && (c19mt2 = c19mp2.LJIIJJI) != null && c19mt2.LJIIZILJ) {
            float f3 = this.LLJILJILJ;
            if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(-1)) {
                return;
            }
        }
        if (c19mp.LJIIJJI != null) {
            C19MT c19mt4 = this.LL.LIZJ.LJIIJJI;
            if ((c19mt4.LJIJI & 1) != 0) {
                float f4 = i;
                float f5 = i2;
                c19mt4.LJIILJJIL.l0(c19mt4.LJIILJJIL.getProgress(), c19mt4.LJII, c19mt4.LJI, c19mt4.LIZLLL, c19mt4.LJIIJJI);
                float f6 = c19mt4.LJIIIIZZ;
                if (f6 != 0.0f) {
                    float[] fArr = c19mt4.LJIIJJI;
                    if (fArr[0] == 0.0f) {
                        fArr[0] = 1.0E-7f;
                    }
                    f2 = (f4 * f6) / fArr[0];
                } else {
                    float[] fArr2 = c19mt4.LJIIJJI;
                    if (fArr2[1] == 0.0f) {
                        fArr2[1] = 1.0E-7f;
                    }
                    f2 = (f5 * c19mt4.LJIIIZ) / fArr2[1];
                }
                float f7 = this.LLJILLL;
                if ((f7 <= 0.0f && f2 < 0.0f) || (f7 >= 1.0f && f2 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new ARunnableS120S0100000_20(view, 2));
                    return;
                }
            }
        }
        float f8 = this.LLJILJILJ;
        long nanoTime = getNanoTime();
        float f9 = i;
        this.LLJLIL = f9;
        float f10 = i2;
        this.LLJLILLLLZIIL = f10;
        this.LLJLLIL = (float) ((nanoTime - this.LLJLL) * 1.0E-9d);
        this.LLJLL = nanoTime;
        C19MP c19mp3 = this.LL.LIZJ;
        if (c19mp3 != null && (c19mt = c19mp3.LJIIJJI) != null) {
            float progress = c19mt.LJIILJJIL.getProgress();
            if (!c19mt.LJIIJ) {
                c19mt.LJIIJ = true;
                c19mt.LJIILJJIL.setProgress(progress);
            }
            c19mt.LJIILJJIL.l0(progress, c19mt.LJII, c19mt.LJI, c19mt.LIZLLL, c19mt.LJIIJJI);
            float f11 = c19mt.LJIIIIZZ;
            float[] fArr3 = c19mt.LJIIJJI;
            if (Math.abs((f11 * fArr3[0]) + (c19mt.LJIIIZ * fArr3[1])) < 0.01d) {
                float[] fArr4 = c19mt.LJIIJJI;
                fArr4[0] = 0.01f;
                fArr4[1] = 0.01f;
            }
            float f12 = c19mt.LJIIIIZZ;
            if (f12 != 0.0f) {
                f = (f9 * f12) / c19mt.LJIIJJI[0];
            } else {
                f = (f10 * c19mt.LJIIIZ) / c19mt.LJIIJJI[1];
            }
            float fMax = Math.max(Math.min(progress + f, 1.0f), 0.0f);
            if (fMax != c19mt.LJIILJJIL.getProgress()) {
                c19mt.LJIILJJIL.setProgress(fMax);
            }
        }
        if (f8 != this.LLJILJILJ) {
            iArr[0] = i;
            iArr[1] = i2;
        }
        h0(false);
        if (iArr[0] != 0 || iArr[1] != 0) {
            this.LLJL = true;
        }
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.LLJL || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.LLJL = false;
    }
}
