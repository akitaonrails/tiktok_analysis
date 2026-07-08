package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F0H, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F0H {
    public final Function1<Integer, Unit> LIZ;
    public final Function1<String, Unit> LIZIZ;
    public final Function1<List<C379170Etn>, Unit> LIZJ;
    public final Function2<List<String>, InterfaceC1364105Vn<? super List<C378700Et2>>, Object> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function1<C0F04, Unit> LJFF;
    public final Function1<C379170Etn, Float> LJI;
    public final Function0<Unit> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F0H)) {
            return false;
        }
        C0F0H c0f0h = (C0F0H) obj;
        return Intrinsics.LJFF(this.LIZ, c0f0h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0f0h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0f0h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0f0h.LIZLLL) && Intrinsics.LJFF(this.LJ, c0f0h.LJ) && Intrinsics.LJFF(this.LJFF, c0f0h.LJFF) && Intrinsics.LJFF(this.LJI, c0f0h.LJI) && Intrinsics.LJFF(this.LJII, c0f0h.LJII);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCPreviewActions(openPickPhotoPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", usePrompt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", setMediaSelected=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fetchSuggestedPrompts=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onAlbumClosed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mobEditFunction=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", resolveVideoAspectRatio=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", notifyFirstContentRendered=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F0H(C0F0F c0f0f, C0F0L c0f0l, C0F0G c0f0g, C0F0J c0f0j, C0F0N c0f0n, C0F0K c0f0k, C0F02 c0f02, C0F0O c0f0o) {
        this.LIZ = c0f0f;
        this.LIZIZ = c0f0l;
        this.LIZJ = c0f0g;
        this.LIZLLL = c0f0j;
        this.LJ = c0f0n;
        this.LJFF = c0f0k;
        this.LJI = c0f02;
        this.LJII = c0f0o;
    }
}
