package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Id5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470730Id5 extends AbstractC470740Id6<Integer, Object> {
    public final C565700MGq LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final Function1<EnumC485010J0h, Unit> LIZJ;
    public final Function1<List<OnThisDayTiktokMediaModel>, List<OnThisDayTiktokMediaModel>> LIZLLL;
    public volatile C484980J0e LJ;

    @Override // X.AbstractC470740Id6
    public final AbstractC470910IdN<Integer, Object> LIZ() {
        C484980J0e c484980J0e = new C484980J0e(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        this.LJ = c484980J0e;
        return c484980J0e;
    }

    public C470730Id5(C565700MGq c565700MGq, InterfaceC497601wk interfaceC497601wk, AwS586S0100000_7 awS586S0100000_7, AwS586S0100000_7 awS586S0100000_72) {
        this.LIZ = c565700MGq;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = awS586S0100000_7;
        this.LIZLLL = awS586S0100000_72;
    }
}
