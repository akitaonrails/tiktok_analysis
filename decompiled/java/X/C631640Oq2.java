package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631640Oq2 implements InterfaceC447510Hgj {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final User LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C291001Au<Boolean> LJII;
    public final PinnedMusicList LJIIIIZZ;
    public final List<Long> LJIIIZ;
    public final String LJIIJ;
    public final Boolean LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C631640Oq2() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631640Oq2)) {
            return false;
        }
        C631640Oq2 c631640Oq2 = (C631640Oq2) obj;
        return Intrinsics.LJFF(this.LIZ, c631640Oq2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c631640Oq2.LIZIZ) && this.LIZJ == c631640Oq2.LIZJ && Intrinsics.LJFF(this.LIZLLL, c631640Oq2.LIZLLL) && Intrinsics.LJFF(this.LJ, c631640Oq2.LJ) && this.LJFF == c631640Oq2.LJFF && this.LJI == c631640Oq2.LJI && Intrinsics.LJFF(this.LJII, c631640Oq2.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c631640Oq2.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c631640Oq2.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c631640Oq2.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c631640Oq2.LJIIJJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str3 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        User user = this.LJ;
        int iHashCode4 = (((((iHashCode3 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        C291001Au<Boolean> c291001Au = this.LJII;
        int iHashCode5 = (iHashCode4 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        PinnedMusicList pinnedMusicList = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (pinnedMusicList == null ? 0 : pinnedMusicList.hashCode())) * 31;
        List<Long> list = this.LJIIIZ;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.LJIIJ;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.LJIIJJI;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "OriginMusicCommonData(userId=" + this.LIZ + ", secUserId=" + this.LIZIZ + ", isMe=" + this.LIZJ + ", previousPage=" + this.LIZLLL + ", user=" + this.LJ + ", canPin=" + this.LJFF + ", fromSearch=" + this.LJI + ", onVisibleChanged=" + this.LJII + ", pinnedMusicList=" + this.LJIIIIZZ + ", newReleaseIds=" + this.LJIIIZ + ", originalHighlightedMusicId=" + this.LJIIJ + ", showArtistPickVideos=" + this.LJIIJJI + ')';
    }

    public static C631640Oq2 LIZ(C631640Oq2 c631640Oq2, String str, String str2, User user, C291001Au c291001Au, int i) {
        boolean z;
        String str3;
        boolean z2;
        PinnedMusicList pinnedMusicList;
        List<Long> list;
        String str4;
        C291001Au c291001Au2 = c291001Au;
        User user2 = user;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = c631640Oq2.LIZ;
        }
        if ((i & 2) != 0) {
            str5 = c631640Oq2.LIZIZ;
        }
        boolean z3 = false;
        if ((i & 4) != 0) {
            z = c631640Oq2.LIZJ;
        } else {
            z = false;
        }
        Boolean bool = null;
        if ((i & 8) != 0) {
            str3 = c631640Oq2.LIZLLL;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            user2 = c631640Oq2.LJ;
        }
        if ((i & 32) != 0) {
            z2 = c631640Oq2.LJFF;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = c631640Oq2.LJI;
        }
        if ((i & 128) != 0) {
            c291001Au2 = c631640Oq2.LJII;
        }
        if ((i & 256) != 0) {
            pinnedMusicList = c631640Oq2.LJIIIIZZ;
        } else {
            pinnedMusicList = null;
        }
        if ((i & 512) != 0) {
            list = c631640Oq2.LJIIIZ;
        } else {
            list = null;
        }
        if ((i & 1024) != 0) {
            str4 = c631640Oq2.LJIIJ;
        } else {
            str4 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool = c631640Oq2.LJIIJJI;
        }
        c631640Oq2.getClass();
        return new C631640Oq2(str6, str5, z, str3, user2, z2, z3, c291001Au2, pinnedMusicList, list, str4, bool);
    }

    public /* synthetic */ C631640Oq2(String str, String str2, boolean z, String str3, User user, boolean z2, List list, String str4, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : user, (i & 32) != 0 ? false : z2, false, null, null, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : str4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool);
    }

    public C631640Oq2(String str, String str2, boolean z, String str3, User user, boolean z2, boolean z3, C291001Au<Boolean> c291001Au, PinnedMusicList pinnedMusicList, List<Long> list, String str4, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = str3;
        this.LJ = user;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = c291001Au;
        this.LJIIIIZZ = pinnedMusicList;
        this.LJIIIZ = list;
        this.LJIIJ = str4;
        this.LJIIJJI = bool;
    }
}
