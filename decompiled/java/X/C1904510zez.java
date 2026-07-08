package X;

import com.ss.android.ugc.aweme.inbox.setting.Configuration;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904510zez extends AbstractC1523260pk4 {
    public static final C1904510zez LJFF = new C1904510zez();
    public static final Map<String, C1523270pk5> LJI = C2097608Jq.LJIIJ(new Pair("notice", new C1523270pk5("notice")), new Pair("recommend", new C1523270pk5("recommend")));
    public static final long LJII = ((Configuration) C1904520zf0.LIZIZ.getValue()).activityPageMaxLoadTime;

    public C1904510zez() {
        super("new_activities_service_quality");
    }

    @Override // X.AbstractC1523260pk4
    public final Map<String, C1523270pk5> LIZIZ() {
        return LJI;
    }

    @Override // X.AbstractC1523260pk4
    public final long LIZJ() {
        return LJII;
    }
}
