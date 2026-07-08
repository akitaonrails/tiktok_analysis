package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Z2U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2U extends C09AY implements Function2<C427870Gq9, C427870Gq9, Unit> {
    public final /* synthetic */ C879180YeK LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z2U(C879180YeK c879180YeK, int i) {
        super(2);
        this.LL = c879180YeK;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C427870Gq9 c427870Gq9, C427870Gq9 c427870Gq92) {
        UrlModel urlModel = (UrlModel) ListProtector.get(this.LL.LJIIIIZZ, 0);
        int i = this.LLILLJJLI;
        C451690HnT.LJ(c427870Gq9, urlModel, "IMInnerPushShowDelegate:TYPE_AGGREGATED", i, i, null, 992);
        UrlModel urlModel2 = (UrlModel) ListProtector.get(this.LL.LJIIIIZZ, 1);
        int i2 = this.LLILLJJLI;
        C451690HnT.LJ(c427870Gq92, urlModel2, "IMInnerPushShowDelegate:TYPE_AGGREGATED", i2, i2, null, 992);
        return Unit.LIZ;
    }
}
