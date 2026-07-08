package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0heD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212110heD extends C09AY implements Function0<String> {
    public final /* synthetic */ AnchorCommonStruct LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212110heD(AnchorCommonStruct anchorCommonStruct) {
        super(0);
        this.LL = anchorCommonStruct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C1212100heC.LIZ(this.LL.getExtra());
    }
}
