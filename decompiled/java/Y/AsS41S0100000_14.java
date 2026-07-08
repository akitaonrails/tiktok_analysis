package Y;

import X.AbstractC1585810rMx;
import X.C0ZP6;
import X.InterfaceC904700ZeO;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.MessageInboxWidget;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListSubmitListAbilityImpl;
import com.ss.android.ugc.tools.chat.message.component.AiChatMessageInfraComponent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AsS41S0100000_14 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (this.$t != 0) {
            super.LJJIIJ(recyclerView, i);
        } else {
            LJJIIJ$0(this, recyclerView, i);
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
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS41S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS41S0100000_14 asS41S0100000_14, RecyclerView recyclerView, int i) {
        C0ZP6 c0zp6 = (C0ZP6) ((MessageInboxWidget) asS41S0100000_14.l0).LLJJIII.getValue();
        if (c0zp6 != null) {
            c0zp6.Vo1(i);
        }
    }

    public static final void LJJIIZI$0(AsS41S0100000_14 asS41S0100000_14, RecyclerView recyclerView, int i, int i2) {
        if (i2 != 0) {
            ((MessageInboxWidget) asS41S0100000_14.l0).LLJI = true;
        }
    }

    public static final void LJJIIZI$1(AsS41S0100000_14 asS41S0100000_14, RecyclerView recyclerView, int i, int i2) {
        if (((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LIZIZ().findLastVisibleItemPosition() >= ((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LIZIZ().getItemCount() - Math.min(5, ((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LIZIZ().getItemCount())) {
            ((InterfaceC904700ZeO) ((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LLJI.getValue()).Fj();
            if (((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LIZIZ().findLastVisibleItemPosition() >= ((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LIZIZ().getItemCount() - 1) {
                Iterator<IMessagePowerAdapterProtocol> it2 = ((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LLILLL.LIZIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().Fj();
                }
                return;
            }
            return;
        }
        if (((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LIZIZ().findFirstVisibleItemPosition() == 0) {
            ((InterfaceC904700ZeO) ((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LLJI.getValue()).C();
            Iterator<IMessagePowerAdapterProtocol> it3 = ((MessageListSubmitListAbilityImpl) asS41S0100000_14.l0).LLILLL.LIZIZ().iterator();
            while (it3.hasNext()) {
                it3.next().C();
            }
        }
    }

    public static final void LJJIIZI$2(AsS41S0100000_14 asS41S0100000_14, RecyclerView recyclerView, int i, int i2) {
        ((AiChatMessageInfraComponent) asS41S0100000_14.l0).LLJJJ += i2;
        boolean z = true;
        if (!recyclerView.canScrollVertically(1)) {
            ((AiChatMessageInfraComponent) asS41S0100000_14.l0).LLJJJ = 0;
        }
        if (Math.abs(((AiChatMessageInfraComponent) asS41S0100000_14.l0).LLJJJ) < 50) {
            z = false;
        }
        AiChatMessageInfraComponent aiChatMessageInfraComponent = (AiChatMessageInfraComponent) asS41S0100000_14.l0;
        if (z != aiChatMessageInfraComponent.LLJJJIL) {
            aiChatMessageInfraComponent.LLJJJIL = z;
            Function1<? super Boolean, Unit> function1 = aiChatMessageInfraComponent.LLJJIJIL;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }

    public static final void LJJIIZI$3(AsS41S0100000_14 asS41S0100000_14, RecyclerView recyclerView, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        ((BotSharePostPickerAssem) asS41S0100000_14.l0).Oo();
    }
}
