package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09O5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMediaType$1", f = "SystemShareActivity.kt", l = {670}, m = "invokeSuspend")
public final class C09O5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SystemShareActivity LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ C09O8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09O5(SystemShareActivity systemShareActivity, Uri uri, C09O8 c09o8, InterfaceC1364105Vn<? super C09O5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = systemShareActivity;
        this.LLILLL = uri;
        this.LLILZ = c09o8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09O5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivity@a089.handleMediaType$1");
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
            C2360509Mt c2360509Mt = C2360509Mt.LIZ;
            SystemShareActivity systemShareActivity = this.LLILLJJLI;
            Uri uri = this.LLILLL;
            CreativeInfo creativeInfo = systemShareActivity.LLJILJIL;
            c2360509Mt.getClass();
            String strLJ = C2360509Mt.LJ(systemShareActivity, uri, creativeInfo, true);
            if (strLJ == null) {
                strLJ = "";
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C09O6 c09o6 = new C09O6(this.LLILLJJLI, this.LLILZ, strLJ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c09o6) == objLJFF) {
                C1C7U.LIZIZ("SystemShareActivity@a089.handleMediaType$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivity@a089.handleMediaType$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
