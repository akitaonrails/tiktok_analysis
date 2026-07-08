package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem$onViewCreated$1$1$afterTextChanged$1", f = "BulletinEditAssem.kt", l = {500}, m = "invokeSuspend")
public final class C1532205zE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinEditAssem LLILLJJLI;
    public final /* synthetic */ Editable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532205zE(BulletinEditAssem bulletinEditAssem, Editable editable, InterfaceC1364105Vn<? super C1532205zE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinEditAssem;
        this.LLILLL = editable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1532205zE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "BulletinEditAssem@b1d1.onViewCreated$1$1$afterTextChanged$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 1
            if (r0 == 0) goto L89
            if (r0 != r4) goto L9a
            X.C155000ia.LIZIZ(r9)
        L13:
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r8.LLILLJJLI
            X.0Q7z r1 = X.C1558520qew.LJIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditEventGamePlayAbility> r0 = com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditEventGamePlayAbility.class
            r2 = 0
            X.01wD r6 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditEventGamePlayAbility r6 = (com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditEventGamePlayAbility) r6
            if (r6 == 0) goto L5c
            android.text.Editable r0 = r8.LLILLL
            if (r0 == 0) goto L2c
            java.lang.String r2 = r0.toString()
        L2c:
            com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem r0 = r8.LLILLJJLI
            java.util.List<java.lang.String> r1 = r0.LLJLIL
            r5 = 0
            if (r2 == 0) goto L59
            int r0 = r2.length()
            if (r0 == 0) goto L57
            if (r1 == 0) goto L57
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L57
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L62
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L62
        L57:
            r4 = 0
        L58:
            r5 = r4
        L59:
            r6.fD(r5)
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L62:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r2 = r1.iterator()
        L68:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L68
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L68
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r5)
            if (r0 == 0) goto L68
            goto L58
        L89:
            X.C155000ia.LIZIZ(r9)
            r8.LL = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r2) goto L13
            X.C1C7U.LIZIZ(r7)
            return r2
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532205zE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
