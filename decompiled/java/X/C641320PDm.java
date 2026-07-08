package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel$applyActiveStatusWhole$2", f = "SkylightListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C641320PDm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SkylightListViewModel LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C641320PDm(SkylightListViewModel skylightListViewModel, List<? extends InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C641320PDm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = skylightListViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C641320PDm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "SkylightListViewModel@8bc2.applyActiveStatusWhole$2"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel r6 = r8.LL
            java.util.List<X.0zJl> r4 = r8.LLILLJJLI
            X.15jv r5 = r6.LLJJIJI
            r3 = 0
            if (r5 == 0) goto L6c
            boolean r1 = r5.isComputingLayout()
            r0 = 1
            if (r1 != r0) goto L6c
        L1b:
            r2 = 0
            if (r0 == 0) goto L5e
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "safeMutateListAlways: defer during layout, reason="
            r1.append(r0)
            java.lang.String r0 = "activeStatus-whole"
            r1.append(r0)
            java.lang.String r0 = ", vh="
            r1.append(r0)
            int r0 = r6.LLJILLL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SkylightListViewModel"
            X.C1720106oR.LJI(r0, r1)
            Y.ARunnableS79S0200000_10 r1 = new Y.ARunnableS79S0200000_10
            r0 = 91
            r1.<init>(r6, r4, r0)
            boolean r0 = com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r5, r1)
            java.lang.Boolean.valueOf(r0)
        L4f:
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel r0 = r8.LL
            X.15jv r0 = r0.LLJJIJI
            if (r0 == 0) goto L5a
            r0.scrollToPosition(r3)
            kotlin.Unit r2 = kotlin.Unit.LIZ
        L5a:
            X.C1C7U.LIZIZ(r7)
            return r2
        L5e:
            X.15jv r0 = r6.LLJJIJI
            if (r0 == 0) goto L4f
            X.15jK r0 = r0.getState()
            if (r0 == 0) goto L4f
            r0.LJIILL(r4, r2)
            goto L4f
        L6c:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C641320PDm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
