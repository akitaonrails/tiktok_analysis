package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: renamed from: X.06PA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06PA extends C09AY implements Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;
    public static final C06PA LLILLJJLI;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "messageListViewModel", "<v#15>", 1);
        C13LE.LIZ.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217401BqU};
        LLILLJJLI = new C06PA();
    }

    public C06PA() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIContentAssem uIContentAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        UIContentAssem uIContentAssem2 = uIContentAssem;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IIMessageListViewModel.class);
        AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(uIContentAssem2, C724750Sbp.LJIIJ(uIContentAssem2, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 135), AFwS229S0000000_2.get$arr$(285), null, true);
        C01GW c01gwLIZ = C1509305vX.LIZ(new AwS546S0100000_2(uIContentAssem2, 448));
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
        C736680Sv4.LJIIIIZZ(uIContentAssem2, assemVMLazyLIZ.getValue(), new C2217381BqS() { // from class: X.06PB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C06PE) obj).LL);
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(viewOnAttachStateChangeListenerC20604515jv, 45), 4);
        C736680Sv4.LJIIIIZZ(uIContentAssem2, assemVMLazyLIZ.getValue(), new C2217381BqS() { // from class: X.06PC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C06PE) obj).LLILLJJLI);
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(c01gwLIZ, (C01GW<? extends ChatroomEventAbility>) 46), 4);
        C736680Sv4.LJIIIIZZ(uIContentAssem2, assemVMLazyLIZ.getValue(), new C2217381BqS() { // from class: X.06PD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C06PE) obj).LLILZIL);
            }
        }, C736820SvI.LJ(), new AwS616S0100000_2(c01gwLIZ, (C01GW<? extends ChatroomEventAbility>) 47), 4);
        return Unit.LIZ;
    }
}
