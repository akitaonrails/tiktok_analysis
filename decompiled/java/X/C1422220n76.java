package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1422220n76 extends C2217421BqW implements Function2<TemplateCategoryData, String, Unit> {
    public C1422220n76(C1422980n8K c1422980n8K) {
        super(2, c1422980n8K, C1422980n8K.class, "selectCategory", "selectCategory(Lcom/ss/android/ugc/aweme/tools/mvtemplate/core/TemplateCategoryData;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(TemplateCategoryData templateCategoryData, String str) {
        ((C1422980n8K) this.receiver).M5(templateCategoryData, str);
        return Unit.LIZ;
    }
}
