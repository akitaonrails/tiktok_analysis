package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LSZ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final Source LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final long LJIJJ;
    public final String LJIJJLI;
    public final long LJIL;
    public final TaskLogExtra LJJ;
    public final String LJJI;
    public final QuotaResult LJJIFFI;
    public final int LJJII;
    public final String LJJIII;

    public C0LSZ() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (Source) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, 0L, (TaskLogExtra) null, (QuotaResult) null, 0, (String) null, 268435455);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LSZ)) {
            return false;
        }
        C0LSZ c0lsz = (C0LSZ) obj;
        return Intrinsics.LJFF(this.LIZ, c0lsz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lsz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lsz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lsz.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lsz.LJ) && Intrinsics.LJFF(this.LJFF, c0lsz.LJFF) && Intrinsics.LJFF(this.LJI, c0lsz.LJI) && this.LJII == c0lsz.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c0lsz.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0lsz.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0lsz.LJIIJ) && this.LJIIJJI == c0lsz.LJIIJJI && this.LJIIL == c0lsz.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c0lsz.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c0lsz.LJIILJJIL) && this.LJIILL == c0lsz.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c0lsz.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c0lsz.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c0lsz.LJIJ) && Intrinsics.LJFF(this.LJIJI, c0lsz.LJIJI) && this.LJIJJ == c0lsz.LJIJJ && Intrinsics.LJFF(this.LJIJJLI, c0lsz.LJIJJLI) && this.LJIL == c0lsz.LJIL && Intrinsics.LJFF(this.LJJ, c0lsz.LJJ) && Intrinsics.LJFF(this.LJJI, c0lsz.LJJI) && Intrinsics.LJFF(this.LJJIFFI, c0lsz.LJJIFFI) && this.LJJII == c0lsz.LJJII && Intrinsics.LJFF(this.LJJIII, c0lsz.LJJIII);
    }

    public final String toString() {
        return "CreationAsyncTaskInfo(id=" + this.LIZ + ", name=" + this.LIZIZ + ", icon=" + this.LIZJ + ", type=" + this.LIZLLL + ", status=" + this.LJ + ", asyncStatus=" + this.LJFF + ", step=" + this.LJI + ", progress=" + this.LJII + ", childTaskId=" + this.LJIIIIZZ + ", parentTaskId=" + this.LJIIIZ + ", creationId=" + this.LJIIJ + ", creationVersion=" + this.LJIIJJI + ", source=" + this.LJIIL + ", param=" + this.LJIILIIL + ", prompt=" + this.LJIILJJIL + ", errorCode=" + this.LJIILL + ", errorMsg=" + this.LJIILLIIL + ", errorSource=" + this.LJIIZILJ + ", failReasonMsg=" + this.LJIJ + ", resourceId=" + this.LJIJI + ", createdAt=" + this.LJIJJ + ", serverTaskId=" + this.LJIJJLI + ", remainTime=" + this.LJIL + ", logExtra=" + this.LJJ + ", aiCreationId=" + this.LJJI + ", quotaResult=" + this.LJJIFFI + ", remainTimeStage=" + this.LJJII + ", inputCache=" + this.LJJIII + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0LSZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, Source source, String str11, String str12, int i3, String str13, String str14, String str15, String str16, long j, String str17, long j2, TaskLogExtra taskLogExtra, QuotaResult quotaResult, int i4, String str18, int i5) {
        String str19;
        int i6 = i4;
        String str20 = str16;
        long j3 = j2;
        int i7 = i3;
        String str21 = str17;
        String str22 = str12;
        String str23 = str11;
        long time = j;
        QuotaResult quotaResult2 = quotaResult;
        Source source2 = source;
        String str24 = str10;
        String str25 = str15;
        String str26 = str9;
        String str27 = str6;
        String str28 = str5;
        String str29 = str8;
        String str30 = str4;
        String str31 = str3;
        int i8 = i;
        String str32 = str14;
        String str33 = str13;
        String str34 = str2;
        int i9 = i2;
        TaskLogExtra taskLogExtra2 = taskLogExtra;
        String string = (i5 & 1) != 0 ? UUID.randomUUID().toString() : str;
        str34 = (i5 & 2) != 0 ? "" : str34;
        str31 = (i5 & 4) != 0 ? "" : str31;
        str30 = (i5 & 8) != 0 ? "" : str30;
        int i10 = i5 & 16;
        String str35 = LivePreviewCTASmartDisplayManager.DEFAULT;
        str28 = i10 != 0 ? LivePreviewCTASmartDisplayManager.DEFAULT : str28;
        str27 = (i5 & 32) != 0 ? "SYNC" : str27;
        str35 = (i5 & 64) == 0 ? str7 : str35;
        i8 = (i5 & 128) != 0 ? 0 : i8;
        str29 = (i5 & 256) != 0 ? "" : str29;
        str26 = (i5 & 512) != 0 ? "" : str26;
        str24 = (i5 & 1024) != 0 ? "" : str24;
        i9 = (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i9;
        source2 = (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : source2;
        str23 = (i5 & 8192) != 0 ? "" : str23;
        str22 = (i5 & 16384) != 0 ? "" : str22;
        i7 = (32768 & i5) != 0 ? 0 : i7;
        str33 = (65536 & i5) != 0 ? "" : str33;
        str32 = (131072 & i5) != 0 ? "" : str32;
        str25 = (262144 & i5) != 0 ? "" : str25;
        str20 = (524288 & i5) != 0 ? "" : str20;
        time = (1048576 & i5) != 0 ? new Date().getTime() : time;
        str21 = (2097152 & i5) != 0 ? "" : str21;
        j3 = (4194304 & i5) != 0 ? -1L : j3;
        taskLogExtra2 = (8388608 & i5) != 0 ? new TaskLogExtra(0L, "", null, null, false, false, "", 0, "", "", "", "", 0, "", "", "", 0L, null, false, C2097608Jq.LJ()) : taskLogExtra2;
        if ((16777216 & i5) != 0) {
            str19 = "";
        } else {
            str19 = null;
        }
        this(string, str34, str31, str30, str28, str27, str35, i8, str29, str26, str24, i9, source2, str23, str22, i7, str33, str32, str25, str20, time, str21, j3, taskLogExtra2, str19, (33554432 & i5) != 0 ? new QuotaResult(null, null, null, "", null) : quotaResult2, (67108864 & i5) != 0 ? 0 : i6, (i5 & 134217728) == 0 ? str18 : "");
    }

    public C0LSZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, Source source, String str11, String str12, int i3, String str13, String str14, String str15, String str16, long j, String str17, long j2, TaskLogExtra taskLogExtra, String str18, QuotaResult quotaResult, int i4, String str19) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = i;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = i2;
        this.LJIIL = source;
        this.LJIILIIL = str11;
        this.LJIILJJIL = str12;
        this.LJIILL = i3;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = str14;
        this.LJIJ = str15;
        this.LJIJI = str16;
        this.LJIJJ = j;
        this.LJIJJLI = str17;
        this.LJIL = j2;
        this.LJJ = taskLogExtra;
        this.LJJI = str18;
        this.LJJIFFI = quotaResult;
        this.LJJII = i4;
        this.LJJIII = str19;
    }

    public static C0LSZ LIZ(C0LSZ c0lsz, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, Source source, String str11, String str12, int i3, String str13, String str14, String str15, long j, String str16, long j2, TaskLogExtra taskLogExtra, String str17, QuotaResult quotaResult, int i4, String str18, int i5) {
        String str19;
        String str20 = str18;
        int i6 = i4;
        QuotaResult quotaResult2 = quotaResult;
        long j3 = j;
        String str21 = str16;
        String str22 = str13;
        int i7 = i3;
        String str23 = str12;
        String str24 = str15;
        String str25 = str17;
        String str26 = str10;
        String str27 = str11;
        int i8 = i2;
        String str28 = str8;
        Source source2 = source;
        String str29 = str9;
        String str30 = str14;
        int i9 = i;
        String str31 = str7;
        String str32 = str6;
        String str33 = str5;
        String str34 = str2;
        long j4 = j2;
        String str35 = str4;
        String str36 = str3;
        TaskLogExtra taskLogExtra2 = taskLogExtra;
        String str37 = str;
        if ((i5 & 1) != 0) {
            str37 = c0lsz.LIZ;
        }
        if ((i5 & 2) != 0) {
            str34 = c0lsz.LIZIZ;
        }
        if ((i5 & 4) != 0) {
            str36 = c0lsz.LIZJ;
        }
        if ((i5 & 8) != 0) {
            str35 = c0lsz.LIZLLL;
        }
        if ((i5 & 16) != 0) {
            str33 = c0lsz.LJ;
        }
        if ((i5 & 32) != 0) {
            str32 = c0lsz.LJFF;
        }
        if ((i5 & 64) != 0) {
            str31 = c0lsz.LJI;
        }
        if ((i5 & 128) != 0) {
            i9 = c0lsz.LJII;
        }
        if ((i5 & 256) != 0) {
            str28 = c0lsz.LJIIIIZZ;
        }
        if ((i5 & 512) != 0) {
            str29 = c0lsz.LJIIIZ;
        }
        if ((i5 & 1024) != 0) {
            str26 = c0lsz.LJIIJ;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i8 = c0lsz.LJIIJJI;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            source2 = c0lsz.LJIIL;
        }
        if ((i5 & 8192) != 0) {
            str27 = c0lsz.LJIILIIL;
        }
        if ((i5 & 16384) != 0) {
            str23 = c0lsz.LJIILJJIL;
        }
        if ((32768 & i5) != 0) {
            i7 = c0lsz.LJIILL;
        }
        if ((65536 & i5) != 0) {
            str22 = c0lsz.LJIILLIIL;
        }
        if ((131072 & i5) != 0) {
            str19 = c0lsz.LJIIZILJ;
        } else {
            str19 = null;
        }
        if ((262144 & i5) != 0) {
            str30 = c0lsz.LJIJ;
        }
        if ((524288 & i5) != 0) {
            str24 = c0lsz.LJIJI;
        }
        if ((1048576 & i5) != 0) {
            j3 = c0lsz.LJIJJ;
        }
        if ((2097152 & i5) != 0) {
            str21 = c0lsz.LJIJJLI;
        }
        if ((4194304 & i5) != 0) {
            j4 = c0lsz.LJIL;
        }
        if ((8388608 & i5) != 0) {
            taskLogExtra2 = c0lsz.LJJ;
        }
        if ((16777216 & i5) != 0) {
            str25 = c0lsz.LJJI;
        }
        if ((33554432 & i5) != 0) {
            quotaResult2 = c0lsz.LJJIFFI;
        }
        if ((67108864 & i5) != 0) {
            i6 = c0lsz.LJJII;
        }
        if ((i5 & 134217728) != 0) {
            str20 = c0lsz.LJJIII;
        }
        c0lsz.getClass();
        int i10 = i6;
        String str38 = str20;
        return new C0LSZ(str37, str34, str36, str35, str33, str32, str31, i9, str28, str29, str26, i8, source2, str27, str23, i7, str22, str19, str30, str24, j3, str21, j4, taskLogExtra2, str25, quotaResult2, i10, str38);
    }
}
