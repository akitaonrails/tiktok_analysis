package Y;

import X.C0QSJ;
import X.C1150190g2L;
import X.C13LQ;
import X.C1807670x8n;
import X.C2173391A4b;
import X.C2173431A4f;
import X.C2174121A6w;
import X.C417280GXu;
import X.C417290GXv;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.legal.LegalAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.legal.LegalViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.creative.edit.impl.editor.IMEditorAssem;
import com.ss.android.ugc.aweme.im.creative.edit.impl.editor.IMEditorVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.CommonChatDepAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AObjectS407S0100000_33 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS407S0100000_33 aObjectS407S0100000_33) {
        IMEditorAssem iMEditorAssem = (IMEditorAssem) aObjectS407S0100000_33.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMEditorAssem.LLIZ;
        return new IMEditorVM(((C2173431A4f) iMEditorAssem.LL.getValue()).LIZ, ((C2173431A4f) iMEditorAssem.LL.getValue()).LIZLLL, ((C2173431A4f) iMEditorAssem.LL.getValue()).LIZJ, ((C2173431A4f) iMEditorAssem.LL.getValue()).LJ, ((C2173431A4f) iMEditorAssem.LL.getValue()).LJFF);
    }

    public static final Object invoke$1(AObjectS407S0100000_33 aObjectS407S0100000_33) {
        CommonChatDepAssem commonChatDepAssem = (CommonChatDepAssem) aObjectS407S0100000_33.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatDepAssem.LLJILJIL;
        AssemVMLazy assemVMLazy = commonChatDepAssem.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = CommonChatDepAssem.LLJILJIL;
        return C1807670x8n.LLLLLLLLLL((InputFieldVM) assemVMLazy.getValue(), (SendMessageVM) commonChatDepAssem.LLILZ.getValue(), (MessageReplyVM) commonChatDepAssem.LLILZIL.getValue(), (ActionBarViewModel) commonChatDepAssem.LLILZLL.getValue(), (SessionInfo) commonChatDepAssem.LLIZLLLIL.getValue(), (PanelStateViewModel) commonChatDepAssem.LLJ.getValue(), (ChatRoomCameraVM) commonChatDepAssem.LLILLL.getValue(), (ITypingRecommendationVM) commonChatDepAssem.LLIZ.getValue());
    }

    public static final Object invoke$2(AObjectS407S0100000_33 aObjectS407S0100000_33) {
        C2174121A6w c2174121A6w = (C2174121A6w) aObjectS407S0100000_33.l0;
        return new C2173391A4b(C13LQ.LJJLL(new Object[]{new C417280GXu(c2174121A6w.LIZIZ.LIZIZ()), new C417290GXv(c2174121A6w.LIZIZ.LIZIZ())}));
    }

    public static final Object invoke$3(AObjectS407S0100000_33 aObjectS407S0100000_33) {
        TouchPointAbility touchPointAbility;
        LegalAssem legalAssem = (LegalAssem) aObjectS407S0100000_33.l0;
        C1150190g2L c1150190g2L = LegalAssem.LLJJJ;
        C0QSJ c0qsjHo = legalAssem.Ho();
        if (c0qsjHo != null) {
            touchPointAbility = (TouchPointAbility) c0qsjHo.getAbility(TouchPointAbility.class);
        } else {
            touchPointAbility = null;
        }
        return new LegalViewModel(touchPointAbility);
    }

    public AObjectS407S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
