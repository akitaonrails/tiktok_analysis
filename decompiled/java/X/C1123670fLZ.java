package X;

import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fLZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123670fLZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1123440fLC LL;
    public final /* synthetic */ GiftGuideMessage LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1123670fLZ(C1123440fLC c1123440fLC, GiftGuideMessage giftGuideMessage, Long l, boolean z) {
        super(0);
        this.LL = c1123440fLC;
        this.LLILLJJLI = giftGuideMessage;
        this.LLILLL = l;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIILL(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
