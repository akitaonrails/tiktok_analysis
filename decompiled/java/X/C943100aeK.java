package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.im.WallpaperReviewMessage;

/* JADX INFO: renamed from: X.0aeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel$notifyAigcWallpaperResult$1", f = "BaseAigcWallpaperViewModel.kt", l = {82}, m = "invokeSuspend")
public final class C943100aeK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseAigcWallpaperViewModel LLILLJJLI;
    public final /* synthetic */ WallpaperReviewMessage LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C943100aeK(BaseAigcWallpaperViewModel baseAigcWallpaperViewModel, WallpaperReviewMessage wallpaperReviewMessage, long j, String str, InterfaceC1364105Vn<? super C943100aeK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseAigcWallpaperViewModel;
        this.LLILLL = wallpaperReviewMessage;
        this.LLILZ = j;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C943100aeK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("BaseAigcWallpaperViewModel@14b7.notifyAigcWallpaperResult$1");
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
            WallpaperReviewMessage wallpaperReviewMessage = this.LLILLL;
            String str3 = null;
            if (wallpaperReviewMessage != null) {
                str3 = wallpaperReviewMessage.aiPicUrl;
                str = wallpaperReviewMessage.keywords;
                str2 = wallpaperReviewMessage.contextKeywords;
            } else {
                str = null;
                str2 = null;
            }
            C945890aip c945890aip = new C945890aip(str3, str, str2, this.LLILZ, this.LLILZIL);
            this.LL = 1;
            if (c2252331DDr.emit(c945890aip, this) == objLJFF) {
                C1C7U.LIZIZ("BaseAigcWallpaperViewModel@14b7.notifyAigcWallpaperResult$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseAigcWallpaperViewModel@14b7.notifyAigcWallpaperResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
