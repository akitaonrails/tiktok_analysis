package X;

import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel$setCurTopTabList$1", f = "SlideGuideViewModel.kt", l = {}, m = "invokeSuspend")
public final class C496801wc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<InterfaceC1583870rJp> LL;
    public final /* synthetic */ SlideGuideViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C496801wc(List<? extends InterfaceC1583870rJp> list, SlideGuideViewModel slideGuideViewModel, InterfaceC1364105Vn<? super C496801wc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = slideGuideViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496801wc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlideGuideViewModel@6464.setCurTopTabList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLLIIII = C13LP.LLIIII(this.LL);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1583870rJp) it2.next()).tag());
        }
        ((ArrayList) this.LLILLJJLI.LLJJI).clear();
        ((ArrayList) this.LLILLJJLI.LLJJI).addAll(arrayList);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlideGuideViewModel@6464.setCurTopTabList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
