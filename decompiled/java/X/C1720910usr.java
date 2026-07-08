package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.bytedance.pipo.stellar.base.model.LayoutParamDO;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0usr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720910usr extends AbstractC1720840usk<ContainerCardDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adm;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, ContainerCardDO containerCardDO, EnumC1720670usT enumC1720670usT) {
        View view2;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str;
        ContainerCardDO containerCardDO2 = containerCardDO;
        super.LJFF(view, containerCardDO2, enumC1720670usT);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.vertical_scroll_root);
        C786410Ut5.LJJJJJL(linearLayout);
        int i2 = 1;
        linearLayout.setOrientation(1);
        LayoutParamDO layoutParam = containerCardDO2.getLayoutParam();
        if (layoutParam != null && (str = layoutParam.gravity) != null) {
            if (!Intrinsics.LJFF(str, "center_horizontal")) {
                if (Intrinsics.LJFF(str, "right")) {
                    i2 = 8388613;
                } else {
                    i2 = 8388611;
                }
            }
            linearLayout.setGravity(i2);
        }
        C786410Ut5.LJJJJJL(linearLayout);
        List<CardDO> cardList = containerCardDO2.getCardList();
        if (cardList != null) {
            ArrayList arrayList = new ArrayList();
            for (CardDO cardDO : cardList) {
                if (Intrinsics.LJFF(cardDO.getCardShow(), "1")) {
                    arrayList.add(cardDO);
                }
            }
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                String str2 = null;
                if (i3 >= 0) {
                    Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
                    AbstractC1720840usk abstractC1720840uskLIZ = C1720940usu.LIZ(view.getContext(), this.LL, (CardDO) obj, null);
                    if (abstractC1720840uskLIZ != null && (view2 = abstractC1720840uskLIZ.LLILLJJLI) != null) {
                        if (i3 != 0) {
                            C1721300utU c1721300utU = C1721300utU.LIZ;
                            LayoutParamDO layoutParam2 = containerCardDO2.getLayoutParam();
                            if (layoutParam2 != null) {
                                str2 = layoutParam2.itemSpaceVertical;
                            }
                            Context context = view.getContext();
                            c1721300utU.getClass();
                            int iLJJIII = C1721300utU.LJJIII(context, str2);
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                i = marginLayoutParams.topMargin;
                            } else {
                                i = 0;
                            }
                            C426750GoL.LJIIIZ(view2, null, Integer.valueOf(iLJJIII + i), null, null, false, 29);
                        }
                        linearLayout.addView(view2);
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
