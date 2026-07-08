package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource$loadFromPagingApi$pageResult$3", f = "MafUserPagingSource.kt", l = {}, m = "invokeSuspend")
public final class C1263120iyU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<List<C1261860iwS>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263120iyU(C259800zU<List<C1261860iwS>> c259800zU, InterfaceC1364105Vn<? super C1263120iyU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1263120iyU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafUserPagingSource@b859.loadFromPagingApi$pageResult$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1261860iwS c1261860iwS : this.LL.element) {
            List<? extends Aweme> list = c1261860iwS.getMatchedFriendStruct().awemeList;
            List<? extends Aweme> list2 = c1261860iwS.getMatchedFriendStruct().repostAwemeList;
            if (list != null) {
                C345830Dh7.LIZ(list);
            }
            if (list2 != null) {
                C345830Dh7.LIZ(list2);
            }
            UrlModel avatar300 = c1261860iwS.getAvatar300();
            if (avatar300 == null && (avatar300 = c1261860iwS.getAvatarMedium()) == null) {
                avatar300 = c1261860iwS.getAvatar168();
            }
            C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatar300));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MafUserPagingSource@b859.loadFromPagingApi$pageResult$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
