package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0f5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113960f5u implements InterfaceC1731706qJ<Object, Object> {
    public Object LL;
    public final /* synthetic */ Function0<Object> LLILLJJLI;

    public C1113960f5u(AwS418S0200000_17 awS418S0200000_17) {
        this.LLILLJJLI = awS418S0200000_17;
        if (!C1322020kVU.LIZ()) {
            this.LL = awS418S0200000_17.invoke();
        }
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
