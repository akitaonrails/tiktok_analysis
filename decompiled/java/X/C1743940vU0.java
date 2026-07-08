package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel$fetchData$1", f = "ECLivePlaybackViewModel.kt", l = {167}, m = "invokeSuspend")
public final class C1743940vU0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ ECLivePlaybackViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743940vU0(Context context, ECLivePlaybackViewModel eCLivePlaybackViewModel, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, InterfaceC1364105Vn<? super C1743940vU0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = eCLivePlaybackViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = z;
        this.LLJI = str6;
        this.LLJIJIL = str7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1743940vU0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECLivePlaybackViewModel@3fb6.fetchData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
                Context context = this.LLILLJJLI;
                c1519805xE.getClass();
                if (!C0XF1.LIZLLL(context)) {
                    this.LLILLL.LLILZLL.LIZLLL = "network";
                    this.LLILLL.LLILZLL.LJ = C2286608xc.LJ(-1001);
                    this.LLILLL.LLILZLL.LJFF = "no network when fetchData ";
                    this.LLILLL.setState(AFwS268S0000000_26.get$arr$(625));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ECLivePlaybackViewModel@3fb6.fetchData$1");
                    return unit;
                }
                this.LLILLL.setState(AFwS268S0000000_26.get$arr$(626));
                C1DFB c1dfb = C0PEM.LIZJ;
                C1744010vU7 c1744010vU7 = new C1744010vU7(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLILLL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c1dfb, c1744010vU7) == objLJFF) {
                    C1C7U.LIZIZ("ECLivePlaybackViewModel@3fb6.fetchData$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LLILZLL.LIZLLL = "network";
            this.LLILLL.LLILZLL.LJ = C2286608xc.LJ(C386801es.DEFAULT);
            this.LLILLL.LLILZLL.LJFF = e.getMessage();
            this.LLILLL.setState(AFwS268S0000000_26.get$arr$(627));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECLivePlaybackViewModel@3fb6.fetchData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
