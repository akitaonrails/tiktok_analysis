package X;

import Y.ARunnableS14S0500000_21;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350810lFv extends C09AY implements Function1<C424580Gkq, Unit> {
    public final /* synthetic */ FrameLayout LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ CommentInnerPhotoAssem LLILLL;
    public final /* synthetic */ InterfaceC1484830ok5 LLILZ;
    public final /* synthetic */ C1350840lFy LLILZIL;
    public final /* synthetic */ CommentLivePhotoInfoModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350810lFv(int i, FrameLayout frameLayout, CommentLivePhotoInfoModel commentLivePhotoInfoModel, C1350840lFy c1350840lFy, CommentInnerPhotoAssem commentInnerPhotoAssem, InterfaceC1484830ok5 interfaceC1484830ok5) {
        super(1);
        this.LL = frameLayout;
        this.LLILLJJLI = i;
        this.LLILLL = commentInnerPhotoAssem;
        this.LLILZ = interfaceC1484830ok5;
        this.LLILZIL = c1350840lFy;
        this.LLILZLL = commentLivePhotoInfoModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C424580Gkq c424580Gkq) {
        C19ME c19me;
        Pair<Float, Float> fitCenterDisplayedSize = c424580Gkq.getFitCenterDisplayedSize();
        if (fitCenterDisplayedSize != null) {
            int iFloatValue = (int) fitCenterDisplayedSize.getFirst().floatValue();
            int iFloatValue2 = (int) fitCenterDisplayedSize.getSecond().floatValue();
            C1351950lHl.LJIL(this.LL, iFloatValue);
            C1351950lHl.LJIJI(iFloatValue2, this.LL);
            ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                FrameLayout frameLayout = this.LL;
                c19me.horizontalBias = 0.5f;
                C786410Ut5.a6(frameLayout, c19me);
            }
            FrameLayout frameLayout2 = this.LL;
            HandlerHook.viewPost(frameLayout2, new ARunnableS14S0500000_21(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, frameLayout2, 0));
        } else {
            final int i = this.LLILLJJLI;
            if (i > 0) {
                final CommentInnerPhotoAssem commentInnerPhotoAssem = this.LLILLL;
                C424580Gkq c424580Gkq2 = commentInnerPhotoAssem.LLJJJJ;
                if (c424580Gkq2 != null) {
                    final FrameLayout frameLayout3 = this.LL;
                    final InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILZ;
                    final C1350840lFy c1350840lFy = this.LLILZIL;
                    final CommentLivePhotoInfoModel commentLivePhotoInfoModel = this.LLILZLL;
                    HandlerHook.viewPost(c424580Gkq2, new Runnable() { // from class: X.0lFw
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CommentInnerPhotoAssem@eb60.tryStartLivePhoto$setPlayerContainer$1$3");
                            try {
                                CommentInnerPhotoAssem commentInnerPhotoAssem2 = commentInnerPhotoAssem;
                                FrameLayout frameLayout4 = frameLayout3;
                                InterfaceC1484830ok5 interfaceC1484830ok52 = interfaceC1484830ok5;
                                C1350840lFy c1350840lFy2 = c1350840lFy;
                                CommentLivePhotoInfoModel commentLivePhotoInfoModel2 = commentLivePhotoInfoModel;
                                int i2 = i - 1;
                                C424580Gkq c424580Gkq3 = commentInnerPhotoAssem2.LLJJJJ;
                                if (c424580Gkq3 != null) {
                                    C1351950lHl.LJIILLIIL(c424580Gkq3, new C1350810lFv(i2, frameLayout4, commentLivePhotoInfoModel2, c1350840lFy2, commentInnerPhotoAssem2, interfaceC1484830ok52));
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CommentInnerPhotoAssem@eb60.tryStartLivePhoto$setPlayerContainer$1$3");
                        }
                    });
                }
            } else {
                CommentInnerPhotoAssem.yp(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LL);
            }
        }
        return Unit.LIZ;
    }
}
