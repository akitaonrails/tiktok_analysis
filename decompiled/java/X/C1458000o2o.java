package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0o2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458000o2o {
    public final AVMusic LIZ;
    public final String LIZIZ;

    public C1458000o2o() {
        this(null, null, 15);
    }

    public C1458000o2o(AVMusic aVMusic, String str, int i) {
        aVMusic = (i & 1) != 0 ? null : aVMusic;
        str = (i & 2) != 0 ? "" : str;
        this.LIZ = aVMusic;
        this.LIZIZ = str;
    }
}
