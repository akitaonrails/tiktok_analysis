package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667190QEz {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Intent intent) {
        C650960Pg6 immutableData;
        C650940Pg4 c650940Pg4;
        try {
            C650950Pg5 c650950Pg5 = (C650950Pg5) intent.getSerializableExtra("search_context_source");
            if (c650950Pg5 != null && (immutableData = c650950Pg5.getImmutableData()) != null && (c650940Pg4 = immutableData.searchEventModel) != null) {
                return Intrinsics.LJFF(c650940Pg4.isFromOutside(), Boolean.TRUE);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
