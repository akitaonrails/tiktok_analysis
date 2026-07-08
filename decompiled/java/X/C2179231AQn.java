package X;

import android.content.res.AssetFileDescriptor;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;

/* JADX INFO: renamed from: X.1AQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179231AQn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AssetFileDescriptor LIZLLL;
    public final PlayModel LJ;

    public C2179231AQn() {
        this(null, null, null, 31);
    }

    public C2179231AQn(String str, String str2, PlayModel playModel, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        playModel = (i & 16) != 0 ? null : playModel;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = playModel;
    }
}
