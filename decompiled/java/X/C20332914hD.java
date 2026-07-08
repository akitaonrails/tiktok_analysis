package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14hD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20332914hD extends C09AY implements Function0<Object> {
    public final /* synthetic */ BufferBtm LL;
    public final /* synthetic */ PageInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20332914hD(BufferBtm bufferBtm, PageInfo pageInfo) {
        super(0);
        this.LL = bufferBtm;
        this.LLILLJJLI = pageInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not reset pre, bufferBtm: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", resumedPageInfo: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
