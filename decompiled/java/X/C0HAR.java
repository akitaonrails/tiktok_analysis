package X;

import android.graphics.drawable.BitmapDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils$fillOriginImage$1$1$1", f = "AnchorBizUtils.kt", l = {}, m = "invokeSuspend")
public final class C0HAR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BitmapDrawable LL;
    public final /* synthetic */ C424610Gkt LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HAR(BitmapDrawable bitmapDrawable, C424610Gkt c424610Gkt, String str, InterfaceC1364105Vn<? super C0HAR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmapDrawable;
        this.LLILLJJLI = c424610Gkt;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HAR(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnchorBizUtils@b393.fillOriginImage$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            this.LLILLJJLI.getHierarchy().LJIJI(0);
            this.LLILLJJLI.getHierarchy().LJJIFFI(this.LL, InterfaceC1320380kSq.LJI);
        }
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        String str = this.LLILLL;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        c1331670kl3LIZLLL.LJJIJL(this.LLILLJJLI.getContext());
        c1331670kl3LIZLLL.LJJII(new C0ID3(this.LLILLJJLI, 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorBizUtils@b393.fillOriginImage$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
