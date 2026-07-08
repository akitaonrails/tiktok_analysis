package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382180Eye {
    public final CreativeInfo LIZ;
    public final INLEMediaSession LIZIZ;
    public final NLEEditor LIZJ;
    public final NLETrackSlot LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final EnumC381960EyI LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final Long LJIJ;
    public final String LJIJI;
    public final List<String> LJIJJ;
    public final NLETrackSlot LJIJJLI;
    public final String LJIL;
    public final String LJJ;

    public C382180Eye() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382180Eye)) {
            return false;
        }
        C382180Eye c382180Eye = (C382180Eye) obj;
        return Intrinsics.LJFF(this.LIZ, c382180Eye.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382180Eye.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c382180Eye.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c382180Eye.LIZLLL) && Intrinsics.LJFF(this.LJ, c382180Eye.LJ) && Intrinsics.LJFF(this.LJFF, c382180Eye.LJFF) && Intrinsics.LJFF(this.LJI, c382180Eye.LJI) && Intrinsics.LJFF(this.LJII, c382180Eye.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c382180Eye.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c382180Eye.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c382180Eye.LJIIJ) && this.LJIIJJI == c382180Eye.LJIIJJI && this.LJIIL == c382180Eye.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c382180Eye.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c382180Eye.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c382180Eye.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c382180Eye.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c382180Eye.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c382180Eye.LJIJ) && Intrinsics.LJFF(this.LJIJI, c382180Eye.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c382180Eye.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c382180Eye.LJIJJLI) && Intrinsics.LJFF(this.LJIL, c382180Eye.LJIL) && Intrinsics.LJFF(this.LJJ, c382180Eye.LJJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        INLEMediaSession iNLEMediaSession = this.LIZIZ;
        int iHashCode2 = (iHashCode + (iNLEMediaSession == null ? 0 : iNLEMediaSession.hashCode())) * 31;
        NLEEditor nLEEditor = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (nLEEditor == null ? 0 : nLEEditor.hashCode())) * 31;
        NLETrackSlot nLETrackSlot = this.LIZLLL;
        int iHashCode4 = (((((((((((((((((((((((((((((iHashCode3 + (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31;
        Long l = this.LJIJ;
        int iHashCode5 = (((((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.LJIJI.hashCode()) * 31) + this.LJIJJ.hashCode()) * 31;
        NLETrackSlot nLETrackSlot2 = this.LJIJJLI;
        return ((((iHashCode5 + (nLETrackSlot2 != null ? nLETrackSlot2.hashCode() : 0)) * 31) + this.LJIL.hashCode()) * 31) + this.LJJ.hashCode();
    }

    public final String toString() {
        return "GenAII2VParam(creativeInfo=" + this.LIZ + ", nleSession=" + this.LIZIZ + ", nleEditor=" + this.LIZJ + ", operatedSlot=" + this.LIZLLL + ", videoSlotId=" + this.LJ + ", name=" + this.LJFF + ", iconUrl=" + this.LJI + ", effectId=" + this.LJII + ", effectResourceId=" + this.LJIIIIZZ + ", templateId=" + this.LJIIIZ + ", prompt=" + this.LJIIJ + ", source=" + this.LJIIJJI + ", seekCount=" + this.LJIIL + ", algoReq=" + this.LJIILIIL + ", reqKey=" + this.LJIILJJIL + ", reqJson=" + this.LJIILL + ", algoParam=" + this.LJIILLIIL + ", extra=" + this.LJIIZILJ + ", timeOutSecond=" + this.LJIJ + ", aiCreationId=" + this.LJIJI + ", imageLocalPathList=" + this.LJIJJ + ", freezeSlot=" + this.LJIJJLI + ", businessScene=" + this.LJIL + ", taskType=" + this.LJJ + ')';
    }

    public C382180Eye(CreativeInfo creativeInfo, INLEMediaSession iNLEMediaSession, NLEEditor nLEEditor, NLETrackSlot nLETrackSlot, String str, String str2, String str3, String str4, String str5, String str6, String str7, EnumC381960EyI enumC381960EyI, int i, String str8, String str9, String str10, List list, NLETrackSlot nLETrackSlot2, String str11, String str12, int i2) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17 = str5;
        String str18 = str4;
        String str19 = str2;
        NLETrackSlot nLETrackSlot3 = nLETrackSlot;
        NLEEditor nLEEditor2 = nLEEditor;
        String str20 = str3;
        NLETrackSlot nLETrackSlot4 = nLETrackSlot2;
        String str21 = str11;
        List list2 = list;
        String str22 = str10;
        String str23 = str8;
        int i3 = i;
        EnumC381960EyI enumC381960EyI2 = enumC381960EyI;
        String str24 = str7;
        String str25 = str6;
        INLEMediaSession iNLEMediaSession2 = (i2 & 2) != 0 ? null : iNLEMediaSession;
        nLEEditor2 = (i2 & 4) != 0 ? null : nLEEditor2;
        nLETrackSlot3 = (i2 & 8) != 0 ? null : nLETrackSlot3;
        str19 = (i2 & 32) != 0 ? "" : str19;
        str20 = (i2 & 64) != 0 ? "" : str20;
        str18 = (i2 & 128) != 0 ? "" : str18;
        str17 = (i2 & 256) != 0 ? "" : str17;
        str25 = (i2 & 512) != 0 ? "" : str25;
        str24 = (i2 & 1024) != 0 ? "" : str24;
        enumC381960EyI2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? EnumC381960EyI.EDITOR_PRO : enumC381960EyI2;
        i3 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 20 : i3;
        if ((i2 & 8192) != 0) {
            str13 = "";
        } else {
            str13 = null;
        }
        str23 = (i2 & 16384) != 0 ? "" : str23;
        str14 = "";
        String str26 = (32768 & i2) == 0 ? str9 : "";
        if ((65536 & i2) != 0) {
            str15 = str14;
        } else {
            str15 = null;
        }
        str22 = (131072 & i2) != 0 ? str14 : str22;
        if ((524288 & i2) != 0) {
            str16 = str14;
        } else {
            str16 = null;
        }
        list2 = (1048576 & i2) != 0 ? C13BV.INSTANCE : list2;
        nLETrackSlot4 = (2097152 & i2) != 0 ? null : nLETrackSlot4;
        str21 = (4194304 & i2) != 0 ? str14 : str21;
        str14 = (i2 & 8388608) == 0 ? str12 : "";
        this.LIZ = creativeInfo;
        this.LIZIZ = iNLEMediaSession2;
        this.LIZJ = nLEEditor2;
        this.LIZLLL = nLETrackSlot3;
        this.LJ = str;
        this.LJFF = str19;
        this.LJI = str20;
        this.LJII = str18;
        this.LJIIIIZZ = str17;
        this.LJIIIZ = str25;
        this.LJIIJ = str24;
        this.LJIIJJI = enumC381960EyI2;
        this.LJIIL = i3;
        this.LJIILIIL = str13;
        this.LJIILJJIL = str23;
        this.LJIILL = str26;
        this.LJIILLIIL = str15;
        this.LJIIZILJ = str22;
        this.LJIJ = null;
        this.LJIJI = str16;
        this.LJIJJ = list2;
        this.LJIJJLI = nLETrackSlot4;
        this.LJIL = str21;
        this.LJJ = str14;
    }
}
