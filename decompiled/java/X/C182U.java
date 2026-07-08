package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.182U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182U extends AbstractC212214182y {
    public C18QS LLILZ;
    public ConstraintLayout LLILZIL;
    public C18L9 LLILZLL;
    public C18L9 LLIZ;
    public C18L9 LLIZLLLIL;
    public C18L9 LLJ;
    public C185U LLJI;
    public TuxIconView LLJIJIL;
    public C182T LLJILJIL;
    public final C182B LLJILJILJ;
    public final C212197182h LLJILLL;
    public final C186Z<ViewGroup> LLJJ;
    public final C186B<ConstraintLayout> LLJJI;
    public final C182V<ViewGroup> LLJJIII;
    public final C184W LLJJIJI;
    public final C184W LLJJIJIIJIL;
    public final C0HAL LLJJIJIL;
    public final AnonymousClass1873 LLJJJ;
    public boolean LLJJJIL;
    public final FrameLayout LLJJJJ;
    public int LLJJJJJIL;

    @Override // X.AbstractC212214182y
    public final void e0() {
    }

    private final C18L9 getEcommerceliveSellingPointLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmu);
            this.LLJ = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    @Override // X.AbstractC212214182y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> getContentShowParams() {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182U.getContentShowParams():java.util.Map");
    }

    @Override // X.AbstractC212214182y
    public Map<String, String> getDiscountTagEventParams() {
        String string;
        FeedProduct feedProduct;
        String string2;
        Integer numLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C182T c182t = this.LLJILJIL;
        String str = "";
        if (c182t == null || (numLIZJ = c182t.LIZJ()) == null || (string = numLIZJ.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("product_source", string);
        C182T c182t2 = this.LLJILJIL;
        if (c182t2 != null && (feedProduct = c182t2.LIZ) != null && (string2 = Integer.valueOf(feedProduct.bagIndex).toString()) != null) {
            str = string2;
        }
        linkedHashMap.put("item_order", str);
        linkedHashMap.putAll(C125400do.LIZ(this.LLJJIJI.LIZIZ(), this.LLJJIJIIJIL.LIZIZ()));
        linkedHashMap.putAll(this.LLJILLL.LJFF);
        return linkedHashMap;
    }

    public final C18L9 getEcommerceliveFirstPromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl1);
            this.LLIZ = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final TuxIconView getEcommerceliveIconCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gl8);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C18QS getEcommerceliveProductDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.glx);
            this.LLILZ = (C18QS) callbackFindViewById;
        }
        return (C18QS) callbackFindViewById;
    }

    public final ConstraintLayout getEcommerceliveProductMainImageLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gm8);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C18L9 getEcommercelivePromotionSellingpointLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmo);
            this.LLILZLL = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final C18L9 getEcommerceliveSecondPromotionLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmp);
            this.LLIZLLLIL = (C18L9) callbackFindViewById;
        }
        return (C18L9) callbackFindViewById;
    }

    public final C185U getEcommerceliveSellerBrandFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gmr);
            this.LLJI = (C185U) callbackFindViewById;
        }
        return (C185U) callbackFindViewById;
    }

    @Override // X.AbstractC212214182y
    public Map<String, String> getSellingPointEventParams() {
        String string;
        FeedProduct feedProduct;
        String string2;
        Integer numLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C182T c182t = this.LLJILJIL;
        String str = "";
        if (c182t == null || (numLIZJ = c182t.LIZJ()) == null || (string = numLIZJ.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("product_source", string);
        C182T c182t2 = this.LLJILJIL;
        if (c182t2 != null && (feedProduct = c182t2.LIZ) != null && (string2 = Integer.valueOf(feedProduct.bagIndex).toString()) != null) {
            str = string2;
        }
        linkedHashMap.put("item_order", str);
        linkedHashMap.putAll(this.LLJJIJIL.LIZIZ());
        linkedHashMap.putAll(this.LLJILLL.LJFF);
        return linkedHashMap;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJILJILJ.LIZIZ();
    }

    public final void setEcommerceliveFirstPromotionLayoutFromXml(C18L9 c18l9) {
        this.LLIZ = c18l9;
    }

    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setEcommerceliveProductDescFromXml(C18QS c18qs) {
        this.LLILZ = c18qs;
    }

    public final void setEcommerceliveProductMainImageLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public final void setEcommercelivePromotionSellingpointLayoutFromXml(C18L9 c18l9) {
        this.LLILZLL = c18l9;
    }

    public final void setEcommerceliveSecondPromotionLayoutFromXml(C18L9 c18l9) {
        this.LLIZLLLIL = c18l9;
    }

    public final void setEcommerceliveSellerBrandFromXml(C185U c185u) {
        this.LLJI = c185u;
    }

    public final void i0(FeedProduct feedProduct, long j) {
        List<PromotionLabel> list;
        List<PromotionLabel> list2;
        List<SellingItem> list3;
        List<PromotionLabel> list4;
        List<PromotionLabel> list5;
        PromotionInfo promotionInfo = feedProduct.promotionInfo;
        PromotionInfo promotionInfoCopy = null;
        if (promotionInfo != null) {
            list = promotionInfo.promotionLabels;
        } else {
            list = null;
        }
        boolean zLIZ = C756302xN.LIZ(list);
        PromotionInfo promotionInfo2 = feedProduct.promotionInfo;
        if (promotionInfo2 != null) {
            list2 = promotionInfo2.secondPromotionLabels;
        } else {
            list2 = null;
        }
        boolean zLIZ2 = C756302xN.LIZ(list2);
        SellingView sellingView = feedProduct.sellingView;
        if (sellingView != null) {
            list3 = sellingView.sellingItems;
        } else {
            list3 = null;
        }
        C756302xN.LIZ(list3);
        if (zLIZ && !this.LLJJIJI.LJI()) {
            list4 = C13BV.INSTANCE;
        } else {
            PromotionInfo promotionInfo3 = feedProduct.promotionInfo;
            if (promotionInfo3 != null) {
                list4 = promotionInfo3.promotionLabels;
            } else {
                list4 = null;
            }
        }
        if (zLIZ2 && !this.LLJJIJIIJIL.LJI()) {
            list5 = C13BV.INSTANCE;
        } else {
            PromotionInfo promotionInfo4 = feedProduct.promotionInfo;
            if (promotionInfo4 != null) {
                list5 = promotionInfo4.secondPromotionLabels;
            } else {
                list5 = null;
            }
        }
        if ((zLIZ && !this.LLJJIJI.LJI()) || (zLIZ2 && !this.LLJJIJIIJIL.LJI())) {
            PromotionInfo promotionInfo5 = feedProduct.promotionInfo;
            if (promotionInfo5 != null) {
                promotionInfoCopy = promotionInfo5.copy(list4, list5, promotionInfo5.promotionLabelsShowStyle, promotionInfo5.promotionStickers, promotionInfo5.productPrice, promotionInfo5.placementLabels, promotionInfo5.prelaunchPromotionLabel, promotionInfo5.euComplianceLabels);
            }
            j0(new FeedProduct(feedProduct.productId, feedProduct.title, feedProduct.cover, feedProduct.priceInfo, feedProduct.productType, feedProduct.promotionView, promotionInfoCopy, feedProduct.sellingView, feedProduct.placementLabels, feedProduct.bagIndex, feedProduct.daInfo, feedProduct.schema, feedProduct.source, feedProduct.platform, feedProduct.bcmStandardTrack, feedProduct.LIZ, feedProduct.componentData, feedProduct.auctionData, feedProduct.enhancedBrandLogo), j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(final com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data.FeedProduct r14, final long r15) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182U.j0(com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data.FeedProduct, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C182U(int i, Context context, boolean z) {
        InterfaceC453990HrB<ViewGroup> interfaceC453990HrB;
        C0HAN<ViewGroup> c0han;
        int i2;
        C419160Gc6 c419160Gc6;
        C428700GrU c428700GrU;
        InterfaceC453990HrB<ViewGroup> interfaceC453990HrB2;
        C0HAN<ViewGroup> c0han2;
        super(context, null, 0);
        C182B c182b = new C182B();
        this.LLJILJILJ = c182b;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z4);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(contextThemeWrapper);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedProductView init ,style = ");
        sbLIZ.append(i);
        sbLIZ.append(" , showAsBig = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        int i3 = 31;
        int i4 = 61;
        if (i != 1) {
            if (i != 2) {
                InterfaceC453990HrB<ViewGroup> interfaceC453990HrB3 = new InterfaceC453990HrB<ViewGroup>(i4) { // from class: X.0Gc6
                    public final int LIZ;

                    {
                        this.LIZ = i4;
                    }

                    @Override // X.InterfaceC453990HrB
                    public final View LIZ(ViewGroup viewGroup, PromotionItem promotionItem, boolean z2) {
                        ViewGroup viewGroup2 = viewGroup;
                        if (z2) {
                            return new C419140Gc4(this.LIZ, viewGroup2.getContext());
                        }
                        TuxTextView tuxTextView = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView.setTextAlignment(5);
                        tuxTextView.setTuxFont(this.LIZ);
                        tuxTextView.setTextColorRes(R.attr.eh);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setText(promotionItem.getPreviewShowText());
                        return tuxTextView;
                    }
                };
                c0han2 = new C0HAN<ViewGroup>(i4, z) { // from class: X.0GrU
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i4;
                        this.LIZIZ = z;
                    }

                    @Override // X.C0HAN
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String strLIZIZ2;
                        Resources resources;
                        int i5;
                        ViewGroup viewGroup2 = viewGroup;
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = viewGroup2.getContext();
                            int iGenerateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2);
                            if (numLIZJ != null) {
                                tuxIconView.setTintColor(numLIZJ.intValue());
                            }
                            tuxIconView.setId(iGenerateViewId);
                            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                            tuxTextView.setTextAlignment(5);
                            tuxTextView.setText(sellingItem.showText);
                            tuxTextView.setTuxFont(this.LIZ);
                            tuxTextView.setMaxLines(1);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView.setTextColorRes(R.attr.eh);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i5 = R.dimen.u7;
                            } else {
                                resources = context2.getResources();
                                i5 = R.dimen.tx;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i5);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.ug));
                            linearLayout.addView(tuxTextView, layoutParams);
                            return linearLayout;
                        }
                        TuxTextView tuxTextView2 = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView2.setTextAlignment(5);
                        tuxTextView2.setTuxFont(this.LIZ);
                        tuxTextView2.setTextColorRes(R.attr.eh);
                        tuxTextView2.setMaxLines(1);
                        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        if (3 == sellingItem.sellingItemType) {
                            strLIZIZ2 = sellingItem.optShowText;
                            if (strLIZIZ2 == null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(sellingItem.showText);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(tuxTextView2.getContext().getResources().getString(2131832822));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else {
                            strLIZIZ2 = sellingItem.showText;
                        }
                        tuxTextView2.setText(strLIZIZ2);
                        return tuxTextView2;
                    }
                };
                interfaceC453990HrB2 = interfaceC453990HrB3;
            } else if (z) {
                C786410Ut5.Sd(R.layout.bvg, layoutInflaterNe, this);
                InterfaceC453990HrB<ViewGroup> interfaceC453990HrB4 = new InterfaceC453990HrB<ViewGroup>(i3) { // from class: X.0Gc6
                    public final int LIZ;

                    {
                        this.LIZ = i3;
                    }

                    @Override // X.InterfaceC453990HrB
                    public final View LIZ(ViewGroup viewGroup, PromotionItem promotionItem, boolean z2) {
                        ViewGroup viewGroup2 = viewGroup;
                        if (z2) {
                            return new C419140Gc4(this.LIZ, viewGroup2.getContext());
                        }
                        TuxTextView tuxTextView = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView.setTextAlignment(5);
                        tuxTextView.setTuxFont(this.LIZ);
                        tuxTextView.setTextColorRes(R.attr.eh);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setText(promotionItem.getPreviewShowText());
                        return tuxTextView;
                    }
                };
                c0han2 = new C0HAN<ViewGroup>(i3, z) { // from class: X.0GrU
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i3;
                        this.LIZIZ = z;
                    }

                    @Override // X.C0HAN
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String strLIZIZ2;
                        Resources resources;
                        int i5;
                        ViewGroup viewGroup2 = viewGroup;
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = viewGroup2.getContext();
                            int iGenerateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2);
                            if (numLIZJ != null) {
                                tuxIconView.setTintColor(numLIZJ.intValue());
                            }
                            tuxIconView.setId(iGenerateViewId);
                            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                            tuxTextView.setTextAlignment(5);
                            tuxTextView.setText(sellingItem.showText);
                            tuxTextView.setTuxFont(this.LIZ);
                            tuxTextView.setMaxLines(1);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView.setTextColorRes(R.attr.eh);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i5 = R.dimen.u7;
                            } else {
                                resources = context2.getResources();
                                i5 = R.dimen.tx;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i5);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.ug));
                            linearLayout.addView(tuxTextView, layoutParams);
                            return linearLayout;
                        }
                        TuxTextView tuxTextView2 = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView2.setTextAlignment(5);
                        tuxTextView2.setTuxFont(this.LIZ);
                        tuxTextView2.setTextColorRes(R.attr.eh);
                        tuxTextView2.setMaxLines(1);
                        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        if (3 == sellingItem.sellingItemType) {
                            strLIZIZ2 = sellingItem.optShowText;
                            if (strLIZIZ2 == null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(sellingItem.showText);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(tuxTextView2.getContext().getResources().getString(2131832822));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else {
                            strLIZIZ2 = sellingItem.showText;
                        }
                        tuxTextView2.setText(strLIZIZ2);
                        return tuxTextView2;
                    }
                };
                interfaceC453990HrB2 = interfaceC453990HrB4;
            } else {
                C786410Ut5.Sd(R.layout.bvj, layoutInflaterNe, this);
                int i5 = 71;
                InterfaceC453990HrB<ViewGroup> interfaceC453990HrB5 = new InterfaceC453990HrB<ViewGroup>(i5) { // from class: X.0Gc6
                    public final int LIZ;

                    {
                        this.LIZ = i5;
                    }

                    @Override // X.InterfaceC453990HrB
                    public final View LIZ(ViewGroup viewGroup, PromotionItem promotionItem, boolean z2) {
                        ViewGroup viewGroup2 = viewGroup;
                        if (z2) {
                            return new C419140Gc4(this.LIZ, viewGroup2.getContext());
                        }
                        TuxTextView tuxTextView = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView.setTextAlignment(5);
                        tuxTextView.setTuxFont(this.LIZ);
                        tuxTextView.setTextColorRes(R.attr.eh);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setText(promotionItem.getPreviewShowText());
                        return tuxTextView;
                    }
                };
                c0han2 = new C0HAN<ViewGroup>(i5, z) { // from class: X.0GrU
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i5;
                        this.LIZIZ = z;
                    }

                    @Override // X.C0HAN
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String strLIZIZ2;
                        Resources resources;
                        int i52;
                        ViewGroup viewGroup2 = viewGroup;
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = viewGroup2.getContext();
                            int iGenerateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2);
                            if (numLIZJ != null) {
                                tuxIconView.setTintColor(numLIZJ.intValue());
                            }
                            tuxIconView.setId(iGenerateViewId);
                            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                            tuxTextView.setTextAlignment(5);
                            tuxTextView.setText(sellingItem.showText);
                            tuxTextView.setTuxFont(this.LIZ);
                            tuxTextView.setMaxLines(1);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView.setTextColorRes(R.attr.eh);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i52 = R.dimen.u7;
                            } else {
                                resources = context2.getResources();
                                i52 = R.dimen.tx;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i52);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.ug));
                            linearLayout.addView(tuxTextView, layoutParams);
                            return linearLayout;
                        }
                        TuxTextView tuxTextView2 = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView2.setTextAlignment(5);
                        tuxTextView2.setTuxFont(this.LIZ);
                        tuxTextView2.setTextColorRes(R.attr.eh);
                        tuxTextView2.setMaxLines(1);
                        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        if (3 == sellingItem.sellingItemType) {
                            strLIZIZ2 = sellingItem.optShowText;
                            if (strLIZIZ2 == null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(sellingItem.showText);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(tuxTextView2.getContext().getResources().getString(2131832822));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else {
                            strLIZIZ2 = sellingItem.showText;
                        }
                        tuxTextView2.setText(strLIZIZ2);
                        return tuxTextView2;
                    }
                };
                interfaceC453990HrB2 = interfaceC453990HrB5;
            }
            i2 = 1;
            c428700GrU = c0han2;
            c419160Gc6 = interfaceC453990HrB2;
        } else {
            if (z) {
                C786410Ut5.Sd(R.layout.bvf, layoutInflaterNe, this);
                InterfaceC453990HrB<ViewGroup> interfaceC453990HrB6 = new InterfaceC453990HrB<ViewGroup>(i3) { // from class: X.0Gc6
                    public final int LIZ;

                    {
                        this.LIZ = i3;
                    }

                    @Override // X.InterfaceC453990HrB
                    public final View LIZ(ViewGroup viewGroup, PromotionItem promotionItem, boolean z2) {
                        ViewGroup viewGroup2 = viewGroup;
                        if (z2) {
                            return new C419140Gc4(this.LIZ, viewGroup2.getContext());
                        }
                        TuxTextView tuxTextView = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView.setTextAlignment(5);
                        tuxTextView.setTuxFont(this.LIZ);
                        tuxTextView.setTextColorRes(R.attr.eh);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setText(promotionItem.getPreviewShowText());
                        return tuxTextView;
                    }
                };
                c0han = new C0HAN<ViewGroup>(i3, z) { // from class: X.0GrU
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i3;
                        this.LIZIZ = z;
                    }

                    @Override // X.C0HAN
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String strLIZIZ2;
                        Resources resources;
                        int i52;
                        ViewGroup viewGroup2 = viewGroup;
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = viewGroup2.getContext();
                            int iGenerateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2);
                            if (numLIZJ != null) {
                                tuxIconView.setTintColor(numLIZJ.intValue());
                            }
                            tuxIconView.setId(iGenerateViewId);
                            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                            tuxTextView.setTextAlignment(5);
                            tuxTextView.setText(sellingItem.showText);
                            tuxTextView.setTuxFont(this.LIZ);
                            tuxTextView.setMaxLines(1);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView.setTextColorRes(R.attr.eh);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i52 = R.dimen.u7;
                            } else {
                                resources = context2.getResources();
                                i52 = R.dimen.tx;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i52);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.ug));
                            linearLayout.addView(tuxTextView, layoutParams);
                            return linearLayout;
                        }
                        TuxTextView tuxTextView2 = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView2.setTextAlignment(5);
                        tuxTextView2.setTuxFont(this.LIZ);
                        tuxTextView2.setTextColorRes(R.attr.eh);
                        tuxTextView2.setMaxLines(1);
                        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        if (3 == sellingItem.sellingItemType) {
                            strLIZIZ2 = sellingItem.optShowText;
                            if (strLIZIZ2 == null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(sellingItem.showText);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(tuxTextView2.getContext().getResources().getString(2131832822));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else {
                            strLIZIZ2 = sellingItem.showText;
                        }
                        tuxTextView2.setText(strLIZIZ2);
                        return tuxTextView2;
                    }
                };
                interfaceC453990HrB = interfaceC453990HrB6;
            } else {
                C786410Ut5.Sd(R.layout.bvi, layoutInflaterNe, this);
                InterfaceC453990HrB<ViewGroup> interfaceC453990HrB7 = new InterfaceC453990HrB<ViewGroup>(i4) { // from class: X.0Gc6
                    public final int LIZ;

                    {
                        this.LIZ = i4;
                    }

                    @Override // X.InterfaceC453990HrB
                    public final View LIZ(ViewGroup viewGroup, PromotionItem promotionItem, boolean z2) {
                        ViewGroup viewGroup2 = viewGroup;
                        if (z2) {
                            return new C419140Gc4(this.LIZ, viewGroup2.getContext());
                        }
                        TuxTextView tuxTextView = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView.setTextAlignment(5);
                        tuxTextView.setTuxFont(this.LIZ);
                        tuxTextView.setTextColorRes(R.attr.eh);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setText(promotionItem.getPreviewShowText());
                        return tuxTextView;
                    }
                };
                c0han = new C0HAN<ViewGroup>(i4, z) { // from class: X.0GrU
                    public final int LIZ;
                    public final boolean LIZIZ;

                    {
                        this.LIZ = i4;
                        this.LIZIZ = z;
                    }

                    @Override // X.C0HAN
                    public final View LIZ(ViewGroup viewGroup, SellingItem sellingItem) {
                        String strLIZIZ2;
                        Resources resources;
                        int i52;
                        ViewGroup viewGroup2 = viewGroup;
                        if (sellingItem.sellingItemType == 7) {
                            Context context2 = viewGroup2.getContext();
                            int iGenerateViewId = View.generateViewId();
                            TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6, null);
                            tuxIconView.setIconRes(R.raw.icon_star_fill);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context2);
                            if (numLIZJ != null) {
                                tuxIconView.setTintColor(numLIZJ.intValue());
                            }
                            tuxIconView.setId(iGenerateViewId);
                            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                            tuxTextView.setTextAlignment(5);
                            tuxTextView.setText(sellingItem.showText);
                            tuxTextView.setTuxFont(this.LIZ);
                            tuxTextView.setMaxLines(1);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView.setTextColorRes(R.attr.eh);
                            LinearLayout linearLayout = new LinearLayout(context2);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            if (this.LIZIZ) {
                                resources = context2.getResources();
                                i52 = R.dimen.u7;
                            } else {
                                resources = context2.getResources();
                                i52 = R.dimen.tx;
                            }
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(i52);
                            linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(context2.getResources().getDimensionPixelOffset(R.dimen.ug));
                            linearLayout.addView(tuxTextView, layoutParams);
                            return linearLayout;
                        }
                        TuxTextView tuxTextView2 = new TuxTextView(viewGroup2.getContext(), null, 6, 0);
                        tuxTextView2.setTextAlignment(5);
                        tuxTextView2.setTuxFont(this.LIZ);
                        tuxTextView2.setTextColorRes(R.attr.eh);
                        tuxTextView2.setMaxLines(1);
                        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        if (3 == sellingItem.sellingItemType) {
                            strLIZIZ2 = sellingItem.optShowText;
                            if (strLIZIZ2 == null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(sellingItem.showText);
                                sbLIZ2.append(' ');
                                sbLIZ2.append(tuxTextView2.getContext().getResources().getString(2131832822));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else {
                            strLIZIZ2 = sellingItem.showText;
                        }
                        tuxTextView2.setText(strLIZIZ2);
                        return tuxTextView2;
                    }
                };
                interfaceC453990HrB = interfaceC453990HrB7;
            }
            i2 = 2;
            c428700GrU = c0han;
            c419160Gc6 = interfaceC453990HrB;
        }
        setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmf));
        this.LLJJ = new C186Z<>(this, new C212296186c(), z ? 1 : 2);
        C212197182h c212197182h = new C212197182h(getEcommerceliveProductDescFromXml());
        this.LLJILLL = c212197182h;
        c212197182h.LJIIL(i2);
        C186B<ConstraintLayout> c186b = new C186B<>(getEcommerceliveProductMainImageLayoutFromXml(), new C428460Gr6(z));
        c186b.LJIJI(new C428560GrG());
        this.LLJJI = c186b;
        C182V<ViewGroup> c182v = new C182V<>(getEcommercelivePromotionSellingpointLayoutFromXml(), c419160Gc6, c428700GrU);
        this.LLJJIII = c182v;
        C0HAL c0hal = new C0HAL(getEcommerceliveSellingPointLayoutFromXml());
        c0hal.LJIILJJIL(new C1914807ek() { // from class: X.07el
            public final boolean LJIL = true;
            public final int LJJ = 61;

            @Override // X.C1914807ek, X.C1914707ej, X.C0HAK
            public final int LIZIZ() {
                return this.LJJ;
            }

            @Override // X.C1914707ej, X.C0HAK
            public final boolean LJIIJ() {
                return this.LJIL;
            }
        });
        this.LLJJIJIL = c0hal;
        C184W c184w = new C184W(getEcommerceliveFirstPromotionLayoutFromXml());
        Map<EnumC1981207pS, InterfaceC212247184f> mapLIZ = C1917107f7.LIZ();
        EnumC1981207pS enumC1981207pS = EnumC1981207pS.DEFAULT;
        mapLIZ.put(enumC1981207pS, new C212195182f());
        EnumC1981207pS enumC1981207pS2 = EnumC1981207pS.FLASH_SALE;
        mapLIZ.put(enumC1981207pS2, new C1916707f3());
        EnumC1981207pS enumC1981207pS3 = EnumC1981207pS.FIRST_ORDER;
        mapLIZ.put(enumC1981207pS3, new C212194182e());
        c184w.LJI = mapLIZ;
        this.LLJJIJI = c184w;
        C184W c184w2 = new C184W(getEcommerceliveSecondPromotionLayoutFromXml());
        Map<EnumC1981207pS, InterfaceC212247184f> mapLIZ2 = C1917107f7.LIZ();
        mapLIZ2.put(enumC1981207pS, new C212195182f());
        mapLIZ2.put(enumC1981207pS2, new C1916707f3());
        mapLIZ2.put(enumC1981207pS3, new C212194182e());
        c184w2.LJI = mapLIZ2;
        this.LLJJIJIIJIL = c184w2;
        c182b.LIZ(c182v);
        c182b.LIZ(c184w);
        c182b.LIZ(c184w2);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.b_s);
        this.LLJJJJ = frameLayout;
        if (frameLayout != null) {
            this.LLJJJ = new AnonymousClass1873(frameLayout, 0, 6);
        }
        C786410Ut5.a9(getEcommerceliveIconCloseFromXml(), new ACListenerS166S0100000_32(this, 87));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
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
    @Override // X.AbstractC212214182y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(X.C182T r29, long r30, com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard r32, java.lang.Integer r33) {
        /*
            Method dump skipped, instruction units count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182U.h0(X.182T, long, com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard, java.lang.Integer):void");
    }
}
