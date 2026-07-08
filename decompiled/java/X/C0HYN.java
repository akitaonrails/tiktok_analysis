package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.InputIconBtn;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import com.ss.android.ugc.aweme.im.saas.host.api.performance.IFpsMonitorHelper;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S0700000_6;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0HYN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYN {
    public static void LIZIZ(InterfaceC441960HUs interfaceC441960HUs, IInputFieldAbility iInputFieldAbility, InterfaceC1632206aG interfaceC1632206aG) {
        if (!(interfaceC441960HUs.getPanelType().getValue() instanceof InterfaceC1632206aG)) {
            interfaceC441960HUs.jt(interfaceC1632206aG, interfaceC441960HUs.Ke().getValue().intValue());
            if (C457760HxG.LIZIZ(false)) {
                DurationPerfMon.LIZ.LIZIZ(new C450520Hla(), true);
                IFpsMonitorHelper.LIZ.getClass();
                IFpsMonitorHelper value = C0HYO.LIZIZ.getValue();
                if (value != null) {
                    value.start();
                }
            }
            IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics().LJIJJ("chat", "click", C0I0B.LJFF.LIZIZ());
            return;
        }
        iInputFieldAbility.LLJZIJLIL();
    }

    public static final AwS0S0700000_6 LIZ(UIAssem uIAssem, IEmojiBtnAbility iEmojiBtnAbility, InterfaceC441960HUs interfaceC441960HUs, IInputFieldAbility iInputFieldAbility, InterfaceC1632206aG interfaceC1632206aG, Function2 function2) {
        C419910GdJ c419910GdJ = (C419910GdJ) C345880DhC.LJ.getValue();
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C433880Gzq(c419910GdJ, C1383370m6R.LJIIJ(2131823291)));
        AwS585S0100000_6 awS585S0100000_6 = null;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C441800HUc(iEmojiBtnAbility, c2252321DDqLIZ, c419910GdJ, null), 3);
        AwS104S0400000_6 awS104S0400000_6 = new AwS104S0400000_6(function2, (Function2<? super View, ? super Boolean, Unit>) interfaceC441960HUs, (InterfaceC441960HUs) iInputFieldAbility, (IInputFieldAbility) interfaceC1632206aG, (InterfaceC1632206aG) 15);
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugService = (IMSaasHostOfflineDebugService) PluggableExtentionKt.pluggableSpiForReal(IMSaasHostOfflineDebugService.class);
        if (iMSaasHostOfflineDebugService != null && iMSaasHostOfflineDebugService.LJJ()) {
            awS585S0100000_6 = new AwS585S0100000_6(uIAssem, 466);
        }
        C343000DcY c343000DcY = new C343000DcY(awS104S0400000_6, awS585S0100000_6);
        C0HV9 c0hv9 = C0HV9.EMOJI_BTN;
        return new AwS0S0700000_6(C13LE.LIZ(InputIconBtn.class), uIAssem, C1163440gNi.LIZ, c2252321DDqLIZ, c343000DcY, c0hv9, new AwS620S0100000_6(interfaceC441960HUs, 180), 29);
    }
}
