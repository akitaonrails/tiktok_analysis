package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.FeatureResult;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMGroupChatPermissionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mGN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo$updateUserGroupChatPermissionInfo$1", f = "IMUserRepo.kt", l = {789, 796}, m = "invokeSuspend")
public final class C1389530mGN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0ZVN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389530mGN(String str, C0ZVN c0zvn, InterfaceC1364105Vn<? super C1389530mGN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c0zvn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1389530mGN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        FeatureResult featureResult;
        C1C7U.LIZ("IMUserRepo@4319.updateUserGroupChatPermissionInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMUserRepo@4319.updateUserGroupChatPermissionInfo$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jLongValue = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILLL);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
                C1BGN c1bgnLIZ = C808280VnG.LIZ();
                Long lLJFF = C2286608xc.LJFF(jLongValue);
                this.LL = jLongValue;
                this.LLILLJJLI = 1;
                obj = ((C2202141BGq) c1bgnLIZ).LJ(lLJFF, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMUserRepo@4319.updateUserGroupChatPermissionInfo$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("IMUserRepo@4319.updateUserGroupChatPermissionInfo$1");
                return unit2;
            }
        }
        IMUserBizInfo iMUserBizInfo = (IMUserBizInfo) obj;
        if (iMUserBizInfo == null) {
            iMUserBizInfo = new IMUserBizInfo();
            iMUserBizInfo.setUserId(jLongValue);
        }
        IMGroupChatPermissionInfo groupChatPermissionInfo = iMUserBizInfo.getGroupChatPermissionInfo();
        if (groupChatPermissionInfo == null) {
            groupChatPermissionInfo = new IMGroupChatPermissionInfo(null, null);
        }
        IMGroupChatPermissionInfo groupChatPermissionInfo2 = iMUserBizInfo.getGroupChatPermissionInfo();
        if (groupChatPermissionInfo2 == null || (featureResult = groupChatPermissionInfo2.featureResult) == null) {
            featureResult = new FeatureResult(0, null, null);
        }
        iMUserBizInfo.setGroupChatPermissionInfo(groupChatPermissionInfo.copy(featureResult.copy(C2286608xc.LJ(this.LLILZ.ordinal()), featureResult.displayGrayEntrance, featureResult.grayEntranceTips), groupChatPermissionInfo.groupPermissionConditionCheckResult));
        C1BG1 c1bg1 = C1BG1.LIZ;
        Long lLJFF2 = C2286608xc.LJFF(jLongValue);
        this.LLILLJJLI = 2;
        c1bg1.getClass();
        if (C1BG1.LJJIIJ(lLJFF2, iMUserBizInfo, this) == objLJFF) {
            C1C7U.LIZIZ("IMUserRepo@4319.updateUserGroupChatPermissionInfo$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IMUserRepo@4319.updateUserGroupChatPermissionInfo$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
