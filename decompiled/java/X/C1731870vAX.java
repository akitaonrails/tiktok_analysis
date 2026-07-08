package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.widget.ECBillboardPreviewWidget$requestRefreshBillboardsFromByteSync$1", f = "ECBillboardPreviewWidget.kt", l = {61}, m = "invokeSuspend")
public final class C1731870vAX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1732230vB7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731870vAX(C1732230vB7 c1732230vB7, InterfaceC1364105Vn<? super C1731870vAX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1732230vB7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1731870vAX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECBillboardPreviewWidget@33c3.requestRefreshBillboardsFromByteSync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1732020vAm c1732020vAm = C1732020vAm.LIZ;
            Context context = this.LLILLJJLI.LLILLL;
            String strLJJIJLIJ = AbstractC1732180vB2.LJJIJLIJ();
            C1732230vB7 c1732230vB7 = this.LLILLJJLI;
            this.LL = 1;
            c1732020vAm.getClass();
            if (C1732020vAm.LJIIIZ(context, c1732230vB7, strLJJIJLIJ, this) == objLJFF) {
                C1C7U.LIZIZ("ECBillboardPreviewWidget@33c3.requestRefreshBillboardsFromByteSync$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECBillboardPreviewWidget@33c3.requestRefreshBillboardsFromByteSync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
