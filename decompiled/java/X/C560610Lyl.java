package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560610Lyl extends C09AY implements Function1<C560660Lyq, C560660Lyq> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560610Lyl(boolean z, String str, boolean z2, boolean z3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C560660Lyq invoke(C560660Lyq c560660Lyq) {
        return C560660Lyq.LIZ(c560660Lyq, EnumC371580EhY.SHOW, this.LL, 0.0f, this.LLILLJJLI, Boolean.valueOf(this.LLILLL), null, this.LLILZ, 32);
    }
}
