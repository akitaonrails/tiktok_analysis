package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886430Yq1 implements InterfaceC882230YjF {
    public final UrlModel LL;

    public C886430Yq1() {
        this(null);
    }

    public final C886430Yq1 copy(UrlModel urlModel) {
        return new C886430Yq1(urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C886430Yq1) && Intrinsics.LJFF(this.LL, ((C886430Yq1) obj).LL);
    }

    public int hashCode() {
        UrlModel urlModel = this.LL;
        if (urlModel == null) {
            return 0;
        }
        return urlModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlModelAvatar(urlRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UrlModel getUrlRes() {
        return this.LL;
    }

    public C886430Yq1(UrlModel urlModel) {
        this.LL = urlModel;
    }
}
