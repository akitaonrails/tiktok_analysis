package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.callroom.api.model.RoomInfo;
import com.ss.android.ugc.aweme.im.callroom.api.model.RtcInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006L {
    public final String LIZ;
    public final RoomInfo LIZIZ;
    public final RtcInfo LIZJ;
    public final EnumC037700Bj LIZLLL;
    public final EnumC2249641D3i LJ;
    public final boolean LJFF;
    public final String LJI;
    public final List<Long> LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final Long LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C006L)) {
            return false;
        }
        C006L c006l = (C006L) obj;
        return Intrinsics.LJFF(this.LIZ, c006l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c006l.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c006l.LIZJ) && this.LIZLLL == c006l.LIZLLL && this.LJ == c006l.LJ && this.LJFF == c006l.LJFF && Intrinsics.LJFF(this.LJI, c006l.LJI) && Intrinsics.LJFF(this.LJII, c006l.LJII) && this.LJIIIIZZ == c006l.LJIIIIZZ && this.LJIIIZ == c006l.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c006l.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c006l.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        EnumC2249641D3i enumC2249641D3i = this.LJ;
        int iHashCode2 = (((((((((((iHashCode + (enumC2249641D3i == null ? 0 : enumC2249641D3i.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31;
        Long l = this.LJIIJ;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LJIIJJI;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CallSession(clientSessionId=" + this.LIZ + ", roomInfo=" + this.LIZIZ + ", rtcInfo=" + this.LIZJ + ", state=" + this.LIZLLL + ", serverState=" + this.LJ + ", isCaller=" + this.LJFF + ", conversationId=" + this.LJI + ", toUserIds=" + this.LJII + ", createdAt=" + this.LJIIIIZZ + ", durationSeconds=" + this.LJIIIZ + ", activeAt=" + this.LJIIJ + ", terminationReason=" + this.LJIIJJI + ')';
    }

    public final boolean LIZIZ() {
        return this.LIZLLL.isTerminal();
    }

    public static C006L LIZ(C006L c006l, EnumC037700Bj enumC037700Bj, EnumC2249641D3i enumC2249641D3i, long j, Long l, String str, int i) {
        String str2;
        RoomInfo roomInfo;
        RtcInfo rtcInfo;
        boolean z;
        String str3;
        long j2;
        String str4 = str;
        Long l2 = l;
        long j3 = j;
        EnumC2249641D3i enumC2249641D3i2 = enumC2249641D3i;
        EnumC037700Bj enumC037700Bj2 = enumC037700Bj;
        List<Long> list = null;
        if ((i & 1) != 0) {
            str2 = c006l.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            roomInfo = c006l.LIZIZ;
        } else {
            roomInfo = null;
        }
        if ((i & 4) != 0) {
            rtcInfo = c006l.LIZJ;
        } else {
            rtcInfo = null;
        }
        if ((i & 8) != 0) {
            enumC037700Bj2 = c006l.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC2249641D3i2 = c006l.LJ;
        }
        if ((i & 32) != 0) {
            z = c006l.LJFF;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            str3 = c006l.LJI;
        } else {
            str3 = null;
        }
        if ((i & 128) != 0) {
            list = c006l.LJII;
        }
        if ((i & 256) != 0) {
            j2 = c006l.LJIIIIZZ;
        } else {
            j2 = 0;
        }
        if ((i & 512) != 0) {
            j3 = c006l.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            l2 = c006l.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str4 = c006l.LJIIJJI;
        }
        return new C006L(str2, roomInfo, rtcInfo, enumC037700Bj2, enumC2249641D3i2, z, str3, list, j2, j3, l2, str4);
    }

    public C006L(String str, RoomInfo roomInfo, RtcInfo rtcInfo, EnumC037700Bj enumC037700Bj, boolean z, String str2, List list, long j, int i) {
        long j2 = j;
        EnumC037700Bj enumC037700Bj2 = enumC037700Bj;
        RtcInfo rtcInfoLIZ = rtcInfo;
        RoomInfo roomInfo2 = roomInfo;
        if ((i & 2) != 0) {
            RoomInfo.Companion.getClass();
            roomInfo2 = new RoomInfo("", "", "", "");
        }
        if ((i & 4) != 0) {
            RtcInfo.Companion.getClass();
            rtcInfoLIZ = C0217005f.LIZ();
        }
        this(str, roomInfo2, rtcInfoLIZ, (i & 8) != 0 ? EnumC037700Bj.IDLE : enumC037700Bj2, null, z, str2, list, (i & 256) != 0 ? System.currentTimeMillis() : j2, 0L, null, null);
    }

    public C006L(String str, RoomInfo roomInfo, RtcInfo rtcInfo, EnumC037700Bj enumC037700Bj, EnumC2249641D3i enumC2249641D3i, boolean z, String str2, List<Long> list, long j, long j2, Long l, String str3) {
        this.LIZ = str;
        this.LIZIZ = roomInfo;
        this.LIZJ = rtcInfo;
        this.LIZLLL = enumC037700Bj;
        this.LJ = enumC2249641D3i;
        this.LJFF = z;
        this.LJI = str2;
        this.LJII = list;
        this.LJIIIIZZ = j;
        this.LJIIIZ = j2;
        this.LJIIJ = l;
        this.LJIIJJI = str3;
    }
}
