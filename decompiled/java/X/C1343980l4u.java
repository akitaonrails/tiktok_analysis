package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.uitls.CommentPerfOptV2$preloadCommentItemBeforeRefresh$1", f = "CommentPerfOptV2.kt", l = {}, m = "invokeSuspend")
public final class C1343980l4u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343980l4u(Aweme aweme, Context context, InterfaceC1364105Vn<? super C1343980l4u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343980l4u(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("CommentPerfOptV2@e9fe.preloadCommentItemBeforeRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeStatistics statistics = this.LL.getStatistics();
        if (statistics != null) {
            lLJFF = C2286608xc.LJFF(statistics.getCommentCount());
        } else {
            lLJFF = null;
        }
        int iMin = (int) Math.min(6L, C1346420l8q.LJFF(lLJFF));
        C1344540l5o c1344540l5o = C1344540l5o.LIZ;
        boolean z = C1354730lMF.LIZ;
        Context contextLIZIZ = C1354730lMF.LIZIZ(this.LLILLJJLI);
        C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
        C1344540l5o.LIZ.getClass();
        Context contextLJ = C1356320lOo.LJ(C1344540l5o.LJIIIZ, contextLIZIZ);
        for (int i = 0; i < iMin; i++) {
            C1344540l5o.LIZ.getClass();
            C21146717pB.LIZJ(contextLJ, C1344540l5o.LJIIIZ);
        }
        C1344540l5o c1344540l5o2 = C1344540l5o.LIZ;
        C1344540l5o.LIZIZ = iMin / 2;
        C01GW<Map<String, Integer>> c01gw2 = C1357700lR2.LJFF;
        C1344540l5o.LIZ.getClass();
        Context contextLJ2 = C1356320lOo.LJ(C1344540l5o.LJIIJ, contextLIZIZ);
        int i2 = C1344540l5o.LIZIZ;
        for (int i3 = 0; i3 < i2; i3++) {
            C1344540l5o.LIZ.getClass();
            C21146717pB.LIZJ(contextLJ2, C1344540l5o.LJIIJ);
        }
        C1344540l5o.LIZJ = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPerfOptV2@e9fe.preloadCommentItemBeforeRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
