package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0n6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421960n6g extends FrameLayout {
    public SmartImageView LL;
    public SmartImageView LLILLJJLI;
    public SmartImageView LLILLL;
    public FrameLayout LLILZ;

    public C1421960n6g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final FrameLayout getLabelContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m4c);
            this.LLILZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final SmartImageView getLabelOneFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m4m);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getLabelThreeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m4q);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getLabelTwoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m4s);
            this.LLILLJJLI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final void setLabelContainerFromXml(FrameLayout frameLayout) {
        this.LLILZ = frameLayout;
    }

    public final void setLabelOneFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setLabelThreeFromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setLabelTwoFromXml(SmartImageView smartImageView) {
        this.LLILLJJLI = smartImageView;
    }

    public final void setLabels(List<ProductBannerLabel> list) {
        int iLIZ;
        int iLIZ2;
        int iLIZ3;
        Integer height;
        Integer width;
        ArrayList arrayList = new ArrayList();
        arrayList.add(getLabelOneFromXml());
        arrayList.add(getLabelTwoFromXml());
        arrayList.add(getLabelThreeFromXml());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJZI(8, (ImageView) it2.next());
        }
        if (list != null && !list.isEmpty()) {
            if (list.size() > 3) {
                list = list.subList(0, 3);
            }
            int size = list.size();
            int marginStart = 0;
            for (int i = 0; i < size; i++) {
                C786410Ut5.LJZI(0, (ImageView) ListProtector.get(arrayList, i));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((View) ListProtector.get(arrayList, i)).getLayoutParams();
                Image image = ((ProductBannerLabel) ListProtector.get(list, i)).image;
                if (image != null && (width = image.getWidth()) != null) {
                    iLIZ = (int) C0H9H.LIZ(width.intValue() / 3);
                } else {
                    iLIZ = 0;
                }
                layoutParams.width = iLIZ;
                Image image2 = ((ProductBannerLabel) ListProtector.get(list, i)).image;
                if (image2 != null && (height = image2.getHeight()) != null) {
                    iLIZ2 = (int) C0H9H.LIZ(height.intValue() / 3);
                } else {
                    iLIZ2 = 0;
                }
                layoutParams.height = iLIZ2;
                if (((ProductBannerLabel) ListProtector.get(list, i)).leftRetract != null) {
                    iLIZ3 = (int) C0H9H.LIZ(r0.intValue());
                } else {
                    iLIZ3 = 0;
                }
                layoutParams.setMarginStart(marginStart - iLIZ3);
                C786410Ut5.c6((ImageView) ListProtector.get(arrayList, i), layoutParams);
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                Image image3 = ((ProductBannerLabel) ListProtector.get(list, i)).image;
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image3);
                c1331670kl3LIZLLL.LJJI((ImageView) ListProtector.get(arrayList, i));
                C786410Ut5.h3(c1331670kl3LIZLLL);
                marginStart = layoutParams.width + layoutParams.getMarginStart();
            }
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.width = marginStart;
            float f = 99;
            setTranslationZ(C0H9H.LIZ(f));
            setElevation(C0H9H.LIZ(f));
            getLabelContainerFromXml().setClipToOutline(false);
            getLabelContainerFromXml().setClipChildren(false);
            setClipToOutline(false);
            setClipChildren(false);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams2);
            requestLayout();
        }
    }

    public C1421960n6g(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C1755600vmo.LIZ.getClass();
        C1755600vmo.LIZ(R.layout.asq, context, this, true, false);
    }
}
