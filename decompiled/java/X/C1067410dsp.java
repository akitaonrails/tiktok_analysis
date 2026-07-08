package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067410dsp extends C09AY implements Function1<AnchorCommonStruct, Boolean> {
    public final /* synthetic */ C1067420dsq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1067410dsp(C1067420dsq c1067420dsq) {
        super(1);
        this.LL = c1067420dsq;
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
