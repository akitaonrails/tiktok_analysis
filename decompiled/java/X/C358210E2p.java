package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.effects.filter.ui.FilterPanelComponent$initFavorite$1", f = "FilterPanelComponent.kt", l = {139}, m = "invokeSuspend")
public final class C358210E2p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C358200E2o LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358210E2p(C358200E2o c358200E2o, InterfaceC1364105Vn<? super C358210E2p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c358200E2o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C358210E2p(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "FilterPanelComponent@e5a1.initFavorite$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L46
            X.C155000ia.LIZIZ(r6)
            X.00o6 r6 = (X.C189200o6) r6
            java.lang.Object r0 = r6.m10unboximpl()
        L19:
            X.C189200o6.m1boximpl(r0)
        L1c:
            X.0E2o r0 = r5.LLILLJJLI
            X.0E2n r0 = r0.S5()
            if (r0 == 0) goto L27
            r0.nV()
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r6)
            X.0E2o r0 = r5.LLILLJJLI
            X.0EEl r1 = r0.R5()
            if (r1 == 0) goto L1c
            r5.LL = r2
            java.lang.String r0 = "filtercomposer"
            java.lang.Object r0 = r1.SS0(r0, r2, r5)
            if (r0 != r3) goto L19
            X.C1C7U.LIZIZ(r4)
            return r3
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358210E2p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
