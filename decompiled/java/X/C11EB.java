package X;

import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D, E] */
/* JADX INFO: renamed from: X.11EB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EB<A, B, C, D, E> extends C09AY implements InterfaceC1685420txc<A, B, C, D, E, Unit> {
    public final /* synthetic */ C11DL<RECEIVER> LL;
    public final /* synthetic */ InterfaceC1685430txd<RECEIVER, A, B, C, D, E, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11EB(C11DL<? extends RECEIVER> c11dl, InterfaceC1685430txd<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        super(5);
        this.LL = c11dl;
        this.LLILLJJLI = interfaceC1685430txd;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InterfaceC874803bO receiver = this.LL.getReceiver();
        if (receiver != null) {
            this.LLILLJJLI.invoke((RECEIVER) receiver, (A) obj, (B) obj2, (C) obj3, (D) obj4, (E) obj5);
        }
        return Unit.LIZ;
    }
}
