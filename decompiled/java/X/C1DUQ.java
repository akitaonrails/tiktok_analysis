package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DUQ extends AbstractC2249061D1c<DMUploadImageResult, C1DUQ> {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final EnumC2249741D3s LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1DUQ() {
        String str = null;
        this(str, str, 0, 0 == true ? 1 : 0, 0L, str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1DUQ)) {
            return false;
        }
        C1DUQ c1duq = (C1DUQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1duq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1duq.LIZIZ) && this.LIZJ == c1duq.LIZJ && this.LIZLLL == c1duq.LIZLLL && this.LJ == c1duq.LJ && Intrinsics.LJFF(this.LJFF, c1duq.LJFF) && Intrinsics.LJFF(this.LJI, c1duq.LJI) && Intrinsics.LJFF(this.LJII, c1duq.LJII) && this.LJIIIIZZ == c1duq.LJIIIIZZ && this.LJIIIZ == c1duq.LJIIIZ && this.LJIIJ == c1duq.LJIIJ && this.LJIIJJI == c1duq.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1duq.LJIIL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        String str3 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJI;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJII;
        int iHashCode5 = (((((((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31;
        String str6 = this.LJIIL;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "PictureCardTemplateAndAttachmentWrapper(localPath=" + this.LIZ + ", localFileMD5=" + this.LIZIZ + ", width=" + this.LIZJ + ", height=" + this.LIZLLL + ", fileSize=" + this.LJ + ", secretKey=" + this.LJFF + ", uri=" + this.LJI + ", effectId=" + this.LJII + ", uploadState=" + this.LJIIIIZZ + ", isFromMainPost=" + this.LJIIIZ + ", isFromDMTextIcon=" + this.LJIIJ + ", hasTextSticker=" + this.LJIIJJI + ", pairedMsgId=" + this.LJIIL + ')';
    }

    public final List<C0YC6> LIZ(String str) {
        String str2;
        C0YC6 c0yc6 = new C0YC6(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
        c0yc6.setIndex(0);
        c0yc6.setLocalPath(this.LIZ);
        c0yc6.setOriginalWidth(this.LIZJ);
        c0yc6.setOriginalHeight(this.LIZLLL);
        c0yc6.setSecretKey(this.LJFF);
        c0yc6.setUri(this.LJI);
        c0yc6.setHash(this.LIZIZ);
        if (str != null) {
            c0yc6.setMsgUuid(str);
        }
        c0yc6.setUploadState(this.LJIIIIZZ.getState());
        C13DA c13da = new C13DA();
        if (this.LJIIIZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("key_is_from_main_post", str2);
        String str3 = this.LJII;
        if (str3 != null) {
            c13da.put("effect_id", str3);
        }
        c0yc6.updateExt(c13da.build());
        c0yc6.setLength(this.LJ);
        C0YC6 c0yc62 = new C0YC6(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
        c0yc62.setIndex(1);
        c0yc62.setOriginalWidth(this.LIZJ);
        c0yc62.setOriginalHeight(this.LIZLLL);
        c0yc62.setSecretKey(this.LJFF);
        c0yc62.setUri(this.LJI);
        c0yc62.setHash(this.LIZIZ);
        if (str != null) {
            c0yc62.setMsgUuid(str);
        }
        c0yc62.setMediaType(EnumC870720YDu.IMG);
        c0yc62.setLength(this.LJ);
        return C1697810uHb.LJIIJJI(c0yc6, c0yc62);
    }

    public static C1DUQ LIZIZ(C1DUQ c1duq, String str, int i, int i2, String str2, String str3, String str4, EnumC2249741D3s enumC2249741D3s, int i3) {
        String str5;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        String str6;
        EnumC2249741D3s enumC2249741D3s2 = enumC2249741D3s;
        String str7 = str4;
        String str8 = str3;
        int i4 = i2;
        int i5 = i;
        String str9 = str2;
        String str10 = str;
        if ((i3 & 1) != 0) {
            str10 = c1duq.LIZ;
        }
        if ((i3 & 2) != 0) {
            str5 = c1duq.LIZIZ;
        } else {
            str5 = null;
        }
        if ((i3 & 4) != 0) {
            i5 = c1duq.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i4 = c1duq.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            j = c1duq.LJ;
        } else {
            j = 0;
        }
        if ((i3 & 32) != 0) {
            str9 = c1duq.LJFF;
        }
        if ((i3 & 64) != 0) {
            str8 = c1duq.LJI;
        }
        if ((i3 & 128) != 0) {
            str7 = c1duq.LJII;
        }
        if ((i3 & 256) != 0) {
            enumC2249741D3s2 = c1duq.LJIIIIZZ;
        }
        if ((i3 & 512) != 0) {
            z = c1duq.LJIIIZ;
        } else {
            z = false;
        }
        if ((i3 & 1024) != 0) {
            z2 = c1duq.LJIIJ;
        } else {
            z2 = false;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z3 = c1duq.LJIIJJI;
        } else {
            z3 = false;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str6 = c1duq.LJIIL;
        } else {
            str6 = null;
        }
        c1duq.getClass();
        return new C1DUQ(str10, str5, i5, i4, j, str9, str8, str7, enumC2249741D3s2, z, z2, z3, str6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1DUQ(String str, String str2, int i, int i2, long j, String str3, boolean z, boolean z2, boolean z3, String str4, int i3) {
        EnumC2249741D3s enumC2249741D3s;
        String str5 = str4;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        String str6 = str3;
        long j2 = j;
        int i4 = i2;
        int i5 = i;
        String str7 = str2;
        String str8 = (i3 & 1) != 0 ? null : str;
        str7 = (i3 & 2) != 0 ? null : str7;
        i5 = (i3 & 4) != 0 ? 0 : i5;
        i4 = (i3 & 8) != 0 ? 0 : i4;
        j2 = (i3 & 16) != 0 ? 0L : j2;
        str6 = (i3 & 128) != 0 ? null : str6;
        if ((i3 & 256) != 0) {
            enumC2249741D3s = EnumC2249741D3s.DEFAULT;
        } else {
            enumC2249741D3s = null;
        }
        this(str8, str7, i5, i4, j2, null, null, str6, enumC2249741D3s, (i3 & 512) != 0 ? false : z6, (i3 & 1024) != 0 ? false : z5, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z4, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str5);
    }

    public C1DUQ(String str, String str2, int i, int i2, long j, String str3, String str4, String str5, EnumC2249741D3s enumC2249741D3s, boolean z, boolean z2, boolean z3, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = j;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = enumC2249741D3s;
        this.LJIIIZ = z;
        this.LJIIJ = z2;
        this.LJIIJJI = z3;
        this.LJIIL = str6;
    }
}
