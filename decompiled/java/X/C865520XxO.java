package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C865520XxO extends C09AY implements Function1<InterfaceC867020Xzo<C0YAE>, Unit> {
    public final /* synthetic */ C865530XxP LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C862540Xsa LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865520XxO(C865530XxP c865530XxP, String str, long j, C862540Xsa c862540Xsa) {
        super(1);
        this.LL = c865530XxP;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = c862540Xsa;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        this.LL.LIZIZ.invoke(this.LLILLJJLI).LLLIL(this.LLILLL, this.LLILZ, interfaceC867020Xzo);
        return Unit.LIZ;
    }
}
