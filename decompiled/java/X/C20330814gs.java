package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20330814gs extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20330814gs(PageInfo pageInfo, boolean z) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reissue btm_enter_page showId=");
        sbLIZ.append(this.LL.getPageShowId());
        sbLIZ.append(" contains=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
