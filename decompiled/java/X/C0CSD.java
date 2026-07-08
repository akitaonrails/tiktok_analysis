package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8FakeAutoplayMobAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8FakeAutoplayMobAssem$startPlay$2", f = "Lemon8FakeAutoplayMobAssem.kt", l = {122}, m = "invokeSuspend")
public final class C0CSD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Lemon8FakeAutoplayMobAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CSD(Lemon8FakeAutoplayMobAssem lemon8FakeAutoplayMobAssem, InterfaceC1364105Vn<? super C0CSD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lemon8FakeAutoplayMobAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[LOOP:0: B:7:0x001d->B:9:0x0023, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:6:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "Lemon8FakeAutoplayMobAssem@6e2f.startPlay$2"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L3e
            X.C155000ia.LIZIZ(r6)
        L13:
            com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8FakeAutoplayMobAssem r0 = r5.LLILLJJLI
            java.util.List<X.0CSE> r0 = r0.LLJJLIIIJLLLLLLLZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            X.0CSE r0 = (X.C0CSE) r0
            r0.LJJLIIIJ()
            goto L1d
        L2d:
            X.C155000ia.LIZIZ(r6)
        L30:
            r5.LL = r2
            r0 = 1700(0x6a4, double:8.4E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CSD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
