package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ye1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878990Ye1 extends C09AY implements Function1<Map<String, ? extends C872090YJb>, Unit> {
    public final /* synthetic */ C881600YiE LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878990Ye1(C881600YiE c881600YiE, InterfaceC879010Ye3 interfaceC879010Ye3) {
        super(1);
        this.LL = c881600YiE;
        this.LLILLJJLI = interfaceC879010Ye3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends C872090YJb> map) {
        Map<String, ? extends C872090YJb> map2 = map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveReadReceiptData size=");
        sbLIZ.append(map2.size());
        sbLIZ.append(", page=");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLJJLI;
        C1729806q0.LIZJ(interfaceC879010Ye3, new C879000Ye2(map2, this.LL, interfaceC879010Ye3));
        return Unit.LIZ;
    }
}
