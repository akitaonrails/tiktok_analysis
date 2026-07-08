package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570150qxh extends C09AY implements Function0<LifecycleOwner> {
    public final /* synthetic */ HomeViewPagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570150qxh(HomeViewPagerAssem homeViewPagerAssem) {
        super(0);
        this.LL = homeViewPagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LifecycleOwner invoke() {
        LifecycleOwner lifecycleOwnerLIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if ((fragmentLJI != null && (lifecycleOwnerLIZ = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(fragmentLJI, (C19EG) null)) != null) || (lifecycleOwnerLIZ = C724240Sb0.LIZ(this.LL)) != null) {
            return lifecycleOwnerLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
