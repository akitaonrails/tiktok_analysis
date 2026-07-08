package X;

import android.view.ViewGroup;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1088870eRR {
    public static final EnumC1088870eRR LEFT;
    public static final /* synthetic */ EnumC1088870eRR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1088870eRR POPUP;
    public static final EnumC1088870eRR POPUP_BASIC;
    public static final EnumC1088870eRR POPUP_SETTING;
    public static final EnumC1088870eRR RIGHT;

    public static InterfaceC2044707zh<EnumC1088870eRR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1088870eRR enumC1088870eRR = new EnumC1088870eRR("LEFT", 0);
        LEFT = enumC1088870eRR;
        EnumC1088870eRR enumC1088870eRR2 = new EnumC1088870eRR("RIGHT", 1);
        RIGHT = enumC1088870eRR2;
        EnumC1088870eRR enumC1088870eRR3 = new EnumC1088870eRR("POPUP", 2);
        POPUP = enumC1088870eRR3;
        EnumC1088870eRR enumC1088870eRR4 = new EnumC1088870eRR("POPUP_BASIC", 3);
        POPUP_BASIC = enumC1088870eRR4;
        EnumC1088870eRR enumC1088870eRR5 = new EnumC1088870eRR("POPUP_SETTING", 4);
        POPUP_SETTING = enumC1088870eRR5;
        EnumC1088870eRR[] enumC1088870eRRArr = {enumC1088870eRR, enumC1088870eRR2, enumC1088870eRR3, enumC1088870eRR4, enumC1088870eRR5};
        LL = enumC1088870eRRArr;
        LLILLJJLI = new C2254308sP(enumC1088870eRRArr);
    }

    public static EnumC1088870eRR[] values() {
        return (EnumC1088870eRR[]) LL.clone();
    }

    public static InterfaceC1088880eRS LIZJ(DataChannel dataChannel) {
        return ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
    }

    public static EnumC1088870eRR valueOf(String str) {
        return (EnumC1088870eRR) C08FF.LIZ(EnumC1088870eRR.class, str);
    }

    public final Unit release(DataChannel dataChannel) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIILLIIL(this, dataChannel);
            return Unit.LIZ;
        }
        return null;
    }

    public EnumC1088870eRR(String str, int i) {
    }

    public final void addButtonToConfigList(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIJJLI(dataChannel, enumC1102750enp, this);
        }
    }

    public final void removeButtonFromConfigList(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LIZ(dataChannel, enumC1102750enp, this);
        }
    }

    public final Unit createHolder(DataChannel dataChannel, ViewGroup viewGroup, List<? extends EnumC1102750enp> list, EnumC1088900eRU enumC1088900eRU) {
        InterfaceC1088880eRS interfaceC1088880eRSLIZJ = LIZJ(dataChannel);
        if (interfaceC1088880eRSLIZJ != null) {
            interfaceC1088880eRSLIZJ.LJIILJJIL(dataChannel, viewGroup, list, enumC1088900eRU, this);
            return Unit.LIZ;
        }
        return null;
    }
}
