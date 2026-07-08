package X;

import Y.ARunnableS111S0100000_11;
import android.view.ViewPropertyAnimator;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707520Rp8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PhotoNumIndicatorAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C707520Rp8(PhotoNumIndicatorAssem photoNumIndicatorAssem, boolean z, boolean z2, long j, boolean z3) {
        super(0);
        this.LL = photoNumIndicatorAssem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = j;
        this.LLILZIL = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        long j;
        PhotoNumIndicatorAssem photoNumIndicatorAssem = this.LL;
        C716660S9g c716660S9g = photoNumIndicatorAssem.LLJL;
        if (c716660S9g != null) {
            boolean z = this.LLILLJJLI;
            boolean z2 = this.LLILLL;
            long j2 = this.LLILZ;
            boolean z3 = this.LLILZIL;
            C724270Sb3 c724270Sb3 = photoNumIndicatorAssem.LLJI;
            if (AwemeExtKt.isAdTraffic(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
                ViewPropertyAnimator viewPropertyAnimator = photoNumIndicatorAssem.LLJLIL;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                photoNumIndicatorAssem.LLJLIL = C438910HIz.LIZIZ(c716660S9g, 150L, 2);
            } else {
                photoNumIndicatorAssem.LLJZ.removeCallbacks(photoNumIndicatorAssem.LLJLL);
                if (z) {
                    BPEAHandler bPEAHandler = photoNumIndicatorAssem.LLJZ;
                    ARunnableS111S0100000_11 aRunnableS111S0100000_11 = photoNumIndicatorAssem.LLJLL;
                    if (z2) {
                        j = j2 + ((long) (z3 ? 150 : 0));
                    } else {
                        j = 0;
                    }
                    C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS111S0100000_11);
                } else {
                    photoNumIndicatorAssem.Ap();
                    ViewPropertyAnimator viewPropertyAnimator2 = photoNumIndicatorAssem.LLJLIL;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c716660S9g);
                    c716660S9g.setAlpha(0.0f);
                }
            }
        }
        return Unit.LIZ;
    }
}
