package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1852330yIp extends C2217421BqW implements InterfaceC1631620sYq<CreativeTemplate, Integer, List<? extends BaseImage>, Unit> {
    public C1852330yIp(TakoImageCreateTabFragment takoImageCreateTabFragment) {
        super(3, takoImageCreateTabFragment, TakoImageCreateTabFragment.class, "handleTryNowTemplateSend", "handleTryNowTemplateSend(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/CreativeTemplate;ILjava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(CreativeTemplate creativeTemplate, Integer num, List<? extends BaseImage> list) {
        ((TakoImageCreateTabFragment) this.receiver).VR(creativeTemplate, num.intValue(), list);
        return Unit.LIZ;
    }
}
