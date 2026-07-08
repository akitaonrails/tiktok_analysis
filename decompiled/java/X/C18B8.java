package X;

import com.bytedance.android.btm.api.model.PageFinder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18B8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18B8 extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageFinder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18B8(PageFinder pageFinder) {
        super(0);
        this.LL = pageFinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("find page by btmPageId: ");
        sbLIZ.append(this.LL.btmPageId);
        sbLIZ.append(", from destroyed page cache.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
