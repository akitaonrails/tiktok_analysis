package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.BillboardTrackParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0v6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729210v6F {
    public final String LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, Object> LJI;
    public final BillboardTrackParams LJII;

    public C1729210v6F() {
        throw null;
    }

    public C1729210v6F(String str, Long l, boolean z, String str2, String str3, String str4, BillboardTrackParams billboardTrackParams, int i) {
        z = (i & 4) != 0 ? false : z;
        billboardTrackParams = (i & 128) != 0 ? new BillboardTrackParams(0) : billboardTrackParams;
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = null;
        this.LJII = billboardTrackParams;
    }
}
