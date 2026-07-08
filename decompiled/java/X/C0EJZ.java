package X;

import Y.ACListenerS140S0100000_5;
import Y.AsS32S0100000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJZ extends FrameLayout {
    public ConstraintLayout LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public C19U1 LLILZIL;
    public TuxIconView LLILZLL;
    public LinearLayout LLIZ;
    public boolean LLIZLLLIL;
    public C362490EJb LLJ;
    public List<C357590E0f> LLJI;
    public C0EDF LLJIJIL;
    public Function1<? super Integer, Unit> LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    public C0EJZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final AsS32S0100000_5 getOnItemSelectedLinkTabLayoutListener() {
        return (AsS32S0100000_5) this.LLJJIII.getValue();
    }

    private final C0EEU getOnTabSelectedLinkRecyclerViewListener() {
        return (C0EEU) this.LLJJIJI.getValue();
    }

    private final C362480EJa getOnTabSelectedUpdateTabViewListener() {
        return (C362480EJa) this.LLJJIJIIJIL.getValue();
    }

    public final LinearLayout getExtensionAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hic);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C19U1 getMultiTabFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oq1);
            this.LLILZIL = (C19U1) callbackFindViewById;
        }
        return (C19U1) callbackFindViewById;
    }

    public final View getTabBottomDivideLineFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.wx_);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getTabContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wxb);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final View getTabDividerFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.wxh);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final View getTabFadeEndFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.wxl);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getTabResetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wyt);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void LJIIIIZZ() {
        C19U0 tabAt;
        C19U1 multiTabFromXml = getMultiTabFromXml();
        int selectedTabPosition = multiTabFromXml != null ? multiTabFromXml.getSelectedTabPosition() : 0;
        C19U1 multiTabFromXml2 = getMultiTabFromXml();
        if (multiTabFromXml2 == null || (tabAt = multiTabFromXml2.getTabAt(selectedTabPosition)) == null) {
            return;
        }
        LJIIIZ(tabAt);
    }

    public final int getPositionOffset() {
        return getLayoutDirection() == 1 ? 4 : 0;
    }

    public final Function1<Integer, Unit> getOnTabSelected() {
        return this.LLJILJIL;
    }

    public static boolean LIZIZ(Object obj) {
        Boolean bool;
        Map mapLIZLLL = LIZLLL(obj);
        if (mapLIZLLL == null || !mapLIZLLL.containsKey("tag_key_change_select_tab_color") || (bool = (Boolean) mapLIZLLL.get("tag_key_change_select_tab_color")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LIZJ(Object obj) {
        Boolean bool;
        Map mapLIZLLL = LIZLLL(obj);
        if (mapLIZLLL == null || !mapLIZLLL.containsKey("tag_key_custom_tab_lottie") || (bool = (Boolean) mapLIZLLL.get("tag_key_custom_tab_lottie")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static Map LIZLLL(Object obj) {
        Map map;
        String str;
        Pair pair;
        boolean zBooleanValue;
        Map mapLJIILLIIL = null;
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof String) {
                        str = (String) key;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        if (value instanceof Boolean) {
                            zBooleanValue = ((Boolean) value).booleanValue();
                        } else if (value instanceof String) {
                            zBooleanValue = Boolean.parseBoolean((String) value);
                        } else {
                            if (value instanceof Number) {
                                if (((Number) value).intValue() != 0) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = false;
                                }
                            }
                            pair = null;
                        }
                        pair = new Pair(str, Boolean.valueOf(zBooleanValue));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
                return mapLJIILLIIL;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return mapLJIILLIIL;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    private final void setupTabsView(List<C357590E0f> list) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Iterator<C357590E0f> it2 = list.iterator();
        ?? r6 = 0;
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            View viewTd = null;
            if (i >= 0) {
                C19U0 tabAt = getMultiTabFromXml().getTabAt(i);
                if (tabAt == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = tabAt.LJIIIIZZ.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginEnd(C0EGK.LIZ(this.LLJ.LJFF));
                }
                if (C293810BfP.LIZ() && !C357780E0y.LIZ()) {
                    C426750GoL.LJIIL(tabAt.LJIIIIZZ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
                }
                C19U1 multiTabFromXml = getMultiTabFromXml();
                if (i < list.size()) {
                    Function2<? super C357590E0f, ? super ViewGroup, ? extends View> function2 = this.LLJ.LJJIII;
                    if (function2 != null && (viewTd = function2.invoke(ListProtector.get(list, i), multiTabFromXml)) != null) {
                        viewTd.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.LJII))));
                    } else {
                        int i3 = this.LLJ.LJIIJ;
                        if (C357780E0y.LIZ()) {
                            viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.byr, multiTabFromXml, r6);
                        } else {
                            viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.byq, multiTabFromXml, r6);
                        }
                        C357590E0f c357590E0f = (C357590E0f) ListProtector.get(list, i);
                        String str = c357590E0f.LIZ;
                        if (str != null && !a0.LJJJIL(str)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            String str2 = c357590E0f.LIZJ;
                            if (str2 != null && !a0.LJJJIL(str2)) {
                                C786410Ut5.LLIL((TextView) viewTd.findViewById(R.id.wyg), 8);
                                C786410Ut5.LLLLLLZZ((TuxIconView) viewTd.findViewById(R.id.wxw), r6);
                                String str3 = c357590E0f.LIZJ;
                                if (str3 != null) {
                                    C383660F2m.LIZ(getContext(), str3, (ImageView) viewTd.findViewById(R.id.wxw), new C370690Eg7(new C370680Eg6()));
                                }
                            } else {
                                C786410Ut5.LLIL((TextView) viewTd.findViewById(R.id.wyg), 8);
                                C786410Ut5.LLLLLLZZ((TuxIconView) viewTd.findViewById(R.id.wxw), 8);
                            }
                        } else {
                            String str4 = c357590E0f.LIZJ;
                            if (str4 != null && !a0.LJJJIL(str4)) {
                                C786410Ut5.LLIL((TextView) viewTd.findViewById(R.id.wyg), 0);
                                C786410Ut5.LLLLLLZZ((TuxIconView) viewTd.findViewById(R.id.wxw), 0);
                                ((TextView) viewTd.findViewById(R.id.wyg)).setText(c357590E0f.LIZ);
                                ((TextView) viewTd.findViewById(R.id.wyg)).setTextColor(i3);
                                String str5 = c357590E0f.LIZJ;
                                if (str5 != null) {
                                    C383660F2m.LIZ(getContext(), str5, (ImageView) viewTd.findViewById(R.id.wxw), new C370690Eg7(new C370680Eg6()));
                                }
                                ((TextView) viewTd.findViewById(R.id.wyg)).setText(c357590E0f.LIZ);
                            } else {
                                C786410Ut5.LLLLLLZZ((TuxIconView) viewTd.findViewById(R.id.wxw), 8);
                                C786410Ut5.LLIL((TextView) viewTd.findViewById(R.id.wyg), 0);
                                ((TextView) viewTd.findViewById(R.id.wyg)).setText(c357590E0f.LIZ);
                                ((TextView) viewTd.findViewById(R.id.wyg)).setTextColor(i3);
                            }
                        }
                        if (i == getMultiTabFromXml().getSelectedTabPosition()) {
                            z2 = true;
                            i3 = this.LLJ.LJIIL;
                        } else {
                            z2 = false;
                        }
                        LJFF(viewTd, c357590E0f, i3, z2);
                        viewTd.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.LJII))));
                        Integer num = this.LLJ.LJIIJJI;
                        if (num != null) {
                            ((TuxTextView) viewTd.findViewById(R.id.wyg)).setTuxFont(num.intValue());
                        }
                    }
                }
                tabAt.LIZLLL(viewTd);
                i = i2;
                r6 = 0;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        getMultiTabFromXml().removeOnTabSelectedListener((InterfaceC1584740rLE) getOnTabSelectedUpdateTabViewListener());
        getMultiTabFromXml().addOnTabSelectedListener((InterfaceC1584740rLE) getOnTabSelectedUpdateTabViewListener());
        LJIIIIZZ();
    }

    public final void LIZ(C362490EJb c362490EJb) {
        int iLIZ;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        GradientDrawable.Orientation orientation;
        this.LLJ = c362490EJb;
        if (!this.LLIZLLLIL) {
            ViewGroup.LayoutParams layoutParams = getTabContainerFromXml().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.LJI)));
            }
            C362490EJb c362490EJb2 = this.LLJ;
            Integer num = c362490EJb2.LJIJ;
            if (c362490EJb2.LJIIZILJ && num != null) {
                C786410Ut5.LJLLLLLL(0, getTabFadeEndFromXml());
                Integer numLIZJ = C1308910kAL.LIZJ(num.intValue(), getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    if (C423170GiZ.LIZ(getContext())) {
                        orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    } else {
                        orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    }
                    getTabFadeEndFromXml().setBackground(new GradientDrawable(orientation, new int[]{iIntValue, 0}));
                }
            }
            if (c362490EJb.LJIILL) {
                C786410Ut5.LJLLLLLL(0, getTabBottomDivideLineFromXml());
            }
            if (c362490EJb.LJIILLIIL) {
                C786410Ut5.LJLLLLLL(0, getTabDividerFromXml());
                if (C293810BfP.LIZ()) {
                    C426750GoL.LJIIIZ(getTabDividerFromXml(), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, false, 27);
                }
            }
            Integer num2 = c362490EJb.LJIIIZ;
            if (num2 != null) {
                iLIZ = num2.intValue();
            } else {
                iLIZ = C446980Hfs.LIZ(getContext(), c362490EJb.LJIIIIZZ);
            }
            C19U1 multiTabFromXml = getMultiTabFromXml();
            if (c362490EJb.LJIL) {
                multiTabFromXml.setSelectedTabIndicator((Drawable) null);
            } else {
                Integer num3 = c362490EJb.LJIILIIL;
                if (num3 != null) {
                    multiTabFromXml.setSelectedTabIndicator(num3.intValue());
                }
                multiTabFromXml.setSelectedTabIndicatorColor(iLIZ);
            }
            TuxIconView tabResetFromXml = getTabResetFromXml();
            if (C357780E0y.LIZ()) {
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                ViewGroup.LayoutParams layoutParams2 = tabResetFromXml.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i = marginLayoutParams2.topMargin;
                } else {
                    i = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                ViewGroup.LayoutParams layoutParams3 = tabResetFromXml.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i2 = marginLayoutParams.bottomMargin;
                } else {
                    i2 = 0;
                }
                C426750GoL.LJIIIZ(tabResetFromXml, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i2), false, 16);
            }
            tabResetFromXml.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c362490EJb.LIZJ)));
            if (!c362490EJb.LIZIZ) {
                C786410Ut5.LLLLLLZZ(tabResetFromXml, 8);
            }
            C786410Ut5.a9(tabResetFromXml, new ACListenerS140S0100000_5(c362490EJb, 105));
            getMultiTabFromXml().setTabRippleColor(null);
            C426750GoL.LJIIIZ(getMultiTabFromXml(), 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.LJ)))), 0, false, 16);
            if (c362490EJb.LJIJI) {
                C786410Ut5.LJZL(0, getExtensionAreaFromXml());
                getExtensionAreaFromXml().addView(c362490EJb.LJIJJ);
                C786410Ut5.R7(getExtensionAreaFromXml(), new ACListenerS140S0100000_5(c362490EJb, 106));
            }
            this.LLIZLLLIL = true;
        }
    }

    public final void LJIIIZ(C19U0 c19u0) {
        C357590E0f c357590E0f;
        TuxTextView tuxTextView;
        Object tag;
        View view;
        C1295960jpS c1295960jpS;
        List<C357590E0f> list = this.LLJI;
        if (list != null && (c357590E0f = (C357590E0f) C13LP.LJJJLZIJ(c19u0.LJ, list)) != null) {
            String str = c357590E0f.LIZ;
            if (str != null && !a0.LJJJIL(str)) {
                View view2 = c19u0.LJFF;
                Object tag2 = null;
                if (view2 != null) {
                    tuxTextView = (TuxTextView) view2.findViewById(R.id.wyg);
                } else {
                    tuxTextView = null;
                }
                int iIntValue = this.LLJ.LJIIL;
                if (tuxTextView != null) {
                    tag = tuxTextView.getTag();
                } else {
                    tag = null;
                }
                if (LIZIZ(tag)) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.d2, getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -1;
                    }
                }
                if (tuxTextView != null) {
                    tag2 = tuxTextView.getTag();
                }
                if (LIZJ(tag2) && (view = c19u0.LJFF) != null && (c1295960jpS = (C1295960jpS) view.findViewById(R.id.asc)) != null) {
                    C786410Ut5.f5(c1295960jpS, 1.0f);
                }
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(iIntValue);
                    C786410Ut5.B5(tuxTextView, 1.0f);
                }
            }
            LJFF(c19u0.LJFF, c357590E0f, this.LLJ.LJIIL, true);
        }
    }

    public final void setExtensionAreaFromXml(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void setMultiTabFromXml(C19U1 c19u1) {
        this.LLILZIL = c19u1;
    }

    public final void setOnTabSelected(Function1<? super Integer, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public final void setTabBottomDivideLineFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setTabContainerFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public final void setTabDividerFromXml(View view) {
        this.LLILZ = view;
    }

    public final void setTabFadeEndFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setTabResetFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final void LJ(String str, boolean z) {
        int i;
        C19U0 tabAt;
        List<C357590E0f> list = this.LLJI;
        int selectedTabPosition = 0;
        if (list != null) {
            Iterator<C357590E0f> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZIZ, str)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        C19U1 multiTabFromXml = getMultiTabFromXml();
        if (multiTabFromXml != null) {
            selectedTabPosition = multiTabFromXml.getSelectedTabPosition();
        }
        C19U1 multiTabFromXml2 = getMultiTabFromXml();
        if (multiTabFromXml2 != null && (tabAt = multiTabFromXml2.getTabAt(i)) != null) {
            if (i == selectedTabPosition) {
                LJIIIZ(tabAt);
                return;
            }
            this.LLJJ = true;
            this.LLJJI = z;
            C19U1 multiTabFromXml3 = getMultiTabFromXml();
            if (multiTabFromXml3 != null) {
                multiTabFromXml3.selectTab(tabAt);
            }
        }
    }

    public final void LJII(C527320KmA c527320KmA, List list) {
        this.LLJI = list;
        getMultiTabFromXml().setupWithViewPager(c527320KmA);
        setupTabsView(list);
    }

    public C0EJZ(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJ = new C362490EJb(null, false, 0, null, 0, 0, 0, null, 0, null, 0, false, false, false, null, false, false, false, false, null, 1073741823);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bys, this, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 960));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 961));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 962));
    }

    public final void LJI(C0EDF c0edf, List<C357590E0f> list, Boolean bool) {
        RecyclerView recyclerView;
        this.LLJIJIL = c0edf;
        this.LLJI = list;
        getMultiTabFromXml().removeAllTabs();
        Iterator<C357590E0f> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            getMultiTabFromXml().addTab(getMultiTabFromXml().newTab());
        }
        setupTabsView(list);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            getMultiTabFromXml().removeOnTabSelectedListener((InterfaceC1584740rLE) getOnTabSelectedLinkRecyclerViewListener());
            getMultiTabFromXml().addOnTabSelectedListener((InterfaceC1584740rLE) getOnTabSelectedLinkRecyclerViewListener());
            C0EDF c0edf2 = this.LLJIJIL;
            if (c0edf2 != null && (recyclerView = c0edf2.getRecyclerView()) != null) {
                recyclerView.removeOnScrollListener(getOnItemSelectedLinkTabLayoutListener());
                recyclerView.addOnScrollListener(getOnItemSelectedLinkTabLayoutListener());
            }
        }
    }

    public static void LJFF(View view, C357590E0f c357590E0f, int i, boolean z) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        Integer num;
        String str = c357590E0f.LIZJ;
        int iIntValue = 0;
        if (str != null && str.length() > 0) {
            return;
        }
        if (c357590E0f.LIZLLL != null && c357590E0f.LJ != null) {
            if (view != null && (tuxIconView2 = (TuxIconView) view.findViewById(R.id.wxw)) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (z) {
                    num = c357590E0f.LJ;
                } else {
                    num = c357590E0f.LIZLLL;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                }
                c419910GdJ.LIZ = iIntValue;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                c419910GdJ.LIZLLL = Integer.valueOf(i);
                tuxIconView2.setTuxIcon(c419910GdJ);
                return;
            }
            return;
        }
        if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.wxw)) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }
}
