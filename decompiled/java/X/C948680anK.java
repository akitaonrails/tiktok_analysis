package X;

import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: renamed from: X.0anK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948680anK {
    public final EnumC918980a1Q LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final LayoutData LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C948680anK)) {
            return false;
        }
        C948680anK c948680anK = (C948680anK) obj;
        return this.LIZ == c948680anK.LIZ && this.LIZIZ == c948680anK.LIZIZ && this.LIZJ == c948680anK.LIZJ && Intrinsics.LJFF(this.LIZLLL, c948680anK.LIZLLL) && this.LJ == c948680anK.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizLayoutData(sourceType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupChannelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", layoutData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rawScene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        LayoutState layoutState = this.LIZLLL.layout;
        if (layoutState != null) {
            return layoutState.layoutKey;
        }
        return null;
    }

    public C948680anK(EnumC918980a1Q enumC918980a1Q, long j, long j2, LayoutData layoutData, int i) {
        this.LIZ = enumC918980a1Q;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = layoutData;
        this.LJ = i;
    }
}
