package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0o3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458250o3D {
    public final String LIZ;
    public final MusicModel LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C1458250o3D() {
        this(null, null, null, null, 63);
    }

    public C1458250o3D(String str, MusicModel musicModel, String str2, String str3, int i) {
        str = (i & 1) != 0 ? "" : str;
        musicModel = (i & 2) != 0 ? null : musicModel;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = musicModel;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
