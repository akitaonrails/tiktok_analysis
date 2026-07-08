package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.systemshare.SystemShareViewModel$loadView$1$1$1", f = "SystemShareViewModel.kt", l = {}, m = "invokeSuspend")
public final class C09OE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ SystemShareViewModel LLILLL;
    public final /* synthetic */ List<EnumC1850560yFy> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09OE(C19EG c19eg, Uri uri, SystemShareViewModel systemShareViewModel, List<? extends EnumC1850560yFy> list, InterfaceC1364105Vn<? super C09OE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = uri;
        this.LLILLL = systemShareViewModel;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareViewModel@28df.loadView$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2360509Mt c2360509Mt = C2360509Mt.LIZ;
        C19EG c19eg = this.LL;
        Uri uri = this.LLILLJJLI;
        CreativeInfo creativeInfo = this.LLILLL.LLIZ;
        c2360509Mt.getClass();
        String strLJ = C2360509Mt.LJ(c19eg, uri, creativeInfo, false);
        if (strLJ == null) {
            strLJ = "";
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Uri path: ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        SystemShareViewModel systemShareViewModel = this.LLILLL;
        systemShareViewModel.LLJILLL.postValue(new C12MX(this.LLILZ, strLJ, null, null, null, null, systemShareViewModel.LLIZ, 60));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareViewModel@28df.loadView$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
