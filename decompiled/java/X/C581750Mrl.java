package X;

import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581750Mrl {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final JSONObject LJ;
    public final CaptionModel LJFF;

    public C581750Mrl() {
        this(false, 0, false, null, 63);
    }

    public C581750Mrl(boolean z, int i, boolean z2, CaptionModel captionModel, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        i = (i2 & 2) != 0 ? 0 : i;
        z2 = (i2 & 8) != 0 ? false : z2;
        captionModel = (i2 & 32) != 0 ? null : captionModel;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = null;
        this.LIZLLL = z2;
        this.LJ = null;
        this.LJFF = captionModel;
    }
}
