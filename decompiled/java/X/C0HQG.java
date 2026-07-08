package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HQG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem$stickerResultCTA$sendButton$1$1$1", f = "MixStudioResultsBaseAssem.kt", l = {314}, m = "invokeSuspend")
public final class C0HQG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioResultsBaseAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HQG(MixStudioResultsBaseAssem mixStudioResultsBaseAssem, InterfaceC1364105Vn<? super C0HQG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioResultsBaseAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HQG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Fragment fragmentLJI;
        C1C7U.LIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$sendButton$1$1$1");
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
            this.LLILLJJLI.Ep(EnumC440980HQy.SEND);
            MixStudioResultsPageViewModel mixStudioResultsPageViewModelTp = this.LLILLJJLI.tp();
            this.LL = 1;
            obj = mixStudioResultsPageViewModelTp.DQ2(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$sendButton$1$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue() && (fragmentLJI = C724240Sb0.LJI(this.LLILLJJLI)) != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioResultsBaseAssem@327b.stickerResultCTA$sendButton$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
