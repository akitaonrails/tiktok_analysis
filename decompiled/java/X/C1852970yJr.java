package X;

import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS110S1200000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel$loadPhotos$1$1", f = "TakoMenuWindowViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1852970yJr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoMenuWindowViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852970yJr(TakoMenuWindowViewModel takoMenuWindowViewModel, InterfaceC1364105Vn<? super C1852970yJr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoMenuWindowViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1852970yJr(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoMenuWindowViewModel@a05a.loadPhotos$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoMenuWindowViewModel takoMenuWindowViewModel = this.LL;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.LL.LLJIJIL.getValue();
        takoMenuWindowViewModel.getClass();
        takoMenuWindowViewModel.withState(new AwS110S1200000_27((List) arrayList, (List<TikTokMediaModel>) takoMenuWindowViewModel, (TakoMenuWindowViewModel) str, (String) 10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMenuWindowViewModel@a05a.loadPhotos$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
