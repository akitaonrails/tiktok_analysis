package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1423890n9n extends C2217421BqW implements Function2<TemplateSearchTrendingItem, Integer, Unit> {
    public C1423890n9n(C1423870n9l c1423870n9l) {
        super(2, c1423870n9l, C1423870n9l.class, "clickTrending", "clickTrending(Lcom/ss/android/ugc/aweme/tools/mvtemplate/search/TemplateSearchTrendingItem;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(TemplateSearchTrendingItem templateSearchTrendingItem, Integer num) {
        int iIntValue = num.intValue();
        ((C1423870n9l) this.receiver).F4(templateSearchTrendingItem, iIntValue);
        return Unit.LIZ;
    }
}
