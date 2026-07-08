package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ONI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinBoardProfileRepository$_operator$1$setBulletinCreateDataLocal$1", f = "BulletinProfileRepository.kt", l = {}, m = "invokeSuspend")
public final class C0ONI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinBoardUpdateInfo LLILLJJLI;
    public final /* synthetic */ C0ONJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ONI(BulletinBoardUpdateInfo bulletinBoardUpdateInfo, C0ONJ c0onj, InterfaceC1364105Vn<? super C0ONI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinBoardUpdateInfo;
        this.LLILLL = c0onj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0ONI c0oni = new C0ONI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0oni.LL = obj;
        return c0oni;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        C1C7U.LIZ("BulletinBoardProfileRepository@428d._operator$1$setBulletinCreateDataLocal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            BulletinBoardUpdateInfo bulletinBoardUpdateInfo = this.LLILLJJLI;
            if (bulletinBoardUpdateInfo != null) {
                C0ONJ.LIZ().storeString("BulletinBoardCreateName", bulletinBoardUpdateInfo.name);
                C0ONJ.LIZ().storeString("BulletinBoardCreateAvatar", bulletinBoardUpdateInfo.avatarUrl);
                C0ONJ.LIZ().storeString("BulletinBoardCreateDescription", bulletinBoardUpdateInfo.description);
                Keva kevaLIZ = C0ONJ.LIZ();
                Boolean bool = bulletinBoardUpdateInfo.showOnProfile;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                kevaLIZ.storeBoolean("BulletinBoardCreateShowOnProfile", zBooleanValue);
                Keva kevaLIZ2 = C0ONJ.LIZ();
                Boolean bool2 = bulletinBoardUpdateInfo.enableReply;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                kevaLIZ2.storeBoolean("BulletinBoardEnableReply", zBooleanValue2);
            } else {
                C0ONJ.LIZ().clear();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBulletinBoardCreateDataLocal() error: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardProfileRepository@428d._operator$1$setBulletinCreateDataLocal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
