package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS225S0300000_16;

/* JADX INFO: renamed from: X.0dPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049170dPP extends AbstractC1023470cjx {
    public final String LIZ;
    public final C1023630ckD<?>[] LIZIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public final void LJJIIZ(int i) {
        C1049180dPQ.LIZ.getClass();
        logAd(C1049180dPQ.LIZLLL, new AwS124S0101000_16(this, i, 1));
    }

    public C1049170dPP(String str, Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = str;
        this.LIZIZ = new C1023630ckD[0];
    }

    public final void LJJIIZI(Aweme aweme, Aweme aweme2) {
        C1049180dPQ.LIZ.getClass();
        logAd(C1049180dPQ.LIZIZ, new AwS225S0300000_16(this, aweme, aweme2, 3));
    }
}
