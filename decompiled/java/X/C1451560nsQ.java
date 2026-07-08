package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451560nsQ {
    public final int LIZ;
    public final CommentImageModel LIZIZ;
    public final Intent LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final InterfaceC1631620sYq<Integer, Integer, Intent, Unit> LJFF;
    public final Aweme LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;

    public C1451560nsQ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1451560nsQ)) {
            return false;
        }
        C1451560nsQ c1451560nsQ = (C1451560nsQ) obj;
        return this.LIZ == c1451560nsQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1451560nsQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1451560nsQ.LIZJ) && this.LIZLLL == c1451560nsQ.LIZLLL && Intrinsics.LJFF(this.LJ, c1451560nsQ.LJ) && Intrinsics.LJFF(this.LJFF, c1451560nsQ.LJFF) && Intrinsics.LJFF(this.LJI, c1451560nsQ.LJI) && Intrinsics.LJFF(this.LJII, c1451560nsQ.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1451560nsQ.LJIIIIZZ) && this.LJIIIZ == c1451560nsQ.LJIIIZ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        CommentImageModel commentImageModel = this.LIZIZ;
        int iHashCode = (i + (commentImageModel == null ? 0 : commentImageModel.hashCode())) * 31;
        Intent intent = this.LIZJ;
        int iHashCode2 = (((iHashCode + (intent == null ? 0 : intent.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC1631620sYq<Integer, Integer, Intent, Unit> interfaceC1631620sYq = this.LJFF;
        int iHashCode4 = (iHashCode3 + (interfaceC1631620sYq == null ? 0 : interfaceC1631620sYq.hashCode())) * 31;
        Aweme aweme = this.LJI;
        int iHashCode5 = (iHashCode4 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str2 = this.LJII;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentImageEditPageParam(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", model=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", intent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onlyCrop=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", editedPath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", resultCallback=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isInternalImage=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1451560nsQ(CommentImageModel commentImageModel, Intent intent, boolean z, String str, InterfaceC1631620sYq interfaceC1631620sYq, Aweme aweme, String str2, String str3, boolean z2, int i) {
        intent = (i & 4) != 0 ? null : intent;
        z = (i & 8) != 0 ? false : z;
        str = (i & 16) != 0 ? null : str;
        interfaceC1631620sYq = (i & 32) != 0 ? null : interfaceC1631620sYq;
        aweme = (i & 64) != 0 ? null : aweme;
        str2 = (i & 128) != 0 ? null : str2;
        str3 = (i & 256) != 0 ? null : str3;
        z2 = (i & 512) != 0 ? false : z2;
        this.LIZ = 0;
        this.LIZIZ = commentImageModel;
        this.LIZJ = intent;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = interfaceC1631620sYq;
        this.LJI = aweme;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = z2;
    }
}
