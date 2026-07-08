package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7U, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7U {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final List<C0K7Y> LJIIJ;
    public final C0K7W LJIIJJI;
    public final List<String> LJIIL;

    public C0K7U() {
        this(null, null, null, null, null, null, null, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K7U)) {
            return false;
        }
        C0K7U c0k7u = (C0K7U) obj;
        return Intrinsics.LJFF(this.LIZ, c0k7u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k7u.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k7u.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0k7u.LIZLLL) && Intrinsics.LJFF(this.LJ, c0k7u.LJ) && Intrinsics.LJFF(this.LJFF, c0k7u.LJFF) && Intrinsics.LJFF(this.LJI, c0k7u.LJI) && this.LJII == c0k7u.LJII && this.LJIIIIZZ == c0k7u.LJIIIIZZ && this.LJIIIZ == c0k7u.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c0k7u.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0k7u.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0k7u.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31;
        C0K7W c0k7w = this.LJIIJJI;
        return ((iHashCode + (c0k7w == null ? 0 : c0k7w.hashCode())) * 31) + this.LJIIL.hashCode();
    }

    public final String toString() {
        return "SubSpaceEditPayload(draftId=" + this.LIZ + ", title=" + this.LIZIZ + ", text=" + this.LIZJ + ", postId=" + this.LIZLLL + ", commentId=" + this.LJ + ", replyToCommentId=" + this.LJFF + ", enterFrom=" + this.LJI + ", visibility=" + this.LJII + ", isPinned=" + this.LJIIIIZZ + ", isCommentDisabled=" + this.LJIIIZ + ", mediaItems=" + this.LJIIJ + ", pollSpec=" + this.LJIIJJI + ", topics=" + this.LJIIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0K7U(String str, String str2, String str3, String str4, String str5, String str6, C0K7W c0k7w, List list, int i) {
        String str7;
        C13BV c13bv;
        List list2 = list;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        str11 = (i & 4) != 0 ? "" : str11;
        str10 = (i & 8) != 0 ? "" : str10;
        str9 = (i & 16) != 0 ? "" : str9;
        str8 = (i & 32) != 0 ? "" : str8;
        String str13 = (i & 64) == 0 ? str6 : "";
        if ((i & 1024) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(str12, str7, str11, str10, str9, str8, str13, 0, false, false, c13bv, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? c0k7w : null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list2);
    }

    public C0K7U(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, List<C0K7Y> list, C0K7W c0k7w, List<String> list2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = i;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = list;
        this.LJIIJJI = c0k7w;
        this.LJIIL = list2;
    }
}
