package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591130NGl extends C09AY implements Function0<String> {
    public final /* synthetic */ C259800zU<List<CacheEntry>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591130NGl(C259800zU<List<CacheEntry>> c259800zU) {
        super(0);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("after first verify size: ");
        sbLIZ.append(this.LL.element.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
