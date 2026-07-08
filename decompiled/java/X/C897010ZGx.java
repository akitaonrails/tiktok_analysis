package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897010ZGx extends C09AY implements Function1<C896990ZGv, C896990ZGv> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897010ZGx(String str, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C896990ZGv invoke(C896990ZGv c896990ZGv) {
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        c896990ZGv.getClass();
        return new C896990ZGv(str, z);
    }
}
