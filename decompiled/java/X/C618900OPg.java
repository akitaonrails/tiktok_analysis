package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.PresaveAlbumInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618900OPg implements InterfaceC1891350zJl {
    public final PresaveAlbumInfo LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C618900OPg) && Intrinsics.LJFF(this.LL, ((C618900OPg) obj).LL);
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
        sbLIZ.append("BulletinShareMusicPresaveItem(presaveAlbum=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C618900OPg(PresaveAlbumInfo presaveAlbumInfo) {
        this.LL = presaveAlbumInfo;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C618900OPg) {
            return Intrinsics.LJFF(((C618900OPg) interfaceC1891350zJl).LL.albumId, this.LL.albumId);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C618900OPg) {
            return Intrinsics.LJFF(((C618900OPg) interfaceC1891350zJl).LL.albumId, this.LL.albumId);
        }
        return false;
    }
}
