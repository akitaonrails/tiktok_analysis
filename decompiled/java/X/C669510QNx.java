package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchResult;
import com.ss.android.ugc.aweme.search.source.utils.RecommendInfoConfig;
import defpackage.q0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0QNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669510QNx implements InterfaceC1604910rrl {
    public static final C669510QNx LIZ = new C669510QNx();

    @Override // X.InterfaceC1604910rrl
    public final String D0() {
        C0QOM.LIZ.getClass();
        if (!C07DR.LIZ()) {
            return null;
        }
        if (C1157804fw.LIZ() && !C669520QNy.LLILLL.get()) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1618170sD9 interfaceC1618170sD9LIZJ = C0Q3E.LJFF().uF().LIZJ();
        C646640PXy.LIZ.getClass();
        C669520QNy c669520QNy = (C669520QNy) C646640PXy.LIZ().l(interfaceC1618170sD9LIZJ).FU1().LIZJ();
        C0QO2.LIZ.getClass();
        if (jCurrentTimeMillis - c669520QNy.LLILLJJLI < ((long) (((RecommendInfoConfig) C0QO2.LIZJ.getValue()).reportingTime * 60)) * 1000) {
            Gson gson = C0QOM.LIZIZ;
            c669520QNy.LL.removeIfCompat(AFwS241S0000000_10.get$arr$(367));
            q0<SearchResult> q0Var = c669520QNy.LL;
            return (q0Var == null || q0Var.isEmpty()) ? "" : GsonProtectorUtils.toJson(gson, c669520QNy.LL);
        }
        if (!(!c669520QNy.LL.isEmpty())) {
            return null;
        }
        C0Q3E.LJI().fe(new C0PWT() { // from class: X.0QNz
            @Override // X.C0PWT
            public final boolean isLog() {
                return false;
            }

            static {
                C0Q3E.LJFF().FU1().LIZIZ(C13LE.LIZ(C669530QNz.class), AFwS293S0000000_10.get$arr$(196));
            }
        });
        return null;
    }

    @Override // X.InterfaceC1604910rrl
    public final Long L() {
        C0QOM.LIZ.getClass();
        if (!C07DR.LIZ()) {
            return null;
        }
        if (C1157804fw.LIZ() && !C669520QNy.LLILLL.get()) {
            return null;
        }
        InterfaceC1618170sD9 interfaceC1618170sD9LIZJ = C0Q3E.LJFF().uF().LIZJ();
        C646640PXy.LIZ.getClass();
        long j = ((C669520QNy) C646640PXy.LIZ().l(interfaceC1618170sD9LIZJ).FU1().LIZJ()).LLILLJJLI;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return null;
    }
}
