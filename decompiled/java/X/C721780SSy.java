package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;

/* JADX INFO: renamed from: X.0SSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721780SSy {
    public final Aweme LIZ;
    public final LivePhotoStruct LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final EnumC721750SSv LJ;

    public C721780SSy(Aweme aweme, LivePhotoStruct livePhotoStruct, String str, boolean z) {
        EnumC721750SSv enumC721750SSv;
        this.LIZ = aweme;
        this.LIZIZ = livePhotoStruct;
        this.LIZJ = str;
        this.LIZLLL = z;
        if (livePhotoStruct.livePhotoType == 2) {
            enumC721750SSv = EnumC721750SSv.LOOP;
        } else if (!z && C0ST8.LIZJ(aweme) <= 1) {
            enumC721750SSv = EnumC721750SSv.LIVE;
        } else {
            enumC721750SSv = EnumC721750SSv.ONCE;
        }
        this.LJ = enumC721750SSv;
    }
}
