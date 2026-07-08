package X;

import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.main.assems.HoxAssem;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583590rJN extends C09AY implements Function0<C1583570rJL> {
    public final /* synthetic */ HoxAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583590rJN(HoxAssem hoxAssem) {
        super(0);
        this.LL = hoxAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0rJL] */
    @Override // kotlin.jvm.functions.Function0
    public final C1583570rJL invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return new InterfaceC1570590qyP(c19egLIZ) { // from class: X.0rJL
                public final C19EG LL;

                {
                    this.LL = c19egLIZ;
                }

                @Override // X.InterfaceC1570590qyP
                public final void x5(List<? extends InterfaceC1583870rJp> list, List<? extends InterfaceC1583870rJp> list2) {
                    AbstractC1583710rJZ abstractC1583710rJZ;
                    C19EG c19eg = this.LL;
                    if (c19eg == null) {
                        return;
                    }
                    AbstractC1583720rJa abstractC1583720rJaGQ2 = Hox.LLJILJIL.LIZ(c19eg).GQ2("page_feed");
                    if ((abstractC1583720rJaGQ2 instanceof AbstractC1583710rJZ) && (abstractC1583710rJZ = (AbstractC1583710rJZ) abstractC1583720rJaGQ2) != null) {
                        C1583540rJI.LIZIZ(c19eg, abstractC1583710rJZ, list, list2);
                    }
                }
            };
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
