package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361210lWh extends C1361250lWl implements C0SDD {
    public boolean LLILLJJLI;
    public final C1351060lGK LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    public C1361210lWh() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361210lWh)) {
            return false;
        }
        C1361210lWh c1361210lWh = (C1361210lWh) obj;
        return this.LLILLJJLI == c1361210lWh.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1361210lWh.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3VideoItem(descExpanded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", comments=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1361270lWn
    public final String LJJIJIIJIL() {
        return getAweme().getDesc();
    }

    @Override // X.InterfaceC1361270lWn
    public final User LLILLL() {
        return getAweme().getAuthor();
    }

    @Override // X.InterfaceC1361290lWp
    public final String getUniqueKey() {
        return C1361260lWm.LIZJ(this);
    }

    @Override // X.C0SDD
    public final C1351060lGK LJLIIL() {
        return this.LLILLL;
    }

    @Override // X.C0SDD
    public final boolean LJZI() {
        return this.LLILLJJLI;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1361290lWp
    public final String getType() {
        return this.LLILZ;
    }

    @Override // X.C0SDD
    public final void LJJJJIZL(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC1361270lWn, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361260lWm.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1361260lWm.LIZIZ(this, interfaceC1891350zJl);
    }

    public C1361210lWh(C1351060lGK c1351060lGK, int i) {
        c1351060lGK = (i & 2) != 0 ? new C1351060lGK(new CommentItemList(), false, 62) : c1351060lGK;
        this.LLILLJJLI = false;
        this.LLILLL = c1351060lGK;
        this.LLILZ = "cell_video";
        this.LLILZIL = 50001;
    }
}
