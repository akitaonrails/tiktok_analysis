package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendProduct;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS45S0200000_29;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11yS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19675411yS extends FrameLayout {
    public C424560Gko LL;

    public C19675411yS() {
        throw null;
    }

    public final C424560Gko getRecommendImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sx5);
            this.LL = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    public final void setRecommendImageFromXml(C424560Gko c424560Gko) {
        this.LL = c424560Gko;
    }

    public final void setRoundedCornerRadius(float f) {
        getRecommendImageFromXml().setCornerRadius(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19675411yS(Context context, SysRecommendFeedItem sysRecommendFeedItem, Function1 function1) {
        SysRecommendProduct sysRecommendProduct;
        List<Image> list;
        super(context, null, 0);
        Object obj = null;
        FrameLayout.inflate(context, R.layout.brr, this);
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        if (sysRecommendFeedItem != null && (sysRecommendProduct = sysRecommendFeedItem.product) != null && (list = sysRecommendProduct.images) != null) {
            obj = ListProtector.get(list, 0);
        }
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(obj);
        c1331670kl3LIZLLL.LJJ(getRecommendImageFromXml());
        C786410Ut5.h3(c1331670kl3LIZLLL);
        C786410Ut5.I7(new AjS45S0200000_29(function1, sysRecommendFeedItem, 1), this);
    }
}
