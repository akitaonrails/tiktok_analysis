package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.views.GreetingCardPopupView$setAlphaPlayerPlayingUI$1", f = "GreetingCardPopupView.kt", l = {487, 488}, m = "invokeSuspend")
public final class C910350ZnV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GreetingCardViewModel LLILLJJLI;
    public final /* synthetic */ C910370ZnX LLILLL;
    public final /* synthetic */ EnumC910390ZnZ LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ List<C909870Zmj> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910350ZnV(GreetingCardViewModel greetingCardViewModel, C910370ZnX c910370ZnX, EnumC910390ZnZ enumC910390ZnZ, Fragment fragment, Function0<Unit> function0, Function0<Unit> function02, List<C909870Zmj> list, boolean z, InterfaceC1364105Vn<? super C910350ZnV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = greetingCardViewModel;
        this.LLILLL = c910370ZnX;
        this.LLILZ = enumC910390ZnZ;
        this.LLILZIL = fragment;
        this.LLILZLL = function0;
        this.LLIZ = function02;
        this.LLIZLLLIL = list;
        this.LLJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910350ZnV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GreetingCardPopupView@4419.setAlphaPlayerPlayingUI$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    GreetingCardViewModel greetingCardViewModel = this.LLILLJJLI;
                    String str = this.LLILLL.LLJJIJI;
                    greetingCardViewModel.getClass();
                    this.LLILLL.LJ(GreetingCardViewModel.wQ2(str));
                    DataSource dataSource = (DataSource) ((LinkedHashMap) this.LLILLL.LLJJIJIIJIL).get(this.LLILZ);
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILZIL);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C910360ZnW(dataSource, this.LLILLL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, null), 2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GreetingCardPopupView@4419.setAlphaPlayerPlayingUI$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            GreetingCardViewModel greetingCardViewModel2 = this.LLILLJJLI;
            String str2 = this.LLILLL.LLJJIJI;
            String jsonPath = this.LLILZ.getJsonPath();
            this.LL = 1;
            if (greetingCardViewModel2.vQ2(str2, jsonPath, this) == objLJFF) {
                C1C7U.LIZIZ("GreetingCardPopupView@4419.setAlphaPlayerPlayingUI$1");
                return objLJFF;
            }
        }
        GreetingCardViewModel greetingCardViewModel3 = this.LLILLJJLI;
        String str3 = this.LLILLL.LLJJIJI;
        String videoPath = this.LLILZ.getVideoPath();
        this.LL = 2;
        if (greetingCardViewModel3.vQ2(str3, videoPath, this) == objLJFF) {
            C1C7U.LIZIZ("GreetingCardPopupView@4419.setAlphaPlayerPlayingUI$1");
            return objLJFF;
        }
        GreetingCardViewModel greetingCardViewModel4 = this.LLILLJJLI;
        String str4 = this.LLILLL.LLJJIJI;
        greetingCardViewModel4.getClass();
        this.LLILLL.LJ(GreetingCardViewModel.wQ2(str4));
        DataSource dataSource2 = (DataSource) ((LinkedHashMap) this.LLILLL.LLJJIJIIJIL).get(this.LLILZ);
        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this.LLILZIL);
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope2, C2107308Nj.LIZ, null, new C910360ZnW(dataSource2, this.LLILLL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardPopupView@4419.setAlphaPlayerPlayingUI$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
