package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538080q7y extends C09AY implements Function1<C1532310pyf, Unit> {
    public final /* synthetic */ InterfaceC1290540jgi<Object> LL;
    public final /* synthetic */ Function1<C1532310pyf, C1289590jfB<Object>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1538080q7y(InterfaceC1290540jgi<Object> interfaceC1290540jgi, Function1<? super C1532310pyf, C1289590jfB<Object>> function1) {
        super(1);
        this.LL = interfaceC1290540jgi;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1532310pyf c1532310pyf) {
        C1532310pyf c1532310pyf2 = c1532310pyf;
        if (!c1532310pyf2.isSuccess()) {
            InterfaceC1290540jgi<Object> interfaceC1290540jgi = this.LL;
            if (interfaceC1290540jgi != null) {
                interfaceC1290540jgi.LIZ(C1289590jfB.LIZ(new Exception(c1532310pyf2.LIZJ.LIZJ())));
            }
        } else {
            C1289590jfB<Object> c1289590jfBInvoke = this.LLILLJJLI.invoke(c1532310pyf2);
            InterfaceC1290540jgi<Object> interfaceC1290540jgi2 = this.LL;
            if (interfaceC1290540jgi2 != null) {
                interfaceC1290540jgi2.LIZ(c1289590jfBInvoke);
            }
        }
        return Unit.LIZ;
    }
}
