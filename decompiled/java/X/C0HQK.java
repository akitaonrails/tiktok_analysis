package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HQK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem$stickerResultCTA$shareButton$1$1$1", f = "MixStudioResultsBaseAssem.kt", l = {357}, m = "invokeSuspend")
public final class C0HQK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioResultsBaseAssem LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HQK(MixStudioResultsBaseAssem mixStudioResultsBaseAssem, Context context, InterfaceC1364105Vn<? super C0HQK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioResultsBaseAssem;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HQK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager childFragmentManager;
        C1C7U.LIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$shareButton$1$1$1");
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
            Fragment fragmentLJI = C724240Sb0.LJI(this.LLILLJJLI);
            if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                MixStudioResultsBaseAssem mixStudioResultsBaseAssem = this.LLILLJJLI;
                Context context = this.LLILLL;
                mixStudioResultsBaseAssem.LLJJJIL = true;
                MixStudioResultsPageViewModel mixStudioResultsPageViewModelTp = mixStudioResultsBaseAssem.tp();
                this.LL = 1;
                if (mixStudioResultsPageViewModelTp.AQ2(context, childFragmentManager, this) == objLJFF) {
                    C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$shareButton$1$1$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLJJLI.Ep(EnumC440980HQy.SHARE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$shareButton$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
