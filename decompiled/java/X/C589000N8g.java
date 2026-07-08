package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589000N8g extends C09AY implements Function0<Object> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C589000N8g(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ON_CREATE ");
        sbLIZ.append(this.LL.baseHolder.getClass().getSimpleName());
        sbLIZ.append(", ");
        sbLIZ.append(this.LL.exposureSourceDelegate.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
