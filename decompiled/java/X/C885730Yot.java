package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestBatchActionHandler$batchDelete$1", f = "MessageRequestBatchActionHandler.kt", l = {90}, m = "invokeSuspend")
public final class C885730Yot extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C885760Yow LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885730Yot(C885760Yow c885760Yow, boolean z, InterfaceC1364105Vn<? super C885730Yot> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c885760Yow;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885730Yot(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJIIIZ;
        String str;
        C1C7U.LIZ("MessageRequestBatchActionHandler@3f1f.batchDelete$1");
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
            List<String> listLJI = this.LLILLJJLI.LIZ.LJI(this.LLILLL);
            if (listLJI.isEmpty()) {
                this.LLILLJJLI.LIZ.Ka("");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.batchDelete$1");
                return unit;
            }
            if (this.LLILLJJLI.LIZ.LJII()) {
                zLJIIIZ = this.LLILLJJLI.LIZ.LJIIIZ();
            } else {
                zLJIIIZ = this.LLILLL;
            }
            if (zLJIIIZ) {
                str = "delete_all";
            } else {
                str = "delete_selected";
            }
            C885310YoD.LIZ.LJ(listLJI.size(), this.LLILLJJLI.LIZ.LIZIZ(), "direct_click", str, this.LLILLJJLI.LIZ.LIZLLL());
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C885740You c885740You = new C885740You(this.LLILLJJLI, zLJIIIZ, listLJI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c885740You) == objLJFF) {
                C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.batchDelete$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.batchDelete$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
