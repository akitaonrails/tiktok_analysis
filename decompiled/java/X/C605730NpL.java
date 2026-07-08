package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinBoardProfileRepository$_operator$1$saveLastProfileData$1", f = "BulletinProfileRepository.kt", l = {}, m = "invokeSuspend")
public final class C605730NpL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinBoardInfo LL;
    public final /* synthetic */ C0ONJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605730NpL(BulletinBoardInfo bulletinBoardInfo, C0ONJ c0onj, InterfaceC1364105Vn<? super C605730NpL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinBoardInfo;
        this.LLILLJJLI = c0onj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605730NpL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardProfileRepository@428d._operator$1$saveLastProfileData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String strLJ = JsonParseUtils.LJ(this.LL);
            this.LLILLJJLI.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinBoardProfileDataRepository");
            sbLIZ.append(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
            Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).storeString(C786410Ut5.j4("BulletinProfileData%s", Arrays.copyOf(new Object[]{String.valueOf(this.LL.bulletinId)}, 1)), strLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveLastProfileData() error: ");
            sbLIZ2.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardProfileRepository@428d._operator$1$saveLastProfileData$1");
        return unit;
    }
}
