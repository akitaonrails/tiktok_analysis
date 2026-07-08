package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.preview.EPAIGCPreviewComponent$updatePreviewState$6", f = "EPAIGCPreviewComponent.kt", l = {282}, m = "invokeSuspend")
public final class C382610EzL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C382590EzJ LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ List<C379170Etn> LLILZLL;
    public final /* synthetic */ C382590EzJ LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382610EzL(List<C379170Etn> list, C382590EzJ c382590EzJ, InterfaceC1364105Vn<? super C382610EzL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = c382590EzJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C382610EzL(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:6:0x0021). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r6 = "EPAIGCPreviewComponent@8b66.updatePreviewState$6"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r4 = 1
            if (r0 == 0) goto L47
            if (r0 != r4) goto L79
            java.lang.Object r0 = r7.LLILZ
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r1 = r7.LLILLL
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r7.LLILLJJLI
            java.util.Collection r3 = (java.util.Collection) r3
            X.0EzJ r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L21:
            r0.add(r8)
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.next()
            X.0Etn r0 = (X.C379170Etn) r0
            r7.LL = r2
            r7.LLILLJJLI = r3
            r7.LLILLL = r1
            r7.LLILZ = r3
            r7.LLILZIL = r4
            java.lang.Object r8 = r2.C5(r0, r7)
            if (r8 != r5) goto L44
            X.C1C7U.LIZIZ(r6)
            return r5
        L44:
            r0 = r3
            r3 = r0
            goto L21
        L47:
            X.C155000ia.LIZIZ(r8)
            java.util.List<X.0Etn> r1 = r7.LLILZLL
            X.0EzJ r2 = r7.LLIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
            goto L24
        L5e:
            java.util.List r3 = (java.util.List) r3
            X.0EzJ r0 = r7.LLIZ
            com.bytedance.als.h0<java.util.List<X.0Etn>> r0 = r0.LLJLIL
            r0.LJII(r3)
            X.0EzJ r2 = r7.LLIZ
            kotlin.jvm.internal.AwS584S0100000_5 r1 = new kotlin.jvm.internal.AwS584S0100000_5
            r0 = 266(0x10a, float:3.73E-43)
            r1.<init>(r3, r0)
            r2.i3(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382610EzL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
