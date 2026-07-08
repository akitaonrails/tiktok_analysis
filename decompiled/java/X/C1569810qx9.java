package X;

import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0qx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel$launchShowGuideJob$1", f = "SlideGuideViewModel.kt", l = {237}, m = "invokeSuspend")
public final class C1569810qx9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SlideGuideViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569810qx9(boolean z, long j, String str, SlideGuideViewModel slideGuideViewModel, InterfaceC1364105Vn<? super C1569810qx9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = slideGuideViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569810qx9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C1C7U.LIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
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
            if (!this.LLILLJJLI) {
                long j = this.LLILLL;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return objLJFF;
                }
            }
        }
        if (Intrinsics.LJFF(this.LLILZ, this.LLILZIL.LLJI) && !this.LLILZIL.wQ2(this.LLILZ)) {
            SlideGuideViewModel slideGuideViewModel = this.LLILZIL;
            String str = this.LLILZ;
            slideGuideViewModel.getClass();
            switch (str.hashCode()) {
                case -1965615457:
                    if (str.equals("Nearby")) {
                        num = 2131845911;
                        break;
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit;
                case -1525083535:
                    if (str.equals("Following")) {
                        num = 2131845908;
                        break;
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit2;
                case -1309089240:
                    if (str.equals("FRIENDS_FEED")) {
                        num = 2131845910;
                        break;
                    }
                    Unit unit22 = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit22;
                case 2576150:
                    if (str.equals("Shop")) {
                        num = 2131845913;
                        break;
                    }
                    Unit unit222 = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit222;
                case 2587369:
                    if (str.equals("Stem")) {
                        num = 2131848804;
                        break;
                    }
                    Unit unit2222 = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit2222;
                case 984907784:
                    if (str.equals("For You")) {
                        num = 2131845909;
                        break;
                    }
                    Unit unit22222 = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit22222;
                case 1270713017:
                    if (str.equals("Popular")) {
                        num = 2131845912;
                        break;
                    }
                    Unit unit222222 = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit222222;
                default:
                    Unit unit2222222 = Unit.LIZ;
                    C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
                    return unit2222222;
            }
            SlideGuideViewModel.vQ2(this.LLILZIL.LLILZIL, C2286608xc.LJ(num.intValue()));
            SlideGuideViewModel.vQ2(this.LLILZIL.LLIZ, true);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
            return unit3;
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LIZ("SlideGuide", "double check status, can't show!");
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SlideGuideViewModel@6464.launchShowGuideJob$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
