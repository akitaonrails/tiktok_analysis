package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: renamed from: X.0DV2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DV2 extends C0DV4<C0DV2> {
    public C0DV2(C0DV3 c0dv3, Aweme aweme, Map<String, String> map) {
        super("review_dashboard_click", map);
        LJ("button_type", c0dv3.getMobValue());
        if (aweme != null) {
            LJ("group_id", aweme.getAid());
        }
    }
}
