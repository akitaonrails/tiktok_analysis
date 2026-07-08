package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.193X, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C193X implements InterfaceC214779193p {
    public final InterfaceC1738600vLO LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final InterfaceC214777193n LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C193X)) {
            return false;
        }
        C193X c193x = (C193X) obj;
        return Intrinsics.LJFF(this.LIZ, c193x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c193x.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c193x.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC214777193n interfaceC214777193n = this.LIZJ;
        return iHashCode + (interfaceC214777193n == null ? 0 : interfaceC214777193n.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishOptionItemDataImpl(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", editModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC214779193p
    public final VideoPublishEditModel getEditModel() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC214779193p
    public final InterfaceC214777193n getPosition() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC214779193p
    public final InterfaceC1738600vLO getType() {
        return this.LIZ;
    }

    public C193X(InterfaceC1738600vLO interfaceC1738600vLO, VideoPublishEditModel videoPublishEditModel, InterfaceC214777193n interfaceC214777193n) {
        this.LIZ = interfaceC1738600vLO;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = interfaceC214777193n;
    }
}
