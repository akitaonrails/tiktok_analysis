package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2$SavedState;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import u4.q0;

/* JADX INFO: renamed from: X.15oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20632315oP extends ViewGroup {
    public final Rect LL;
    public final Rect LLILLJJLI;
    public final C712250Rwl LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final C20632515oR LLILZLL;
    public C20632415oQ LLIZ;
    public int LLIZLLLIL;
    public Parcelable LLJ;
    public RecyclerView LLJI;
    public C20631715oJ LLJIJIL;
    public C20632015oM LLJILJIL;
    public C712250Rwl LLJILJILJ;
    public C20631615oI LLJILLL;
    public C1836740xtg LLJJ;
    public AbstractC21673719rz LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public C20632815oU LLJJIJIL;

    public final void LIZJ() {
        if (this.LLJJ.LLILLJJLI == null) {
            return;
        }
        C20632015oM c20632015oM = this.LLJILJIL;
        c20632015oM.LJJJJ();
        C20631815oK c20631815oK = c20632015oM.LLIZ;
        double d = ((double) c20631815oK.LIZ) + ((double) c20631815oK.LIZIZ);
        int i = (int) d;
        float f = (float) (d - ((double) i));
        this.LLJJ.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        AbstractC21673619ry adapter;
        if (this.LLIZLLLIL == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.LLJ;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC20633215oY) {
                ((InterfaceC20633215oY) adapter).LJJZ(parcelable);
            }
            this.LLJ = null;
        }
        int iMax = Math.max(0, Math.min(this.LLIZLLLIL, adapter.getItemCount() - 1));
        this.LLILZ = iMax;
        this.LLIZLLLIL = -1;
        this.LLJI.scrollToPosition(iMax);
        this.LLJJIJIL.LIZIZ();
    }

    public final void LJII() {
        C20631715oJ c20631715oJ = this.LLJIJIL;
        if (c20631715oJ == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewLJFF = c20631715oJ.LJFF(this.LLIZ);
        if (viewLJFF == null) {
            return;
        }
        int position = getPosition(viewLJFF);
        if (position != this.LLILZ && getScrollState() == 0) {
            this.LLJILJILJ.onPageSelected(position);
        }
        this.LLILZIL = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.LLJJIJIL.getClass();
        this.LLJJIJIL.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC21673619ry getAdapter() {
        return this.LLJI.getAdapter();
    }

    public int getItemDecorationCount() {
        return this.LLJI.getItemDecorationCount();
    }

    public int getOrientation() {
        return getOrientation() != 1 ? 0 : 1;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.LLJI;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.LLJILJIL.LLILZLL;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager2$SavedState viewPager2$SavedState = new ViewPager2$SavedState(super.onSaveInstanceState());
        viewPager2$SavedState.LL = this.LLJI.getId();
        int i = this.LLIZLLLIL;
        if (i == -1) {
            i = this.LLILZ;
        }
        viewPager2$SavedState.LLILLJJLI = i;
        Parcelable parcelable = this.LLJ;
        if (parcelable != null) {
            viewPager2$SavedState.LLILLL = parcelable;
        } else {
            Object adapter = this.LLJI.getAdapter();
            if (adapter instanceof InterfaceC20633215oY) {
                viewPager2$SavedState.LLILLL = ((InterfaceC20633215oY) adapter).saveState();
                return viewPager2$SavedState;
            }
        }
        return viewPager2$SavedState;
    }

    public int getCurrentItem() {
        return this.LLILZ;
    }

    public int getOffscreenPageLimit() {
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15oR] */
    public C20632315oP(Context context) {
        super(context);
        this.LL = new Rect();
        this.LLILLJJLI = new Rect();
        this.LLILLL = new C712250Rwl();
        this.LLILZIL = false;
        this.LLILZLL = new AbstractC20632615oS() { // from class: X.15oR
            @Override // X.AbstractC20632615oS, X.AbstractC471570IeR
            public final void LIZ() {
                C20632315oP c20632315oP = this.LIZ;
                c20632315oP.LLILZIL = true;
                c20632315oP.LLJILJIL.LLJILJIL = true;
            }

            {
                super(0);
            }
        };
        this.LLIZLLLIL = -1;
        this.LLJJI = null;
        this.LLJJIII = false;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = -1;
        LIZ(context, null);
    }

    public final void LIZIZ(AbstractC712240Rwk abstractC712240Rwk) {
        ((ArrayList) this.LLILLL.LL).add(abstractC712240Rwk);
    }

    public final void LJI(AbstractC712240Rwk abstractC712240Rwk) {
        ((ArrayList) this.LLILLL.LL).remove(abstractC712240Rwk);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.LLJI.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.LLJI.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof ViewPager2$SavedState) {
            int i = ((ViewPager2$SavedState) parcelable).LL;
            sparseArray.put(this.LLJI.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        LIZLLL();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C20632815oU c20632815oU = this.LLJJIJIL;
        c20632815oU.getClass();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (c20632815oU.LIZLLL.getAdapter() != null) {
            if (c20632815oU.LIZLLL.getOrientation() == 1) {
                itemCount = c20632815oU.LIZLLL.getAdapter().getItemCount();
                itemCount2 = 1;
            } else {
                itemCount2 = c20632815oU.LIZLLL.getAdapter().getItemCount();
                itemCount = 1;
            }
        } else {
            itemCount = 0;
            itemCount2 = 0;
        }
        accessibilityNodeInfoCompatWrap.setCollectionInfo(C20093113jd.LIZIZ(itemCount, itemCount2, 0, false));
        AbstractC21673619ry adapter = c20632815oU.LIZLLL.getAdapter();
        if (adapter != null && (itemCount3 = adapter.getItemCount()) != 0) {
            C20632315oP c20632315oP = c20632815oU.LIZLLL;
            if (c20632315oP.LLJJIJI) {
                if (c20632315oP.LLILZ > 0) {
                    accessibilityNodeInfoCompatWrap.addAction(8192);
                }
                if (c20632815oU.LIZLLL.LLILZ < itemCount3 - 1) {
                    accessibilityNodeInfoCompatWrap.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                }
                accessibilityNodeInfoCompatWrap.setScrollable(true);
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager2$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager2$SavedState viewPager2$SavedState = (ViewPager2$SavedState) parcelable;
        super.onRestoreInstanceState(viewPager2$SavedState.getSuperState());
        this.LLIZLLLIL = viewPager2$SavedState.LLILLJJLI;
        this.LLJ = viewPager2$SavedState.LLILLL;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewPager2");
        sbLIZ.append(" does not support direct child views");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setAdapter(AbstractC21673619ry abstractC21673619ry) {
        AbstractC21673619ry adapter = this.LLJI.getAdapter();
        C20632815oU c20632815oU = this.LLJJIJIL;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(c20632815oU.LIZJ);
            adapter.unregisterAdapterDataObserver(this.LLILZLL);
        } else {
            c20632815oU.getClass();
        }
        this.LLJI.setAdapter(abstractC21673619ry);
        this.LLILZ = 0;
        LIZLLL();
        C20632815oU c20632815oU2 = this.LLJJIJIL;
        c20632815oU2.LIZIZ();
        if (abstractC21673619ry != null) {
            abstractC21673619ry.registerAdapterDataObserver(c20632815oU2.LIZJ);
            abstractC21673619ry.registerAdapterDataObserver(this.LLILZLL);
        }
    }

    public void setCurrentItem(int i) {
        LJ(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.LLJJIJIL.LIZIZ();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.LLJJIJIIJIL = i;
        this.LLJI.requestLayout();
    }

    public void setOrientation(int i) {
        setOrientation(i);
        this.LLJJIJIL.LIZIZ();
    }

    public void setPageTransformer(InterfaceC440740HQa interfaceC440740HQa) {
        if (interfaceC440740HQa != null) {
            if (!this.LLJJIII) {
                this.LLJJI = this.LLJI.getItemAnimator();
                this.LLJJIII = true;
            }
            this.LLJI.setItemAnimator(null);
        } else if (this.LLJJIII) {
            this.LLJI.setItemAnimator(this.LLJJI);
            this.LLJJI = null;
            this.LLJJIII = false;
        }
        C1836740xtg c1836740xtg = this.LLJJ;
        if (interfaceC440740HQa == c1836740xtg.LLILLJJLI) {
            return;
        }
        c1836740xtg.LLILLJJLI = interfaceC440740HQa;
        LIZJ();
    }

    public void setUserInputEnabled(boolean z) {
        this.LLJJIJI = z;
        this.LLJJIJIL.LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15oR] */
    public C20632315oP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new Rect();
        this.LLILLJJLI = new Rect();
        this.LLILLL = new C712250Rwl();
        this.LLILZIL = false;
        this.LLILZLL = new AbstractC20632615oS() { // from class: X.15oR
            @Override // X.AbstractC20632615oS, X.AbstractC471570IeR
            public final void LIZ() {
                C20632315oP c20632315oP = this.LIZ;
                c20632315oP.LLILZIL = true;
                c20632315oP.LLJILJIL.LLJILJIL = true;
            }

            {
                super(0);
            }
        };
        this.LLIZLLLIL = -1;
        this.LLJJI = null;
        this.LLJJIII = false;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = -1;
        LIZ(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.15oQ, androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.15oJ, X.15oh] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(final Context context, AttributeSet attributeSet) {
        this.LLJJIJIL = new C20632815oU(this);
        RecyclerView recyclerView = new RecyclerView(context) { // from class: X.15oX
            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public final CharSequence getAccessibilityClassName() {
                this.LL.LLJJIJIL.getClass();
                return super.getAccessibilityClassName();
            }

            @Override // android.view.View
            public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.setFromIndex(this.LL.LLILZ);
                accessibilityEvent.setToIndex(this.LL.LLILZ);
                accessibilityEvent.setSource(this.LL.LLJJIJIL.LIZLLL);
                accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (this.LL.LLJJIJI && super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (this.LL.LLJJIJI && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        };
        this.LLJI = recyclerView;
        recyclerView.setId(View.generateViewId());
        this.LLJI.setDescendantFocusability(131072);
        ?? r1 = new LinearLayoutManager(context) { // from class: X.15oQ
            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView2, View view, Rect rect, boolean z, boolean z2) {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(C21673919s1 c21673919s1, int[] iArr) {
                int offscreenPageLimit = this.LL.getOffscreenPageLimit();
                if (offscreenPageLimit == -1) {
                    super.calculateExtraLayoutSpace(c21673919s1, iArr);
                    return;
                }
                int pageSize = this.LL.getPageSize() * offscreenPageLimit;
                iArr[0] = pageSize;
                iArr[1] = pageSize;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onInitializeAccessibilityNodeInfo(C21673319rv c21673319rv, C21673919s1 c21673919s1, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(c21673319rv, c21673919s1, accessibilityNodeInfoCompat);
                this.LL.LLJJIJIL.getClass();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onInitializeAccessibilityNodeInfoForItem(C21673319rv c21673319rv, C21673919s1 c21673919s1, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                int position;
                int position2;
                C20632815oU c20632815oU = this.LL.LLJJIJIL;
                if (c20632815oU.LIZLLL.getOrientation() == 1) {
                    position = c20632815oU.LIZLLL.LLIZ.getPosition(view);
                } else {
                    position = 0;
                }
                if (c20632815oU.LIZLLL.getOrientation() == 0) {
                    position2 = c20632815oU.LIZLLL.LLIZ.getPosition(view);
                } else {
                    position2 = 0;
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZ(position, 1, position2, 1, false));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean performAccessibilityAction(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, Bundle bundle) {
                this.LL.LLJJIJIL.getClass();
                return super.performAccessibilityAction(c21673319rv, c21673919s1, i, bundle);
            }
        };
        this.LLIZ = r1;
        this.LLJI.setLayoutManager(r1);
        this.LLJI.setScrollingTouchSlop(1);
        int[] iArr = R$styleable.ViewPager2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        q0.LJIIZILJ(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            C786410Ut5.p6(this.LLJI, new ViewGroup.LayoutParams(-1, -1));
            this.LLJI.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0J2r
                @Override // X.InterfaceC21676519sR
                public final void m3(View view) {
                }

                @Override // X.InterfaceC21676519sR
                public final void g5(View view) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams.width == -1 && marginLayoutParams.height == -1) {
                    } else {
                        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                    }
                }
            });
            C20632015oM c20632015oM = new C20632015oM(this);
            this.LLJILJIL = c20632015oM;
            this.LLJILLL = new C20631615oI(this, c20632015oM, this.LLJI);
            ?? r12 = new C20635115or() { // from class: X.15oJ
                @Override // X.C20635115or, X.AbstractC20634115oh
                public final View LJFF(RecyclerView.LayoutManager layoutManager) {
                    if (this.LJFF.LLJILLL.LIZIZ.LLJILJILJ) {
                        return null;
                    }
                    return super.LJFF(layoutManager);
                }
            };
            this.LLJIJIL = r12;
            r12.LIZIZ(this.LLJI);
            this.LLJI.addOnScrollListener(this.LLJILJIL);
            C712250Rwl c712250Rwl = new C712250Rwl();
            this.LLJILJILJ = c712250Rwl;
            this.LLJILJIL.LL = c712250Rwl;
            C16H0 c16h0 = new C16H0(this, 0);
            C16H0 c16h02 = new C16H0(this, 1);
            ((ArrayList) this.LLJILJILJ.LL).add(c16h0);
            ((ArrayList) this.LLJILJILJ.LL).add(c16h02);
            this.LLJJIJIL.LIZ(this.LLJI);
            C712250Rwl c712250Rwl2 = this.LLJILJILJ;
            ((ArrayList) c712250Rwl2.LL).add(this.LLILLL);
            C1836740xtg c1836740xtg = new C1836740xtg(this.LLIZ);
            this.LLJJ = c1836740xtg;
            ((ArrayList) this.LLJILJILJ.LL).add(c1836740xtg);
            RecyclerView recyclerView2 = this.LLJI;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void LJ(int i, boolean z) {
        if (!this.LLJILLL.LIZIZ.LLJILJILJ) {
            LJFF(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void LJFF(int i, boolean z) {
        int i2;
        int i3;
        AbstractC21673619ry adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.LLIZLLLIL != -1) {
                this.LLIZLLLIL = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        final int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i4 = this.LLILZ;
        if (iMin == i4 && this.LLJILJIL.LLILZLL == 0) {
            return;
        }
        if (iMin == i4 && z) {
            return;
        }
        double d = i4;
        this.LLILZ = iMin;
        this.LLJJIJIL.LIZIZ();
        C20632015oM c20632015oM = this.LLJILJIL;
        if (c20632015oM.LLILZLL != 0) {
            c20632015oM.LJJJJ();
            C20631815oK c20631815oK = c20632015oM.LLIZ;
            d = ((double) c20631815oK.LIZ) + ((double) c20631815oK.LIZIZ);
        }
        C20632015oM c20632015oM2 = this.LLJILJIL;
        c20632015oM2.getClass();
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        c20632015oM2.LLILZIL = i2;
        c20632015oM2.LLJILJILJ = false;
        if (c20632015oM2.LLJ != iMin) {
            z2 = true;
        }
        c20632015oM2.LLJ = iMin;
        c20632015oM2.LJJIL(2);
        if (z2) {
            c20632015oM2.LJJIJIIJIL(iMin);
        }
        if (!z) {
            this.LLJI.scrollToPosition(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) > 3.0d) {
            RecyclerView recyclerView = this.LLJI;
            if (d2 > d) {
                i3 = iMin - 3;
            } else {
                i3 = iMin + 3;
            }
            recyclerView.scrollToPosition(i3);
            final RecyclerView recyclerView2 = this.LLJI;
            recyclerView2.post(new Runnable(recyclerView2, iMin) { // from class: X.0DJe
                public final int LL;
                public final RecyclerView LLILLJJLI;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.LLILLJJLI.smoothScrollToPosition(this.LL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }

                {
                    this.LL = iMin;
                    this.LLILLJJLI = recyclerView2;
                }
            });
            return;
        }
        this.LLJI.smoothScrollToPosition(iMin);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.LLJI, i, i2);
        int measuredWidth = this.LLJI.getMeasuredWidth();
        int measuredHeight = this.LLJI.getMeasuredHeight();
        int measuredState = this.LLJI.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int currentItem;
        this.LLJJIJIL.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        C20632815oU c20632815oU = this.LLJJIJIL;
        c20632815oU.getClass();
        if (i != 8192) {
            if (i == 4096) {
                currentItem = c20632815oU.LIZLLL.getCurrentItem() + 1;
            } else {
                throw new IllegalStateException();
            }
        } else {
            currentItem = c20632815oU.LIZLLL.getCurrentItem() - 1;
        }
        C20632315oP c20632315oP = c20632815oU.LIZLLL;
        if (c20632315oP.LLJJIJI) {
            c20632315oP.LJFF(currentItem, true);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15oR] */
    public C20632315oP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new Rect();
        this.LLILLJJLI = new Rect();
        this.LLILLL = new C712250Rwl();
        this.LLILZIL = false;
        this.LLILZLL = new AbstractC20632615oS() { // from class: X.15oR
            @Override // X.AbstractC20632615oS, X.AbstractC471570IeR
            public final void LIZ() {
                C20632315oP c20632315oP = this.LIZ;
                c20632315oP.LLILZIL = true;
                c20632315oP.LLJILJIL.LLJILJIL = true;
            }

            {
                super(0);
            }
        };
        this.LLIZLLLIL = -1;
        this.LLJJI = null;
        this.LLJJIII = false;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = -1;
        LIZ(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.LLJI.getMeasuredWidth();
        int measuredHeight = this.LLJI.getMeasuredHeight();
        this.LL.left = getPaddingLeft();
        this.LL.right = (i3 - i) - getPaddingRight();
        this.LL.top = getPaddingTop();
        this.LL.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.LL, this.LLILLJJLI);
        RecyclerView recyclerView = this.LLJI;
        Rect rect = this.LLILLJJLI;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.LLILZIL) {
            LJII();
        }
    }
}
