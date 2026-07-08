package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0itu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1260280itu extends LinearLayout {
    public final Context LL;
    public final Scroller LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public VelocityTracker LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public View LLJJI;
    public ViewPager LLJJIII;
    public EnumC1260320ity LLJJIJI;
    public int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public final List<InterfaceC1260330itz> LLLFF;
    public InterfaceC1260330itz LLLFFI;
    public final C1260300itw LLLFZ;
    public boolean LLLI;

    public final boolean LIZJ() {
        if (this.LLLFZ.LIZ() == null) {
            return this.LLLF;
        }
        View viewLIZ = this.LLLFZ.LIZ();
        if (((Boolean) C262180APg.LIZ.getValue()).booleanValue() && (viewLIZ instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) viewLIZ;
            if (!recyclerView.canScrollVertically(-1)) {
                return true;
            }
            if (recyclerView.computeVerticalScrollOffset() <= recyclerView.getHeight() / 2) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition >= 0; iFindFirstVisibleItemPosition--) {
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                        if (viewFindViewByPosition != null) {
                            if (viewFindViewByPosition.getTop() < recyclerView.getPaddingTop()) {
                                break;
                            }
                            if (viewFindViewByPosition.getHeight() <= 0 && viewFindViewByPosition.getHeight() == 0 && iFindFirstVisibleItemPosition == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return this.LLLFZ.LIZIZ();
    }

    public boolean LIZLLL() {
        return this.LLJLIL >= this.LLJJJJLIIL;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLILLJJLI.computeScrollOffset()) {
            int currY = this.LLILLJJLI.getCurrY();
            EnumC1260320ity enumC1260320ity = this.LLJJIJI;
            EnumC1260320ity enumC1260320ity2 = EnumC1260320ity.UP;
            if (enumC1260320ity != enumC1260320ity2) {
                if (LIZJ()) {
                    scrollTo(0, getScrollY() + (currY - this.LLJJJIL));
                    if ((Math.abs(LIZIZ(this.LLILLJJLI.getFinalY() - currY, this.LLILLJJLI.getDuration() - this.LLILLJJLI.timePassed(), true)) < 1 || Math.abs(Math.max(this.LLILLJJLI.getFinalY(), this.LLJJJJJIL) - this.LLJLIL) < 5) && this.LLJLIL < 0) {
                        this.LLILLJJLI.abortAnimation();
                        Scroller scroller = this.LLILLJJLI;
                        int i = this.LLJLIL;
                        scroller.startScroll(0, i, 0, -i, Math.abs(i) * 2);
                        this.LLJJIJI = enumC1260320ity2;
                        return;
                    }
                    if (this.LLJLIL <= this.LLJJJJJIL) {
                        if ((getParent() instanceof C16FB) && this.LLJLLL) {
                            float currVelocity = this.LLILLJJLI.getCurrVelocity();
                            if (currVelocity > 0.0f) {
                                currVelocity = -currVelocity;
                            }
                            ((C16FB) getParent()).LJFF(currVelocity);
                        }
                        this.LLILLJJLI.forceFinished(true);
                        return;
                    }
                }
                invalidate();
            } else {
                if (LIZLLL()) {
                    int finalY = this.LLILLJJLI.getFinalY() - currY;
                    int duration = this.LLILLJJLI.getDuration() - this.LLILLJJLI.timePassed();
                    View viewLIZ = this.LLLFZ.LIZ();
                    int iLIZIZ = LIZIZ(finalY, duration, false);
                    if (viewLIZ instanceof AbsListView) {
                        AbsListView absListView = (AbsListView) viewLIZ;
                        if (this.LLJJIJIL >= 21) {
                            absListView.fling(iLIZIZ);
                        } else {
                            absListView.smoothScrollBy(finalY, duration);
                        }
                    } else if (viewLIZ instanceof ScrollView) {
                        ((ScrollView) viewLIZ).fling(iLIZIZ);
                    } else if (viewLIZ instanceof RecyclerView) {
                        ((RecyclerView) viewLIZ).fling(0, iLIZIZ);
                    } else if (viewLIZ instanceof WebView) {
                        ((WebView) viewLIZ).flingScroll(0, iLIZIZ);
                    }
                    this.LLILLJJLI.forceFinished(true);
                    return;
                }
                scrollTo(0, currY);
                invalidate();
            }
            this.LLJJJIL = currY;
        }
    }

    public Float getMoveDistanceY() {
        return Float.valueOf(this.LLJJ);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        View view = this.LLJJI;
        if (view != null && !view.isClickable()) {
            this.LLJJI.setClickable(true);
        }
        LIZ(this);
        super.onFinishInflate();
    }

    public final void LJII() {
        if (C268330AfP.LJIIIZ() || !C2537109wv.LJIIIIZZ() || C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLL()) {
            return;
        }
        this.LLJL = C341940Daq.LIZ(52.0d);
        int iLIZ = C341940Daq.LIZ(20.0d);
        this.LLJJLIIIJLLLLLLLZ = iLIZ;
        setPadding(0, 0, 0, this.LLJL - iLIZ);
    }

    public int getCurScrollY() {
        return this.LLJLIL;
    }

    public C1260300itw getHelper() {
        return this.LLLFZ;
    }

    public int getMaxY() {
        return this.LLJJJJLIIL;
    }

    public int getMinY() {
        return this.LLJJJJJIL;
    }

    public int getTabsMarginTop() {
        return this.LLJJL;
    }

    public final void LIZ(ViewGroup viewGroup) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.LLJJIII = (ViewPager) childAt;
            }
            if (C19252910Tv.LIZIZ.LIZLLL().LJI().LLLII() && childAt != null && (childAt instanceof ConstraintLayout)) {
                LIZ((ViewGroup) childAt);
            }
        }
    }

    public final void LJ(InterfaceC1260330itz interfaceC1260330itz) {
        if (interfaceC1260330itz != null && !((ArrayList) this.LLLFF).contains(interfaceC1260330itz)) {
            ((ArrayList) this.LLLFF).add(interfaceC1260330itz);
        }
    }

    public final void LJFF(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.LLJJJJ = z;
    }

    public final void LJI(long j) {
        Float fValueOf = Float.valueOf(1.0f);
        C19393710u7.LIZ(this, new Pair(fValueOf, fValueOf), new Pair(fValueOf, Float.valueOf(-3000.0f)), j);
    }

    public final void LJIIIIZZ(InterfaceC1260330itz interfaceC1260330itz) {
        if (interfaceC1260330itz != null && ((ArrayList) this.LLLFF).contains(interfaceC1260330itz)) {
            ((ArrayList) this.LLLFF).remove(interfaceC1260330itz);
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        View viewLIZ = this.LLLFZ.LIZ();
        boolean z = true;
        if (i < 0) {
            if (getScrollY() > this.LLJJJJJIL) {
                return true;
            }
            return false;
        }
        if (i > 0 && viewLIZ != null) {
            if (!viewLIZ.canScrollVertically(i) && getScrollY() >= this.LLJJJJLIIL) {
                z = false;
            }
            return Boolean.valueOf(z).booleanValue();
        }
        return super.canScrollVertically(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[Catch: IllegalArgumentException -> 0x0235, TryCatch #0 {IllegalArgumentException -> 0x0235, blocks: (B:5:0x0008, B:8:0x0011, B:110:0x0231, B:20:0x0044, B:22:0x0048, B:24:0x004c, B:25:0x0052, B:27:0x005e, B:28:0x0064, B:29:0x006c, B:31:0x0072, B:32:0x007f, B:36:0x0086, B:40:0x0098, B:97:0x01d9, B:99:0x01e3, B:101:0x01e9, B:103:0x01ef, B:105:0x01f3, B:106:0x01f6, B:107:0x01fe, B:109:0x0227, B:44:0x00b3, B:46:0x00c0, B:47:0x00c3, B:49:0x00c7, B:51:0x00cd, B:52:0x00d5, B:54:0x00db, B:57:0x00e9, B:60:0x00ef, B:62:0x00f3, B:64:0x00f7, B:66:0x00fd, B:67:0x0123, B:69:0x0127, B:71:0x012d, B:72:0x013c, B:78:0x0161, B:79:0x0163, B:81:0x0169, B:84:0x0170, B:77:0x015e, B:86:0x0190, B:88:0x0194, B:92:0x01bc, B:94:0x01c2, B:95:0x01c8, B:96:0x01d5), top: B:115:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190 A[Catch: IllegalArgumentException -> 0x0235, TryCatch #0 {IllegalArgumentException -> 0x0235, blocks: (B:5:0x0008, B:8:0x0011, B:110:0x0231, B:20:0x0044, B:22:0x0048, B:24:0x004c, B:25:0x0052, B:27:0x005e, B:28:0x0064, B:29:0x006c, B:31:0x0072, B:32:0x007f, B:36:0x0086, B:40:0x0098, B:97:0x01d9, B:99:0x01e3, B:101:0x01e9, B:103:0x01ef, B:105:0x01f3, B:106:0x01f6, B:107:0x01fe, B:109:0x0227, B:44:0x00b3, B:46:0x00c0, B:47:0x00c3, B:49:0x00c7, B:51:0x00cd, B:52:0x00d5, B:54:0x00db, B:57:0x00e9, B:60:0x00ef, B:62:0x00f3, B:64:0x00f7, B:66:0x00fd, B:67:0x0123, B:69:0x0127, B:71:0x012d, B:72:0x013c, B:78:0x0161, B:79:0x0163, B:81:0x0169, B:84:0x0170, B:77:0x015e, B:86:0x0190, B:88:0x0194, B:92:0x01bc, B:94:0x01c2, B:95:0x01c8, B:96:0x01d5), top: B:115:0x0008 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1260280itu.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCanScrollUp(boolean z) {
        if (z) {
            if (!C268330AfP.LJIIIZ() && C2537109wv.LJIIIIZZ() && !C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLL()) {
                this.LLJJJJLIIL = ((this.LLJJIJIIJIL - this.LLJJL) - this.LLJL) + this.LLJJLIIIJLLLLLLLZ;
            } else {
                this.LLJJJJLIIL = this.LLJJIJIIJIL - this.LLJJL;
            }
        }
        if (!this.LLJLLIL && this.LLJZIJLIL == z) {
            return;
        }
        this.LLJZIJLIL = z;
        if (!z) {
            if (this.LLJLIL != 0) {
                scrollTo(0, 0);
            }
            this.LLJJJJLIIL = 0;
        }
        this.LLJLLIL = false;
    }

    public void setDisallowActionDown(boolean z) {
        this.LLJZ = z;
    }

    public void setGestureBlock(boolean z) {
        this.LLL = z;
    }

    public void setHeaderPaddingTop(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        if (!C268330AfP.LJIIIZ() && C2537109wv.LJIIIIZZ() && !C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLL()) {
            this.LLJJJJLIIL = ((this.LLJJIJIIJIL - this.LLJJL) - this.LLJL) + i;
        } else {
            this.LLJJJJLIIL = this.LLJJIJIIJIL - this.LLJJL;
        }
        setPadding(0, 0, 0, this.LLJL - i);
    }

    public void setMaxScrollHeight(int i) {
        int iMin = Math.min(i, this.LLJJIJIIJIL - this.LLJJL);
        this.LLJJJJLIIL = iMin;
        this.LLJJJJLIIL = Math.max(iMin, 0);
    }

    public void setMinY(int i) {
        this.LLJJJJJIL = i;
    }

    public void setNavBarHeight(int i) {
        this.LLJL = i;
    }

    public void setOnScrollListener(InterfaceC1260330itz interfaceC1260330itz) {
        this.LLLFFI = interfaceC1260330itz;
    }

    public void setScrollMinY(int i) {
        this.LLJLL = i;
    }

    public void setTabsMarginTop(int i) {
        this.LLJJL = i;
        this.LLJLLIL = true;
    }

    public C1260280itu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (!c19252910Tv.LIZLLL().LJI().LLLII() && !c19252910Tv.LIZLLL().LJI().LJJLL()) {
            this.LLJJI = getChildAt(0);
        } else {
            this.LLJJI = ((ViewGroup) getChildAt(0)).getChildAt(0);
        }
        View view = this.LLJJI;
        if (view != null) {
            measureChildWithMargins(view, i, 0, 0, 0);
            if (c19252910Tv.LIZLLL().LJI().LLLII() && this.LL.getResources().getConfiguration().orientation == 2) {
                this.LLJJIJIIJIL = 0;
                z = false;
            } else {
                int measuredHeight = this.LLJJI.getMeasuredHeight();
                if (measuredHeight != this.LLJJIJIIJIL) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLJJIJIIJIL = measuredHeight;
            }
        } else {
            z = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + (this.LLJJIJIIJIL - this.LLJJL), 1073741824));
        if (!this.LLLI || (((Boolean) C262170APf.LIZ.getValue()).booleanValue() && z)) {
            if (!C268330AfP.LJIIIZ() && C2537109wv.LJIIIIZZ() && !c19252910Tv.LIZLLL().LJI().LJJLL()) {
                this.LLJJJJLIIL = Math.max(((this.LLJJIJIIJIL - this.LLJJL) - this.LLJL) + this.LLJJLIIIJLLLLLLLZ, 0);
            } else {
                this.LLJJJJLIIL = Math.max(this.LLJJIJIIJIL - this.LLJJL, 0);
            }
            this.LLLI = true;
        }
        if (!this.LLJZIJLIL) {
            this.LLJJJJLIIL = 0;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        int i3;
        int scrollY = getScrollY();
        if (i2 < 0 && (i3 = scrollY + i2) < 0) {
            i2 = (int) (i2 * 1.2f * (1.0f - ((1.0f / this.LLJJJJJIL) * i3)));
        }
        int i4 = i2 + scrollY;
        int i5 = this.LLJJJJLIIL;
        if (i4 >= i5 || i4 <= (i5 = this.LLJJJJJIL)) {
            i4 = i5;
        }
        super.scrollBy(i, i4 - scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        boolean z;
        int i3 = this.LLJJJJLIIL;
        if (i2 >= i3) {
            i2 = i3;
        } else {
            int i4 = this.LLJJJJJIL;
            if (i2 <= i4) {
                i2 = i4;
            }
        }
        this.LLJLIL = i2;
        InterfaceC1260330itz interfaceC1260330itz = this.LLLFFI;
        if (interfaceC1260330itz != 0) {
            if (interfaceC1260330itz instanceof AbsFragment) {
                if (((AbsFragment) interfaceC1260330itz).isViewValid()) {
                    this.LLLFFI.onScroll(i2, this.LLJJJJLIIL);
                }
            } else {
                interfaceC1260330itz.onScroll(i2, i3);
            }
        }
        Iterator it2 = ((ArrayList) this.LLLFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1260330itz) it2.next()).onScroll(i2, this.LLJJJJLIIL);
        }
        if (i2 == this.LLJJJJLIIL) {
            z = true;
        } else {
            z = false;
        }
        this.LLLF = z;
        super.scrollTo(i, i2);
    }

    public C1260280itu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJLL = 10;
        this.LLJZIJLIL = true;
        this.LLLFF = new ArrayList();
        this.LLLI = false;
        this.LL = context;
        this.LLLFZ = new C1260300itw();
        this.LLILLJJLI = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLIZLLLIL = viewConfiguration.getScaledTouchSlop();
        this.LLJ = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLJI = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLJJIJIL = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollableLayout);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DampScrollableLayout ");
        sbLIZ.append(Log.getStackTraceString(new Throwable("DampScrollableLayout")));
        C1720106oR.LJI("DampScrollableLayout", C2188811AlT.LIZIZ(sbLIZ));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int LIZIZ(int i, int i2, boolean z) {
        if (this.LLILLJJLI != null && i2 != 0) {
            int i3 = (int) (((i * 1.0f) / i2) * 1000.0f);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getScrollerVelocity, distance:");
            sbLIZ.append(i);
            sbLIZ.append(", durationInMs: ");
            sbLIZ.append(i2);
            sbLIZ.append(" velocity: ");
            sbLIZ.append(i3);
            sbLIZ.append(", isLegacy: ");
            sbLIZ.append(z);
            C1720106oR.LJI("DampScrollableLayout", C2188811AlT.LIZIZ(sbLIZ));
            return i3;
        }
        return 0;
    }
}
