package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250900iem extends C09AY implements InterfaceC1631620sYq<Boolean, Throwable, ProfileUser, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ProfilePlatformViewModel LLILLL;
    public final /* synthetic */ EnumC1251790igD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1250900iem(long j, String str, ProfilePlatformViewModel profilePlatformViewModel, EnumC1251790igD enumC1251790igD) {
        super(3);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = profilePlatformViewModel;
        this.LLILZ = enumC1251790igD;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Throwable th, ProfileUser profileUser) {
        LogPbBean logPbBean;
        String imprId;
        LogPbBean logPbBean2;
        String uid;
        User userLJJIZ;
        UserProfileInfo userProfileInfo;
        Throwable exc = th;
        ProfileUser profileUser2 = profileUser;
        String imprId2 = null;
        try {
            if (bool.booleanValue() && profileUser2 != null) {
                ProfileCommonInfo profileCommonInfo = profileUser2.common;
                if (profileCommonInfo != null && (userProfileInfo = profileCommonInfo.getUserProfileInfo()) != null) {
                    uid = userProfileInfo.getUid();
                } else {
                    uid = null;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getUserInfo request back. last requestUid:");
                sbLIZ.append(this.LLILLL.NQ2());
                sbLIZ.append(", dataUid:");
                sbLIZ.append(uid);
                C1720106oR.LJI("ProfilePlatformView", C2188811AlT.LIZIZ(sbLIZ));
                if (!((Boolean) C267710AeP.LIZ.getValue()).booleanValue() || !C736460Sui.LIZIZ(this.LLILLL.NQ2()) || Intrinsics.LJFF(uid, this.LLILLL.NQ2())) {
                    C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
                    c1250680ieQ.getClass();
                    C1250680ieQ.LJII(jCurrentTimeMillis, true, false);
                    try {
                        C1251850igJ c1251850igJ = C1251850igJ.LIZ;
                        User user = this.LLILLL.LLJ;
                        c1251850igJ.getClass();
                        userLJJIZ = C1251850igJ.LJJIZ(user, profileUser2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                        C1251850igJ.LIZ.getClass();
                        n nVar = C1251850igJ.LIZIZ;
                        c1250680ieQ2.getClass();
                        C1250680ieQ.LJ(nVar, e);
                        userLJJIZ = null;
                    }
                    C1253420iiq.LIZ.getClass();
                    C1253420iiq.LIZJ(null);
                    ProfilePlatformViewModel profilePlatformViewModel = this.LLILLL;
                    profilePlatformViewModel.QQ2(profilePlatformViewModel.NQ2(), profileUser2, this.LLILZ, userLJJIZ, this.LLILLJJLI);
                }
            } else {
                C1250680ieQ c1250680ieQ3 = C1250680ieQ.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LL;
                c1250680ieQ3.getClass();
                C1250680ieQ.LJII(jCurrentTimeMillis2, false, false);
                if (exc == null) {
                    exc = new Exception("data is null");
                }
                if (C299970BpL.LIZ()) {
                    String str = this.LLILLJJLI;
                    if (profileUser2 != null && (logPbBean2 = profileUser2.logPb) != null) {
                        imprId = logPbBean2.getImprId();
                    } else {
                        imprId = null;
                    }
                    C1250680ieQ.LJI(c1250680ieQ3, 0, str, exc, false, null, imprId, this.LLILLL.LQ2(), EnumC1250690ieR.FAILED.getValue(), 16);
                } else {
                    C1250680ieQ.LJIIIIZZ(this.LLILLJJLI, exc);
                }
                this.LLILLL.setState(new AwS582S0100000_3(exc, 9));
                C1253420iiq.LIZ.getClass();
                C1253420iiq.LIZJ(exc);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            ProfilePlatformViewModel profilePlatformViewModel2 = this.LLILLL;
            User user2 = profilePlatformViewModel2.LLJ;
            C1253140iiO.LIZ.getClass();
            C1253330iih c1253330iih = C1253140iiO.LIZIZ;
            if (c1253330iih != null) {
                c1253330iih.LIZIZ(1);
            }
            C1253150iiP.LIZJ(false, true);
            C0JAM.LJIIIZ.getValue().LIZIZ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("to_user_id", profilePlatformViewModel2.NQ2());
            c2344009Gk.LJIIIIZZ("enter_from", profilePlatformViewModel2.LQ2());
            c2344009Gk.LIZJ(0, "is_success");
            c2344009Gk.LJIIIIZZ("fail_info", e2.getMessage());
            if (e2 instanceof C0XIR) {
                C0XIR c0xir = (C0XIR) e2;
                c2344009Gk.LJFF("response", c0xir.getResponse());
                if (C0SE5.LIZ() && (c0xir.getRawResponse() instanceof ProfileUser)) {
                    C628000OkA.LIZ.getClass();
                    C628000OkA.LIZJ(user2);
                }
            }
            Map<String, String> map = c2344009Gk.LIZ;
            C20684815ws.LJIILLIIL("profile_request_response", map);
            C2344809Gs.LIZLLL(4, "aweme/v1/user", map.toString());
            C1250680ieQ c1250680ieQ4 = C1250680ieQ.LIZ;
            long jCurrentTimeMillis3 = System.currentTimeMillis() - this.LL;
            c1250680ieQ4.getClass();
            C1250680ieQ.LJII(jCurrentTimeMillis3, false, false);
            if (C299970BpL.LIZ()) {
                String str2 = this.LLILLJJLI;
                if (profileUser2 != null && (logPbBean = profileUser2.logPb) != null) {
                    imprId2 = logPbBean.getImprId();
                }
                C1250680ieQ.LJI(c1250680ieQ4, 0, str2, e2, false, null, imprId2, this.LLILLL.LQ2(), EnumC1250690ieR.FAILED.getValue(), 16);
            } else {
                C1250680ieQ.LJIIIIZZ(this.LLILLJJLI, e2);
            }
            this.LLILLL.setState(new AwS582S0100000_3(e2, 10));
            C1253420iiq.LIZ.getClass();
            C1253420iiq.LIZJ(e2);
        }
        return Unit.LIZ;
    }
}
