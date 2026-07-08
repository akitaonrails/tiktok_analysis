package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailPreloadManager$triggerPreloadWhenAnchorShow$1$5", f = "PoiDetailPreloadManager.kt", l = {195}, m = "invokeSuspend")
public final class C13006057c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiAnchorExtra LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13006057c(PoiAnchorExtra poiAnchorExtra, String str, Aweme aweme, InterfaceC1364105Vn<? super C13006057c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiAnchorExtra;
        this.LLILLL = str;
        this.LLILZ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13006057c(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorShow$1$5");
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
            String str = this.LLILLJJLI.collectInfo;
            if (str == null) {
                str = "";
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C13004057a c13004057a = new C13004057a(str, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c13004057a);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorShow$1$5");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C1188750h2X c1188750h2X = C1188750h2X.LIZ;
            String str2 = this.LLILLL;
            Aweme aweme = this.LLILZ;
            c1188750h2X.getClass();
            C1188750h2X.LJFF(aweme, str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorShow$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
