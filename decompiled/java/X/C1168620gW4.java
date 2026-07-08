package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168620gW4 extends C1168650gW7 {
    public UrlModel LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    public C1168620gW4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168620gW4)) {
            return false;
        }
        C1168620gW4 c1168620gW4 = (C1168620gW4) obj;
        return Intrinsics.LJFF(this.LLILLL, c1168620gW4.LLILLL) && this.LLILZ == c1168620gW4.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1168620gW4.LLILZIL) && this.LLILZLL == c1168620gW4.LLILZLL && this.LLIZ == c1168620gW4.LLIZ;
    }

    public final int hashCode() {
        UrlModel urlModel = this.LLILLL;
        int iHashCode = (((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.LLILZ) * 31;
        String str = this.LLILZIL;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddFeedToMixListItem(cover=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mixId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mixLabel=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", select=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1168650gW7
    public final boolean LIZ() {
        return this.LLIZ;
    }

    public C1168620gW4(int i) {
        super(0);
        this.LLILLL = null;
        this.LLILZ = 0;
        this.LLILZIL = null;
        this.LLILZLL = 0;
        this.LLIZ = false;
    }

    @Override // X.C1168650gW7
    public final void LIZIZ(boolean z) {
        this.LLIZ = z;
    }
}
