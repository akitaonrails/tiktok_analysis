package X;

import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorSelfVideoChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayParams;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0a7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922550a7B {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZJ(EnumC918990a1R enumC918990a1R) {
        if (enumC918990a1R == null) {
            return 1;
        }
        if (C916560ZxW.LIZIZ(enumC918990a1R)) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || interfaceC954180awCLLJLL.LIZIZ() - 1 <= 0) {
                return 1;
            }
            return 3;
        }
        return 2;
    }

    public static final Window LIZLLL(LiveDialogFragment liveDialogFragment) {
        Dialog dialog;
        if (liveDialogFragment != null && (dialog = liveDialogFragment.getDialog()) != null) {
            return dialog.getWindow();
        }
        return null;
    }

    public static final void LIZ(DataChannel dataChannel, String str, boolean z) {
        MultiGuestDataHolder multiGuestDataHolder;
        int i;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
            if (z == multiGuestDataHolder.LJIIJ) {
                C20441214yg.LIZIZ("MultiLiveUtil", "no need to update, video state is the same");
                return;
            }
            multiGuestDataHolder.LJJIIZI(z);
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            multiGuestDataHolder.LJIILIIL = i;
            if (z) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LJJL(Boolean.FALSE, str, null);
                }
                C784440Upu.LIZ().LIZIZ(new C465900IOu(40));
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    interfaceC954180awCLLJLL2.LJJL(Boolean.TRUE, str, null);
                }
                C784440Upu.LIZ().LIZIZ(new C465900IOu(41));
            }
            if (dataChannel != null) {
                dataChannel.LC0(MultiLiveAnchorMuteVideoEvent.class, new C0UI0(z, str));
                dataChannel.FQ2(MultiGuestAnchorSelfVideoChangedEvent.class);
            }
        }
    }

    public static final void LIZIZ(long j, Context context, DataChannel dataChannel, Function0<Unit> function0) {
        boolean zLJI = MethodIDManager.LJI(137750);
        C20441214yg.LIZIZ("MultiLiveUtil", "triggered native request fetchHostTagInfo");
        C480460Ism.LIZ().getClass();
        MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
        HostDisplayParams hostDisplayParams = new HostDisplayParams();
        hostDisplayParams.roomId = j;
        multiLiveApi.fetchHostTagInfo(hostDisplayParams).LJFF(new C0UO0()).LJJIIZ(new AfS151S0200000_15(function0, dataChannel, 37), new AfS184S0100000_15(context, 134));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
