package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YOX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOX extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C0YOW LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YOX(C0YOW c0yow, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = c0yow;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.LIZ.LJIIZILJ().getMessage().LIZ().LLII(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
    }
}
