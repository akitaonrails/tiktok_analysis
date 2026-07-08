package X;

import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ihE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252420ihE extends AbstractC666100QAu<FollowStatus> {
    public final /* synthetic */ C1252360ih8 LL;

    public C1252420ihE(C1252360ih8 c1252360ih8) {
        this.LL = c1252360ih8;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 14) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        this.LL.LLJ = (String) objArr[0];
        C1BVK c1bvkLIZIZ = C1BVK.LIZIZ();
        WeakHandler weakHandler = this.mHandler;
        final C1252360ih8 c1252360ih8 = this.LL;
        c1bvkLIZIZ.LIZ(weakHandler, new Callable() { // from class: X.0ih9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                FollowStatus followStatusLJIIIIZZ;
                C1C7U.LIZ("FollowPresenter@5404.bindModel$1$sendRequest$1");
                Object[] objArr2 = objArr;
                Aweme aweme = (Aweme) objArr2[5];
                String str = (String) objArr2[6];
                C1252360ih8 c1252360ih82 = c1252360ih8;
                c1252360ih82.LLILZIL = (Integer) objArr2[1];
                c1252360ih82.LLILZLL = (Boolean) objArr2[11];
                c1252360ih82.LLIZ = ((Integer) objArr2[9]).intValue();
                try {
                    Object[] objArr3 = objArr;
                    String str2 = (String) objArr3[3];
                    if (objArr3.length >= 11) {
                        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                        Object[] objArr4 = objArr;
                        String str3 = (String) objArr4[0];
                        String str4 = (String) objArr4[8];
                        int iIntValue = ((Integer) objArr4[1]).intValue();
                        int iIntValue2 = ((Integer) objArr[2]).intValue();
                        int iLIZ = C737370SwB.LIZ(str2);
                        Object[] objArr5 = objArr;
                        String str5 = (String) objArr5[4];
                        int iIntValue3 = ((Integer) objArr5[7]).intValue();
                        Object[] objArr6 = objArr;
                        followStatusLJIIIIZZ = iUserService.LJIIIIZZ(iIntValue, iIntValue2, iLIZ, iIntValue3, str3, str4, str5, "", (String) objArr6[13], (Map) objArr6[10]);
                        if (followStatusLJIIIIZZ != null) {
                            followStatusLJIIIIZZ.setFollowerStatus((Integer) objArr[9]);
                            followStatusLJIIIIZZ.setFollowFrom(((Integer) objArr[2]).intValue());
                        }
                    } else {
                        IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
                        Object[] objArr7 = objArr;
                        String str6 = (String) objArr7[0];
                        int iIntValue4 = ((Integer) objArr7[1]).intValue();
                        int iIntValue5 = ((Integer) objArr[2]).intValue();
                        int iLIZ2 = C737370SwB.LIZ(str2);
                        Object[] objArr8 = objArr;
                        String str7 = (String) objArr8[4];
                        int iIntValue6 = ((Integer) objArr8[7]).intValue();
                        Object[] objArr9 = objArr;
                        followStatusLJIIIIZZ = iUserService2.LJIIIIZZ(iIntValue4, iIntValue5, iLIZ2, iIntValue6, str6, "", str7, "", (String) objArr9[13], (Map) objArr9[9]);
                    }
                    C1252420ihE c1252420ihE = this;
                    Integer num = (Integer) objArr[1];
                    c1252420ihE.getClass();
                    C1252420ihE.LJIIJ(num, aweme, str, followStatusLJIIIIZZ);
                    C1C7U.LIZIZ("FollowPresenter@5404.bindModel$1$sendRequest$1");
                    return followStatusLJIIIIZZ;
                } catch (C0XIR e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (e.getErrorCode() == 2149 && aweme != null && C1017070cZd.LLF(aweme)) {
                        C1252420ihE c1252420ihE2 = this;
                        Integer num2 = (Integer) objArr[1];
                        FollowStatus followStatus = new FollowStatus((String) objArr[0], 0, -1, e.getErrorCode());
                        c1252420ihE2.getClass();
                        C1252420ihE.LJIIJ(num2, aweme, str, followStatus);
                    }
                    throw e;
                }
            }
        }, 0);
        return true;
    }

    public static void LJIIJ(Integer num, Aweme aweme, String str, FollowStatus followStatus) {
        if (str != null && num != null) {
            int followStatus2 = 1;
            if (num.intValue() == 1) {
                int i = 0;
                if (aweme != null && C1017070cZd.LLF(aweme)) {
                    AwemeRawAd awemeRawAd = null;
                    if (Intrinsics.LJFF(str, "feed")) {
                        InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
                        C844470XAv.LIZ.getClass();
                        interfaceC1035050d2dLIZLLL.LJJ(C844470XAv.LIZ(), aweme, followStatus);
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        }
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "follow", awemeRawAd);
                        if (followStatus != null && followStatus.isCheating()) {
                            i = 1;
                        }
                        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "is_cheated_follow");
                        if (followStatus != null) {
                            followStatus2 = followStatus.getFollowStatus();
                        }
                        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(followStatus2), "follow_status");
                        c1022820ciuLIZLLL.LJIIIIZZ();
                        return;
                    }
                    if (!Intrinsics.LJFF(str, "homepage")) {
                        return;
                    }
                    InterfaceC1035050d2d interfaceC1035050d2dLIZLLL2 = C1029590ctp.LIZLLL();
                    C844470XAv.LIZ.getClass();
                    interfaceC1035050d2dLIZLLL2.LIZIZ(C844470XAv.LIZ(), aweme, followStatus);
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "follow", awemeRawAd);
                    if (followStatus != null && followStatus.isCheating()) {
                        i = 1;
                    }
                    c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(i), "is_cheated_follow");
                    if (followStatus != null) {
                        followStatus2 = followStatus.getFollowStatus();
                    }
                    c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(followStatus2), "follow_status");
                    c1022820ciuLIZLLL2.LJIIIIZZ();
                }
            }
        }
    }
}
