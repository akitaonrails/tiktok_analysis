package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S1F, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.monitor.AvatarMonitorLogger$logAvatarEvent$1", f = "AvatarMonitorLogger.kt", l = {}, m = "invokeSuspend")
public final class C0S1F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1608750rxx LL;
    public final /* synthetic */ Function1<C2344009Gk, C2344009Gk> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<EnumC1608710rxt> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0S1F(C1608750rxx c1608750rxx, Function1<? super C2344009Gk, ? extends C2344009Gk> function1, String str, List<? extends EnumC1608710rxt> list, InterfaceC1364105Vn<? super C0S1F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1608750rxx;
        this.LLILLJJLI = function1;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S1F(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        int size;
        C1C7U.LIZ("AvatarMonitorLogger@185e.logAvatarEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1608750rxx c1608750rxx = this.LL;
        if (c1608750rxx == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AvatarMonitorLogger@185e.logAvatarEvent$1");
            return unit;
        }
        List listLIZ = C0S1I.LIZ(c1608750rxx);
        C1606830rur c1606830rur = this.LL.LIZJ;
        if (this.LLILLJJLI != null) {
            C0I0B.LJFF.LIZIZ();
            String str = this.LLILLL;
            Function1<C2344009Gk, C2344009Gk> function1 = this.LLILLJJLI;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", c1606830rur.LIZIZ);
            c2344009Gk.LJIIIIZZ("enter_method", c1606830rur.LIZJ);
            List<EnumC1608710rxt> list = this.LLILZ;
            String string2 = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<EnumC1608710rxt> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getString());
                }
                string = arrayList.toString();
            } else {
                string = null;
            }
            c2344009Gk.LJIIIIZZ("avatar_node_list", string);
            List<EnumC1608710rxt> list2 = this.LLILZ;
            int size2 = 0;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            c2344009Gk.LIZJ(size, "avatar_node_list_num");
            List listLIZ2 = C0S1I.LIZ(this.LL);
            if (listLIZ2 != null) {
                string2 = listLIZ2.toString();
            }
            c2344009Gk.LJIIIIZZ("avatar_business_list", string2);
            if (listLIZ != null) {
                size2 = listLIZ.size();
            }
            c2344009Gk.LIZJ(size2, "avatar_business_num");
            C20684815ws.LJIILLIIL(str, function1.invoke(c2344009Gk).LIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AvatarMonitorLogger@185e.logAvatarEvent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
