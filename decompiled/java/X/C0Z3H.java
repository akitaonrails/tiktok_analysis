package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva;
import com.ss.android.ugc.aweme.im.service.service.IMAFListManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Z3H, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3H extends C09AY implements Function0<C0Z3G> {
    public C0Z3H() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0Z3G invoke() {
        return new InterfaceC1908920zm6() { // from class: X.0Z3G
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(533));

            @Override // X.InterfaceC1908920zm6
            public final void LIZ(IMUser iMUser) {
                ((IMAFListManager) LIZIZ.getValue()).LIZ(iMUser);
            }

            @Override // X.InterfaceC1908920zm6
            public final IMUser LIZIZ(String str) {
                return ((IMAFListManager) LIZIZ.getValue()).LIZIZ(str);
            }

            @Override // X.InterfaceC1908920zm6
            public final boolean LIZJ(String str) {
                return ((IMAFListManager) LIZIZ.getValue()).LIZJ(str);
            }

            @Override // X.InterfaceC1908920zm6
            public final boolean LIZLLL(User user) {
                String accurateRecType;
                List<Integer> canMessageFollowStatusList = user.getCanMessageFollowStatusList();
                if (canMessageFollowStatusList != null) {
                    if (!canMessageFollowStatusList.contains(1)) {
                        if (canMessageFollowStatusList.contains(4) && (accurateRecType = user.getAccurateRecType()) != null && accurateRecType.length() != 0) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1908920zm6
            public final boolean LJ(User user) {
                String accurateRecType;
                List<Integer> canMessageFollowStatusList;
                if (((Number) C270210AiR.LIZ.getValue()).intValue() != 1 || user == null || (accurateRecType = user.getAccurateRecType()) == null || ((!a0.LJJIIZI(accurateRecType, "1-1", false) && !a0.LJJIIZI(accurateRecType, "1-2", false)) || (canMessageFollowStatusList = user.getCanMessageFollowStatusList()) == null)) {
                    return false;
                }
                if (canMessageFollowStatusList.contains(1) || canMessageFollowStatusList.contains(4)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1908920zm6
            public final void LJFF(int i, User user) {
                String uid;
                if (i == 1 && LJ(user)) {
                    MessageAfterFollowBackKeva messageAfterFollowBackKeva = MessageAfterFollowBackKeva.LIZIZ;
                    if (user != null && (uid = user.getUid()) != null) {
                        MessageAfterFollowBackKeva.LJII(System.currentTimeMillis(), messageAfterFollowBackKeva.LIZ(), uid);
                    }
                }
            }
        };
    }
}
