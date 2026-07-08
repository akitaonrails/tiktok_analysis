package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Ar8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192321Ar8 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C2192231Aqz LL;
    public final /* synthetic */ double LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192321Ar8(double d, C2192231Aqz c2192231Aqz) {
        super(1);
        this.LL = c2192231Aqz;
        this.LLILLJJLI = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        super/*X.1Ar1*/.LJFF(str, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
