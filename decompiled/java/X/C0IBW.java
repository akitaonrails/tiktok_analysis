package X;

import Y.ACListenerS110S0200000_6;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.exp.game.gamecenter.IMEffectGameRevampExperiment;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IBW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IBW {
    public static final C0IBW LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0IBW.class, "vm", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C0IBW.class, "vm", "<v#1>", 0);
        c09r3.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2};
        LIZ = new C0IBW();
    }

    public static boolean LIZ(C869590Y9l c869590Y9l) {
        BaseTemplate baseTemplateLIZ;
        if (!IMEffectGameRevampExperiment.LIZIZ() || (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) == null || C0ZDX.LIZJ(baseTemplateLIZ) == null) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(C197039127h c197039127h, C0IBX c0ibx) {
        String string;
        c197039127h.setButtonStartIcon(c0ibx.LIZ());
        if (c0ibx.LJ() != null) {
            Integer numLJ = c0ibx.LJ();
            if (numLJ != null) {
                c197039127h.setIconTintColorRes(numLJ.intValue());
            }
        } else {
            c197039127h.LJJJJJ();
        }
        c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c197039127h.LJJJJLI(true);
        Integer numLIZJ = c0ibx.LIZJ();
        if (numLIZJ != null) {
            string = c197039127h.getContext().getString(numLIZJ.intValue());
        } else {
            string = null;
        }
        c197039127h.setText(string);
        c197039127h.setTextColorRes(R.attr.ej);
        c197039127h.LJJJJL(new AwS372S0200000_6(c197039127h, c197039127h, 100));
        C1378990lzN.LIZIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
        C786410Ut5.LJLLLLLL(0, c197039127h);
        c0ibx.LJFF(c197039127h);
        C786410Ut5.U8(c197039127h, new ACListenerS110S0200000_6(c0ibx, c197039127h, 58));
    }

    public static boolean LIZJ(C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str, boolean z) {
        if (str == null || str.length() == 0) {
            return false;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if ((baseTemplateLIZ != null && C0ZDX.LIZJ(baseTemplateLIZ) != null) || C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        if (!sessionInfo.isSingleChat()) {
            if (sessionInfo.isGroupChat() && C0ZNY.LIZ.LIZLLL(sessionInfo.getConversationId(), true)) {
                return true;
            }
            return false;
        }
        if (sessionInfo.isMessageRequest() || sessionInfo.isHighRiskConversation() || !C1865360ydq.LIZ()) {
            return false;
        }
        return z;
    }

    public static boolean LIZIZ(Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str, boolean z) {
        AssemVMLazy assemVMLazy;
        if (fragment == null || sessionInfo == null || str == null || str.length() == 0) {
            return false;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && C0ZDX.LIZJ(baseTemplateLIZ) != null) {
            return false;
        }
        if (z && C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        if (!sessionInfo.isSingleChat()) {
            if (!sessionInfo.isGroupChat() || !C0ZNY.LIZ.LIZLLL(sessionInfo.getConversationId(), true)) {
                return false;
            }
            return true;
        }
        if (sessionInfo.isMessageRequest() || sessionInfo.isHighRiskConversation() || !C1865360ydq.LIZ()) {
            return false;
        }
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomCameraVM.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 1533);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(537);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1534), aFwS236S0000000_6, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS550S0100000_6, new AwS550S0100000_6(fragment, 1535), aFwS236S0000000_6, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1536), aFwS236S0000000_6, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
        int i = C0IBV.LIZ[((C457970Hxb) assemVMLazy.getValue().getState()).LL.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return false;
            }
            throw new C1954807lC();
        }
        return true;
    }
}
