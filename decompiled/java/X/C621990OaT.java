package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$deleteBulletinBoardAsync$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C621990OaT extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C621990OaT(String str, InterfaceC1364105Vn<? super C621990OaT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621990OaT(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.deleteBulletinBoardAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C621980OaS c621980OaSLIZIZ = C622190Oan.LJFF().LIZIZ();
        String str = this.LL;
        SQLiteDatabase sQLiteDatabaseLJ = c621980OaSLIZIZ.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ != null) {
            try {
                try {
                    sQLiteDatabaseLJ.LJI(true);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(EnumC622100Oae.BULLETIN_BOARD_ID.getKey());
                    sbLIZ.append(" = ?");
                    sQLiteDatabaseLJ.LJIILL("bulletin_board_channel_setting", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(EnumC622110Oaf.BULLETIN_BOARD_ID.getKey());
                    sbLIZ2.append(" = ?");
                    sQLiteDatabaseLJ.LJIILL("bulletin_board_channel_ui", C2188811AlT.LIZIZ(sbLIZ2), new String[]{str});
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(EnumC622090Oad.BULLETIN_BOARD_ID.getKey());
                    sbLIZ3.append(" = ?");
                    sQLiteDatabaseLJ.LJIILL("bulletin_board_channel_base", C2188811AlT.LIZIZ(sbLIZ3), new String[]{str});
                    sQLiteDatabaseLJ.LJJIIZ();
                    c621980OaSLIZIZ.LIZ.LIZ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("deleteBulletinBoardChannel success, bulletinBoardId: ");
                    sbLIZ4.append(str);
                    C622290Oax.LJFF("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ4));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c621980OaSLIZIZ.LIZ.LIZ();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("deleteBulletinBoardChannel failed, bulletinBoardId: ");
                    sbLIZ5.append(str);
                    C622290Oax.LIZJ("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ5), e);
                }
                sQLiteDatabaseLJ.LJJIIZI();
            } finally {
            }
        }
        C622050OaZ c622050OaZLIZ = C622190Oan.LJFF().LIZ();
        String str2 = this.LL;
        sQLiteDatabaseLJ = c622050OaZLIZ.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ != null) {
            List listLIZ = C621860OaG.LIZ(Long.MAX_VALUE, 0L, str2);
            try {
                try {
                    sQLiteDatabaseLJ.LJI(true);
                    for (Pair pair : (ArrayList) listLIZ) {
                        sQLiteDatabaseLJ.LJJ((String) pair.getFirst(), (Object[]) pair.getSecond());
                    }
                    sQLiteDatabaseLJ.LJJIIZ();
                    c622050OaZLIZ.LIZ.LIZ();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("deleteBulletinBoardItems success, bbid: ");
                    sbLIZ6.append(str2);
                    C622290Oax.LJFF("BulletinBoardItemBaseDao", C2188811AlT.LIZIZ(sbLIZ6));
                } finally {
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("deleteBulletinBoardItems failed：bbid=");
                sbLIZ7.append(str2);
                sbLIZ7.append(", errorMsg：");
                sbLIZ7.append(e2.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                c622050OaZLIZ.LIZ.LIZ();
                C622290Oax.LIZJ("BulletinBoardItemBaseDao", strLIZIZ, e2);
            }
            sQLiteDatabaseLJ.LJJIIZI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.deleteBulletinBoardAsync$1");
        return unit;
    }
}
