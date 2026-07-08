package X;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingFirstTabPageFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wa2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingFirstTabPageFragment$onViewCreated$2$1$1$1", f = "CreatorRankingFirstTabPageFragment.kt", l = {}, m = "invokeSuspend")
public final class C1786120wa2 extends C09AX implements Function2<C1785510wZ3, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorRankingFirstTabPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786120wa2(CreatorRankingFirstTabPageFragment creatorRankingFirstTabPageFragment, InterfaceC1364105Vn<? super C1786120wa2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingFirstTabPageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1786120wa2 c1786120wa2 = new C1786120wa2(this.LLILLJJLI, interfaceC1364105Vn);
        c1786120wa2.LL = obj;
        return c1786120wa2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0wZV] */
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1777410wLz c1777410wLz;
        boolean z;
        C1845930y8V c1845930y8V;
        int iLIZIZ;
        int currentItem;
        boolean z2;
        int i;
        TuxTextView tuxTextView;
        int i2;
        int i3;
        int i4;
        C1C7U.LIZ("CreatorRankingFirstTabPageFragment@c16.onViewCreated$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1785510wZ3 c1785510wZ3 = (C1785510wZ3) this.LL;
        final CreatorRankingFirstTabPageFragment creatorRankingFirstTabPageFragment = this.LLILLJJLI;
        creatorRankingFirstTabPageFragment.LLJILJILJ = c1785510wZ3;
        if (c1785510wZ3 == null) {
            creatorRankingFirstTabPageFragment.LLJILLL = null;
            creatorRankingFirstTabPageFragment.LLJJ = null;
            View view = creatorRankingFirstTabPageFragment.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            TuxTextView tuxTextView2 = creatorRankingFirstTabPageFragment.LLJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView2);
            }
            C1786030wZt c1786030wZt = creatorRankingFirstTabPageFragment.LLJIJIL;
            if (c1786030wZt != null) {
                c1786030wZt.e0(C1781200wS6.LIZ, null, ((InterfaceC1786180wa8) creatorRankingFirstTabPageFragment.LL.getValue()).tw(), null);
            }
        } else {
            if (!Intrinsics.LJFF(creatorRankingFirstTabPageFragment.LLJILLL, c1785510wZ3.LIZ)) {
                C1785470wYz c1785470wYz = c1785510wZ3.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("renderSubNav firstRankType=");
                sbLIZ.append(creatorRankingFirstTabPageFragment.PR());
                sbLIZ.append(" subTabs=");
                sbLIZ.append(c1785470wYz.LIZ.size());
                sbLIZ.append(" selectedSub=");
                sbLIZ.append(c1785470wYz.LIZIZ);
                sbLIZ.append(" mode=");
                sbLIZ.append(c1785470wYz.LJII);
                C20441214yg.LIZIZ("CreatorRankingFirstTabPageFragment", C2188811AlT.LIZIZ(sbLIZ));
                List<C1779500wPM> list = c1785470wYz.LIZ;
                C1786140wa4 c1786140wa4 = (C1786140wa4) creatorRankingFirstTabPageFragment.LLJILJIL.getValue();
                c1786140wa4.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("submitList size=");
                sbLIZ2.append(list.size());
                C20441214yg.LIZIZ("CreatorRankingSubTabPagerAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                ((ArrayList) c1786140wa4.LLJI).clear();
                ((ArrayList) c1786140wa4.LLJI).addAll(list);
                c1786140wa4.notifyDataSetChanged();
                boolean z3 = c1785470wYz.LJI;
                View view2 = creatorRankingFirstTabPageFragment.LLILZIL;
                if (view2 != null) {
                    if (z3) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i4, view2);
                }
                if (!z3) {
                    TuxTextView tuxTextView3 = creatorRankingFirstTabPageFragment.LLJ;
                    if (tuxTextView3 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView3);
                    }
                } else if (c1785470wYz.LJII == EnumC1778950wOT.HISTORY) {
                    C1846060y8i c1846060y8i = creatorRankingFirstTabPageFragment.LLILZLL;
                    if (c1846060y8i != null) {
                        C786410Ut5.LJLLLLLL(8, c1846060y8i);
                    }
                    TuxTextView tuxTextView4 = creatorRankingFirstTabPageFragment.LLIZ;
                    if (tuxTextView4 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView4);
                    }
                    TuxTextView tuxTextView5 = creatorRankingFirstTabPageFragment.LLIZLLLIL;
                    if (tuxTextView5 != null) {
                        C786410Ut5.LJLLLLLL(0, tuxTextView5);
                    }
                    TuxTextView tuxTextView6 = creatorRankingFirstTabPageFragment.LLIZLLLIL;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(c1785470wYz.LJIIIIZZ);
                    }
                    TuxTextView tuxTextView7 = creatorRankingFirstTabPageFragment.LLJ;
                    if (tuxTextView7 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView7);
                    }
                } else {
                    TuxTextView tuxTextView8 = creatorRankingFirstTabPageFragment.LLIZLLLIL;
                    if (tuxTextView8 != null) {
                        C786410Ut5.LJLLLLLL(8, tuxTextView8);
                    }
                    boolean z4 = c1785470wYz.LIZLLL;
                    C1846060y8i c1846060y8i2 = creatorRankingFirstTabPageFragment.LLILZLL;
                    if (c1846060y8i2 != null) {
                        if (z4) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i3, c1846060y8i2);
                    }
                    TuxTextView tuxTextView9 = creatorRankingFirstTabPageFragment.LLIZ;
                    if (tuxTextView9 != null) {
                        if (!z4) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i2, tuxTextView9);
                    }
                    if (!z4 && (tuxTextView = creatorRankingFirstTabPageFragment.LLIZ) != null) {
                        tuxTextView.setText(c1785470wYz.LIZJ);
                    }
                    TuxTextView tuxTextView10 = creatorRankingFirstTabPageFragment.LLJ;
                    if (tuxTextView10 != null) {
                        if (c1785470wYz.LJ) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        C786410Ut5.LJLLLLLL(i, tuxTextView10);
                    }
                    TuxTextView tuxTextView11 = creatorRankingFirstTabPageFragment.LLJ;
                    if (tuxTextView11 != null) {
                        tuxTextView11.setText(c1785470wYz.LJFF);
                    }
                    C1846060y8i c1846060y8i3 = creatorRankingFirstTabPageFragment.LLILZLL;
                    if (c1846060y8i3 != null) {
                        if (c1846060y8i3.getTabCount() != list.size()) {
                            c1846060y8i3.LJIIJJI();
                            int i5 = 0;
                            for (C1779500wPM c1779500wPM : list) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    C1845940y8W c1845940y8WLJIIIZ = c1846060y8i3.LJIIIZ();
                                    c1846060y8i3.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i3.LLILZLL.size(), false);
                                    String str = c1779500wPM.LIZIZ;
                                    if (i5 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    CreatorRankingFirstTabPageFragment.OR(c1845940y8WLJIIIZ, str, z2);
                                    i5 = i6;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        } else {
                            int size = list.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                C1845940y8W c1845940y8WLJII = c1846060y8i3.LJII(i7);
                                String str2 = ((C1779500wPM) ListProtector.get(list, i7)).LIZIZ;
                                if (i7 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (c1845940y8WLJII != null && (c1845930y8V = c1845940y8WLJII.LJFF) != null) {
                                    TextView textView = (TextView) c1845930y8V.findViewById(R.id.text1);
                                    if (textView == null) {
                                        CreatorRankingFirstTabPageFragment.OR(c1845940y8WLJII, str2, z);
                                    } else {
                                        textView.setText(str2);
                                        ImageView imageView = (ImageView) c1845930y8V.findViewById(R.id.icon);
                                        if (imageView != null) {
                                            C786410Ut5.LJZI(8, imageView);
                                        }
                                        View viewFindViewById = c1845930y8V.findViewById(com.zhiliaoapp.musically.R.id.xlh);
                                        if (viewFindViewById == null) {
                                            continue;
                                        } else {
                                            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                                            if (layoutParams != null) {
                                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                if (z) {
                                                    iLIZIZ = 0;
                                                } else {
                                                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                                }
                                                marginLayoutParams.setMarginStart(iLIZIZ);
                                                marginLayoutParams.setMarginEnd(0);
                                                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int i8 = c1785470wYz.LIZIZ;
                        int size2 = list.size() - 1;
                        if (size2 < 0) {
                            size2 = 0;
                        }
                        int iLJ = C13LZ.LJ(i8, 0, size2);
                        C20632315oP c20632315oP = creatorRankingFirstTabPageFragment.LLJI;
                        if (c20632315oP != null) {
                            currentItem = c20632315oP.getCurrentItem();
                        } else {
                            currentItem = 0;
                        }
                        if (currentItem != iLJ) {
                            creatorRankingFirstTabPageFragment.LLILZ = true;
                            C20632315oP c20632315oP2 = creatorRankingFirstTabPageFragment.LLJI;
                            if (c20632315oP2 != null) {
                                c20632315oP2.LJ(iLJ, false);
                            }
                            c1846060y8i3.LJIILL(c1846060y8i3.LJII(iLJ), false);
                            creatorRankingFirstTabPageFragment.LLILZ = false;
                        }
                        int tabCount = c1846060y8i3.getTabCount();
                        for (int i9 = 0; i9 < tabCount; i9++) {
                            C1845940y8W c1845940y8WLJII2 = c1846060y8i3.LJII(i9);
                            if (c1845940y8WLJII2 != null) {
                                if (i9 == iLJ) {
                                    creatorRankingFirstTabPageFragment.MR(c1845940y8WLJII2);
                                } else {
                                    creatorRankingFirstTabPageFragment.NR(c1845940y8WLJII2);
                                }
                            }
                        }
                    }
                }
                creatorRankingFirstTabPageFragment.LLJILLL = c1785510wZ3.LIZ;
            }
            if (!Intrinsics.LJFF(creatorRankingFirstTabPageFragment.LLJJ, c1785510wZ3.LIZIZ)) {
                InterfaceC1781190wS5 interfaceC1781190wS5 = c1785510wZ3.LIZIZ;
                C1786030wZt c1786030wZt2 = creatorRankingFirstTabPageFragment.LLJIJIL;
                if (c1786030wZt2 != 0) {
                    C1785510wZ3 c1785510wZ32 = creatorRankingFirstTabPageFragment.LLJILJILJ;
                    if (c1785510wZ32 != null) {
                        c1777410wLz = c1785510wZ32.LIZJ;
                    } else {
                        c1777410wLz = null;
                    }
                    c1786030wZt2.e0(interfaceC1781190wS5, c1777410wLz, ((InterfaceC1786180wa8) creatorRankingFirstTabPageFragment.LL.getValue()).tw(), new InterfaceC1786040wZu() { // from class: X.0wZV
                        @Override // X.InterfaceC1786040wZu
                        public final void LIZ() {
                            ((CreatorRankingPageViewModel) creatorRankingFirstTabPageFragment.LLILLJJLI.getValue()).onEvent(C1785680wZK.LIZ);
                        }

                        @Override // X.InterfaceC1786040wZu
                        public final void LIZIZ() {
                            ((CreatorRankingPageViewModel) creatorRankingFirstTabPageFragment.LLILLJJLI.getValue()).onEvent(C1785750wZR.LIZ);
                        }
                    });
                }
                creatorRankingFirstTabPageFragment.LLJJ = c1785510wZ3.LIZIZ;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingFirstTabPageFragment@c16.onViewCreated$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1785510wZ3 c1785510wZ3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1785510wZ3, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
