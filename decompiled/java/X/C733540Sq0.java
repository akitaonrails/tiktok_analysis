package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Sq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733540Sq0 {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final String LIZLLL;

    public C733540Sq0(Aweme aweme, String str, UrlModel urlModel, String str2, int i) {
        urlModel = (i & 4) != 0 ? null : urlModel;
        str2 = (i & 32) != 0 ? null : str2;
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = urlModel;
        this.LIZLLL = str2;
    }
}
