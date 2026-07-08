package X;

import Y.AfS184S0100000_15;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939350aYH extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public final InterfaceC923120a86 LLIZ;
    public final long LLIZLLLIL;
    public final C01GW LLJ;
    public IThemeAbility LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public InterfaceC940060aZQ LLJILJILJ;
    public final ViewOnLayoutChangeListenerC986920bn0 LLJILLL;
    public final C939340aYG LLJJ;
    public final C11PQ<Integer> LLJJI;

    public final InterfaceC937960aW2 LJJI() {
        return (InterfaceC937960aW2) this.LLJ.getValue();
    }

    public final InterfaceC940060aZQ LJJIFFI() {
        if (!LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() || this.LLIZLLLIL <= 0) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LLIIJLIL() : null;
            if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) {
                return (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL;
            }
            return null;
        }
        InterfaceC940060aZQ interfaceC940060aZQ = this.LLJILJILJ;
        if (interfaceC940060aZQ != null) {
            return interfaceC940060aZQ;
        }
        InterfaceC937900aVw interfaceC937900aVwPG2 = C915980Zwa.LJIIIIZZ().PG2(this.LLIZLLLIL);
        if (interfaceC937900aVwPG2 instanceof InterfaceC940060aZQ) {
            return (InterfaceC940060aZQ) interfaceC937900aVwPG2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939350aYH.LJJ():void");
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        this.LLJILJILJ = null;
        this.LLILZIL.removeOnLayoutChangeListener(this.LLJILLL);
        LJJI().onDetach();
        C939340aYG c939340aYG = this.LLJJ;
        c939340aYG.LL.zW(MultiLiveRTCLayoutChannel.class, new C1081600eFi(EnumC918970a1P.NORMAL, 0, 0, 0, false, 30));
        if (c939340aYG.LLILLL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Lifecycle.State currentState = c939340aYG.LLILLL.getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                c939340aYG.LLILLL.setCurrentState(state);
            }
        }
        c939340aYG.LLILZ.LJ();
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJI() {
        LJJ();
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        super.LJIJ(interfaceC940060aZQ);
        this.LLJILJILJ = interfaceC940060aZQ;
        C939340aYG c939340aYG = this.LLJJ;
        c939340aYG.LLILLL.setCurrentState(Lifecycle.State.STARTED);
        c939340aYG.LL.EQ2(c939340aYG, SubOnlyLiveAudienceStatusChannel.class, new AwS594S0100000_15(c939340aYG, 703));
        c939340aYG.LL.BQ2(c939340aYG, PIPModeChangeEvent.class, new AwS594S0100000_15(c939340aYG, 704));
        c939340aYG.LLILZ.LIZ(new C11IW(c939340aYG.LLILLJJLI.LLJJI.LJJIJIIJIL(new AfS184S0100000_15(c939340aYG, 115))).LJIILL().LJIIZILJ());
        this.LLILZIL.addOnLayoutChangeListener(this.LLJILLL);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLILZLL.gg0(C956790b0P.class);
        if (interfaceC665370Q7z != null) {
            this.LLJI = (IThemeAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IThemeAbility.class, null);
        }
        LJJI().LIZLLL(true);
        this.LLILZLL.BQ2(this, MultiGuestLayoutRenderV2.SwitchLayoutEvent.class, new AwS594S0100000_15(this, 937));
        IThemeAbility iThemeAbility = this.LLJI;
        if (iThemeAbility != null && (multiGuestThemeViewModelMG0 = iThemeAbility.MG0()) != null) {
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZ(true);
            c1770850wBP.LIZ = true;
            multiGuestThemeViewModelMG0.vQ2(new C2217371BqR() { // from class: X.0aYN
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LLILZIL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LLILZIL = (Rect) obj2;
                }
            }, c1770850wBP, this, new AwS594S0100000_15(this, 938));
        }
        this.LLILZLL.BQ2(this, PIPModeChangeEvent.class, new AwS594S0100000_15(this, 939));
        LJJ();
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIL(C942080acg c942080acg) {
        if (this.LLIZLLLIL > 0) {
            LJJ();
        }
    }

    public C939350aYH(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel, InterfaceC923120a86 interfaceC923120a86, long j) {
        super(interfaceC923120a86);
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
        this.LLIZ = interfaceC923120a86;
        this.LLIZLLLIL = j;
        this.LLJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1001));
        this.LLJILLL = new ViewOnLayoutChangeListenerC986920bn0(this, 4);
        this.LLJJ = new C939340aYG(this.LLILZLL, this);
        this.LLJJI = new C11PQ<>();
    }
}
