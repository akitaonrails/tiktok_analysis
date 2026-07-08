package X;

import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20448614zs {
    public final int LIZ;
    public final MusicModel LIZIZ;
    public final List<MusicCollectionItem> LIZJ;
    public final C204596153y LIZLLL;

    public C20448614zs() {
        this(0, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20448614zs)) {
            return false;
        }
        C20448614zs c20448614zs = (C20448614zs) obj;
        return this.LIZ == c20448614zs.LIZ && Intrinsics.LJFF(this.LIZIZ, c20448614zs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20448614zs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20448614zs.LIZLLL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20448614zs(int i, MusicModel musicModel, int i2) {
        C13BV c13bv;
        i = (i2 & 1) != 0 ? -1 : i;
        musicModel = (i2 & 2) != 0 ? null : musicModel;
        if ((i2 & 4) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(i, musicModel, c13bv, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20448614zs(int i, MusicModel musicModel, List<? extends MusicCollectionItem> list, C204596153y c204596153y) {
        this.LIZ = i;
        this.LIZIZ = musicModel;
        this.LIZJ = list;
        this.LIZLLL = c204596153y;
    }
}
