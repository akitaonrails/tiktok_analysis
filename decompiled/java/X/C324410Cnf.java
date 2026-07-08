package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.jsb.SyncDataWithInnerFeedMethodIDL$handle$1$1$result$1$1", f = "SyncDataWithInnerFeedMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C324410Cnf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>>, Object> {
    public final /* synthetic */ C0DP5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324410Cnf(C0DP5 c0dp5, InterfaceC1364105Vn<? super C324410Cnf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0dp5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324410Cnf(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SyncDataWithInnerFeedMethodIDL@7fcc.handle$1$1$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1227904rF.LIZ.getClass();
        Aweme[] awemeArr = (Aweme[]) GsonProtectorUtils.fromJson(C1227904rF.LJ(), this.LL.getAwemeList(), Aweme[].class);
        List listLJIIJJI = C1697810uHb.LJIIJJI(Arrays.copyOf(awemeArr, awemeArr.length));
        C1C7U.LIZIZ("SyncDataWithInnerFeedMethodIDL@7fcc.handle$1$1$result$1$1");
        return listLJIIJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
