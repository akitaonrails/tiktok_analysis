package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681230Qnp implements InterfaceC0148002o {
    public final MusicModel LL;
    public final EnumC681240Qnq LLILLJJLI;

    public C681230Qnp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C681230Qnp)) {
            return false;
        }
        C681230Qnp c681230Qnp = (C681230Qnp) obj;
        return Intrinsics.LJFF(this.LL, c681230Qnp.LL) && this.LLILLJJLI == c681230Qnp.LLILLJJLI;
    }

    public final int hashCode() {
        MusicModel musicModel = this.LL;
        return ((musicModel == null ? 0 : musicModel.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMusicState(playingModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playingStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C681230Qnp(int i) {
        this(null, EnumC681240Qnq.Default);
    }

    public C681230Qnp(MusicModel musicModel, EnumC681240Qnq enumC681240Qnq) {
        this.LL = musicModel;
        this.LLILLJJLI = enumC681240Qnq;
    }
}
