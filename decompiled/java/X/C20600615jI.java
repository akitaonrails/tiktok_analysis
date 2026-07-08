package X;

import com.bytedance.ext_power_list.AssemListViewModel;

/* JADX INFO: renamed from: X.15jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.ext_power_list.AssemListViewModel", f = "AssemListViewModel.kt", l = {150}, m = "whenLoadMore")
public final class C20600615jI extends AbstractC23140094w {
    public AssemListViewModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AssemListViewModel<S, ITEM, Cursor> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20600615jI(AssemListViewModel<S, ITEM, Cursor> assemListViewModel, InterfaceC1364105Vn<? super C20600615jI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = assemListViewModel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.15jI for r3v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "AssemListViewModel@fb1f.whenLoadMore$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLJJLI = r4
            int r1 = r3.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZ = r1
            com.bytedance.ext_power_list.AssemListViewModel<S, ITEM, Cursor> r1 = r3.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.whenLoadMore(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20600615jI.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
