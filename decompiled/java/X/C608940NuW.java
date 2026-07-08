package X;

import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608940NuW extends C09AY implements Function1<WeakReference<C704830Rkn>, C608910NuT> {
    public C608940NuW() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NuT] */
    @Override // kotlin.jvm.functions.Function1
    public final C608910NuT invoke(WeakReference<C704830Rkn> weakReference) {
        final WeakReference<C704830Rkn> weakReference2 = weakReference;
        return new InterfaceC702540Rh6() { // from class: X.0NuT
            @Override // X.InterfaceC702540Rh6
            public final void D6(Object obj) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC700000Rd0
            public final void l0(boolean z) {
                C704830Rkn c704830Rkn;
                C608590Ntx c608590Ntx = C608530Ntr.LLJJI;
                WeakReference<C704830Rkn> weakReference3 = weakReference2;
                C704830Rkn c704830Rkn2 = null;
                if (weakReference3 != null) {
                    c704830Rkn = weakReference3.get();
                } else {
                    c704830Rkn = null;
                }
                c608590Ntx.getClass();
                QuickExternalShareVM quickExternalShareVMLIZ = C608590Ntx.LIZ(c704830Rkn);
                WeakReference<C704830Rkn> weakReference4 = weakReference2;
                if (weakReference4 != null) {
                    c704830Rkn2 = weakReference4.get();
                }
                VideoItemParams videoItemParamsLIZIZ = C608590Ntx.LIZIZ(c704830Rkn2);
                if (videoItemParamsLIZIZ != null && videoItemParamsLIZIZ.getAweme() != null && quickExternalShareVMLIZ != null && quickExternalShareVMLIZ.LLILLL && quickExternalShareVMLIZ.LLILLJJLI != null && !z) {
                    C609010Nud.LIZIZ(C609010Nud.LIZ, false, videoItemParamsLIZIZ.getAweme(), videoItemParamsLIZIZ.mEventType, ((C608930NuV) quickExternalShareVMLIZ.getState()).LL, "components_priority", null, 96);
                }
            }
        };
    }
}
