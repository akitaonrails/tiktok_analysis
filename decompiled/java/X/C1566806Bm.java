package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1566806Bm extends C09AY implements Function1<InterfaceC1566906Bn, Unit> {
    public final /* synthetic */ InterfaceC884020Ym8 LL;
    public final /* synthetic */ List<InterfaceC884440Ymo> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1566806Bm(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
        super(1);
        this.LL = interfaceC884020Ym8;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1566906Bn interfaceC1566906Bn) {
        interfaceC1566906Bn.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
