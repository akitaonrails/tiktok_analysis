package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.utils.EncryptionUtil", f = "EncryptionUtil.kt", l = {117}, m = "getPinPublicKey")
public final class C1719310uqH extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1719290uqF LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719310uqH(C1719290uqF c1719290uqF, InterfaceC1364105Vn<? super C1719310uqH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1719290uqF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EncryptionUtil@e09d.getPinPublicKey$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, null, this);
        C1C7U.LIZIZ("EncryptionUtil@e09d.getPinPublicKey$1");
        return objLIZLLL;
    }
}
