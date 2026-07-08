package X;

import com.ss.android.ugc.aweme.inbox.setting.Configuration;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904490zex extends AbstractC1523260pk4 {
    public static final C1904490zex LJFF = new C1904490zex();
    public static boolean LJI = true;
    public static final Map<String, C1523270pk5> LJII;
    public static final long LJIIIIZZ;

    static {
        Map<String, C1523270pk5> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("skylight", new C1523270pk5("skylight")), new Pair("activity", new C1523270pk5("activity")), new Pair("msg_box", new C1523270pk5("msg_box")), new Pair("dm", new C1523270pk5("dm")), new Pair("recommend", new C1523270pk5("recommend")));
        if (!C890320YwI.LIZIZ.LIZJ(true)) {
            C0OFE.LIZ("follower", new C1523270pk5("follower"));
        }
        LJII = mapLJIIJ;
        LJIIIIZZ = ((Configuration) C1904520zf0.LIZIZ.getValue()).inboxPageMaxLoadTime;
    }

    public C1904490zex() {
        super("inbox_page_service_quality");
    }

    @Override // X.AbstractC1523260pk4
    public final void LJ() {
        if (LJI) {
            super.LJ();
            LJI = false;
        }
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
