package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21247018Cu extends C09AY implements Function0<Object> {
    public final /* synthetic */ BcmParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21247018Cu(BcmParams bcmParams) {
        super(0);
        this.LL = bcmParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create token hot start, get bcm: ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
