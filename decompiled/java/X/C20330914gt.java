package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20330914gt extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PageInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20330914gt(PageInfo pageInfo, String str) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = pageInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("oldShowId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newShowId=");
        sbLIZ.append(this.LLILLJJLI.getPageShowId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
