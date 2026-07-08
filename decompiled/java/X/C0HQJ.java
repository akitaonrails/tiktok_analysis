package X;

import android.content.Context;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem$stickerResultCTA$mainButton$1$1$1", f = "MixStudioResultsBaseAssem.kt", l = {372}, m = "invokeSuspend")
public final class C0HQJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioResultsBaseAssem LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HQJ(MixStudioResultsBaseAssem mixStudioResultsBaseAssem, Context context, InterfaceC1364105Vn<? super C0HQJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioResultsBaseAssem;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HQJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$mainButton$1$1$1");
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
            MixStudioResultsPageViewModel mixStudioResultsPageViewModelTp = this.LLILLJJLI.tp();
            Context context = this.LLILLL;
            this.LL = 1;
            if (mixStudioResultsPageViewModelTp.EQ2(context, this) == objLJFF) {
                C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$mainButton$1$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.Ep(EnumC440980HQy.POST_TO_STORY);
        C440370HOp c440370HOp = C440370HOp.LIZ;
        String str = this.LLILLJJLI.hp().wQ2().LLJI;
        c440370HOp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "mix_studio_share_panel");
        C20684815ws.LJIILLIIL("share_to_story_click", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$mainButton$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
