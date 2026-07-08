package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0933, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {32, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "emit")
public final class AnonymousClass0933 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AnonymousClass0932<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0933(AnonymousClass0932<? super T> anonymousClass0932, InterfaceC1364105Vn<? super AnonymousClass0933> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0932;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0933 for r2v1 'this'  X.05Vn
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
            r2.LL = r3
            int r1 = r2.LLILLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r2.LLILLL = r1
            X.0932<T> r1 = r2.LLILLJJLI
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0933.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
