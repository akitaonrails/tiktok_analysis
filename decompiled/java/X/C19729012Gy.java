package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19729012Gy implements C12JU {
    public final Context LIZ;
    public final View LIZIZ;
    public final C12J0 LIZJ;
    public final C12H1 LIZLLL;
    public final C19561611g6 LJ;
    public final C19518011Xu LJFF;

    @Override // X.C12JU
    public final void LIZ() {
        this.LJ.requestLayout();
    }

    @Override // X.C12JU
    public final void LIZIZ(final List<BeautyCategory> list) {
        int i;
        float fLIZIZ;
        Object next;
        C12H3 tabAt;
        InterfaceC19731912Ib interfaceC19731912Ib;
        final ArrayList arrayList = new ArrayList();
        ArrayList<BeautyCategory> arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((BeautyCategory) it2.next()).getCategoryResponse().getId());
        }
        if (arrayList2.size() <= 1) {
            this.LJ.setHideIndicatorView(true);
        } else {
            this.LJ.setHideIndicatorView(false);
        }
        if (arrayList2.size() == 1) {
            this.LJ.setTabMode(1);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LJ.getLayoutParams();
            layoutParams.leftMargin = (int) C11VU.LIZIZ(76.0f, this.LIZ);
            layoutParams.setMarginStart((int) C11VU.LIZIZ(76.0f, this.LIZ));
            C786410Ut5.p7(this.LJ, layoutParams);
        } else {
            this.LJ.setTabMode(0);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.LJ.getLayoutParams();
            C12J0 c12j0 = this.LIZJ;
            if (c12j0.LIZ) {
                fLIZIZ = C11VU.LIZIZ(56.0f, this.LIZ);
            } else if (c12j0.LJFF.LJFF) {
                fLIZIZ = C11VU.LIZIZ(8.0f, this.LIZ);
            } else {
                i = 0;
                layoutParams2.leftMargin = i;
                layoutParams2.setMarginStart(i);
                C786410Ut5.p7(this.LJ, layoutParams2);
            }
            i = (int) fLIZIZ;
            layoutParams2.leftMargin = i;
            layoutParams2.setMarginStart(i);
            C786410Ut5.p7(this.LJ, layoutParams2);
        }
        this.LJ.removeAllTabs();
        for (BeautyCategory beautyCategory : arrayList2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LJT addTab: ");
            sbLIZ.append(beautyCategory.getCategoryResponse().getName());
            C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            Context context = this.LIZ;
            C1642680sqg c1642680sqgLIZIZ = C1641140soC.LIZIZ(context);
            if (TextUtils.isEmpty(beautyCategory.getCategoryResponse().getIcon_normal_url())) {
                c1642680sqgLIZIZ.setText(beautyCategory.getCategoryResponse().getName());
            } else {
                String icon_normal_url = beautyCategory.getCategoryResponse().getIcon_normal_url();
                if (icon_normal_url == null) {
                    icon_normal_url = "";
                }
                c1642680sqgLIZIZ.setImage(icon_normal_url);
            }
            c1642680sqgLIZIZ.setSelectColor(context.getResources().getColor(this.LIZJ.LJFF.LIZJ));
            c1642680sqgLIZIZ.setUnSelectColor(context.getResources().getColor(this.LIZJ.LJFF.LIZLLL));
            C12H3 c12h3NewTab = this.LJ.newTab();
            c12h3NewTab.LJ = c1642680sqgLIZIZ;
            c12h3NewTab.LIZIZ();
            C19YC c19yc = c12h3NewTab.LJII;
            if (c19yc != null) {
                c19yc.setBackgroundColor(C446980Hfs.LIZ(c19yc.getContext(), R.color.a1d));
            }
            this.LJ.addTab(c12h3NewTab, false);
        }
        this.LJ.setSelectedTabIndicatorColor(this.LIZ.getResources().getColor(this.LIZJ.LJFF.LJ));
        this.LJ.setOnTabClickListener(new InterfaceC1638460sjs() { // from class: X.12Gz
            @Override // X.InterfaceC1638460sjs
            public final void LIZ(C12H3 c12h3) {
                BeautyCategory next2;
                InterfaceC19731912Ib interfaceC19731912Ib2;
                c12h3.LIZ();
                List<BeautyCategory> list2 = list;
                ArrayList<String> arrayList3 = arrayList;
                Iterator<BeautyCategory> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(ListProtector.get(arrayList3, c12h3.LIZLLL), next2.getCategoryResponse().getId())) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                BeautyCategory beautyCategory2 = next2;
                if (beautyCategory2 != null) {
                    C12H1 c12h1 = this.LIZLLL;
                    C12JP c12jp = c12h1.LIZIZ;
                    if (c12jp != null && (interfaceC19731912Ib2 = c12jp.LIZ) != null) {
                        interfaceC19731912Ib2.LIZIZ(beautyCategory2);
                    }
                    InterfaceC19731812Ia interfaceC19731812Ia = c12h1.LIZJ;
                    if (interfaceC19731812Ia != null) {
                        interfaceC19731812Ia.LIZ(beautyCategory2);
                    }
                }
            }
        });
        this.LJ.addOnTabSelectedListener(new InterfaceC19561911g9() { // from class: X.12H0
            @Override // X.InterfaceC19561911g9
            public final void LIZ(C12H3 c12h3) {
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZIZ(C12H3 c12h3) {
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZJ(C12H3 c12h3, boolean z) {
                BeautyCategory next2;
                List<BeautyCategory> list2 = list;
                ArrayList<String> arrayList3 = arrayList;
                Iterator<BeautyCategory> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(ListProtector.get(arrayList3, c12h3.LIZLLL), next2.getCategoryResponse().getId())) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                BeautyCategory beautyCategory2 = next2;
                if (beautyCategory2 != null) {
                    C12H1 c12h1 = this.LIZLLL;
                    c12h1.LIZ.Ge(beautyCategory2);
                    c12h1.LIZLLL.LJI(beautyCategory2);
                }
            }
        });
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (((BeautyCategory) next).getSelected()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BeautyCategory beautyCategory2 = (BeautyCategory) next;
        if (beautyCategory2 != null && (tabAt = this.LJ.getTabAt(arrayList2.indexOf(beautyCategory2))) != null) {
            tabAt.LIZ();
            C12H1 c12h1 = this.LIZLLL;
            C12JP c12jp = c12h1.LIZIZ;
            if (c12jp != null && (interfaceC19731912Ib = c12jp.LIZ) != null) {
                interfaceC19731912Ib.LIZIZ(beautyCategory2);
            }
            InterfaceC19731812Ia interfaceC19731812Ia = c12h1.LIZJ;
            if (interfaceC19731812Ia != null) {
                interfaceC19731812Ia.LIZ(beautyCategory2);
            }
        }
        if (this.LIZJ.LJFF.LIZIZ) {
            C19561611g6 c19561611g6 = this.LJ;
            int visibility = c19561611g6.getVisibility();
            c19561611g6.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c19561611g6);
        } else {
            C19561611g6 c19561611g62 = this.LJ;
            int visibility2 = c19561611g62.getVisibility();
            c19561611g62.setVisibility(4);
            C1602160rnK.LIZIZ(visibility2, 4, c19561611g62);
        }
        if (arrayList2.size() > 4) {
            C19518011Xu c19518011Xu = this.LJFF;
            int visibility3 = c19518011Xu.getVisibility();
            c19518011Xu.setVisibility(0);
            C1602160rnK.LIZIZ(visibility3, 0, c19518011Xu);
            return;
        }
        C19518011Xu c19518011Xu2 = this.LJFF;
        int visibility4 = c19518011Xu2.getVisibility();
        c19518011Xu2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility4, 8, c19518011Xu2);
    }

    public C19729012Gy(Context context, View view, C12J0 c12j0, C12H1 c12h1) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = c12j0;
        this.LIZLLL = c12h1;
        this.LJ = (C19561611g6) view.findViewById(R.id.y4l);
        this.LJFF = (C19518011Xu) view.findViewById(R.id.v_com_beauty_list_divider);
    }
}
