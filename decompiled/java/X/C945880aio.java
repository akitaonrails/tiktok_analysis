package X;

import Y.AgS296S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0aio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment$initViewModel$1", f = "AigcWallpaperGuestEditFragment.kt", l = {426}, m = "invokeSuspend")
public final class C945880aio extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AigcWallpaperGuestEditFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C945880aio(AigcWallpaperGuestEditFragment aigcWallpaperGuestEditFragment, InterfaceC1364105Vn<? super C945880aio> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aigcWallpaperGuestEditFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C945880aio(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0950 anonymousClass0950;
        C1C7U.LIZ("AigcWallpaperGuestEditFragment@1500.initViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AigcWallpaperGuestEditFragment aigcWallpaperGuestEditFragment = this.LLILLJJLI;
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = aigcWallpaperGuestEditFragment.LLJ;
            if (aigcWallpaperGuestViewModel != null && (anonymousClass0950 = aigcWallpaperGuestViewModel.LLILLL) != null) {
                AgS296S0100000_15 agS296S0100000_15 = new AgS296S0100000_15(aigcWallpaperGuestEditFragment, 2);
                this.LL = 1;
                if (anonymousClass0950.collect(agS296S0100000_15, this) == objLJFF) {
                    C1C7U.LIZIZ("AigcWallpaperGuestEditFragment@1500.initViewModel$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AigcWallpaperGuestEditFragment@1500.initViewModel$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
