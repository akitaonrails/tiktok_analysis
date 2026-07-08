package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.084R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C084R extends C09AY implements Function0<Object> {
    public final /* synthetic */ BufferBtm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C084R(BufferBtm bufferBtm) {
        super(0);
        this.LL = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bufferBtm is ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
