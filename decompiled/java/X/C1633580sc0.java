package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633580sc0 implements InterfaceC1633610sc3 {
    public final HorizontalEffectsModel LIZ;
    public final C1633710scD LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633580sc0)) {
            return false;
        }
        C1633580sc0 c1633580sc0 = (C1633580sc0) obj;
        return Intrinsics.LJFF(this.LIZ, c1633580sc0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1633580sc0.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalReceived(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1633580sc0(HorizontalEffectsModel horizontalEffectsModel, C1633710scD c1633710scD) {
        this.LIZ = horizontalEffectsModel;
        this.LIZIZ = c1633710scD;
    }
}
