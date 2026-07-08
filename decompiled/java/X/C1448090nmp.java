package X;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448090nmp {
    public static final Set<EnumC992420bvs> LIZ = Collections.singleton(EnumC992420bvs.DIRECT_SHOOT);

    public static final EnumC992420bvs LIZIZ(String str) {
        if (Intrinsics.LJFF(str, "direct_shoot")) {
            return EnumC992420bvs.DIRECT_SHOOT;
        }
        return null;
    }

    public static final void LIZJ(EnumC992420bvs enumC992420bvs) {
        if (enumC992420bvs != null && LIZ.contains(enumC992420bvs)) {
            C202103146b.LIZ(0, enumC992420bvs.getKey()).stop();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC992420bvs.getKey());
            sbLIZ.append(" real stop");
            C201955140j.LIZIZ("HippoAttributionExperiment", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZ(EnumC992420bvs enumC992420bvs, String str) {
        if (!C308340C6u.LIZ() || !Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()) || enumC992420bvs == null || str == null || !LIZ.contains(enumC992420bvs)) {
            return;
        }
        C202103146b.LIZ(0, enumC992420bvs.getKey()).LIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC992420bvs.getKey());
        sbLIZ.append(" begin stage: ");
        sbLIZ.append(str);
        C201955140j.LIZIZ("HippoAttributionExperiment", C2188811AlT.LIZIZ(sbLIZ));
    }
}
