package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.0l01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340950l01 {
    public final String LIZ;
    public final int LIZIZ;
    public final UrlModel LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        UrlModel urlModel = this.LIZJ;
        return ((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public C1340950l01(String str, String str2, UrlModel urlModel, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = urlModel;
        this.LIZLLL = str2;
    }
}
