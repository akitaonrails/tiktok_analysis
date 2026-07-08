package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.084q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20586084q {
    public static final AnonymousClass0842 LIZ = new AnonymousClass0842();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(470));

    public static void LIZ(Long l, String str) {
        Boolean boolValueOf;
        if (l != null) {
            l.longValue();
            if (str == null || !((Boolean) LIZIZ.getValue()).booleanValue()) {
                return;
            }
            AnonymousClass0842 anonymousClass0842 = LIZ;
            synchronized (anonymousClass0842) {
                try {
                    List list = (List) anonymousClass0842.get((Object) l);
                    if (list != null) {
                        boolValueOf = Boolean.valueOf(list.remove(str));
                    } else {
                        boolValueOf = null;
                    }
                    Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
