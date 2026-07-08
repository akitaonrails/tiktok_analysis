package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210680hbu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC19526611aS LLILLL;
    public final /* synthetic */ C1210690hbv LLILZ;
    public final /* synthetic */ C19536511c3 LLILZIL;
    public final /* synthetic */ InterfaceC1219340hps LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ C1211030hcT LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1210680hbu(String str, Boolean bool, InterfaceC19526611aS interfaceC19526611aS, C1210690hbv c1210690hbv, C19536511c3 c19536511c3, InterfaceC1219340hps interfaceC1219340hps, String str2, int i, C1211030hcT c1211030hcT) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = bool;
        this.LLILLL = interfaceC19526611aS;
        this.LLILZ = c1210690hbv;
        this.LLILZIL = c19536511c3;
        this.LLILZLL = interfaceC1219340hps;
        this.LLIZ = str2;
        this.LLIZLLLIL = i;
        this.LLJ = c1211030hcT;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Intrinsics.LJFF(this.LLILLJJLI, Boolean.FALSE)) {
            C1210690hbv c1210690hbv = this.LLILZ;
            if (!c1210690hbv.LIZIZ) {
                c1210690hbv.LIZIZ = true;
                this.LLILZIL.LJ.Q1(0, "voice_change_progress");
                this.LLILZLL.onStart(this.LLIZLLLIL);
                this.LLJ.LIZ(1, 40, Mp4ScreenVideoLoadTimeout.CONTROL, new AwS127S0101000_19(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, 11));
            }
        }
        if (Intrinsics.LJFF(this.LL, "FetchVC")) {
            C1210690hbv c1210690hbv2 = this.LLILZ;
            if (!c1210690hbv2.LIZ && c1210690hbv2.LIZIZ) {
                c1210690hbv2.LIZ = true;
                this.LLJ.LIZ(40, 99, Mp4ScreenVideoLoadTimeout.CONTROL, new AwS127S0101000_19(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, 12));
            }
        }
        return Unit.LIZ;
    }
}
