package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBaseAccountInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Nnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinBoardAutoShareDataManager$requestBulletinBaseInfo$1", f = "BulletinBoardAutoShareDataManager.kt", l = {197}, m = "invokeSuspend")
public final class C604740Nnk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C604740Nnk(InterfaceC1364105Vn<? super C604740Nnk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604740Nnk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        BulletinFunctionSetting bulletinFunctionSettingLIZ;
        C1C7U.LIZ("BulletinBoardAutoShareDataManager@f5bc.requestBulletinBaseInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                NotificationApi.Api apiLIZ = NotificationApi.LIZ();
                this.LL = 1;
                obj = apiLIZ.LJJIII(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.requestBulletinBaseInfo$1");
                    return objLJFF;
                }
            }
            BulletinBaseAccountInfo bulletinBaseAccountInfo = (BulletinBaseAccountInfo) obj;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestBulletinBaseInfo result ");
            sbLIZ.append(bulletinBaseAccountInfo);
            C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ));
            if (bulletinBaseAccountInfo.error_code == 0) {
                C604750Nnl.LIZ.getClass();
                C604750Nnl.LIZJ = bulletinBaseAccountInfo;
                List<BulletinFunctionSetting> bulletinFunctionSettings = bulletinBaseAccountInfo.getBulletinFunctionSettings();
                if (bulletinFunctionSettings == null || (bulletinFunctionSettingLIZ = C617100OIi.LIZ(bulletinFunctionSettings)) == null || bulletinFunctionSettingLIZ.status != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    z2 = false;
                }
                C604750Nnl.LJI(z2, false);
            } else {
                C604750Nnl.LIZ.getClass();
                C604750Nnl.LIZJ = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestBulletinBaseInfo net error ");
            sbLIZ2.append(e);
            C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ2));
            C604750Nnl.LIZ.getClass();
            C604750Nnl.LIZJ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.requestBulletinBaseInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C604740Nnk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
