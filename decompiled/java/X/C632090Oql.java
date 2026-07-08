package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C632090Oql implements InterfaceC1891350zJl, Serializable {
    public static final int $stable = 8;
    public final MusicModel LL;
    public final C631940OqW LLILLJJLI;

    public int hashCode() {
        return this.LL.getMusicId().hashCode();
    }

    public final C631940OqW getMusicItemModel() {
        return this.LLILLJJLI;
    }

    public final MusicModel getMusicModel() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C632090Oql) {
            C632090Oql c632090Oql = (C632090Oql) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c632090Oql.LL.getMusicId(), this.LL.getMusicId()) && c632090Oql.LL.getCollectionType() == this.LL.getCollectionType() && c632090Oql.LL.getPinnedVideoStatus() == this.LL.getPinnedVideoStatus() && Intrinsics.LJFF(c632090Oql.LLILLJJLI, this.LLILLJJLI) && Intrinsics.LJFF(c632090Oql.LL.getTT2DSPSongInfo(), this.LL.getTT2DSPSongInfo())) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C632090Oql) {
            return Intrinsics.LJFF(((C632090Oql) interfaceC1891350zJl).LL.getMusicId(), this.LL.getMusicId());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C632090Oql) {
            C632090Oql c632090Oql = (C632090Oql) obj;
            if (Intrinsics.LJFF(c632090Oql.LL.getMusicId(), this.LL.getMusicId()) && c632090Oql.LL.getCollectionType() == this.LL.getCollectionType() && c632090Oql.LL.getPinnedVideoStatus() == this.LL.getPinnedVideoStatus() && Intrinsics.LJFF(c632090Oql.LLILLJJLI, this.LLILLJJLI) && Intrinsics.LJFF(c632090Oql.LL.getTT2DSPSongInfo(), this.LL.getTT2DSPSongInfo())) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C632090Oql) {
            C632090Oql c632090Oql = (C632090Oql) interfaceC1891350zJl;
            if (c632090Oql.LL.getCollectionType() != this.LL.getCollectionType() || c632090Oql.LL.getPinnedVideoStatus() != this.LL.getPinnedVideoStatus() || !Intrinsics.LJFF(c632090Oql.LL.getTT2DSPSongInfo(), this.LL.getTT2DSPSongInfo()) || !Intrinsics.LJFF(c632090Oql.LLILLJJLI, this.LLILLJJLI)) {
                c632090Oql.LL.getCollectionType();
                this.LL.getCollectionType();
                c632090Oql.LL.getPinnedVideoStatus();
                this.LL.getPinnedVideoStatus();
                c632090Oql.LLILLJJLI.isHighlighted();
                this.LLILLJJLI.isHighlighted();
                c632090Oql.LLILLJJLI.isSelected();
                this.LLILLJJLI.isSelected();
                Intrinsics.LJFF(c632090Oql.LL.getTT2DSPSongInfo(), this.LL.getTT2DSPSongInfo());
                c632090Oql.LLILLJJLI.isSpotlighted();
                this.LLILLJJLI.isSpotlighted();
                return new C632100Oqm();
            }
            return null;
        }
        return null;
    }

    public C632090Oql(MusicModel musicModel, C631940OqW c631940OqW) {
        this.LL = musicModel;
        this.LLILLJJLI = c631940OqW;
    }
}
