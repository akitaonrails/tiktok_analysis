package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0r6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575710r6f extends C09AY implements Function1<C1575720r6g, C1575720r6g> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575710r6f(int i, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1575720r6g invoke(C1575720r6g c1575720r6g) {
        C1575750r6j c1575750r6j;
        C1575720r6g c1575720r6g2 = c1575720r6g;
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c1575750r6j = new C1575750r6j(false, false, false, 7);
                } else {
                    c1575750r6j = new C1575750r6j(false, this.LLILLJJLI, false, 5);
                }
            } else {
                c1575750r6j = new C1575750r6j(false, false, this.LLILLJJLI, 3);
            }
        } else {
            c1575750r6j = new C1575750r6j(this.LLILLJJLI, false, false, 6);
        }
        return C1575720r6g.LIZ(c1575720r6g2, new C291001Au(c1575750r6j), null, null, null, null, 30);
    }
}
