package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.unknown.UnionData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18DR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DR extends C09AY implements Function0<Object> {
    public final /* synthetic */ UnionData LL;
    public final /* synthetic */ BufferBtm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DR(UnionData unionData, BufferBtm bufferBtm) {
        super(0);
        this.LL = unionData;
        this.LLILLJJLI = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unionData = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bufferBtm = ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
