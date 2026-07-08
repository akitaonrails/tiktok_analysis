package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPhotoMvFailsStrategy;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0L0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535950L0f extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C535980L0i LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;
    public final /* synthetic */ ArrayList<MediaModel> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535950L0f(C535980L0i c535980L0i, ShortVideoContext shortVideoContext, Intent intent, ArrayList<MediaModel> arrayList, int i, int i2) {
        super(0);
        this.LL = c535980L0i;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = intent;
        this.LLILZ = arrayList;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJFF(2, this.LLILLJJLI);
        C522360KeA.LIZ(C523870Kgb.LIZIZ(this.LLILLL, C0L92.FAILED, ""));
        this.LL.LIZJ();
        IPhotoMvFailsStrategy iPhotoMvFailsStrategy = (IPhotoMvFailsStrategy) PluggableExtentionKt.pluggableSpi$default(IPhotoMvFailsStrategy.class, false, false, false, 14, null);
        if (iPhotoMvFailsStrategy != null) {
            if (this.LLILZ.size() > 1) {
                iPhotoMvFailsStrategy.multiPicOriginStrategy(this.LL.LL, this.LLILZIL, this.LLILZLL, this.LLILLL);
            } else {
                iPhotoMvFailsStrategy.singlePicOriginStrategy(this.LL.LL, this.LLILZIL, this.LLILZLL, this.LLILLL);
            }
        }
        return Unit.LIZ;
    }
}
