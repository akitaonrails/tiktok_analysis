package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.jvm.internal.AwS146S0201000_24;

/* JADX INFO: renamed from: X.0rFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581390rFp {
    public static final void LIZIZ(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        C0W17.LIZJ("data", "showSkylightMemoryCacheDirectly");
        FeedSkylightListViewModel feedSkylightListViewModelLJJIJL = C614770O9j.LIZIZ.LJ().LJJIJL(0, fragment);
        if ((feedSkylightListViewModelLJJIJL instanceof InterfaceC712570RxH) && feedSkylightListViewModelLJJIJL != null) {
            feedSkylightListViewModelLJJIJL.Dl1();
        }
    }

    public static final void LIZ(Fragment fragment, InsertStory insertStory, int i, Long l) {
        if (fragment == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshAndShowSkylightList, insertStory=");
        sbLIZ.append(insertStory);
        sbLIZ.append(", delayMills: ");
        sbLIZ.append(l);
        C0W17.LIZJ("data", C2188811AlT.LIZIZ(sbLIZ));
        AwS146S0201000_24 awS146S0201000_24 = new AwS146S0201000_24(i, fragment, insertStory, 1);
        if (l != null && l.longValue() > 0) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C13076059u(l, awS146S0201000_24, null), 3);
        } else {
            awS146S0201000_24.invoke();
        }
    }
}
