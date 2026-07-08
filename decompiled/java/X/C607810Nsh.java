package X;

import android.app.Activity;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Nsh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.FollowAddRedDotHelper$checkUidHasNewVideosAndShowRedDot$1", f = "FollowAddRedDotHelper.kt", l = {112}, m = "invokeSuspend")
public final class C607810Nsh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C059B LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607810Nsh(String str, C059B c059b, InterfaceC1364105Vn<? super C607810Nsh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c059b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C607810Nsh c607810Nsh = new C607810Nsh(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c607810Nsh.LLILLJJLI = obj;
        return c607810Nsh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJI;
        AbstractC1387200mCc abstractC1387200mCc;
        C19EG c19egLIZIZ;
        IFollowReadService iFollowReadService;
        List<String> listLIZLLL;
        boolean z;
        Activity activityLIZIZ;
        FollowFeedApiV2.FollowFeedRedDotResponse followFeedRedDotResponse;
        Object objLIZJ = obj;
        C1C7U.LIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                Object obj2 = this.LLILLJJLI;
                if (Intrinsics.LJFF(this.LLILLL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                    return unit;
                }
                C607830Nsj.LIZ.getClass();
                if (C607830Nsj.LIZJ != null) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                    return unit2;
                }
                AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                int length = abstractC1387200mCcArrLJII.length;
                int i2 = 0;
                while (true) {
                    strLJI = null;
                    if (i2 < length) {
                        abstractC1387200mCc = abstractC1387200mCcArrLJII[i2];
                        if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                            break;
                        }
                        i2++;
                    } else {
                        abstractC1387200mCc = null;
                        break;
                    }
                }
                if (abstractC1387200mCc != null && (activityLIZIZ = abstractC1387200mCc.LIZIZ()) != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
                } else {
                    c19egLIZIZ = null;
                }
                if (c19egLIZIZ != null) {
                    C607830Nsj c607830Nsj = C607830Nsj.LIZ;
                    C059B c059b = this.LLILZ;
                    c607830Nsj.getClass();
                    C23250099c.LIZLLL((InterfaceC497601wk) C607830Nsj.LIZIZ.getValue(), null, null, new C059A(true, c059b, null), 3);
                    FollowTabAbility followTabAbility = (FollowTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), FollowTabAbility.class, null);
                    if (followTabAbility == null) {
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                        return unit3;
                    }
                    if (followTabAbility.Q21() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Unit unit4 = Unit.LIZ;
                        C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                        return unit4;
                    }
                    ITabStrip iTabStrip = (ITabStrip) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), ITabStrip.class, null);
                    if (iTabStrip == null) {
                        Unit unit5 = Unit.LIZ;
                        C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                        return unit5;
                    }
                    if (Intrinsics.LJFF(iTabStrip.U31(false), "Following")) {
                        Unit unit6 = Unit.LIZ;
                        C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                        return unit6;
                    }
                } else {
                    C607830Nsj c607830Nsj2 = C607830Nsj.LIZ;
                    C059B c059b2 = this.LLILZ;
                    c607830Nsj2.getClass();
                    C23250099c.LIZLLL((InterfaceC497601wk) C607830Nsj.LIZIZ.getValue(), null, null, new C059A(false, c059b2, null), 3);
                    C2286608xc.LJ(Log.i("FollowAddRedDotHelper", "[checkUidHasNewVideosAndShowRedDot] cannot find MainActivity, skip some checks!"));
                }
                C607670NsT c607670NsT = C607670NsT.LIZ;
                String str = this.LLILLL;
                Integer numLJ = C2286608xc.LJ(this.LLILZ.getValue());
                if (FollowRealTimeReadExp.LIZ() && (iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null)) != null && (listLIZLLL = iFollowReadService.LIZLLL()) != null) {
                    if (!(!listLIZLLL.isEmpty())) {
                        listLIZLLL = null;
                    }
                    if (listLIZLLL != null) {
                        C1227904rF.LIZ.getClass();
                        strLJI = C1227904rF.LJI(listLIZLLL);
                    }
                }
                FollowFeedApiV2.FollowFeedRedDotBody followFeedRedDotBody = new FollowFeedApiV2.FollowFeedRedDotBody(str, numLJ, strLJI);
                this.LLILLJJLI = obj2;
                this.LL = 1;
                c607670NsT.getClass();
                objLIZJ = C607670NsT.LIZIZ.LIZJ(followFeedRedDotBody, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                    return objLJFF;
                }
            }
            followFeedRedDotResponse = (FollowFeedApiV2.FollowFeedRedDotResponse) objLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (followFeedRedDotResponse.status_code != 0) {
            Unit unit7 = Unit.LIZ;
            C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
            return unit7;
        }
        Integer num = followFeedRedDotResponse.redDotStatus;
        if (num != null && num.intValue() == 1) {
            INoticeCountService iNoticeCountService = (INoticeCountService) PluggableExtentionKt.pluggableSpi$default(INoticeCountService.class, false, false, false, 14, null);
            if (iNoticeCountService == null) {
                Unit unit8 = Unit.LIZ;
                C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
                return unit8;
            }
            C607830Nsj c607830Nsj3 = C607830Nsj.LIZ;
            C607840Nsk c607840Nsk = new C607840Nsk(40, 10, null, null, this.LLILZ.getValue(), 8);
            c607830Nsj3.getClass();
            C607830Nsj.LIZJ = c607840Nsk;
            iNoticeCountService.LJIILJJIL(40, iNoticeCountService.LJIIL(40, false) + 1);
            Unit unit9 = Unit.LIZ;
            C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
            return unit9;
        }
        Unit unit10 = Unit.LIZ;
        C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.checkUidHasNewVideosAndShowRedDot$1");
        return unit10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
