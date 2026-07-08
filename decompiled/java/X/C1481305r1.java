package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05r1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo$fetchUser$2", f = "IMUserRepo.kt", l = {320, 328, 333, 358, 359}, m = "invokeSuspend")
public final class C1481305r1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1BGR LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1480505qt LLILZLL;
    public final /* synthetic */ IMUser LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1481305r1(C1BGR c1bgr, String str, String str2, InterfaceC1480505qt interfaceC1480505qt, IMUser iMUser, String str3, InterfaceC1364105Vn<? super C1481305r1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1bgr;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC1480505qt;
        this.LLIZ = iMUser;
        this.LLIZLLLIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1481305r1(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b0, code lost:
    
        if (X.C23250099c.LJI(r12, r2, r1) != r5) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1481305r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
