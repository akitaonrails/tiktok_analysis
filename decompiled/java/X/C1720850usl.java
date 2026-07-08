package X;

import android.content.Context;
import android.view.View;
import android.widget.GridLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.bytedance.pipo.stellar.base.model.LayoutParamDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0usl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720850usl extends AbstractC1720840usk<ContainerCardDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adq;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, ContainerCardDO containerCardDO, EnumC1720670usT enumC1720670usT) {
        GridLayout gridLayout;
        int iIntValue;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        int size;
        int size2;
        CardDO cardDO;
        View view2;
        Integer numValueOf5;
        Integer numValueOf6;
        Integer numValueOf7;
        Integer numValueOf8;
        int iIntValue2;
        String str;
        int iIntValue3;
        String str2;
        String str3;
        Integer numLJIIJJI;
        String str4;
        Integer numLJIIJJI2;
        String str5;
        Integer numLJIIJJI3;
        String str6;
        Integer numLJIIJJI4;
        MarginDO marginDO;
        String str7;
        MarginDO marginDO2;
        String str8;
        MarginDO marginDO3;
        String str9;
        MarginDO marginDO4;
        String str10;
        Integer num;
        ContainerCardDO containerCardDO2 = containerCardDO;
        super.LJFF(view, containerCardDO2, enumC1720670usT);
        if ((view instanceof GridLayout) && (gridLayout = (GridLayout) view) != null) {
            C786410Ut5.LJJJJJ(gridLayout);
            gridLayout.setOrientation(0);
            LayoutParamDO layoutParam = containerCardDO2.getLayoutParam();
            if (layoutParam != null && (num = layoutParam.columnCount) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            gridLayout.setColumnCount(iIntValue);
            LayoutParamDO layoutParam2 = containerCardDO2.getLayoutParam();
            if (layoutParam2 != null && (marginDO4 = layoutParam2.padding) != null && (str10 = marginDO4.start) != null) {
                C1721300utU c1721300utU = C1721300utU.LIZ;
                Context context = gridLayout.getContext();
                c1721300utU.getClass();
                numValueOf = Integer.valueOf(C1721300utU.LJJIII(context, str10));
            } else {
                numValueOf = null;
            }
            LayoutParamDO layoutParam3 = containerCardDO2.getLayoutParam();
            if (layoutParam3 != null && (marginDO3 = layoutParam3.padding) != null && (str9 = marginDO3.top) != null) {
                C1721300utU c1721300utU2 = C1721300utU.LIZ;
                Context context2 = gridLayout.getContext();
                c1721300utU2.getClass();
                numValueOf2 = Integer.valueOf(C1721300utU.LJIILLIIL(context2, str9));
            } else {
                numValueOf2 = null;
            }
            LayoutParamDO layoutParam4 = containerCardDO2.getLayoutParam();
            if (layoutParam4 != null && (marginDO2 = layoutParam4.padding) != null && (str8 = marginDO2.end) != null) {
                C1721300utU c1721300utU3 = C1721300utU.LIZ;
                Context context3 = gridLayout.getContext();
                c1721300utU3.getClass();
                numValueOf3 = Integer.valueOf(C1721300utU.LJJIII(context3, str8));
            } else {
                numValueOf3 = null;
            }
            LayoutParamDO layoutParam5 = containerCardDO2.getLayoutParam();
            if (layoutParam5 != null && (marginDO = layoutParam5.padding) != null && (str7 = marginDO.bottom) != null) {
                C1721300utU c1721300utU4 = C1721300utU.LIZ;
                Context context4 = gridLayout.getContext();
                c1721300utU4.getClass();
                numValueOf4 = Integer.valueOf(C1721300utU.LJIILLIIL(context4, str7));
            } else {
                numValueOf4 = null;
            }
            C426750GoL.LJIIL(gridLayout, numValueOf, numValueOf2, numValueOf3, numValueOf4, 16);
            List<CardDO> cardList = containerCardDO2.getCardList();
            if (cardList != null) {
                size = cardList.size();
            } else {
                size = 0;
            }
            for (int i = 0; i < size; i++) {
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.width = 0;
                layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams.rowSpec = GridLayout.spec(Integer.MIN_VALUE, -2.0f);
                List<CardDO> cardList2 = containerCardDO2.getCardList();
                if (cardList2 != null && (cardDO = (CardDO) ListProtector.get(cardList2, i)) != null) {
                    C1721300utU c1721300utU5 = C1721300utU.LIZ;
                    String height = cardDO.getHeight();
                    Context context5 = gridLayout.getContext();
                    c1721300utU5.getClass();
                    layoutParams.height = C1721300utU.LJIILLIIL(context5, height);
                    Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
                    AbstractC1720840usk abstractC1720840uskLIZ = C1720940usu.LIZ(gridLayout.getContext(), this.LL, cardDO, null);
                    if (abstractC1720840uskLIZ != null) {
                        view2 = abstractC1720840uskLIZ.LLILLJJLI;
                        if (view2 != null) {
                            C786410Ut5.W5(view2, layoutParams);
                        }
                    } else {
                        view2 = null;
                    }
                    MarginDO margin = cardDO.getMargin();
                    if (margin != null && (str6 = margin.start) != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str6)) != null) {
                        numValueOf5 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI4)));
                    } else {
                        numValueOf5 = null;
                    }
                    MarginDO margin2 = cardDO.getMargin();
                    if (margin2 != null && (str5 = margin2.top) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str5)) != null) {
                        numValueOf6 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI3)));
                    } else {
                        numValueOf6 = null;
                    }
                    MarginDO margin3 = cardDO.getMargin();
                    if (margin3 != null && (str4 = margin3.end) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str4)) != null) {
                        numValueOf7 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI2)));
                    } else {
                        numValueOf7 = null;
                    }
                    MarginDO margin4 = cardDO.getMargin();
                    if (margin4 != null && (str3 = margin4.bottom) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
                        numValueOf8 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI)));
                    } else {
                        numValueOf8 = null;
                    }
                    if (view2 != null) {
                        C426750GoL.LJIIIZ(view2, numValueOf5, numValueOf6, numValueOf7, numValueOf8, false, 16);
                    }
                    if (i % gridLayout.getColumnCount() != 0 && view2 != null) {
                        if (numValueOf5 != null) {
                            iIntValue3 = numValueOf5.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        LayoutParamDO layoutParam6 = containerCardDO2.getLayoutParam();
                        if (layoutParam6 != null) {
                            str2 = layoutParam6.itemSpaceHorizontal;
                        } else {
                            str2 = null;
                        }
                        C426750GoL.LJIIIZ(view2, Integer.valueOf(iIntValue3 + C1721300utU.LJJIII(gridLayout.getContext(), str2)), null, null, null, false, 30);
                    }
                    if (i / gridLayout.getColumnCount() >= 1) {
                        if (view2 != null) {
                            if (numValueOf6 != null) {
                                iIntValue2 = numValueOf6.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            LayoutParamDO layoutParam7 = containerCardDO2.getLayoutParam();
                            if (layoutParam7 != null) {
                                str = layoutParam7.itemSpaceVertical;
                            } else {
                                str = null;
                            }
                            view2 = view2;
                            C426750GoL.LJIIIZ(view2, null, Integer.valueOf(iIntValue2 + C1721300utU.LJIILLIIL(gridLayout.getContext(), str)), null, null, false, 29);
                            gridLayout.addView(view2);
                        }
                    } else if (view2 != null) {
                        gridLayout.addView(view2);
                    }
                }
            }
            List<CardDO> cardList3 = containerCardDO2.getCardList();
            if (cardList3 != null) {
                size2 = cardList3.size();
            } else {
                size2 = 0;
            }
            int columnCount = size2 % gridLayout.getColumnCount();
            if (columnCount > 0) {
                int columnCount2 = gridLayout.getColumnCount() - columnCount;
                for (int i2 = 0; i2 < columnCount2; i2++) {
                    View view3 = new View(gridLayout.getContext());
                    GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
                    layoutParams2.width = 0;
                    layoutParams2.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                    layoutParams2.rowSpec = GridLayout.spec(Integer.MIN_VALUE, -2.0f);
                    C786410Ut5.W5(view3, layoutParams2);
                    gridLayout.addView(view3);
                }
            }
        }
    }
}
