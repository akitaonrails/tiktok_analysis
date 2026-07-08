package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel$initFetchData$2", f = "MyMomentsSharedViewModel.kt", l = {85}, m = "invokeSuspend")
public final class C1198290hHv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MyMomentsSharedViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198290hHv(MyMomentsSharedViewModel myMomentsSharedViewModel, String str, String str2, InterfaceC1364105Vn<? super C1198290hHv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = myMomentsSharedViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1198290hHv(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZIZ;
        C1C7U.LIZ("MyMomentsSharedViewModel@7ad7.initFetchData$2");
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
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                this.LLILLJJLI.setState(AFwS256S0000000_18.get$arr$(882));
                InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(this.LLILLL);
                interfaceC1199990hKfLIZIZ.LJIJI("net_no_network");
                interfaceC1199990hKfLIZIZ.LJJIFFI();
            } else {
                C1180740gpc.LIZ.getClass();
                if (!C1180740gpc.LIZ().googleServiceEnable()) {
                    this.LLILLJJLI.setState(AFwS256S0000000_18.get$arr$(883));
                    InterfaceC1199990hKf interfaceC1199990hKfLIZIZ2 = C1200000hKg.LIZIZ(this.LLILLL);
                    interfaceC1199990hKfLIZIZ2.LJIJI("no_google_play_service");
                    interfaceC1199990hKfLIZIZ2.LJJIFFI();
                } else {
                    MyMomentsSharedViewModel myMomentsSharedViewModel = this.LLILLJJLI;
                    String str = this.LLILLL;
                    String str2 = this.LLILZ;
                    this.LL = 1;
                    if (myMomentsSharedViewModel.vQ2(str, str2, this) == objLJFF) {
                        C1C7U.LIZIZ("MyMomentsSharedViewModel@7ad7.initFetchData$2");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MyMomentsSharedViewModel@7ad7.initFetchData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
