package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0wa1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment$onViewCreated$5$1$2$2", f = "CreatorRankingPageDialogFragment.kt", l = {}, m = "invokeSuspend")
public final class C1786110wa1 extends C09AX implements Function2<C443120HZe<? extends C861610Xr5, ? extends InterfaceC1785620wZE, ? extends C1785480wZ0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorRankingPageDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786110wa1(CreatorRankingPageDialogFragment creatorRankingPageDialogFragment, InterfaceC1364105Vn<? super C1786110wa1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageDialogFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1786110wa1 c1786110wa1 = new C1786110wa1(this.LLILLJJLI, interfaceC1364105Vn);
        c1786110wa1.LL = obj;
        return c1786110wa1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int currentItem;
        int i;
        int i2;
        C19ME c19me;
        String strLJIJI;
        int i3;
        TuxTextView tuxTextView;
        int i4;
        int i5;
        int i6;
        int i7;
        C1C7U.LIZ("CreatorRankingPageDialogFragment@c771.onViewCreated$5$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C443120HZe c443120HZe = (C443120HZe) this.LL;
        C861610Xr5 c861610Xr5 = (C861610Xr5) c443120HZe.getFirst();
        InterfaceC1785620wZE interfaceC1785620wZE = (InterfaceC1785620wZE) c443120HZe.getSecond();
        C1785480wZ0 c1785480wZ0 = (C1785480wZ0) c443120HZe.getThird();
        CreatorRankingPageDialogFragment creatorRankingPageDialogFragment = this.LLILLJJLI;
        creatorRankingPageDialogFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderWholeFallback hasTopBarData=");
        sbLIZ.append(c861610Xr5.LIZ);
        sbLIZ.append(" wholePage=");
        sbLIZ.append(interfaceC1785620wZE);
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
        int i8 = 0;
        int i9 = 8;
        if (!c861610Xr5.LIZ) {
            C1846060y8i c1846060y8i = creatorRankingPageDialogFragment.LLILZLL;
            if (c1846060y8i != null) {
                C786410Ut5.LJLLLLLL(8, c1846060y8i);
            }
            View view = creatorRankingPageDialogFragment.LLIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            TuxTextView tuxTextView2 = creatorRankingPageDialogFragment.LLIZLLLIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView2);
            }
            View view2 = creatorRankingPageDialogFragment.LLJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            View view3 = creatorRankingPageDialogFragment.LLJILJIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            LiveIconView liveIconView = creatorRankingPageDialogFragment.LLJILJILJ;
            if (liveIconView != null) {
                C786410Ut5.LJLLLLLL(8, liveIconView);
            }
            LiveIconView liveIconView2 = creatorRankingPageDialogFragment.LLJILLL;
            if (liveIconView2 != null) {
                C786410Ut5.LJLLLLLL(8, liveIconView2);
            }
            View view4 = creatorRankingPageDialogFragment.LLJJ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            LiveIconView liveIconView3 = creatorRankingPageDialogFragment.LLJJI;
            if (liveIconView3 != null) {
                C786410Ut5.LJLLLLLL(8, liveIconView3);
            }
            TuxTextView tuxTextView3 = creatorRankingPageDialogFragment.LLJJIII;
            if (tuxTextView3 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView3);
            }
            View view5 = creatorRankingPageDialogFragment.LLJJIJIIJIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            C20632315oP c20632315oP = creatorRankingPageDialogFragment.LLJJIJI;
            if (c20632315oP != null) {
                C786410Ut5.LJLLLLLL(8, c20632315oP);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("renderWholeStatus state=");
            sbLIZ2.append(interfaceC1785620wZE);
            C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", C2188811AlT.LIZIZ(sbLIZ2));
            C1749280vcc c1749280vcc = creatorRankingPageDialogFragment.LLJJIJIL;
            if (c1749280vcc != null) {
                if (Intrinsics.LJFF(interfaceC1785620wZE, C1785730wZP.LIZ)) {
                    C1786390waT.LIZ.getClass();
                    View viewFindViewWithTag = c1749280vcc.findViewWithTag("creator_ranking_fallback_loading");
                    if (viewFindViewWithTag != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewWithTag);
                    }
                    c1749280vcc.LLJJJJLIIL = C618310OMz.LIZ;
                    C786410Ut5.LJLLLLLL(8, c1749280vcc);
                } else if (interfaceC1785620wZE instanceof C1785920wZi) {
                    C1786390waT c1786390waT = C1786390waT.LIZ;
                    Context contextRequireContext = creatorRankingPageDialogFragment.requireContext();
                    C1785870wZd c1785870wZd = ((C1785920wZi) interfaceC1785620wZE).LIZ;
                    AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(creatorRankingPageDialogFragment, 642);
                    c1786390waT.getClass();
                    C1786390waT.LIZIZ(c1749280vcc, contextRequireContext, c1785870wZd, awS606S0100000_27);
                }
            }
        } else {
            C1749280vcc c1749280vcc2 = creatorRankingPageDialogFragment.LLJJIJIL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LJLLLLLL(8, c1749280vcc2);
            }
            C20632315oP c20632315oP2 = creatorRankingPageDialogFragment.LLJJIJI;
            if (c20632315oP2 != null) {
                C786410Ut5.LJLLLLLL(0, c20632315oP2);
            }
        }
        CreatorRankingPageDialogFragment creatorRankingPageDialogFragment2 = this.LLILLJJLI;
        creatorRankingPageDialogFragment2.getClass();
        if (c861610Xr5.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("renderTopBar firstTabs=");
            sbLIZ3.append(c1785480wZ0.LIZ.size());
            sbLIZ3.append(" selectedFirst=");
            sbLIZ3.append(c1785480wZ0.LIZIZ);
            sbLIZ3.append(" mode=");
            sbLIZ3.append(c1785480wZ0.LJIIJ);
            C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", C2188811AlT.LIZIZ(sbLIZ3));
            List<C1779500wPM> list = c1785480wZ0.LIZ;
            C1786150wa5 c1786150wa5 = (C1786150wa5) creatorRankingPageDialogFragment2.LLJJJ.getValue();
            c1786150wa5.getClass();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("submitList size=");
            sbLIZ4.append(list.size());
            C20441214yg.LIZIZ("CreatorRankingFirstTabPagerAdapter", C2188811AlT.LIZIZ(sbLIZ4));
            ((ArrayList) c1786150wa5.LLJI).clear();
            ((ArrayList) c1786150wa5.LLJI).addAll(list);
            c1786150wa5.notifyDataSetChanged();
            if (c1785480wZ0.LJIIJ == EnumC1778940wOS.HISTORY) {
                C1846060y8i c1846060y8i2 = creatorRankingPageDialogFragment2.LLILZLL;
                if (c1846060y8i2 != null) {
                    C786410Ut5.LJLLLLLL(8, c1846060y8i2);
                }
                View view6 = creatorRankingPageDialogFragment2.LLIZ;
                if (view6 != null) {
                    C786410Ut5.LJLLLLLL(8, view6);
                }
                TuxTextView tuxTextView4 = creatorRankingPageDialogFragment2.LLIZLLLIL;
                if (tuxTextView4 != null) {
                    C786410Ut5.LJLLLLLL(8, tuxTextView4);
                }
                View view7 = creatorRankingPageDialogFragment2.LLJ;
                if (view7 != null) {
                    C786410Ut5.LJLLLLLL(8, view7);
                }
                View view8 = creatorRankingPageDialogFragment2.LLJILJIL;
                if (view8 != null) {
                    C786410Ut5.LJLLLLLL(8, view8);
                }
                LiveIconView liveIconView4 = creatorRankingPageDialogFragment2.LLJILJILJ;
                if (liveIconView4 != null) {
                    C786410Ut5.LJLLLLLL(8, liveIconView4);
                }
                LiveIconView liveIconView5 = creatorRankingPageDialogFragment2.LLJILLL;
                if (liveIconView5 != null) {
                    C786410Ut5.LJLLLLLL(8, liveIconView5);
                }
                View view9 = creatorRankingPageDialogFragment2.LLJJ;
                if (view9 != null) {
                    C786410Ut5.LJLLLLLL(0, view9);
                }
                LiveIconView liveIconView6 = creatorRankingPageDialogFragment2.LLJJI;
                if (liveIconView6 != null) {
                    if (c1785480wZ0.LJIIJJI) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i7, liveIconView6);
                }
                TuxTextView tuxTextView5 = creatorRankingPageDialogFragment2.LLJJIII;
                if (tuxTextView5 != null) {
                    C786410Ut5.LJLLLLLL(0, tuxTextView5);
                }
                TuxTextView tuxTextView6 = creatorRankingPageDialogFragment2.LLJJIII;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(c1785480wZ0.LJIIL);
                }
                View view10 = creatorRankingPageDialogFragment2.LLJJIJIIJIL;
                if (view10 != null) {
                    if (!c1785480wZ0.LJIIIZ) {
                        i8 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i8, view10);
                }
            } else {
                View view11 = creatorRankingPageDialogFragment2.LLJJ;
                if (view11 != null) {
                    C786410Ut5.LJLLLLLL(8, view11);
                }
                LiveIconView liveIconView7 = creatorRankingPageDialogFragment2.LLJJI;
                if (liveIconView7 != null) {
                    C786410Ut5.LJLLLLLL(8, liveIconView7);
                }
                TuxTextView tuxTextView7 = creatorRankingPageDialogFragment2.LLJJIII;
                if (tuxTextView7 != null) {
                    C786410Ut5.LJLLLLLL(8, tuxTextView7);
                }
                View view12 = creatorRankingPageDialogFragment2.LLJILJIL;
                if (view12 != null) {
                    C786410Ut5.LJLLLLLL(0, view12);
                }
                boolean z2 = c1785480wZ0.LIZLLL;
                C1846060y8i c1846060y8i3 = creatorRankingPageDialogFragment2.LLILZLL;
                if (c1846060y8i3 != null) {
                    if (z2) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i6, c1846060y8i3);
                }
                View view13 = creatorRankingPageDialogFragment2.LLIZ;
                if (view13 != null) {
                    if (!z2) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i5, view13);
                }
                TuxTextView tuxTextView8 = creatorRankingPageDialogFragment2.LLIZLLLIL;
                if (tuxTextView8 != null) {
                    if (!z2) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i4, tuxTextView8);
                }
                if (!z2 && (tuxTextView = creatorRankingPageDialogFragment2.LLIZLLLIL) != null) {
                    tuxTextView.setText(c1785480wZ0.LIZJ);
                }
                if (!z2 && c1785480wZ0.LJII) {
                    z = true;
                } else {
                    z = false;
                }
                View view14 = creatorRankingPageDialogFragment2.LLJ;
                if (view14 != null) {
                    if (z) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i3, view14);
                }
                TuxTextView tuxTextView9 = creatorRankingPageDialogFragment2.LLJI;
                String str = "";
                if (tuxTextView9 != null) {
                    if (!z) {
                        strLJIJI = "";
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131844593);
                    }
                    tuxTextView9.setText(strLJIJI);
                }
                TuxTextView tuxTextView10 = creatorRankingPageDialogFragment2.LLJIJIL;
                if (tuxTextView10 != null) {
                    if (z) {
                        str = c1785480wZ0.LJIIIIZZ;
                    }
                    tuxTextView10.setText(str);
                }
                View view15 = creatorRankingPageDialogFragment2.LLJILJIL;
                if (view15 != null) {
                    ViewGroup.LayoutParams layoutParams = view15.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                        if (z2) {
                            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                            c19me.bottomToBottom = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) C497740JfY.LIZIZ(16.0f);
                            c19me.bottomToBottom = -1;
                        }
                        C786410Ut5.W5(view15, c19me);
                    }
                }
                LiveIconView liveIconView8 = creatorRankingPageDialogFragment2.LLJILJILJ;
                if (liveIconView8 != null) {
                    if (c1785480wZ0.LJ) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, liveIconView8);
                }
                LiveIconView liveIconView9 = creatorRankingPageDialogFragment2.LLJILJILJ;
                if (liveIconView9 != null) {
                    liveIconView9.setIconAttr(c1785480wZ0.LJI);
                }
                LiveIconView liveIconView10 = creatorRankingPageDialogFragment2.LLJILLL;
                if (liveIconView10 != null) {
                    String str2 = c1785480wZ0.LJFF;
                    if (str2 != null && !a0.LJJJIL(str2)) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, liveIconView10);
                }
                View view16 = creatorRankingPageDialogFragment2.LLJJIJIIJIL;
                if (view16 != null) {
                    if (c1785480wZ0.LJIIIZ) {
                        i9 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i9, view16);
                }
                C1846060y8i c1846060y8i4 = creatorRankingPageDialogFragment2.LLILZLL;
                if (c1846060y8i4 != null) {
                    if (c1846060y8i4.getTabCount() != list.size()) {
                        c1846060y8i4.LJIIJJI();
                        for (C1779500wPM c1779500wPM : list) {
                            C1845940y8W c1845940y8WLJIIIZ = c1846060y8i4.LJIIIZ();
                            c1845940y8WLJIIIZ.LIZIZ(c1779500wPM.LIZIZ);
                            c1846060y8i4.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i4.LLILZLL.size(), false);
                        }
                    } else {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            C1845940y8W c1845940y8WLJII = c1846060y8i4.LJII(i10);
                            if (c1845940y8WLJII != null) {
                                c1845940y8WLJII.LIZIZ(((C1779500wPM) ListProtector.get(list, i10)).LIZIZ);
                            }
                        }
                    }
                    int i11 = c1785480wZ0.LIZIZ;
                    int size2 = list.size() - 1;
                    if (size2 < 0) {
                        size2 = 0;
                    }
                    int iLJ = C13LZ.LJ(i11, 0, size2);
                    C20632315oP c20632315oP3 = creatorRankingPageDialogFragment2.LLJJIJI;
                    if (c20632315oP3 != null) {
                        currentItem = c20632315oP3.getCurrentItem();
                    } else {
                        currentItem = 0;
                    }
                    if (currentItem != iLJ) {
                        creatorRankingPageDialogFragment2.LLILZIL = true;
                        C20632315oP c20632315oP4 = creatorRankingPageDialogFragment2.LLJJIJI;
                        if (c20632315oP4 != null) {
                            c20632315oP4.LJ(iLJ, false);
                        }
                        c1846060y8i4.LJIILL(c1846060y8i4.LJII(iLJ), false);
                        creatorRankingPageDialogFragment2.LLILZIL = false;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageDialogFragment@c771.onViewCreated$5$1$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C443120HZe<? extends C861610Xr5, ? extends InterfaceC1785620wZE, ? extends C1785480wZ0> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c443120HZe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
