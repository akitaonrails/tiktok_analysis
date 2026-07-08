package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372730lpH {
    public final String LIZ;
    public final String LIZIZ;
    public final Aweme LIZJ;
    public final C0HTT<C737030Svd> LIZLLL;
    public final Bundle LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1372730lpH(String str, String str2, Aweme aweme, C0HTT c0htt, Bundle bundle, String str3, int i) {
        boolean z;
        C0HTT c0htt2 = c0htt;
        String str4 = str3;
        Bundle bundle2 = bundle;
        String str5 = str2;
        String str6 = (i & 1) != 0 ? "" : str;
        str5 = (i & 2) != 0 ? "" : str5;
        c0htt2 = (i & 8) != 0 ? null : c0htt2;
        bundle2 = (i & 16) != 0 ? new Bundle() : bundle2;
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(str6, str5, aweme, c0htt2, bundle2, z, (i & 64) != 0 ? "" : str4, (i & 128) == 0 ? null : "", 0, null, null);
    }

    public C1372730lpH(String str, String str2, Aweme aweme, C0HTT<C737030Svd> c0htt, Bundle bundle, boolean z, String str3, String str4, int i, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = aweme;
        this.LIZLLL = c0htt;
        this.LJ = bundle;
        this.LJFF = z;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = i;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
    }
}
