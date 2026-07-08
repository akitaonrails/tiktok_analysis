package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.01OF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01OF {
    public static InterfaceC971790bOb LIZIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ANCHOR_TEXT_HEADER");
        if (objLJIIIZ instanceof InterfaceC971790bOb) {
            return (InterfaceC971790bOb) objLJIIIZ;
        }
        return null;
    }

    public static void LIZJ() {
        AnchorTextHeaderService anchorTextHeaderService;
        C20441214yg.LIZIZ("TextHeaderService", "release");
        C948450amx c948450amx = C948450amx.LIZIZ;
        Object objLJIIIZ = c948450amx.LJIIIZ("ANCHOR_TEXT_HEADER");
        if ((objLJIIIZ instanceof AnchorTextHeaderService) && (anchorTextHeaderService = (AnchorTextHeaderService) objLJIIIZ) != null && anchorTextHeaderService.LJFF) {
            AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = anchorTextHeaderService.LJIIZILJ();
            if (anchorTextHeaderViewModelLJIIZILJ != null) {
                anchorTextHeaderViewModelLJIIZILJ.onDestroy();
            }
            AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ2 = anchorTextHeaderService.LJIIZILJ();
            if (anchorTextHeaderViewModelLJIIZILJ2 != null) {
                anchorTextHeaderViewModelLJIIZILJ2.wQ2().LIZJ.clear();
            }
            anchorTextHeaderService.LJFF = false;
        }
        c948450amx.LJI("ANCHOR_TEXT_HEADER");
    }

    public static void LIZ(DataChannel dataChannel, Fragment fragment, C19EG c19eg, int i) {
        boolean z;
        if ((i & 4) != 0) {
            c19eg = null;
        }
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        C20441214yg.LIZIZ("TextHeaderService", "create");
        AnchorTextHeaderService anchorTextHeaderService = new AnchorTextHeaderService(dataChannel, new WeakReference(fragment), new WeakReference(c19eg));
        if (z && !anchorTextHeaderService.LJFF) {
            anchorTextHeaderService.LJFF = true;
            AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = anchorTextHeaderService.LJIIZILJ();
            if (anchorTextHeaderViewModelLJIIZILJ != null) {
                anchorTextHeaderViewModelLJIIZILJ.onInit();
            }
        }
        C948450amx.LIZIZ.LJFF(anchorTextHeaderService, null);
    }
}
