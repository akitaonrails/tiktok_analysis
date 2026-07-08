package Y;

import X.AbstractC1585810rMx;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1629106Zl;
import X.C259800zU;
import X.C869590Y9l;
import X.C910680Zo2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC904700ZeO;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatroom.GroupChatHistoryMsgLogicAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorVM;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public class AsS31S0200000_14 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsS31S0200000_14(Object obj, GroupChatHistoryMsgLogicAssem groupChatHistoryMsgLogicAssem, C259800zU<AbstractC1585810rMx> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = groupChatHistoryMsgLogicAssem;
    }

    public static final void LJJIIJ$0(AsS31S0200000_14 asS31S0200000_14, RecyclerView recyclerView, int i) {
        if (i == 1) {
            AssemVMLazy assemVMLazy = ((IMMessagePowerListAssem) asS31S0200000_14.l0).LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMMessagePowerListAssem.LLLIIL;
            PanelStateViewModel panelStateViewModel = (PanelStateViewModel) assemVMLazy.getValue();
            panelStateViewModel.jt(C1629106Zl.LL, panelStateViewModel.Ke().getValue().intValue());
        }
        IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20604515jv) asS31S0200000_14.l1, null), IMSelectTextAbility.class, null);
        if (iMSelectTextAbility != null) {
            iMSelectTextAbility.xr0(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIJ$1(AsS31S0200000_14 asS31S0200000_14, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((GroupChatHistoryMsgLogicAssem) asS31S0200000_14.l0).LLJIJIL = true;
            AbstractC1585810rMx abstractC1585810rMx = (AbstractC1585810rMx) ((C259800zU) asS31S0200000_14.l1).element;
            if (abstractC1585810rMx != null) {
                recyclerView.removeOnScrollListener(abstractC1585810rMx);
            }
        }
    }

    public static final void LJJIIZI$0(AsS31S0200000_14 asS31S0200000_14, RecyclerView recyclerView, int i, int i2) {
        IMSelectTextAbility iMSelectTextAbility;
        if ((i2 != 0 || i != 0) && recyclerView.getScrollState() == 0 && (iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20604515jv) asS31S0200000_14.l1, null), IMSelectTextAbility.class, null)) != null) {
            iMSelectTextAbility.Gb0();
        }
    }

    public static final void LJJIIZI$1(AsS31S0200000_14 asS31S0200000_14, RecyclerView recyclerView, int i, int i2) {
        MessagePowerListAbility messagePowerListAbility;
        List<C869590Y9l> listVi2;
        C869590Y9l c869590Y9l;
        Long lZo = UnreadIndicatorAssemV2.Zo(recyclerView, (Function0) asS31S0200000_14.l0);
        if (lZo != null) {
            long jLongValue = lZo.longValue();
            C910680Zo2 c910680Zo2 = (C910680Zo2) C13LP.LJJJLL(((UnreadIndicatorAssemV2) asS31S0200000_14.l1).No().getState().LL);
            if (c910680Zo2 != null && c910680Zo2.LJ <= 0) {
                UnreadIndicatorAssemV2 unreadIndicatorAssemV2 = (UnreadIndicatorAssemV2) asS31S0200000_14.l1;
                InterfaceC904700ZeO interfaceC904700ZeO = (InterfaceC904700ZeO) unreadIndicatorAssemV2.LLJJIJIL.getValue();
                if (interfaceC904700ZeO != null && interfaceC904700ZeO.LIZ() && (messagePowerListAbility = (MessagePowerListAbility) unreadIndicatorAssemV2.LLJJJ.getValue()) != null && (listVi2 = messagePowerListAbility.vi2()) != null && (c869590Y9l = (C869590Y9l) C13LP.LJJLIIIJJI(listVi2)) != null && jLongValue <= c869590Y9l.getIndex()) {
                    ((UnreadIndicatorAssemV2) asS31S0200000_14.l1).No().setState(AFwS248S0000000_14.get$arr$(520));
                    return;
                }
                return;
            }
            UnreadIndicatorVM unreadIndicatorVMNo = ((UnreadIndicatorAssemV2) asS31S0200000_14.l1).No();
            C910680Zo2 c910680Zo22 = (C910680Zo2) C13LP.LJJJLL(unreadIndicatorVMNo.getState().LL);
            if (c910680Zo22 == null || !unreadIndicatorVMNo.wQ2(c910680Zo22.LIZ).HZ0(jLongValue, c910680Zo22.LJ)) {
                return;
            }
            unreadIndicatorVMNo.setState(AFwS248S0000000_14.get$arr$(521));
        }
    }
}
