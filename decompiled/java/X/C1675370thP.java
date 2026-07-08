package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.0thP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675370thP {
    public final String LIZ;
    public final UrlModel LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public C1675370thP(String str, UrlModel urlModel, String str2, boolean z, int i) {
        urlModel = (i & 8) != 0 ? null : urlModel;
        str2 = (i & 16) != 0 ? null : str2;
        z = (i & 32) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = urlModel;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
