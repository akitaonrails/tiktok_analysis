package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122780fK8 extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ HighIntentCommentDetector LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122780fK8(HighIntentCommentDetector highIntentCommentDetector, String str) {
        super(1);
        this.LL = highIntentCommentDetector;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        HighIntentCommentDetector highIntentCommentDetector = this.LL;
        String str = this.LLILLJJLI;
        highIntentCommentDetector.z1(highIntentCommentDetector.x1(str), "high_intent_comment", String.valueOf(fFloatValue), C2097608Jq.LJ());
        return Unit.LIZ;
    }
}
