package X;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593380NPc implements InterfaceC0148002o {
    public final C291001Au<List<Uri>> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C593380NPc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C593380NPc)) {
            return false;
        }
        C593380NPc c593380NPc = (C593380NPc) obj;
        return Intrinsics.LJFF(this.LL, c593380NPc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c593380NPc.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageCreateFragmentState(onPicSelectFinishedByUri=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onGalleryClose=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C593380NPc(int i) {
        this(new C291001Au(null), new C291001Au(Boolean.FALSE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C593380NPc(C291001Au<? extends List<Uri>> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
