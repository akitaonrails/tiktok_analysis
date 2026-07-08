package X;

import Y.AfS151S0200000_15;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0auq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953340auq extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ InterfaceC953350aur LL;
    public final /* synthetic */ C953770avX LLILLJJLI;
    public final /* synthetic */ C334801Rq LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C953340auq(InterfaceC953350aur interfaceC953350aur, C953770avX c953770avX, C334801Rq c334801Rq, boolean z) {
        super(2);
        this.LL = interfaceC953350aur;
        this.LLILLJJLI = c953770avX;
        this.LLILLL = c334801Rq;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String str3 = str;
        if (str3.length() > 0) {
            this.LL.LIZIZ();
            C953620avI.LIZLLL(AfS151S0200000_15.LIZ$0(this.LLILLJJLI, this.LLILLL, this.LLILZ, str3, null));
        } else {
            this.LL.LIZ(true, true);
        }
        return Unit.LIZ;
    }
}
