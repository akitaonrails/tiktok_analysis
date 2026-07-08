package X;

import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RV3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RV3 extends C09AY implements Function1<C0S9P, C0S9P> {
    public final /* synthetic */ PhotoViewModelV2 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RV3(PhotoViewModelV2 photoViewModelV2, int i) {
        super(1);
        this.LL = photoViewModelV2;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C0S9P invoke(C0S9P c0s9p) {
        C0S9P c0s9p2 = c0s9p;
        boolean z = false;
        this.LL.LLJJL = false;
        int i = this.LLILLJJLI;
        if (i != 0 || c0s9p2.LLJJIJIIJIL) {
            z = true;
        }
        return C0S9P.LIZ(c0s9p2, i, 0, false, false, false, false, null, false, null, null, null, false, 0, null, null, null, false, z, false, null, null, 0L, false, 33292286);
    }
}
