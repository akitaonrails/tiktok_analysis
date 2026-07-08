package Y;

import X.C1161920gLG;
import X.EnumC1102740eno;
import X.EnumC1102750enp;
import X.InterfaceC464450IJf;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS79S0201000_7 implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS79S0201000_7 aObjectS79S0201000_7, Object obj) {
        int i = aObjectS79S0201000_7.i2;
        if (i > 0) {
            return Unit.LIZ;
        }
        aObjectS79S0201000_7.i2 = i + 1;
        Room room = ((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJILJIL;
        if (room != null && ((InterfaceC464450IJf) aObjectS79S0201000_7.l0).LIZIZ(room.getId())) {
            EnumC1102750enp enumC1102750enp = EnumC1102750enp.CUSTOM_POLL;
            if (!enumC1102750enp.isShowing(((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJIJIL) && (!enumC1102750enp.isShowingInInteractionDialog(((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJIJIL) || !((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).NS())) {
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).AV0(((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJIJIL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS79S0201000_7 aObjectS79S0201000_7, Object obj) {
        int i = aObjectS79S0201000_7.i2;
        if (i > 0) {
            return Unit.LIZ;
        }
        aObjectS79S0201000_7.i2 = i + 1;
        Room room = ((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJILJIL;
        if (room != null && ((InterfaceC464450IJf) aObjectS79S0201000_7.l0).LIZIZ(room.getId())) {
            EnumC1102740eno enumC1102740eno = EnumC1102740eno.VOTE;
            if (!enumC1102740eno.isShowing(((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJIJIL) && (!enumC1102740eno.isShowingInInteractionDialog(((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJIJIL) || !((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).NS())) {
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).eU(((AbsAudienceInteractionFragment) aObjectS79S0201000_7.l1).LLJIJIL);
            }
        }
        return Unit.LIZ;
    }

    public AObjectS79S0201000_7(AbsAudienceInteractionFragment absAudienceInteractionFragment, InterfaceC464450IJf interfaceC464450IJf, int i) {
        this.$t = i;
        this.l1 = absAudienceInteractionFragment;
        this.l0 = interfaceC464450IJf;
    }
}
