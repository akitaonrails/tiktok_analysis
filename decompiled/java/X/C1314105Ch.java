package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userstory.mine.MineStoryCache$bootstrapLightRestoreAsync$1", f = "MineStoryDataCenter.kt", l = {206}, m = "invokeSuspend")
public final class C1314105Ch extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1314105Ch(String str, InterfaceC1364105Vn<? super C1314105Ch> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1314105Ch(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MineStoryCache@c03.bootstrapLightRestoreAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C06UY c06uy = C06UY.LIZ;
            String str = this.LLILLJJLI;
            c06uy.getClass();
            Aweme awemeLIZJ = C06UY.LIZJ(str);
            if (awemeLIZJ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MineStoryCache@c03.bootstrapLightRestoreAsync$1");
                return unit;
            }
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C05GZ c05gz = new C05GZ(awemeLIZJ, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c05gz) == objLJFF) {
                C1C7U.LIZIZ("MineStoryCache@c03.bootstrapLightRestoreAsync$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MineStoryCache@c03.bootstrapLightRestoreAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
