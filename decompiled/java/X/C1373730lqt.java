package X;

import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373730lqt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SharePackage LL;
    public final /* synthetic */ AbstractC1375080lt4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373730lqt(SharePackage sharePackage, AbstractC1375080lt4 abstractC1375080lt4) {
        super(0);
        this.LL = sharePackage;
        this.LLILLJJLI = abstractC1375080lt4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SharePackage sharePackage = this.LL;
        if (sharePackage != null) {
            sharePackage.extras.remove("share_action_key");
            sharePackage.extras.remove("share_platform");
        }
        this.LLILLJJLI.LJFF(null, null, false);
        return Unit.LIZ;
    }
}
