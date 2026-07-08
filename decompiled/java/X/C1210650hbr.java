package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210650hbr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Boolean LL;
    public final /* synthetic */ C1210660hbs LLILLJJLI;
    public final /* synthetic */ InterfaceC1219340hps LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1211030hcT LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1210650hbr(Boolean bool, C1210660hbs c1210660hbs, InterfaceC1219340hps interfaceC1219340hps, String str, int i, C1211030hcT c1211030hcT, String str2) {
        super(0);
        this.LL = bool;
        this.LLILLJJLI = c1210660hbs;
        this.LLILLL = interfaceC1219340hps;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = c1211030hcT;
        this.LLIZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Intrinsics.LJFF(this.LL, Boolean.FALSE)) {
            C1210660hbs c1210660hbs = this.LLILLJJLI;
            if (!c1210660hbs.LIZIZ) {
                c1210660hbs.LIZIZ = true;
                this.LLILLL.onStart(this.LLILZIL);
                this.LLILZLL.LIZ(1, 40, Mp4ScreenVideoLoadTimeout.CONTROL, new AwS127S0101000_19(this.LLILLL, this.LLILZ, this.LLILZIL, 8));
            }
        }
        if (Intrinsics.LJFF(this.LLIZ, "FetchSC")) {
            C1210660hbs c1210660hbs2 = this.LLILLJJLI;
            if (!c1210660hbs2.LIZ && c1210660hbs2.LIZIZ) {
                c1210660hbs2.LIZ = true;
                this.LLILZLL.LIZ(40, 99, Mp4ScreenVideoLoadTimeout.CONTROL, new AwS127S0101000_19(this.LLILLL, this.LLILZ, this.LLILZIL, 9));
            }
        }
        return Unit.LIZ;
    }
}
