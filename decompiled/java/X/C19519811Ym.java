package X;

import com.ss.android.ugc.aweme.services.audio.VoiceCloneSpeakerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19519811Ym {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function1<VoiceCloneSpeakerInfo, Boolean> LIZLLL;
    public final Function0<String> LJ;
    public final Function1<String, Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public final Function1<VoiceCloneSpeakerInfo, Unit> LJIIJ;
    public final Function0<Unit> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19519811Ym)) {
            return false;
        }
        C19519811Ym c19519811Ym = (C19519811Ym) obj;
        return Intrinsics.LJFF(this.LIZ, c19519811Ym.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19519811Ym.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19519811Ym.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c19519811Ym.LIZLLL) && Intrinsics.LJFF(this.LJ, c19519811Ym.LJ) && Intrinsics.LJFF(this.LJFF, c19519811Ym.LJFF) && Intrinsics.LJFF(this.LJI, c19519811Ym.LJI) && Intrinsics.LJFF(this.LJII, c19519811Ym.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c19519811Ym.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c19519811Ym.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c19519811Ym.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c19519811Ym.LJIIJJI);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "EditorProVoiceClonePanelSceneActions(closeVopPanel=" + this.LIZ + ", closeSettingPanel=" + this.LIZIZ + ", closeByClickOuter=" + this.LIZJ + ", useVoice=" + this.LIZLLL + ", getVopAuditionFilePath=" + this.LJ + ", playAudioClicked=" + this.LJFF + ", enterTextClicked=" + this.LJI + ", settingButtonClicked=" + this.LJII + ", reCreateButtonClicked=" + this.LJIIIIZZ + ", deleteButtonClicked=" + this.LJIIIZ + ", voiceChanged=" + this.LJIIJ + ", voiceDeleted=" + this.LJIIJJI + ')';
    }

    public C19519811Ym(AwS573S0100000_29 awS573S0100000_29, AwS573S0100000_29 awS573S0100000_292, AwS573S0100000_29 awS573S0100000_293, AwS608S0100000_29 awS608S0100000_29, AwS573S0100000_29 awS573S0100000_294, AwS608S0100000_29 awS608S0100000_292, AwS556S0100000_12 awS556S0100000_12, AwS573S0100000_29 awS573S0100000_295, AwS573S0100000_29 awS573S0100000_296, AwS573S0100000_29 awS573S0100000_297, AwS608S0100000_29 awS608S0100000_293, AwS573S0100000_29 awS573S0100000_298) {
        this.LIZ = awS573S0100000_29;
        this.LIZIZ = awS573S0100000_292;
        this.LIZJ = awS573S0100000_293;
        this.LIZLLL = awS608S0100000_29;
        this.LJ = awS573S0100000_294;
        this.LJFF = awS608S0100000_292;
        this.LJI = awS556S0100000_12;
        this.LJII = awS573S0100000_295;
        this.LJIIIIZZ = awS573S0100000_296;
        this.LJIIIZ = awS573S0100000_297;
        this.LJIIJ = awS608S0100000_293;
        this.LJIIJJI = awS573S0100000_298;
    }
}
