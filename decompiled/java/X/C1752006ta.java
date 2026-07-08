package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1752006ta extends C09AY implements Function1<Boolean, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final /* synthetic */ UIContentAssem LL;
    public final /* synthetic */ ISocialGameService LLILLJJLI;
    public final /* synthetic */ SessionInfo LLILLL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "messageListVM", "<v#33>", 1);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752006ta(UIContentAssem uIContentAssem, ISocialGameService iSocialGameService, SessionInfo sessionInfo) {
        super(1);
        this.LL = uIContentAssem;
        this.LLILLJJLI = iSocialGameService;
        this.LLILLL = sessionInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        AssemVMLazy assemVMLazy;
        if (bool.booleanValue()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
            if (fragmentLJI != null) {
                InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(IIMessageListViewModel.class);
                C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 130);
                AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(284);
                if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLJI, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragmentLJI, true), new C338490DOt(fragmentLJI, true), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragmentLJI, 434), aFwS229S0000000_2, new C451460Hn6(fragmentLJI, true), new C451620HnM(fragmentLJI, true), new C987103tV(fragmentLJI, true));
                } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                    assemVMLazy = C451650HnP.LIZ(fragmentLJI, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLJI, c19719912DlLIZ), c5182020e, new AwS546S0100000_2(fragmentLJI, 439), aFwS229S0000000_2, null, null, null);
                } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLJI, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragmentLJI), C724750Sbp.LJIIIZ(fragmentLJI), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragmentLJI, 442), aFwS229S0000000_2, new C451460Hn6(fragmentLJI, false), new C451620HnM(fragmentLJI, false), new C987103tV(fragmentLJI, false));
                } else {
                    throw new IllegalArgumentException("Do not support this scope here.");
                }
                UIContentAssem uIContentAssem = this.LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
                AssemViewModel value = assemVMLazy.getValue();
                C1749906tF c1749906tF = new C2217381BqS() { // from class: X.06tF
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C06PE) obj).LLIZ;
                    }
                };
                C1770850wBP c1770850wBP = new C1770850wBP();
                c1770850wBP.LIZIZ = AFwS285S0000000_2.get$arr$(17);
                C736680Sv4.LJIIIIZZ(uIContentAssem, value, c1749906tF, c1770850wBP, new AwS438S0200000_2(this.LLILLJJLI, this.LLILLL, 12), 4);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return Unit.LIZ;
    }
}
