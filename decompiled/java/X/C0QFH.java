package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.entry.searchbox.repo.SearchBoxTimeData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QFH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.entry.searchbox.viewmodel.SearchBoxFYPViewModel$showSearchBox$2", f = "SearchBoxFYPViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0QFH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0QFH(InterfaceC1364105Vn<? super C0QFH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QFH(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchBoxFYPViewModel@d825.showSearchBox$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C04SL.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SearchBoxTimeData searchBoxTimeDataLIZ = C0QFI.LIZ();
        ArrayList arrayList = new ArrayList(searchBoxTimeDataLIZ.showedTime);
        arrayList.add(Long.valueOf(jCurrentTimeMillis));
        C08XD.LJIL(arrayList);
        ((Keva) C0QFI.LIZ.getValue()).storeString("showed_time", GsonProtectorUtils.toJson((Gson) C0QFI.LIZIZ.getValue(), new SearchBoxTimeData(C13LP.LLD(C04SL.LIZ, arrayList), searchBoxTimeDataLIZ.clickedTime)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchBoxFYPViewModel@d825.showSearchBox$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0QFH(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
