package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869290Y8h {
    public static final Set<String> LJIIL = C13LQ.LJLIIL(new String[]{"preload", "preload_all", "preload_light"});
    public final String LIZ;
    public final int LIZIZ;
    public final Set<String> LIZJ;
    public final Set<String> LIZLLL;
    public final boolean LJ;
    public final C0Y97 LJFF;
    public final Integer LJI;
    public final C0Y95 LJII;
    public final C873950YQf LJIIIIZZ;
    public final Integer LJIIIZ;
    public final AbstractC1176904j1 LJIIJ;
    public final boolean LJIIJJI;

    public C869290Y8h() {
        this(null, 0, null, null, null, false, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869290Y8h)) {
            return false;
        }
        C869290Y8h c869290Y8h = (C869290Y8h) obj;
        return Intrinsics.LJFF(this.LIZ, c869290Y8h.LIZ) && this.LIZIZ == c869290Y8h.LIZIZ && Intrinsics.LJFF(this.LIZJ, c869290Y8h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c869290Y8h.LIZLLL) && this.LJ == c869290Y8h.LJ && this.LJFF == c869290Y8h.LJFF && Intrinsics.LJFF(this.LJI, c869290Y8h.LJI) && this.LJII == c869290Y8h.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c869290Y8h.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c869290Y8h.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c869290Y8h.LJIIJ) && this.LJIIJJI == c869290Y8h.LJIIJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31;
        Integer num = this.LJI;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJII.hashCode()) * 31;
        C873950YQf c873950YQf = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (c873950YQf == null ? 0 : c873950YQf.hashCode())) * 31;
        Integer num2 = this.LJIIIZ;
        return ((((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI);
    }

    public final String toString() {
        return "LegacyConversationQuery(seqId=" + this.LIZ + ", category=" + this.LIZIZ + ", tagsAllNeedQualified=" + this.LIZJ + ", tagsNeedQualifiedAny=" + this.LIZLLL + ", includeStranger=" + this.LJ + ", readFlag=" + this.LJFF + ", conversationType=" + this.LJI + ", muteFlag=" + this.LJII + ", kvTableQueryInfo=" + this.LJIIIIZZ + ", inboxType=" + this.LJIIIZ + ", statusFilter=" + this.LJIIJ + ", isInitPreload=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C869290Y8h(String str, int i, Set set, Integer num, C1176804j0 c1176804j0, boolean z, int i2) {
        C08CX c08cx;
        C0Y97 c0y97;
        C0Y95 c0y95;
        boolean z2 = z;
        Set set2 = set;
        AbstractC1176904j1 abstractC1176904j1 = c1176804j0;
        int i3 = i;
        String str2 = (i2 & 1) != 0 ? "" : str;
        i3 = (i2 & 2) != 0 ? 0 : i3;
        if ((i2 & 4) != 0) {
            c08cx = C08CX.INSTANCE;
        } else {
            c08cx = null;
        }
        set2 = (i2 & 8) != 0 ? C08CX.INSTANCE : set2;
        if ((i2 & 32) != 0) {
            c0y97 = C0Y97.ALL;
        } else {
            c0y97 = null;
        }
        if ((i2 & 128) != 0) {
            c0y95 = C0Y95.ALL;
        } else {
            c0y95 = null;
        }
        this(str2, i3, c08cx, set2, false, c0y97, null, c0y95, null, (i2 & 512) == 0 ? num : null, (i2 & 1024) != 0 ? C1177004j2.LIZIZ : abstractC1176904j1, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2);
    }

    public static C869290Y8h LIZ(C869290Y8h c869290Y8h, int i, Set set, Set set2, boolean z, C0Y97 c0y97, Integer num, C873950YQf c873950YQf, int i2) {
        String str;
        C0Y95 c0y95;
        Integer num2;
        boolean z2;
        C873950YQf c873950YQf2 = c873950YQf;
        Integer num3 = num;
        C0Y97 c0y972 = c0y97;
        boolean z3 = z;
        Set set3 = set2;
        Set set4 = set;
        int i3 = i;
        AbstractC1176904j1 abstractC1176904j1 = null;
        if ((i2 & 1) != 0) {
            str = c869290Y8h.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c869290Y8h.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            set4 = c869290Y8h.LIZJ;
        }
        if ((i2 & 8) != 0) {
            set3 = c869290Y8h.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z3 = c869290Y8h.LJ;
        }
        if ((i2 & 32) != 0) {
            c0y972 = c869290Y8h.LJFF;
        }
        if ((i2 & 64) != 0) {
            num3 = c869290Y8h.LJI;
        }
        if ((i2 & 128) != 0) {
            c0y95 = c869290Y8h.LJII;
        } else {
            c0y95 = null;
        }
        if ((i2 & 256) != 0) {
            c873950YQf2 = c869290Y8h.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            num2 = c869290Y8h.LJIIIZ;
        } else {
            num2 = null;
        }
        if ((i2 & 1024) != 0) {
            abstractC1176904j1 = c869290Y8h.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z2 = c869290Y8h.LJIIJJI;
        } else {
            z2 = false;
        }
        return new C869290Y8h(str, i3, set4, set3, z3, c0y972, num3, c0y95, c873950YQf2, num2, abstractC1176904j1, z2);
    }

    public C869290Y8h(String str, int i, Set<String> set, Set<String> set2, boolean z, C0Y97 c0y97, Integer num, C0Y95 c0y95, C873950YQf c873950YQf, Integer num2, AbstractC1176904j1 abstractC1176904j1, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = set;
        this.LIZLLL = set2;
        this.LJ = z;
        this.LJFF = c0y97;
        this.LJI = num;
        this.LJII = c0y95;
        this.LJIIIIZZ = c873950YQf;
        this.LJIIIZ = num2;
        this.LJIIJ = abstractC1176904j1;
        this.LJIIJJI = z2;
    }
}
