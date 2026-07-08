package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0R22, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R22<T> extends C09AY implements Function0<InterfaceC1555100qZQ<T>> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Class<T> LLILLL;
    public final /* synthetic */ InterfaceC1554780qYu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R22(InterfaceC665370Q7z interfaceC665370Q7z, String str, Class<T> cls, InterfaceC1554780qYu interfaceC1554780qYu) {
        super(0);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = str;
        this.LLILLL = cls;
        this.LLILZ = interfaceC1554780qYu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1554890qZ5 tree = this.LL.getTree();
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "source_default_key";
        }
        return tree.LJIIIZ(str, this.LLILLL, this.LLILZ);
    }
}
