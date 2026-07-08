package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$removeFanSpotlight$1$2", f = "OriginMusicListViewModel.kt", l = {654, 654}, m = "invokeSuspend")
public final class C598150Nd7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OriginMusicListViewModel LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598150Nd7(OriginMusicListViewModel originMusicListViewModel, Aweme aweme, InterfaceC1364105Vn<? super C598150Nd7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = originMusicListViewModel;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598150Nd7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC598140Nd6 interfaceC598140Nd6;
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.removeFanSpotlight$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    boolean z = obj instanceof C0O79;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.removeFanSpotlight$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC736910SvR interfaceC736910SvR = (InterfaceC736910SvR) this.LLILLJJLI.LLILZLL.getValue();
            if (interfaceC736910SvR != null && (interfaceC598140Nd6 = (InterfaceC598140Nd6) interfaceC736910SvR.getOperator()) != null) {
                List listSingletonList = Collections.singletonList(this.LLILLL.getAid());
                this.LL = 1;
                obj = interfaceC598140Nd6.LLJJL(0, listSingletonList);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.removeFanSpotlight$1$2");
                    return objLJFF;
                }
            }
            obj = null;
            boolean z2 = obj instanceof C0O79;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.removeFanSpotlight$1$2");
            return unit2;
        }
        InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) obj;
        if (interfaceC346201Wa != null) {
            this.LL = 2;
            obj = C09IC.LJJIJ(interfaceC346201Wa, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.removeFanSpotlight$1$2");
                return objLJFF;
            }
        } else {
            obj = null;
        }
        boolean z22 = obj instanceof C0O79;
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.removeFanSpotlight$1$2");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
