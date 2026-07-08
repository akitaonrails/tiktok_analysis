package X;

import X.C06P6;
import X.C2017407vI;
import X.C897230ZHt;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.utils.ChatCustomizeMessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897230ZHt extends C09AY implements Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ Fragment LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "chatCustomizeVM", "<v#19>", 1);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897230ZHt(Fragment fragment) {
        super(2);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIContentAssem uIContentAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        final AssemVMLazy assemVMLazy;
        UIContentAssem uIContentAssem2 = uIContentAssem;
        Fragment fragment = this.LL;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatCustomizeMessageListViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 139);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(202);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 727), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new AwS558S0100000_14(fragment, 729), aFwS248S0000000_14, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 731), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        final C01GW c01gwLIZ = C1509305vX.LIZ(new AwS546S0100000_2(this.LL, 450));
        uIContentAssem2.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$customiseChatBubbleConfig$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2017407vI.LIZ[event.ordinal()] == 1) {
                    AssemVMLazy<InterfaceC0148002o, ChatCustomizeMessageListViewModel> assemVMLazy2 = assemVMLazy;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C897230ZHt.LLILLJJLI;
                    if (((ChatCustomizeMessageListViewModel) assemVMLazy2.getValue()).LL) {
                        ((ChatCustomizeMessageListViewModel) assemVMLazy.getValue()).LL = false;
                        ChatroomEventAbility value = c01gwLIZ.getValue();
                        if (value != null) {
                            value.QU0(new C06P6(false));
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }
}
