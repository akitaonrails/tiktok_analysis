package X;

import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ds4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066940ds4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC1066890drz LL;
    public final /* synthetic */ SmartImageView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1066940ds4(AbstractC1066890drz abstractC1066890drz, SmartImageView smartImageView) {
        super(0);
        this.LL = abstractC1066890drz;
        this.LLILLJJLI = smartImageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJIJ(new C0Q15(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
