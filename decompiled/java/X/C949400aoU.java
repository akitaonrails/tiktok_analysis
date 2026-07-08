package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS202S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949400aoU {
    public final boolean LIZ;
    public final MixInfo LIZIZ;
    public final InterfaceC965060bDk LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final Function0<String> LJI;
    public final boolean LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final Function0<Boolean> LJIIIZ;
    public String LJIIJ;
    public final List<String> LJIIJJI;
    public final InterfaceC965150bDt LJIIL;

    public C949400aoU() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949400aoU)) {
            return false;
        }
        C949400aoU c949400aoU = (C949400aoU) obj;
        return this.LIZ == c949400aoU.LIZ && Intrinsics.LJFF(this.LIZIZ, c949400aoU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c949400aoU.LIZJ) && this.LIZLLL == c949400aoU.LIZLLL && this.LJ == c949400aoU.LJ && Intrinsics.LJFF(this.LJFF, c949400aoU.LJFF) && Intrinsics.LJFF(this.LJI, c949400aoU.LJI) && this.LJII == c949400aoU.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c949400aoU.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c949400aoU.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c949400aoU.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c949400aoU.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c949400aoU.LJIIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        MixInfo mixInfo = this.LIZIZ;
        int iHashCode = (iZ2 + (mixInfo == null ? 0 : mixInfo.hashCode())) * 31;
        InterfaceC965060bDk interfaceC965060bDk = this.LIZJ;
        int iHashCode2 = (((((iHashCode + (interfaceC965060bDk == null ? 0 : interfaceC965060bDk.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        Function0<Boolean> function0 = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31;
        String str2 = this.LJIIJ;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.LJIIJJI;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        InterfaceC965150bDt interfaceC965150bDt = this.LJIIL;
        return iHashCode6 + (interfaceC965150bDt != null ? interfaceC965150bDt.hashCode() : 0);
    }

    public final String toString() {
        return "LiveConfig(shouldMixStream=" + this.LIZ + ", mixerInfo=" + this.LIZIZ + ", client=" + this.LIZJ + ", pushAdvance=" + this.LIZLLL + ", initInBackground=" + this.LJ + ", background=" + this.LJFF + ", generateRTCParamByRole=" + this.LJI + ", businessSideEnableIndependentMixStreamParams=" + this.LJII + ", preJoinChannel=" + this.LJIIIIZZ + ", canInitRtcAdavance=" + this.LJIIIZ + ", sharedBgUrl=" + this.LJIIJ + ", pushUrls=" + this.LJIIJJI + ", renderResProvider=" + this.LJIIL + ')';
    }

    public C949400aoU(boolean z, MixInfo mixInfo, InterfaceC965060bDk interfaceC965060bDk, boolean z2, boolean z3, String str, Function0 function0, boolean z4, AwS202S0000000_15 awS202S0000000_15, AFwS203S0000000_15 aFwS203S0000000_15, List list, C949390aoT c949390aoT, int i) {
        Function0<Boolean> function02 = awS202S0000000_15;
        AFwS203S0000000_15 aFwS203S0000000_152 = aFwS203S0000000_15;
        List list2 = list;
        C949390aoT c949390aoT2 = c949390aoT;
        z2 = (i & 8) != 0 ? true : z2;
        z3 = (i & 16) != 0 ? false : z3;
        str = (i & 32) != 0 ? null : str;
        function0 = (i & 64) != 0 ? AFwS203S0000000_15.get$arr$(503) : function0;
        boolean z5 = (i & 128) == 0 ? z4 : false;
        function02 = (i & 256) != 0 ? AFwS203S0000000_15.get$arr$(504) : function02;
        aFwS203S0000000_152 = (i & 512) != 0 ? null : aFwS203S0000000_152;
        list2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : list2;
        c949390aoT2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c949390aoT2;
        this.LIZ = z;
        this.LIZIZ = mixInfo;
        this.LIZJ = interfaceC965060bDk;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = str;
        this.LJI = function0;
        this.LJII = z5;
        this.LJIIIIZZ = function02;
        this.LJIIIZ = aFwS203S0000000_152;
        this.LJIIJ = null;
        this.LJIIJJI = list2;
        this.LJIIL = c949390aoT2;
    }
}
