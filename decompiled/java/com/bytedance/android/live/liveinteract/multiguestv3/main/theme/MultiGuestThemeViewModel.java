package com.bytedance.android.live.liveinteract.multiguestv3.main.theme;

import X.C1338270kvh;
import X.C14KS;
import X.C1770850wBP;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C915980Zwa;
import X.C919310a1x;
import X.C921180a4y;
import X.C930540aK4;
import X.C938810aXP;
import X.C938820aXQ;
import X.C938830aXR;
import X.EnumC938840aXS;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.InterfaceC937900aVw;
import X.InterfaceC938950aXd;
import android.graphics.Rect;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.livesdk.dataChannel.VideoBelowBackgroundUpdateEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestThemeViewModel extends AssemViewModel<C938810aXP> implements InterfaceC938950aXd {
    public boolean LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C938810aXP(null, null, null, 0, null);
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ;
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ;
        C919310a1x.LIZ("multi_guest_theme", "onDestroy");
        if (!this.LL && C930540aK4.LIZJ() && ((iMultiGuestV3InternalServiceV2LJIIIIZZ = C915980Zwa.LJIIIIZZ()) == null || (interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(iMultiGuestV3InternalServiceV2LJIIIIZZ)) == null || !interfaceC937900aVwLJIIIIZZ.LJJJZ())) {
            DataChannelGlobal.LLILZ.FQ2(VideoBelowBackgroundUpdateEvent.class, "");
        }
        onCleared();
        setState(AFwS250S0000000_15.get$arr$(60));
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        C919310a1x.LIZ("multi_guest_theme", "onCreate");
        if (!MultiGuestSocialGameLetsDanceSetting.config().sharedBgSurfaceViewEnabled) {
            vQ2(new C2217371BqR() { // from class: X.0aXK
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LLILLL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LLILLL = (String) obj2;
                }
            }, null, null, new AwS594S0100000_15(this, 428));
        }
        C938820aXQ c938820aXQ = new C2217371BqR() { // from class: X.0aXQ
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C938810aXP) obj).LLILZ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C938810aXP) obj).LLILZ = ((Number) obj2).intValue();
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(true);
        c1770850wBP.LIZ = true;
        vQ2(c938820aXQ, c1770850wBP, null, AFwS250S0000000_15.get$arr$(59));
    }

    public final void xQ2(String str, boolean z) {
        Integer numValueOf;
        EnumC938840aXS enumC938840aXS;
        String str2;
        Rect rect;
        Integer numValueOf2 = null;
        if (z) {
            numValueOf2 = Integer.valueOf(ColorProtector.parseColor("#2EFFFFFF"));
            numValueOf = Integer.valueOf(R.drawable.ewz);
            enumC938840aXS = EnumC938840aXS.DIVIDER_TYPE_SHARED_BG;
            str2 = str;
            rect = new Rect(0, 0, C14KS.LJFF(), C14KS.LIZLLL());
        } else {
            numValueOf = null;
            enumC938840aXS = EnumC938840aXS.DIVIDER_TYPE_NORMAL;
            str2 = null;
            rect = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSharedBg sharedBgEnable=");
        sbLIZ.append(z);
        sbLIZ.append(", sharedBgFilePath=");
        sbLIZ.append(str);
        sbLIZ.append(", emptyMaskBackgroundColor=");
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", dividerType=");
        sbLIZ.append(enumC938840aXS);
        sbLIZ.append(", playerBgFilePath=");
        sbLIZ.append(str2);
        sbLIZ.append(", playerForegroundClipRect=");
        sbLIZ.append(rect);
        C919310a1x.LIZLLL("multi_guest_theme", C2188811AlT.LIZIZ(sbLIZ));
        setState(new C938830aXR(enumC938840aXS, numValueOf2, numValueOf, str2, rect));
    }

    public final void vQ2(C2217371BqR c2217371BqR, C1770850wBP c1770850wBP, LifecycleOwner lifecycleOwner, Function1 function1) {
        C1770850wBP c1770850wBP2 = c1770850wBP;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select state Subscribe [");
        sbLIZ.append(c2217371BqR);
        sbLIZ.append("] ");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        if (c1770850wBP2 == null) {
            c1770850wBP2 = new C1770850wBP();
            c1770850wBP2.LIZ(true);
        }
        AssemViewModel.selectSubscribe$default(this, c2217371BqR, c1770850wBP2, lifecycleOwner, null, function1, 8, null);
    }
}
