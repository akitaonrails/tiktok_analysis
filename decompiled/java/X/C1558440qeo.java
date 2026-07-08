package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qeo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558440qeo extends C09AY implements Function1<String, InterfaceC665370Q7z> {
    public final /* synthetic */ InterfaceC713360RyY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558440qeo(InterfaceC713360RyY interfaceC713360RyY) {
        super(1);
        this.LL = interfaceC713360RyY;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC665370Q7z invoke(String str) throws IllegalAccessException {
        InterfaceC665370Q7z interfaceC665370Q7zK0 = this.LL.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1558480qes c1558480qes = new C1558480qes(this.LL);
            c1558480qes.getTree().LIZIZ(interfaceC665370Q7zK0);
            return c1558480qes;
        }
        throw new IllegalAccessException("can not find parent scope");
    }
}
