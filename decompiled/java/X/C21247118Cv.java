package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21247118Cv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ BufferBtm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21247118Cv(BufferBtm bufferBtm, PageInfo pageInfo) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PageInfo pageInfo = this.LL;
        C18CE.LJI(2306, pageInfo, null, null, new C21247218Cw(this.LLILLJJLI, pageInfo), null, 188);
        return Unit.LIZ;
    }
}
