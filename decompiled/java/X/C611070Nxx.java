package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611070Nxx {
    public final void LIZLLL() {
        Pair pair;
        Object c098200Yq;
        Object c098200Yq2;
        synchronized (this) {
            try {
                SkylightUnifiedDB skylightUnifiedDB = SkylightUnifiedDB.LLILLJJLI;
                if (skylightUnifiedDB == null) {
                    pair = new Pair(null, null);
                } else {
                    String str = SkylightUnifiedDB.LLILLL;
                    SkylightUnifiedDB.LLILLJJLI = null;
                    SkylightUnifiedDB.LLILLL = null;
                    pair = new Pair(skylightUnifiedDB, str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AbstractC796540VMm abstractC796540VMm = (AbstractC796540VMm) pair.getFirst();
        String str2 = (String) pair.getSecond();
        if (abstractC796540VMm != null) {
            try {
                abstractC796540VMm.close();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("SkylightUnifiedDB", "close corrupt db failed", thM5exceptionOrNullimpl);
            }
        }
        if (str2 != null) {
            try {
                C844470XAv.LIZ.getClass();
                c098200Yq2 = Boolean.valueOf(C844470XAv.LIZ().deleteDatabase(LIZIZ(str2)));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq2 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = bool;
            }
            boolean zBooleanValue = ((Boolean) c098200Yq2).booleanValue();
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightUnifiedDB", "recoverFromCorruption: deleted=" + zBooleanValue + ", uid=" + str2);
        }
    }

    public final SkylightUnifiedDB LIZJ() {
        SkylightUnifiedDB skylightUnifiedDBLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId.length() <= 0) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
        SkylightUnifiedDB skylightUnifiedDB = SkylightUnifiedDB.LLILLJJLI;
        if (skylightUnifiedDB != null && Intrinsics.LJFF(SkylightUnifiedDB.LLILLL, curUserId)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get: cache hit, cost=");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ.append("ms, currentUidCost=");
            sbLIZ.append(jCurrentTimeMillis3);
            sbLIZ.append("ms");
            C2188811AlT.LIZIZ(sbLIZ);
            return skylightUnifiedDB;
        }
        synchronized (this) {
            try {
                skylightUnifiedDBLIZ = SkylightUnifiedDB.LLILLJJLI;
                if (skylightUnifiedDBLIZ == null || !Intrinsics.LJFF(SkylightUnifiedDB.LLILLL, curUserId)) {
                    String str = SkylightUnifiedDB.LLILLL;
                    if (str != null) {
                        SkylightUnifiedDB.LLILZ = str;
                        SkylightUnifiedDB.LLILZIL = System.currentTimeMillis();
                    }
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("SkylightUnifiedDB", "build a new db instance for user");
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    C611070Nxx c611070Nxx = SkylightUnifiedDB.LL;
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    c611070Nxx.getClass();
                    skylightUnifiedDBLIZ = LIZ(contextLIZ, curUserId);
                    long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis4;
                    SkylightUnifiedDB.LLILLJJLI = skylightUnifiedDBLIZ;
                    SkylightUnifiedDB.LLILLL = curUserId;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("get: build new instance, buildCost=");
                    sbLIZ2.append(jCurrentTimeMillis5);
                    sbLIZ2.append("ms, totalCost=");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ2.append("ms, currentUidCost=");
                    sbLIZ2.append(jCurrentTimeMillis3);
                    sbLIZ2.append("ms");
                    C1720106oR.LJI("SkylightUnifiedDB", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("get: cache hit after lock, cost=");
                    sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ3.append("ms, currentUidCost=");
                    sbLIZ3.append(jCurrentTimeMillis3);
                    sbLIZ3.append("ms");
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return skylightUnifiedDBLIZ;
    }

    public static String LIZIZ(String str) {
        return C786410Ut5.j4("skylight_cache_db_%s.db", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static SkylightUnifiedDB LIZ(Context context, String str) {
        C796500VMi c796500VMiLIZ = C0OGG.LIZ(C786410Ut5.N3(context), SkylightUnifiedDB.class, LIZIZ(str));
        if (((Number) C0AH5.LIZ.getValue()).intValue() == 1) {
            c796500VMiLIZ.LJIIIIZZ = EnumC611420NyW.TRUNCATE;
        }
        c796500VMiLIZ.LIZJ();
        return (SkylightUnifiedDB) c796500VMiLIZ.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn r15, kotlin.jvm.functions.Function2 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C611070Nxx.LJ(X.05Vn, kotlin.jvm.functions.Function2, java.lang.Object):java.lang.Object");
    }
}
