package X;

import Y.AfS2S0200100_7;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetExitRoomOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0J1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485320J1m {
    public static WeakReference<Context> LIZ;
    public static WeakReference<LifecycleOwner> LIZIZ;

    public static C11NZ LIZ(User user, Room room, long j, String str, C488970JFn c488970JFn) {
        LifecycleOwner lifecycleOwner;
        if (LiveWidgetExitRoomOptSetting.INSTANCE.enableFollowProfile()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C1099420eiS c1099420eiS = new C1099420eiS();
            c1099420eiS.LIZIZ(user.getId());
            room.getRequestId();
            c1099420eiS.LIZLLL();
            C1099420eiS c1099420eiS2 = c1099420eiS;
            c1099420eiS2.LIZLLL();
            c1099420eiS2.LJ(room.getId());
            c1099420eiS2.LJFF = true;
            room.getLabels();
            return interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS2));
        }
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        C1099420eiS c1099420eiS3 = new C1099420eiS();
        c1099420eiS3.LIZIZ(user.getId());
        room.getRequestId();
        c1099420eiS3.LIZLLL();
        C1099420eiS c1099420eiS4 = c1099420eiS3;
        c1099420eiS4.LIZLLL();
        c1099420eiS4.LJ(room.getId());
        c1099420eiS4.LJFF = true;
        room.getLabels();
        C19500811Re c19500811ReLJJLIIJ = interfaceC500940JkiUser2.LIZ(new C1812130xFz(c1099420eiS4)).LJJLIIJ();
        WeakReference<LifecycleOwner> weakReference = LIZIZ;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null) {
            ((C0J1N) c19500811ReLJJLIIJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS2S0200100_7(j, c488970JFn, user, 12), new C09JN() { // from class: X.0J1n
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveProfileFollowProxy@7039.follow$1$2");
                    C1C7U.LIZIZ("LiveProfileFollowProxy@7039.follow$1$2");
                }
            });
        }
        return c19500811ReLJJLIIJ;
    }

    public static C11NZ LIZIZ(User user, Room room, long j, String str, C488970JFn c488970JFn) {
        LifecycleOwner lifecycleOwner;
        Context context;
        Context context2;
        int followStatus = 0;
        C19EG c19egLJ = null;
        if (LiveWidgetExitRoomOptSetting.INSTANCE.enableUnfollowProfile()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C485350J1p c485350J1p = new C485350J1p();
            WeakReference<Context> weakReference = LIZ;
            if (weakReference != null && (context2 = weakReference.get()) != null) {
                c19egLJ = C500260Jjc.LJ(context2);
            }
            c485350J1p.LIZJ = c19egLJ;
            c485350J1p.LIZIZ(user.getId());
            FollowInfo followInfo = user.getFollowInfo();
            if (followInfo != null) {
                followStatus = (int) followInfo.getFollowStatus();
            }
            c485350J1p.LIZLLL(followStatus);
            c485350J1p.LIZJ();
            c485350J1p.LJI = true;
            c485350J1p.LJ(room.getId());
            c485350J1p.getClass();
            return interfaceC500940JkiUser.LJI(new C1812120xFy(c485350J1p));
        }
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        C485350J1p c485350J1p2 = new C485350J1p();
        WeakReference<Context> weakReference2 = LIZ;
        if (weakReference2 != null && (context = weakReference2.get()) != null) {
            c19egLJ = C500260Jjc.LJ(context);
        }
        c485350J1p2.LIZJ = c19egLJ;
        c485350J1p2.LIZIZ(user.getId());
        FollowInfo followInfo2 = user.getFollowInfo();
        if (followInfo2 != null) {
            followStatus = (int) followInfo2.getFollowStatus();
        }
        c485350J1p2.LIZLLL(followStatus);
        c485350J1p2.LIZJ();
        c485350J1p2.LJI = true;
        c485350J1p2.LJ(room.getId());
        c485350J1p2.getClass();
        C19500811Re c19500811ReLJJLIIJ = interfaceC500940JkiUser2.LJI(new C1812120xFy(c485350J1p2)).LJJLIIJ();
        WeakReference<LifecycleOwner> weakReference3 = LIZIZ;
        if (weakReference3 != null && (lifecycleOwner = weakReference3.get()) != null) {
            ((C0J1N) c19500811ReLJJLIIJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS2S0200100_7(j, c488970JFn, user, 13), new C09JN() { // from class: X.0J1o
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveProfileFollowProxy@7039.unfollow$1$2");
                    C1C7U.LIZIZ("LiveProfileFollowProxy@7039.unfollow$1$2");
                }
            });
        }
        return c19500811ReLJJLIIJ;
    }
}
