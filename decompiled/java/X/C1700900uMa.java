package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700900uMa extends AbstractC1700910uMb implements InterfaceC490060JJs, InterfaceC1700930uMd {
    public final InterfaceC1815550xLV LIZ;
    public final Board LIZIZ;
    public final Board LIZJ;
    public final Board LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1700900uMa)) {
            return false;
        }
        C1700900uMa c1700900uMa = (C1700900uMa) obj;
        return Intrinsics.LJFF(this.LIZ, c1700900uMa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1700900uMa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1700900uMa.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditingDecorationTools(editorState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentlyEditingBoard=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previouslyActiveBoard=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1700930uMd
    public final Board LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC490060JJs
    public final Board LIZIZ() {
        return this.LIZLLL;
    }

    public C1700900uMa(InterfaceC1815550xLV interfaceC1815550xLV, Board board, Board board2) {
        this.LIZ = interfaceC1815550xLV;
        this.LIZIZ = board;
        this.LIZJ = board2;
        this.LIZLLL = board;
    }
}
