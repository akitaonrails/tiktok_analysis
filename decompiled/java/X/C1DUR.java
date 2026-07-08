package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.vesdk.VEUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DUR extends AbstractC2249061D1c<C2256911DVh, C1DUR> {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final EnumC2249741D3s LJIIIZ;
    public final VEUtils.VEVideoFileInfo LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final Long LJIILLIIL;
    public final boolean LJIIZILJ;
    public final C1777570wMF LJIJ;
    public final String LJIJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1DUR() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, 0, 0 == true ? 1 : 0, 0L, objArr3, objArr4, objArr5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr6, 0 == true ? 1 : 0, objArr7, objArr8, 1048575);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1DUR)) {
            return false;
        }
        C1DUR c1dur = (C1DUR) obj;
        return Intrinsics.LJFF(this.LIZ, c1dur.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1dur.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1dur.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1dur.LIZLLL) && this.LJ == c1dur.LJ && this.LJFF == c1dur.LJFF && this.LJI == c1dur.LJI && Intrinsics.LJFF(this.LJII, c1dur.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1dur.LJIIIIZZ) && this.LJIIIZ == c1dur.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1dur.LJIIJ) && this.LJIIJJI == c1dur.LJIIJJI && this.LJIIL == c1dur.LJIIL && this.LJIILIIL == c1dur.LJIILIIL && this.LJIILJJIL == c1dur.LJIILJJIL && this.LJIILL == c1dur.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c1dur.LJIILLIIL) && this.LJIIZILJ == c1dur.LJIIZILJ && Intrinsics.LJFF(this.LJIJ, c1dur.LJIJ) && Intrinsics.LJFF(this.LJIJI, c1dur.LJIJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI)) * 31;
        String str5 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIIIZZ;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31;
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LJIIJ;
        int iHashCode7 = (((((((((((iHashCode6 + (vEVideoFileInfo == null ? 0 : vEVideoFileInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31;
        Long l = this.LJIILLIIL;
        int iHashCode8 = (((iHashCode7 + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31;
        C1777570wMF c1777570wMF = this.LJIJ;
        return ((iHashCode8 + (c1777570wMF != null ? c1777570wMF.hashCode() : 0)) * 31) + this.LJIJI.hashCode();
    }

    public final String toString() {
        return "VideoCardTemplateAndAttachmentWrapper(localPath=" + this.LIZ + ", localFileMD5=" + this.LIZIZ + ", localThumbnailPath=" + this.LIZJ + ", vid=" + this.LIZLLL + ", videoWidth=" + this.LJ + ", videoHeight=" + this.LJFF + ", fileSize=" + this.LJI + ", effectId=" + this.LJII + ", remixId=" + this.LJIIIIZZ + ", uploadState=" + this.LJIIIZ + ", videoFileInfo=" + this.LJIIJ + ", isFromMainPost=" + this.LJIIJJI + ", skipExtractVideoCover=" + this.LJIIL + ", isFromDMTextIcon=" + this.LJIILIIL + ", hasTextSticker=" + this.LJIILJJIL + ", isFromRecord=" + this.LJIILL + ", duration=" + this.LJIILLIIL + ", isHighLightVideo=" + this.LJIIZILJ + ", effectGameComponent=" + this.LJIJ + ", targetConversationId=" + this.LJIJI + ')';
    }

    public final List<C0YC6> LIZ(String str) {
        Object obj;
        C0YC6 c0yc6 = new C0YC6(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
        c0yc6.setIndex(0);
        c0yc6.setLocalPath(this.LIZ);
        c0yc6.setOriginalWidth(this.LJ);
        c0yc6.setOriginalHeight(this.LJFF);
        if (str != null) {
            c0yc6.setMsgUuid(str);
        }
        c0yc6.setUploadState(this.LJIIIZ.getState());
        C13DA c13da = new C13DA();
        String str2 = "1";
        if (this.LJIIJJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("key_is_from_main_post", obj);
        if (!this.LJIIL) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("key_skip_extract_video_cover", str2);
        String str3 = this.LJII;
        if (str3 != null) {
            c13da.put("effect_id", str3);
        }
        String str4 = this.LJIIIIZZ;
        if (str4 != null) {
            c13da.put("remix_item_ids", str4);
        }
        c0yc6.updateExt(c13da.build());
        c0yc6.setFromTikTokRecord(this.LJIILL);
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LJIIJ;
        if (vEVideoFileInfo != null && Integer.valueOf(vEVideoFileInfo.maxDuration) != null) {
            if (this.LJIIJ != null) {
                c0yc6.setOriginalDuration(r0.maxDuration);
            }
        } else {
            Long l = c0yc6.duration;
            if (l != null) {
                c0yc6.setOriginalDuration(l.longValue());
            }
        }
        c0yc6.setLength(this.LJI);
        C0YC6 c0yc62 = new C0YC6(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
        c0yc62.setIndex(1);
        c0yc62.setOriginalWidth(this.LJ);
        c0yc62.setOriginalHeight(this.LJFF);
        c0yc62.setLocalPath(this.LIZJ);
        c0yc62.setVid(this.LIZLLL);
        c0yc62.setHash(this.LIZIZ);
        if (str != null) {
            c0yc62.setMsgUuid(str);
        }
        C0YC6 c0yc63 = new C0YC6(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
        c0yc63.setIndex(2);
        c0yc63.setVid(this.LIZLLL);
        c0yc63.setOriginalWidth(this.LJ);
        c0yc63.setOriginalHeight(this.LJFF);
        c0yc63.setHash(this.LIZIZ);
        if (str != null) {
            c0yc63.setMsgUuid(str);
        }
        c0yc63.setMediaType(EnumC870720YDu.VIDEO);
        c0yc63.setLength(this.LJI);
        return C1697810uHb.LJIIJJI(c0yc6, c0yc62, c0yc63);
    }

    public static C1DUR LIZIZ(C1DUR c1dur, String str, String str2, String str3, int i, int i2, String str4, EnumC2249741D3s enumC2249741D3s, Long l, String str5, int i3) {
        String str6;
        long j;
        String str7;
        VEUtils.VEVideoFileInfo vEVideoFileInfo;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C1777570wMF c1777570wMF;
        Long l2 = l;
        EnumC2249741D3s enumC2249741D3s2 = enumC2249741D3s;
        String str8 = str4;
        int i4 = i;
        String str9 = str3;
        String str10 = str5;
        String str11 = str2;
        int i5 = i2;
        String str12 = str;
        if ((i3 & 1) != 0) {
            str12 = c1dur.LIZ;
        }
        if ((i3 & 2) != 0) {
            str6 = c1dur.LIZIZ;
        } else {
            str6 = null;
        }
        if ((i3 & 4) != 0) {
            str11 = c1dur.LIZJ;
        }
        if ((i3 & 8) != 0) {
            str9 = c1dur.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c1dur.LJ;
        }
        if ((i3 & 32) != 0) {
            i5 = c1dur.LJFF;
        }
        if ((i3 & 64) != 0) {
            j = c1dur.LJI;
        } else {
            j = 0;
        }
        if ((i3 & 128) != 0) {
            str8 = c1dur.LJII;
        }
        if ((i3 & 256) != 0) {
            str7 = c1dur.LJIIIIZZ;
        } else {
            str7 = null;
        }
        if ((i3 & 512) != 0) {
            enumC2249741D3s2 = c1dur.LJIIIZ;
        }
        if ((i3 & 1024) != 0) {
            vEVideoFileInfo = c1dur.LJIIJ;
        } else {
            vEVideoFileInfo = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z = c1dur.LJIIJJI;
        } else {
            z = false;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = c1dur.LJIIL;
        } else {
            z2 = false;
        }
        if ((i3 & 8192) != 0) {
            z3 = c1dur.LJIILIIL;
        } else {
            z3 = false;
        }
        if ((i3 & 16384) != 0) {
            z4 = c1dur.LJIILJJIL;
        } else {
            z4 = false;
        }
        if ((32768 & i3) != 0) {
            z5 = c1dur.LJIILL;
        } else {
            z5 = false;
        }
        if ((65536 & i3) != 0) {
            l2 = c1dur.LJIILLIIL;
        }
        if ((131072 & i3) != 0) {
            z6 = c1dur.LJIIZILJ;
        } else {
            z6 = false;
        }
        if ((262144 & i3) != 0) {
            c1777570wMF = c1dur.LJIJ;
        } else {
            c1777570wMF = null;
        }
        if ((i3 & 524288) != 0) {
            str10 = c1dur.LJIJI;
        }
        c1dur.getClass();
        String str13 = str8;
        EnumC2249741D3s enumC2249741D3s3 = enumC2249741D3s2;
        return new C1DUR(str12, str6, str11, str9, i4, i5, j, str13, str7, enumC2249741D3s3, vEVideoFileInfo, z, z2, z3, z4, z5, l2, z6, c1777570wMF, str10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1DUR(String str, String str2, String str3, int i, int i2, long j, String str4, String str5, VEUtils.VEVideoFileInfo vEVideoFileInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l, boolean z6, C1777570wMF c1777570wMF, String str6, int i3) {
        EnumC2249741D3s enumC2249741D3s;
        String str7 = str6;
        C1777570wMF c1777570wMF2 = c1777570wMF;
        boolean z7 = z6;
        Long l2 = l;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z;
        VEUtils.VEVideoFileInfo vEVideoFileInfo2 = vEVideoFileInfo;
        String str8 = str5;
        String str9 = str4;
        long j2 = j;
        int i4 = i2;
        int i5 = i;
        String str10 = str3;
        String str11 = str2;
        boolean z12 = z2;
        String str12 = (i3 & 1) != 0 ? null : str;
        str11 = (i3 & 2) != 0 ? null : str11;
        str10 = (i3 & 4) != 0 ? null : str10;
        i5 = (i3 & 16) != 0 ? 0 : i5;
        i4 = (i3 & 32) != 0 ? 0 : i4;
        j2 = (i3 & 64) != 0 ? 0L : j2;
        str9 = (i3 & 128) != 0 ? null : str9;
        str8 = (i3 & 256) != 0 ? null : str8;
        if ((i3 & 512) != 0) {
            enumC2249741D3s = EnumC2249741D3s.DEFAULT;
        } else {
            enumC2249741D3s = null;
        }
        this(str12, str11, str10, null, i5, i4, j2, str9, str8, enumC2249741D3s, (i3 & 1024) != 0 ? null : vEVideoFileInfo2, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z11, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z12, (i3 & 8192) != 0 ? false : z10, (i3 & 16384) != 0 ? false : z9, (32768 & i3) != 0 ? false : z8, (65536 & i3) != 0 ? null : l2, (131072 & i3) != 0 ? false : z7, (262144 & i3) != 0 ? null : c1777570wMF2, (i3 & 524288) != 0 ? "" : str7);
    }

    public C1DUR(String str, String str2, String str3, String str4, int i, int i2, long j, String str5, String str6, EnumC2249741D3s enumC2249741D3s, VEUtils.VEVideoFileInfo vEVideoFileInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l, boolean z6, C1777570wMF c1777570wMF, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = j;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = enumC2249741D3s;
        this.LJIIJ = vEVideoFileInfo;
        this.LJIIJJI = z;
        this.LJIIL = z2;
        this.LJIILIIL = z3;
        this.LJIILJJIL = z4;
        this.LJIILL = z5;
        this.LJIILLIIL = l;
        this.LJIIZILJ = z6;
        this.LJIJ = c1777570wMF;
        this.LJIJI = str7;
    }
}
