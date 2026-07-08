package X;

import Y.ACListenerS92S0300000_28;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10LH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LH extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ C1385130m9H LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C10LN LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ C426250GnX LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10LH(C1385130m9H c1385130m9H, int i, C10LN c10ln, Aweme aweme, C426250GnX c426250GnX) {
        super(2);
        this.LL = c1385130m9H;
        this.LLILLJJLI = i;
        this.LLILLL = c10ln;
        this.LLILZ = aweme;
        this.LLILZIL = c426250GnX;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
        if (bool.booleanValue()) {
            C1385130m9H c1385130m9H = this.LL;
            int visibility = c1385130m9H.getVisibility();
            c1385130m9H.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1385130m9H);
            int i = this.LLILLJJLI;
            C10LN c10ln = this.LLILLL;
            if (i >= c10ln.LIZJ) {
                C786410Ut5.oa(this.LL, new ACListenerS92S0300000_28(this.LLILZIL, c10ln, this.LLILZ, 4));
                this.LL.l0();
            } else {
                C786410Ut5.oa(this.LL, new ACListenerS92S0300000_28(this.LLILZIL, c10ln, this.LLILZ, 5));
                if (C10LJ.LIZIZ(this.LLILZ)) {
                    this.LL.i0();
                }
            }
        } else {
            C786410Ut5.oa(this.LL, null);
        }
        return Unit.LIZ;
    }
}
