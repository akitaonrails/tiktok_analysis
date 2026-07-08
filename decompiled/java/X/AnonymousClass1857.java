package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS72S0100000_32;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1857, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1857 extends ConstraintLayout implements InterfaceC1748810vbr {
    public final ConstraintLayout LL;
    public final C18QS LLILLJJLI;
    public final C18L9 LLILLL;
    public final FrameLayout LLILZ;
    public final C18L9 LLILZIL;
    public final C426160GnO LLILZLL;
    public final C197039127h LLIZ;
    public final C212254184m LLIZLLLIL;
    public final C185A LLJ;
    public final AnonymousClass1862<C426160GnO> LLJI;
    public final C186B<ConstraintLayout> LLJIJIL;
    public final C0HAO LLJILJIL;
    public final C212253184l LLJILJILJ;
    public final C212252184k LLJILLL;
    public final C185N LLJJ;
    public final C185S LLJJI;
    public C1744020vU8 LLJJIII;
    public C212281185n LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C1766200w3u LLJJIJIL;

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    public final Map<String, String> getCommonShowParams() {
        String strLJJLIIIJ;
        Product product;
        PromotionInfo promotionInfo;
        List<PlacementLabel> list;
        Object obj;
        String string;
        Product product2;
        PromotionInfo promotionInfo2;
        PromotionLabel promotionLabel;
        Map<String, Object> map;
        Object obj2;
        String string2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLJIILIIL = this.LLJILLL.LJIILIIL();
        if (strLJIILIIL != null) {
            linkedHashMap.put("flashsale_status", strLJIILIIL);
        }
        String strLJIIL = this.LLJILLL.LJIIL();
        if (strLJIIL != null) {
            linkedHashMap.put("countdown_type", strLJIIL);
        }
        linkedHashMap.put("is_free_shipping", this.LLJILLL.LIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("promotion_label_level", "3");
        List<String> listLJIIJJI = this.LLJILLL.LJIIJJI();
        ArrayList arrayList = new ArrayList();
        C1744020vU8 c1744020vU8 = this.LLJJIII;
        if (c1744020vU8 != null && (product2 = c1744020vU8.LIZ) != null && (promotionInfo2 = product2.promotionInfo) != null && (promotionLabel = promotionInfo2.prelaunchPromotionLabel) != null && (map = promotionLabel.daInfo) != null && (obj2 = map.get("activity_name")) != null && (string2 = obj2.toString()) != null && C123100dR.LIZ(string2)) {
            arrayList.add(string2);
        }
        ArrayList arrayList2 = new ArrayList();
        C1744020vU8 c1744020vU82 = this.LLJJIII;
        if (c1744020vU82 != null && (product = c1744020vU82.LIZ) != null && (promotionInfo = product.promotionInfo) != null && (list = promotionInfo.placementLabels) != null) {
            Iterator<PlacementLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                List<PromotionLabel> list2 = it2.next().placementLabelList;
                if (list2 != null) {
                    Iterator<PromotionLabel> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Map<String, Object> map2 = it3.next().daInfo;
                        if (map2 != null && (obj = map2.get("activity_name")) != null && (string = obj.toString()) != null && C123100dR.LIZ(string)) {
                            arrayList2.add(string);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = (ArrayList) C13LP.LJLIL(arrayList2, C13LP.LJLIL(arrayList, listLJIIJJI));
        if (arrayList3.isEmpty()) {
            strLJJLIIIJ = "";
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (C123100dR.LIZ((String) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
        }
        linkedHashMap.put("activity_name", strLJJLIIIJ);
        return linkedHashMap;
    }

    public final Map<String, String> getEventParamForContentShow() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLIZIZ = this.LLJJI.LIZIZ(1);
        if (mapLIZIZ != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        Map<String, String> mapLIZIZ2 = this.LLJJI.LIZIZ(2);
        if (mapLIZIZ2 != null) {
            linkedHashMap.putAll(mapLIZIZ2);
        }
        C19676311yb.LJ(linkedHashMap, getCommonShowParams());
        return linkedHashMap;
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIZLLLIL.LIZIZ();
    }

    public final C197039127h getBtnBuy() {
        return this.LLIZ;
    }

    public final ConstraintLayout getClProductMainImageLayout() {
        return this.LL;
    }

    public final FrameLayout getFlFansTag() {
        return this.LLILZ;
    }

    public final C426160GnO getFlProductPriceLayout() {
        return this.LLILZLL;
    }

    public final C18L9 getPromotionLayout() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1748810vbr
    public List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    public final C18L9 getSellingPointViewLayout() {
        return this.LLILLL;
    }

    public final C18QS getTvProductDesc() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void h0(final Product product) {
        long j;
        List<SellingItem> list;
        List<PromotionLabel> list2;
        ArrayList arrayList = new ArrayList();
        PromotionInfo promotionInfo = product.promotionInfo;
        PromotionLabel promotionLabel = null;
        if (promotionInfo != null && (list2 = promotionInfo.promotionLabels) != null) {
            for (PromotionLabel promotionLabel2 : list2) {
                if (C19676311yb.LIZLLL(promotionLabel2)) {
                    promotionLabel = promotionLabel2;
                } else {
                    arrayList.add(promotionLabel2);
                }
            }
        }
        this.LLJILJILJ.LJIIJ(promotionLabel);
        ?? LJFF = this.LLJILJILJ.LJFF();
        SellingView sellingView = product.sellingView;
        if (sellingView != null && (list = sellingView.sellingItems) != null) {
            this.LLJILJIL.LJIIL(new C0HAQ(list));
        }
        ?? r3 = LJFF;
        if (this.LLJILJIL.LJFF()) {
            r3 = LJFF + 1;
        }
        if (r3 < 2) {
            C212252184k c212252184k = this.LLJILLL;
            C212281185n c212281185n = this.LLJJIJI;
            long j2 = 0;
            if (c212281185n != null) {
                j = c212281185n.LIZ;
                j2 = c212281185n.LIZIZ;
            } else {
                j = 0;
            }
            c212252184k.LJIILL(new C212257184p(arrayList, j, j2, true, 96));
            C212252184k c212252184k2 = this.LLJILLL;
            c212252184k2.LIZIZ = new InterfaceC212286185s() { // from class: X.185l
                @Override // X.InterfaceC212286185s
                public final void LIZ() {
                    this.LIZ.h0(product);
                }
            };
            if (!c212252184k2.LJFF() || r3 + 1 < 2) {
                this.LLJ.LJIIJJI(2);
                return;
            }
        }
        this.LLJ.LJIIJJI(1);
    }

    public final void setClickListener(C1766200w3u c1766200w3u) {
        this.LLJJIJIL = c1766200w3u;
    }

    public AnonymousClass1857(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(View view, View view2) {
        if (view.getVisibility() == 0) {
            if (view.getBottom() + C1210230hbB.LIZ(4, getContext()) <= view2.getTop()) {
                C19ME c19me = (C19ME) view.getLayoutParams();
                if (c19me.endToStart != -1 || c19me.endToEnd != view2.getId()) {
                    c19me.endToStart = -1;
                    c19me.endToEnd = view2.getId();
                    c19me.setMarginEnd(0);
                    C786410Ut5.W5(view, c19me);
                    return;
                }
                return;
            }
            C19ME c19me2 = (C19ME) view.getLayoutParams();
            if (c19me2.endToEnd == -1 && c19me2.endToStart == view2.getId()) {
                return;
            }
            c19me2.endToEnd = -1;
            c19me2.endToStart = view2.getId();
            c19me2.setMarginEnd(C1210230hbB.LIZ(8, getContext()));
            C786410Ut5.W5(view, c19me2);
            return;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("only visible benefitView need check");
    }

    public AnonymousClass1857(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C212254184m c212254184m = new C212254184m();
        this.LLIZLLLIL = c212254184m;
        C185S c185s = new C185S();
        this.LLJJI = c185s;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.zd);
        C786410Ut5.Sd(R.layout.bxx, C786410Ut5.ne(contextThemeWrapper), this);
        setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmg));
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.gm8);
        this.LL = constraintLayout;
        C18QS c18qs = (C18QS) findViewById(R.id.glx);
        this.LLILLJJLI = c18qs;
        C18L9 c18l9 = (C18L9) findViewById(R.id.up2);
        this.LLILLL = c18l9;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.gkr);
        this.LLILZ = frameLayout;
        C18L9 c18l92 = (C18L9) findViewById(R.id.gmk);
        this.LLILZIL = c18l92;
        C426160GnO c426160GnO = (C426160GnO) findViewById(R.id.gmd);
        this.LLILZLL = c426160GnO;
        C197039127h c197039127h = (C197039127h) findViewById(R.id.gke);
        this.LLIZ = c197039127h;
        C186B<ConstraintLayout> c186b = new C186B<>(constraintLayout, new C428480Gr8());
        c186b.LJIJI(new C428550GrF());
        this.LLJIJIL = c186b;
        this.LLJ = new C185A(c18qs);
        C0HAO c0hao = new C0HAO(c18l9);
        c0hao.LJIILIIL(new C0GSC());
        this.LLJILJIL = c0hao;
        this.LLJILJILJ = new C212253184l(frameLayout);
        C212252184k c212252184k = new C212252184k(c18l92, null);
        c212252184k.LJFF = C182X.LIZ();
        this.LLJILLL = c212252184k;
        C185N c185n = new C185N(c197039127h);
        c185n.LJIILIIL(new C212270185c() { // from class: X.185W
            public final float LIZ = C418440Gaw.LIZIZ(4);

            @Override // X.InterfaceC212288185u
            public final float LIZ() {
                return this.LIZ;
            }
        });
        this.LLJJ = c185n;
        AnonymousClass1862<C426160GnO> anonymousClass1862 = new AnonymousClass1862<>(c426160GnO, new C186R());
        C19344710mD c19344710mD = new C19344710mD();
        anonymousClass1862.LJIILIIL(c19344710mD);
        anonymousClass1862.LJI.LJ(c19344710mD);
        this.LLJI = anonymousClass1862;
        c212254184m.LIZ(c212252184k);
        c212254184m.LIZ(c186b);
        c185s.LIZ(1, c212252184k, true);
        c185s.LIZ(2, c0hao, true);
        C786410Ut5.I7(new AjS72S0100000_32(this, 1), c197039127h);
        C786410Ut5.I7(new AjS72S0100000_32(this, 2), this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e0(this.LLILZIL, this.LLIZ);
        e0(this.LLILLL, this.LLIZ);
        this.LLJILLL.LIZJ();
        this.LLJILJIL.LIZJ();
        if (!this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = true;
        }
    }
}
