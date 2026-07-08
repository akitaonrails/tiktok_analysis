package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Svm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737120Svm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C735210Ssh c735210Ssh, C0HTT c0htt) {
        Aweme aweme = c735210Ssh.LIZ;
        if (aweme.getAwemeType() == 150) {
            C621180OYa.LIZIZ.LIZ();
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c735210Ssh.LIZLLL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C751990Tef(c735210Ssh, aweme, c0htt, null), 2);
    }
}
