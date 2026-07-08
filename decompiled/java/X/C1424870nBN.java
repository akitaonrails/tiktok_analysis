package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1424870nBN extends C2217421BqW implements Function0<Boolean> {
    public C1424870nBN(Object obj) {
        super(0, obj, C1424850nBL.class, "isCurCategory", "isCurCategory()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1424850nBL c1424850nBL = (C1424850nBL) this.receiver;
        TemplateCategoryData templateCategoryDataInvoke = c1424850nBL.LLILZ.invoke();
        return Boolean.valueOf(Intrinsics.LJFF(templateCategoryDataInvoke != null ? templateCategoryDataInvoke.key : null, c1424850nBL.LLILLL.key));
    }
}
