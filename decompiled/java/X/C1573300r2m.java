package X;

import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0r2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573300r2m extends C09AY implements Function1<C1573270r2j, C1573270r2j> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ List<SeriesCenterCenterScene> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573300r2m(int i, List list, C259800zU c259800zU) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1573270r2j invoke(C1573270r2j c1573270r2j) {
        SeriesCenterCenterScene seriesCenterCenterScene;
        C1573270r2j c1573270r2j2 = c1573270r2j;
        int i = this.LL;
        String str = this.LLILLJJLI.element;
        List<SeriesCenterCenterScene> list = this.LLILLL;
        if (list != null) {
            seriesCenterCenterScene = (SeriesCenterCenterScene) C13LP.LJJJLZIJ(i, list);
        } else {
            seriesCenterCenterScene = null;
        }
        return C1573270r2j.LIZ(c1573270r2j2, null, false, i, str, seriesCenterCenterScene, null, null, null, null, 967);
    }
}
