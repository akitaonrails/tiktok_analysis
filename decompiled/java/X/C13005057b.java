package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailPreloadManager$triggerPreloadWhenAnchorTouch$1", f = "PoiDetailPreloadManager.kt", l = {124}, m = "invokeSuspend")
public final class C13005057b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13005057b(Long l, String str, Aweme aweme, String str2, String str3, InterfaceC1364105Vn<? super C13005057b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13005057b(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorTouch$1");
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
            Long l = this.LLILLJJLI;
            if (l != null && l.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                l = null;
            }
            if (l != null) {
                long jLongValue = l.longValue();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorTouch$1");
                    return objLJFF;
                }
            }
        }
        try {
            C1188750h2X c1188750h2X = C1188750h2X.LIZ;
            String str = this.LLILLL;
            Aweme aweme = this.LLILZ;
            String str2 = this.LLILZIL;
            c1188750h2X.getClass();
            C1188750h2X.LJI(aweme, str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1188750h2X.LIZLLL.remove(this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorTouch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
