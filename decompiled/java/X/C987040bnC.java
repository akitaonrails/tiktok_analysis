package X;

import Y.ARunnableS115S0100000_15;
import android.os.MessageQueue;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;

/* JADX INFO: renamed from: X.0bnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987040bnC implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            case 2:
                return queueIdle$2(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C987040bnC c987040bnC) {
        User owner;
        ImageModel avatarThumb;
        List urls;
        String str;
        ImageModel avatarThumb2;
        List urls2;
        String str2;
        C20441214yg.LIZIZ("MultiGuestV3GuestPresenter", "preload avatar start");
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null && (avatarThumb2 = userLIZIZ.getAvatarThumb()) != null && (urls2 = avatarThumb2.getUrls()) != null && (str2 = (String) C930540aK4.LJIJ(0, urls2)) != null) {
            C1289660jfI.LIZ(str2);
        }
        Room room = ((MultiGuestV3GuestPresenter) c987040bnC.l0).room;
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && (str = (String) C930540aK4.LJIJ(0, urls)) != null) {
            C1289660jfI.LIZ(str);
        }
        return false;
    }

    public static final boolean queueIdle$1(C987040bnC c987040bnC) {
        C823050WQl.LIZIZ().submit(new ARunnableS115S0100000_15((Integer) c987040bnC.l0, 153));
        return false;
    }

    public static final boolean queueIdle$2(C987040bnC c987040bnC) {
        C14CE c14ce = C14CE.LIZ;
        Integer num = (Integer) c987040bnC.l0;
        c14ce.getClass();
        C14CE.LIZIZ(num);
        return false;
    }

    public C987040bnC(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
