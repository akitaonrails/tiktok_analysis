package X;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894070zO9 implements InterfaceC1141530foN {
    public final C1894010zO3 LL;
    public C1540540qBw LLILLJJLI;
    public Function1<? super Boolean, Unit> LLILLL;
    public final String LLILZ;

    public C1894070zO9(C1894010zO3 c1894010zO3) throws JSONException {
        this.LL = c1894010zO3;
        String string = UUID.randomUUID().toString();
        this.LLILZ = string;
        C1548820qPI.LJFF(string, this, UUID.randomUUID().toString());
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, this.LLILZ)) {
            InterfaceC1910807e6.LIZ.getClass();
            InterfaceC1910807e6 interfaceC1910807e6LIZ = C1910707e5.LIZ();
            if (interfaceC1910807e6LIZ != null) {
                interfaceC1910807e6LIZ.LIZIZ();
            }
            C1548820qPI.LJIIIIZZ(this.LLILZ, this);
            C1540540qBw c1540540qBw = this.LLILLJJLI;
            if (c1540540qBw != null) {
                c1540540qBw.LIZIZ();
            }
            this.LLILLJJLI = null;
            this.LLILLL = null;
        }
    }
}
