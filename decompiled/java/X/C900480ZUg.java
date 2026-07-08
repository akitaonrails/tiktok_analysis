package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900480ZUg {
    public final InterfaceC460900I5o LIZ;
    public final InterfaceC460300I3g LIZIZ;
    public final InterfaceC460300I3g LIZJ;
    public final int LIZLLL;
    public final List<UrlModel> LJ;
    public final boolean LJFF;
    public final C1622006Ws<Function1<Pair<? extends View, ? extends InterfaceC665370Q7z>, Unit>> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900480ZUg)) {
            return false;
        }
        C900480ZUg c900480ZUg = (C900480ZUg) obj;
        return Intrinsics.LJFF(this.LIZ, c900480ZUg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c900480ZUg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c900480ZUg.LIZJ) && this.LIZLLL == c900480ZUg.LIZLLL && Intrinsics.LJFF(this.LJ, c900480ZUg.LJ) && this.LJFF == c900480ZUg.LJFF && Intrinsics.LJFF(this.LJI, c900480ZUg.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC460300I3g interfaceC460300I3g = this.LIZIZ;
        int iHashCode2 = (iHashCode + (interfaceC460300I3g == null ? 0 : interfaceC460300I3g.hashCode())) * 31;
        InterfaceC460300I3g interfaceC460300I3g2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (interfaceC460300I3g2 == null ? 0 : interfaceC460300I3g2.hashCode())) * 31) + this.LIZLLL) * 31;
        List<UrlModel> list = this.LJ;
        int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        this.LJI.getClass();
        return iHashCode4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C900480ZUg(InterfaceC460900I5o interfaceC460900I5o, InterfaceC460300I3g interfaceC460300I3g, InterfaceC460300I3g interfaceC460300I3g2, int i, List<? extends UrlModel> list, boolean z, C1622006Ws<Function1<Pair<? extends View, ? extends InterfaceC665370Q7z>, Unit>> c1622006Ws) {
        this.LIZ = interfaceC460900I5o;
        this.LIZIZ = interfaceC460300I3g;
        this.LIZJ = interfaceC460300I3g2;
        this.LIZLLL = i;
        this.LJ = list;
        this.LJFF = z;
        this.LJI = c1622006Ws;
    }
}
