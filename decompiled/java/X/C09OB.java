package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.share.SystemShareActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivityViewModel$handleSingleMediaSystemShare$1$1", f = "SystemShareActivityViewModel.kt", l = {197}, m = "invokeSuspend")
public final class C09OB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SystemShareActivityViewModel LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OB(SystemShareActivityViewModel systemShareActivityViewModel, Uri uri, InterfaceC1364105Vn<? super C09OB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = systemShareActivityViewModel;
        this.LLILLL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1");
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
            C19EG c19eg = this.LLILLJJLI.vQ2().get();
            if (c19eg != null) {
                Uri uri = this.LLILLL;
                SystemShareActivityViewModel systemShareActivityViewModel = this.LLILLJJLI;
                C19EG c19eg2 = c19eg;
                C2360509Mt c2360509Mt = C2360509Mt.LIZ;
                CreativeInfo creativeInfo = systemShareActivityViewModel.LLIZ;
                c2360509Mt.getClass();
                String strLJ = C2360509Mt.LJ(c19eg2, uri, creativeInfo, false);
                if (strLJ == null) {
                    strLJ = "";
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1B4C c1b4c = new C1B4C(c19eg2, strLJ, systemShareActivityViewModel, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1b4c) == objLJFF) {
                    C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
