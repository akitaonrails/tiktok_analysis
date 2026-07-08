package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361010lWN {
    public final Aweme LIZ;
    public final long LIZIZ;
    public final CharSequence LIZJ;
    public final boolean LIZLLL;
    public final CharSequence LJ;

    public C1361010lWN(Aweme aweme, long j, CharSequence charSequence, boolean z, CharSequence charSequence2) {
        this.LIZ = aweme;
        this.LIZIZ = j;
        this.LIZJ = charSequence;
        this.LIZLLL = z;
        this.LJ = charSequence2;
    }

    public static C1361010lWN LIZ(C1361010lWN c1361010lWN, CharSequence charSequence, boolean z, CharSequence charSequence2, int i) {
        Aweme aweme;
        long j;
        CharSequence charSequence3 = charSequence2;
        boolean z2 = z;
        CharSequence charSequence4 = charSequence;
        if ((i & 1) != 0) {
            aweme = c1361010lWN.LIZ;
        } else {
            aweme = null;
        }
        if ((i & 2) != 0) {
            j = c1361010lWN.LIZIZ;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            charSequence4 = c1361010lWN.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c1361010lWN.LIZLLL;
        }
        if ((i & 16) != 0) {
            charSequence3 = c1361010lWN.LJ;
        }
        c1361010lWN.getClass();
        return new C1361010lWN(aweme, j, charSequence4, z2, charSequence3);
    }
}
