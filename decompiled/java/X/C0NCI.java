package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NCI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCI extends C09AY implements Function1<C2189821An6, Boolean> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NCI(boolean z, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C2189821An6 c2189821An6) {
        boolean z;
        if (!this.LL && !this.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
