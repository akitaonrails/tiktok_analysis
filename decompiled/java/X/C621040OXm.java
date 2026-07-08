package X;

import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621040OXm implements InterfaceC1891350zJl {
    public final Music LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C621040OXm) && Intrinsics.LJFF(this.LL, ((C621040OXm) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinShareMusicSongItem(music=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C621040OXm(Music music) {
        this.LL = music;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C621040OXm) {
            return Intrinsics.LJFF(((C621040OXm) interfaceC1891350zJl).LL.getMid(), this.LL.getMid());
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C621040OXm) {
            return Intrinsics.LJFF(((C621040OXm) interfaceC1891350zJl).LL.getMid(), this.LL.getMid());
        }
        return false;
    }
}
