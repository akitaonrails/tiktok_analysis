package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ftF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144550ftF extends C09AY implements Function1<C1144540ftE, C1144540ftE> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<ItemInfo4FE> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144550ftF(long j, int i, long j2, List list) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = i;
        this.LLILZ = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1144540ftE invoke(C1144540ftE c1144540ftE) {
        Long lValueOf = Long.valueOf(this.LL);
        Long lValueOf2 = Long.valueOf(this.LLILLJJLI);
        int i = this.LLILLL;
        List<ItemInfo4FE> list = this.LLILZ;
        c1144540ftE.getClass();
        return new C1144540ftE(lValueOf, lValueOf2, i, list);
    }
}
