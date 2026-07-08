package Y;

import X.C0SY7;
import X.C12ES;
import X.C197039127h;
import android.animation.ValueAnimator;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV2VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class AObserverS132S0300000_33 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS132S0300000_33 aObserverS132S0300000_33, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (Intrinsics.LJFF(followStatus.getUserId(), ((User) aObserverS132S0300000_33.l0).getUid())) {
            ((User) aObserverS132S0300000_33.l0).setFollowStatus(followStatus.getFollowStatus());
            int followStatus2 = followStatus.getFollowStatus();
            if (followStatus2 == C0SY7.FOLLOWED.getValue()) {
                ((USSESSellerModuleV2VH) aObserverS132S0300000_33.l1).K6();
            } else {
                if (followStatus2 != C0SY7.UNFOLLOW.getValue()) {
                    return;
                }
                ((USSESSellerModuleV2VH) aObserverS132S0300000_33.l1).C6((USSESSellerModuleVO) aObserverS132S0300000_33.l2);
            }
        }
    }

    public static final void onChanged$1(AObserverS132S0300000_33 aObserverS132S0300000_33, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (Intrinsics.LJFF(followStatus.getUserId(), ((User) aObserverS132S0300000_33.l0).getUid())) {
            ((User) aObserverS132S0300000_33.l0).setFollowStatus(followStatus.getFollowStatus());
            int followStatus2 = followStatus.getFollowStatus();
            if (followStatus2 == C0SY7.FOLLOWED.getValue()) {
                ((USSESSellerModuleV2VH) aObserverS132S0300000_33.l1).K6();
            } else {
                if (followStatus2 != C0SY7.UNFOLLOW.getValue()) {
                    return;
                }
                ((USSESSellerModuleV2VH) aObserverS132S0300000_33.l1).C6((USSESSellerModuleVO) aObserverS132S0300000_33.l2);
            }
        }
    }

    public static final void onChanged$2(AObserverS132S0300000_33 aObserverS132S0300000_33, Object obj) {
        int width;
        FollowStatus followStatus = (FollowStatus) obj;
        if (Intrinsics.LJFF(followStatus.getUserId(), ((User) aObserverS132S0300000_33.l0).getUid())) {
            ((User) aObserverS132S0300000_33.l0).setFollowStatus(followStatus.getFollowStatus());
            int followStatus2 = followStatus.getFollowStatus();
            if (followStatus2 == C0SY7.FOLLOWED.getValue()) {
                USSESSellerModuleV3VH uSSESSellerModuleV3VH = (USSESSellerModuleV3VH) aObserverS132S0300000_33.l1;
                C197039127h c197039127hU6 = uSSESSellerModuleV3VH.U6();
                if (c197039127hU6 != null) {
                    width = c197039127hU6.getWidth();
                } else {
                    width = 0;
                }
                C197039127h c197039127hV6 = uSSESSellerModuleV3VH.V6();
                if (c197039127hV6 != null) {
                    C12ES.LJIILL(4, c197039127hV6);
                }
                int width2 = uSSESSellerModuleV3VH.itemView.findViewById(R.id.njn).getWidth();
                C197039127h c197039127hA7 = uSSESSellerModuleV3VH.a7();
                if (c197039127hA7 != null) {
                    C12ES.LJIILL(0, c197039127hA7);
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, width2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS20S0102000_32(uSSESSellerModuleV3VH, width, width2, 2));
                valueAnimatorOfInt.start();
                return;
            }
            if (followStatus2 != C0SY7.UNFOLLOW.getValue()) {
                return;
            }
            ((USSESSellerModuleV3VH) aObserverS132S0300000_33.l1).v7((USSESSellerModuleVO) aObserverS132S0300000_33.l2);
        }
    }

    public static final void onChanged$3(AObserverS132S0300000_33 aObserverS132S0300000_33, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (Intrinsics.LJFF(followStatus.getUserId(), ((User) aObserverS132S0300000_33.l0).getUid())) {
            ((User) aObserverS132S0300000_33.l0).setFollowStatus(followStatus.getFollowStatus());
            int followStatus2 = followStatus.getFollowStatus();
            if (followStatus2 == C0SY7.FOLLOWED.getValue()) {
                ((USSESSellerModuleVH) aObserverS132S0300000_33.l1).C6();
            } else {
                if (followStatus2 != C0SY7.UNFOLLOW.getValue()) {
                    return;
                }
                ((USSESSellerModuleVH) aObserverS132S0300000_33.l1).v6((USSESSellerModuleVO) aObserverS132S0300000_33.l2);
            }
        }
    }

    public static final void onChanged$4(AObserverS132S0300000_33 aObserverS132S0300000_33, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (Intrinsics.LJFF(followStatus.getUserId(), ((User) aObserverS132S0300000_33.l0).getUid())) {
            ((User) aObserverS132S0300000_33.l0).setFollowStatus(followStatus.getFollowStatus());
            int followStatus2 = followStatus.getFollowStatus();
            if (followStatus2 == C0SY7.FOLLOWED.getValue()) {
                ((USSESSellerModuleVH) aObserverS132S0300000_33.l1).C6();
            } else {
                if (followStatus2 != C0SY7.UNFOLLOW.getValue()) {
                    return;
                }
                ((USSESSellerModuleVH) aObserverS132S0300000_33.l1).v6((USSESSellerModuleVO) aObserverS132S0300000_33.l2);
            }
        }
    }

    public AObserverS132S0300000_33(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
