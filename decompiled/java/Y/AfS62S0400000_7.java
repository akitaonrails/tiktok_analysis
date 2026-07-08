package Y;

import X.C013C;
import X.C09JN;
import X.C0K6W;
import X.C0K7M;
import X.C0W78;
import X.C1C7U;
import X.C259800zU;
import X.C497120JeY;
import X.C498770JhD;
import X.C500770JkR;
import X.C500840JkY;
import X.InterfaceC1103130eoR;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public class AfS62S0400000_7 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS62S0400000_7 afS62S0400000_7, Object obj) {
        C1C7U.LIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$2");
        C259800zU c259800zU = (C259800zU) afS62S0400000_7.l1;
        C0K6W c0k6w = (C0K6W) afS62S0400000_7.l2;
        PrivilegeRepository privilegeRepository = (PrivilegeRepository) afS62S0400000_7.l0;
        ARunnableS6S0500000_7 aRunnableS6S0500000_7 = new ARunnableS6S0500000_7(c259800zU, c0k6w, (PGCGetSubPrivilegeDetailResponse.Data) obj, privilegeRepository, (C0K7M) afS62S0400000_7.l3, 0);
        privilegeRepository.getClass();
        aRunnableS6S0500000_7.run();
        C1C7U.LIZIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$2");
    }

    public static final void accept$1(AfS62S0400000_7 afS62S0400000_7, Object obj) {
        C1C7U.LIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$3");
        C259800zU c259800zU = (C259800zU) afS62S0400000_7.l1;
        C0K6W c0k6w = (C0K6W) afS62S0400000_7.l2;
        PrivilegeRepository privilegeRepository = (PrivilegeRepository) afS62S0400000_7.l0;
        ARunnableS6S0500000_7 aRunnableS6S0500000_7 = new ARunnableS6S0500000_7(c259800zU, c0k6w, (Throwable) obj, privilegeRepository, (C0K7M) afS62S0400000_7.l3, 1);
        privilegeRepository.getClass();
        aRunnableS6S0500000_7.run();
        C1C7U.LIZIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$3");
    }

    public static final void accept$2(AfS62S0400000_7 afS62S0400000_7, Object obj) {
        Room room;
        User owner;
        C1C7U.LIZ("LiveRepostManager@c2f7.handleRepostBubble$3");
        FollowPair followPair = (FollowPair) obj;
        if (followPair != null && followPair.LIZIZ() && followPair.LIZ != 0 && (room = (Room) afS62S0400000_7.l0) != null && (owner = room.getOwner()) != null && followPair.LIZ == owner.getId()) {
            ((C498770JhD) afS62S0400000_7.l1).LIZJ((InterfaceC1103130eoR) afS62S0400000_7.l2, (DataChannel) afS62S0400000_7.l3);
        }
        C1C7U.LIZIZ("LiveRepostManager@c2f7.handleRepostBubble$3");
    }

    public static final void accept$3(AfS62S0400000_7 afS62S0400000_7, Object obj) {
        C1C7U.LIZ("LiveCombineReqeust@92d7.checkCombine$4");
        List list = (List) afS62S0400000_7.l0;
        C497120JeY c497120JeY = (C497120JeY) afS62S0400000_7.l1;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c497120JeY.LJFF.remove(it2.next());
        }
        ((C497120JeY) afS62S0400000_7.l1).LIZLLL((List) afS62S0400000_7.l2, (Function2) afS62S0400000_7.l3);
        C1C7U.LIZIZ("LiveCombineReqeust@92d7.checkCombine$4");
    }

    public static final void accept$4(AfS62S0400000_7 afS62S0400000_7, Object obj) {
        LiveDialogFragment liveDialogFragment;
        C1C7U.LIZ("FloatWindowPermitCheckInterceptor@d0b8.checkPermissionV2$2$dispose$1");
        if (obj == Lifecycle.Event.ON_RESUME) {
            boolean zLJFF = C0W78.LJFF(((C500840JkY) afS62S0400000_7.l0).LIZ);
            if (zLJFF && (liveDialogFragment = (LiveDialogFragment) afS62S0400000_7.l1) != null && liveDialogFragment.isShowing()) {
                ((LiveDialogFragment) afS62S0400000_7.l1).dismiss();
            }
            if (!((C013C) afS62S0400000_7.l2).element && !zLJFF) {
                C500770JkR c500770JkR = (C500770JkR) afS62S0400000_7.l3;
                c500770JkR.LIZ = "back_from_overlay";
                c500770JkR.LIZLLL();
            }
            ((C013C) afS62S0400000_7.l2).element = false;
        }
        C1C7U.LIZIZ("FloatWindowPermitCheckInterceptor@d0b8.checkPermissionV2$2$dispose$1");
    }

    public AfS62S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
