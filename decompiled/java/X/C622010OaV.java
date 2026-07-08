package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$getBulletinBoardItemResponse$identityType$temp$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C622010OaV extends C09AX implements Function1<InterfaceC1364105Vn<? super Long>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622010OaV(String str, InterfaceC1364105Vn<? super C622010OaV> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C622010OaV(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLIZIZ;
        String str;
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.getBulletinBoardItemResponse$identityType$temp$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C621980OaS c621980OaSLIZIZ = C622190Oan.LJFF().LIZIZ();
        String str2 = this.LL;
        SQLiteDatabase sQLiteDatabaseLJ = c621980OaSLIZIZ.LIZ.LIZJ().LJ();
        Long l = null;
        if (sQLiteDatabaseLJ != null) {
            try {
                try {
                    sQLiteDatabaseLJ.LJI(true);
                    EnumC622090Oad enumC622090Oad = EnumC622090Oad.IDENTITY_TYPE;
                    String[] strArr = {enumC622090Oad.getKey()};
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(EnumC622100Oae.BULLETIN_BOARD_ID.getKey());
                    sbLIZ.append(" = ?");
                    C908020Zjk c908020ZjkLJJLIL = sQLiteDatabaseLJ.LJJLIL("bulletin_board_channel_base", strArr, C2188811AlT.LIZIZ(sbLIZ), new String[]{str2}, null);
                    try {
                        if (c908020ZjkLJJLIL.moveToFirst()) {
                            lLIZIZ = C622120Oag.LIZIZ(c908020ZjkLJJLIL, enumC622090Oad.getKey());
                        } else {
                            lLIZIZ = null;
                        }
                        sQLiteDatabaseLJ.LJJIIZ();
                        c621980OaSLIZIZ.LIZ.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("queryBulletinBoardIdentity ");
                        if (lLIZIZ == null) {
                            str = "fail";
                        } else {
                            str = "success";
                        }
                        sbLIZ2.append(str);
                        sbLIZ2.append("; ");
                        sbLIZ2.append(str2);
                        C622290Oax.LJFF("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ2));
                        C2107108Nh.LIZ(c908020ZjkLJJLIL, null);
                        sQLiteDatabaseLJ.LJJIIZI();
                        l = lLIZIZ;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                th = null;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c908020ZjkLJJLIL, th);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    sQLiteDatabaseLJ.LJJIIZI();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c621980OaSLIZIZ.LIZ.LIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("queryBulletinBoardIdentity fail; ");
                sbLIZ3.append(str2);
                C622290Oax.LIZJ("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ3), e);
                sQLiteDatabaseLJ.LJJIIZI();
            }
        }
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.getBulletinBoardItemResponse$identityType$temp$1");
        return l;
    }
}
