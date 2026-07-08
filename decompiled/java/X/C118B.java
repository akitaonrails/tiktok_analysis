package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.118B, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C118B extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AnonymousClass1231 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118B(AnonymousClass1231 anonymousClass1231, String str, String str2, boolean z, Function0<Unit> function0) {
        super(0);
        this.LL = anonymousClass1231;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZLLL(this.LLILLJJLI, this.LLILZ, this.LLILLL, this.LLILZIL);
        return Unit.LIZ;
    }
}
