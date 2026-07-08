package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel$requestAlbumData$1$2", f = "PoiAlbumViewModel.kt", l = {76}, m = "invokeSuspend")
public final class C1186490gyt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiAlbumViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1186490gyt(PoiAlbumViewModel poiAlbumViewModel, InterfaceC1364105Vn<? super C1186490gyt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiAlbumViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1186490gyt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiAlbumViewModel@897e.requestAlbumData$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                System.currentTimeMillis();
                InterfaceC1186180gyO interfaceC1186180gyO = (InterfaceC1186180gyO) this.LLILLJJLI.LL.getValue().getOperator();
                PoiAlbumViewModel poiAlbumViewModel = this.LLILLJJLI;
                String str = poiAlbumViewModel.LLILLJJLI;
                if (str == null) {
                    str = "";
                }
                C1185410gx9 c1185410gx9 = poiAlbumViewModel.LLIZLLLIL;
                this.LL = 1;
                obj = interfaceC1186180gyO.LLII(str, c1185410gx9, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiAlbumViewModel@897e.requestAlbumData$1$2");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.setState(new AwS597S0100000_18((PoiAlbumPageApi.PoiAlbumResponse) obj, 228));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.setState(new AwS597S0100000_18(th, 229));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiAlbumViewModel@897e.requestAlbumData$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
