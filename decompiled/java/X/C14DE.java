package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14DE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper$jumpToTargetPage$1$onLoad$1", f = "ReplaceMusicWithMovieHelper.kt", l = {310}, m = "invokeSuspend")
public final class C14DE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AsyncAVService LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ ReplaceMusicWithMovieHelper LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ ChangeBanMusicConfig LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14DE(AsyncAVService asyncAVService, Aweme aweme, ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper, long j, ChangeBanMusicConfig changeBanMusicConfig, InterfaceC1364105Vn<? super C14DE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = asyncAVService;
        this.LLILLL = aweme;
        this.LLILZ = replaceMusicWithMovieHelper;
        this.LLILZIL = j;
        this.LLILZLL = changeBanMusicConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C14DE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceMusicWithMovieHelper@8c47.jumpToTargetPage$1$onLoad$1");
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
            IEditService iEditServiceEditService = this.LLILLJJLI.uiService().editService();
            Aweme aweme = this.LLILLL;
            ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper = this.LLILZ;
            Activity activity = replaceMusicWithMovieHelper.LL;
            if (activity == null) {
                activity = null;
            }
            long j = this.LLILZIL;
            ChangeBanMusicConfig changeBanMusicConfig = this.LLILZLL;
            UIServiceCallback uIServiceCallback = (UIServiceCallback) replaceMusicWithMovieHelper.LLJJIJIL.invoke(aweme, C2286608xc.LJFF(j));
            ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper2 = this.LLILZ;
            String str = replaceMusicWithMovieHelper2.LLILLL;
            String str2 = replaceMusicWithMovieHelper2.LLILZ;
            this.LL = 1;
            if (iEditServiceEditService.startEditorProChangeBanMusic(aweme, activity, j, changeBanMusicConfig, uIServiceCallback, str, str2, this) == objLJFF) {
                C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.jumpToTargetPage$1$onLoad$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.jumpToTargetPage$1$onLoad$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
