package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPhotoMvFailsStrategy;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0L0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535960L0g extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0L2T LL;
    public final /* synthetic */ ArrayList<MediaModel> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Intent LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535960L0g(C0L2T c0l2t, ArrayList<MediaModel> arrayList, int i, int i2, Intent intent) {
        super(0);
        this.LL = c0l2t;
        this.LLILLJJLI = arrayList;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0L2U c0l2uLJII = this.LL.LJII();
        c0l2uLJII.getClass();
        C0CNO.LIZLLL(0L, new AwS552S0100000_8(c0l2uLJII, 9));
        IPhotoMvFailsStrategy iPhotoMvFailsStrategy = (IPhotoMvFailsStrategy) PluggableExtentionKt.pluggableSpi$default(IPhotoMvFailsStrategy.class, false, false, false, 14, null);
        if (iPhotoMvFailsStrategy != null) {
            if (this.LLILLJJLI.size() > 1) {
                iPhotoMvFailsStrategy.multiPicOriginStrategy(this.LL.LLILZLL, this.LLILLL, this.LLILZ, this.LLILZIL);
            } else {
                iPhotoMvFailsStrategy.singlePicOriginStrategy(this.LL.LLILZLL, this.LLILLL, this.LLILZ, this.LLILZIL);
            }
        }
        return Unit.LIZ;
    }
}
