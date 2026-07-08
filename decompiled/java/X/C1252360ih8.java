package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ih8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252360ih8 extends C734560Sre<AbstractC666100QAu<FollowStatus>, InterfaceC723190SYj> implements C0SY1 {
    public Integer LLILZIL = -1;
    public Boolean LLILZLL = Boolean.FALSE;
    public int LLIZ = -1;
    public String LLIZLLLIL = "";
    public String LLJ;

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        T t = this.LL;
        FollowStatus followStatus = t != 0 ? (FollowStatus) t.getData() : null;
        InterfaceC723190SYj interfaceC723190SYj = (InterfaceC723190SYj) this.LLILLJJLI;
        if (interfaceC723190SYj != null) {
            interfaceC723190SYj.uc1(followStatus);
        }
        if (followStatus != null) {
            if (followStatus.getFollowStatus() == 1) {
                ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("mus_af_follow", followStatus.getUserId());
            }
            User user = new User();
            user.setUid(followStatus.getUserId());
            user.setSecUid(followStatus.getSecUserId());
            user.setFollowStatus(followStatus.getFollowStatus());
            Integer followerStatus = followStatus.getFollowerStatus();
            user.setFollowerStatus(followerStatus != null ? followerStatus.intValue() : -1);
            InterfaceC1345705Ol imUserService = C1336205Ku.LIZ(false).getImUserService();
            IMUser.Companion.getClass();
            imUserService.LJIILJJIL(C2201941BFw.LIZJ(user));
            C1252390ihB c1252390ihB = C1252390ihB.LIZ;
            String userId = followStatus.getUserId();
            int followStatus2 = followStatus.getFollowStatus();
            String str = this.LLIZLLLIL;
            if (str == null) {
                str = "";
            }
            c1252390ihB.getClass();
            C1252390ihB.LIZ(followStatus2, userId, str, "");
        }
    }

    public C1252360ih8() {
        LJIIJ(new C1252420ihE(this));
    }

    @Override // X.C734560Sre, X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        return super.LIZJ(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // X.C0SY1
    public final boolean LJ(C1252380ihA c1252380ihA) {
        int i;
        if (c1252380ihA == null) {
            return false;
        }
        if (c1252380ihA.LIZLLL == 1) {
            if (c1252380ihA.LJIILIIL) {
                i = 4;
            } else if (c1252380ihA.LJIIJJI == 1) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        FollowStatus followStatus = new FollowStatus(c1252380ihA.LIZ, i);
        followStatus.setFollowFrom(c1252380ihA.LJ);
        followStatus.setPreStatus(c1252380ihA.LJIIJ);
        followStatus.setFollowerStatus(Integer.valueOf(c1252380ihA.LJIIJJI));
        this.LLIZLLLIL = c1252380ihA.LJI;
        User user = c1252380ihA.LJIILL;
        if (user != null) {
            LJIILL(followStatus, user.m307clone());
        } else {
            LJIILL(followStatus, null);
        }
        Object[] objArr = new Object[14];
        objArr[0] = c1252380ihA.LIZ;
        objArr[1] = Integer.valueOf(c1252380ihA.LIZLLL);
        objArr[2] = Integer.valueOf(c1252380ihA.LJ);
        objArr[3] = c1252380ihA.LJI;
        objArr[4] = c1252380ihA.LJII;
        objArr[5] = c1252380ihA.LJIIIIZZ;
        objArr[6] = c1252380ihA.LJIIIZ;
        objArr[7] = Integer.valueOf(c1252380ihA.LJFF);
        objArr[8] = c1252380ihA.LIZIZ;
        objArr[9] = Integer.valueOf(c1252380ihA.LJIIJJI);
        Object map = c1252380ihA.LJIIL;
        if (map == null) {
            map = new HashMap();
        }
        objArr[10] = map;
        objArr[11] = Boolean.valueOf(c1252380ihA.LJIILIIL);
        objArr[12] = null;
        objArr[13] = c1252380ihA.LJIILLIIL;
        return super.LIZJ(objArr);
    }

    @Override // X.C0SY1
    public final void LJII(InterfaceC723190SYj interfaceC723190SYj) {
        this.LLILLJJLI = interfaceC723190SYj;
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        InterfaceC723190SYj interfaceC723190SYj = (InterfaceC723190SYj) this.LLILLJJLI;
        if (interfaceC723190SYj != null) {
            int i = 1;
            if (C1354920lMY.LIZ(exc) != null) {
                Integer num = this.LLILZIL;
                if (num != null && num.intValue() == 1) {
                    ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).event("follow_user", String.valueOf(C1354920lMY.LIZ(exc).getErrorCode()));
                } else {
                    Integer num2 = this.LLILZIL;
                    if (num2 != null && num2.intValue() == 0) {
                        ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).event("unfollow_user", String.valueOf(C1354920lMY.LIZ(exc).getErrorCode()));
                    }
                }
            }
            interfaceC723190SYj.u41(exc);
            String str = this.LLJ;
            FollowStatus followStatus = new FollowStatus(0, 0, null, 0, null, null, true, true, -1, 0, null, null, -1, false);
            followStatus.setUserId(str);
            Integer num3 = this.LLILZIL;
            if (num3 != null && num3.intValue() == 0 && Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
                i = 4;
            } else {
                Integer num4 = this.LLILZIL;
                if (num4 != null && num4.intValue() == 0 && this.LLIZ == 1) {
                    i = 2;
                } else {
                    Integer num5 = this.LLILZIL;
                    if (num5 == null || num5.intValue() != 0) {
                        i = 0;
                    }
                }
            }
            followStatus.setFollowStatus(i);
            followStatus.setFollowerStatus(Integer.valueOf(this.LLIZ));
            followStatus.setFollowSuccess(false);
            C1076010e6h.LIZJ.LIZIZ().getRelationObservable().postValue(followStatus);
        }
    }

    public final void LJIILL(FollowStatus followStatus, User user) {
        InterfaceC723190SYj interfaceC723190SYj = (InterfaceC723190SYj) this.LLILLJJLI;
        if (interfaceC723190SYj != null) {
            interfaceC723190SYj.Uo(followStatus);
            C1076010e6h.LIZJ.LIZIZ().getRelationObservable().postValue(new FollowStatus(0, followStatus.getFollowStatus(), null, 0, followStatus.getUserId(), null, true, true, followStatus.getFollowerStatus(), 0, user, null, -1, false));
        }
    }
}
