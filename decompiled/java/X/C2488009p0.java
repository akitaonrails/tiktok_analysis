package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09p0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2488009p0 {
    public final MediaModel LIZ;
    public final CreativeInfo LIZIZ;
    public final String LIZJ;
    public AnonymousClass0957<?> LIZLLL;

    public C2488009p0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2488009p0)) {
            return false;
        }
        C2488009p0 c2488009p0 = (C2488009p0) obj;
        return Intrinsics.LJFF(this.LIZ, c2488009p0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2488009p0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2488009p0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2488009p0.LIZLLL);
    }

    public C2488009p0(MediaModel mediaModel, CreativeInfo creativeInfo, String str) {
        this.LIZ = mediaModel;
        this.LIZIZ = creativeInfo;
        this.LIZJ = str;
        this.LIZLLL = null;
    }
}
