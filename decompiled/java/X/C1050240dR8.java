package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050240dR8 extends C09AY implements Function0<AnchorCommonStruct> {
    public final /* synthetic */ C1050230dR7 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050240dR8(C1050230dR7 c1050230dR7) {
        super(0);
        this.LL = c1050230dR7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnchorCommonStruct invoke() {
        List<AnchorCommonStruct> anchors = this.LL.LJIIZILJ().getAnchors();
        if (anchors != null) {
            C1050230dR7 c1050230dR7 = this.LL;
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == c1050230dR7.type()) {
                    return anchorCommonStruct;
                }
            }
        }
        return null;
    }
}
