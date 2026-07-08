package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M44, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftViewInfoHelper$getDraftViewInfoList$2", f = "DraftViewInfoHelper.kt", l = {}, m = "invokeSuspend")
public final class C0M44 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC562200M3e LL;
    public final /* synthetic */ C0M4N LLILLJJLI;
    public final /* synthetic */ EnumC562220M3g LLILLL;
    public final /* synthetic */ C562260M3k LLILZ;
    public final /* synthetic */ C0M0Z LLILZIL;
    public final /* synthetic */ List<DraftViewInfo> LLILZLL;
    public final /* synthetic */ C013C LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M44(EnumC562200M3e enumC562200M3e, C0M4N c0m4n, EnumC562220M3g enumC562220M3g, C562260M3k c562260M3k, C0M0Z c0m0z, List<DraftViewInfo> list, C013C c013c, InterfaceC1364105Vn<? super C0M44> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC562200M3e;
        this.LLILLJJLI = c0m4n;
        this.LLILLL = enumC562220M3g;
        this.LLILZ = c562260M3k;
        this.LLILZIL = c0m0z;
        this.LLILZLL = list;
        this.LLIZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M44(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftViewInfoHelper@1079.getDraftViewInfoList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Cursor cursor = null;
        try {
            try {
                C0M45.LIZ.getClass();
                C0M45.LIZLLL();
                Cursor cursorRawQuery = ((SQLiteDatabase) C0M45.LIZJ.getValue()).rawQuery(C0M4D.LIZJ(new C0M4E(this.LL, this.LLILLJJLI, null, true, this.LLILLL, null, this.LLILZ, this.LLILZIL, false, null, 804)), null);
                if (cursorRawQuery != null) {
                    try {
                        if (C0M4A.LIZ(cursorRawQuery) > 0) {
                            while (C0M4A.LIZIZ(cursorRawQuery)) {
                                C0M45.LIZ.getClass();
                                DraftViewInfo draftViewInfoLIZ = C0M45.LIZ(cursorRawQuery);
                                if (draftViewInfoLIZ.draftOperationInfo.isNeedShow) {
                                    this.LLILZLL.add(draftViewInfoLIZ);
                                }
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor = cursorRawQuery;
                        TryCatchGuardChecker.doCheck(e);
                        C570300MYi.LIZ.getClass();
                        C570300MYi.LIZ(false, e);
                        C201955140j.LJI("DraftDatabaseHelper", e);
                        this.LLIZ.element = false;
                        this.LLILZLL.clear();
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        TryCatchGuardChecker.doCheck(th);
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (((ArrayList) C0M45.LIZLLL).size() > 0) {
                    C0M45.LIZ.getClass();
                    C0M45.LJ();
                }
                this.LLIZ.element = true;
                C570300MYi.LIZ.getClass();
                C570300MYi.LIZ(true, null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewInfoHelper@1079.getDraftViewInfoList$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
