package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HOG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$onViewCreated$27$1$1$1$3", f = "MixStudioHomePageAssem.kt", l = {1191}, m = "invokeSuspend")
public final class C0HOG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioHomePageAssem LLILLJJLI;
    public final /* synthetic */ C0HOM<? extends List<C440440HOw>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOG(MixStudioHomePageAssem mixStudioHomePageAssem, C0HOM<? extends List<C440440HOw>> c0hom, InterfaceC1364105Vn<? super C0HOG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioHomePageAssem;
        this.LLILLL = c0hom;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HOG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return invoke2(interfaceC497601wk, (InterfaceC1364105Vn<Object>) interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$3");
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
            int i2 = 0;
            boolean z = false;
            i2 = 0;
            if (C0H6Q.LIZ()) {
                C0HPU c0hpu = this.LLILLJJLI.LLLF;
                if (c0hpu != null) {
                    C0HOM<? extends List<C440440HOw>> c0hom = this.LLILLL;
                    if ((c0hom instanceof C1372405Ys) || (c0hom instanceof C0HKV)) {
                        z = true;
                    }
                    this.LL = 1;
                    c0hpu.LLJIJIL.setValue(Boolean.valueOf(z));
                    Unit unit = Unit.LIZ;
                    C099R.LJFF();
                    if (unit == objLJFF) {
                        C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$3");
                        return objLJFF;
                    }
                }
            } else {
                MixStudioHomePageAssem mixStudioHomePageAssem = this.LLILLJJLI;
                ConstraintLayout constraintLayout = mixStudioHomePageAssem.LLLFZ;
                View view = constraintLayout;
                if (constraintLayout == null) {
                    FrameLayout frameLayout = mixStudioHomePageAssem.LLLI;
                    view = frameLayout;
                    if (frameLayout != null) {
                    }
                    C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$3");
                    return obj2;
                }
                C0HOM<? extends List<C440440HOw>> c0hom2 = this.LLILLL;
                if (!(c0hom2 instanceof C1372405Ys) && !(c0hom2 instanceof C0HKV)) {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view);
                obj2 = view;
                C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$3");
                return obj2;
            }
            obj2 = null;
            C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$3");
            return obj2;
        }
        obj2 = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.onViewCreated$27$1$1$1$3");
        return obj2;
    }
}
