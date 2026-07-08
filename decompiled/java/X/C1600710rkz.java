package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment;

/* JADX INFO: renamed from: X.0rkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600710rkz {
    public static final IDetailBaseAbility LIZ(Fragment fragment) {
        DetailComponentFragment detailComponentFragment;
        InterfaceC494301wD interfaceC494301wD = null;
        if (C299520Boc.LIZ()) {
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment);
            if (interfaceC665370Q7zLJ == null) {
                return null;
            }
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJ, IFeedFragmentAbility.class, null);
            if (interfaceC494301wDLIZ instanceof IDetailBaseAbility) {
                interfaceC494301wD = interfaceC494301wDLIZ;
            }
            return (IDetailBaseAbility) interfaceC494301wD;
        }
        if ((fragment instanceof DetailComponentFragment) && (detailComponentFragment = (DetailComponentFragment) fragment) != null) {
            DetailPageComponent detailPageComponentMR = detailComponentFragment.MR();
            if (detailPageComponentMR instanceof IDetailBaseAbility) {
                return detailPageComponentMR;
            }
        }
        return null;
    }
}
