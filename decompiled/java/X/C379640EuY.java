package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379640EuY {
    public final EnumC379630EuX LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final Function0<VideoPublishEditModel> LIZJ;
    public final Function0<Pair<Float, Float>> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C379640EuY)) {
            return false;
        }
        C379640EuY c379640EuY = (C379640EuY) obj;
        return this.LIZ == c379640EuY.LIZ && Intrinsics.LJFF(this.LIZIZ, c379640EuY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c379640EuY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c379640EuY.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC497601wk interfaceC497601wk = this.LIZIZ;
        return ((((iHashCode + (interfaceC497601wk == null ? 0 : interfaceC497601wk.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIRuntimeContext(businessScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lifecycleScope=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", editModelProvider=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canvasSizeProvider=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C379640EuY(EnumC379630EuX enumC379630EuX, InterfaceC497601wk interfaceC497601wk, Function0 function0) {
        this(enumC379630EuX, interfaceC497601wk, function0, AFwS191S0000000_5.get$arr$(421));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C379640EuY(EnumC379630EuX enumC379630EuX, InterfaceC497601wk interfaceC497601wk, Function0<? extends VideoPublishEditModel> function0, Function0<Pair<Float, Float>> function02) {
        this.LIZ = enumC379630EuX;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = function0;
        this.LIZLLL = function02;
    }
}
