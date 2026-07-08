package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1.SeaPdpHeadGodaV1ViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh.AbsCardVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.service.SeaLiveDiProvider;

/* JADX INFO: renamed from: X.0wJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776040wJm implements ViewModelStoreOwner {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        switch (this.$t) {
            case 0:
                return getViewModelStore$0(this);
            case 1:
                return getViewModelStore$1(this);
            case 2:
                return getViewModelStore$2(this);
            case 3:
                return getViewModelStore$3(this);
            case 4:
                return getViewModelStore$4(this);
            case 5:
                return getViewModelStore$5(this);
            default:
                return null;
        }
    }

    public static final ViewModelStore getViewModelStore$0(C1776040wJm c1776040wJm) {
        return (ViewModelStore) ((SeaPdpHeadGodaV1ViewHolder) c1776040wJm.l0).LLJJJIL.getValue();
    }

    public static final ViewModelStore getViewModelStore$1(C1776040wJm c1776040wJm) {
        return (ViewModelStore) ((AbsCardVH) c1776040wJm.l0).LLJILJILJ.getValue();
    }

    public static final ViewModelStore getViewModelStore$2(C1776040wJm c1776040wJm) {
        return (ViewModelStore) ((SeaPdpBodyWidget) c1776040wJm.l0).LLJI.getValue();
    }

    public static final ViewModelStore getViewModelStore$3(C1776040wJm c1776040wJm) {
        return (ViewModelStore) ((SeaLiveDiProvider) c1776040wJm.l0).LLILLL.getValue();
    }

    public static final ViewModelStore getViewModelStore$4(C1776040wJm c1776040wJm) {
        return (ViewModelStore) ((C1764480w18) c1776040wJm.l0).LLILZIL.getValue();
    }

    public static final ViewModelStore getViewModelStore$5(C1776040wJm c1776040wJm) {
        return (ViewModelStore) ((C1756870vor) c1776040wJm.l0).LLILLL.getValue();
    }

    public C1776040wJm(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
