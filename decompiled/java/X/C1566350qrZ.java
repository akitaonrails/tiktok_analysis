package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566350qrZ extends C09AY implements Function1<C440140HNs, C440140HNs> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566350qrZ(boolean z, List<String> list, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C440140HNs invoke(C440140HNs c440140HNs) {
        boolean z;
        List<String> list;
        List<String> list2;
        boolean z2 = true;
        if (this.LL && (list2 = this.LLILLJJLI) != null && list2.contains("im_easter_egg_for_share.same_post_enable")) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLILLL || (list = this.LLILLJJLI) == null || !list.contains("im_easter_egg_for_share.video_overflow_enable")) {
            z2 = false;
        }
        c440140HNs.getClass();
        return new C440140HNs(z, z2);
    }
}
