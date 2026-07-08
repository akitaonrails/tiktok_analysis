package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C503801xk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ECommerceMessage LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ AbstractC21194217wq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503801xk(boolean z, ECommerceMessage eCommerceMessage, long j, AbstractC21194217wq abstractC21194217wq) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = eCommerceMessage;
        this.LLILLL = j;
        this.LLILZ = abstractC21194217wq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C01WN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        return Unit.LIZ;
    }
}
