package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.preview.EPAIGCPreviewMediator$3$1$1$1", f = "EPAIGCPreviewMediator.kt", l = {123}, m = "invokeSuspend")
public final class C383090F0h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C379170Etn> LLILLJJLI;
    public final /* synthetic */ C383070F0f LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C383090F0h(List<C379170Etn> list, C383070F0f c383070F0f, List<String> list2, int i, InterfaceC1364105Vn<? super C383090F0h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c383070F0f;
        this.LLILZ = list2;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C383090F0h(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "EPAIGCPreviewMediator@1518.<init>$3$1$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 != r3) goto L88
            X.C155000ia.LIZIZ(r7)
        L13:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L19
        L17:
            X.13BV r7 = X.C13BV.INSTANCE
        L19:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L3c
            X.0F0f r0 = r6.LLILLL
            X.0F0v r1 = r0.LJIIL
            int r0 = r6.LLILZIL
            r1.LIZIZ(r0, r7)
            X.0EsV r2 = X.C378370EsV.LIZ
            X.0F0q r1 = new X.AbstractC383190F0r() { // from class: X.0F0q
                static {
                    /*
                        X.0F0q r0 = new X.0F0q
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0F0q) X.0F0q.LIZIZ X.0F0q
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C383180F0q.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        java.lang.String r0 = "show"
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C383180F0q.<init>():void");
                }
            }
            int r0 = r6.LLILZIL
            r2.getClass()
            X.C378370EsV.LIZLLL(r1, r0)
        L36:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L3c:
            X.0F0f r0 = r6.LLILLL
            X.0F0v r2 = r0.LJIIL
            X.13BV r1 = X.C13BV.INSTANCE
            int r0 = r6.LLILZIL
            r2.LIZIZ(r0, r1)
            goto L36
        L48:
            X.C155000ia.LIZIZ(r7)
            java.util.List<X.0Etn> r0 = r6.LLILLJJLI
            boolean r0 = r0.isEmpty()
            r2 = r0 ^ 1
            X.0F0f r1 = r6.LLILLL
            boolean r0 = r1.LJIILIIL
            r0 = r0 ^ 1
            r2 = r2 & r0
            if (r2 == 0) goto L79
            X.0F0v r0 = r1.LJIIL
            X.0F0s r0 = r0.LJFF
            r0.LLILZ = r3
            r0.notifyDataSetChanged()
            X.0F0f r0 = r6.LLILLL
            X.0F0p r1 = r0.LJ
            if (r1 == 0) goto L17
            java.util.List<java.lang.String> r0 = r6.LLILZ
            r6.LL = r3
            java.lang.Object r7 = r1.LIZIZ(r0, r6)
            if (r7 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L79:
            X.0F0v r2 = r1.LJIIL
            X.0EzU r0 = r1.LJIILJJIL
            X.0EzZ r1 = r0.LIZ
            X.0EzZ r0 = X.EnumC382750EzZ.VIDEO
            if (r1 == r0) goto L84
            r3 = 0
        L84:
            r2.LIZ(r3)
            goto L36
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C383090F0h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
