package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1433905jN extends C09AY implements Function1<WeakReference<C704830Rkn>, C1433805jM> {
    public C1433905jN() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.05jM] */
    @Override // kotlin.jvm.functions.Function1
    public final C1433805jM invoke(WeakReference<C704830Rkn> weakReference) {
        final WeakReference<C704830Rkn> weakReference2 = weakReference;
        return new InterfaceC702540Rh6() { // from class: X.05jM
            @Override // X.InterfaceC702540Rh6
            public final void D6(Object obj) {
            }

            @Override // X.InterfaceC700000Rd0
            public final void l0(boolean z) {
                WeakReference<C704830Rkn> weakReference3;
                C704830Rkn c704830Rkn;
                Function0<VideoItemParams> function0;
                VideoItemParams videoItemParamsInvoke;
                if (!z && (weakReference3 = weakReference2) != null && (c704830Rkn = weakReference3.get()) != null && (function0 = c704830Rkn.LIZLLL) != null && (videoItemParamsInvoke = function0.invoke()) != null) {
                    C631270OpR.LIZLLL(videoItemParamsInvoke, false, true);
                }
            }
        };
    }
}
