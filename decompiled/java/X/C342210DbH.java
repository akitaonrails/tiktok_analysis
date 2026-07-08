package X;

import com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.PrefabViewModel;

/* JADX INFO: renamed from: X.0DbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.PrefabViewModel", f = "PrefabViewModel.kt", l = {99}, m = "resetDownloadStatus")
public final class C342210DbH extends AbstractC23140094w {
    public Object LL;
    public C342250DbL LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PrefabViewModel<E, T> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342210DbH(PrefabViewModel<E, T> prefabViewModel, InterfaceC1364105Vn<? super C342210DbH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = prefabViewModel;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0DbH for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "PrefabViewModel@a372.resetDownloadStatus$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLL = r4
            int r1 = r3.LLILZIL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZIL = r1
            com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.PrefabViewModel<E, T> r1 = r3.LLILZ
            r0 = 0
            java.lang.Object r0 = r1.zQ2(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C342210DbH.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
