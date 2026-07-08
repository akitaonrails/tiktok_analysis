package X;

import android.util.Log;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ICollabApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CollabInfo;
import com.ss.android.ugc.aweme.feed.model.CollaboratorInfo;
import com.ss.android.ugc.aweme.model.CollabStatusResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedStatusUpdateViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ctd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC328110Ctd<V> implements Callable {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ CollabFeedStatusUpdateViewModel LLILLL;

    public CallableC328110Ctd(Aweme aweme, long j, CollabFeedStatusUpdateViewModel collabFeedStatusUpdateViewModel) {
        this.LL = aweme;
        this.LLILLJJLI = j;
        this.LLILLL = collabFeedStatusUpdateViewModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objValueOf;
        C328120Cte c328120Cte;
        List<CollaboratorInfo> list;
        C1C7U.LIZ("CollabFeedStatusUpdateViewModel@59c8.updateCollabAcceptStatus$1");
        try {
            List list2 = null;
            list2 = null;
            try {
                c328120Cte = new C328120Cte(CastLongProtector.parseLong(this.LL.getAid()), this.LLILLJJLI);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                c328120Cte = null;
            }
            if (c328120Cte != null) {
                CollabStatusResponse collabStatusResponse = ((ICollabApi) C317300CcC.LIZ.getValue()).updateCollabStatus(c328120Cte.LIZ, c328120Cte.LIZIZ).execute().LIZIZ;
            }
            Aweme aweme = this.LL;
            long j = this.LLILLJJLI;
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            CollabInfo collabInfo = aweme.getCollabInfo();
            boolean z = true;
            if (collabInfo != null && (list = collabInfo.collaborators) != null) {
                ArrayList arrayList = new ArrayList();
                for (CollaboratorInfo collaboratorInfo : list) {
                    if (!Intrinsics.LJFF(collaboratorInfo.user.getUid(), curUser.getUid())) {
                        arrayList.add(collaboratorInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (j != 1) {
                    C19719612Di.LJJIIJ(arrayList2, new AwS580S0100000_1(curUser, 1094), true);
                    list2 = arrayList2;
                } else {
                    arrayList2.add(new CollaboratorInfo(curUser, 2));
                    list2 = arrayList2;
                }
            }
            if (collabInfo == null || !collabInfo.shouldDisplayTag) {
                z = false;
            }
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            aweme.setCollabInfo(new CollabInfo(z, list2));
            this.LLILLL.LL.postValue(this.LL);
            objValueOf = Unit.LIZ;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            objValueOf = Integer.valueOf(Log.d("CollabFeedStatusVM", "Update collab status failed", e2));
        }
        C1C7U.LIZIZ("CollabFeedStatusUpdateViewModel@59c8.updateCollabAcceptStatus$1");
        return objValueOf;
    }
}
