package X;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: renamed from: X.0Tow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758360Tow implements InterfaceViewOnClickListenerC1102800enu {
    public final LifecycleOwner LL;
    public DataChannel LLILLJJLI;
    public InterfaceC1103130eoR LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public Room LLILZLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public C758360Tow(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        Long l;
        String str;
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_DECORATION);
        if (C758370Tox.LIZ() && C758370Tox.LIZJ()) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                C758370Tox.LIZIZ(dataChannel, AFwS290S0000000_7.get$arr$(16));
            }
        } else {
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null && dataChannel2.gg0(C748880TZe.class) != null) {
                C758470Tp7 c758470Tp7LIZ = C771670UOv.LIZ();
                if (c758470Tp7LIZ != null && c758470Tp7LIZ.LJFF) {
                    z = true;
                } else {
                    z = false;
                }
                C758470Tp7 c758470Tp7LIZ2 = C771670UOv.LIZ();
                if (c758470Tp7LIZ2 != null && c758470Tp7LIZ2.LIZJ && (((l = (Long) DataChannelGlobal.LLILZ.gg0(AnonymousClass1687.class)) == null || l.longValue() <= 0) && z)) {
                    ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJII(C0KPJ.nf.LIZIZ().longValue(), this.LLILLJJLI, "live_detail");
                } else {
                    ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZJ("live_detail", String.valueOf(C500260Jjc.LJJLIIIJ(this.LLILLJJLI)), this.LLILLJJLI, new Bundle(), null);
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(C500260Jjc.LJJLIIIJ(this.LLILLJJLI)), "room_id");
        c474500IjALIZ.LJJII("live_detail", "decoration_entrance");
        if (this.LLILZIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "has_red_dot");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_bubble");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1083940eJU.LIZIZ(this.LLILZLL))) ? 1 : 0), "is_smb_creator");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        String str;
        this.LLILLJJLI = dataChannel;
        this.LLILZLL = C500260Jjc.LJJLIIIIJ(dataChannel);
        this.LLILLL = interfaceC1103130eoR;
        this.LLILZ = interfaceC1103130eoR.findViewById(R.id.y7r);
        C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_DECORATION;
        c0ux6.setValid(true);
        RedDotExtensionKt.LJI(this.LLILZ, this.LL, null, c0ux6, new AwS378S0200000_12(this, dataChannel, 47));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)), "room_id");
        c474500IjALIZ.LJJII("live_detail", "decoration_entrance");
        if (this.LLILZIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "has_red_dot");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_bubble");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C1083940eJU.LIZIZ(this.LLILZLL))) ? 1 : 0), "is_smb_creator");
        c474500IjALIZ.LIZ();
    }
}
