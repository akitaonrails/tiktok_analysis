package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049340dPg extends AbstractC1049440dPq {
    public final Comment LLILZ;
    public final String LLILZIL;
    public final Aweme LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1049340dPg)) {
            return false;
        }
        C1049340dPg c1049340dPg = (C1049340dPg) obj;
        return Intrinsics.LJFF(this.LLILZ, c1049340dPg.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1049340dPg.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1049340dPg.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LLILZ.hashCode() * 31) + this.LLILZIL.hashCode()) * 31;
        Aweme aweme = this.LLILZLL;
        return iHashCode + (aweme == null ? 0 : aweme.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceCommentPowerItem(comment=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1049440dPq, X.AbstractC1049450dPr
    public final Comment LIZ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1049440dPq
    public final String LIZIZ() {
        return this.LLILZIL;
    }

    public C1049340dPg(Comment comment, Aweme aweme, String str) {
        super(comment, str);
        this.LLILZ = comment;
        this.LLILZIL = str;
        this.LLILZLL = aweme;
    }
}
