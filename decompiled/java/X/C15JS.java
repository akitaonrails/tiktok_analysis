package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15JS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JS {
    public final MusicModel LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15JS)) {
            return false;
        }
        C15JS c15js = (C15JS) obj;
        return Intrinsics.LJFF(this.LIZ, c15js.LIZ) && this.LIZIZ == c15js.LIZIZ && this.LIZJ == c15js.LIZJ;
    }

    public C15JS(MusicModel musicModel, boolean z, int i) {
        this.LIZ = musicModel;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
