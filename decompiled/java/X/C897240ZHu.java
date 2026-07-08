package X;

import X.C1619406Vs;
import X.C2020407vm;
import X.C897240ZHu;
import X.C897250ZHv;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.wheeexclusive.WheeExclusiveBubbleMessageListViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897240ZHu extends C09AY implements Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "vm", "<v#23>", 1);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897240ZHu(Fragment fragment, SessionInfo sessionInfo) {
        super(2);
        this.LL = fragment;
        this.LLILLJJLI = sessionInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIContentAssem uIContentAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        final AssemVMLazy assemVMLazy;
        UIContentAssem uIContentAssem2 = uIContentAssem;
        Fragment fragment = this.LL;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WheeExclusiveBubbleMessageListViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 132);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(209);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 744), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new AwS558S0100000_14(fragment, 746), aFwS248S0000000_14, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 748), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        C01GW c01gwLIZ = C1509305vX.LIZ(new AwS546S0100000_2(this.LL, 445));
        C01GW c01gwLIZ2 = C1509305vX.LIZ(new AwS546S0100000_2(this.LL, 440));
        final String conversationId = this.LLILLJJLI.getConversationId();
        final AwS258S0300000_14 awS258S0300000_14 = new AwS258S0300000_14(assemVMLazy, (AssemVMLazy<InterfaceC0148002o, WheeExclusiveBubbleMessageListViewModel>) c01gwLIZ2, (C01GW<? extends ChatNoticeAbility>) c01gwLIZ, (C01GW<? extends ChatroomEventAbility>) 7);
        String string = a0.LJLIIIL(conversationId).toString();
        if (string.length() != 0) {
            C897250ZHv.LIZIZ = string;
            C897250ZHv.LIZJ = awS258S0300000_14;
        }
        uIContentAssem2.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$wheeExclusiveBubbleRefreshConfig$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C2020407vm.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (Intrinsics.LJFF(C897250ZHv.LIZIZ, a0.LJLIIIL(conversationId).toString())) {
                            C897250ZHv.LIZIZ = null;
                            C897250ZHv.LIZJ = null;
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1619406Vs c1619406Vs = C1619406Vs.LIZ;
                String str = conversationId;
                c1619406Vs.getClass();
                C1619406Vs.LIZLLL(str);
                AssemVMLazy<InterfaceC0148002o, WheeExclusiveBubbleMessageListViewModel> assemVMLazy2 = assemVMLazy;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C897240ZHu.LLILLL;
                if (!((WheeExclusiveBubbleMessageListViewModel) assemVMLazy2.getValue()).LLILLL) {
                    if (!C897250ZHv.LIZ.remove(a0.LJLIIIL(conversationId).toString())) {
                        return;
                    }
                }
                awS258S0300000_14.invoke();
            }
        });
        return Unit.LIZ;
    }
}
