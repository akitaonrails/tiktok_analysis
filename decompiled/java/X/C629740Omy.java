package X;

import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Omy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629740Omy implements InterfaceC1891350zJl {
    public final Music LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C629740Omy)) {
            return false;
        }
        C629740Omy c629740Omy = (C629740Omy) obj;
        return Intrinsics.LJFF(this.LL, c629740Omy.LL) && this.LLILLJJLI == c629740Omy.LLILLJJLI && this.LLILLL == c629740Omy.LLILLL && this.LLILZ == c629740Omy.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicItem(music=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", collected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPlayCurrent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C629740Omy) && ((C629740Omy) interfaceC1891350zJl).LL.getId() == this.LL.getId()) {
            return true;
        }
        return false;
    }

    public C629740Omy(Music music, boolean z, boolean z2, boolean z3) {
        this.LL = music;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    public static C629740Omy LIZ(C629740Omy c629740Omy, boolean z, boolean z2, int i) {
        Music music;
        boolean z3;
        if ((i & 1) != 0) {
            music = c629740Omy.LL;
        } else {
            music = null;
        }
        if ((i & 2) != 0) {
            z3 = c629740Omy.LLILLJJLI;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z = c629740Omy.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c629740Omy.LLILZ;
        }
        c629740Omy.getClass();
        return new C629740Omy(music, z3, z, z2);
    }
}
