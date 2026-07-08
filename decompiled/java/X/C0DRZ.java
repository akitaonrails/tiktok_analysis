package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.ShopWindowViewImageFetcher$loadImage$1", f = "ShopWindowViewImageFetcher.kt", l = {}, m = "invokeSuspend")
public final class C0DRZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C05XL<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DRZ(String str, C05XL<Unit> c05xl, InterfaceC1364105Vn<? super C0DRZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DRZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopWindowViewImageFetcher@7c39.loadImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1743860vTs c1743860vTs = C1743860vTs.LIZ;
        String str = this.LL;
        c1743860vTs.getClass();
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Uri uri = UriProtector.parse(str);
        c1326790kdB.getClass();
        if (!C1326790kdB.LIZIZ(uri)) {
            C1326790kdB.LIZLLL(this.LL).LJJII(new C346500DiC(this.LLILLJJLI, 0));
        } else {
            Boolean.valueOf(this.LLILLJJLI.LJIIZILJ(Unit.LIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopWindowViewImageFetcher@7c39.loadImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
