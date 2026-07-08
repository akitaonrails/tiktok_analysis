package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1573106Dx extends C09AY implements Function1<InterfaceC1573006Dw, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573106Dx(String str, String str2, String str3, boolean z, long j, long j2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = str2;
        this.LLILZIL = z;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1573006Dw interfaceC1573006Dw) {
        String str = this.LL;
        long j = this.LLILLJJLI;
        long j2 = this.LLILLL;
        interfaceC1573006Dw.nm(str, this.LLILZ, this.LLILZLL, this.LLILZIL, j, j2);
        return Unit.LIZ;
    }
}
