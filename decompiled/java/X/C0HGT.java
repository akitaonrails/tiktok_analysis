package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HGT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel$notifyAigcWallpaperResultTimeout$1", f = "BaseAigcWallpaperViewModel.kt", l = {221}, m = "invokeSuspend")
public final class C0HGT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseAigcWallpaperViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HGT(BaseAigcWallpaperViewModel baseAigcWallpaperViewModel, InterfaceC1364105Vn<? super C0HGT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseAigcWallpaperViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HGT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAigcWallpaperViewModel@14b7.notifyAigcWallpaperResultTimeout$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLJJLI;
            C0HIF c0hif = C0HIF.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(c0hif, this) == objLJFF) {
                C1C7U.LIZIZ("BaseAigcWallpaperViewModel@14b7.notifyAigcWallpaperResultTimeout$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseAigcWallpaperViewModel@14b7.notifyAigcWallpaperResultTimeout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
