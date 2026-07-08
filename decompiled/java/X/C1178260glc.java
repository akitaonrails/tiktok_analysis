package X;

import com.ss.android.ugc.aweme.poi.quiz.map.PoiQuizMapClusterPicLoader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS632S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0glc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.quiz.map.PoiQuizMapClusterPicLoader$loadPic$job$1", f = "PoiQuizMapClusterPicLoader.kt", l = {}, m = "invokeSuspend")
public final class C1178260glc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1178200glW> LL;
    public final /* synthetic */ PoiQuizMapClusterPicLoader LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178260glc(List<C1178200glW> list, PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader, InterfaceC1364105Vn<? super C1178260glc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = poiQuizMapClusterPicLoader;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1178260glc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiQuizMapClusterPicLoader@cbe3.loadPic$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1178200glW> list = this.LL;
        PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader = this.LLILLJJLI;
        for (C1178200glW c1178200glW : list) {
            if (!c1178200glW.LJI || c1178200glW.LIZIZ == null) {
                AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(poiQuizMapClusterPicLoader, 263);
                poiQuizMapClusterPicLoader.getClass();
                PoiQuizMapClusterPicLoader.LIZ(c1178200glW, awS632S0100000_18);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiQuizMapClusterPicLoader@cbe3.loadPic$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
