package X;

import com.bytedance.android.btm.impl.page.unknown.UnionData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18DQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DQ extends C09AY implements Function0<Object> {
    public final /* synthetic */ UnionData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DQ(UnionData unionData) {
        super(0);
        this.LL = unionData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unionData = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", unionBufferBtm = ");
        sbLIZ.append(C18DO.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
