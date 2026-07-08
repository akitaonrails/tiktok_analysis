package X;

import X.C1336770ktH;
import Y.ACListenerS123S0200000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ktZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1336950ktZ<T extends C1336770ktH> extends LinearLayout implements InterfaceC1311940kFE {
    public T LL;
    public LynxTabBarView LLILLJJLI;
    public float LLILLL;
    public final AbstractC1336950ktZ<T>.a LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final List<LynxViewpagerItem> LLIZ;
    public final List<LynxViewpagerItem> LLIZLLLIL;
    public C1311970kFH LLJ;
    public final List<String> LLJI;
    public C19U1 LLJIJIL;
    public int LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC1336940ktY LLJJIJIIJIL;
    public InterfaceC1584740rLE LLJJIJIL;
    public InterfaceC1319390kRF LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public final HashMap<View, C1337020ktg> LLJJL;
    public final HashSet<C1337010ktf> LLJJLIIIJLLLLLLLZ;
    public final int[] LLJL;
    public final Rect LLJLIL;
    public final Rect LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public InterfaceC1337060ktk LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;

    /* JADX INFO: renamed from: X.0ktZ$a */
    public final class a extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return ((ArrayList) AbstractC1336950ktZ.this.LLIZ).size();
        }

        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int LJIJJ(Object obj) {
            int iIndexOf = ((ArrayList) AbstractC1336950ktZ.this.LLIZ).indexOf(obj);
            if (iIndexOf == -1) {
                return -2;
            }
            return iIndexOf;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence LJIJJLI(int i) {
            if (i <= AbstractC1336950ktZ.this.getMTabLayoutTitles().size() - 1) {
                AbstractC1336950ktZ<T> abstractC1336950ktZ = AbstractC1336950ktZ.this;
                if (abstractC1336950ktZ.LLJILJIL != 1) {
                    return (CharSequence) ListProtector.get(abstractC1336950ktZ.getMTabLayoutTitles(), i);
                }
                return null;
            }
            return null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object LJJI(int i, ViewGroup viewGroup) {
            LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) ListProtector.get(AbstractC1336950ktZ.this.LLIZ, i);
            ViewGroup viewGroup2 = (ViewGroup) lynxViewpagerItem.mView.getParent();
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(lynxViewpagerItem.mView, viewGroup2);
            }
            viewGroup.addView(lynxViewpagerItem.mView);
            lynxViewpagerItem.LJJIIZI(i, true);
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
                lynxViewpagerItem.LJJIIZI(i, false);
            }
        }
    }

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public abstract void setTabBarElementAdded(boolean z);

    public final void LIZ() {
        Drawable background;
        if (this.LLJIJIL == null) {
            LIZIZ(null);
        }
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 == null || c19u1.getBackground() == null) {
            C19U1 c19u12 = this.LLJIJIL;
            if (c19u12 != null) {
                c19u12.setBackgroundResource(R.drawable.clf);
            }
            C19U1 c19u13 = this.LLJIJIL;
            if (c19u13 == null || (background = c19u13.getBackground()) == null) {
                return;
            }
            background.mutate();
        }
    }

    public final void LIZJ() {
        HashSet hashSet = new HashSet();
        ArrayList<C1337010ktf> arrayList = new ArrayList();
        for (View view : this.LLJJL.keySet()) {
            C1337020ktg c1337020ktg = this.LLJJL.get(view);
            if (c1337020ktg != null && view.isShown() && c1337020ktg.LIZIZ) {
                this.LLJLILLLLZIIL.set(0, 0, view.getWidth(), view.getHeight());
                view.getLocationOnScreen(this.LLJL);
                Rect rect = this.LLJLILLLLZIIL;
                int[] iArr = this.LLJL;
                rect.offset(iArr[0], iArr[1]);
                if (this.LLJLILLLLZIIL.intersect(this.LLJLIL)) {
                    C1337010ktf c1337010ktf = new C1337010ktf(this.LLJLLIL, c1337020ktg.LIZ);
                    hashSet.add(c1337010ktf);
                    if (!this.LLJJLIIIJLLLLLLLZ.contains(c1337010ktf)) {
                        arrayList.add(c1337010ktf);
                    }
                }
            }
        }
        this.LLJJLIIIJLLLLLLLZ.removeAll(hashSet);
        Iterator<C1337010ktf> it2 = this.LLJJLIIIJLLLLLLLZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1337010ktf next = it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("disappear: [sign, position] = [");
            sbLIZ.append(next.LIZ);
            sbLIZ.append(", ");
            sbLIZ.append(next.LIZIZ);
            LynxLog.i("Foldview#BaseViewPagerImpl", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1337060ktk interfaceC1337060ktk = this.LLJLLL;
            if (interfaceC1337060ktk != null) {
                int i = next.LIZIZ;
                String str = this.LLJZIJLIL;
                interfaceC1337060ktk.LIZ(i, str != null ? str : "");
            }
        }
        this.LLJJLIIIJLLLLLLLZ.clear();
        this.LLJJLIIIJLLLLLLLZ.addAll(hashSet);
        for (C1337010ktf c1337010ktf2 : arrayList) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("appear: [sign, position] = [");
            sbLIZ2.append(c1337010ktf2.LIZ);
            sbLIZ2.append(", ");
            sbLIZ2.append(c1337010ktf2.LIZIZ);
            LynxLog.i("Foldview#BaseViewPagerImpl", C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC1337060ktk interfaceC1337060ktk2 = this.LLJLLL;
            if (interfaceC1337060ktk2 != null) {
                int i2 = c1337010ktf2.LIZIZ;
                String str2 = this.LLJZ;
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC1337060ktk2.LIZ(i2, str2);
            }
        }
    }

    public final void LJFF() {
        C19U0 tabAt;
        LynxBaseUI next;
        Integer num;
        if (this.LLJILJIL == 1) {
            LynxTabBarView lynxTabBarView = this.LLILLJJLI;
            if (lynxTabBarView != null) {
                int iIntValue = this.LLJJJJLIIL;
                Iterator<LynxBaseUI> it2 = lynxTabBarView.mChildren.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    LynxBaseUI lynxBaseUI = next;
                    if ((lynxBaseUI instanceof LynxTabbarItem) && ((LynxTabbarItem) lynxBaseUI).LLILZ) {
                        break;
                    }
                }
                LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) next;
                if (lynxTabbarItem != null && (num = lynxTabbarItem.LL) != null) {
                    iIntValue = num.intValue();
                }
                lynxTabBarView.LJJIJIIJI(0, iIntValue);
                return;
            }
            return;
        }
        if (this.LLJIJIL == null) {
            this.LL.setCurrentItem(this.LLJJJJLIIL, false);
        }
        this.LLJJL.clear();
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null) {
            int tabCount = c19u1.getTabCount();
            int i = 0;
            while (i < tabCount) {
                C19U1 c19u12 = this.LLJIJIL;
                if (c19u12 != null && (tabAt = c19u12.getTabAt(i)) != null) {
                    if (i == this.LLJJJJLIIL) {
                        tabAt.LIZIZ();
                    }
                    if (tabAt.LJFF == null) {
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d2x, tabAt.LJIIIIZZ, false);
                        TextView textView = (TextView) viewTd.findViewById(android.R.id.text1);
                        textView.setText(tabAt.LIZJ);
                        C19U1 c19u13 = this.LLJIJIL;
                        if (c19u13 == null || i != c19u13.getSelectedTabPosition()) {
                            textView.setTextSize(1, this.LLJJ);
                            textView.setTypeface(this.LLJJIJI ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                            int i2 = this.LLJJI;
                            if (i2 != 0) {
                                textView.setTextColor(i2);
                            }
                        } else {
                            textView.setTextSize(1, this.LLJILJILJ);
                            textView.setTypeface(this.LLJJIII ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                            int i3 = this.LLJILLL;
                            if (i3 != 0) {
                                textView.setTextColor(i3);
                            }
                        }
                        if (this.LLJLL) {
                            viewTd.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1339240kxG(this, 3));
                            this.LLJJL.put(viewTd, new C1337020ktg(tabAt.LJ, 2));
                        }
                        tabAt.LIZLLL(viewTd);
                        tabAt.LJIIIIZZ.setBackgroundColor(0);
                        int iLIZ = C1337000kte.LIZ(this.LLILLL, getContext());
                        if (this.LLJJJIL == -1109) {
                            this.LLJJJIL = iLIZ;
                        }
                        if (this.LLJJJJ == -1109) {
                            this.LLJJJJ = iLIZ;
                        }
                        int i4 = i == 0 ? this.LLJJJIL : iLIZ;
                        if (i == ((ArrayList) this.LLJI).size() - 1) {
                            iLIZ = this.LLJJJJ;
                        }
                        View view = tabAt.LJFF;
                        if (view != null) {
                            view.setPaddingRelative(i4, view.getPaddingTop(), iLIZ, view.getPaddingBottom());
                        }
                        C21546519Tz c21546519Tz = tabAt.LJIIIIZZ;
                        if (c21546519Tz == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        C786410Ut5.I7(new ACListenerS123S0200000_20(this, tabAt, 1), c21546519Tz);
                    } else {
                        continue;
                    }
                }
                i++;
            }
        }
    }

    public final boolean getMChanged() {
        return this.LLILZLL;
    }

    public final List<LynxViewpagerItem> getMPendingChildren() {
        return this.LLIZLLLIL;
    }

    public final LynxTabBarView getMTabBarView() {
        return this.LLILLJJLI;
    }

    public final C19U1 getMTabLayout() {
        return this.LLJIJIL;
    }

    public final List<String> getMTabLayoutTitles() {
        return this.LLJI;
    }

    public final T getMViewPager() {
        return this.LL;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLJ;
    }

    public final int getTabLayoutCodeMode() {
        return this.LLJILJIL;
    }

    public final void LIZIZ(C19U1 c19u1) {
        if (c19u1 == null) {
            if (this.LLJIJIL != null) {
                return;
            }
            int i = LynxTabBarView.LLJIJIL;
            C1319530kRT c1319530kRTLIZ = C1336970ktb.LIZ(getContext());
            this.LLJIJIL = c1319530kRTLIZ;
            InterfaceC1584740rLE interfaceC1584740rLE = this.LLJJIJIL;
            if (interfaceC1584740rLE != null) {
                c1319530kRTLIZ.addOnTabSelectedListener((InterfaceC1586460rO0) interfaceC1584740rLE);
            }
        } else {
            C19U1 c19u12 = this.LLJIJIL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c19u12);
            removeView(c19u12);
            C19U1 c19u13 = this.LLJIJIL;
            if (c19u13 != null) {
                c19u13.setupWithViewPager(null);
            }
            this.LLJIJIL = c19u1;
            ((ArrayList) this.LLJI).clear();
            this.LLJILJIL = 1;
        }
        C19U1 c19u14 = this.LLJIJIL;
        if (c19u14 != null) {
            c19u14.setupWithViewPager(this.LL);
        }
        this.LL.setAdapter(this.LLILZ);
        LJ(this.LLILZIL);
        C19U1 c19u15 = this.LLJIJIL;
        if (c19u15 == null || c19u15.getParent() == null) {
            addView(this.LLJIJIL, 0);
        }
        InterfaceC1319390kRF interfaceC1319390kRF = this.LLJJJ;
        if (interfaceC1319390kRF != null) {
            interfaceC1319390kRF.LIZ(this.LLJIJIL, this.LLJJJJJIL);
        }
    }

    public final void LJ(boolean z) {
        C21596219fU reversingAdapter = this.LL.getReversingAdapter();
        int currentItem = this.LL.getCurrentItem();
        this.LLILZIL = z;
        this.LL.setRTL(z);
        if (reversingAdapter != null) {
            reversingAdapter.LLILLL = z;
            reversingAdapter.notifyDataSetChanged();
        }
        if (this.LLJILJIL == 1) {
            LynxTabBarView lynxTabBarView = this.LLILLJJLI;
            if (lynxTabBarView != null) {
                lynxTabBarView.LJJIJIIJI(0, currentItem);
            }
        } else {
            LJFF();
        }
        this.LL.setCurrentItem(currentItem);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLJ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        C1311970kFH c1311970kFH = this.LLJ;
        if (c1311970kFH != null) {
            c1311970kFH.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    public final void setAllowHorizontalGesture(boolean z) {
        this.LL.setMAllowHorizontalGesture(z);
    }

    public final void setBorderHeight(float f) {
        Drawable background;
        LIZ();
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null && (background = c19u1.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(1);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                gradientDrawable.setSize(gradientDrawable.getIntrinsicWidth(), C1337000kte.LIZ(f, getContext()));
                C1337000kte.LIZ(f, getContext());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void setBorderLineColor(String str) {
        Drawable background;
        LIZ();
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null && (background = c19u1.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(1);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(C1337000kte.LIZJ(str));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void setBorderWidth(float f) {
        Drawable background;
        LIZ();
        int i = (int) (getContext().getResources().getDisplayMetrics().widthPixels * (f / 375.0f));
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null && (background = c19u1.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(1);
            if (drawable != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                gradientDrawable.setSize(i, gradientDrawable.getIntrinsicHeight());
                C1337000kte.LIZ(f, getContext());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
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
        if (z != this.LLILZIL) {
            LJ(z);
        }
    }

    public final void setMChanged(boolean z) {
        this.LLILZLL = z;
    }

    public final void setMTabBarView(LynxTabBarView lynxTabBarView) {
        this.LLILLJJLI = lynxTabBarView;
    }

    public final void setMTabLayout(C19U1 c19u1) {
        this.LLJIJIL = c19u1;
    }

    public final void setMViewPager(T t) {
        this.LL = t;
    }

    public final void setRTLMode(boolean z) {
        this.LLILZIL = z;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLJ = c1311970kFH;
    }

    public final void setSelectedIndex(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setSelectedTabIndicatorColor(String str) {
        if (this.LLJIJIL == null) {
            LIZIZ(null);
        }
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null) {
            c19u1.setSelectedTabIndicatorColor(C1337000kte.LIZJ(str));
        }
    }

    public final void setSelectedTextColor(String str) {
        Integer numValueOf;
        C19U0 tabAt;
        View view;
        TextView textView;
        this.LLJILLL = C1337000kte.LIZJ(str);
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null && (numValueOf = Integer.valueOf(c19u1.getSelectedTabPosition())) != null) {
            int iIntValue = numValueOf.intValue();
            C19U1 c19u12 = this.LLJIJIL;
            if (c19u12 != null && (tabAt = c19u12.getTabAt(iIntValue)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextSize(float f) {
        Integer numValueOf;
        C19U0 tabAt;
        View view;
        TextView textView;
        this.LLJILJILJ = f;
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null && (numValueOf = Integer.valueOf(c19u1.getSelectedTabPosition())) != null) {
            int iIntValue = numValueOf.intValue();
            C19U1 c19u12 = this.LLJIJIL;
            if (c19u12 != null && (tabAt = c19u12.getTabAt(iIntValue)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextStyle(TextView textView) {
        Typeface typeface;
        if (this.LLJILJIL != 0) {
            return;
        }
        textView.setTextSize(1, this.LLJILJILJ);
        if (this.LLJJIII) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        textView.setTextColor(this.LLJILLL);
    }

    public final void setTabBarDragEnable(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setTabClickListenerListener(InterfaceC1336940ktY interfaceC1336940ktY) {
        this.LLJJIJIIJIL = interfaceC1336940ktY;
    }

    public final void setTabIndicatorHeight(float f) {
        Drawable tabSelectedIndicator;
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        Drawable drawable = null;
        if (this.LLJIJIL == null) {
            LIZIZ(null);
        }
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null) {
            tabSelectedIndicator = c19u1.getTabSelectedIndicator();
        } else {
            tabSelectedIndicator = null;
        }
        if ((tabSelectedIndicator instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) tabSelectedIndicator) != null) {
            drawable = layerDrawable.getDrawable(0);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setSize(gradientDrawable.getIntrinsicWidth(), C1337000kte.LIZ(f, getContext()));
        }
        C19U1 c19u12 = this.LLJIJIL;
        if (c19u12 != null) {
            c19u12.requestLayout();
        }
    }

    public final void setTabIndicatorRadius(float f) {
        Drawable tabSelectedIndicator;
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        Drawable drawable = null;
        if (this.LLJIJIL == null) {
            LIZIZ(null);
        }
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null) {
            tabSelectedIndicator = c19u1.getTabSelectedIndicator();
        } else {
            tabSelectedIndicator = null;
        }
        if ((tabSelectedIndicator instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) tabSelectedIndicator) != null) {
            drawable = layerDrawable.getDrawable(0);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setCornerRadius(C1337000kte.LIZ(f, getContext()));
        }
        C19U1 c19u12 = this.LLJIJIL;
        if (c19u12 != null) {
            c19u12.requestLayout();
        }
    }

    public final void setTabIndicatorWidth(float f) {
        Drawable tabSelectedIndicator;
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        Drawable drawable = null;
        if (this.LLJIJIL == null) {
            LIZIZ(null);
        }
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null) {
            tabSelectedIndicator = c19u1.getTabSelectedIndicator();
        } else {
            tabSelectedIndicator = null;
        }
        if ((tabSelectedIndicator instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) tabSelectedIndicator) != null) {
            drawable = layerDrawable.getDrawable(0);
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
            gradientDrawable.setSize((int) (getContext().getResources().getDisplayMetrics().widthPixels * (f / 375.0f)), gradientDrawable.getIntrinsicHeight());
        }
        C19U1 c19u12 = this.LLJIJIL;
        if (c19u12 != null) {
            c19u12.requestLayout();
        }
    }

    public final void setTabInterspace(float f) {
        this.LLILLL = f / 2;
    }

    public final void setTabLayout(LynxTabBarView lynxTabBarView) {
        this.LLILLJJLI = lynxTabBarView;
        C1319530kRT c1319530kRT = lynxTabBarView.LLILLJJLI;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        LIZIZ(c1319530kRT);
    }

    public final void setTabLayoutUpdateListener$x_element_fold_view_release(InterfaceC1319390kRF interfaceC1319390kRF) {
        this.LLJJJ = interfaceC1319390kRF;
    }

    public final void setTabPaddingBottom(int i) {
        C1337000kte.LIZ(i, getContext());
        LJFF();
    }

    public final void setTabPaddingEnd(int i) {
        this.LLJJJJ = C1337000kte.LIZ(i, getContext());
        LJFF();
    }

    public final void setTabPaddingStart(int i) {
        this.LLJJJIL = C1337000kte.LIZ(i, getContext());
        LJFF();
    }

    public final void setTabPaddingTop(int i) {
        C1337000kte.LIZ(i, getContext());
        LJFF();
    }

    public final void setTabSelectedListener$x_element_fold_view_release(InterfaceC1584740rLE interfaceC1584740rLE) {
        this.LLJJIJIL = interfaceC1584740rLE;
    }

    public final void setTabbarBackground(String str) {
        Drawable background;
        LIZ();
        C19U1 c19u1 = this.LLJIJIL;
        if (c19u1 != null && (background = c19u1.getBackground()) != null) {
            Drawable drawable = ((LayerDrawable) background).getDrawable(0);
            if (drawable != null) {
                ((GradientDrawable) drawable).setColor(C1337000kte.LIZJ(str));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
    }

    public final void setTablayoutGravity(String str) {
        C19U1 c19u1;
        Field declaredField;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        if (this.LLJIJIL == null) {
            LIZIZ(null);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1364013995) {
            if (iHashCode != 3143043) {
                if (iHashCode == 3317767 && lowerCase.equals("left")) {
                    C19U1 c19u12 = this.LLJIJIL;
                    if (c19u12 != null && (layoutParams3 = c19u12.getLayoutParams()) != null) {
                        layoutParams3.width = -1;
                    }
                    C19U1 c19u13 = this.LLJIJIL;
                    if (c19u13 != null) {
                        c19u13.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!lowerCase.equals("fill")) {
                return;
            }
            C19U1 c19u14 = this.LLJIJIL;
            if (c19u14 != null) {
                c19u14.setTabMode(1);
            }
            C19U1 c19u15 = this.LLJIJIL;
            if (c19u15 != null && (layoutParams2 = c19u15.getLayoutParams()) != null) {
                layoutParams2.width = -1;
            }
            C19U1 c19u16 = this.LLJIJIL;
            if (c19u16 != null) {
                c19u16.setTabGravity(0);
            }
            C19U1 c19u17 = this.LLJIJIL;
            if (c19u17 == null) {
                return;
            }
            c19u17.requestLayout();
            return;
        }
        if (!lowerCase.equals("center")) {
            return;
        }
        C19U1 c19u18 = this.LLJIJIL;
        if (c19u18 != null) {
            c19u18.setTabGravity(1);
        }
        C19U1 c19u19 = this.LLJIJIL;
        if (c19u19 != null && (layoutParams = c19u19.getLayoutParams()) != null) {
            layoutParams.width = -1;
        }
        try {
            c19u1 = this.LLJIJIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (c19u1 != null && (declaredField = c19u1.getClass().getDeclaredField("slidingTabIndicator")) != null) {
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.LLJIJIL);
            if (obj != null) {
                LinearLayout linearLayout = (LinearLayout) obj;
                linearLayout.setGravity(17);
                linearLayout.getLayoutParams().width = -2;
                C189200o6.m2constructorimpl(Unit.LIZ);
                C19U1 c19u110 = this.LLJIJIL;
                if (c19u110 == null) {
                    return;
                }
                c19u110.requestLayout();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final void setTextBold(String str) {
        if (Intrinsics.LJFF(str, "selected")) {
            this.LLJJIII = true;
            this.LLJJIJI = false;
        } else {
            if (!Intrinsics.LJFF(str, "unselected")) {
                return;
            }
            this.LLJJIII = false;
            this.LLJJIJI = true;
        }
    }

    public final void setUnSelectedTextColor(String str) {
        Integer numValueOf;
        C19U1 c19u1;
        C19U0 tabAt;
        View view;
        TextView textView;
        C19U1 c19u12 = this.LLJIJIL;
        if (c19u12 != null) {
            numValueOf = Integer.valueOf(c19u12.getSelectedTabPosition());
        } else {
            numValueOf = null;
        }
        this.LLJJI = C1337000kte.LIZJ(str);
        C19U1 c19u13 = this.LLJIJIL;
        if (c19u13 != null) {
            int tabCount = c19u13.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                if ((numValueOf == null || numValueOf.intValue() != i) && (c19u1 = this.LLJIJIL) != null && (tabAt = c19u1.getTabAt(i)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                    setUnSelectedTextStyle(textView);
                }
            }
        }
    }

    public final void setUnSelectedTextSize(float f) {
        Integer numValueOf;
        C19U1 c19u1;
        C19U0 tabAt;
        View view;
        TextView textView;
        this.LLJJ = f;
        C19U1 c19u12 = this.LLJIJIL;
        if (c19u12 != null) {
            numValueOf = Integer.valueOf(c19u12.getSelectedTabPosition());
        } else {
            numValueOf = null;
        }
        C19U1 c19u13 = this.LLJIJIL;
        if (c19u13 != null) {
            int tabCount = c19u13.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                if ((numValueOf == null || numValueOf.intValue() != i) && (c19u1 = this.LLJIJIL) != null && (tabAt = c19u1.getTabAt(i)) != null && (view = tabAt.LJFF) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
                    setUnSelectedTextStyle(textView);
                }
            }
        }
    }

    public final void setUnSelectedTextStyle(TextView textView) {
        Typeface typeface;
        if (this.LLJILJIL != 0) {
            return;
        }
        textView.setTextSize(1, this.LLJJ);
        if (this.LLJJIJI) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        textView.setTextColor(this.LLJJI);
    }

    public AbstractC1336950ktZ(T t, Context context) {
        new LinkedHashMap();
        super(context);
        this.LL = t;
        this.LLILLL = 9.0f;
        AbstractC1336950ktZ<T>.a aVar = new a();
        this.LLILZ = aVar;
        this.LLILZLL = true;
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = new ArrayList();
        this.LLJI = new ArrayList();
        this.LLJILJILJ = 16.0f;
        this.LLJJ = 16.0f;
        this.LLJJJIL = -1109;
        this.LLJJJJ = -1109;
        this.LLJJJJJIL = true;
        this.LLJJL = new HashMap<>();
        this.LLJJLIIIJLLLLLLLZ = new HashSet<>();
        this.LLJL = new int[2];
        this.LLJLIL = new Rect();
        this.LLJLILLLLZIIL = new Rect();
        setOrientation(1);
        T t2 = this.LL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(t2);
        t2.setLayoutParams(layoutParams);
        this.LL.setAdapter(aVar);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
        addView(this.LL, 0);
    }

    public final void LIZLLL(float f, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (z) {
            C19U1 c19u1 = this.LLJIJIL;
            if (c19u1 != null && (layoutParams2 = c19u1.getLayoutParams()) != null) {
                layoutParams2.height = C1337000kte.LIZIZ(f, getContext());
            }
        } else {
            C19U1 c19u12 = this.LLJIJIL;
            if (c19u12 != null && (layoutParams = c19u12.getLayoutParams()) != null) {
                layoutParams.height = C1337000kte.LIZ(f, getContext());
            }
        }
        C19U1 c19u13 = this.LLJIJIL;
        if (c19u13 != null) {
            c19u13.getLayoutParams();
        }
        C19U1 c19u14 = this.LLJIJIL;
        if (c19u14 != null) {
            c19u14.requestLayout();
        }
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1311970kFH c1311970kFH = this.LLJ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.LLJ != null) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLJ;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
