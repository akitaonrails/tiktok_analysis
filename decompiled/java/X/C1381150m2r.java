package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0m2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381150m2r extends C09AY implements Function1<InterfaceC1381130m2p, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1381150m2r(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1381130m2p interfaceC1381130m2p) {
        InterfaceC1381130m2p interfaceC1381130m2p2 = interfaceC1381130m2p;
        interfaceC1381130m2p2.LJIIJJI("news_anchor");
        interfaceC1381130m2p2.LJIIIIZZ(this.LL);
        interfaceC1381130m2p2.LJIIJ(this.LLILLJJLI);
        interfaceC1381130m2p2.LJI(new InterfaceC1381790m3t() { // from class: X.0m2s
            @Override // X.InterfaceC1381790m3t
            public final void LIZ(String str, Map<String, ? extends Object> map) {
            }
        });
        return Unit.LIZ;
    }
}
