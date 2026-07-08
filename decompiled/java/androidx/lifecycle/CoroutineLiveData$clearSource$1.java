package androidx.lifecycle;

import X.AbstractC23140094w;
import X.C09DV;
import X.InterfaceC1364105Vn;

/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {226}, m = "clearSource$lifecycle_livedata_release")
public final class CoroutineLiveData$clearSource$1 extends AbstractC23140094w {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoroutineLiveData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$clearSource$1(CoroutineLiveData<T> coroutineLiveData, InterfaceC1364105Vn<? super CoroutineLiveData$clearSource$1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = coroutineLiveData;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to androidx.lifecycle.CoroutineLiveData$clearSource$1 for r2v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            r2.result = r3
            int r1 = r2.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r2.label = r1
            androidx.lifecycle.CoroutineLiveData<T> r0 = r2.this$0
            java.lang.Object r0 = r0.clearSource$lifecycle_livedata_release(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData$clearSource$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
