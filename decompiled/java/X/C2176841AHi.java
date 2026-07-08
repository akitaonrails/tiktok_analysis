package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176841AHi {
    public static void LIZ(DataChannel dataChannel) {
        boolean zLJFF;
        EnumC774050UXz enumC774050UXz;
        FragmentManager fragmentManager;
        C2176881AHm c2176881AHm;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null) {
            enumC774050UXz = c2176881AHm.LIZ;
        } else {
            enumC774050UXz = null;
        }
        if (enumC774050UXz == EnumC774050UXz.NONE) {
            if (!zLJFF) {
                C766270U4b.LIZLLL(2131856974);
                return;
            }
            return;
        }
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            ViewerWishesQueuePage viewerWishesQueuePage = new ViewerWishesQueuePage();
            viewerWishesQueuePage.LLJZ = dataChannel;
            viewerWishesQueuePage.LLJZIJLIL = zLJFF;
            viewerWishesQueuePage.LLJLLL = new C2176871AHl(dataChannel);
            C500260Jjc.LLFFF(viewerWishesQueuePage.LLLI);
            C500260Jjc.LJIILIIL(viewerWishesQueuePage.LLLIIL);
            C500260Jjc.LJIILIIL(viewerWishesQueuePage.LLLIILIL);
            C500260Jjc.LJIILIIL(viewerWishesQueuePage.LLLFZ);
            C2176871AHl c2176871AHl = viewerWishesQueuePage.LLJLLL;
            if (c2176871AHl != null) {
                c2176871AHl.LIZ(EnumC20674115v9.INIT, new AwS612S0100000_33(viewerWishesQueuePage, 159), new AwS577S0100000_33(viewerWishesQueuePage, 3913), AFwS187S0000000_2.get$arr$(122));
            }
            C19322110iZ.LJFF(fragmentManager, viewerWishesQueuePage, "viewer_wishes_queue_page", null, 0);
        }
    }
}
