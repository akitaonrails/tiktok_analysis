package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397460mTA extends C09AY implements Function1<AnchorCommonStruct, Boolean> {
    public final /* synthetic */ C1397440mT8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1397460mTA(C1397440mT8 c1397440mT8) {
        super(1);
        this.LL = c1397440mT8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct.getType() == this.LL.type()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
