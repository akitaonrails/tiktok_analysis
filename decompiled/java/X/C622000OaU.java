package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$getBulletinBoardChannelVersion$2", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C622000OaU extends C09AX implements Function1<InterfaceC1364105Vn<? super Long>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622000OaU(String str, InterfaceC1364105Vn<? super C622000OaU> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C622000OaU(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Long lLIZIZ;
        long jLongValue;
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.getBulletinBoardChannelVersion$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C622050OaZ c622050OaZLIZ = C622190Oan.LJFF().LIZ();
        String str = this.LL;
        String str2 = "";
        SQLiteDatabase sQLiteDatabaseLJ = c622050OaZLIZ.LIZ.LIZJ().LJ();
        Long l = null;
        if (sQLiteDatabaseLJ != null) {
            C622210Oap c622210Oap = new C622210Oap("get_items", c622050OaZLIZ.LIZ);
            try {
                EnumC621930OaN enumC621930OaN = EnumC621930OaN.CREATE_TIME;
                String[] strArr = {enumC621930OaN.getKey()};
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC621930OaN.BULLETIN_BOARD_ID.getKey());
                sbLIZ.append(" = ?");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(enumC621930OaN.getKey());
                sbLIZ2.append(" DESC");
                C908020Zjk c908020ZjkLJJLIL = sQLiteDatabaseLJ.LJJLIL("bulletin_item_base", strArr, C2188811AlT.LIZIZ(sbLIZ), new String[]{str}, C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    if (c908020ZjkLJJLIL.moveToFirst()) {
                        lLIZIZ = C622120Oag.LIZIZ(c908020ZjkLJJLIL, enumC621930OaN.getKey());
                    } else {
                        lLIZIZ = null;
                    }
                    c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
                    c622050OaZLIZ.LIZ.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("queryBulletinBoardLatestItemCreateTime success, bbid: ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", createTime: ");
                    sbLIZ3.append(lLIZIZ);
                    C622290Oax.LJFF("BulletinBoardItemBaseDao", C2188811AlT.LIZIZ(sbLIZ3));
                    if (lLIZIZ == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = lLIZIZ.longValue();
                    }
                    Long lValueOf = Long.valueOf(jLongValue);
                    C2107108Nh.LIZ(c908020ZjkLJJLIL, null);
                    l = lValueOf;
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
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
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c622050OaZLIZ.LIZ.LIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("queryBulletinBoardLatestItemCreateTime failed, bbid: ");
                sbLIZ4.append(str);
                C622290Oax.LIZJ("BulletinBoardItemBaseDao", C2188811AlT.LIZIZ(sbLIZ4), e);
                EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
                String message = e.getMessage();
                if (message != null) {
                    str2 = message;
                }
                c622210Oap.LIZ(enumC622250Oat, str2, null);
            }
        }
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.getBulletinBoardChannelVersion$2");
        return l;
    }
}
