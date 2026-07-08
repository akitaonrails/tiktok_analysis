package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571020MaS<C> {
    public final List<AbstractC571190Maj<C>> LIZ = new ArrayList();

    public final void LIZ(C2217421BqW c2217421BqW) {
        ((ArrayList) this.LIZ).add(new C571080MaY(c2217421BqW.getName(), EnumC571120Mac.REJECT, new AwS587S0100000_8(c2217421BqW, 719)));
    }

    public final void LIZIZ(C2217421BqW c2217421BqW) {
        ((ArrayList) this.LIZ).add(new C571080MaY(c2217421BqW.getName(), EnumC571120Mac.REQUIRE, new AwS587S0100000_8(c2217421BqW, 720)));
    }
}
