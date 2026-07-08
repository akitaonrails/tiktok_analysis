package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.15Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20530015Va {
    public final String LIZ;
    public final ImageUrlModel LIZIZ;
    public final Aweme LIZJ;
    public C15VQ LIZLLL;
    public final boolean LJ;

    public C20530015Va(String str, ImageUrlModel imageUrlModel, Aweme aweme, boolean z, int i) {
        C15VQ c15vq;
        if ((i & 8) != 0) {
            c15vq = C15VQ.IDLE;
        } else {
            c15vq = null;
        }
        z = (i & 16) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = imageUrlModel;
        this.LIZJ = aweme;
        this.LIZLLL = c15vq;
        this.LJ = z;
    }
}
