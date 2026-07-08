package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.shipping.SeaPdpShippingMgr$openShippingPanel$1", f = "SeaPdpShippingMgr.kt", l = {55}, m = "invokeSuspend")
public final class C952703nx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C952803ny LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C952703nx(C952803ny c952803ny, Context context, String str, InterfaceC1364105Vn<? super C952703nx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c952803ny;
        this.LLILLL = context;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C952703nx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C952703nx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
