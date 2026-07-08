package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
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

/* JADX INFO: renamed from: X.0EJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362510EJd extends FrameLayout {
    public ConstraintLayout LL;
    public C19U1 LLILLJJLI;
    public boolean LLILLL;
    public C362490EJb LLILZ;
    public List<C357590E0f> LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;
    public final C01GW LLIZ;

    private final C362520EJe getOnTabSelectedUpdateTabViewListener() {
        return (C362520EJe) this.LLIZ.getValue();
    }

    public final C19U1 getMultiTabFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oq1);
            this.LLILLJJLI = (C19U1) callbackFindViewById;
        }
        return (C19U1) callbackFindViewById;
    }

    public final ConstraintLayout getTabContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wxb);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    private final C19U1 getTabLayout() {
        return getMultiTabFromXml();
    }

    public final Function1<Integer, Unit> getOnTabSelected() {
        return this.LLILZLL;
    }

    public static Map LIZIZ(Object obj) {
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

    private final void setupTabsView(List<C357590E0f> list) {
        boolean z;
        boolean z2;
        C19U1 tabLayout = getTabLayout();
        if (tabLayout == null) {
            return;
        }
        Iterator<C357590E0f> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            View viewTd = null;
            if (i >= 0) {
                C19U0 tabAt = tabLayout.getTabAt(i);
                if (tabAt != null) {
                    if (C293810BfP.LIZ()) {
                        C426750GoL.LJIIL(tabAt.LJIIIIZZ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
                    }
                    if (i < list.size()) {
                        Function2<? super C357590E0f, ? super ViewGroup, ? extends View> function2 = this.LLILZ.LJJIII;
                        if (function2 != null && (viewTd = function2.invoke(ListProtector.get(list, i), tabLayout)) != null) {
                            viewTd.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ.LJII))));
                        } else {
                            int i3 = this.LLILZ.LJIIJ;
                            viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.byq, tabLayout, false);
                            C357590E0f c357590E0f = (C357590E0f) ListProtector.get(list, i);
                            String str = c357590E0f.LIZ;
                            if (str != null && !a0.LJJJIL(str)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                String str2 = c357590E0f.LIZJ;
                                if (str2 != null && !a0.LJJJIL(str2)) {
                                    TextView textView = (TextView) viewTd.findViewById(R.id.wyg);
                                    if (textView != null) {
                                        C786410Ut5.LLIL(textView, 8);
                                    }
                                    TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.wxw);
                                    if (tuxIconView != null) {
                                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                                    }
                                    String str3 = c357590E0f.LIZJ;
                                    if (str3 != null) {
                                        C383660F2m.LIZ(getContext(), str3, (ImageView) viewTd.findViewById(R.id.wxw), new C370690Eg7(new C370680Eg6()));
                                    }
                                } else {
                                    TextView textView2 = (TextView) viewTd.findViewById(R.id.wyg);
                                    if (textView2 != null) {
                                        C786410Ut5.LLIL(textView2, 8);
                                    }
                                    TuxIconView tuxIconView2 = (TuxIconView) viewTd.findViewById(R.id.wxw);
                                    if (tuxIconView2 != null) {
                                        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                                    }
                                }
                            } else {
                                String str4 = c357590E0f.LIZJ;
                                if (str4 != null && !a0.LJJJIL(str4)) {
                                    TextView textView3 = (TextView) viewTd.findViewById(R.id.wyg);
                                    if (textView3 != null) {
                                        C786410Ut5.LLIL(textView3, 0);
                                        textView3.setText(c357590E0f.LIZ);
                                        textView3.setTextColor(i3);
                                    }
                                    TuxIconView tuxIconView3 = (TuxIconView) viewTd.findViewById(R.id.wxw);
                                    if (tuxIconView3 != null) {
                                        C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                                    }
                                    LIZLLL(viewTd, c357590E0f, i3, false);
                                } else {
                                    TuxIconView tuxIconView4 = (TuxIconView) viewTd.findViewById(R.id.wxw);
                                    if (tuxIconView4 != null) {
                                        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
                                    }
                                    TextView textView4 = (TextView) viewTd.findViewById(R.id.wyg);
                                    if (textView4 != null) {
                                        C786410Ut5.LLIL(textView4, 0);
                                        textView4.setText(c357590E0f.LIZ);
                                        textView4.setTextColor(i3);
                                    }
                                }
                            }
                            viewTd.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ.LJII))));
                        }
                    }
                    tabAt.LIZLLL(viewTd);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C19U1 tabLayout2 = getTabLayout();
        if (tabLayout2 != null) {
            tabLayout2.removeOnTabSelectedListener((InterfaceC1584740rLE) getOnTabSelectedUpdateTabViewListener());
            tabLayout2.addOnTabSelectedListener((InterfaceC1584740rLE) getOnTabSelectedUpdateTabViewListener());
        }
        C19U1 tabLayout3 = getTabLayout();
        if (tabLayout3 != null) {
            int selectedTabPosition = tabLayout3.getSelectedTabPosition();
            int tabCount = tabLayout3.getTabCount();
            for (int i4 = 0; i4 < tabCount; i4++) {
                C19U0 tabAt2 = tabLayout3.getTabAt(i4);
                if (tabAt2 != null) {
                    if (i4 == selectedTabPosition) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ(tabAt2, z);
                    if (i4 == selectedTabPosition) {
                        LJFF(tabAt2);
                    }
                }
            }
        }
    }

    public final void LIZJ(C357590E0f c357590E0f) {
        List<C357590E0f> list;
        C19U0 tabAt;
        C19U1 tabLayout = getTabLayout();
        if (tabLayout != null && (list = this.LLILZIL) != null) {
            Iterator<C357590E0f> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ, c357590E0f.LIZ)) {
                    if (i != -1 && i != tabLayout.getSelectedTabPosition() && (tabAt = tabLayout.getTabAt(i)) != null) {
                        tabAt.LIZIZ();
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public final void LJFF(C19U0 c19u0) {
        C357590E0f c357590E0f;
        TuxTextView tuxTextView;
        Object tag;
        View view;
        C1295960jpS c1295960jpS;
        Boolean bool;
        Boolean bool2;
        List<C357590E0f> list = this.LLILZIL;
        if (list != null && (c357590E0f = (C357590E0f) C13LP.LJJJLZIJ(c19u0.LJ, list)) != null) {
            String str = c357590E0f.LIZ;
            boolean zBooleanValue = false;
            if (str != null && !a0.LJJJIL(str)) {
                View view2 = c19u0.LJFF;
                Object tag2 = null;
                if (view2 != null) {
                    tuxTextView = (TuxTextView) view2.findViewById(R.id.wyg);
                } else {
                    tuxTextView = null;
                }
                int iIntValue = this.LLILZ.LJIIL;
                if (tuxTextView != null) {
                    tag = tuxTextView.getTag();
                } else {
                    tag = null;
                }
                Map mapLIZIZ = LIZIZ(tag);
                if (mapLIZIZ != null && (bool2 = (Boolean) mapLIZIZ.get("tag_key_change_select_tab_color")) != null && bool2.booleanValue()) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.d2, getContext());
                    iIntValue = numLIZJ != null ? numLIZJ.intValue() : -1;
                }
                if (tuxTextView != null) {
                    tag2 = tuxTextView.getTag();
                }
                Map mapLIZIZ2 = LIZIZ(tag2);
                if (mapLIZIZ2 != null && (bool = (Boolean) mapLIZIZ2.get("tag_key_custom_tab_lottie")) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                if (zBooleanValue && (view = c19u0.LJFF) != null && (c1295960jpS = (C1295960jpS) view.findViewById(R.id.asc)) != null) {
                    C786410Ut5.f5(c1295960jpS, 1.0f);
                }
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(iIntValue);
                    C786410Ut5.B5(tuxTextView, 1.0f);
                }
            }
            LIZLLL(c19u0.LJFF, c357590E0f, this.LLILZ.LJIIL, true);
        }
    }

    public final void setMultiTabFromXml(C19U1 c19u1) {
        this.LLILLJJLI = c19u1;
    }

    public final void setOnTabSelected(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setTabContainerFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public C362510EJd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = new C362490EJb(null, false, 0, null, 0, 0, 0, null, 0, null, 0, false, false, false, null, false, false, false, false, null, 1073741823);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.doj, this, true);
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 253));
    }

    public final void LIZ(C19U0 c19u0, boolean z) {
        C21546519Tz c21546519Tz;
        Drawable drawableLIZIZ;
        if (c19u0 != null && (c21546519Tz = c19u0.LJIIIIZZ) != null) {
            if (z) {
                drawableLIZIZ = C800330VaR.LIZIZ(getContext(), R.drawable.atb);
            } else {
                drawableLIZIZ = null;
            }
            c21546519Tz.setBackground(drawableLIZIZ);
        }
    }

    public final void LJ(ViewPager viewPager, List<C357590E0f> list) {
        this.LLILZIL = list;
        C19U1 tabLayout = getTabLayout();
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);
        }
        setupTabsView(list);
    }

    public static void LIZLLL(View view, C357590E0f c357590E0f, int i, boolean z) {
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
