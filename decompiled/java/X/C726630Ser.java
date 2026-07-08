package X;

import Y.AgS292S0100000_11;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeCacheViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import njp.a;

/* JADX INFO: renamed from: X.0Ser, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeCacheViewModel$getLandscapeCache$1", f = "LandscapeCacheViewModel.kt", l = {47, 47}, m = "invokeSuspend")
public final class C726630Ser extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LandscapeCacheViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ LandscapeCacheViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C726630Ser(LandscapeCacheViewModel landscapeCacheViewModel, InterfaceC1364105Vn<? super C726630Ser> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = landscapeCacheViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C726630Ser(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LandscapeCacheViewModel landscapeCacheViewModel;
        C1C7U.LIZ("LandscapeCacheViewModel@1fb.getLandscapeCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLL.setState(new AwS590S0100000_11(e, 431));
            }
        } catch (C0XIR e2) {
            e = e2;
        } catch (Exception e3) {
            e = e3;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    landscapeCacheViewModel = this.LL;
                    try {
                        C155000ia.LIZIZ(obj);
                    } catch (C0XIR e4) {
                        e = e4;
                        TryCatchGuardChecker.doCheck(e);
                        landscapeCacheViewModel.setState(new AwS590S0100000_11(e, 429));
                    } catch (Exception e5) {
                        e = e5;
                        TryCatchGuardChecker.doCheck(e);
                        landscapeCacheViewModel.setState(new AwS590S0100000_11(e, 430));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LandscapeCacheViewModel@1fb.getLandscapeCache$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            landscapeCacheViewModel = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Pair pairLIZ = C0CU4.LIZ();
            landscapeCacheViewModel = this.LLILLL;
            List list = (List) pairLIZ.getFirst();
            String str = (String) pairLIZ.getSecond();
            if (str != null) {
                landscapeCacheViewModel.setState(new AwS62S1000000_11(str, 9));
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("LandscapeCacheViewModel@1fb.getLandscapeCache$1");
                return unit2;
            }
            C726650Set c726650Set = ((C726640Ses) landscapeCacheViewModel.LL.getValue()).LL;
            this.LL = landscapeCacheViewModel;
            this.LLILLJJLI = 1;
            c726650Set.getClass();
            obj = new C095D(new C329390Cvh(list, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LandscapeCacheViewModel@1fb.getLandscapeCache$1");
                return objLJFF;
            }
        }
        AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(landscapeCacheViewModel, 27);
        this.LL = landscapeCacheViewModel;
        this.LLILLJJLI = 2;
        if (((InterfaceC346201Wa) obj).collect(agS292S0100000_11, this) == objLJFF) {
            C1C7U.LIZIZ("LandscapeCacheViewModel@1fb.getLandscapeCache$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("LandscapeCacheViewModel@1fb.getLandscapeCache$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
