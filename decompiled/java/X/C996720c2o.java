package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.api.auto.IAutoService;
import com.ss.android.ugc.aweme.commercialize.api.auto.IAutoServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0c2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996720c2o extends C09AY implements Function2<FeedCommerceAssem, C291001Au<? extends C1003330cDT>, Unit> {
    public C996720c2o() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FeedCommerceAssem feedCommerceAssem, C291001Au<? extends C1003330cDT> c291001Au) {
        Object obj;
        C19EG activity;
        FeedCommerceAssem feedCommerceAssem2 = feedCommerceAssem;
        C291001Au<? extends C1003330cDT> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            C1003330cDT c1003330cDT = (C1003330cDT) c291001Au2.LIZ;
            IAutoService iAutoServiceLIZIZ = IAutoServiceImpl.LIZIZ();
            if (iAutoServiceLIZIZ != null) {
                C724270Sb3 c724270Sb3 = feedCommerceAssem2.LLJI;
                Object obj2 = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Fragment fragment = ((VideoItemParams) obj).fragment;
                if (fragment != null) {
                    activity = fragment.getActivity();
                } else {
                    activity = null;
                }
                C724270Sb3 c724270Sb32 = feedCommerceAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                iAutoServiceLIZIZ.LIZ(activity, ((VideoItemParams) obj2).getAweme(), c1003330cDT);
            }
        }
        return Unit.LIZ;
    }
}
