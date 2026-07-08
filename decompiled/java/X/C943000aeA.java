package X;

import Y.AgS296S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0aeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorEditFragment$initViewModel$1", f = "AigcWallpaperAnchorEditFragment.kt", l = {340}, m = "invokeSuspend")
public final class C943000aeA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AigcWallpaperAnchorEditFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943000aeA(AigcWallpaperAnchorEditFragment aigcWallpaperAnchorEditFragment, InterfaceC1364105Vn<? super C943000aeA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aigcWallpaperAnchorEditFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C943000aeA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0950 anonymousClass0950;
        C1C7U.LIZ("AigcWallpaperAnchorEditFragment@de6e.initViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AigcWallpaperAnchorEditFragment aigcWallpaperAnchorEditFragment = this.LLILLJJLI;
            AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = aigcWallpaperAnchorEditFragment.LLJ;
            if (aigcWallpaperAnchorViewModel != null && (anonymousClass0950 = aigcWallpaperAnchorViewModel.LLILLL) != null) {
                AgS296S0100000_15 agS296S0100000_15 = new AgS296S0100000_15(aigcWallpaperAnchorEditFragment, 0);
                this.LL = 1;
                if (anonymousClass0950.collect(agS296S0100000_15, this) == objLJFF) {
                    C1C7U.LIZIZ("AigcWallpaperAnchorEditFragment@de6e.initViewModel$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AigcWallpaperAnchorEditFragment@de6e.initViewModel$1");
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
