package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userstory.mine.MineStoryCache$bootstrapLightRestoreAsync$1$1", f = "MineStoryDataCenter.kt", l = {}, m = "invokeSuspend")
public final class C05GZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GZ(Aweme aweme, String str, InterfaceC1364105Vn<? super C05GZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05GZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MineStoryCache@c03.bootstrapLightRestoreAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C1615006Ua.LIZIZ == null && !C1615006Ua.LIZJ.get()) {
            C1615006Ua.LIZIZ = this.LL;
            C1615006Ua.LIZLLL.set(true);
            C1615006Ua c1615006Ua = C1615006Ua.LIZ;
            String str = this.LLILLJJLI;
            Aweme aweme = this.LL;
            c1615006Ua.getClass();
            C1615006Ua.LJFF(aweme, str);
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("MineStoryDiskCache", "bootstrapLightRestoreAsync: skip apply, memory already populated");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MineStoryCache@c03.bootstrapLightRestoreAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
