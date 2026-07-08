package X;

import com.ss.android.ugc.aweme.feed.ghouse.cache.GCacheItemMeta;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591150NGn extends C09AY implements Function0<String> {
    public final /* synthetic */ List<GCacheItemMeta> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591150NGn(List<GCacheItemMeta> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin meta size: ");
        sbLIZ.append(this.LL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
