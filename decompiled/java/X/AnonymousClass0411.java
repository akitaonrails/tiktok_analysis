package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.ShopMessageEditFragment;

/* JADX INFO: renamed from: X.0411, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0411 {
    public static void LIZ(Bundle bundle, FragmentManager fragmentManager) {
        ShopMessageEditFragment shopMessageEditFragment = new ShopMessageEditFragment();
        shopMessageEditFragment.setArguments(bundle);
        shopMessageEditFragment.show(fragmentManager, "OSPMessagePanelFragment");
    }
}
