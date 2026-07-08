package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.03Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C799203Ag extends ConstraintLayout {
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public HorizontalScrollView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;

    public final TuxTextView getOspAggregationGiftForSkusTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pud);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getOspAggregationMainSkuInfoTextLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pue);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getOspAggregationMainSkuNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.puf);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getOspAggregationMainSkuPropsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pug);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final HorizontalScrollView getUsOrderSubmitAggregationMainSkuImagesLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_main_sku_images_layout);
            this.LLILZ = (HorizontalScrollView) callbackFindViewById;
        }
        return (HorizontalScrollView) callbackFindViewById;
    }

    public final LinearLayout getUsOrderSubmitAggregationMainSkuImagesListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_main_sku_images_list);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setImage(List<C719102rN> list) {
        boolean z;
        int i;
        C03IT imageUrlModel;
        int i2;
        String str;
        String str2;
        final int i3 = 0;
        if (list != null && list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        final AttributeSet attributeSet = null;
        if (z) {
            C12ES.LJIILL(0, getOspAggregationMainSkuInfoTextLayoutFromXml());
            C719102rN c719102rN = (C719102rN) C13LP.LJJJLL(list);
            if (c719102rN != null) {
                str = c719102rN.LLJ;
            } else {
                str = null;
            }
            C719102rN c719102rN2 = (C719102rN) C13LP.LJJJLL(list);
            if (c719102rN2 != null) {
                str2 = c719102rN2.LLJI;
            } else {
                str2 = null;
            }
            C0H1U.LJIIL(getOspAggregationMainSkuNameFromXml(), str, true);
            C0H1U.LJIIL(getOspAggregationMainSkuPropsFromXml(), str2, true);
        } else {
            C0H1U.LIZIZ(getOspAggregationMainSkuInfoTextLayoutFromXml());
        }
        LinkedList linkedList = new LinkedList();
        LinearLayout usOrderSubmitAggregationMainSkuImagesListFromXml = getUsOrderSubmitAggregationMainSkuImagesListFromXml();
        while (usOrderSubmitAggregationMainSkuImagesListFromXml.getChildCount() > 0) {
            View childAt = usOrderSubmitAggregationMainSkuImagesListFromXml.getChildAt(0);
            C786410Ut5.LJJJLZIJ(childAt, usOrderSubmitAggregationMainSkuImagesListFromXml);
            if (childAt instanceof C799303Ah) {
                linkedList.add(childAt);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<C719102rN> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LLIZLLLIL);
            }
        }
        HorizontalScrollView usOrderSubmitAggregationMainSkuImagesLayoutFromXml = getUsOrderSubmitAggregationMainSkuImagesLayoutFromXml();
        if (arrayList.size() > 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, usOrderSubmitAggregationMainSkuImagesLayoutFromXml);
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                Image image = (Image) obj;
                C799303Ah c799303Ah = (C799303Ah) C19719612Di.LJJIIZI(linkedList);
                C799303Ah c799303Ah2 = c799303Ah;
                if (c799303Ah == null) {
                    final Context context = getContext();
                    c799303Ah2 = new ConstraintLayout(context, attributeSet, i3) { // from class: X.03Ah
                        public SmartImageView LL;

                        public final SmartImageView getOspAggregationOrderMainSkuListImageFromXml() {
                            KeyEvent.Callback callbackFindViewById = this.LL;
                            if (callbackFindViewById == null) {
                                callbackFindViewById = findViewById(R.id.pui);
                                this.LL = (SmartImageView) callbackFindViewById;
                            }
                            return (SmartImageView) callbackFindViewById;
                        }

                        public final void setOspAggregationOrderMainSkuListImageFromXml(SmartImageView smartImageView) {
                            this.LL = smartImageView;
                        }

                        {
                            super(context, attributeSet, i3);
                            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.apj, this, true);
                        }
                    };
                }
                SmartImageView ospAggregationOrderMainSkuListImageFromXml = c799303Ah2.getOspAggregationOrderMainSkuListImageFromXml();
                if (image != null) {
                    imageUrlModel = image.toImageUrlModel();
                } else {
                    imageUrlModel = null;
                }
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LIZLLL.LIZLLL("product_image_tag");
                c1331670kl3LIZLLL.LJJ(ospAggregationOrderMainSkuListImageFromXml);
                C786410Ut5.h3(c1331670kl3LIZLLL);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                if (i4 == 0) {
                    i2 = 0;
                } else {
                    i2 = 12;
                }
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2)));
                getUsOrderSubmitAggregationMainSkuImagesListFromXml().addView(c799303Ah2, layoutParams);
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void setOspAggregationGiftForSkusTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setOspAggregationMainSkuInfoTextLayoutFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setOspAggregationMainSkuNameFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setOspAggregationMainSkuPropsFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setSkuTitle(String str) {
        C0H1U.LJIIL(getOspAggregationGiftForSkusTitleFromXml(), str, true);
    }

    public final void setUsOrderSubmitAggregationMainSkuImagesLayoutFromXml(HorizontalScrollView horizontalScrollView) {
        this.LLILZ = horizontalScrollView;
    }

    public final void setUsOrderSubmitAggregationMainSkuImagesListFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public C799203Ag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C799203Ag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b1u, this, true);
    }
}
