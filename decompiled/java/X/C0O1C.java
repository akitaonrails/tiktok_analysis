package X;

import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O1C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1C implements InterfaceC0148002o {
    public final AbstractC1623806Xk<MusicDetail> LL;

    public C0O1C() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0O1C) && Intrinsics.LJFF(this.LL, ((C0O1C) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDetailState(musicDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0O1C(int i) {
        this(C491101vh.LIZ);
    }

    public C0O1C(AbstractC1623806Xk<MusicDetail> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
