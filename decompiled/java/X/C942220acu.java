package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0acu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942220acu {
    public static void LIZ(FragmentManager fragmentManager, LayoutMarketFragment.LayoutItemClickHandler layoutItemClickHandler, String str, InterfaceC930220aJY interfaceC930220aJY, C947970amB c947970amB, DataChannel dataChannel, int i) {
        String str2 = LayoutMarketFragment._pnsPageId;
        if ((i & 8) != 0) {
            interfaceC930220aJY = null;
        }
        if ((i & 16) != 0) {
            c947970amB = null;
        }
        if ((i & 32) != 0) {
            dataChannel = null;
        }
        LayoutMarketFragment layoutMarketFragment = new LayoutMarketFragment();
        layoutMarketFragment.LLLFZ = interfaceC930220aJY;
        layoutMarketFragment.LLLFFI = str;
        layoutMarketFragment.LLL = layoutItemClickHandler;
        layoutMarketFragment.LLLF = c947970amB;
        layoutMarketFragment.LLLFF = dataChannel;
        C19322110iZ.LJFF(fragmentManager, layoutMarketFragment, "LayoutMarketFragment", null, 0);
    }
}
