package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userstory.mine.MineStoryCache$tryLoadFullFromDiskAndMergeAsync$1$1", f = "MineStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C1323905Gb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1323905Gb(Aweme aweme, InterfaceC1364105Vn<? super C1323905Gb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1323905Gb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MineStoryCache@c03.tryLoadFullFromDiskAndMergeAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1615006Ua c1615006Ua = C1615006Ua.LIZ;
        Aweme aweme = this.LL;
        c1615006Ua.getClass();
        C1615006Ua.LIZ(aweme);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MineStoryCache@c03.tryLoadFullFromDiskAndMergeAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
