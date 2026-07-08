package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryViewModel$processIntent$2", f = "AiSummaryViewModel.kt", l = {38, 41, 46, 49}, m = "invokeSuspend")
public final class C1812700xGu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AbstractC1812500xGa LLILZ;
    public final /* synthetic */ AiSummaryViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812700xGu(AbstractC1812500xGa abstractC1812500xGa, AiSummaryViewModel aiSummaryViewModel, InterfaceC1364105Vn<? super C1812700xGu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = abstractC1812500xGa;
        this.LLILZIL = aiSummaryViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1812700xGu(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1812700xGu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
