package X;

import Y.ARunnableS1S0104000_1;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906910zir implements InterfaceC1908070zkj {
    public static final C1906910zir LIZ = new C1906910zir();

    public static String LIZJ(User user) {
        if (user == null) {
            return "";
        }
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 2) {
                    return "";
                }
                return "2";
            }
            return "1";
        }
        if (followerStatus == 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "3";
    }

    @Override // X.InterfaceC1908070zkj
    public final boolean LIZ(List<? extends User> list, boolean z) {
        if (C1906900ziq.LIZIZ(list, z) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1908070zkj
    public final void LIZIZ(C1908730zln c1908730zln, String str, List<? extends User> list, boolean z, String str2) {
        Pair<User, EnumC055700Ih> pairLIZIZ;
        C786410Ut5.u0(c1908730zln, 8);
        if (list != null && (pairLIZIZ = C1906900ziq.LIZIZ(list, z)) != null) {
            C786410Ut5.u0(c1908730zln, 0);
            if (pairLIZIZ.getSecond() == EnumC055700Ih.SEPARATE_MATCHED_FRIEND) {
                HandlerHook.viewPost((View) c1908730zln.getParent(), new ARunnableS1S0104000_1(c1908730zln, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0));
                C1075780e6K.LIZLLL("show", str, "inbox_interaction_message", pairLIZIZ.getFirst(), C1075780e6K.LIZ(str2));
            }
        }
    }
}
