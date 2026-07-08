package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218650hol extends C09AY implements Function0<QuickMentionVM> {
    public final /* synthetic */ AbstractC738140SxQ LL;
    public final /* synthetic */ C13IQ LLILLJJLI;
    public final /* synthetic */ C1637906bB LLILLL;
    public final /* synthetic */ Function0 LLILZ;
    public final /* synthetic */ Function1 LLILZIL;
    public final /* synthetic */ Function0 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218650hol(AbstractC738140SxQ abstractC738140SxQ, C13IQ c13iq, C1637906bB c1637906bB, Function0 function0, Function1 function1, Function0 function02) {
        super(0);
        this.LL = abstractC738140SxQ;
        this.LLILLJJLI = c13iq;
        this.LLILLL = c1637906bB;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = function02;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.comment.quickmention.QuickMentionVM] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.comment.quickmention.QuickMentionVM, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ QuickMentionVM invoke() {
        CommentContextSource commentContextSource;
        AssemVMLazy assemVMLazy;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this.LL), "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null && commentContextSource.isRefactorTitlePanel()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
            while (true) {
                if (fragmentLJI == null) {
                    break;
                }
                if (!(fragmentLJI instanceof InterfaceC1218670hon)) {
                    fragmentLJI = fragmentLJI.getParentFragment();
                } else if (fragmentLJI.isAdded()) {
                    C13IQ c13iq = this.LLILLJJLI;
                    InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c13iq, 638);
                    AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(734);
                    if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLJI, c13iq), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(fragmentLJI, true), new C338490DOt(fragmentLJI, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragmentLJI, 639), aFwS257S0000000_19, new C451460Hn6(fragmentLJI, true), new C451620HnM(fragmentLJI, true), new C987103tV(fragmentLJI, true));
                    } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                        assemVMLazy = C451650HnP.LIZ(fragmentLJI, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLJI, c13iq), awS563S0100000_19, new AwS563S0100000_19(fragmentLJI, 640), aFwS257S0000000_19, null, null, null);
                    } else {
                        if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                            throw new IllegalArgumentException("Do not support this scope here.");
                        }
                        assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLJI, c13iq), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(fragmentLJI), C724750Sbp.LJIIIZ(fragmentLJI), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) fragmentLJI, 641), aFwS257S0000000_19, new C451460Hn6(fragmentLJI, false), new C451620HnM(fragmentLJI, false), new C987103tV(fragmentLJI, false));
                    }
                    return assemVMLazy.getValue();
                }
            }
        }
        return C452501pT.LIZIZ(new AwS23S0600000_19(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, 55)).getValue();
    }
}
