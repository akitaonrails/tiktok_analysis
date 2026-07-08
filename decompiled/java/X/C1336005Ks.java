package X;

import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl$updateMutualFriendAndAffinityMap$1$2$1", f = "MixSearchServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1336005Ks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MixSearchServiceImpl LL;
    public final /* synthetic */ Map<String, SocialAffinityItem> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336005Ks(MixSearchServiceImpl mixSearchServiceImpl, Map<String, SocialAffinityItem> map, InterfaceC1364105Vn<? super C1336005Ks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixSearchServiceImpl;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336005Ks(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((LinkedHashMap) this.LL.LIZIZ).clear();
        this.LL.LIZIZ.putAll(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
