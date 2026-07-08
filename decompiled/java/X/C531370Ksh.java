package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0Ksh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531370Ksh {
    public final Integer LIZ;
    public final Exception LIZIZ;
    public final AVMusic LIZJ;
    public final String LIZLLL;

    public C531370Ksh(Integer num, Exception exc, AVMusic aVMusic, String str) {
        this.LIZ = num;
        this.LIZIZ = exc;
        this.LIZJ = aVMusic;
        this.LIZLLL = str;
    }

    public /* synthetic */ C531370Ksh(Integer num, Exception exc, AVMusic aVMusic, String str, int i) {
        this((i & 1) != 0 ? 0 : num, (i & 4) != 0 ? null : exc, (i & 8) != 0 ? null : aVMusic, (i & 16) != 0 ? null : str);
    }
}
