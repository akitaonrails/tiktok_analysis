package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19vc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21696219vc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C21696019va LL;
    public final /* synthetic */ PhotoModeImage LLILLJJLI;
    public final /* synthetic */ Pair<Integer, Integer> LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21696219vc(C21696019va c21696019va, PhotoModeImage photoModeImage, Pair<Integer, Integer> pair, Aweme aweme, int i) {
        super(0);
        this.LL = c21696019va;
        this.LLILLJJLI = photoModeImage;
        this.LLILLL = pair;
        this.LLILZ = aweme;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C16FP c16fp = this.LL.LLILZLL;
        if (c16fp != null) {
            c16fp.LIZIZ(C16FR.LOADING);
        }
        C714800S2c.LJ(this.LLILLJJLI, this.LL.getImgView(), this.LLILLL, this.LLILZ, this.LL.getMonitorListener(), this.LL.getImgView().getContext(), this.LLILZIL, this.LL.getImageDisplayListener(), this.LL.LL == 0);
        return Unit.LIZ;
    }
}
