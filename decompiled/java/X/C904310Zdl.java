package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904310Zdl extends C09AY implements Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;
    public static final C904310Zdl LLILLJJLI;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "messageListVM", "<v#29>", 1);
        C13LE.LIZ.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217401BqU};
        LLILLJJLI = new C904310Zdl();
    }

    public C904310Zdl() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIContentAssem uIContentAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        AssemVMLazy assemVMLazy;
        UIContentAssem uIContentAssem2 = uIContentAssem;
        IMFavoriteBridgeApi.LIZ.getClass();
        IMFavoriteBridgeApi value = C904340Zdo.LIZIZ.getValue();
        if (value != null && value.LIZLLL()) {
            Fragment fragmentLJI = C724240Sb0.LJI(uIContentAssem2);
            if (fragmentLJI != null) {
                InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(IIMessageListViewModel.class);
                C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 131);
                AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(208);
                if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLJI, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragmentLJI, true), new C338490DOt(fragmentLJI, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragmentLJI, 743), aFwS248S0000000_14, new C451460Hn6(fragmentLJI, true), new C451620HnM(fragmentLJI, true), new C987103tV(fragmentLJI, true));
                } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                    assemVMLazy = C451650HnP.LIZ(fragmentLJI, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLJI, c19719912DlLIZ), c5182020e, new AwS558S0100000_14(fragmentLJI, 745), aFwS248S0000000_14, null, null, null);
                } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLJI, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragmentLJI), C724750Sbp.LJIIIZ(fragmentLJI), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragmentLJI, 747), aFwS248S0000000_14, new C451460Hn6(fragmentLJI, false), new C451620HnM(fragmentLJI, false), new C987103tV(fragmentLJI, false));
                } else {
                    throw new IllegalArgumentException("Do not support this scope here.");
                }
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
                C736680Sv4.LJIIIIZZ(uIContentAssem2, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06tA
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C06PE) obj).LLILZLL;
                    }
                }, null, new AwS628S0100000_14(value, 22), 6);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return Unit.LIZ;
    }
}
