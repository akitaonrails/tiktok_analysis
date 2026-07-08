package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872100YJc extends C09AY implements Function0<C0YJY> {
    public final /* synthetic */ C0YJV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872100YJc(C0YJV c0yjv) {
        super(0);
        this.LL = c0yjv;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0YJY invoke() {
        C0YJY c0yjy = new C0YJY(this.LL.LJIIIIZZ(), this.LL.LIZ);
        this.LL.LIZ.LIZJ().LJIL(c0yjy);
        return c0yjy;
    }
}
