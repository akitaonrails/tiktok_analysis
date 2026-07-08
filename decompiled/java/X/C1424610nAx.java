package X;

import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1424610nAx extends C2217421BqW implements Function0<TemplateCategoryData> {
    public C1424610nAx(C1424590nAv c1424590nAv) {
        super(0, c1424590nAv, C1424590nAv.class, "getCurCategory", "getCurCategory()Lcom/ss/android/ugc/aweme/tools/mvtemplate/core/TemplateCategoryData;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TemplateCategoryData invoke() {
        C1424590nAv c1424590nAv = (C1424590nAv) this.receiver;
        ViewPager viewPager = c1424590nAv.LLJZIJLIL;
        if (viewPager == null) {
            return null;
        }
        return c1424590nAv.LLLLLJLJLL().LJJIJIL(viewPager.getCurrentItem());
    }
}
