package X;

import Y.AsS29S0100000_1;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuExpandableFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuGridLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import r4b.c;
import r4b.g;

/* JADX INFO: renamed from: X.04FA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FA extends ConstraintLayout implements InterfaceC2172581A0y {
    public final g LL;
    public RecyclerView LLILLJJLI;
    public C420330Gdz LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public FrameLayout LLIZ;
    public View LLIZLLLIL;
    public C426160GnO LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C04FD LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public List<C042Y> LLJJ;
    public int LLJJI;
    public String LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public String LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public C2172551A0v LLJJJJ;

    @Override // X.InterfaceC2172581A0y
    public final void M2(int i) {
    }

    private final int getDataSize() {
        List<C042Y> list = this.LLJJ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final View getDivideLineViewFromXml() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fz0);
        this.LLIZLLLIL = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getFlSizeGuideContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i_r);
            this.LLIZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getSalePropInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tyj);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final RecyclerView getSpecListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt1);
            this.LLILLJJLI = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final TuxTextView getSpecNameDotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt3);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSpecNameFullTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt4);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSpecNameTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt5);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C426160GnO getSpecNameTextLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt6);
            this.LLJ = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final TuxTextView getSpecNameTextValueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt7);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C420330Gdz getSpecScrollBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vt8);
            this.LLILLL = (C420330Gdz) callbackFindViewById;
        }
        return (C420330Gdz) callbackFindViewById;
    }

    public final SkuGridLayoutManager getLayoutManager() {
        if (getSpecListFromXml().getLayoutManager() instanceof SkuGridLayoutManager) {
            return (SkuGridLayoutManager) getSpecListFromXml().getLayoutManager();
        }
        return null;
    }

    public final boolean getNeedScrollBar() {
        SkuGridLayoutManager skuGridLayoutManager;
        RecyclerView.LayoutManager layoutManager = getSpecListFromXml().getLayoutManager();
        return !((!(layoutManager instanceof SkuGridLayoutManager) || (skuGridLayoutManager = (SkuGridLayoutManager) layoutManager) == null) ? true : skuGridLayoutManager.LLJILJIL);
    }

    public final Boolean getViewAllFromLayoutManager() {
        SkuExpandableFlowLayoutManager skuExpandableFlowLayoutManager;
        RecyclerView.LayoutManager layoutManager = getSpecListFromXml().getLayoutManager();
        if (!(layoutManager instanceof SkuExpandableFlowLayoutManager) || (skuExpandableFlowLayoutManager = (SkuExpandableFlowLayoutManager) layoutManager) == null) {
            return null;
        }
        return Boolean.valueOf(skuExpandableFlowLayoutManager.LLILLJJLI);
    }

    public final void j0() {
        while (true) {
            RecyclerView specListFromXml = getSpecListFromXml();
            if (specListFromXml == null || specListFromXml.getItemDecorationCount() <= 0) {
                return;
            }
            RecyclerView specListFromXml2 = getSpecListFromXml();
            if (specListFromXml2 != null) {
                specListFromXml2.removeItemDecorationAt(0);
            }
        }
    }

    public final void l0() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getSpecListFromXml().getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (getDataSize() <= Math.abs(iFindFirstVisibleItemPosition - iFindLastVisibleItemPosition) || getSpecListFromXml().getChildCount() <= 0) {
            return;
        }
        if (this.LLJILJILJ != -1) {
            int i = (iFindFirstVisibleItemPosition + iFindLastVisibleItemPosition) / 2;
            int width = getSpecListFromXml().getChildAt(0).getWidth();
            int i2 = C426750GoL.LIZLLL(getContext()) ? -1 : 1;
            int i3 = this.LLJILJILJ;
            if (i3 == i) {
                return;
            }
            if (i3 <= i || getSpecListFromXml().canScrollHorizontally(i2)) {
                if (this.LLJILJILJ >= i || getSpecListFromXml().canScrollHorizontally(-i2)) {
                    int iAbs = (int) ((((double) Math.abs(this.LLJILJILJ - i)) + 0.5d) * ((double) width));
                    if (this.LLJILJILJ <= i) {
                        i2 = -i2;
                    }
                    getSpecListFromXml().smoothScrollBy(iAbs * i2, 0);
                }
            }
        }
    }

    public final C2172551A0v getAdapter() {
        return this.LLJJJJ;
    }

    public final g getStyle() {
        return this.LL;
    }

    public final void i0(RecyclerView recyclerView) {
        float f;
        if (!getNeedScrollBar()) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && layoutManager != null) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            if (recyclerView.computeHorizontalScrollRange() > 0) {
                f = iComputeHorizontalScrollOffset / (r0 - iComputeHorizontalScrollExtent);
            } else {
                f = 0.0f;
            }
            getSpecScrollBarFromXml().setProgress(f);
        }
    }

    public final void setAdapter(C2172551A0v c2172551A0v) {
        this.LLJJJJ = c2172551A0v;
    }

    public final void setClickListener(C04FD c04fd) {
        this.LLJILJIL = c04fd;
    }

    public final void setDivideLineViewFromXml(View view) {
        this.LLIZLLLIL = view;
    }

    public final void setFlSizeGuideContainerFromXml(FrameLayout frameLayout) {
        this.LLIZ = frameLayout;
    }

    public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        getSpecListFromXml().setLayoutManager(layoutManager);
    }

    public final void setSalePropInfoFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setSpecListFromXml(RecyclerView recyclerView) {
        this.LLILLJJLI = recyclerView;
    }

    public final void setSpecNameDotFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setSpecNameFullTextFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setSpecNameTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setSpecNameTextLayoutFromXml(C426160GnO c426160GnO) {
        this.LLJ = c426160GnO;
    }

    public final void setSpecNameTextValueFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setSpecScrollBarFromXml(C420330Gdz c420330Gdz) {
        this.LLILLL = c420330Gdz;
    }

    public final void setTextLayoutMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getSpecNameTextLayoutFromXml().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(i);
            }
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.a7(getSpecNameTextLayoutFromXml(), marginLayoutParams);
    }

    @Override // X.InterfaceC2172581A0y
    public final void LJJIFFI(int i, Object obj) {
        C042Y c042y;
        C04FD c04fd = this.LLJILJIL;
        if (c04fd != null) {
            int i2 = this.LLJJI;
            List<C042Y> list = this.LLJJ;
            if (list != null) {
                c042y = (C042Y) C13LP.LJJJLZIJ(i, list);
            } else {
                c042y = null;
            }
            c04fd.Tk(i2, i, c042y);
        }
    }

    @Override // X.InterfaceC2172581A0y
    public final void LJJLIIIJ(int i, RecyclerView.ViewHolder viewHolder) {
        C042Y c042y;
        C04FD c04fd = this.LLJILJIL;
        if (c04fd != null) {
            View view = viewHolder.itemView;
            int i2 = this.LLJJI;
            List<C042Y> list = this.LLJJ;
            if (list != null) {
                c042y = (C042Y) C13LP.LJJJLZIJ(i, list);
            } else {
                c042y = null;
            }
            c04fd.LLLLZLLLI(view, i2, i, c042y);
        }
    }

    public C04FA(Context context, Fragment fragment, g gVar) {
        super(context);
        this.LL = gVar;
        this.LLJILJILJ = -1;
        this.LLJILLL = -2;
        this.LLJJI = -1;
        this.LLJJIII = "";
        this.LLJJIJIL = "";
        this.LLJJJ = -1;
        C2172551A0v c2172551A0v = new C2172551A0v(fragment, gVar == null ? new c() : gVar);
        c2172551A0v.setShowFooter(false);
        this.LLJJJJ = c2172551A0v;
        C954703oH.LIZ(context, R.layout.azn, this, true);
        getSpecListFromXml().setAdapter(this.LLJJJJ);
        getSpecListFromXml().setItemAnimator(null);
        RecyclerView specListFromXml = getSpecListFromXml();
        ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
        scrollTopLinearLayoutManager.setOrientation(0);
        specListFromXml.setLayoutManager(scrollTopLinearLayoutManager);
        getSpecListFromXml().addOnScrollListener(new AsS29S0100000_1(this, 7));
        C786410Ut5.LJLLLLLL(8, getSpecScrollBarFromXml());
        getSpecListFromXml().addOnLayoutChangeListener(new C04JJ(this, 1));
        int iLIZLLL = (int) (((double) C958103op.LIZLLL()) * 0.5d);
        if (iLIZLLL > 0) {
            getSpecNameTextFromXml().setMaxWidth(iLIZLLL);
        }
    }

    public final void e0(String str, List<C042Y> list, int i, SizeGuide sizeGuide, String str2, boolean z, View view, Function0<? extends View> function0) {
        InterfaceC1065804Eu c2172351A0b;
        boolean z2;
        boolean z3;
        Image image;
        boolean z4;
        EnumC21715119yf enumC21715119yf;
        Float fValueOf;
        boolean z5;
        View viewInvoke;
        String str3;
        String str4;
        int iIntValue;
        SalePropTag salePropTag;
        this.LLJJ = list;
        this.LLJJI = i;
        this.LLJILJILJ = -1;
        String string = getContext().getString(2131850918);
        this.LLJJIJIL = str2;
        if (list != null) {
            int i2 = 0;
            for (C042Y c042y : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C042Y c042y2 = c042y;
                    if (c042y2.LLJI) {
                        this.LLJILJILJ = i2;
                        string = c042y2.LLILLJJLI;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C12ES.LJIILL(0, getSpecNameTextLayoutFromXml());
        C12ES.LJIILL(0, getSpecNameTextFromXml());
        C12ES.LJIILL(0, getSpecNameDotFromXml());
        C12ES.LJIILL(0, getSpecNameTextValueFromXml());
        C03DZ.LIZ(getSpecNameFullTextFromXml());
        getSpecNameTextFromXml().setText(str);
        getSpecNameTextValueFromXml().setText(string);
        if (list != null && !list.isEmpty()) {
            Iterator<C042Y> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SalePropTag salePropTag2 = it2.next().LLILZLL;
                if (salePropTag2 != null && (str3 = salePropTag2.descriptionTextPlain) != null && str3.length() != 0) {
                    TuxTextView specNameTextFromXml = getSpecNameTextFromXml();
                    TuxTextView specNameDotFromXml = getSpecNameDotFromXml();
                    TuxTextView specNameTextValueFromXml = getSpecNameTextValueFromXml();
                    int size = list.size();
                    int i4 = this.LLJILJILJ;
                    if (i4 >= 0 && i4 < size && (salePropTag = ((C042Y) ListProtector.get(list, i4)).LLILZLL) != null) {
                        str4 = salePropTag.descriptionTextPlain;
                    } else {
                        str4 = null;
                    }
                    int currentTextColor = specNameTextFromXml.getCurrentTextColor();
                    int currentTextColor2 = specNameDotFromXml.getCurrentTextColor();
                    int currentTextColor3 = specNameTextValueFromXml.getCurrentTextColor();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    CharSequence charSequenceLIZ = AnonymousClass0391.LIZ(str, currentTextColor, 42, ":", currentTextColor2, string, currentTextColor3, str4, iIntValue, 61, 41);
                    TuxTextView specNameFullTextFromXml = getSpecNameFullTextFromXml();
                    specNameFullTextFromXml.setText(charSequenceLIZ);
                    C12ES.LJIILL(0, specNameFullTextFromXml);
                    C03DZ.LIZ(getSpecNameTextLayoutFromXml());
                }
            }
        }
        if (function0 != null && (viewInvoke = function0.invoke()) != null && sizeGuide != null) {
            C12ES.LJIILL(0, getFlSizeGuideContainerFromXml());
            if (getFlSizeGuideContainerFromXml().getChildCount() > 0) {
                C786410Ut5.LJJJJIZL(getFlSizeGuideContainerFromXml());
            }
            getFlSizeGuideContainerFromXml().addView(viewInvoke);
            C04FD c04fd = this.LLJILJIL;
            if (c04fd != null) {
                c04fd.LLLLZLL(getFlSizeGuideContainerFromXml());
            }
            C786410Ut5.I7(new AjS40S0200000_1(this, sizeGuide, 65), getFlSizeGuideContainerFromXml());
        } else if (view != null) {
            FrameLayout flSizeGuideContainerFromXml = getFlSizeGuideContainerFromXml();
            if (flSizeGuideContainerFromXml != null) {
                C12ES.LJIILL(0, flSizeGuideContainerFromXml);
                if (flSizeGuideContainerFromXml.getChildCount() > 0) {
                    C786410Ut5.LJJJJIZL(flSizeGuideContainerFromXml);
                }
                flSizeGuideContainerFromXml.addView(view);
            }
        } else {
            C03DZ.LIZ(getFlSizeGuideContainerFromXml());
        }
        C03DZ.LIZ(getSalePropInfoFromXml());
        int i5 = this.LLJILJILJ;
        List<C042Y> list2 = this.LLJJ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            int i6 = 0;
            for (C042Y c042y3 : list2) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    C042Y c042y4 = c042y3;
                    C042W c042w = c042y4.LLJIJIL;
                    if (c042w != C042W.NOT_EXPANDABLE) {
                        String str5 = c042y4.LLILLJJLI;
                        if (c042y4.LLILZIL) {
                            enumC21715119yf = EnumC21715119yf.BLOCK;
                        } else if (c042y4.LIZIZ()) {
                            enumC21715119yf = EnumC21715119yf.LARGE;
                        } else {
                            enumC21715119yf = EnumC21715119yf.SMALL;
                        }
                        Image image2 = c042y4.LLILZ;
                        if (image2 != null) {
                            fValueOf = Float.valueOf(image2.getRadio());
                        } else {
                            fValueOf = null;
                        }
                        if (c042y4.LLILLL == null && !c042y4.LLJILJIL) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        c2172351A0b = new C1A0W(str5, c042w, enumC21715119yf, fValueOf, z5);
                    } else if (c042y4.LLILZIL && (image = c042y4.LLILZ) != null) {
                        String str6 = c042y4.LLILLL;
                        boolean z6 = c042y4.LLIZLLLIL;
                        if (i6 == i5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c2172351A0b = new C2172411A0h(image, str6, z6, z4, c042y4.LLILZLL, Boolean.FALSE, c042y4.LLILLJJLI);
                    } else {
                        Image image3 = c042y4.LLILZ;
                        if (image3 != null) {
                            String str7 = c042y4.LLILLJJLI;
                            String str8 = c042y4.LLILLL;
                            boolean z7 = c042y4.LLIZLLLIL;
                            if (i6 == i5) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c2172351A0b = new C2172401A0g(image3, str7, str8, z7, z3, c042y4.LLILZLL);
                        } else {
                            String str9 = c042y4.LLILLJJLI;
                            String str10 = c042y4.LLILLL;
                            boolean z8 = c042y4.LLIZLLLIL;
                            if (i6 == i5) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c2172351A0b = new C2172351A0b(str9, str10, z8, z2, c042y4.LLILZLL, c042y4.LLJJ, c042y4.LLIZ);
                        }
                    }
                    g gVar = this.LL;
                    if (gVar != null) {
                        c2172351A0b.LIZIZ(gVar);
                    }
                    arrayList.add(c2172351A0b);
                    i6 = i7;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C2172551A0v c2172551A0v = this.LLJJJJ;
            C04FC c04fc = new C04FC(i5, this, z);
            c2172551A0v.getClass();
            C11DT.LIZ(c2172551A0v, arrayList, c04fc);
        }
        this.LLJJJJ.LLILZLL = this;
    }
}
