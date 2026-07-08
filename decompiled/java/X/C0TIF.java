package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS143S1200000_28;

/* JADX INFO: renamed from: X.0TIF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIF {
    public static final C0TIF LIZ = new C0TIF();

    public static final void LIZ(LifecycleOwner lifecycleOwner, View view, String str, Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page enter, aid:");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1533950q1J.LJ(str)) {
            C01U6.LIZIZ(new AwS143S1200000_28(view, lifecycleOwner, str, 8));
        }
    }
}
