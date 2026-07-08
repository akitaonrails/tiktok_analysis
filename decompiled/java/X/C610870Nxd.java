package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2$updateLayeredSkylightDiskCache$1", f = "InboxSkylightWidgetV2.kt", l = {473}, m = "invokeSuspend")
public final class C610870Nxd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C610870Nxd(List<? extends InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C610870Nxd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610870Nxd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.updateLayeredSkylightDiskCache$1");
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
            C05IL c05ilLIZJ = C614770O9j.LIZIZ.LJII().LIZJ(3);
            if (c05ilLIZJ != null) {
                List<InterfaceC1891350zJl> list = this.LLILLJJLI;
                this.LL = 1;
                if (c05ilLIZJ.LIZJ(list, this) == objLJFF) {
                    C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.updateLayeredSkylightDiskCache$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.updateLayeredSkylightDiskCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
