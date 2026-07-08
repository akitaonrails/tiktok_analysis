package X;

import Y.AsS33S0100000_6;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IC2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IC2 extends C09AY implements Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ Fragment LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "voiceTranscriptVM", "<v#27>", 1);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IC2(Fragment fragment) {
        super(2);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIContentAssem uIContentAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        AssemVMLazy assemVMLazy;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv;
        Fragment fragment = this.LL;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(fragment, 241);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMVoiceTranscriptViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 125);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(120);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), awS550S0100000_6, aFwS236S0000000_6, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, awS550S0100000_6, aFwS236S0000000_6, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), awS550S0100000_6, aFwS236S0000000_6, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AsS33S0100000_6(assemVMLazy, 0));
        return Unit.LIZ;
    }
}
