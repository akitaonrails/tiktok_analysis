package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0RfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701590RfZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C701370RfD LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C700950ReX LLILZ;
    public final /* synthetic */ C700260RdQ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701590RfZ(String str, C701370RfD c701370RfD, int i, C700950ReX c700950ReX, C700260RdQ c700260RdQ) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c701370RfD;
        this.LLILLL = i;
        this.LLILZ = c700950ReX;
        this.LLILZIL = c700260RdQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AFwS189S0000000_3.get$arr$(717);
        C0T6L.LIZLLL();
        C700170RdH c700170RdH = this.LLILLJJLI.LLIZLLLIL;
        C700950ReX c700950ReXLIZIZ = c700170RdH != null ? C700960ReY.LIZIZ(c700170RdH) : null;
        this.LLILLJJLI.LIZ(this.LL, this.LLILLL, EnumC197200pO.ONLINE, c700950ReXLIZIZ, this.LLILZ);
        this.LLILLJJLI.LLJL.invoke(this.LLILZIL);
        InterfaceC702410Rgt interfaceC702410Rgt = this.LLILZIL.LIZLLL;
        if (interfaceC702410Rgt != null) {
            interfaceC702410Rgt.vg(c700950ReXLIZIZ);
        }
        return Unit.LIZ;
    }
}
