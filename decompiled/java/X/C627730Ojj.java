package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailModel;
import com.ss.android.ugc.aweme.creativedetail.viewmodel.CreativeToolDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ojj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creativedetail.viewmodel.CreativeToolDetailViewModel$fetchTemplateDetail$2", f = "CreativeToolDetailViewModel.kt", l = {40}, m = "invokeSuspend")
public final class C627730Ojj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreativeToolDetailViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C627730Ojj(CreativeToolDetailViewModel creativeToolDetailViewModel, boolean z, InterfaceC1364105Vn<? super C627730Ojj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creativeToolDetailViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C627730Ojj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0O3P c0o3p;
        C1C7U.LIZ("CreativeToolDetailViewModel@e6dc.fetchTemplateDetail$2");
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
            C627770Ojn c627770Ojn = InterfaceC627760Ojm.LIZ;
            CreativeToolDetailViewModel creativeToolDetailViewModel = this.LLILLJJLI;
            int i2 = creativeToolDetailViewModel.LLILLJJLI;
            String str = creativeToolDetailViewModel.LL;
            if (str != null) {
                boolean z = this.LLILLL;
                c627770Ojn.getClass();
                C0CHQ.LIZ().getApplicationService();
                C19221910Hx.LIZIZ();
                C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C627740Ojk(i2, str));
                C0O4P<CreativeToolDetailModel> value = C627770Ojn.LIZIZ.getValue();
                AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(61);
                AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(868);
                Intrinsics.LJFF(CreativeToolDetailModel.class, C627780Ojo.class);
                c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C627780Ojo.class, CreativeToolDetailModel.class)));
                if (!z) {
                    c0o3p = C0O3P.NetWhenCacheMiss;
                } else {
                    c0o3p = C0O3P.NetworkOnly;
                }
                C0O7F.LIZIZ(c613960O6gLIZIZ, c0o3p);
                InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
                AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 28);
                this.LL = 1;
                if (interfaceC346201WaLIZIZ.collect(agS290S0100000_9, this) == objLJFF) {
                    C1C7U.LIZIZ("CreativeToolDetailViewModel@e6dc.fetchTemplateDetail$2");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreativeToolDetailViewModel@e6dc.fetchTemplateDetail$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
