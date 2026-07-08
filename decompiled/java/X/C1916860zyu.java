package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0zyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916860zyu extends C09AY implements Function0<C1916850zyt> {
    public final /* synthetic */ C1916800zyo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1916860zyu(C1916800zyo c1916800zyo) {
        super(0);
        this.LL = c1916800zyo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0zyt] */
    @Override // kotlin.jvm.functions.Function0
    public final C1916850zyt invoke() {
        final C1916800zyo c1916800zyo = this.LL;
        return new InterfaceC1594906Mh() { // from class: X.0zyt
            @Override // X.InterfaceC1594906Mh
            public final void LIZ(String str) {
            }

            @Override // X.InterfaceC1594906Mh
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1594906Mh
            public final void LIZIZ(Map map, AwS546S0100000_2 awS546S0100000_2) {
                c1916800zyo.LLJJ = awS546S0100000_2;
            }
        };
    }
}
