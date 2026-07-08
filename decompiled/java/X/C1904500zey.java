package X;

import com.ss.android.ugc.aweme.inbox.setting.Configuration;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904500zey extends AbstractC1523260pk4 {
    public static final C1904500zey LJFF = new C1904500zey();
    public static int LJI = 21;
    public static final Map<String, C1523270pk5> LJII = C2097608Jq.LJIIJ(new Pair("notice", new C1523270pk5("notice")), new Pair("recommend", new C1523270pk5("recommend")));
    public static final long LJIIIIZZ = ((Configuration) C1904520zf0.LIZIZ.getValue()).followerPageMaxLoadTime;

    public C1904500zey() {
        super("new_followers_service_quality");
    }

    @Override // X.AbstractC1523260pk4
    public final Map<String, String> LIZ() {
        return C2097908Jt.LIZJ(new Pair("scenario", String.valueOf(LJI)));
    }

    @Override // X.AbstractC1523260pk4
    public final Map<String, C1523270pk5> LIZIZ() {
        return LJII;
    }

    @Override // X.AbstractC1523260pk4
    public final long LIZJ() {
        return LJIIIIZZ;
    }
}
