package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561430qjd implements InterfaceC20477315At {
    public final List<List<C150F>> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1561430qjd)) {
            return false;
        }
        C1561430qjd c1561430qjd = (C1561430qjd) obj;
        return Intrinsics.LJFF(this.LIZ, c1561430qjd.LIZ) && this.LIZIZ == c1561430qjd.LIZIZ && this.LIZJ == c1561430qjd.LIZJ && this.LIZLLL == c1561430qjd.LIZLLL && this.LJ == c1561430qjd.LJ && this.LJFF == c1561430qjd.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardGeniusConfigNew(boardList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleTextSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contentTextSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstFlipDuration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", secondFlipDuration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", detached=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20477315At
    public final InterfaceC20477315At LIZJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZ);
        long j = this.LIZLLL;
        long j2 = this.LJ;
        return new C1561430qjd(this.LJFF, arrayList, j, this.LIZIZ, this.LIZJ, j2);
    }

    @Override // X.InterfaceC20477315At
    public final boolean LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC20477315At
    public final void LIZIZ(boolean z) {
        this.LJFF = z;
    }

    public /* synthetic */ C1561430qjd(List list, int i, int i2) {
        this(false, list, Mp4ScreenVideoLoadTimeout.CONTROL, i, i2, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public C1561430qjd(boolean z, List list, long j, int i, int i2, long j2) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = z;
    }
}
