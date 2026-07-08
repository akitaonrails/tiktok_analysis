package X;

import com.ss.android.ugc.aweme.template.search.TemplateSearchHistoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1425420nCG extends C2217421BqW implements Function2<TemplateSearchHistoryItem, Integer, Unit> {
    public C1425420nCG(C1425410nCF c1425410nCF) {
        super(2, c1425410nCF, C1425410nCF.class, "clickSearch", "clickSearch(Lcom/ss/android/ugc/aweme/template/search/TemplateSearchHistoryItem;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(TemplateSearchHistoryItem templateSearchHistoryItem, Integer num) {
        int iIntValue = num.intValue();
        ((C1425410nCF) this.receiver).F4(templateSearchHistoryItem, iIntValue);
        return Unit.LIZ;
    }
}
