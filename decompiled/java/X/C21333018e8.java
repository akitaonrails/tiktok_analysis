package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.yoga.m;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18e8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21333018e8 extends HorizontalScrollView {
    public static Field LLILZIL;
    public static boolean LLILZLL;
    public final C21331118dp LL;
    public m LLILLJJLI;
    public boolean LLILLL;
    public ArrayList<InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit>> LLILZ;

    public final OverScroller getOverScroller() {
        if (!LLILZLL) {
            LLILZLL = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                LLILZIL = declaredField;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Field field = LLILZIL;
        if (field != null) {
            try {
                Object obj = field.get(this);
                OverScroller overScroller = obj instanceof OverScroller ? (OverScroller) obj : null;
                if (overScroller != null) {
                    return overScroller;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return null;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public final C21331118dp getContentView() {
        return this.LL;
    }

    public final boolean getFixScrollClick$myna_render_release() {
        return this.LLILLL;
    }

    public final m getYogaNode$myna_render_release() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.18dp, android.view.View] */
    public C21333018e8(final Context context) {
        super(context, null, 0);
        ?? r0 = new ViewGroup(context) { // from class: X.18dp
            @Override // android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            }
        };
        this.LL = r0;
        addView(r0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1337990kvF.LIZIZ(this, canvas, new AwS433S0200000_32(this, canvas, 1));
    }

    @Override // android.view.View
    public final void forceHasOverlappingRendering(boolean z) {
        super.forceHasOverlappingRendering(z);
        if (Build.VERSION.SDK_INT >= 24) {
            forceHasOverlappingRendering(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
        setClipChildren(z);
    }

    public final void setFixScrollClick$myna_render_release(boolean z) {
        this.LLILLL = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (this.LLILLL) {
            if (onClickListener != null) {
                final Context context = getContext();
                setOnTouchListener(new View.OnTouchListener(context) { // from class: X.0kZ7
                    public int LL;
                    public boolean LLILLJJLI;
                    public final int LLILLL;

                    {
                        this.LLILLL = ViewConfiguration.get(context).getScaledTouchSlop();
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int action = motionEvent.getAction();
                        boolean z = true;
                        if (action != 0) {
                            if (action != 1) {
                                if (action == 2) {
                                    int x = (int) motionEvent.getX();
                                    if (!this.LLILLJJLI && Math.abs(x - this.LL) >= this.LLILLL - 1) {
                                        this.LLILLJJLI = true;
                                    }
                                }
                            } else {
                                int x2 = (int) motionEvent.getX();
                                if (!this.LLILLJJLI && Math.abs(x2 - this.LL) < this.LLILLL - 1) {
                                    view.performClick();
                                    return false;
                                }
                            }
                            return false;
                        }
                        this.LL = (int) motionEvent.getX();
                        this.LLILLJJLI = false;
                        OverScroller overScroller = this.LLILZ.getOverScroller();
                        if (overScroller == null || overScroller.isFinished()) {
                            z = false;
                        }
                        this.LLILLJJLI = z;
                        return false;
                    }
                });
            } else {
                setOnTouchListener(null);
            }
        }
    }

    public final void setYogaNode(AbstractC21333318eB<?> abstractC21333318eB) {
        this.LLILLJJLI = abstractC21333318eB.LLILZLL;
    }

    public final void setYogaNode$myna_render_release(m mVar) {
        this.LLILLJJLI = mVar;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (view != null && Intrinsics.LJFF(view, this.LL)) {
            super.addView(view, i);
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ArrayList<InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit>> arrayList = this.LLILZ;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((InterfaceC1631630sYr) ListProtector.get(arrayList, size)).invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m mVar;
        float layoutX;
        m mVar2 = this.LLILLJJLI;
        if (mVar2 == null) {
            return;
        }
        int childCount = mVar2.getChildCount() - 1;
        while (true) {
            mVar = null;
            C14QF display = null;
            if (-1 >= childCount) {
                break;
            }
            m childAt = mVar2.getChildAt(childCount);
            if (childAt != null) {
                display = childAt.getDisplay();
            }
            if (display != C14QF.NONE) {
                mVar = childAt;
                break;
            }
            childCount--;
        }
        float layoutBorder = mVar2.getLayoutBorder(EnumC1321440kUY.LEFT);
        float layoutBorder2 = mVar2.getLayoutBorder(EnumC1321440kUY.TOP);
        float layoutBorder3 = mVar2.getLayoutBorder(EnumC1321440kUY.BOTTOM);
        EnumC1321440kUY enumC1321440kUY = EnumC1321440kUY.RIGHT;
        float layoutPadding = mVar2.getLayoutPadding(enumC1321440kUY);
        if (mVar != null) {
            layoutX = mVar.getLayoutX() + mVar.getLayoutWidth() + mVar.getLayoutMargin(enumC1321440kUY);
        } else {
            layoutX = 0.0f;
        }
        int iRound = Math.round((layoutX + layoutPadding) - layoutBorder);
        int i5 = 0;
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round((mVar2.getLayoutHeight() - layoutBorder2) - layoutBorder3);
        if (iRound2 >= 0) {
            i5 = iRound2;
        }
        measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        int iRound3 = Math.round(layoutBorder);
        int iRound4 = Math.round(layoutBorder2);
        layout(iRound3, iRound4, iRound + iRound3, i5 + iRound4);
        scrollTo(getScrollX(), getScrollY());
    }
}
