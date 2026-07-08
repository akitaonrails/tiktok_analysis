package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$updateBulletinBoardChannelStatus$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C622020OaW extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622020OaW(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C622020OaW(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.updateBulletinBoardChannelStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C621980OaS c621980OaSLIZIZ = C622190Oan.LJFF().LIZIZ();
        String str = this.LL;
        int i = this.LLILLJJLI;
        SQLiteDatabase sQLiteDatabaseLJ = c621980OaSLIZIZ.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ != null) {
            try {
                try {
                    sQLiteDatabaseLJ.LJI(true);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UPDATE bulletin_board_channel_base SET ");
                    sbLIZ.append(EnumC622090Oad.CHANNEL_STATUS_CODE.getKey());
                    sbLIZ.append(" = ? WHERE ");
                    sbLIZ.append(EnumC622090Oad.BULLETIN_BOARD_ID.getKey());
                    sbLIZ.append(" = ?");
                    sQLiteDatabaseLJ.LJJ(C2188811AlT.LIZIZ(sbLIZ), new String[]{String.valueOf(i), str});
                    sQLiteDatabaseLJ.LJJIIZ();
                    c621980OaSLIZIZ.LIZ.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateBulletinBoardChannelStatus success, bulletinBoardId: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", status: ");
                    sbLIZ2.append(i);
                    C622290Oax.LJFF("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c621980OaSLIZIZ.LIZ.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updateBulletinBoardChannelStatus failed, bulletinBoardId: ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", status: ");
                    sbLIZ3.append(i);
                    C622290Oax.LIZJ("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ3), e);
                }
                sQLiteDatabaseLJ.LJJIIZI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sQLiteDatabaseLJ.LJJIIZI();
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.updateBulletinBoardChannelStatus$1");
        return unit;
    }
}
