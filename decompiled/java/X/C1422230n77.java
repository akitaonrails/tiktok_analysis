package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1422230n77 extends C2217421BqW implements Function1<TemplateCategoryData, Unit> {
    public C1422230n77(C1422980n8K c1422980n8K) {
        super(1, c1422980n8K, C1422980n8K.class, "onSkeletonLoadingDismiss", "onSkeletonLoadingDismiss(Lcom/ss/android/ugc/aweme/tools/mvtemplate/core/TemplateCategoryData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TemplateCategoryData templateCategoryData) {
        ((C1422980n8K) this.receiver).x5(templateCategoryData);
        return Unit.LIZ;
    }
}
