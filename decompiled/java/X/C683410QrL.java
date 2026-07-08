package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683410QrL extends C09AY implements Function1<C683390QrJ, C683390QrJ> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C683410QrL(String str, String str2, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C683390QrJ invoke(C683390QrJ c683390QrJ) {
        return C683390QrJ.LIZ(c683390QrJ, new C683430QrN(this.LL, this.LLILLJJLI), null, null, 0, null, 30);
    }
}
