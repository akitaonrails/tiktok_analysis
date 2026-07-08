package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.TabFontStrategyConfig;
import com.ss.android.ugc.aweme.experiment.TabTextFontStrategy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0rW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591440rW2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static int LIZIZ(C19EG c19eg) {
        HomeTabAbility homeTabAbility;
        List list;
        HomeTabAbility homeTabAbility2;
        List<InterfaceC1583870rJp> listL32;
        float fFloatValue;
        boolean z;
        EnumC1591490rW7 enumC1591490rW7;
        Object ability;
        HomeTabAbility homeTabAbility3;
        List<InterfaceC1583870rJp> listL322;
        boolean z2;
        Object ability2;
        List<TopTabProtocol> listB9;
        Object ability3;
        ?? r4 = 1;
        Object obj = null;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability3 = c0qsjLIZJ.getAbility(HomeTabAbility.class);
            } else {
                ability3 = null;
            }
            if (!(ability3 instanceof HomeTabAbility)) {
                ability3 = null;
            }
            homeTabAbility = (HomeTabAbility) ability3;
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeTabAbility.class, null);
        }
        if (homeTabAbility != null && (listB9 = homeTabAbility.b9()) != null) {
            Iterator<TopTabProtocol> it2 = listB9.iterator();
            while (it2.hasNext()) {
                InterfaceC1583070rIX interfaceC1583070rIX = it2.next().LJI().LIZ;
                if (interfaceC1583070rIX != null) {
                    interfaceC1583070rIX.getTextWidth();
                }
            }
        }
        C1591460rW4 c1591460rW4 = C1591460rW4.LIZ;
        c1591460rW4.getClass();
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
            return c19252910Tv.LIZLLL().LJIJI().LJJL().LJFF();
        }
        TabFontStrategyConfig tabFontStrategyConfig = (TabFontStrategyConfig) C1199604mg.LIZ.getValue();
        if (tabFontStrategyConfig == null || (list = tabFontStrategyConfig.strategies) == null) {
            list = C13BV.INSTANCE;
        }
        int i = 2;
        if (!list.isEmpty()) {
            TuxTextView tuxTextView = new TuxTextView(c19eg, null, 6, 0);
            if (C296200BjG.LIZ()) {
                C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
                if (c0qsjLIZJ2 != null) {
                    ability2 = c0qsjLIZJ2.getAbility(HomeTabAbility.class);
                } else {
                    ability2 = null;
                }
                if (ability2 instanceof HomeTabAbility) {
                    obj = ability2;
                }
                homeTabAbility3 = (HomeTabAbility) obj;
            } else {
                homeTabAbility3 = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeTabAbility.class, null);
            }
            if (homeTabAbility3 == null || (listL322 = homeTabAbility3.l32()) == null) {
                listL322 = C13BV.INSTANCE;
            }
            System.currentTimeMillis();
            if (C497820Jfg.LIZIZ(c19eg) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((TabTextFontStrategy) obj2).smallScreen) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            }
            int size = list.size() - 1;
            TabTextFontStrategy tabTextFontStrategy = (TabTextFontStrategy) C13LP.LJJLIIIJJI(list);
            float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(tabTextFontStrategy.paddingMin));
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) / i;
                TabTextFontStrategy tabTextFontStrategy2 = (TabTextFontStrategy) ListProtector.get(list, i3);
                float f = tabTextFontStrategy2.fontSize;
                Typeface typefaceLIZ = C1340540kzM.LIZ(r4, f, tabTextFontStrategy2.fontWidth, 4);
                Typeface typefaceLIZ2 = C1340540kzM.LIZ(false, f, tabTextFontStrategy2.fontWidth, 4);
                tuxTextView.setTextSize(r4, f);
                TextPaint paint = tuxTextView.getPaint();
                double dMeasureText = 0.0d;
                for (InterfaceC1583870rJp interfaceC1583870rJp : listL322) {
                    if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "For You")) {
                        paint.setTypeface(typefaceLIZ);
                    } else {
                        paint.setTypeface(typefaceLIZ2);
                    }
                    dMeasureText += (double) paint.measureText(interfaceC1583870rJp.LIZLLL());
                }
                double dLIZIZ = ((double) C418440Gaw.LIZIZ(Integer.valueOf(tabTextFontStrategy2.paddingMin))) * ((double) listL322.size());
                double dLIZIZ2 = ((double) C418440Gaw.LIZIZ(Integer.valueOf(tabTextFontStrategy2.paddingMax))) * ((double) listL322.size());
                double dLJIIJ = ((double) ((C12ES.LJIIJ(c19eg) - C1591460rW4.LIZJ(c1591460rW4)) - C1591460rW4.LIZLLL(c1591460rW4))) - dMeasureText;
                if (dLJIIJ >= dLIZIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Pair pair = new Pair(Boolean.valueOf(z2), Double.valueOf(C13LZ.LIZJ(dLJIIJ, dLIZIZ, dLIZIZ2) / ((double) listL322.size())));
                boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                double dDoubleValue = ((Number) pair.getSecond()).doubleValue();
                if (zBooleanValue) {
                    fLIZIZ = (float) dDoubleValue;
                    size = i3 - 1;
                    tabTextFontStrategy = tabTextFontStrategy2;
                } else {
                    i2 = i3 + 1;
                }
                r4 = 1;
                i = 2;
            }
            C1591460rW4.LJIIIZ = new C1591800rWc(tabTextFontStrategy, fLIZIZ);
            return tabTextFontStrategy.fontSize;
        }
        TuxTextView tuxTextView2 = new TuxTextView(c19eg, null, 6, 0);
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ3 = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            if (c0qsjLIZJ3 != null) {
                ability = c0qsjLIZJ3.getAbility(HomeTabAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeTabAbility) {
                obj = ability;
            }
            homeTabAbility2 = (HomeTabAbility) obj;
        } else {
            homeTabAbility2 = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeTabAbility.class, null);
        }
        if (homeTabAbility2 == null || (listL32 = homeTabAbility2.l32()) == null) {
            listL32 = C13BV.INSTANCE;
        }
        System.currentTimeMillis();
        ?? r3 = 0;
        ?? r2 = 1;
        Float[] fArr = {Float.valueOf(17.0f), Float.valueOf(15.0f)};
        int i4 = 0;
        while (true) {
            fFloatValue = fArr[i4].floatValue();
            tuxTextView2.setTextSize(r2, fFloatValue);
            TextPaint paint2 = tuxTextView2.getPaint();
            Typeface typefaceLIZ3 = C1340540kzM.LIZ(r2, fFloatValue, r3, 12);
            Typeface typefaceLIZ4 = C1340540kzM.LIZ(r3, fFloatValue, r3, 12);
            double dLIZIZ3 = 0.0d;
            for (InterfaceC1583870rJp interfaceC1583870rJp2 : listL32) {
                if (Intrinsics.LJFF(interfaceC1583870rJp2.tag(), "For You")) {
                    paint2.setTypeface(typefaceLIZ3);
                } else {
                    paint2.setTypeface(typefaceLIZ4);
                }
                double dMeasureText2 = paint2.measureText(interfaceC1583870rJp2.LIZLLL());
                C1591460rW4.LIZ.getClass();
                dLIZIZ3 += dMeasureText2 + ((double) (C418440Gaw.LIZIZ(Float.valueOf(C1591460rW4.LJFF(fFloatValue))) * 2));
            }
            float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(C1591460rW4.LJFF(fFloatValue)));
            if (((Number) C0AEX.LIZ.getValue()).intValue() == 0) {
                fLIZIZ2 = 0.0f;
            }
            if (dLIZIZ3 <= ((C12ES.LJIIJ(c19eg) - C1591460rW4.LIZJ(c1591460rW4)) - C1591460rW4.LIZLLL(c1591460rW4)) + fLIZIZ2) {
                z = true;
                break;
            }
            z = false;
            i4++;
            r3 = 0;
            r2 = 1;
            if (i4 >= 2) {
                break;
            }
        }
        Pair pair2 = new Pair(Float.valueOf(fFloatValue), Boolean.valueOf(z));
        float fFloatValue2 = ((Number) pair2.getFirst()).floatValue();
        boolean zBooleanValue2 = ((Boolean) pair2.getSecond()).booleanValue();
        EnumC1591490rW7.Companion.getClass();
        if (fFloatValue2 != 17.0f && fFloatValue2 == 15.0f) {
            if (zBooleanValue2) {
                enumC1591490rW7 = EnumC1591490rW7.SMALL_FONT;
            } else {
                enumC1591490rW7 = EnumC1591490rW7.SMALL_NARROW_FONT;
            }
        } else {
            enumC1591490rW7 = EnumC1591490rW7.BIG_FONT;
        }
        C1591460rW4.LJIIIIZZ = enumC1591490rW7;
        return (int) fFloatValue2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C19EG r6) {
        /*
            X.0CXE r0 = X.C0CXE.LIZ
            r0.getClass()
            boolean r0 = X.C0CXE.LIZ()
            r5 = 1
            if (r0 != 0) goto La4
            X.0CXC r0 = X.C0CXC.LIZ
            r0.getClass()
            boolean r0 = X.C0CXC.LIZIZ()
            if (r0 != 0) goto La4
            boolean r0 = X.C296200BjG.LIZ()
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L97
            X.0Q7z r2 = X.C1558360qeg.LJI(r6, r4)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r3] = r0
            X.0QSJ r1 = X.C687700QyG.LIZJ(r2, r1)
            if (r1 == 0) goto L95
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r0 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            java.lang.Object r1 = r1.getAbility(r0)
        L35:
            boolean r0 = r1 instanceof com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
            if (r0 != 0) goto L3a
            r1 = r4
        L3a:
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
        L3c:
            if (r1 == 0) goto L92
            kotlin.Pair r4 = r1.pI()
            if (r4 == 0) goto L92
            java.lang.Object r0 = r4.getSecond()
            java.util.List r0 = (java.util.List) r0
            int r6 = r0.size()
            if (r6 > 0) goto L51
            r6 = 1
        L51:
            java.lang.Object r0 = r4.getFirst()
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            if (r2 > 0) goto L5e
            r2 = 1
        L5e:
            X.0rW4 r1 = X.C1591460rW4.LIZ
            if (r4 == 0) goto L6a
            java.lang.Object r0 = r4.getFirst()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L6c
        L6a:
            X.13BV r0 = X.C13BV.INSTANCE
        L6c:
            int r0 = X.C1580110rDl.LIZ(r0, r5)
            r1.getClass()
            X.C1591460rW4.LJI = r0
            if (r4 == 0) goto L7f
            java.lang.Object r0 = r4.getSecond()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L81
        L7f:
            X.13BV r0 = X.C13BV.INSTANCE
        L81:
            int r0 = X.C1580110rDl.LIZ(r0, r3)
            X.C1591460rW4.LJII = r0
            r5 = r2
        L88:
            X.0rW4 r0 = X.C1591460rW4.LIZ
            r0.getClass()
            X.C1591460rW4.LJFF = r6
            X.C1591460rW4.LJ = r5
            return
        L92:
            r6 = 1
            r2 = 1
            goto L5e
        L95:
            r1 = r4
            goto L35
        L97:
            X.0Q7z r1 = X.C1558360qeg.LJI(r6, r4)
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r0 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r4)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            goto L3c
        La4:
            com.ss.android.ugc.aweme.experiment.Entrance r0 = X.C1585030rLh.LJII()
            if (r0 == 0) goto Lbd
            int r6 = r0.showLimit
            if (r6 > 0) goto Laf
            r6 = 1
        Laf:
            com.ss.android.ugc.aweme.experiment.Entrance r0 = X.C1585030rLh.LJ()
            if (r0 == 0) goto Lbb
            int r0 = r0.showLimit
            if (r0 <= 0) goto L88
        Lb9:
            r5 = r0
            goto L88
        Lbb:
            r0 = 1
            goto Lb9
        Lbd:
            r6 = 1
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1591440rW2.LIZJ(X.19EG):void");
    }

    public static String LIZLLL(String str) {
        String str2 = MainTabStrip.LLL.get(str);
        if (str2 == null) {
            C1584320rKY.LIZ.getClass();
            return C1584320rKY.LJI(str);
        }
        return str2;
    }

    public static void LIZ(final C1592450rXf c1592450rXf, InterfaceC1583870rJp interfaceC1583870rJp, HomeTabViewModel homeTabViewModel) {
        String key;
        ITabIconService iTabIconService;
        C592330NLb c592330NLbLIZJ;
        C1591980rWu c1591980rWuLJIIJJI;
        Context context;
        Integer numLIZJ;
        TextView mCustomTextView$homepage_common_release;
        C0S4J c0s4j = MainTabStrip.LLJZIJLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addTabToHost, ");
        sbLIZ.append(interfaceC1583870rJp.tag());
        c0s4j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        View viewLJI = interfaceC1583870rJp.LJI(new InterfaceC1583080rIY() { // from class: X.0rWe
            @Override // X.InterfaceC1583080rIY
            public final View LIZ(C1584440rKk c1584440rKk) {
                return new C1591830rWf(c1584440rKk);
            }
        });
        C993790by5.LIZ(viewLJI, EnumC993780by4.TOP_TAB_VIEW);
        viewLJI.setContentDescription(interfaceC1583870rJp.LIZLLL());
        q0.LJIJ(viewLJI, new C20094213jo() { // from class: X.0rWF
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription(C20642515q3.LJI(2131823349));
            }
        });
        C1581510rG1.LJI(viewLJI.findViewById(R.id.tv_tab_dot));
        C1581510rG1.LJII(viewLJI.findViewById(R.id.tv_tab_dot_count));
        C1591980rWu c1591980rWuLJIIZILJ = c1592450rXf.LJIIZILJ(viewLJI, interfaceC1583870rJp);
        C1592080rX4 c1592080rX4 = c1591980rWuLJIIZILJ.LIZLLL;
        if (c1592080rX4 != null) {
            C2271391DvN.LIZ(c1592080rX4, (C1A5L) C2271381DvM.LJJIZ.getValue());
        }
        int size = c1592450rXf.LL.size();
        if (c1591980rWuLJIIZILJ.LIZJ == c1592450rXf) {
            c1591980rWuLJIIZILJ.LIZ = size;
            ListProtector.add(c1592450rXf.LL, size, c1591980rWuLJIIZILJ);
            int size2 = c1592450rXf.LL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C1591980rWu) ListProtector.get(c1592450rXf.LL, size)).LIZ = size;
                }
            }
            c1592450rXf.LIZLLL(c1591980rWuLJIIZILJ);
            if (C1591480rW6.LJ() && (context = c1592450rXf.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bp, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                C1592080rX4 c1592080rX42 = c1591980rWuLJIIZILJ.LIZLLL;
                if (c1592080rX42 != null && (mCustomTextView$homepage_common_release = c1592080rX42.getMCustomTextView$homepage_common_release()) != null) {
                    C844470XAv.LIZ.getClass();
                    mCustomTextView$homepage_common_release.setShadowLayer(C12ES.LIZJ(0.3f, C844470XAv.LIZ()), 0.0f, C12ES.LIZJ(0.6f, C844470XAv.LIZ()), iIntValue);
                }
            }
            final C1592080rX4 c1592080rX43 = c1591980rWuLJIIZILJ.LIZLLL;
            C1592470rXh c1592470rXh = c1592450rXf.LLILLL;
            int i = c1591980rWuLJIIZILJ.LIZ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            c1592450rXf.LJJIII(layoutParams);
            c1592470rXh.addView(c1592080rX43, i, layoutParams);
            HandlerHook.viewPost(c1592450rXf.LLILLL, new Runnable() { // from class: X.0rLV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BorderTabLayout@8324.addTabView$1");
                    try {
                        c1592450rXf.requestLayout();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BorderTabLayout@8324.addTabView$1");
                }
            });
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "main_tab_accessibility_label_enable", true, false) && c1592080rX43 != null) {
                final int i2 = c1591980rWuLJIIZILJ.LIZ;
                q0.LJIJ(c1592080rX43, new C20094213jo() { // from class: X.0rXM
                    @Override // X.C20094213jo
                    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        CharSequence text;
                        CharSequence text2;
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        TextView mCustomTextView$homepage_common_release2 = c1592080rX43.getMCustomTextView$homepage_common_release();
                        if (mCustomTextView$homepage_common_release2 != null && (text = mCustomTextView$homepage_common_release2.getText()) != null && text.length() > 0) {
                            TextView mCustomTextView$homepage_common_release3 = c1592080rX43.getMCustomTextView$homepage_common_release();
                            if (mCustomTextView$homepage_common_release3 != null) {
                                text2 = mCustomTextView$homepage_common_release3.getText();
                            } else {
                                text2 = null;
                            }
                            accessibilityNodeInfoCompat.setContentDescription(text2);
                        }
                        accessibilityNodeInfoCompat.setRoleDescription(C20642515q3.LJI(2131823349));
                        accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZIZ(0, i2, accessibilityNodeInfoCompat.isHeading()));
                    }
                });
            }
            homeTabViewModel.LLILLJJLI.put(interfaceC1583870rJp.tag(), interfaceC1583870rJp);
            Iterator<Map.Entry<InterfaceC1583870rJp, View>> it2 = homeTabViewModel.LLILLL.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1583870rJp key2 = it2.next().getKey();
                if (key2 != null && Intrinsics.LJFF(interfaceC1583870rJp.tag(), key2.tag())) {
                    it2.remove();
                    break;
                }
            }
            homeTabViewModel.LLILLL.put(interfaceC1583870rJp, viewLJI);
            ITabIconService iTabIconService2 = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
            if (iTabIconService2 != null && iTabIconService2.LJII()) {
                String strTag = interfaceC1583870rJp.tag();
                C1584320rKY.LIZ.getClass();
                EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(strTag);
                if (enumC1584360rKcLJIIIIZZ != null && (key = enumC1584360rKcLJIIIIZZ.getKey()) != null && (iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null)) != null && (c592330NLbLIZJ = iTabIconService.LIZJ(EnumC592410NLj.TOP, key, strTag)) != null && (c1591980rWuLJIIJJI = c1592450rXf.LJIIJJI(strTag)) != null) {
                    c1591980rWuLJIIJJI.LJIIIZ = c592330NLbLIZJ;
                    c1591980rWuLJIIJJI.LIZJ(new AwS233S0300000_24(new C013C(), c1592450rXf, c592330NLbLIZJ, 4));
                    return;
                }
                return;
            }
            interfaceC1583870rJp.LJIILJJIL(new C1591640rWM(c1592450rXf, interfaceC1583870rJp), new C1591550rWD(c1592450rXf, interfaceC1583870rJp));
            return;
        }
        "Tab belongs to a different TabLayout.".toString();
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }
}
