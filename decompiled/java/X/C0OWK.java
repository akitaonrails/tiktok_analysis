package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OWK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem$initOriginalLogic$1$draft$1", f = "BulletinEditAssem.kt", l = {}, m = "invokeSuspend")
public final class C0OWK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ BulletinEditAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OWK(BulletinEditAssem bulletinEditAssem, InterfaceC1364105Vn<? super C0OWK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEditAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OWK(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "BulletinEditAssem@b1d1.initOriginalLogic$1$draft$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r5.LL
            X.0OWL r0 = r0.mp()
            r3 = 0
            if (r0 == 0) goto L75
            java.lang.String r1 = r0.LLILZLL
        L16:
            X.0OO9 r0 = X.C0OO9.WRITE_BUTTON
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r5.LL
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel r0 = r0.op()
            java.lang.String r2 = r0.wQ2()
        L2c:
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r5.LL
            X.0OWL r0 = r0.mp()
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.LLILZ
            if (r0 == 0) goto L50
            int r0 = r0.length()
            if (r0 <= 0) goto L50
        L3e:
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r5.LL
            X.0OWL r0 = r0.mp()
            if (r0 == 0) goto L4a
            java.lang.String r2 = r0.LLILZ
            if (r2 != 0) goto L4c
        L4a:
            java.lang.String r2 = ""
        L4c:
            X.C1C7U.LIZIZ(r4)
            return r2
        L50:
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r5.LL
            X.0OWL r0 = r0.mp()
            if (r0 == 0) goto L71
            java.lang.String r1 = r0.LLILZIL
        L5a:
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r5.LL
            X.0OWL r0 = r0.mp()
            if (r0 == 0) goto L6a
            kotlin.Pair<java.lang.String, java.lang.String> r0 = r0.LLJ
            if (r0 == 0) goto L6a
            java.lang.Object r3 = r0.getSecond()
        L6a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 != 0) goto L4c
            goto L3e
        L71:
            r1 = r3
            goto L5a
        L73:
            r2 = r3
            goto L2c
        L75:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OWK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
