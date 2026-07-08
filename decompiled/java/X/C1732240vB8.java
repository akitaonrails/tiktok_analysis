package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.widget.ECBillboardPreviewWidget$onSlotCreated$1", f = "ECBillboardPreviewWidget.kt", l = {44}, m = "invokeSuspend")
public final class C1732240vB8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1732230vB7 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732240vB8(C1732230vB7 c1732230vB7, String str, InterfaceC1364105Vn<? super C1732240vB8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1732230vB7;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1732240vB8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECBillboardPreviewWidget@33c3.onSlotCreated$1");
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
            C1732230vB7 c1732230vB7 = this.LLILLJJLI;
            Context context = c1732230vB7.LLILLL;
            String str = this.LLILLL;
            this.LL = 1;
            c1732020vAm.getClass();
            if (C1732020vAm.LJIIIZ(context, c1732230vB7, str, this) == objLJFF) {
                C1C7U.LIZIZ("ECBillboardPreviewWidget@33c3.onSlotCreated$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLJJIII = new C1732260vBA(new WeakReference(this.LLILLJJLI.LLILLL), this.LLILLL, new WeakReference(this.LLILLJJLI));
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY_NEW, new C1732250vB9(this.LLILLL, new WeakReference(this.LLILLJJLI)));
        C1732260vBA c1732260vBA = this.LLILLJJLI.LLJJIII;
        if (c1732260vBA != null) {
            C596950NbB.LIZ(c1732260vBA);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECBillboardPreviewWidget@33c3.onSlotCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
