package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C6P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C6P extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0C6R LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0C6P(C0C6R c0c6r, long j, long j2, C118300cf c118300cf, C118300cf c118300cf2, C259800zU<String> c259800zU) {
        super(0);
        this.LL = c0c6r;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c118300cf;
        this.LLILZIL = c118300cf2;
        this.LLILZLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0C6R c0c6r = this.LL;
        Keva keva = c0c6r.LJIIL;
        if (keva != null) {
            keva.storeLong(c0c6r.LIZJ, (this.LLILLJJLI - this.LLILLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C0C6R c0c6r2 = this.LL;
        Keva keva2 = c0c6r2.LJIIL;
        if (keva2 != null) {
            keva2.storeInt(c0c6r2.LJFF, this.LLILZ.element);
        }
        C0C6R c0c6r3 = this.LL;
        Keva keva3 = c0c6r3.LJIIL;
        if (keva3 != null) {
            keva3.storeInt(c0c6r3.LJI, this.LLILZIL.element);
        }
        C0C6R c0c6r4 = this.LL;
        Keva keva4 = c0c6r4.LJIIL;
        if (keva4 != null) {
            keva4.storeString(c0c6r4.LIZLLL, this.LLILZLL.element);
        }
        return Unit.LIZ;
    }
}
