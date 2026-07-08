package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTileCell;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.ProductTile;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS113S0400000_16;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ch4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021680ch4 extends AbstractC1014240cV4 {
    public final AnoleProductTilesModel LLJLIL;
    public final InterfaceC1021730ch9 LLJLILLLLZIIL;
    public C425220Gls LLJLL;
    public C371520EhS LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public int LLJZIJLIL;
    public final C1021750chB LLL;
    public AnonymousClass0956 LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public String LLLFZ;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILJJIL() {
        return true;
    }

    public final InterfaceC1021730ch9 LJJ() {
        InterfaceC1021730ch9 interfaceC1021730ch9 = this.LLJLILLLLZIIL;
        if (interfaceC1021730ch9 != null) {
            return interfaceC1021730ch9;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJJI() {
        if (this.LLLF != null) {
            return;
        }
        this.LLLF = C23250099c.LIZLLL(C2296808zG.LIZIZ(), C0PEM.LIZJ, null, new C06T6(this, null), 2);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        LinearLayoutManager linearLayoutManager;
        super.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostDidDisappear ");
        sbLIZ.append(this.LLILZIL);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJZIJLIL = 0;
        C425220Gls c425220Gls = this.LLJLL;
        RecyclerView.LayoutManager layoutManager = c425220Gls != null ? c425220Gls.getLayoutManager() : null;
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        C1021750chB c1021750chB = this.LLL;
        c1021750chB.LIZ();
        View view = c1021750chB.LIZ;
        if (view != null) {
            C786410Ut5.Jc(view, 0.0f);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostWillAppear ");
        sbLIZ.append(this.LLILZIL);
        C2188811AlT.LIZIZ(sbLIZ);
        LJJI();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        this.LLJJIJIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLLF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isReady isLoadSuccess:");
        sbLIZ.append(this.LLLFF);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = this.LLLFF;
        String str = this.LLLFZ;
        if (str == null) {
            str = "-1";
        }
        return new C1014500cVU(z, str);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        LJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[PHI: r1
      0x0034: PHI (r1v5 java.lang.String) = (r1v1 java.lang.String), (r1v6 java.lang.String) binds: [B:14:0x0032, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[PHI: r1
      0x003c: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String), (r1v5 java.lang.String) binds: [B:14:0x0032, B:16:0x0036, B:18:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1014240cV4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel r5) {
        /*
            r4 = this;
            super.LJII(r5)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "didShow title size:"
            r1.append(r0)
            com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel r0 = r4.LLJLIL
            if (r0 == 0) goto L62
            java.util.List<com.ss.android.ugc.aweme.component.nativeproducttilescomponent.ProductTile> r0 = r0.productTiles
            if (r0 == 0) goto L62
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L1c:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0cN3 r3 = new X.0cN3
            com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel r2 = r4.LLJLIL
            if (r2 == 0) goto L30
            com.ss.android.ugc.aweme.component.nativeproducttilescomponent.LogInfo r0 = r2.logInfo
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.tag
            if (r1 != 0) goto L34
        L30:
            java.lang.String r1 = "draw_ad"
            if (r2 == 0) goto L3c
        L34:
            com.ss.android.ugc.aweme.component.nativeproducttilescomponent.LogInfo r0 = r2.logInfo
            if (r0 == 0) goto L3c
            java.lang.String r0 = r0.refer
            if (r0 != 0) goto L3e
        L3c:
            java.lang.String r0 = "tiles"
        L3e:
            r3.<init>(r1, r0)
            if (r2 == 0) goto L61
            java.util.List<com.ss.android.ugc.aweme.component.nativeproducttilescomponent.ProductTile> r0 = r2.productTiles
            if (r0 == 0) goto L61
            int r0 = r0.size()
            X.0cMX r2 = new X.0cMX
            r2.<init>(r0, r3)
            X.0cV7 r1 = r4.LLILLL
            X.0brF r0 = new X.0brF
            r0.<init>(r2)
            r1.LJIJ(r0, r4)
            X.0ch9 r0 = r4.LJJ()
            r0.LIZIZ(r4)
        L61:
            return
        L62:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1021680ch4.LJII(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel):void");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("didShowFail failReason:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFFI = true;
        this.LLILLL.LJIJ(new C989550brF(C1009230cMz.LIZ), this);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) throws JSONException {
        Integer num;
        Integer num2;
        int itemCount;
        Integer numValueOf;
        if (abstractC1003980cEW instanceof C991240bty) {
            C991240bty c991240bty = (C991240bty) abstractC1003980cEW;
            if (c991240bty.LIZ.isNull("photo_position_for_product_tiles")) {
                return;
            }
            Object obj = c991240bty.LIZ.get("photo_position_for_product_tiles");
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                int iIntValue = num.intValue();
                AnoleProductTilesModel anoleProductTilesModel = this.LLJLIL;
                if (anoleProductTilesModel != null && (num2 = anoleProductTilesModel.carouselProductTilesStyle) != null && num2.intValue() == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handlePhotoChanged photo_position:");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(" tile_position:");
                    sbLIZ.append(this.LLJZIJLIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (iIntValue != this.LLJZIJLIL) {
                        this.LLJZIJLIL = iIntValue;
                        C425220Gls c425220Gls = this.LLJLL;
                        if (c425220Gls != null) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c425220Gls.findViewHolderForAdapterPosition(iIntValue);
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                AbstractC21673619ry adapter = c425220Gls.getAdapter();
                                if (adapter != null) {
                                    itemCount = adapter.getItemCount();
                                } else {
                                    itemCount = 0;
                                }
                                if (iIntValue < itemCount) {
                                    InterfaceC1021730ch9 interfaceC1021730ch9LJJ = LJJ();
                                    if (c425220Gls.getChildCount() > 0) {
                                        View childAt = c425220Gls.getChildAt(0);
                                        int childLayoutPosition = c425220Gls.getChildLayoutPosition(childAt);
                                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(interfaceC1021730ch9LJJ.LIZLLL() + interfaceC1021730ch9LJJ.LJ())));
                                        if (C426750GoL.LJFF()) {
                                            numValueOf = Integer.valueOf(childAt.getRight() - ((iIntValue - childLayoutPosition) * iLIZIZ));
                                        } else {
                                            numValueOf = Integer.valueOf(childAt.getLeft() - ((childLayoutPosition - iIntValue) * iLIZIZ));
                                        }
                                        if (numValueOf != null) {
                                            C1021690ch5.LJ(this, numValueOf.intValue(), c425220Gls, false, false, true);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C1021690ch5.LJFF(this, viewHolderFindViewHolderForAdapterPosition.itemView, c425220Gls, false, true, 12);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        AnoleProductTilesModel anoleProductTilesModel;
        List<ProductTile> list;
        String str;
        final C371520EhS c371520EhS;
        View view;
        View view2;
        final boolean z;
        View view3;
        Integer num;
        super.Fk(viewGroup, interfaceC1014340cVE);
        LJJI();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.pw, viewGroup, false);
        if (viewTd != null) {
            this.LLJLL = (C425220Gls) viewTd.findViewById(R.id.rzy);
            this.LLJLLIL = (C371520EhS) viewTd.findViewById(R.id.gnb);
            this.LLJLLL = viewTd.findViewById(R.id.dlr);
            this.LLJZ = viewTd.findViewById(R.id.dls);
        } else {
            viewTd = null;
        }
        this.LLJJIJIL = viewTd;
        final C425220Gls c425220Gls = this.LLJLL;
        if (c425220Gls != null && (c371520EhS = this.LLJLLIL) != null && (view = this.LLJLLL) != null && (view2 = this.LLJZ) != null) {
            C2271391DvN.LIZ(c425220Gls, (C1A5L) C2271381DvM.LJJIIZI.getValue());
            if (C426750GoL.LJFF()) {
                c371520EhS.setPosition(8);
            } else {
                c371520EhS.setPosition(4);
            }
            AnoleProductTilesModel anoleProductTilesModel2 = this.LLJLIL;
            if (anoleProductTilesModel2 != null && (num = anoleProductTilesModel2.carouselProductTilesStyle) != null && num.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            C1021750chB c1021750chB = this.LLL;
            if (z) {
                c1021750chB.LIZ = view;
                c1021750chB.LIZ();
            } else {
                View view4 = c1021750chB.LIZ;
                if ((view4 == null || view4.getVisibility() != 8) && (view3 = c1021750chB.LIZ) != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
            }
            c425220Gls.LJIILJJIL(AnoleProductTileCell.class);
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.LLILZ, 0, false);
            c425220Gls.setLayoutManager(linearLayoutManager);
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LJJ().LJ())));
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            c425220Gls.setItemAnimator(null);
            c425220Gls.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0DXc
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view5, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view5);
                    if (C426750GoL.LJFF()) {
                        if (childAdapterPosition != 0) {
                            rect.right = this.LL;
                        }
                    } else {
                        if (childAdapterPosition == 0) {
                            return;
                        }
                        rect.left = this.LL;
                    }
                }
            });
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LJJ().LJFF())));
            List listLJIIJJI = C1697810uHb.LJIIJJI(view, view2);
            ArrayList<ViewGroup.LayoutParams> arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                arrayList.add(((View) it2.next()).getLayoutParams());
            }
            for (ViewGroup.LayoutParams layoutParams : arrayList) {
                layoutParams.width = iLIZIZ3;
                layoutParams.height = iLIZIZ3;
            }
            LJJ().LIZJ(this);
            final C013C c013c = new C013C();
            c425220Gls.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0ch6
                public final int LL;
                public final int LLILLJJLI;

                public final void LJJIJIIJIL() {
                    this.LLILLL.LLILLL.LJIJ(new C989550brF(new C1008960cMY(new C1009270cN3("draw_ad", "tiles_slide"))), this.LLILLL);
                }

                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i) {
                    int left;
                    int left2;
                    View view5;
                    if (!z) {
                        if (i == 1) {
                            LJJIJIIJIL();
                            return;
                        }
                        return;
                    }
                    boolean z2 = false;
                    if (i == 2) {
                        C1021750chB c1021750chB2 = this.LLILLL.LLL;
                        View view6 = c1021750chB2.LIZ;
                        if ((view6 != null && view6.getVisibility() == 4) || (view5 = c1021750chB2.LIZ) == null) {
                            return;
                        }
                        C786410Ut5.LJLLLLLL(4, view5);
                        return;
                    }
                    if (i == 1) {
                        c013c.element = true;
                        C1021690ch5.LJI(this.LLILLL, 0.0f);
                        LJJIJIIJIL();
                        return;
                    }
                    if (i != 0) {
                        return;
                    }
                    C013C c013c2 = c013c;
                    if (!c013c2.element) {
                        return;
                    }
                    c013c2.element = false;
                    C1021680ch4 c1021680ch4 = this.LLILLL;
                    C425220Gls c425220Gls2 = c425220Gls;
                    int i2 = iLIZIZ2;
                    if (c425220Gls2.getChildCount() <= 0) {
                        return;
                    }
                    View childAt = c425220Gls2.getChildAt(0);
                    if (!C426750GoL.LJFF() ? childAt.getLeft() == c425220Gls2.getLeft() + i2 : childAt.getRight() == c425220Gls2.getRight() - i2) {
                        z2 = true;
                    }
                    if (z2) {
                        int childAdapterPosition = c425220Gls2.getChildAdapterPosition(childAt);
                        C1021690ch5.LJI(c1021680ch4, 0.0f);
                        c1021680ch4.LLL.LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onScrollStateChanged handleEvent move position:");
                        sbLIZ.append(childAdapterPosition);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1021690ch5.LIZLLL(c1021680ch4, childAdapterPosition, "scroll_idle");
                        return;
                    }
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1021680ch4.LJJ().LIZLLL())));
                    int iLIZ = C1021690ch5.LIZ(c425220Gls2);
                    if (C426750GoL.LJFF()) {
                        left = childAt.getRight();
                        left2 = c425220Gls2.getRight();
                    } else {
                        left = c425220Gls2.getLeft();
                        left2 = childAt.getLeft();
                    }
                    if (left - left2 < iLIZIZ4 / 2 && iLIZ > 0) {
                        int childAdapterPosition2 = c425220Gls2.getChildAdapterPosition(childAt);
                        C1021690ch5.LJFF(c1021680ch4, childAt, c425220Gls2, true, false, 16);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onScrollStateChanged handleEvent move2 position:");
                        sbLIZ2.append(childAdapterPosition2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1021690ch5.LIZLLL(c1021680ch4, childAdapterPosition2, "scroll_idle");
                        return;
                    }
                    if (c425220Gls2.getChildCount() <= 1) {
                        return;
                    }
                    View childAt2 = c425220Gls2.getChildAt(1);
                    int childAdapterPosition3 = c425220Gls2.getChildAdapterPosition(childAt2);
                    C1021690ch5.LJFF(c1021680ch4, childAt2, c425220Gls2, true, false, 16);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onScrollStateChanged handleEvent move3 position:");
                    sbLIZ3.append(childAdapterPosition3);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1021690ch5.LIZLLL(c1021680ch4, childAdapterPosition3, "scroll_idle");
                }

                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                    int iFindFirstVisibleItemPosition;
                    View viewFindViewByPosition;
                    int left;
                    int iLIZ = C1021690ch5.LIZ(c425220Gls);
                    int i3 = this.LL;
                    if (iLIZ > i3) {
                        iLIZ = i3;
                    }
                    c371520EhS.setPaintAlpha((int) (((iLIZ * 1.0f) / i3) * 255));
                    if (!z || !c013c.element || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) == -1 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null) {
                        return;
                    }
                    C425220Gls c425220Gls2 = c425220Gls;
                    if (C426750GoL.LJFF()) {
                        left = viewFindViewByPosition.getRight() - c425220Gls2.getRight();
                    } else {
                        left = c425220Gls2.getLeft() - viewFindViewByPosition.getLeft();
                    }
                    if (left >= this.LLILLJJLI / 2) {
                        return;
                    }
                    C1021690ch5.LIZLLL(this.LLILLL, iFindFirstVisibleItemPosition, "scrolling");
                }

                {
                    this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJJ().LIZ())));
                    this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJJ().LIZLLL())));
                }
            });
            if (z) {
                if (C426750GoL.LJFF()) {
                    c425220Gls.setPadding(iLIZIZ2 + 1, 0, iLIZIZ2, 0);
                } else {
                    c425220Gls.setPadding(iLIZIZ2, 0, iLIZIZ2 + 1, 0);
                }
                c425220Gls.setClipToPadding(false);
            } else {
                c425220Gls.setPadding(0, 0, 0, 0);
                c425220Gls.setClipToPadding(true);
            }
            ((PowerAdapter) c425220Gls.getAdapter()).LLLLII(new InterfaceC432960GyM() { // from class: X.0ch7
                /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[PHI: r1
                  0x0051: PHI (r1v8 java.lang.String) = (r1v3 java.lang.String), (r1v9 java.lang.String) binds: [B:18:0x004f, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[PHI: r1
                  0x0059: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v8 java.lang.String), (r1v8 java.lang.String) binds: [B:18:0x004f, B:20:0x0053, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC432960GyM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void iW0(int r8) {
                    /*
                        r7 = this;
                        boolean r0 = r1
                        if (r0 == 0) goto L79
                        X.0Gls r0 = r2
                        androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForAdapterPosition(r8)
                        if (r0 != 0) goto Ld
                        return
                    Ld:
                        android.view.View r2 = r0.itemView
                        X.0ch4 r1 = r3
                        X.0Gls r3 = r2
                        r4 = 1
                        r5 = 0
                        r6 = 16
                        X.C1021690ch5.LJFF(r1, r2, r3, r4, r5, r6)
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "clickTile position:"
                        r1.append(r0)
                        r1.append(r8)
                        java.lang.String r0 = " current_position:"
                        r1.append(r0)
                        X.0ch4 r0 = r3
                        int r0 = r0.LLJZIJLIL
                        r1.append(r0)
                        X.C2188811AlT.LIZIZ(r1)
                        X.0ch4 r1 = r3
                        int r0 = r1.LLJZIJLIL
                        if (r8 != r0) goto L3f
                        X.C1021690ch5.LIZJ(r1, r8)
                        return
                    L3f:
                        X.0cN3 r4 = new X.0cN3
                        com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel r2 = r1.LLJLIL
                        if (r2 == 0) goto L4d
                        com.ss.android.ugc.aweme.component.nativeproducttilescomponent.LogInfo r0 = r2.logInfo
                        if (r0 == 0) goto L4d
                        java.lang.String r1 = r0.tag
                        if (r1 != 0) goto L51
                    L4d:
                        java.lang.String r1 = "draw_ad"
                        if (r2 == 0) goto L59
                    L51:
                        com.ss.android.ugc.aweme.component.nativeproducttilescomponent.LogInfo r0 = r2.logInfo
                        if (r0 == 0) goto L59
                        java.lang.String r0 = r0.refer
                        if (r0 != 0) goto L5b
                    L59:
                        java.lang.String r0 = "tiles"
                    L5b:
                        r4.<init>(r1, r0)
                        X.0cMW r3 = new X.0cMW
                        r3.<init>(r8, r5, r4)
                        X.0ch4 r0 = r3
                        X.0cV7 r2 = r0.LLILLL
                        X.0brF r1 = new X.0brF
                        r1.<init>(r3)
                        X.0ch4 r0 = r3
                        r2.LJIJ(r1, r0)
                        X.0ch4 r1 = r3
                        java.lang.String r0 = "click"
                        X.C1021690ch5.LIZLLL(r1, r8, r0)
                        return
                    L79:
                        X.0ch4 r0 = r3
                        X.C1021690ch5.LIZJ(r0, r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1021710ch7.iW0(int):void");
                }
            }, C1021710ch7.class);
            if (z) {
                c425220Gls.setOnTouchEvent(new AwS113S0400000_16(this, new C013C(), c425220Gls, c013c, 1));
                c425220Gls.setFlingXRatio(0.15f);
            } else {
                c425220Gls.setOnTouchEvent(AFwS252S0000000_16.get$arr$(393));
                c425220Gls.setFlingXRatio(1.0f);
            }
        }
        C425220Gls c425220Gls2 = this.LLJLL;
        if (c425220Gls2 != null && (anoleProductTilesModel = this.LLJLIL) != null && (list = anoleProductTilesModel.productTiles) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ProductTile productTile : list) {
                List<String> list2 = productTile.urlList;
                if (list2 != null && !list2.isEmpty()) {
                    str = (String) ListProtector.get(list2, 0);
                } else {
                    str = productTile.uri;
                }
                arrayList2.add(new C429440Gsg(LJJ(), str));
            }
            if (arrayList2.size() > 0) {
                this.LLJZIJLIL = 0;
            }
            c425220Gls2.getState().LJFF(null);
            c425220Gls2.getState().LIZLLL(arrayList2, null);
        }
    }

    public C1021680ch4(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJZIJLIL = -1;
        this.LLL = new C1021750chB();
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleProductTilesModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleProductTilesModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AnoleProductTilesModel anoleProductTilesModel = (AnoleProductTilesModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LLJLIL = anoleProductTilesModel;
        C1021790chF c1021790chF = InterfaceC1021730ch9.LIZ;
        AnoleComponentSizeModel anoleComponentSizeModel = anoleComponentModel.size;
        String str = (anoleComponentSizeModel == null || (str = anoleComponentSizeModel.type) == null) ? "" : str;
        c1021790chF.getClass();
        Iterator<InterfaceC1021760chC> it2 = C1021790chF.LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC1021730ch9 interfaceC1021730ch9LIZ = it2.next().LIZ(str, anoleProductTilesModel);
            if (interfaceC1021730ch9LIZ != null) {
                this.LLJLILLLLZIIL = interfaceC1021730ch9LIZ;
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can not create an instance of AnoleProductTilesSizeAdapter for layoutType ");
        sbLIZ.append(str);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
