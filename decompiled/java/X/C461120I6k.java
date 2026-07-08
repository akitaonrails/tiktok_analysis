package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS442S0200000_6;

/* JADX INFO: renamed from: X.0I6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461120I6k extends C09AY implements Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ SessionInfo LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C461130I6l.class, "scrollToMessageViewModel", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461120I6k(SessionInfo sessionInfo) {
        super(2);
        this.LL = sessionInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIContentAssem uIContentAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        UIContentAssem uIContentAssem2 = uIContentAssem;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ScrollToMessageViewModel.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(uIContentAssem2, C724750Sbp.LJIIJ(uIContentAssem2, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 295), AFwS236S0000000_6.get$arr$(450), null, true);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        C736680Sv4.LJIIIIZZ(uIContentAssem2, assemVMLazyLIZ.getValue(), new C2217381BqS() { // from class: X.0I6j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C461100I6i) obj).LL;
            }
        }, null, new AwS442S0200000_6(this.LL, (SessionInfo) assemVMLazyLIZ, (AssemVMLazy<C461100I6i, ScrollToMessageViewModel>) 13), 6);
        return Unit.LIZ;
    }
}
