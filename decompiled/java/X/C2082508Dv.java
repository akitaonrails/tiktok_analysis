package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2082508Dv extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ int LL = 2;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2082508Dv(int i, int i2, int i3) {
        super(0);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LL, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(this.LLILLJJLI, "video_count");
        c2344009Gk.LIZJ(this.LLILLL, "expected_start_position");
        c2344009Gk.LIZJ(this.LLILZ, "expected_end_position");
        int i = this.LLILLL;
        int i2 = this.LLILLJJLI;
        c2344009Gk.LJ(Boolean.valueOf(i <= i2 && i2 < this.LLILZ), "in_display_area");
        return c2344009Gk.LIZ;
    }
}
