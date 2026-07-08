package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587460N2i {
    public static final boolean LIZ(C19EG c19eg, String str) {
        String stringExtra;
        if (c19eg == null) {
            return false;
        }
        Intent intent = c19eg.getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("story_publish_landing_tab");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        return Intrinsics.LJFF(stringExtra, str);
    }
}
