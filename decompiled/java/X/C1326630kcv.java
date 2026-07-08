package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326630kcv extends C09AY implements Function0<InterfaceC1320200kSY<Object>> {
    public final /* synthetic */ C1325710kbR LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326630kcv(C1325710kbR c1325710kbR, String str, boolean z) {
        super(0);
        this.LL = c1325710kbR;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1320200kSY<Object> invoke() {
        String str;
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(this.LL, null);
        if (this.LLILLJJLI && (str = this.LLILLL) != null) {
            C1326660kcy.LIZ.LIZ(str, interfaceC1320200kSYLJI);
        }
        return interfaceC1320200kSYLJI;
    }
}
