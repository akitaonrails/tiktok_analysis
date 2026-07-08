package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Lq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555240Lq6 {
    public static List<MentionDataItem> LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(611));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(610));
    public static String LIZLLL;

    public static String LIZ() {
        String uid;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        return (currentUser == null || (uid = currentUser.getUid()) == null) ? C1017903yT.LIZ() : uid;
    }

    public static Object LIZIZ(List list, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        if (list == null) {
            return Unit.LIZ;
        }
        LIZ = list;
        LIZLLL = LIZ();
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C485650J2t(list, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
