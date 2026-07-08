package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710850RuV extends C09AY implements Function0<Integer> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710850RuV(Aweme aweme) {
        super(0);
        this.LL = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(this.LL);
        if (captionItemModelLJIIIIZZ != null) {
            return Integer.valueOf(captionItemModelLJIIIIZZ.subId);
        }
        return null;
    }
}
