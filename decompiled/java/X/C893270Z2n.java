package X;

import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.common.model.RecentActivityResponse;
import com.ss.android.ugc.aweme.im.common.model.RecentActivityResponseBody;
import com.ss.android.ugc.aweme.im.common.model.TiktokV1ImInboxDataGetResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0Z2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893270Z2n implements InterfaceC497601wk, InterfaceC754190TiD {
    public static final C893270Z2n LL = new C893270Z2n();
    public static final C1DFB LLILLJJLI = C0PEM.LIZJ;

    @Override // X.InterfaceC754190TiD
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC754190TiD
    public final Object LIZ() {
        IMRecentActivityService.LIZ.getClass();
        return Boolean.valueOf(C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LIZ().LIZLLL());
    }

    @Override // X.InterfaceC754190TiD
    public final int LJ() {
        return EnumC1997907s9.CONVERSATION_PROPERTY_TYPES_RECENT_ACTIVITIES.getValue();
    }

    @Override // X.InterfaceC754190TiD
    public final Unit LIZJ() {
        return Unit.LIZ;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC754190TiD
    public final Unit LIZIZ(TiktokV1ImInboxDataGetResponse tiktokV1ImInboxDataGetResponse) {
        List<RecentActivityResponse> list;
        EnumC461080I6g enumC461080I6g;
        Long l;
        IMRecentActivityService.LIZ.getClass();
        C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LIZ().LIZ();
        RecentActivityResponseBody recentActivityResponseBody = tiktokV1ImInboxDataGetResponse.recentActivity;
        ArrayList arrayList = null;
        if (recentActivityResponseBody != null && (list = recentActivityResponseBody.recentActivityMap) != null) {
            arrayList = new ArrayList();
            for (RecentActivityResponse recentActivityResponse : list) {
                Integer num = recentActivityResponse.activityType;
                if (num != null) {
                    C461090I6h c461090I6h = EnumC461080I6g.Companion;
                    int iIntValue = num.intValue();
                    c461090I6h.getClass();
                    if (iIntValue != 1) {
                        if (iIntValue == 2) {
                            enumC461080I6g = EnumC461080I6g.RECENT_ACTIVITY_REPOST;
                        }
                    } else {
                        enumC461080I6g = EnumC461080I6g.RECENT_ACTIVITY_POST;
                    }
                    if (enumC461080I6g != null && (l = recentActivityResponse.creatorUserId) != null) {
                        long jLongValue = l.longValue();
                        Long l2 = recentActivityResponse.itemId;
                        if (l2 != null) {
                            arrayList.add(new C1722406oo(enumC461080I6g, jLongValue, l2.longValue()));
                        }
                    }
                }
            }
            IMRecentActivityService.LIZ.getClass();
            C1649006cy.LIZ().LIZ(C461720I8s.LIZIZ()).LJI(arrayList);
        }
        C866950Xzh.LIZIZ(arrayList);
        return Unit.LIZ;
    }
}
