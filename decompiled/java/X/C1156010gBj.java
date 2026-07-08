package X;

import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156010gBj implements InterfaceC0148002o {
    public final SkylightBlocks LL;
    public final AbstractC1155960gBe LLILLJJLI;

    public C1156010gBj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156010gBj)) {
            return false;
        }
        C1156010gBj c1156010gBj = (C1156010gBj) obj;
        return Intrinsics.LJFF(this.LL, c1156010gBj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1156010gBj.LLILLJJLI);
    }

    public final int hashCode() {
        SkylightBlocks skylightBlocks = this.LL;
        return ((skylightBlocks == null ? 0 : skylightBlocks.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaTopTabMainState(res=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", refreshState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1156010gBj(int i) {
        this(null, C1155970gBf.LIZ);
    }

    public C1156010gBj(SkylightBlocks skylightBlocks, AbstractC1155960gBe abstractC1155960gBe) {
        this.LL = skylightBlocks;
        this.LLILLJJLI = abstractC1155960gBe;
    }

    public static C1156010gBj LIZ(C1156010gBj c1156010gBj, AbstractC1155960gBe abstractC1155960gBe) {
        SkylightBlocks skylightBlocks = c1156010gBj.LL;
        c1156010gBj.getClass();
        return new C1156010gBj(skylightBlocks, abstractC1155960gBe);
    }
}
