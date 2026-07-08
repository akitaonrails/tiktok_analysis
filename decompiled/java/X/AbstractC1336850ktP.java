package X;

import X.C1336790ktJ;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.xelement.viewpager.childitem.LynxViewpagerItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0ktP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1336850ktP<T extends C1336790ktJ> extends LinearLayout implements InterfaceC1311940kFE {
    public T LL;
    public final List<LynxViewpagerItem> LLILLJJLI;
    public final List<LynxViewpagerItem> LLILLL;
    public C1311970kFH LLILZ;
    public int LLILZIL;
    public final AbstractC1336850ktP<T>.a LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    /* JADX INFO: renamed from: X.0ktP$a */
    public final class a extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence LJIJJLI(int i) {
            return null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return ((ArrayList) AbstractC1336850ktP.this.LLILLJJLI).size();
        }

        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int LJIJJ(Object obj) {
            int iIndexOf = ((ArrayList) AbstractC1336850ktP.this.LLILLJJLI).indexOf(obj);
            if (iIndexOf == -1) {
                return -2;
            }
            return iIndexOf;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object LJJI(int i, ViewGroup viewGroup) {
            LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) ListProtector.get(AbstractC1336850ktP.this.LLILLJJLI, i);
            ViewGroup viewGroup2 = (ViewGroup) lynxViewpagerItem.mView.getParent();
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(lynxViewpagerItem.mView, viewGroup2);
            }
            viewGroup.addView(lynxViewpagerItem.mView);
            lynxViewpagerItem.sendIsAttachedEvent(true, i);
            return lynxViewpagerItem;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean LJJIFFI(View view, Object obj) {
            if (!(obj instanceof LynxViewpagerItem) || view != ((LynxUI) obj).mView) {
                return false;
            }
            return true;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) obj;
                C786410Ut5.LJJJLZIJ(lynxViewpagerItem.mView, viewGroup);
                lynxViewpagerItem.sendIsAttachedEvent(false, i);
            }
        }
    }

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public final boolean getMChanged() {
        return this.LLIZLLLIL;
    }

    public final List<LynxViewpagerItem> getMPendingChildren() {
        return this.LLILLL;
    }

    public final T getMViewPager() {
        return this.LL;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLILZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLILZ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        C1311970kFH c1311970kFH = this.LLILZ;
        if (c1311970kFH != null) {
            c1311970kFH.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    public final void setAllowHorizontalGesture(boolean z) {
        this.LL.setMAllowHorizontalGesture(z);
    }

    public final void setCurrentSelectIndex(int i) {
        this.LL.setCurrentItem(i);
    }

    public final void setKeepItemView(boolean z) {
        if (z) {
            this.LL.setOffscreenPageLimit(Integer.MAX_VALUE);
        } else {
            this.LL.setOffscreenPageLimit(1);
        }
    }

    public final void setLynxDirection(int i) {
        boolean z;
        if (i != 2 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.LLIZ) {
            C21596419fW reversingAdapter = this.LL.getReversingAdapter();
            int currentItem = this.LL.getCurrentItem();
            this.LLIZ = z;
            this.LL.setRTL(z);
            if (reversingAdapter != null) {
                reversingAdapter.LLILLL = z;
                reversingAdapter.notifyDataSetChanged();
            }
            this.LL.setCurrentItem(currentItem);
        }
    }

    public final void setMChanged(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setMViewPager(T t) {
        this.LL = t;
    }

    public final void setRTLMode(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLILZ = c1311970kFH;
    }

    public final void setSelectedIndex(int i) {
        this.LLILZIL = i;
    }

    public AbstractC1336850ktP(C1336800ktK c1336800ktK, Context context) {
        new LinkedHashMap();
        super(context);
        this.LL = c1336800ktK;
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        AbstractC1336850ktP<T>.a aVar = new a();
        this.LLILZLL = aVar;
        this.LLIZLLLIL = true;
        setOrientation(1);
        T t = this.LL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(t);
        t.setLayoutParams(layoutParams);
        this.LL.setAdapter(aVar);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
        addView(this.LL, 0);
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1311970kFH c1311970kFH = this.LLILZ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.LLILZ != null) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLILZ;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
