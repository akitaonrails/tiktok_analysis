package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823380xY8 extends C09AY implements Function0<String> {
    public final /* synthetic */ C1822930xXP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823380xY8(C1822930xXP c1822930xXP) {
        super(0);
        this.LL = c1822930xXP;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC1822900xXM interfaceC1822900xXM = this.LL.LLILZLL;
        return String.valueOf(interfaceC1822900xXM != null ? interfaceC1822900xXM.hashCode() : 0);
    }
}
