package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621880sJ8 extends AbstractC1622390sJx {
    public final Function2<List<String>, Function1<? super List<? extends AVChallenge>, Unit>, Unit> LLILLJJLI;
    public List<? extends AVChallenge> LLILLL;

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILLL = null;
    }

    public C1621880sJ8(AFwS291S0000000_8 aFwS291S0000000_8) {
        this.LLILLJJLI = aFwS291S0000000_8;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        Effect effect = c1627370sRz.LIZ;
        this.LLILLL = null;
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            this.LLILLJJLI.invoke(challenge, new AwS604S0100000_25(this, 518));
        }
    }
}
