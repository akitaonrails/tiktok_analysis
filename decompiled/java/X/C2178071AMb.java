package X;

import android.content.res.AssetFileDescriptor;
import com.bytedance.ies.xelement.audiott.bean.PlayModel;

/* JADX INFO: renamed from: X.1AMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178071AMb {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AssetFileDescriptor LIZLLL;
    public final PlayModel LJ;

    public C2178071AMb() {
        this(null, null, null, null, null, 31);
    }

    public C2178071AMb(String str, String str2, String str3, AssetFileDescriptor assetFileDescriptor, PlayModel playModel, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        assetFileDescriptor = (i & 8) != 0 ? null : assetFileDescriptor;
        playModel = (i & 16) != 0 ? null : playModel;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = assetFileDescriptor;
        this.LJ = playModel;
    }
}
