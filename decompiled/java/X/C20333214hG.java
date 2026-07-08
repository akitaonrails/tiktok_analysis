package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14hG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20333214hG extends C09AY implements Function0<Object> {
    public final /* synthetic */ BufferBtm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20333214hG(BufferBtm bufferBtm) {
        super(0);
        this.LL = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("peekBuffer: ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
