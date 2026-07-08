package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Esl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.promptedit.PromptEditPanelUISlotComponent$fetchPrompts$1", f = "PromptEditPanelUISlotComponent.kt", l = {145}, m = "invokeSuspend")
public final class C378530Esl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C378540Esm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C378530Esl(C378540Esm c378540Esm, InterfaceC1364105Vn<? super C378530Esl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c378540Esm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C378530Esl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[LOOP:0: B:13:0x0041->B:15:0x0047, LOOP_END] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PromptEditPanelUISlotComponent@3f9f.fetchPrompts$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r7.LL
            r1 = 1
            if (r0 == 0) goto L5c
            if (r0 != r1) goto L99
            X.C155000ia.LIZIZ(r8)
        L13:
            X.0EyV r8 = (X.C382090EyV) r8
        L15:
            X.0M8t r2 = X.C563650M8t.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "PromptEditPanelUISlotComponent fetchPrompts "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZJ(r2, r0)
            if (r8 == 0) goto L30
            java.util.List<X.0Et3> r1 = r8.LIZ
            if (r1 != 0) goto L32
        L30:
            X.13BV r1 = X.C13BV.INSTANCE
        L32:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L41:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r4.next()
            X.0Et3 r0 = (X.C378710Et3) r0
            X.0Et2 r3 = new X.0Et2
            java.lang.Integer r2 = r0.LIZ
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = r0.LIZJ
            r3.<init>(r2, r1, r0)
            r5.add(r3)
            goto L41
        L5c:
            X.C155000ia.LIZIZ(r8)
            X.0Esm r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = r0.H5()
            if (r0 == 0) goto L73
            r7.LL = r1
            java.lang.Object r8 = r0.LJJIIJZLJL(r7)
            if (r8 != r2) goto L13
            X.C1C7U.LIZIZ(r6)
            return r2
        L73:
            r8 = 0
            goto L15
        L75:
            java.util.List r1 = X.C1697820uHc.LIZLLL(r5)
            X.0Esm r0 = r7.LLILLJJLI
            java.util.List<X.0Et2> r0 = r0.LLJLLIL
            r0.clear()
            X.0Esm r0 = r7.LLILLJJLI
            java.util.List<X.0Et2> r0 = r0.LLJLLIL
            r0.addAll(r1)
            X.0Esm r2 = r7.LLILLJJLI
            kotlin.jvm.internal.AwS584S0100000_5 r1 = new kotlin.jvm.internal.AwS584S0100000_5
            r0 = 296(0x128, float:4.15E-43)
            r1.<init>(r2, r0)
            r2.i3(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378530Esl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
