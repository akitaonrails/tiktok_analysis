package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.linkroom.toolbarsheet.MultiGuestToolAndPlayFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927840aFi {
    public static final C927840aFi LIZ = new C927840aFi();

    public static void LIZ(DataChannel dataChannel, String str, Function0 function0) {
        FragmentManager fragmentManager;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            if (function0 != null) {
                function0.invoke();
            }
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.LIZ(0, null);
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("com.bytedance.android.live.liveinteract.multiguestv3.main.common.SOURCE", "liveshow_icon", bundle);
            C786410Ut5.LJJJI("com.bytedance.android.live.liveinteract.multiguestv3.main.common.FROM_PAGE", str, bundle);
            C19322110iZ.LIZLLL(fragmentManager, MultiGuestToolAndPlayFragment.class, "multi_guest_tool_and_play", sheetOptions, bundle);
        }
    }

    public static void LIZIZ(DataChannel dataChannel, String str, Function0 function0) {
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        if (C930540aK4.LIZJ() && C758560TpG.LIZ()) {
            if (Intrinsics.LJFF(str, "room_funkit_icon")) {
                LIZ(dataChannel, str, function0);
                return;
            }
            if (function0 != null) {
                function0.invoke();
            }
            C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            if (c01hzKi1 != null) {
                c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ(str), null);
            }
            if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
                playbookAnchorServiceV2LIZIZ.LJJI(false, "", new C915190ZvJ(str, false, 4), EnumC20429314wl.MULTI_GUEST, null);
                if (Unit.LIZ != null) {
                    return;
                }
            }
            PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ2 = C0TF9.LIZIZ();
            if (playbookAnchorServiceV2LIZIZ2 == null) {
                return;
            }
            playbookAnchorServiceV2LIZIZ2.LJJI(false, "", new C915190ZvJ(str, false, 4), EnumC20429314wl.MULTI_GUEST, null);
            return;
        }
        LIZ(dataChannel, str, function0);
    }
}
