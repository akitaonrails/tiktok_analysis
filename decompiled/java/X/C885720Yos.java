package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestBatchActionHandler$batchMarkAsRead$1", f = "MessageRequestBatchActionHandler.kt", l = {}, m = "invokeSuspend")
public final class C885720Yos extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C885760Yow LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885720Yos(C885760Yow c885760Yow, boolean z, InterfaceC1364105Vn<? super C885720Yos> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c885760Yow;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885720Yos(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJIIIZ;
        String str;
        C1C7U.LIZ("MessageRequestBatchActionHandler@3f1f.batchMarkAsRead$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> listLJI = this.LL.LIZ.LJI(this.LLILLJJLI);
        if (listLJI.isEmpty()) {
            this.LL.LIZ.Ka("");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.batchMarkAsRead$1");
            return unit;
        }
        if (this.LL.LIZ.LJII()) {
            zLJIIIZ = this.LL.LIZ.LJIIIZ();
        } else {
            zLJIIIZ = this.LLILLJJLI;
        }
        this.LL.LJ("");
        C0YUD c0yudLIZJ = this.LL.LIZ.LIZJ();
        if (c0yudLIZJ != null) {
            c0yudLIZJ.LIZIZ(listLJI);
        }
        if (zLJIIIZ) {
            str = "read_all";
        } else {
            str = "read_selected";
        }
        C885310YoD.LIZ.LJ(listLJI.size(), this.LL.LIZ.LIZIZ(), "direct_click", str, this.LL.LIZ.LIZLLL());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestBatchActionHandler@3f1f.batchMarkAsRead$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
