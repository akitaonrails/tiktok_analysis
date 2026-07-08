package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemBase;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0OaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$replaceBulletinBoardItemList$2", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C621960OaQ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinListResponse LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0ORW LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ Long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C621960OaQ(BulletinListResponse bulletinListResponse, String str, boolean z, C0ORW c0orw, Long l, Long l2, InterfaceC1364105Vn<? super C621960OaQ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = bulletinListResponse;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c0orw;
        this.LLILZIL = l;
        this.LLILZLL = l2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621960OaQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jLongValue;
        long jLongValue2;
        Long l;
        Long l2;
        BulletinItemBase bulletinItemBase;
        BulletinItemBase bulletinItemBase2;
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.replaceBulletinBoardItemList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLIZIZ = C619020OPs.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL);
        String str = this.LLILLJJLI;
        Long l3 = this.LLILZIL;
        Long l4 = this.LLILZLL;
        C622050OaZ c622050OaZLIZ = C622190Oan.LJFF().LIZ();
        String str2 = "";
        SQLiteDatabase sQLiteDatabaseLJ = c622050OaZLIZ.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ != null) {
            if (l3 != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = Long.MAX_VALUE;
            }
            if (l4 != null) {
                jLongValue2 = l4.longValue();
            } else {
                jLongValue2 = 0;
            }
            List listLIZ = C621860OaG.LIZ(jLongValue, jLongValue2, str);
            List listLIZIZ2 = C621860OaG.LIZIZ(listLIZIZ);
            C622210Oap c622210Oap = new C622210Oap("write_items", c622050OaZLIZ.LIZ);
            try {
                try {
                    sQLiteDatabaseLJ.LJI(true);
                    for (Pair pair : (ArrayList) listLIZ) {
                        sQLiteDatabaseLJ.LJJ((String) pair.getFirst(), (Object[]) pair.getSecond());
                    }
                    for (Pair pair2 : (ArrayList) listLIZIZ2) {
                        sQLiteDatabaseLJ.LJJ((String) pair2.getFirst(), (Object[]) pair2.getSecond());
                    }
                    sQLiteDatabaseLJ.LJJIIZ();
                    c622050OaZLIZ.LIZ.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateRangeAndInsert, bbid: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", TimeRange[");
                    sbLIZ.append(l3);
                    sbLIZ.append(", ");
                    sbLIZ.append(l4);
                    sbLIZ.append("], insertItemSize: ");
                    sbLIZ.append(((ArrayList) listLIZIZ).size());
                    sbLIZ.append(", insertItemRange: [");
                    C619060OPw c619060OPw = (C619060OPw) C13LP.LJJJLL(listLIZIZ);
                    if (c619060OPw != null && (bulletinItemBase2 = c619060OPw.LIZ) != null) {
                        l = bulletinItemBase2.createTime;
                    } else {
                        l = null;
                    }
                    sbLIZ.append(l);
                    sbLIZ.append(", ");
                    C619060OPw c619060OPw2 = (C619060OPw) C13LP.LJJLIIIJL(listLIZIZ);
                    if (c619060OPw2 != null && (bulletinItemBase = c619060OPw2.LIZ) != null) {
                        l2 = bulletinItemBase.createTime;
                    } else {
                        l2 = null;
                    }
                    sbLIZ.append(l2);
                    sbLIZ.append(']');
                    C622290Oax.LJFF("BulletinBoardItemBaseDao", C2188811AlT.LIZIZ(sbLIZ));
                    c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateRangeAndInsert failed：bbid=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", TimeRange[");
                    sbLIZ2.append(l3);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(l4);
                    sbLIZ2.append("], insertItemSize=");
                    sbLIZ2.append(((ArrayList) listLIZIZ).size());
                    sbLIZ2.append(", errorMsg：");
                    sbLIZ2.append(e.getMessage());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c622050OaZLIZ.LIZ.LIZ();
                    C622290Oax.LIZJ("BulletinBoardItemBaseDao", strLIZIZ, e);
                    EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
                    String message = e.getMessage();
                    if (message != null) {
                        str2 = message;
                    }
                    c622210Oap.LIZ(enumC622250Oat, str2, null);
                }
                sQLiteDatabaseLJ.LJJIIZI();
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        sQLiteDatabaseLJ.LJJIIZI();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        C0ORW c0orw = this.LLILZ;
        List list = this.LL.bulletinItems;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c0orw.getClass();
        Unit unitLJIIZILJ = C0ORW.LJIIZILJ(list);
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.replaceBulletinBoardItemList$2");
        return unitLJIIZILJ;
    }
}
