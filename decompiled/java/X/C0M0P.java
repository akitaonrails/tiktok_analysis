package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M0P, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0P extends C561950M2f {
    public int LIZLLL;
    public final String LJ;
    public String LJFF;
    public final long LJI;
    public String LJII;
    public final String LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public boolean LJIIJJI;
    public final String LJIIL;
    public EnumC545550LaT LJIILIIL;
    public float LJIILJJIL;
    public Source LJIILL;
    public final List<String> LJIILLIIL;
    public final boolean LJIIZILJ;
    public Integer LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public final boolean LJJIIJ;
    public String LJJIIJZLJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C0M0P() {
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        this(0, null, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, j, objArr, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3, objArr4, objArr5, 67108863);
    }

    public final String toString() {
        return "NewDraftDetails(type=" + this.LIZLLL + ", creationId=" + this.LJ + ", coverPath=" + this.LJFF + ", freeUpSpace=" + this.LJI + ", musicName=" + this.LJII + ", time=" + this.LJIIIIZZ + ", saveTime=" + this.LJIIIZ + ", lastEditTime=" + this.LJIIJ + ", isChecked=" + this.LJIIJJI + ", musicId=" + this.LJIIL + ", taskStatus=" + this.LJIILIIL + ", taskProgress=" + this.LJIILJJIL + ", taskSource=" + this.LJIILL + ", mentionUserAvatars=" + this.LJIILLIIL + ", isFirstAISelfAutoCast=" + this.LJIIZILJ + ", typeIconRes=" + this.LJIJ + ", effectId=" + this.LJIJI + ", effectResourceId=" + this.LJIJJ + ", effectName=" + this.LJIJJLI + ", effectPropCategory=" + this.LJIL + ", hasUpdateMusicName=" + this.LJJ + ", hasMigrateState=" + this.LJJI + ", isAutoPickDraft=" + this.LJJIFFI + ", showBadgeStyle=" + this.LJJII + ", needReportDraftShow=" + this.LJJIII + ", hasAigcNewFrameworkTask=" + this.LJJIIJ + ')';
    }

    public final int hashCode() {
        return this.LJ.hashCode();
    }

    public final long LIZIZ() {
        return C562270M3l.LJIIIZ() ? this.LJIIJ : this.LJIIIZ;
    }

    @Override // X.C561950M2f
    public final int LIZ() {
        return this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0M0P)) {
            return false;
        }
        C0M0P c0m0p = (C0M0P) obj;
        if (c0m0p.LIZLLL != this.LIZLLL || !Intrinsics.LJFF(c0m0p.LJ, this.LJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0M0P(int i, String str, String str2, long j, String str3, String str4, long j2, long j3, boolean z, EnumC545550LaT enumC545550LaT, float f, Source source, List list, boolean z2, Integer num, String str5, String str6, String str7, String str8, boolean z3, boolean z4, boolean z5, int i2) {
        boolean z6;
        String str9 = str5;
        Integer num2 = num;
        boolean z7 = z4;
        List list2 = list;
        boolean z8 = z5;
        String str10 = str;
        boolean z9 = z;
        EnumC545550LaT enumC545550LaT2 = enumC545550LaT;
        long j4 = j2;
        boolean z10 = z2;
        String str11 = str4;
        boolean z11 = z3;
        Source source2 = source;
        long j5 = j;
        String str12 = str6;
        String str13 = str2;
        String str14 = str7;
        String str15 = str3;
        float f2 = f;
        long j6 = j3;
        int i3 = (i2 & 1) != 0 ? 106 : i;
        str10 = (i2 & 2) != 0 ? "" : str10;
        str13 = (i2 & 4) != 0 ? "" : str13;
        j5 = (i2 & 8) != 0 ? 0L : j5;
        str15 = (i2 & 16) != 0 ? "" : str15;
        str11 = (i2 & 32) != 0 ? "" : str11;
        j4 = (i2 & 64) != 0 ? 0L : j4;
        j6 = (i2 & 128) != 0 ? 0L : j6;
        z9 = (i2 & 256) != 0 ? false : z9;
        String str16 = (i2 & 512) == 0 ? null : "";
        enumC545550LaT2 = (i2 & 1024) != 0 ? EnumC545550LaT.NONE : enumC545550LaT2;
        f2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0.0f : f2;
        source2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? Source.EDITOR_PRO : source2;
        list2 = (i2 & 8192) != 0 ? null : list2;
        z10 = (i2 & 16384) != 0 ? false : z10;
        num2 = (32768 & i2) != 0 ? null : num2;
        str9 = (65536 & i2) != 0 ? null : str9;
        str12 = (131072 & i2) != 0 ? null : str12;
        str14 = (262144 & i2) != 0 ? null : str14;
        String str17 = (524288 & i2) == 0 ? str8 : null;
        z11 = (1048576 & i2) != 0 ? false : z11;
        z7 = (4194304 & i2) != 0 ? false : z7;
        if ((16777216 & i2) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this(i3, str10, str13, j5, str15, str11, j4, j6, z9, str16, enumC545550LaT2, f2, source2, list2, z10, num2, str9, str12, str14, str17, z11, false, z7, false, z6, (i2 & 33554432) != 0 ? false : z8);
    }

    public C0M0P(int i, String str, String str2, long j, String str3, String str4, long j2, long j3, boolean z, String str5, EnumC545550LaT enumC545550LaT, float f, Source source, List<String> list, boolean z2, Integer num, String str6, String str7, String str8, String str9, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(0, 7);
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = j;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = j2;
        this.LJIIJ = j3;
        this.LJIIJJI = z;
        this.LJIIL = str5;
        this.LJIILIIL = enumC545550LaT;
        this.LJIILJJIL = f;
        this.LJIILL = source;
        this.LJIILLIIL = list;
        this.LJIIZILJ = z2;
        this.LJIJ = num;
        this.LJIJI = str6;
        this.LJIJJ = str7;
        this.LJIJJLI = str8;
        this.LJIL = str9;
        this.LJJ = z3;
        this.LJJI = z4;
        this.LJJIFFI = z5;
        this.LJJII = z6;
        this.LJJIII = z7;
        this.LJJIIJ = z8;
        this.LJJIIJZLJL = "";
    }
}
