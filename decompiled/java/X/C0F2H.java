package X;

import android.view.View;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F2H, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2H {
    public final Function1<View, Unit> LIZ;
    public final Function1<Boolean, Unit> LIZIZ;
    public final Function0<RevealStoryCreationModel> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F2H)) {
            return false;
        }
        C0F2H c0f2h = (C0F2H) obj;
        return Intrinsics.LJFF(this.LIZ, c0f2h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0f2h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0f2h.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealBlurOverlayAction(requestLayoutOverlayView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onClickShowHideBlur=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", revealInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F2H(C0F2J c0f2j, C0F2I c0f2i, AwS566S0100000_22 awS566S0100000_22) {
        this.LIZ = c0f2j;
        this.LIZIZ = c0f2i;
        this.LIZJ = awS566S0100000_22;
    }
}
