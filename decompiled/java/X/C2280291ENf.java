package X;

import android.media.MediaCrypto;
import android.media.MediaDrm;
import com.bytedance.vcloud.strategy.drm.SessionEntry;

/* JADX INFO: renamed from: X.1ENf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280291ENf {
    public final MediaDrm LIZ;
    public final byte[] LIZIZ;
    public final MediaCrypto LIZJ;
    public final String LIZLLL;
    public final Object LJ;

    public C2280291ENf(MediaDrm mediaDrm, byte[] bArr, MediaCrypto mediaCrypto, String str, SessionEntry sessionEntry) {
        this.LIZ = mediaDrm;
        this.LIZIZ = bArr;
        this.LIZJ = mediaCrypto;
        this.LIZLLL = str;
        this.LJ = sessionEntry;
    }
}
