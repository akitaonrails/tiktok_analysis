package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843130y3z implements InterfaceC1731706qJ<Object, Object> {
    public Object LL;
    public final /* synthetic */ Function0<Object> LLILLJJLI;

    public C1843130y3z(Function0<Object> function0) {
        this.LLILLJJLI = function0;
    }

    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        Object obj2 = this.LL;
        if (obj2 == null) {
            Object objInvoke = this.LLILLJJLI.invoke();
            this.LL = objInvoke;
            return objInvoke;
        }
        return obj2;
    }
}
