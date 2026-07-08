package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432900GyG implements InterfaceC1175904ir {
    public final Function1<Context, Unit> LIZ;
    public final Function1<Context, Unit> LIZIZ;
    public final Function1<Context, Unit> LIZJ;
    public final Function1<Context, Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C432900GyG)) {
            return false;
        }
        C432900GyG c432900GyG = (C432900GyG) obj;
        return Intrinsics.LJFF(this.LIZ, c432900GyG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c432900GyG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c432900GyG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c432900GyG.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordFieldAction(onPlayVoiceMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onPausePlayingVoiceMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onResumePlayVoiceMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", deleteAndStopRecording=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C432900GyG(AwS585S0100000_6 awS585S0100000_6, AwS585S0100000_6 awS585S0100000_62, AwS585S0100000_6 awS585S0100000_63, AwS585S0100000_6 awS585S0100000_64) {
        this.LIZ = awS585S0100000_6;
        this.LIZIZ = awS585S0100000_62;
        this.LIZJ = awS585S0100000_63;
        this.LIZLLL = awS585S0100000_64;
    }
}
