package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459840I1m implements InterfaceC454990Hsn {
    public final ThoughtInfo LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C0I3C LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C459840I1m)) {
            return false;
        }
        C459840I1m c459840I1m = (C459840I1m) obj;
        return Intrinsics.LJFF(this.LIZ, c459840I1m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c459840I1m.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c459840I1m.LIZJ) && this.LIZLLL == c459840I1m.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyToThought(thought=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", authorUid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authorName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", origin=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C459840I1m(ThoughtInfo thoughtInfo, String str, String str2, C0I3C c0i3c) {
        this.LIZ = thoughtInfo;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c0i3c;
    }
}
