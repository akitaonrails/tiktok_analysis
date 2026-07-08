package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0poA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1525800poA {
    public final Context LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1525830poD());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1525810poB());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1525820poC(this));

    public final InterfaceC1525900poK LIZLLL() {
        return (InterfaceC1525900poK) this.LLILLJJLI.getValue();
    }

    public AbstractC1525800poA(Context context) {
        this.LL = context;
    }

    public static boolean LIZJ(long j, C1527010pq7 c1527010pq7, C801490VcJ c801490VcJ) {
        if (j != CastLongProtector.parseLong(c801490VcJ.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncId not match. server = ");
            sbLIZ.append(j);
            sbLIZ.append(", local db = ");
            sbLIZ.append(c801490VcJ.LIZ);
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (!Intrinsics.LJFF(c1527010pq7.f212did, c801490VcJ.LIZIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("did not match. server = ");
            sbLIZ2.append((Object) c1527010pq7.f212did);
            sbLIZ2.append(", local db = ");
            sbLIZ2.append((Object) c801490VcJ.LIZIZ);
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (c801490VcJ.LJ == EnumC1527250pqV.User && !Intrinsics.LJFF(c1527010pq7.uid, c801490VcJ.LIZJ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("uid not match. server = ");
            sbLIZ3.append((Object) c1527010pq7.uid);
            sbLIZ3.append(", local db = ");
            sbLIZ3.append((Object) c801490VcJ.LIZJ);
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        return true;
    }
}
