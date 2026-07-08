package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718990SIf extends C09AY implements Function1<C0SJL<C719000SIg>, C0SJL<C719000SIg>> {
    public final /* synthetic */ C013C LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C718990SIf(C013C c013c) {
        super(1);
        this.LL = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SJL<C719000SIg> invoke(C0SJL<C719000SIg> c0sjl) {
        C0SJL<C719000SIg> c0sjl2 = c0sjl;
        if (C0SIE.LIZIZ(c0sjl2)) {
            this.LL.element = true;
        }
        return c0sjl2;
    }
}
