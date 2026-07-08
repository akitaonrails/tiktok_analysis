package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZTF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTF extends C09AY implements Function1<C234400vO, C234400vO> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZTF(boolean z, int i, int i2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C234400vO invoke(C234400vO c234400vO) {
        int i;
        if (this.LL) {
            i = -1;
        } else {
            i = this.LLILLJJLI + this.LLILLL;
        }
        C291001Au c291001Au = new C291001Au(Integer.valueOf(i));
        c234400vO.getClass();
        return new C234400vO(c291001Au);
    }
}
