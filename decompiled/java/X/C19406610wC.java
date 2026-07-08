package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10wC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19406610wC {
    public final EnumC993450bxX LIZ;
    public final EnumC993380bxQ LIZIZ;
    public final EnumC993400bxS LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final ChallengeDetailParam LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19406610wC)) {
            return false;
        }
        C19406610wC c19406610wC = (C19406610wC) obj;
        return this.LIZ == c19406610wC.LIZ && this.LIZIZ == c19406610wC.LIZIZ && this.LIZJ == c19406610wC.LIZJ && this.LIZLLL == c19406610wC.LIZLLL && Intrinsics.LJFF(this.LJ, c19406610wC.LJ) && Intrinsics.LJFF(this.LJFF, c19406610wC.LJFF) && Intrinsics.LJFF(this.LJI, c19406610wC.LJI);
    }

    public C19406610wC(EnumC993450bxX enumC993450bxX, EnumC993380bxQ enumC993380bxQ, EnumC993400bxS enumC993400bxS, int i, String str, String str2, ChallengeDetailParam challengeDetailParam) {
        this.LIZ = enumC993450bxX;
        this.LIZIZ = enumC993380bxQ;
        this.LIZJ = enumC993400bxS;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = challengeDetailParam;
    }
}
