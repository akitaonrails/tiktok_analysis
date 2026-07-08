package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20332314h7 extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20332314h7(PageInfo pageInfo) {
        super(0);
        this.LL = pageInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterTime is ");
        sbLIZ.append(this.LL.getEnterTime());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
