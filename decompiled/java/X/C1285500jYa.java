package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285500jYa extends C09AY implements Function0<C1285460jYW> {
    public final /* synthetic */ C2181471AZd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285500jYa(C2181471AZd c2181471AZd) {
        super(0);
        this.LL = c2181471AZd;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0jYW] */
    @Override // kotlin.jvm.functions.Function0
    public final C1285460jYW invoke() {
        final C2181471AZd c2181471AZd = this.LL;
        return new InterfaceC1280020jPk() { // from class: X.0jYW
            @Override // X.InterfaceC1280020jPk
            public final void LIZIZ() {
                Iterator<InterfaceC1280020jPk> it2 = c2181471AZd.LLILLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }

            @Override // X.InterfaceC1280020jPk
            public final void LIZJ() {
                Iterator<InterfaceC1280020jPk> it2 = c2181471AZd.LLILLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ();
                }
            }

            @Override // X.InterfaceC1280020jPk
            public final void LIZ(long j, long j2) {
                c2181471AZd.LJJI();
                Iterator<InterfaceC1280020jPk> it2 = c2181471AZd.LLILLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(j, j2);
                }
            }
        };
    }
}
