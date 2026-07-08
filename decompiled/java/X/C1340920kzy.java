package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1340920kzy extends AbstractC1340990l05 {
    public final Comment LL;
    public final C1340950l01 LLILLJJLI;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseCommentItem(comment=");
        sbLIZ.append(LIZ());
        sbLIZ.append(", commentUIState=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Comment LIZ() {
        return this.LL;
    }

    public C1340950l01 LIZIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340920kzy)) {
            return false;
        }
        C1340920kzy c1340920kzy = (C1340920kzy) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1340920kzy.LIZIZ().LIZ, LIZIZ().LIZ) || c1340920kzy.LIZIZ().LIZIZ != LIZIZ().LIZIZ || !Intrinsics.LJFF(c1340920kzy.LIZIZ().LIZJ, LIZIZ().LIZJ) || !Intrinsics.LJFF(c1340920kzy.LIZIZ().LIZLLL, LIZIZ().LIZLLL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340920kzy)) {
            return false;
        }
        if (C703302op.LIZ(LIZ().getFakeId())) {
            C1340920kzy c1340920kzy = (C1340920kzy) interfaceC1891350zJl;
            if (C703302op.LIZ(c1340920kzy.LIZ().getFakeId())) {
                LIZ().hashCode();
                return Intrinsics.LJFF(c1340920kzy.LIZ().getFakeId(), LIZ().getFakeId());
            }
        }
        return Intrinsics.LJFF(((C1340920kzy) interfaceC1891350zJl).LIZ().getCid(), LIZ().getCid());
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340920kzy)) {
            return null;
        }
        C1340920kzy c1340920kzy = (C1340920kzy) interfaceC1891350zJl;
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(c1340920kzy.LIZIZ().LIZ, LIZIZ().LIZ);
        c1340920kzy.LIZIZ();
        LIZIZ();
        if (Intrinsics.LJFF(c1340920kzy.LIZIZ().LIZJ, LIZIZ().LIZJ) && Intrinsics.LJFF(c1340920kzy.LIZIZ().LIZLLL, LIZIZ().LIZLLL)) {
            z = false;
        }
        return new C1340980l04(z2, z);
    }

    public C1340920kzy(Comment comment, C1340950l01 c1340950l01) {
        this.LL = comment;
        this.LLILLJJLI = c1340950l01;
    }
}
