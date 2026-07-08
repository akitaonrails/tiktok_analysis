package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0r0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572060r0m extends C09AY implements Function1<C1572040r0k, C1572040r0k> {
    public final /* synthetic */ C1644470stZ LL;
    public final /* synthetic */ C1644470stZ LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572060r0m(C1644470stZ c1644470stZ, C1644470stZ c1644470stZ2, int i, int i2) {
        super(1);
        this.LL = c1644470stZ;
        this.LLILLJJLI = c1644470stZ2;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1572040r0k invoke(C1572040r0k c1572040r0k) {
        boolean z;
        C1572040r0k c1572040r0k2 = c1572040r0k;
        C1644470stZ c1644470stZ = this.LL;
        C1644470stZ c1644470stZ2 = this.LLILLJJLI;
        if (this.LLILLL <= this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        return C1572040r0k.LIZ(c1572040r0k2, false, null, null, new C291001Au(new C1572050r0l(c1644470stZ, c1644470stZ2, z)), 7);
    }
}
