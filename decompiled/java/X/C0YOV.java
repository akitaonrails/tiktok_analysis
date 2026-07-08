package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YOV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOV extends C09AY implements Function0<String> {
    public final /* synthetic */ C0YOW LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YOV(C0YOW c0yow, String str, String str2) {
        super(0);
        this.LL = c0yow;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.LL.LIZ.LJIIZILJ().getMessage().LIZ().LJFF(this.LLILLJJLI, this.LLILLL);
    }
}
