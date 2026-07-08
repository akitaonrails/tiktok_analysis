package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714140uhw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714140uhw(C1713750uhJ c1713750uhJ, String str, int i, long j, int i2, int i3) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, String> mapLIZJ = this.LL.LIZJ();
        mapLIZJ.put("background_phase", this.LLILLJJLI);
        mapLIZJ.put("entered_digits", String.valueOf(this.LLILLL));
        mapLIZJ.put("elapsed_duration", String.valueOf(this.LLILZ));
        mapLIZJ.put("attempt_seq", String.valueOf(this.LLILZIL));
        mapLIZJ.put("enter_seq", String.valueOf(this.LLILZLL));
        InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
        if (interfaceC1713820uhQ != null) {
            interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_background_snapshot", mapLIZJ);
        }
        return Unit.LIZ;
    }
}
