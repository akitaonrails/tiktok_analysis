package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0yIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1852410yIx extends C2217421BqW implements Function2<CreativeTemplate, Integer, Unit> {
    public C1852410yIx(TakoImageCreateTabFragment takoImageCreateTabFragment) {
        super(2, takoImageCreateTabFragment, TakoImageCreateTabFragment.class, "handleTextOnlyTemplateClick", "handleTextOnlyTemplateClick(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/CreativeTemplate;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CreativeTemplate creativeTemplate, Integer num) {
        int iIntValue = num.intValue();
        ((TakoImageCreateTabFragment) this.receiver).UR(creativeTemplate, iIntValue);
        return Unit.LIZ;
    }
}
