package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fKC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122820fKC extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ HighIntentCommentDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122820fKC(HighIntentCommentDetector highIntentCommentDetector) {
        super(0);
        this.LL = highIntentCommentDetector;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.y1().vQ2());
    }
}
